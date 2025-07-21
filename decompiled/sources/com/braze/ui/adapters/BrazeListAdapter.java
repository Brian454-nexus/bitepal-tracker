package com.braze.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.CaptionedImageCardView;
import com.braze.ui.widget.DefaultCardView;
import com.braze.ui.widget.ImageOnlyCardView;
import com.braze.ui.widget.ShortNewsCardView;
import com.braze.ui.widget.TextAnnouncementCardView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeListAdapter extends ArrayAdapter<Card> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeListAdapter.class);
    private final Set<String> mCardIdImpressions;
    private final Context mContext;

    public BrazeListAdapter(Context context, int i6, List<Card> list) {
        super(context, i6, list);
        this.mContext = context;
        this.mCardIdImpressions = new HashSet();
    }

    private void logCardImpression(Card card) {
        String id = card.getId();
        if (this.mCardIdImpressions.contains(id)) {
            BrazeLogger.v(TAG, "Already counted impression for card " + id);
        } else {
            this.mCardIdImpressions.add(id);
            card.logImpression();
            BrazeLogger.v(TAG, "Logged impression for card " + id);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    public void batchSetCardsToRead(int i6, int i7) {
        if (getCount() == 0) {
            BrazeLogger.d(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int min = Math.min(getCount(), i7);
        for (int max = Math.max(0, i6); max < min; max++) {
            Card card = (Card) getItem(max);
            if (card == null) {
                BrazeLogger.d(TAG, "Card was null in setting some cards to viewed.");
                return;
            } else {
                if (!card.getIsIndicatorHighlightedInternal()) {
                    card.setIndicatorHighlighted(true);
                }
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i6) {
        Card card = (Card) getItem(i6);
        if (card instanceof ImageOnlyCard) {
            return 1;
        }
        if (card instanceof CaptionedImageCard) {
            return 2;
        }
        if (card instanceof ShortNewsCard) {
            return 3;
        }
        return card instanceof TextAnnouncementCard ? 4 : 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i6, View view, @NonNull ViewGroup viewGroup) {
        BaseFeedCardView baseFeedCardView;
        Card card = (Card) getItem(i6);
        if (view == null) {
            baseFeedCardView = card instanceof ImageOnlyCard ? new ImageOnlyCardView(this.mContext) : card instanceof CaptionedImageCard ? new CaptionedImageCardView(this.mContext) : card instanceof ShortNewsCard ? new ShortNewsCardView(this.mContext) : card instanceof TextAnnouncementCard ? new TextAnnouncementCardView(this.mContext) : new DefaultCardView(this.mContext);
        } else {
            BrazeLogger.v(TAG, "Reusing convertView for rendering of item " + i6);
            baseFeedCardView = (BaseFeedCardView) view;
        }
        BrazeLogger.v(TAG, "Using view of type: " + baseFeedCardView.getClass().getName() + " for card at position " + i6 + ": " + card.toString());
        baseFeedCardView.setCard(card);
        logCardImpression(card);
        return baseFeedCardView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 5;
    }

    public synchronized void replaceFeed(List<Card> list) {
        int i6 = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        BrazeLogger.d(TAG, "Replacing existing feed of " + getCount() + " cards with new feed containing " + list.size() + " cards.");
        int size = list.size();
        int i7 = 0;
        while (i6 < getCount()) {
            Card card = (Card) getItem(i6);
            Card card2 = i7 < size ? list.get(i7) : null;
            if (card2 == null || !card2.equals(card)) {
                remove(card);
            } else {
                i6++;
                i7++;
            }
        }
        super.addAll(list.subList(i7, size));
        notifyDataSetChanged();
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }

    @Override // android.widget.ArrayAdapter
    public synchronized void add(Card card) {
        super.add((BrazeListAdapter) card);
    }
}
