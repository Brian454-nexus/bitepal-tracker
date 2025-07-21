package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFc1rSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFd1nSDK;", "p0", "Lcom/appsflyer/internal/AFd1rSDK;", "p1", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFd1rSDK;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1rSDK {

    @NotNull
    public static final AFc1rSDK INSTANCE = new AFc1rSDK();

    private AFc1rSDK() {
    }

    @Nullable
    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    @JvmStatic
    public static final void getMonetizationNetwork(@NotNull AFd1nSDK p02, @NotNull AFd1rSDK p12) {
        int i6;
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1qSDK.getMediationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i6 = 23;
        } else {
            i6 = 18;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= i6 && !appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i7 + "; use KeyStore");
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p02.AFAdRevenueData);
            if (!aFKeystoreWrapper.getRevenue()) {
                aFKeystoreWrapper.getRevenue = AFb1iSDK.getCurrencyIso4217Code(p02, p12);
                aFKeystoreWrapper.getCurrencyIso4217Code = 0;
                aFKeystoreWrapper.getCurrencyIso4217Code(aFKeystoreWrapper.AFAdRevenueData());
            } else {
                String AFAdRevenueData = aFKeystoreWrapper.AFAdRevenueData();
                synchronized (aFKeystoreWrapper.AFAdRevenueData) {
                    aFKeystoreWrapper.getCurrencyIso4217Code++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFAdRevenueData)));
                    try {
                        synchronized (aFKeystoreWrapper.AFAdRevenueData) {
                            aFKeystoreWrapper.getMonetizationNetwork.deleteEntry(AFAdRevenueData);
                        }
                    } catch (KeyStoreException e6) {
                        StringBuilder sb = new StringBuilder("Exception ");
                        sb.append(e6.getMessage());
                        sb.append(" occurred");
                        AFLogger.afErrorLog(sb.toString(), e6);
                    }
                }
                aFKeystoreWrapper.getCurrencyIso4217Code(aFKeystoreWrapper.AFAdRevenueData());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getMediationNetwork()));
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i7 + "; no KeyStore usage");
    }

    @Nullable
    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
