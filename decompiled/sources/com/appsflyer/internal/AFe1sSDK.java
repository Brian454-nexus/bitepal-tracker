package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFe1sSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1sSDK extends AFe1mSDK {

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFe1sSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "AFAdRevenueData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1sSDK$AFa1vSDK, reason: from kotlin metadata */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static String AFAdRevenueData(String p02, String p12, String p22) {
            return String.format(AFe1qSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()) + p02 + p22 + "?device_id=" + p12;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String AFAdRevenueData(@NotNull String p02, @NotNull String p12, @Nullable String p22, @NotNull String p32, @NotNull String p42) {
            Intrinsics.checkNotNullParameter(p02, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p32, "");
            Intrinsics.checkNotNullParameter(p42, "");
            return AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{p42, p22, p02 + p12}), p32);
        }
    }

    public /* synthetic */ AFe1sSDK(String str, Map map, byte[] bArr, String str2, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i6 & 4) != 0 ? null : bArr, (i6 & 8) != 0 ? "GET" : str2, (i6 & 16) != 0 ? false : z6);
    }

    @JvmStatic
    @NotNull
    public static final AFe1sSDK getRevenue(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String AFAdRevenueData = Companion.AFAdRevenueData(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFe1sSDK aFe1sSDK = new AFe1sSDK(AFAdRevenueData, MapsKt.mapOf(new Pair[]{TuplesKt.to("Connection", "close"), TuplesKt.to("af_request_epoch_ms", valueOf), TuplesKt.to("af_sig", Companion.AFAdRevenueData(str, str3, str2, str4, valueOf))}), null, null, false, 28, null);
        aFe1sSDK.component3 = 10000;
        return aFe1sSDK;
    }

    private AFe1sSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z6) {
        super(str, bArr, str2, map, z6);
    }
}
