package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1cSDK extends AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static int valueOf = 1;
    private final AFg1kSDK AFInAppEventType;
    private final String copy;
    private final AFd1nSDK copydefault;
    private final AFd1qSDK hashCode;
    private static char[] values = {23880, 23896, 23876, 23886, 23885, 23883, 23881, 23882, 23884};
    private static char AFKeystoreWrapper = 26803;

    public AFf1cSDK(@NonNull String str, @NonNull AFd1kSDK aFd1kSDK) {
        super(new AFg1lSDK(aFd1kSDK.values().AFAdRevenueData), aFd1kSDK, str);
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.copydefault = aFd1kSDK.values();
        this.copy = str;
        this.AFInAppEventType = aFd1kSDK.component1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r14 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r12, byte r13, java.lang.String r14, java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1cSDK.a(int, byte, java.lang.String, java.lang.Object[]):void");
    }

    private void copy() {
        getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i6, int i7, int i8) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        valueOf = (AFInAppEventParameterName + 95) % 128;
        ((AFf1eSDK) aFf1cSDK).toString.getRevenue("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        valueOf = (AFInAppEventParameterName + 9) % 128;
        return null;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        int i6 = AFInAppEventParameterName + 17;
        valueOf = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void component2(AFa1oSDK aFa1oSDK) {
        valueOf = (AFInAppEventParameterName + 9) % 128;
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            aFa1oSDK.getCurrencyIso4217Code("advertiserId", monetizationNetwork);
            valueOf = (AFInAppEventParameterName + 23) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK, com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        int i6 = (valueOf + 51) % 128;
        AFInAppEventParameterName = i6;
        valueOf = (i6 + 103) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        super.getCurrencyIso4217Code(aFa1oSDK);
        Context context = this.copydefault.AFAdRevenueData;
        AFb1rSDK revenue = AFb1rSDK.getRevenue();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (revenue.AFAdRevenueData()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1oSDK.getCurrencyIso4217Code("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1oSDK.getCurrencyIso4217Code("app_version_name", packageInfo.versionName);
            aFa1oSDK.getCurrencyIso4217Code("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1oSDK.getCurrencyIso4217Code("installDate", AFb1rSDK.getCurrencyIso4217Code(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFInAppEventType.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
        aFa1oSDK.getMonetizationNetwork().remove("ivc");
        String currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            aFa1oSDK.getCurrencyIso4217Code("appUserId", currencyIso4217Code);
            valueOf = (AFInAppEventParameterName + 97) % 128;
        }
        try {
            aFa1oSDK.getCurrencyIso4217Code("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 5, (byte) (51 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0001\u0002\b\u0005㘱", objArr);
            aFa1oSDK.getCurrencyIso4217Code(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false))) {
            aFa1oSDK.getCurrencyIso4217Code(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.amazon.a.a.o.b.af);
        }
        AFb1tSDK b_ = AFb1vSDK.b_(context.getContentResolver());
        if (b_ != null) {
            aFa1oSDK.getCurrencyIso4217Code("amazon_aid", b_.getRevenue);
            aFa1oSDK.getCurrencyIso4217Code("amazon_aid_limit", String.valueOf(b_.AFAdRevenueData));
        }
        AFg1wSDK aFg1wSDK = this.component1;
        aFa1oSDK.getCurrencyIso4217Code("devkey", (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK)));
        aFa1oSDK.getCurrencyIso4217Code("uid", AFb1iSDK.getCurrencyIso4217Code(this.copydefault, ((AFf1eSDK) this).toString));
        aFa1oSDK.getCurrencyIso4217Code("af_gcm_token", this.copy);
        aFa1oSDK.getCurrencyIso4217Code("launch_counter", Integer.toString(((AFf1eSDK) this).toString.getMediationNetwork("appsFlyerCount", 0)));
        aFa1oSDK.getCurrencyIso4217Code("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String component4 = this.hashCode.component4();
        if (component4 != null) {
            aFa1oSDK.getCurrencyIso4217Code(AppsFlyerProperties.CHANNEL, component4);
            valueOf = (AFInAppEventParameterName + 25) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        AFInAppEventParameterName = (valueOf + 5) % 128;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        valueOf = (AFInAppEventParameterName + 33) % 128;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        AFInAppEventParameterName = (valueOf + 49) % 128;
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
        if (responseNetwork == null || !responseNetwork.isSuccessful()) {
            return;
        }
        int i6 = AFInAppEventParameterName + 43;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
        } else {
            getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getRevenue(AFa1oSDK aFa1oSDK) {
        int i6 = valueOf + 97;
        AFInAppEventParameterName = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
    }
}
