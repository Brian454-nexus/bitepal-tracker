package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u0018\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "Lcom/appsflyer/internal/AFh1uSDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFh1vSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", Q4.e.f4542u, "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "getRevenue", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "AFAdRevenueData", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1ySDK extends AFh1uSDK {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getMediationNetwork = iArr;
        }
    }

    private static boolean AFAdRevenueData(AFLogger.LogLevel p02) {
        return p02.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getRevenue(AFLogger.LogLevel p02, AFh1vSDK p12, String p22, Throwable p32) {
        if (AFAdRevenueData(p02)) {
            String revenue = getRevenue(p22, p12);
            int i6 = AFa1vSDK.getMediationNetwork[p02.ordinal()];
            if (i6 == 1) {
                Log.d("AppsFlyer_6.15.2", revenue);
                return;
            }
            if (i6 == 2) {
                Log.i("AppsFlyer_6.15.2", revenue);
                return;
            }
            if (i6 == 3) {
                Log.w("AppsFlyer_6.15.2", revenue);
            } else if (i6 == 4) {
                Log.v("AppsFlyer_6.15.2", revenue);
            } else {
                if (i6 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.15.2", revenue, p32);
            }
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void d(@NotNull AFh1vSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getRevenue(AFLogger.LogLevel.DEBUG, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(@NotNull AFh1vSDK p02, @NotNull String p12, @NotNull Throwable p22, boolean p32, boolean p42, boolean p52, boolean p6) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p22, "");
        if (p42) {
            getRevenue(AFLogger.LogLevel.ERROR, p02, p12, p22);
        } else if (p32) {
            getRevenue(AFLogger.LogLevel.DEBUG, p02, p12, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void force(@NotNull AFh1vSDK p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.15.2", withTag$SDK_prodRelease(p12, p02));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    @JvmName(name = "getShouldExtendMsg")
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void i(@NotNull AFh1vSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getRevenue(AFLogger.LogLevel.INFO, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void v(@NotNull AFh1vSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getRevenue(AFLogger.LogLevel.VERBOSE, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void w(@NotNull AFh1vSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getRevenue(AFLogger.LogLevel.WARNING, p02, p12, null);
    }
}
