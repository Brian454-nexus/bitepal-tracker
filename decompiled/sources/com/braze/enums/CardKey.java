package com.braze.enums;

import com.braze.enums.CardKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b/\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/braze/enums/CardKey;", "", "", "feedKey", "contentCardsKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getFeedKey", "()Ljava/lang/String;", "getContentCardsKey", "Companion", "com/braze/enums/b", "Provider", "ID", "VIEWED", "CREATED", "EXPIRES_AT", "EXTRAS", "OPEN_URI_IN_WEBVIEW", "TYPE", "CATEGORIES", "UPDATED", "DISMISSED", "REMOVED", "PINNED", "DISMISSIBLE", "IS_TEST", "READ", "CLICKED", "IMAGE_ONLY_IMAGE", "IMAGE_ONLY_URL", "IMAGE_ONLY_DOMAIN", "IMAGE_ONLY_ASPECT_RATIO", "CAPTIONED_IMAGE_IMAGE", "CAPTIONED_IMAGE_TITLE", "CAPTIONED_IMAGE_DESCRIPTION", "CAPTIONED_IMAGE_URL", "CAPTIONED_IMAGE_DOMAIN", "CAPTIONED_IMAGE_ASPECT_RATIO", "TEXT_ANNOUNCEMENT_TITLE", "TEXT_ANNOUNCEMENT_DESCRIPTION", "TEXT_ANNOUNCEMENT_URL", "TEXT_ANNOUNCEMENT_DOMAIN", "SHORT_NEWS_IMAGE", "SHORT_NEWS_TITLE", "SHORT_NEWS_DESCRIPTION", "SHORT_NEWS_URL", "SHORT_NEWS_DOMAIN", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class CardKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardKey[] $VALUES;
    public static final b Companion;
    private static final Map<String, CardType> cardTypeMap;
    private final String contentCardsKey;
    private final String feedKey;
    public static final CardKey ID = new CardKey("ID", 0, "id", "id");
    public static final CardKey VIEWED = new CardKey("VIEWED", 1, "viewed", "v");
    public static final CardKey CREATED = new CardKey("CREATED", 2, "created", "ca");
    public static final CardKey EXPIRES_AT = new CardKey("EXPIRES_AT", 3, "expires_at", "ea");
    public static final CardKey EXTRAS = new CardKey("EXTRAS", 4, "extras", Q4.e.f4542u);
    public static final CardKey OPEN_URI_IN_WEBVIEW = new CardKey("OPEN_URI_IN_WEBVIEW", 5, "use_webview", "uw");
    public static final CardKey TYPE = new CardKey("TYPE", 6, "type", "tp");
    public static final CardKey CATEGORIES = new CardKey("CATEGORIES", 7, "categories", "");
    public static final CardKey UPDATED = new CardKey("UPDATED", 8, "updated", "");
    public static final CardKey DISMISSED = new CardKey("DISMISSED", 9, "", "d");
    public static final CardKey REMOVED = new CardKey("REMOVED", 10, "", "r");
    public static final CardKey PINNED = new CardKey("PINNED", 11, "", "p");
    public static final CardKey DISMISSIBLE = new CardKey("DISMISSIBLE", 12, "", "db");
    public static final CardKey IS_TEST = new CardKey("IS_TEST", 13, "", "t");
    public static final CardKey READ = new CardKey("READ", 14, "", "read");
    public static final CardKey CLICKED = new CardKey("CLICKED", 15, "", "cl");
    public static final CardKey IMAGE_ONLY_IMAGE = new CardKey("IMAGE_ONLY_IMAGE", 16, "image", "i");
    public static final CardKey IMAGE_ONLY_URL = new CardKey("IMAGE_ONLY_URL", 17, "url", "u");
    public static final CardKey IMAGE_ONLY_DOMAIN = new CardKey("IMAGE_ONLY_DOMAIN", 18, "domain", "");
    public static final CardKey IMAGE_ONLY_ASPECT_RATIO = new CardKey("IMAGE_ONLY_ASPECT_RATIO", 19, "aspect_ratio", "ar");
    public static final CardKey CAPTIONED_IMAGE_IMAGE = new CardKey("CAPTIONED_IMAGE_IMAGE", 20, "image", "i");
    public static final CardKey CAPTIONED_IMAGE_TITLE = new CardKey("CAPTIONED_IMAGE_TITLE", 21, com.amazon.a.a.o.b.f11189S, "tt");
    public static final CardKey CAPTIONED_IMAGE_DESCRIPTION = new CardKey("CAPTIONED_IMAGE_DESCRIPTION", 22, com.amazon.a.a.o.b.f11199c, "ds");
    public static final CardKey CAPTIONED_IMAGE_URL = new CardKey("CAPTIONED_IMAGE_URL", 23, "url", "u");
    public static final CardKey CAPTIONED_IMAGE_DOMAIN = new CardKey("CAPTIONED_IMAGE_DOMAIN", 24, "domain", "dm");
    public static final CardKey CAPTIONED_IMAGE_ASPECT_RATIO = new CardKey("CAPTIONED_IMAGE_ASPECT_RATIO", 25, "aspect_ratio", "ar");
    public static final CardKey TEXT_ANNOUNCEMENT_TITLE = new CardKey("TEXT_ANNOUNCEMENT_TITLE", 26, com.amazon.a.a.o.b.f11189S, "tt");
    public static final CardKey TEXT_ANNOUNCEMENT_DESCRIPTION = new CardKey("TEXT_ANNOUNCEMENT_DESCRIPTION", 27, com.amazon.a.a.o.b.f11199c, "ds");
    public static final CardKey TEXT_ANNOUNCEMENT_URL = new CardKey("TEXT_ANNOUNCEMENT_URL", 28, "url", "u");
    public static final CardKey TEXT_ANNOUNCEMENT_DOMAIN = new CardKey("TEXT_ANNOUNCEMENT_DOMAIN", 29, "domain", "dm");
    public static final CardKey SHORT_NEWS_IMAGE = new CardKey("SHORT_NEWS_IMAGE", 30, "image", "i");
    public static final CardKey SHORT_NEWS_TITLE = new CardKey("SHORT_NEWS_TITLE", 31, com.amazon.a.a.o.b.f11189S, "tt");
    public static final CardKey SHORT_NEWS_DESCRIPTION = new CardKey("SHORT_NEWS_DESCRIPTION", 32, com.amazon.a.a.o.b.f11199c, "ds");
    public static final CardKey SHORT_NEWS_URL = new CardKey("SHORT_NEWS_URL", 33, "url", "u");
    public static final CardKey SHORT_NEWS_DOMAIN = new CardKey("SHORT_NEWS_DOMAIN", 34, "domain", "dm");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/braze/enums/CardKey$Provider;", "", "", "isContentCardProvider", "<init>", "(Z)V", "Lcom/braze/enums/CardKey;", "key", "", "getKey", "(Lcom/braze/enums/CardKey;)Ljava/lang/String;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/enums/CardType;", "getCardTypeFromJson", "(Lorg/json/JSONObject;)Lcom/braze/enums/CardType;", "Z", "()Z", "Companion", "com/braze/enums/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Provider {
        private final boolean isContentCardProvider;
        public static final c Companion = new c();
        public static final Provider CONTENT_CARDS = new Provider(true);
        public static final Provider NEWS_FEED = new Provider(false);

        public Provider(boolean z6) {
            this.isContentCardProvider = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getCardTypeFromJson$lambda$0(JSONObject jSONObject) {
            return "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: " + jSONObject;
        }

        public final CardType getCardTypeFromJson(final JSONObject jsonObject) {
            String optionalString;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String optionalString2 = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.TYPE));
            if (optionalString2 != null && optionalString2.length() != 0 && this.isContentCardProvider && Intrinsics.areEqual(optionalString2, "short_news") && ((optionalString = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.SHORT_NEWS_IMAGE))) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: V3.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String cardTypeFromJson$lambda$0;
                        cardTypeFromJson$lambda$0 = CardKey.Provider.getCardTypeFromJson$lambda$0(jsonObject);
                        return cardTypeFromJson$lambda$0;
                    }
                }, 6, (Object) null);
                optionalString2 = "text_announcement";
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        public final String getKey(CardKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.isContentCardProvider ? key.getContentCardsKey() : key.getFeedKey();
        }

        /* renamed from: isContentCardProvider, reason: from getter */
        public final boolean getIsContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    private static final /* synthetic */ CardKey[] $values() {
        return new CardKey[]{ID, VIEWED, CREATED, EXPIRES_AT, EXTRAS, OPEN_URI_IN_WEBVIEW, TYPE, CATEGORIES, UPDATED, DISMISSED, REMOVED, PINNED, DISMISSIBLE, IS_TEST, READ, CLICKED, IMAGE_ONLY_IMAGE, IMAGE_ONLY_URL, IMAGE_ONLY_DOMAIN, IMAGE_ONLY_ASPECT_RATIO, CAPTIONED_IMAGE_IMAGE, CAPTIONED_IMAGE_TITLE, CAPTIONED_IMAGE_DESCRIPTION, CAPTIONED_IMAGE_URL, CAPTIONED_IMAGE_DOMAIN, CAPTIONED_IMAGE_ASPECT_RATIO, TEXT_ANNOUNCEMENT_TITLE, TEXT_ANNOUNCEMENT_DESCRIPTION, TEXT_ANNOUNCEMENT_URL, TEXT_ANNOUNCEMENT_DOMAIN, SHORT_NEWS_IMAGE, SHORT_NEWS_TITLE, SHORT_NEWS_DESCRIPTION, SHORT_NEWS_URL, SHORT_NEWS_DOMAIN};
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [com.braze.enums.b] */
    static {
        CardKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Object() { // from class: com.braze.enums.b
        };
        cardTypeMap = MapsKt.mapOf(new Pair[]{TuplesKt.to("banner_image", CardType.IMAGE), TuplesKt.to("captioned_image", CardType.CAPTIONED_IMAGE), TuplesKt.to("text_announcement", CardType.TEXT_ANNOUNCEMENT), TuplesKt.to("short_news", CardType.SHORT_NEWS), TuplesKt.to("control", CardType.CONTROL)});
    }

    private CardKey(String str, int i6, String str2, String str3) {
        this.feedKey = str2;
        this.contentCardsKey = str3;
    }

    public static CardKey valueOf(String str) {
        return (CardKey) Enum.valueOf(CardKey.class, str);
    }

    public static CardKey[] values() {
        return (CardKey[]) $VALUES.clone();
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
