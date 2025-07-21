package com.appsflyer.api.models;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\n"}, d2 = {"Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1z;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toJsonMap", "()Ljava/util/Map;", "toString", "formattedPrice", "Ljava/lang/String;", "getFormattedPrice", "priceAmountMicros", "J", "getPriceAmountMicros", "priceCurrencyCode", "getPriceCurrencyCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class OneTimePurchaseOfferDetails implements AFPurchaseConnectorA1z {

    @NotNull
    private final String formattedPrice;
    private final long priceAmountMicros;

    @NotNull
    private final String priceCurrencyCode;

    public OneTimePurchaseOfferDetails(@NotNull String str, long j6, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.formattedPrice = str;
        this.priceAmountMicros = j6;
        this.priceCurrencyCode = str2;
    }

    public static /* synthetic */ OneTimePurchaseOfferDetails copy$default(OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, String str, long j6, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = oneTimePurchaseOfferDetails.formattedPrice;
        }
        if ((i6 & 2) != 0) {
            j6 = oneTimePurchaseOfferDetails.priceAmountMicros;
        }
        if ((i6 & 4) != 0) {
            str2 = oneTimePurchaseOfferDetails.priceCurrencyCode;
        }
        return oneTimePurchaseOfferDetails.copy(str, j6, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    @NotNull
    public final OneTimePurchaseOfferDetails copy(@NotNull String p02, long p12, @NotNull String p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p22, "");
        return new OneTimePurchaseOfferDetails(p02, p12, p22);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof OneTimePurchaseOfferDetails)) {
            return false;
        }
        OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) p02;
        return Intrinsics.areEqual(this.formattedPrice, oneTimePurchaseOfferDetails.formattedPrice) && this.priceAmountMicros == oneTimePurchaseOfferDetails.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, oneTimePurchaseOfferDetails.priceCurrencyCode);
    }

    @JvmName(name = "getFormattedPrice")
    @NotNull
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    @JvmName(name = "getPriceAmountMicros")
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @JvmName(name = "getPriceCurrencyCode")
    @NotNull
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final int hashCode() {
        return (((this.formattedPrice.hashCode() * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode();
    }

    @NotNull
    public final Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("formatted_price", this.formattedPrice), TuplesKt.to("price_amount_micros", Long.valueOf(this.priceAmountMicros)), TuplesKt.to("price_currency_code", this.priceCurrencyCode)});
    }

    @NotNull
    public final String toString() {
        return "OneTimePurchaseOfferDetails(formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ")";
    }
}
