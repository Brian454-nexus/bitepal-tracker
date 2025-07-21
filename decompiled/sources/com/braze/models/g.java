package com.braze.models;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.c0;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f12585a = new g();

    public static final Card a(CardKey.Provider provider, c0 c0Var, ICardStorageProvider iCardStorageProvider, com.braze.analytics.c cVar, final JSONArray jSONArray, final Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return a(new JSONObject(it.toString()), provider, c0Var, iCardStorageProvider, cVar);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12585a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: a4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.g.a(it, jSONArray);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(JSONObject jsonObject, CardKey.Provider cardKeyProvider, c0 brazeManager, ICardStorageProvider cardStorageProvider, com.braze.analytics.c cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = cardKeyProvider.getCardTypeFromJson(jsonObject);
        int i6 = cardTypeFromJson == null ? -1 : d.f12576a[cardTypeFromJson.ordinal()];
        if (i6 == 1) {
            return new ImageOnlyCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i6 == 2) {
            return new CaptionedImageCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i6 == 3) {
            return new ShortNewsCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i6 == 4) {
            return new TextAnnouncementCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i6 != 5) {
            return null;
        }
        return new ControlCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
    }

    public static final List a(final JSONArray cardJsonStringArray, final CardKey.Provider cardKeyProvider, final com.braze.managers.m brazeManager, final ICardStorageProvider cardStorageProvider, final com.braze.analytics.c cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.asSequence(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, cardJsonStringArray.length())), new e(cardJsonStringArray)), new f(cardJsonStringArray)).iterator()), new Function1() { // from class: a4.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.braze.models.g.a(CardKey.Provider.this, brazeManager, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray, obj);
            }
        }));
    }
}
