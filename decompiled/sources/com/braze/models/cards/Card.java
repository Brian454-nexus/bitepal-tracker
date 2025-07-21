package com.braze.models.cards;

import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.CardCategory;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.enums.Channel;
import com.braze.managers.c0;
import com.braze.managers.m;
import com.braze.models.IPutIntoJson;
import com.braze.models.cards.Card;
import com.braze.models.i;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 n2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001oB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0010J\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001a\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010-\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u00107\u001a\u0002008\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010\u0010R\u0017\u0010?\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b?\u0010\u0010R\"\u0010@\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010>\u001a\u0004\b@\u0010\u0010\"\u0004\bA\u0010BR$\u0010C\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bC\u0010\u0010R\u001d\u0010D\u001a\u00020\u000e8\u0006¢\u0006\u0012\n\u0004\bD\u0010>\u0012\u0004\bF\u0010G\u001a\u0004\bE\u0010\u0010R\"\u0010H\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bH\u0010\u0010\"\u0004\bI\u0010BR\"\u0010J\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010>\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010BR\u001c\u0010L\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010.\u001a\u0004\bM\u0010\u001bR\u001a\u0010O\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010>R\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010>R\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010>R\u0017\u0010W\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR$\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010\u0010\"\u0004\bd\u0010BR*\u0010e\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bg\u0010G\u001a\u0004\be\u0010\u0010\"\u0004\bf\u0010BR*\u0010h\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bk\u0010G\u001a\u0004\bi\u0010\u0010\"\u0004\bj\u0010BR\u0011\u0010l\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bl\u0010\u0010R\u0011\u0010m\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bm\u0010\u0010¨\u0006p"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/enums/CardKey$Provider;", "cardKeysProvider", "Lcom/braze/managers/c0;", "brazeManager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lcom/braze/analytics/c;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/CardKey$Provider;Lcom/braze/managers/c0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/c;)V", "", "logImpression", "()Z", "logClick", "Ljava/util/EnumSet;", "Lcom/braze/enums/CardCategory;", "categories", "isInCategorySet", "(Ljava/util/EnumSet;)Z", "forJsonPut", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "isValidCard", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "Lcom/braze/managers/c0;", "Lcom/braze/storage/ICardStorageProvider;", "Lcom/braze/analytics/c;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "", "created", "J", "getCreated", "()J", "updated", "getUpdated", "expiresAt", "getExpiresAt", com.amazon.a.a.o.b.f11195Y, "Ljava/util/EnumSet;", "getCategories", "()Ljava/util/EnumSet;", "isContentCard", "Z", "isRemoved", "isPinned", "setPinned", "(Z)V", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", "url", "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Lcom/braze/models/cards/ICardListener;", "listener", "Lcom/braze/models/cards/ICardListener;", "getListener", "()Lcom/braze/models/cards/ICardListener;", "setListener", "(Lcom/braze/models/cards/ICardListener;)V", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", "isExpired", "isControl", "Companion", "com/braze/models/cards/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class Card implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private final c0 brazeManager;
    private final com.braze.analytics.c cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    public Card(JSONObject jsonObject, CardKey.Provider cardKeysProvider, c0 c0Var, ICardStorageProvider<?> iCardStorageProvider, com.braze.analytics.c cVar) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeysProvider, "cardKeysProvider");
        this.jsonObject = jsonObject;
        this.brazeManager = c0Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = cVar;
        this.extras = JsonUtils.convertJSONObjectToMap(jsonObject.optJSONObject(cardKeysProvider.getKey(CardKey.EXTRAS)));
        String string = jsonObject.getString(cardKeysProvider.getKey(CardKey.ID));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.id = string;
        this.isContentCard = cardKeysProvider.getIsContentCardProvider();
        this.cardType = CardType.DEFAULT;
        this.channel = cardKeysProvider.getIsContentCardProvider() ? Channel.CONTENT_CARD : Channel.NEWS_FEED;
        this.wasViewedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSED), false);
        this.isPinned = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.PINNED), false);
        this.created = jsonObject.getLong(cardKeysProvider.getKey(CardKey.CREATED));
        this.expiresAt = jsonObject.optLong(cardKeysProvider.getKey(CardKey.EXPIRES_AT), -1L);
        this.openUriInWebView = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.REMOVED), false);
        JSONArray optJSONArray = jsonObject.optJSONArray(cardKeysProvider.getKey(CardKey.CATEGORIES));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        } else {
            EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
            Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new b(optJSONArray)), new c(optJSONArray)).iterator();
            while (it.hasNext()) {
                CardCategory cardCategory = CardCategory.get((String) it.next());
                if (cardCategory != null) {
                    noneOf.add(cardCategory);
                }
            }
            this.categories = noneOf;
        }
        this.updated = this.jsonObject.optLong(cardKeysProvider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.IS_TEST), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$1() {
        return "Cannot dismiss a card more than once. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$3() {
        return "Failed to log card as dismissed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isIndicatorHighlighted_$lambda$0() {
        return "Failed to mark card indicator as highlighted.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidCard$lambda$17() {
        return "Card ID cannot be null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$14(Card card) {
        return "Logged click for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$15(Card card) {
        return "Failed to log card clicked for id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$16(Card card) {
        return "Failed to log card as clicked for id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$10(Card card) {
        return "Logging control impression event for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$12(Card card) {
        return "Failed to log card impression for card id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return "Logging impression event for card with id: " + card.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(getClass(), other.getClass())) {
            Card card = (Card) other;
            if (this.updated == card.updated && Intrinsics.areEqual(this.id, card.id)) {
                return true;
            }
        }
        return false;
    }

    public abstract CardType getCardType();

    public final Channel getChannel() {
        return this.channel;
    }

    public final long getCreated() {
        return this.created;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public String getUrl() {
        return this.url;
    }

    /* renamed from: getViewed, reason: from getter */
    public final boolean getWasViewedInternal() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        long j6 = this.updated;
        return hashCode + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    /* renamed from: isDismissibleByUser, reason: from getter */
    public final boolean getIsDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j6 = this.expiresAt;
        return j6 != -1 && j6 <= DateTimeUtils.nowInSeconds();
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        EnumSet<CardCategory> enumSet = this.categories;
        if (enumSet == null) {
            return false;
        }
        Iterator<E> it = categories.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            if (enumSet.contains((CardCategory) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isIndicatorHighlighted, reason: from getter */
    public final boolean getIsIndicatorHighlightedInternal() {
        return this.isIndicatorHighlightedInternal;
    }

    /* renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    public final boolean isValidCard() {
        if (!StringsKt.isBlank(this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: b4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isValidCard$lambda$17;
                isValidCard$lambda$17 = Card.isValidCard$lambda$17();
                return isValidCard$lambda$17;
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: b4.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logClick$lambda$15;
                        logClick$lambda$15 = Card.logClick$lambda$15(Card.this);
                        return logClick$lambda$15;
                    }
                }, 6, (Object) null);
                return false;
            }
            i b6 = this.cardAnalytics.b(this.id);
            if (b6 != null) {
                ((m) this.brazeManager).a(b6);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: b4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logClick$lambda$14;
                    logClick$lambda$14 = Card.logClick$lambda$14(Card.this);
                    return logClick$lambda$14;
                }
            }, 7, (Object) null);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: b4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logClick$lambda$16;
                    logClick$lambda$16 = Card.logClick$lambda$16(Card.this);
                    return logClick$lambda$16;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: b4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logImpression$lambda$10;
                        logImpression$lambda$10 = Card.logImpression$lambda$10(Card.this);
                        return logImpression$lambda$10;
                    }
                }, 6, (Object) null);
                i c6 = this.cardAnalytics.c(this.id);
                if (c6 != null) {
                    ((m) this.brazeManager).a(c6);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: b4.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logImpression$lambda$8;
                        logImpression$lambda$8 = Card.logImpression$lambda$8(Card.this);
                        return logImpression$lambda$8;
                    }
                }, 6, (Object) null);
                i d6 = this.cardAnalytics.d(this.id);
                if (d6 != null) {
                    ((m) this.brazeManager).a(d6);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: b4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$12;
                    logImpression$lambda$12 = Card.logImpression$lambda$12(Card.this);
                    return logImpression$lambda$12;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z6) {
        i a6;
        if (this.isDismissedInternal && z6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: b4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_isDismissed_$lambda$1;
                    _set_isDismissed_$lambda$1 = Card._set_isDismissed_$lambda$1();
                    return _set_isDismissed_$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z6;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z6) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard() || (a6 = this.cardAnalytics.a(this.id)) == null) {
                    return;
                }
                ((m) this.brazeManager).a(a6);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: b4.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _set_isDismissed_$lambda$3;
                        _set_isDismissed_$lambda$3 = Card._set_isDismissed_$lambda$3();
                        return _set_isDismissed_$lambda$3;
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final void setIndicatorHighlighted(boolean z6) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z6;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (!z6 || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12980D, (Throwable) e6, false, new Function0() { // from class: b4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_isIndicatorHighlighted_$lambda$0;
                    _set_isIndicatorHighlighted_$lambda$0 = Card._set_isIndicatorHighlighted_$lambda$0();
                    return _set_isIndicatorHighlighted_$lambda$0;
                }
            }, 4, (Object) null);
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setViewed(boolean z6) {
        this.wasViewedInternal = z6;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        return StringsKt.trimIndent("\n            Card{\n            extras=" + this.extras + "\n            id='" + this.id + "'\n            created=" + this.created + "\n            updated=" + this.updated + "\n            expiresAt=" + this.expiresAt + "\n            categories=" + this.categories + "\n            isContentCard=" + this.isContentCard + "\n            viewed=" + this.wasViewedInternal + "\n            isRead=" + this.isIndicatorHighlightedInternal + "\n            isDismissed=" + this.isDismissedInternal + "\n            isRemoved=" + this.isRemoved + "\n            isPinned=" + this.isPinned + "\n            isClicked=" + this.isClicked + "\n            openUriInWebview=" + this.openUriInWebView + "\n            isDismissibleByUser=" + this.isDismissibleByUser + "\n            isTest=" + this.isTest + "\n            json=" + JsonUtils.getPrettyPrintedString(this.jsonObject) + "\n            }\n\n        ");
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getPropertiesJSONObject() {
        return this.jsonObject;
    }
}
