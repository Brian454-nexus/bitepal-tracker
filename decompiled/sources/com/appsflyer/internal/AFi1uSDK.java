package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFi1uSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getCurrencyIso4217Code", "()Z", "Ljava/lang/String;", "getMonetizationNetwork", "getRevenue", "I", "AFAdRevenueData", "F", "component4", "getMediationNetwork", "Ljava/util/List;", "J", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1uSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public List<String> component4;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public final String getMediationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final String getMonetizationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public long areAllFieldsValid;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public final float getRevenue;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public final int AFAdRevenueData;

    @JvmOverloads
    public AFi1uSDK(long j6, float f6, @NotNull List<String> list, int i6, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.areAllFieldsValid = j6;
        this.getRevenue = f6;
        this.component4 = list;
        this.AFAdRevenueData = i6;
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1uSDK.class, p02 != null ? p02.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p02, "");
        AFi1uSDK aFi1uSDK = (AFi1uSDK) p02;
        return this.areAllFieldsValid == aFi1uSDK.areAllFieldsValid && this.getRevenue == aFi1uSDK.getRevenue && Intrinsics.areEqual(this.component4, aFi1uSDK.component4) && this.AFAdRevenueData == aFi1uSDK.AFAdRevenueData && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1uSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFi1uSDK.getMediationNetwork);
    }

    @JvmName(name = "getCurrencyIso4217Code")
    public final boolean getCurrencyIso4217Code() {
        return TimeUnit.SECONDS.toMillis(this.areAllFieldsValid) > AFb1rSDK.getRevenue().getMonetizationNetwork().component1().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.areAllFieldsValid) * 31) + Float.hashCode(this.getRevenue)) * 31) + this.component4.hashCode()) * 31) + this.AFAdRevenueData) * 31) + this.getMonetizationNetwork.hashCode()) * 31) + this.getMediationNetwork.hashCode();
    }
}
