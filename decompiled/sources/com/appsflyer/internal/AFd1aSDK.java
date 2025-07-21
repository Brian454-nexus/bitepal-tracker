package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFd1aSDK;", "Lcom/appsflyer/internal/AFd1gSDK;", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "getMonetizationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFe1uSDK;", "AFAdRevenueData", "getRevenue", "()Ljava/lang/String;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1aSDK extends AFd1gSDK {

    @NotNull
    public static String getRevenue = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFe1uSDK AFAdRevenueData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1aSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i6) {
        super(bArr, map, i6);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFAdRevenueData = AFe1uSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    /* renamed from: getCurrencyIso4217Code, reason: from getter */
    public final AFe1uSDK getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String getMonetizationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFe1zSDK.AFAdRevenueData(str);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @JvmName(name = "getRevenue")
    @NotNull
    public final String getRevenue() {
        String format = String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
