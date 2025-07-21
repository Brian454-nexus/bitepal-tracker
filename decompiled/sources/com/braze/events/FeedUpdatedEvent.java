package com.braze.events;

import com.braze.enums.CardCategory;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class FeedUpdatedEvent {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) FeedUpdatedEvent.class);
    private final List<Card> mFeedCards;
    private final boolean mFromOfflineStorage;
    private final long mTimestamp;
    private final String mUserId;

    public FeedUpdatedEvent(List<Card> list, String str, boolean z6, long j6) {
        this.mUserId = str;
        this.mFromOfflineStorage = z6;
        list.getClass();
        this.mFeedCards = list;
        this.mTimestamp = j6;
    }

    public int getCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.i(TAG, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.mFeedCards.size();
        }
        if (!enumSet.isEmpty()) {
            return getFeedCards(enumSet).size();
        }
        BrazeLogger.w(TAG, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
        return 0;
    }

    public List<Card> getFeedCards(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            try {
                BrazeLogger.i(TAG, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = CardCategory.getAllCategories();
            } catch (Exception e6) {
                BrazeLogger.w(TAG, "Unable to get cards with categories[" + enumSet + "]. Ignoring.", e6);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            BrazeLogger.w(TAG, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Card card : this.mFeedCards) {
            if (card.isInCategorySet(enumSet) && !card.isExpired()) {
                arrayList.add(card);
            }
        }
        return arrayList;
    }

    public int getUnreadCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.w(TAG, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return getUnreadCardCount(CardCategory.getAllCategories());
        }
        int i6 = 0;
        if (enumSet.isEmpty()) {
            BrazeLogger.w(TAG, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (Card card : this.mFeedCards) {
            if (card.isInCategorySet(enumSet) && !card.getWasViewedInternal() && !card.isExpired()) {
                i6++;
            }
        }
        return i6;
    }

    public boolean isFromOfflineStorage() {
        return this.mFromOfflineStorage;
    }

    public long lastUpdatedInSecondsFromEpoch() {
        return this.mTimestamp;
    }

    public String toString() {
        return "FeedUpdatedEvent{mFeedCards=" + this.mFeedCards + ", mUserId='" + this.mUserId + "', mFromOfflineStorage=" + this.mFromOfflineStorage + ", mTimestamp=" + this.mTimestamp + '}';
    }
}
