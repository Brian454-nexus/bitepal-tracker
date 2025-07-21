package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.CardKey;
import com.braze.events.FeedUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements ICardStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.managers.m f12969a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12970b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f12971c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f12972d;

    /* renamed from: e, reason: collision with root package name */
    public final com.braze.analytics.b f12973e;

    public x(Context context, String str, com.braze.managers.m brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f12969a = brazeManager;
        this.f12973e = new com.braze.analytics.b();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.feedstorageprovider" + StringUtils.getCacheFileSuffix(context, str == null ? "" : str), 0);
        this.f12970b = sharedPreferences;
        this.f12971c = a(w.f12965d);
        this.f12972d = a(w.f12964c);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    public static final String a(String str) {
        return com.braze.j.a("Updating offline feed for user with id: ", str);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (this.f12971c.contains(cardId)) {
            return;
        }
        this.f12971c.add(cardId);
        a(this.f12971c, w.f12965d);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (this.f12972d.contains(cardId)) {
            return;
        }
        this.f12972d.add(cardId);
        a(this.f12972d, w.f12964c);
    }

    public final void a(AbstractSet cardIds, w property) {
        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
        Intrinsics.checkNotNullParameter(property, "property");
        String str = property.f12967a;
        SharedPreferences.Editor edit = this.f12970b.edit();
        if (cardIds.isEmpty()) {
            edit.remove(str);
        } else {
            edit.putStringSet(str, cardIds);
        }
        edit.apply();
    }

    public final AbstractSet a(w wVar) {
        String str = wVar.f12968b;
        if (this.f12970b.contains(str)) {
            HashSet hashSet = null;
            String input = this.f12970b.getString(str, null);
            if (input != null) {
                Intrinsics.checkNotNullParameter(input, "input");
                hashSet = new HashSet();
                String[] strArr = (String[]) StringsKt.split$default(input, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
            }
            SharedPreferences.Editor edit = this.f12970b.edit();
            edit.remove(str);
            edit.apply();
            if (hashSet != null) {
                a(hashSet, wVar);
                return hashSet;
            }
        }
        return new ConcurrentSkipListSet(this.f12970b.getStringSet(wVar.f12967a, new HashSet()));
    }

    public final FeedUpdatedEvent a(JSONArray cardsArray, final String str) {
        Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
        String str2 = str == null ? "" : str;
        final String string = this.f12970b.getString("uid", "");
        if (Intrinsics.areEqual(string, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: o4.D0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.x.a(str);
                }
            }, 6, (Object) null);
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            SharedPreferences.Editor edit = this.f12970b.edit();
            if (cardsArray.length() == 0) {
                edit.remove("cards");
            } else {
                edit.putString("cards", cardsArray.toString());
            }
            edit.putLong("cards_timestamp", nowInSeconds);
            edit.apply();
            AbstractSet abstractSet = this.f12971c;
            Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
            HashSet hashSet = new HashSet();
            int length = cardsArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                JSONObject jSONObject = cardsArray.getJSONObject(i6);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    String string2 = jSONObject.getString(cardKey.getFeedKey());
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    hashSet.add(string2);
                }
            }
            abstractSet.retainAll(hashSet);
            a(this.f12971c, w.f12965d);
            AbstractSet abstractSet2 = this.f12972d;
            Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
            HashSet hashSet2 = new HashSet();
            int length2 = cardsArray.length();
            for (int i7 = 0; i7 < length2; i7++) {
                JSONObject jSONObject2 = cardsArray.getJSONObject(i7);
                CardKey cardKey2 = CardKey.ID;
                if (jSONObject2.has(cardKey2.getFeedKey())) {
                    String string3 = jSONObject2.getString(cardKey2.getFeedKey());
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    hashSet2.add(string3);
                }
            }
            abstractSet2.retainAll(hashSet2);
            a(this.f12972d, w.f12964c);
            return a(cardsArray, str, false, nowInSeconds);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.x.a(str, string);
            }
        }, 7, (Object) null);
        return null;
    }

    public static final String a(String str, String str2) {
        return "The received cards are for user " + str + " and the current user is " + str2 + ", the cards will be discarded and no changes will be made.";
    }

    public final FeedUpdatedEvent a(JSONArray jSONArray, String str, boolean z6, long j6) {
        List a6;
        if (jSONArray.length() == 0) {
            a6 = new ArrayList();
        } else {
            a6 = com.braze.models.g.a(jSONArray, new CardKey.Provider(false), this.f12969a, this, this.f12973e);
        }
        List<Card> list = a6;
        for (Card card : list) {
            if (this.f12971c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f12972d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list, str, z6, j6);
    }
}
