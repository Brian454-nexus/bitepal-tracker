package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1wSDK;", "", "", "getMediationNetwork", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFd1wSDK$AFa1tSDK;", "p1", "", "getRevenue", "(Landroid/content/Context;Lcom/appsflyer/internal/AFd1wSDK$AFa1tSDK;)V", "AFAdRevenueData", "()V", "AFa1ySDK", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFd1wSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getCurrencyIso4217Code;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface AFa1tSDK {
        void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK);

        void getRevenue();
    }

    /* renamed from: com.appsflyer.internal.AFd1wSDK$AFa1ySDK, reason: from kotlin metadata */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion getCurrencyIso4217Code = new Companion();
        private static long getMediationNetwork = 500;

        private Companion() {
        }

        public static long getCurrencyIso4217Code() {
            return getMediationNetwork;
        }
    }

    void AFAdRevenueData();

    boolean getMediationNetwork();

    void getRevenue(@NotNull Context p02, @NotNull AFa1tSDK p12);
}
