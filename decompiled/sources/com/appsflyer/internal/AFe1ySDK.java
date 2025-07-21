package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK;", "Lcom/appsflyer/internal/AFd1gSDK;", "Lcom/appsflyer/internal/AFd1qSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1qSDK;[BLjava/util/Map;I)V", "getMonetizationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "component3", "Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFe1uSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFd1qSDK;", "", "getRevenue", "Z", "getMediationNetwork", "()Z", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1ySDK extends AFd1gSDK {

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFe1uSDK AFAdRevenueData;

    @NotNull
    public AFd1qSDK getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean getMediationNetwork;

    public /* synthetic */ AFe1ySDK(AFd1qSDK aFd1qSDK, byte[] bArr, Map map, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1qSDK, bArr, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? 2000 : i6);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    /* renamed from: getCurrencyIso4217Code, reason: from getter */
    public final AFe1uSDK getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @JvmName(name = "getMediationNetwork")
    /* renamed from: getMediationNetwork, reason: from getter */
    public final boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String getMonetizationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @JvmName(name = "getRevenue")
    @NotNull
    public final String getRevenue() {
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMonetizationNetwork, null, 2, null);
        return aFj1jSDK.getMediationNetwork(aFj1jSDK.getMediationNetwork.getMonetizationNetwork(AFj1jSDK.component2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFe1ySDK(@NotNull AFd1qSDK aFd1qSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i6) {
        super(bArr, map, i6);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMonetizationNetwork = aFd1qSDK;
        this.AFAdRevenueData = AFe1uSDK.OCTET_STREAM;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFe1ySDK(@NotNull AFd1qSDK aFd1qSDK, @NotNull byte[] bArr) {
        this(aFd1qSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
