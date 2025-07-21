package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.CardKey;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import ga.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p implements ICardStorageProvider {

    /* renamed from: l, reason: collision with root package name */
    public static final Set f12936l = SetsKt.setOf(new String[]{CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey()});

    /* renamed from: a, reason: collision with root package name */
    public final String f12937a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.managers.m f12938b;

    /* renamed from: c, reason: collision with root package name */
    public long f12939c;

    /* renamed from: d, reason: collision with root package name */
    public long f12940d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f12941e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f12942f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f12943g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f12944h;

    /* renamed from: i, reason: collision with root package name */
    public final SharedPreferences f12945i;

    /* renamed from: j, reason: collision with root package name */
    public final SharedPreferences f12946j;

    /* renamed from: k, reason: collision with root package name */
    public final com.braze.analytics.a f12947k;

    public p(Context context, String userId, String apiKey, com.braze.managers.m brazeManager, final String currentSdkVersion) {
        Collection filterNotNull;
        Collection filterNotNull2;
        Collection filterNotNull3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(currentSdkVersion, "currentSdkVersion");
        this.f12937a = userId;
        this.f12938b = brazeManager;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f12941e = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.f12942f = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.f12943g = linkedHashSet3;
        this.f12944h = new LinkedHashMap();
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, userId, apiKey);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.content_cards_storage_provider.cards" + cacheFileSuffix, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12945i = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.content_cards_storage_provider.metadata" + cacheFileSuffix, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.f12946j = sharedPreferences2;
        this.f12947k = new com.braze.analytics.a();
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        this.f12944h = TypeIntrinsics.asMutableMap(all);
        Set<String> stringSet = sharedPreferences2.getStringSet("dismissed", new HashSet());
        linkedHashSet.addAll((stringSet == null || (filterNotNull3 = CollectionsKt.filterNotNull(stringSet)) == null) ? SetsKt.emptySet() : filterNotNull3);
        Set<String> stringSet2 = sharedPreferences2.getStringSet("expired", new HashSet());
        linkedHashSet3.addAll((stringSet2 == null || (filterNotNull2 = CollectionsKt.filterNotNull(stringSet2)) == null) ? SetsKt.emptySet() : filterNotNull2);
        Set<String> stringSet3 = sharedPreferences2.getStringSet("test", new HashSet());
        linkedHashSet2.addAll((stringSet3 == null || (filterNotNull = CollectionsKt.filterNotNull(stringSet3)) == null) ? SetsKt.emptySet() : filterNotNull);
        final String string = sharedPreferences2.getString("last_accessed_sdk_version", "");
        if (!Intrinsics.areEqual(currentSdkVersion, string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.V
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.a(string, currentSdkVersion);
                }
            }, 6, (Object) null);
            sharedPreferences2.edit().putLong("last_full_sync_at", 0L).putString("last_accessed_sdk_version", currentSdkVersion).apply();
        }
        this.f12939c = sharedPreferences2.getLong("last_card_updated_at", 0L);
        this.f12940d = sharedPreferences2.getLong("last_full_sync_at", 0L);
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(String str) {
        return com.braze.j.a("Adding card to test cache: ", str);
    }

    public static final String c(String str) {
        return com.braze.j.a("Deleting expired card from storage with id: ", str);
    }

    public static final String d(JSONObject jSONObject) {
        return "Server card was locally dismissed already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String e(String str) {
        return com.braze.j.a("Card not present in storage for id: ", str);
    }

    public static final String f(String str) {
        return com.braze.j.a("Failed to read card json from storage. Json: ", str);
    }

    public static final String h(String str) {
        return com.braze.j.a("Removing card from test cache: ", str);
    }

    public static final String i(String str) {
        return com.braze.j.a("Server card is marked as removed. Removing from card storage with id: ", str);
    }

    public static final String j(String str) {
        return com.braze.j.a("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", str);
    }

    public static final String k(String str) {
        return com.braze.j.a("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", str);
    }

    public static final String l(String str) {
        return com.braze.j.a("Removing card from storage with id: ", str);
    }

    public static final String m(String str) {
        return com.braze.j.a("Writing card to storage with id: ", str);
    }

    public final void g(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.h(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f12942f;
        linkedHashSet.remove(cardId);
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new i(this, linkedHashSet, null), 3, (Object) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f12941e.add(cardId);
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new f(this, null), 3, (Object) null);
        a(cardId, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.READ);
    }

    public static final String b(JSONObject jSONObject) {
        return "Server card json: " + jSONObject;
    }

    public static final String c(JSONObject jSONObject) {
        return "Cached card json: " + jSONObject;
    }

    public static final String d() {
        return "Input user id was null. Defaulting to the empty user id";
    }

    public static final String e(JSONObject jSONObject) {
        return "Server card has expired already. Not adding card to storage. Server card: " + jSONObject;
    }

    public final void a(final JSONObject json) {
        JSONObject jSONObject;
        Set set = CollectionsKt.toSet(this.f12941e);
        Set set2 = CollectionsKt.toSet(this.f12943g);
        final String cardId = json.getString(CardKey.ID.getContentCardsKey());
        Intrinsics.checkNotNull(cardId);
        final JSONObject d6 = d(cardId);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.b(json);
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.c(d6);
            }
        }, 7, (Object) null);
        Intrinsics.checkNotNullParameter(json, "serverCard");
        if (d6 != null) {
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            if (d6.has(contentCardsKey) && json.has(contentCardsKey) && d6.getLong(contentCardsKey) > json.getLong(contentCardsKey)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: o4.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.p.c();
                    }
                }, 6, (Object) null);
                return;
            }
        }
        CardKey cardKey = CardKey.REMOVED;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        String contentCardsKey2 = cardKey.getContentCardsKey();
        if (json.has(contentCardsKey2) ? json.getBoolean(contentCardsKey2) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.S
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.i(cardId);
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f12941e.remove(cardId);
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new h(this, null), 3, (Object) null);
            g(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        if (set.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.d(json);
                }
            }, 7, (Object) null);
            return;
        }
        if (set2.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.e(json);
                }
            }, 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey2, "cardKey");
        String contentCardsKey3 = cardKey2.getContentCardsKey();
        if (json.has(contentCardsKey3) ? json.getBoolean(contentCardsKey3) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.W
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.j(cardId);
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f12941e.add(cardId);
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new f(this, null), 3, (Object) null);
            a(cardId, (JSONObject) null);
            return;
        }
        Intrinsics.checkNotNullParameter(json, "serverCard");
        if (d6 == null) {
            jSONObject = json;
        } else {
            jSONObject = new JSONObject();
            Iterator<String> keys = d6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, d6.get(next));
            }
            Iterator<String> keys2 = json.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (f12936l.contains(next2)) {
                    jSONObject.put(next2, d6.getBoolean(next2) || json.getBoolean(next2));
                } else {
                    jSONObject.put(next2, json.get(next2));
                }
            }
        }
        a(cardId, jSONObject);
        CardKey cardKey3 = CardKey.IS_TEST;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey3, "cardKey");
        String contentCardsKey4 = cardKey3.getContentCardsKey();
        if (json.has(contentCardsKey4) ? json.getBoolean(contentCardsKey4) : false) {
            a(cardId);
        }
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    public static final String c() {
        return "The server card received is older than the cached card. Not updating the cached card.";
    }

    public final JSONObject d(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        final String str = (String) this.f12944h.get(cardId);
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.e(cardId);
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.f(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(com.braze.models.response.c contentCardsResponse, String str) {
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.d();
                }
            }, 7, (Object) null);
            objectRef.element = "";
        }
        if (!Intrinsics.areEqual(this.f12937a, objectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: o4.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.a(Ref.ObjectRef.this, this);
                }
            }, 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: o4.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.a(Ref.ObjectRef.this);
            }
        }, 6, (Object) null);
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        SharedPreferences.Editor edit = this.f12946j.edit();
        long j6 = contentCardsResponse.f12647a;
        if (j6 != -1) {
            this.f12939c = j6;
            edit.putLong("last_card_updated_at", j6);
        }
        long j7 = contentCardsResponse.f12648b;
        if (j7 != -1) {
            this.f12940d = j7;
            edit.putLong("last_full_sync_at", j7);
        }
        edit.apply();
        this.f12946j.edit().putLong("last_storage_update_timestamp", DateTimeUtils.nowInSeconds()).apply();
        LinkedHashSet cardIdsToRetain = new LinkedHashSet();
        JSONArray jSONArray = contentCardsResponse.f12650d;
        if (jSONArray != null && jSONArray.length() != 0) {
            for (JSONObject jSONObject : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new m(jSONArray)), new n(jSONArray))) {
                a(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cardIdsToRetain.add(string);
            }
        }
        if (contentCardsResponse.f12649c) {
            Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
            this.f12941e.retainAll(cardIdsToRetain);
            com.braze.coroutine.f fVar = com.braze.coroutine.f.f12131a;
            ga.i.d(fVar, (CoroutineContext) null, (L) null, new k(this, null), 3, (Object) null);
            Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
            LinkedHashSet linkedHashSet = this.f12943g;
            linkedHashSet.retainAll(cardIdsToRetain);
            ga.i.d(fVar, (CoroutineContext) null, (L) null, new l(this, linkedHashSet, null), 3, (Object) null);
            cardIdsToRetain.addAll(this.f12942f);
            a(cardIdsToRetain);
        }
        return a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef, p pVar) {
        StringBuilder sb = new StringBuilder("The received cards are for user ");
        sb.append((String) objectRef.element);
        sb.append(" and the current user is ");
        return com.braze.c.a(sb, pVar.f12937a, " , the cards will be discarded and no changes will be made.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef) {
        return "Updating offline Content Cards for user with id: " + ((String) objectRef.element);
    }

    public final ContentCardsUpdatedEvent a(boolean z6) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f12944h.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List a6 = com.braze.models.g.a(jSONArray, provider, this.f12938b, this, this.f12947k);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a6) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        return new ContentCardsUpdatedEvent(list2, this.f12937a, this.f12946j.getLong("last_storage_update_timestamp", 0L), z6);
    }

    public final void a(Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        final String cardId = card.getId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.c(cardId);
            }
        }, 7, (Object) null);
        a(cardId, (JSONObject) null);
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f12943g.add(cardId);
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new g(this, null), 3, (Object) null);
        g(cardId);
    }

    public final void a(final String cardId, final CardKey cardKey) {
        final Boolean value = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject d6 = d(cardId);
        if (d6 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.k(cardId);
                }
            }, 7, (Object) null);
            return;
        }
        try {
            d6.put(cardKey.getContentCardsKey(), value);
            a(cardId, d6);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.a(value, cardKey);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(final String cardId, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.Z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.l(cardId);
                }
            }, 7, (Object) null);
            this.f12944h.remove(cardId);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.p.m(cardId);
                }
            }, 7, (Object) null);
            this.f12944h.put(cardId, jSONObject.toString());
        }
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new o(this, jSONObject, cardId, null), 3, (Object) null);
    }

    public final void a(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.b(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f12942f;
        linkedHashSet.add(cardId);
        this.f12946j.edit().putStringSet("test", linkedHashSet).apply();
    }

    public final void a(final LinkedHashSet cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        final Set keySet = this.f12944h.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.a(cardIdsToRetain, keySet);
            }
        }, 7, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!cardIdsToRetain.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f12944h.remove((String) it.next());
        }
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new j(this, arrayList, null), 3, (Object) null);
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.p.b();
            }
        }, 7, (Object) null);
        this.f12944h.clear();
        this.f12945i.edit().clear().apply();
        this.f12946j.edit().clear().apply();
    }
}
