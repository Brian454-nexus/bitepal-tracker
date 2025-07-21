package com.braze.models.cards;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.c0;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/braze/models/cards/CaptionedImageCard;", "Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/enums/CardKey$Provider;", "cardKeyProvider", "Lcom/braze/managers/c0;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lcom/braze/analytics/c;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/CardKey$Provider;Lcom/braze/managers/c0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/c;)V", "", "toString", "()Ljava/lang/String;", "imageUrl", "Ljava/lang/String;", "getImageUrl", com.amazon.a.a.o.b.f11189S, "getTitle", com.amazon.a.a.o.b.f11199c, "getDescription", "url", "getUrl", "domain", "getDomain", "", "aspectRatio", "F", "getAspectRatio", "()F", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class CaptionedImageCard extends Card {
    private final float aspectRatio;
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String imageUrl;
    private final String title;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, c0 c0Var, ICardStorageProvider<?> iCardStorageProvider, com.braze.analytics.c cVar) {
        super(jsonObject, cardKeyProvider, c0Var, iCardStorageProvider, cVar);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        String string = jsonObject.getString(cardKeyProvider.getKey(CardKey.CAPTIONED_IMAGE_IMAGE));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.imageUrl = string;
        String string2 = jsonObject.getString(cardKeyProvider.getKey(CardKey.CAPTIONED_IMAGE_TITLE));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.title = string2;
        String string3 = jsonObject.getString(cardKeyProvider.getKey(CardKey.CAPTIONED_IMAGE_DESCRIPTION));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.description = string3;
        this.url = JsonUtils.getOptionalString(jsonObject, cardKeyProvider.getKey(CardKey.CAPTIONED_IMAGE_URL));
        this.domain = JsonUtils.getOptionalString(jsonObject, cardKeyProvider.getKey(CardKey.CAPTIONED_IMAGE_DOMAIN));
        this.aspectRatio = (float) jsonObject.optDouble(cardKeyProvider.getKey(CardKey.CAPTIONED_IMAGE_ASPECT_RATIO), 0.0d);
        this.cardType = CardType.CAPTIONED_IMAGE;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return StringsKt.trimIndent("\n            CaptionedImageCard{imageUrl='" + this.imageUrl + "'\n            title='" + this.title + "'\n            description='" + this.description + "'\n            url='" + getUrl() + "'\n            domain='" + this.domain + "'\n            aspectRatio=" + this.aspectRatio + "\n            " + super.toString() + "}\n\n        ");
    }
}
