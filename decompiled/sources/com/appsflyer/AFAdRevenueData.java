package com.appsflyer;

import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b#\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/appsflyer/AFAdRevenueData;", "", "", "monetizationNetwork", "Lcom/appsflyer/MediationNetwork;", "mediationNetwork", "currencyIso4217Code", "", "revenue", "<init>", "(Ljava/lang/String;Lcom/appsflyer/MediationNetwork;Ljava/lang/String;D)V", "", "areAllFieldsValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/appsflyer/MediationNetwork;", "component3", "component4", "()D", "copy", "(Ljava/lang/String;Lcom/appsflyer/MediationNetwork;Ljava/lang/String;D)Lcom/appsflyer/AFAdRevenueData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AFAdRevenueData", "toString", "Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/MediationNetwork;", "getMediationNetwork", "getMonetizationNetwork", "D", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class AFAdRevenueData {

    @NotNull
    private final String currencyIso4217Code;

    @NotNull
    private final MediationNetwork mediationNetwork;

    @NotNull
    private final String monetizationNetwork;
    private final double revenue;

    public AFAdRevenueData(@NotNull String str, @NotNull MediationNetwork mediationNetwork, @NotNull String str2, double d6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.monetizationNetwork = str;
        this.mediationNetwork = mediationNetwork;
        this.currencyIso4217Code = str2;
        this.revenue = d6;
    }

    private final boolean AFAdRevenueData() {
        try {
            Currency.getInstance(this.currencyIso4217Code);
            return true;
        } catch (Throwable unused) {
            AFh1uSDK.w$default(AFLogger.INSTANCE, AFh1vSDK.AD_REVENUE, "Currency is not ISO 4217 currency code", false, 4, null);
            return false;
        }
    }

    public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String str, MediationNetwork mediationNetwork, String str2, double d6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = aFAdRevenueData.monetizationNetwork;
        }
        if ((i6 & 2) != 0) {
            mediationNetwork = aFAdRevenueData.mediationNetwork;
        }
        if ((i6 & 4) != 0) {
            str2 = aFAdRevenueData.currencyIso4217Code;
        }
        if ((i6 & 8) != 0) {
            d6 = aFAdRevenueData.revenue;
        }
        String str3 = str2;
        return aFAdRevenueData.copy(str, mediationNetwork, str3, d6);
    }

    public final boolean areAllFieldsValid() {
        return !StringsKt.isBlank(this.monetizationNetwork) && AFAdRevenueData();
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRevenue() {
        return this.revenue;
    }

    @NotNull
    public final AFAdRevenueData copy(@NotNull String monetizationNetwork, @NotNull MediationNetwork mediationNetwork, @NotNull String currencyIso4217Code, double revenue) {
        Intrinsics.checkNotNullParameter(monetizationNetwork, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
        return new AFAdRevenueData(monetizationNetwork, mediationNetwork, currencyIso4217Code, revenue);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFAdRevenueData)) {
            return false;
        }
        AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) other;
        return Intrinsics.areEqual(this.monetizationNetwork, aFAdRevenueData.monetizationNetwork) && this.mediationNetwork == aFAdRevenueData.mediationNetwork && Intrinsics.areEqual(this.currencyIso4217Code, aFAdRevenueData.currencyIso4217Code) && Double.compare(this.revenue, aFAdRevenueData.revenue) == 0;
    }

    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    @JvmName(name = "getMediationNetwork")
    @NotNull
    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    @JvmName(name = "getMonetizationNetwork")
    @NotNull
    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    @JvmName(name = "getRevenue")
    public final double getRevenue() {
        return this.revenue;
    }

    public final int hashCode() {
        return (((((this.monetizationNetwork.hashCode() * 31) + this.mediationNetwork.hashCode()) * 31) + this.currencyIso4217Code.hashCode()) * 31) + Double.hashCode(this.revenue);
    }

    @NotNull
    public final String toString() {
        return "AFAdRevenueData(monetizationNetwork=" + this.monetizationNetwork + ", mediationNetwork=" + this.mediationNetwork + ", currencyIso4217Code=" + this.currencyIso4217Code + ", revenue=" + this.revenue + ")";
    }
}
