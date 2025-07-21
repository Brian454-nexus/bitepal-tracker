package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1iSDK implements AFg1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 2115549242;
    private static int AFKeystoreWrapper = 1;
    private static int values;

    @NotNull
    private final AFi1oSDK AFAdRevenueData;

    @NotNull
    private final Lazy AFInAppEventType;

    @NotNull
    private final AFa1aSDK areAllFieldsValid;

    @NotNull
    private final AFd1rSDK component1;

    @NotNull
    private final AFi1qSDK component2;

    @NotNull
    private final AFd1qSDK component3;

    @NotNull
    private final AFh1oSDK component4;

    @NotNull
    private final AFd1nSDK copy;

    @NotNull
    private final AFg1rSDK copydefault;

    @NotNull
    private final AFd1tSDK equals;

    @NotNull
    private final AFj1oSDK getCurrencyIso4217Code;

    @NotNull
    private final AFd1vSDK getMediationNetwork;

    @NotNull
    private final Context getMonetizationNetwork;

    @NotNull
    private final String getRevenue;

    @NotNull
    private final Lazy hashCode;

    @NotNull
    private final AFg1wSDK toString;

    public AFg1iSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1oSDK aFi1oSDK, @NotNull AFd1vSDK aFd1vSDK, @NotNull AFj1oSDK aFj1oSDK, @NotNull AFa1aSDK aFa1aSDK, @NotNull AFh1oSDK aFh1oSDK, @NotNull AFd1rSDK aFd1rSDK, @NotNull AFd1qSDK aFd1qSDK, @NotNull AFi1qSDK aFi1qSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFd1nSDK aFd1nSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFd1tSDK aFd1tSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        Intrinsics.checkNotNullParameter(aFj1oSDK, "");
        Intrinsics.checkNotNullParameter(aFa1aSDK, "");
        Intrinsics.checkNotNullParameter(aFh1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        this.getRevenue = str;
        this.getMonetizationNetwork = context;
        this.AFAdRevenueData = aFi1oSDK;
        this.getMediationNetwork = aFd1vSDK;
        this.getCurrencyIso4217Code = aFj1oSDK;
        this.areAllFieldsValid = aFa1aSDK;
        this.component4 = aFh1oSDK;
        this.component1 = aFd1rSDK;
        this.component3 = aFd1qSDK;
        this.component2 = aFi1qSDK;
        this.toString = aFg1wSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFg1rSDK;
        this.equals = aFd1tSDK;
        this.hashCode = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1iSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1iSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        int i6 = AFKeystoreWrapper + 33;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.copydefault.getRevenue());
            int i7 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.copydefault.getRevenue());
        }
        values = (AFKeystoreWrapper + 67) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFInAppEventType(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            int r1 = java.lang.System.identityHashCode(r4)
            r2 = 1273246331(0x4be4327b, float:2.9910262E7)
            r3 = -1273246327(0xffffffffb41bcd89, float:-1.4510273E-7)
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r2, r3, r1)
            com.appsflyer.AppsFlyerProperties r0 = (com.appsflyer.AppsFlyerProperties) r0
            java.lang.String r1 = "sdkExtension"
            java.lang.String r0 = r0.getString(r1)
            r2 = 1
            if (r0 == 0) goto L3b
            int r3 = com.appsflyer.internal.AFg1iSDK.values
            int r3 = r3 + 73
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r3
            int r3 = r0.length()
            if (r3 != 0) goto L31
            goto L3b
        L31:
            int r3 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r3 = r3 + 63
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1iSDK.values = r3
            r3 = 0
            goto L3c
        L3b:
            r3 = r2
        L3c:
            r3 = r3 ^ r2
            if (r3 == r2) goto L40
            return
        L40:
            int r2 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r2 = r2 + 105
            int r2 = r2 % 128
            com.appsflyer.internal.AFg1iSDK.values = r2
            r5.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFInAppEventType(java.util.Map):void");
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        long j6;
        TimeUnit timeUnit;
        long j7;
        Intrinsics.checkNotNullParameter(map, "");
        long mediationNetwork = this.component1.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        this.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (mediationNetwork > 0) {
            int i6 = AFKeystoreWrapper + 69;
            values = i6 % 128;
            if (i6 % 2 != 0) {
                timeUnit = TimeUnit.MILLISECONDS;
                j7 = currentTimeMillis * mediationNetwork;
            } else {
                timeUnit = TimeUnit.MILLISECONDS;
                j7 = currentTimeMillis - mediationNetwork;
            }
            j6 = timeUnit.toSeconds(j7);
        } else {
            j6 = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j6));
        int i7 = values + 5;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 72 / 0;
        }
    }

    private static void AFLogger(@NotNull Map<String, Object> map) {
        values = (AFKeystoreWrapper + 7) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            values = (AFKeystoreWrapper + 73) % 128;
        } catch (Exception e6) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e6);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e7) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e7);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        } catch (Exception e8) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e8);
        }
    }

    private static void a(int i6, int i7, String str, boolean z6, int i8, Object[] objArr) {
        int i9 = ($11 + 121) % 128;
        $10 = i9;
        char[] cArr = str;
        if (str != null) {
            $11 = (i9 + 49) % 128;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr3 = new char[i6];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i10 = aFk1kSDK.getMediationNetwork;
            if (i10 >= i6) {
                break;
            }
            $10 = ($11 + 29) % 128;
            char c6 = cArr2[i10];
            aFk1kSDK.getCurrencyIso4217Code = c6;
            char c7 = (char) (c6 + i7);
            cArr3[i10] = c7;
            cArr3[i10] = (char) (c7 - ((int) (AFInAppEventParameterName ^ (-5894730465753384902L))));
            aFk1kSDK.getMediationNetwork = i10 + 1;
        }
        if (i8 > 0) {
            aFk1kSDK.getRevenue = i8;
            char[] cArr4 = new char[i6];
            System.arraycopy(cArr3, 0, cArr4, 0, i6);
            int i11 = aFk1kSDK.getRevenue;
            System.arraycopy(cArr4, 0, cArr3, i6 - i11, i11);
            int i12 = aFk1kSDK.getRevenue;
            System.arraycopy(cArr4, i12, cArr3, 0, i6 - i12);
        }
        if (z6) {
            char[] cArr5 = new char[i6];
            aFk1kSDK.getMediationNetwork = 0;
            while (true) {
                int i13 = aFk1kSDK.getMediationNetwork;
                if (i13 >= i6) {
                    break;
                }
                cArr5[i13] = cArr3[(i6 - i13) - 1];
                aFk1kSDK.getMediationNetwork = i13 + 1;
            }
            cArr3 = cArr5;
        }
        String str2 = new String(cArr3);
        int i14 = $10 + 1;
        $11 = i14 % 128;
        if (i14 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i15 = 70 / 0;
            objArr[0] = str2;
        }
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        int i6 = values + 41;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.component1.getMonetizationNetwork("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            values = (AFKeystoreWrapper + 83) % 128;
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used")));
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        if (aFa1oSDK.getRevenue()) {
            int i6 = values + 5;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                String str = aFa1oSDK.component2;
                AFd1tSDK aFd1tSDK = aFg1iSDK.equals;
                aFg1iSDK.getRevenue(aFa1oSDK, str, aFd1tSDK.getCurrencyIso4217Code, aFd1tSDK.getMonetizationNetwork);
            } else {
                String str2 = aFa1oSDK.component2;
                AFd1tSDK aFd1tSDK2 = aFg1iSDK.equals;
                aFg1iSDK.getRevenue(aFa1oSDK, str2, aFd1tSDK2.getCurrencyIso4217Code, aFd1tSDK2.getMonetizationNetwork);
                throw null;
            }
        } else if (!(aFa1oSDK instanceof AFh1gSDK)) {
            int i7 = AFKeystoreWrapper + 99;
            values = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                String str3 = aFa1oSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                aFg1iSDK.getMonetizationNetwork(monetizationNetwork, str3);
                int i8 = 36 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                String str4 = aFa1oSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                aFg1iSDK.getMonetizationNetwork(monetizationNetwork, str4);
            }
        }
        if (CollectionsKt.listOf(new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH, AFf1zSDK.INAPP}).contains(aFa1oSDK.getCurrencyIso4217Code())) {
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1iSDK.copy(monetizationNetwork);
        }
        if (aFa1oSDK.areAllFieldsValid()) {
            int i9 = AFKeystoreWrapper + 19;
            values = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                aFg1iSDK.component4(monetizationNetwork);
            } else {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                aFg1iSDK.component4(monetizationNetwork);
                throw null;
            }
        }
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        aFg1iSDK.force(monetizationNetwork);
        values(monetizationNetwork);
        aFg1iSDK.AFInAppEventParameterName(monetizationNetwork);
        aFg1iSDK.AFInAppEventType(monetizationNetwork);
        aFg1iSDK.registerClient(monetizationNetwork);
        aFg1iSDK.getRevenue(monetizationNetwork, aFa1oSDK.getRevenue());
        aFg1iSDK.unregisterClient(monetizationNetwork);
        aFg1iSDK.afInfoLog(monetizationNetwork);
        getRevenue(monetizationNetwork, aFa1oSDK);
        monetizationNetwork.put("af_events_api", "1");
        int i10 = AFKeystoreWrapper + 31;
        values = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i6 = values + 21;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFb1tSDK b_ = AFb1vSDK.b_(aFg1iSDK.getMonetizationNetwork.getContentResolver());
            if (b_ != null) {
                AFKeystoreWrapper = (values + 1) % 128;
                map.put("amazon_aid", b_.getRevenue);
                map.put("amazon_aid_limit", String.valueOf(b_.AFAdRevenueData));
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFb1vSDK.b_(aFg1iSDK.getMonetizationNetwork.getContentResolver());
        throw null;
    }

    private void component2(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1oSDK aFh1oSDK = this.component4;
        HashMap hashMap = new HashMap(aFh1oSDK.getMonetizationNetwork);
        aFh1oSDK.getMonetizationNetwork.clear();
        this.component4.AFAdRevenueData.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (!hashMap.isEmpty()) {
            int i6 = AFKeystoreWrapper;
            values = (i6 + 39) % 128;
            int i7 = i6 + 13;
            values = i7 % 128;
            if (i7 % 2 != 0) {
                Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(map);
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                currencyIso4217Code.put("gcd", hashMap);
                int i8 = 27 / 0;
                return;
            }
            Map<String, Object> currencyIso4217Code2 = AFb1rSDK.getCurrencyIso4217Code(map);
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
            currencyIso4217Code2.put("gcd", hashMap);
        }
    }

    private static long component3() {
        int i6 = AFKeystoreWrapper + 99;
        values = i6 % 128;
        long currentTimeMillis = i6 % 2 != 0 ? System.currentTimeMillis() + SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
        values = (AFKeystoreWrapper + 7) % 128;
        return currentTimeMillis;
    }

    private void component4(@NotNull Map<String, Object> map) {
        values = (AFKeystoreWrapper + 63) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1wSDK.AFAdRevenueData(map, this.component3);
        AFKeystoreWrapper = (values + 79) % 128;
    }

    private void copy(@NotNull Map<String, Object> map) {
        values = (AFKeystoreWrapper + 29) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        AFKeystoreWrapper = (values + 87) % 128;
    }

    @SuppressLint({"HardwareIds"})
    private final String copydefault() {
        values = (AFKeystoreWrapper + 3) % 128;
        String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                values = (AFKeystoreWrapper + 79) % 128;
                return string;
            }
        } catch (Exception e6) {
            AFLogger.afErrorLog(e6.getMessage(), e6);
        }
        if (monetizationNetwork == null) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + monetizationNetwork);
        return monetizationNetwork;
    }

    private void d(@NotNull Map<String, Object> map) {
        boolean z6;
        Intrinsics.checkNotNullParameter(map, "");
        String component4 = this.component3.component4();
        String str = (String) getCurrencyIso4217Code(new Object[]{this.component1, component4}, -1548056329, 1548056332, (int) System.currentTimeMillis());
        boolean z7 = false;
        if (str == null || Intrinsics.areEqual(str, component4)) {
            AFKeystoreWrapper = (values + 5) % 128;
            z6 = false;
        } else {
            z6 = true;
        }
        if (str == null) {
            values = (AFKeystoreWrapper + 3) % 128;
            if (component4 != null) {
                z7 = true;
            }
        }
        if (z6 || z7) {
            map.put("af_latestchannel", component4);
        }
        String component42 = component4();
        if (component42 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = component42.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String equals = equals();
        if (equals != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = equals.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String str2 = (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
        if (str2 != null) {
            int i6 = values + 69;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                String lowerCase3 = str2.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                map.put("af_currentstore", lowerCase3);
                return;
            }
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            String lowerCase4 = str2.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
            throw null;
        }
    }

    private void e(@NotNull Map<String, Object> map) {
        int i6 = values + 7;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork)));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork)));
            int i7 = 24 / 0;
        }
    }

    @Nullable
    private String equals() {
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString("preInstallName");
        if (string != null) {
            int i6 = AFKeystoreWrapper + 39;
            values = i6 % 128;
            if (i6 % 2 == 0) {
                return string;
            }
            throw null;
        }
        if (this.component1.getMonetizationNetwork("preInstallName")) {
            int i7 = AFKeystoreWrapper + 13;
            values = i7 % 128;
            if (i7 % 2 != 0) {
                string = this.component1.getMonetizationNetwork("preInstallName", (String) null);
                int i8 = 31 / 0;
            } else {
                string = this.component1.getMonetizationNetwork("preInstallName", (String) null);
            }
        } else {
            if (component2()) {
                int i9 = AFKeystoreWrapper + 19;
                values = i9 % 128;
                if (i9 % 2 == 0) {
                    string = AFInAppEventType();
                    if (string == null) {
                        string = getMediationNetwork("AF_PRE_INSTALL_NAME");
                    }
                } else {
                    AFInAppEventType();
                    throw null;
                }
            }
            if (string != null) {
                int i10 = AFKeystoreWrapper + 59;
                values = i10 % 128;
                if (i10 % 2 == 0) {
                    this.component1.AFAdRevenueData("preInstallName", string);
                } else {
                    this.component1.AFAdRevenueData("preInstallName", string);
                    throw null;
                }
            }
        }
        if (string != null) {
            ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).set("preInstallName", string);
        }
        return string;
    }

    private void force(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFg1wSDK aFg1wSDK = this.toString;
        String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        if (str != null) {
            AFKeystoreWrapper = (values + 91) % 128;
            if (str.length() == 0) {
                return;
            }
            AFKeystoreWrapper = (values + 15) % 128;
            map.put("appsflyerKey", str);
            values = (AFKeystoreWrapper + 5) % 128;
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i6, int i7, int i8) {
        int i9 = ~i6;
        int i10 = (i6 * (-716)) + (i7 * 1435) + ((i7 | i9) * (-1434));
        int i11 = ~i8;
        int i12 = ~(i11 | i7);
        int i13 = ~(i6 | i7);
        int i14 = i9 | (~i7);
        switch (i10 + ((i12 | i13 | (~(i14 | i8))) * 717) + ((i13 | (~(i14 | i11)) | (~(i7 | i8))) * 717)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getMonetizationNetwork(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return areAllFieldsValid(objArr);
            case 6:
                return component2(objArr);
            case 7:
                return component3(objArr);
            case 8:
                return component4(objArr);
            case 9:
                AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
                AFKeystoreWrapper = (values + 7) % 128;
                String e_ = AFb1qSDK.e_(aFg1iSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1iSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
                values = (AFKeystoreWrapper + 51) % 128;
                return e_;
            case 10:
                return component1(objArr);
            case 11:
                return equals(objArr);
            case 12:
                AFg1iSDK aFg1iSDK2 = (AFg1iSDK) objArr[0];
                AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
                AFKeystoreWrapper = (values + 43) % 128;
                Intrinsics.checkNotNullParameter(aFa1oSDK, "");
                Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                aFg1iSDK2.getMonetizationNetwork(monetizationNetwork, aFa1oSDK.getRevenue());
                hashCode(monetizationNetwork);
                AFLogger(monetizationNetwork);
                aFg1iSDK2.getCurrencyIso4217Code(monetizationNetwork);
                aFg1iSDK2.AFAdRevenueData(monetizationNetwork, aFg1iSDK2.equals.getRevenue);
                getCurrencyIso4217Code(new Object[]{aFg1iSDK2, monetizationNetwork}, -1748783943, 1748783953, System.identityHashCode(aFg1iSDK2));
                monetizationNetwork.put("cell", MapsKt.mapOf(new Pair[]{TuplesKt.to("mcc", Integer.valueOf(aFg1iSDK2.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(aFg1iSDK2.getMonetizationNetwork.getResources().getConfiguration().mnc))}));
                monetizationNetwork.put("sig", (String) getCurrencyIso4217Code(new Object[]{aFg1iSDK2}, 76539304, -76539295, System.identityHashCode(aFg1iSDK2)));
                monetizationNetwork.put("last_boot_time", Long.valueOf(component3()));
                monetizationNetwork.put("disk", areAllFieldsValid());
                values = (AFKeystoreWrapper + 87) % 128;
                return null;
            default:
                return getRevenue(objArr);
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i6 = values + 7;
        AFKeystoreWrapper = i6 % 128;
        int i7 = i6 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1iSDK.hashCode.getValue();
        if (i7 == 0) {
            int i8 = 88 / 0;
        }
        AFKeystoreWrapper = (values + 87) % 128;
        return appsFlyerProperties;
    }

    private final void getRevenue(Map<String, Object> map) {
        try {
            long j6 = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j6)));
            int i6 = AFKeystoreWrapper + 27;
            values = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } catch (Exception e6) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e6);
        }
    }

    private static void hashCode(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (values + 93) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 5, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 103, "\ufffb\u000b\ufffa\u0007�", false, 5 - TextUtils.indexOf("", "", 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i6 = values + 27;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1748783943, 1748783953, System.identityHashCode(this));
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (values + 37) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(this.copy, this.component1);
            if (currencyIso4217Code != null) {
                map.put("uid", currencyIso4217Code);
                values = (AFKeystoreWrapper + 75) % 128;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            String obj = sb.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th);
        }
    }

    private final void toString(Map<String, Object> map) {
        values = (AFKeystoreWrapper + 65) % 128;
        if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork).getCurrencyIso4217Code));
        }
        int i6 = values + 11;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        int i6 = values + 115;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1jSDK.getRevenue(this.component1)));
        int i7 = values + 27;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 48 / 0;
        }
    }

    private void v(@NotNull Map<String, Object> map) {
        int i6 = values + 107;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        String str = null;
        try {
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            str = this.component3.AFAdRevenueData(this.getMonetizationNetwork);
        } catch (PackageManager.NameNotFoundException e6) {
            AFLogger.INSTANCE.e(AFh1vSDK.ATTRIBUTION, "Exception while collecting facebook's attribution ID. com.facebook.katana not found", e6, false, false, true, false);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.ATTRIBUTION, "Exception while collecting facebook's attribution ID. ", th, false, false, true, false);
        }
        if (str != null) {
            map.put("fb", str);
            values = (AFKeystoreWrapper + 105) % 128;
        }
    }

    private void valueOf(@NotNull Map<String, Object> map) {
        long j6;
        int i6 = AFKeystoreWrapper + 9;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j6 = this.component4.equals;
            if (j6 == 0) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j6 = this.component4.equals;
            if (j6 == 0) {
                return;
            }
        }
        map.put("prev_session_dur", Long.valueOf(j6));
        values = (AFKeystoreWrapper + 99) % 128;
    }

    private static void values(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object currencyIso4217Code = AFc1rSDK.getCurrencyIso4217Code();
        String monetizationNetwork = AFc1rSDK.getMonetizationNetwork();
        if (currencyIso4217Code != null) {
            int i6 = AFKeystoreWrapper + 77;
            values = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (monetizationNetwork != null && Integer.parseInt(monetizationNetwork) > 0) {
                int i7 = values + 99;
                AFKeystoreWrapper = i7 % 128;
                if (i7 % 2 == 0) {
                    map.put("reinstallCounter", monetizationNetwork);
                    map.put("originalAppsflyerId", currencyIso4217Code);
                    throw null;
                }
                map.put("reinstallCounter", monetizationNetwork);
                map.put("originalAppsflyerId", currencyIso4217Code);
            }
        }
        int i8 = AFKeystoreWrapper + 63;
        values = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static PackageInfo w_(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
            AFKeystoreWrapper = (values + 47) % 128;
            return packageInfo2;
        }
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(str, of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "");
        int i6 = AFKeystoreWrapper + 5;
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return packageInfo;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void AFAdRevenueData(@NotNull AFa1oSDK aFa1oSDK) {
        AFe1nSDK aFe1nSDK;
        values = (AFKeystoreWrapper + 85) % 128;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        if (!this.component3.component1()) {
            Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            currencyIso4217Code.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AdvertisingIdData advertisingIdData = this.component3.AFAdRevenueData.component4;
            if (advertisingIdData == null) {
                AFKeystoreWrapper = (values + 9) % 128;
                return;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                aFa1oSDK.getCurrencyIso4217Code("gaidError", advertisingIdData.gaidError);
                values = (AFKeystoreWrapper + 103) % 128;
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null && advertisingIdData.isEnabled != null) {
                aFa1oSDK.getCurrencyIso4217Code("advertiserId", str2);
                aFa1oSDK.getCurrencyIso4217Code("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                aFa1oSDK.getCurrencyIso4217Code("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
                AFKeystoreWrapper = (values + 31) % 128;
            }
        }
        AdvertisingIdData advertisingIdData2 = this.component3.AFAdRevenueData.component4;
        boolean z6 = false;
        if (advertisingIdData2 != null) {
            int i6 = values + 49;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 96 / 0;
                z6 = Intrinsics.areEqual(advertisingIdData2.retry, Boolean.TRUE);
            } else {
                z6 = Intrinsics.areEqual(advertisingIdData2.retry, Boolean.TRUE);
            }
        }
        aFa1oSDK.getCurrencyIso4217Code("GAID_retry", String.valueOf(z6));
        if (!CollectionsKt.listOf(new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH}).contains(aFa1oSDK.getCurrencyIso4217Code()) || (aFe1nSDK = this.equals.component3) == null) {
            return;
        }
        Map<String, Object> currencyIso4217Code2 = AFb1rSDK.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
        currencyIso4217Code2.put("fetchAdIdLatency", Long.valueOf(aFe1nSDK.getRevenue));
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (values + 81) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        getRevenue(map);
        getCurrencyIso4217Code(new Object[]{this, map}, -1208384822, 1208384822, System.identityHashCode(this));
        d(map);
        e(map);
        v(map);
        values = (AFKeystoreWrapper + 79) % 128;
    }

    private void component3(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i6 = values + 47;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                map.put("onelink_id", string);
            } else {
                map.put("onelink_id", string);
                throw null;
            }
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
            AFKeystoreWrapper = (values + 9) % 128;
        }
    }

    private final SimpleDateFormat getMediationNetwork() {
        int i6 = values + 21;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFInAppEventType.getValue();
        int i7 = values + 9;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 20 / 0;
        }
        return simpleDateFormat;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        Object obj;
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            values = (AFKeystoreWrapper + 21) % 128;
            map.put(AppsFlyerProperties.APP_ID, string);
            AFKeystoreWrapper = (values + 41) % 128;
        }
        String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            AFKeystoreWrapper = (values + 71) % 128;
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String obj2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                AFLogger.afWarnLog(obj2);
            }
            map.put(com.amazon.a.a.o.b.f11197a, string2);
        }
        Object string3 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        Object string4 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        Object string5 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
            AFKeystoreWrapper = (values + 79) % 128;
        }
        Object string6 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFc1cSDK aFc1cSDK = this.equals.getMediationNetwork;
        if (aFc1cSDK == null || (obj = aFc1cSDK.getCurrencyIso4217Code) == null) {
            return;
        }
        AFKeystoreWrapper = (values + 75) % 128;
        map.put("sharing_filter", obj);
    }

    @Nullable
    private String component4() {
        int i6 = values + 51;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            this.component1.getMonetizationNetwork("INSTALL_STORE");
            throw null;
        }
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            return this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        }
        String str = !component2() ? null : (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
        this.component1.AFAdRevenueData("INSTALL_STORE", str);
        int i7 = values + 117;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r0 = com.appsflyer.internal.AFg1iSDK.values + 73;
        com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        r0 = (java.io.File) getCurrencyIso4217Code(new java.lang.Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) java.lang.System.currentTimeMillis());
        r1 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r0 = (java.io.File) getCurrencyIso4217Code(new java.lang.Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (getCurrencyIso4217Code(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (getCurrencyIso4217Code(r0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String AFInAppEventType() {
        /*
            r7 = this;
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            java.lang.String r1 = "ro.appsflyer.preinstall.path"
            r2 = -1393711457(0xffffffffaceda69f, float:-6.754444E-12)
            r3 = 1393711468(0x5312596c, float:6.2856548E11)
            if (r0 != 0) goto L32
            java.lang.String r0 = AFAdRevenueData(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            long r4 = java.lang.System.currentTimeMillis()
            int r1 = (int) r4
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
            boolean r1 = getCurrencyIso4217Code(r0)
            r4 = 91
            int r4 = r4 / 0
            if (r1 == 0) goto L83
            goto L4b
        L32:
            java.lang.String r0 = AFAdRevenueData(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            long r4 = java.lang.System.currentTimeMillis()
            int r1 = (int) r4
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
            boolean r1 = getCurrencyIso4217Code(r0)
            if (r1 == 0) goto L83
        L4b:
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            java.lang.String r1 = "AF_PRE_INSTALL_PATH"
            if (r0 != 0) goto L70
            java.lang.String r0 = r7.getMediationNetwork(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            long r4 = java.lang.System.currentTimeMillis()
            int r1 = (int) r4
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
            r1 = 6
            int r1 = r1 / 0
            goto L83
        L70:
            java.lang.String r0 = r7.getMediationNetwork(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            long r4 = java.lang.System.currentTimeMillis()
            int r1 = (int) r4
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
        L83:
            boolean r1 = getCurrencyIso4217Code(r0)
            r4 = 0
            if (r1 != 0) goto L8b
            goto La8
        L8b:
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            java.lang.String r1 = "/data/local/tmp/pre_install.appsflyer"
            if (r0 == 0) goto Le8
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = (int) r5
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
        La8:
            boolean r1 = getCurrencyIso4217Code(r0)
            if (r1 != 0) goto Laf
            goto Lc0
        Laf:
            java.lang.String r0 = "/etc/pre_install.appsflyer"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = (int) r5
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
        Lc0:
            boolean r1 = getCurrencyIso4217Code(r0)
            if (r1 == 0) goto Lc7
            return r4
        Lc7:
            android.content.Context r1 = r7.getMonetizationNetwork
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            long r1 = java.lang.System.currentTimeMillis()
            int r1 = (int) r1
            r2 = 2000545293(0x773de60d, float:3.851602E33)
            r3 = -2000545286(0xffffffff88c219fa, float:-1.1682057E-33)
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r2, r3, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Le8:
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = (int) r5
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r3, r2, r1)
            java.io.File r0 = (java.io.File) r0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFInAppEventType():java.lang.String");
    }

    private final void copydefault(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i6 = AFKeystoreWrapper + 25;
        values = i6 % 128;
        if (i6 % 2 != 0 && Build.VERSION.SDK_INT < 125) {
            Object systemService = this.getMonetizationNetwork.getSystemService("uimode");
            uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        } else {
            uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i7 = AFKeystoreWrapper + 79;
        values = i7 % 128;
        if (i7 % 2 == 0) {
            map.put("tv", Boolean.TRUE);
        } else {
            map.put("tv", Boolean.TRUE);
            throw null;
        }
    }

    private final boolean AFKeystoreWrapper() {
        values = (AFKeystoreWrapper + 73) % 128;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        AFKeystoreWrapper = (values + 125) % 128;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1rSDK.getRevenue();
        if (!AFb1rSDK.getRevenue(this.getMonetizationNetwork)) {
            return true;
        }
        int i6 = values + 13;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private boolean copy() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, -156743048, 156743056, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Reader] */
    private static /* synthetic */ Object component3(Object[] objArr) {
        ?? properties;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        ?? r22 = (values + 69) % 128;
        AFKeystoreWrapper = r22;
        try {
            try {
                if (file == null) {
                    int i6 = r22 + 97;
                    values = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 61 / 0;
                    }
                    return null;
                }
                try {
                    properties = new Properties();
                    r22 = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                } catch (FileNotFoundException unused) {
                    r22 = 0;
                } catch (Throwable th) {
                    th = th;
                    r22 = 0;
                }
                try {
                    properties.load(r22);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        r22.close();
                        return property;
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(th2.getMessage(), th2);
                        return property;
                    }
                } catch (FileNotFoundException unused2) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    if (r22 != 0) {
                        r22.close();
                        r22 = r22;
                        return null;
                    }
                    values = (AFKeystoreWrapper + 15) % 128;
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (r22 != 0) {
                        r22.close();
                        r22 = r22;
                    }
                    return null;
                }
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (r22 != 0) {
                try {
                    r22.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        if (r4.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:
    
        r0.putAll(r4.getCurrencyIso4217Code.getCurrencyIso4217Code());
        com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFg1iSDK.values + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        if (r4.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getMonetizationNetwork(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "ro.product.cpu.abi"
            java.lang.String r1 = AFAdRevenueData(r1)
            java.lang.String r2 = "cpu_abi"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.product.cpu.abi2"
            java.lang.String r1 = AFAdRevenueData(r1)
            java.lang.String r2 = "cpu_abi2"
            r0.put(r2, r1)
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = AFAdRevenueData(r1)
            java.lang.String r2 = "arch"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.build.display.id"
            java.lang.String r1 = AFAdRevenueData(r1)
            java.lang.String r2 = "build_display_id"
            r0.put(r2, r1)
            r1 = 1
            if (r6 == r1) goto L3a
            goto L76
        L3a:
            int r6 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r6 = r6 + 103
            int r1 = r6 % 128
            com.appsflyer.internal.AFg1iSDK.values = r1
            r1 = 2
            int r6 = r6 % r1
            r2 = 0
            java.lang.String r3 = "appsFlyerCount"
            if (r6 == 0) goto L58
            r4.areAllFieldsValid(r0)
            com.appsflyer.internal.AFd1qSDK r6 = r4.component3
            com.appsflyer.internal.AFd1rSDK r6 = r6.getRevenue
            int r6 = r6.getMediationNetwork(r3, r2)
            r1 = 3
            if (r6 > r1) goto L76
            goto L65
        L58:
            r4.areAllFieldsValid(r0)
            com.appsflyer.internal.AFd1qSDK r6 = r4.component3
            com.appsflyer.internal.AFd1rSDK r6 = r6.getRevenue
            int r6 = r6.getMediationNetwork(r3, r2)
            if (r6 > r1) goto L76
        L65:
            com.appsflyer.internal.AFj1oSDK r6 = r4.getCurrencyIso4217Code
            java.util.Map r6 = r6.getCurrencyIso4217Code()
            r0.putAll(r6)
            int r6 = com.appsflyer.internal.AFg1iSDK.values
            int r6 = r6 + 103
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r6
        L76:
            com.appsflyer.internal.AFa1aSDK r6 = r4.areAllFieldsValid
            android.content.Context r1 = r4.getMonetizationNetwork
            java.util.Map r6 = r6.getCurrencyIso4217Code(r1)
            java.lang.String r1 = "dim"
            r0.put(r1, r6)
            java.lang.String r6 = "deviceData"
            r5.put(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.getMonetizationNetwork(java.util.Map, boolean):void");
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        values = (AFKeystoreWrapper + 111) % 128;
        try {
            PackageInfo packageInfo = aFg1iSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(aFg1iSDK.getMonetizationNetwork.getPackageName(), 0);
            int mediationNetwork = aFg1iSDK.component1.getMediationNetwork("versionCode", 0);
            int i6 = packageInfo.versionCode;
            if (i6 > mediationNetwork) {
                AFKeystoreWrapper = (values + 93) % 128;
                aFg1iSDK.component1.AFAdRevenueData("versionCode", i6);
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = aFg1iSDK.component3.getMonetizationNetwork.AFAdRevenueData;
            map.put("app_version_name", AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(aFg1iSDK.component3.getMonetizationNetwork.AFAdRevenueData.getApplicationInfo().targetSdkVersion));
            long j6 = packageInfo.firstInstallTime;
            long j7 = packageInfo.lastUpdateTime;
            map.put("date1", aFg1iSDK.getMediationNetwork().format(new Date(j6)));
            map.put("date2", aFg1iSDK.getMediationNetwork().format(new Date(j7)));
            Object[] objArr2 = new Object[1];
            a(View.getDefaultSize(0, 0) + 15, 102 - ((Process.getThreadPriority(0) + 20) >> 6), "￦\ufffb\u000f\b�\u0002\uffde\ufffb\u000e\uffff\u0000\u0003\f\r\u000e", false, 10 - (Process.myTid() >> 22), objArr2);
            String intern = ((String) objArr2[0]).intern();
            SimpleDateFormat mediationNetwork2 = aFg1iSDK.getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            map.put(intern, aFg1iSDK.getCurrencyIso4217Code(mediationNetwork2));
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
            return null;
        }
    }

    @Nullable
    private String component1() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i6 = AFKeystoreWrapper + 97;
        values = i6 % 128;
        int i7 = i6 % 2;
        boolean parseBoolean = Boolean.parseBoolean(aFg1iSDK.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        if (i7 != 0) {
            int i8 = 31 / 0;
        }
        return Boolean.valueOf(parseBoolean);
    }

    private final void component1(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1208384822, 1208384822, System.identityHashCode(this));
    }

    private boolean component2() {
        AFKeystoreWrapper = (values + 51) % 128;
        if (this.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 1) {
            AFKeystoreWrapper = (values + 27) % 128;
            return true;
        }
        AFKeystoreWrapper = (values + 85) % 128;
        return false;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        Map map = (Map) objArr[0];
        String str = (String) objArr[1];
        values = (AFKeystoreWrapper + 65) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (str == null) {
            return null;
        }
        int i6 = values + 15;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            map.put("phone", str);
            int i7 = 0 / 0;
        } else {
            map.put("phone", str);
        }
        values = (AFKeystoreWrapper + 49) % 128;
        return null;
    }

    private final void equals(Map<String, Object> map) {
        int i6 = values + 101;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 82 / 0;
            if (!AFh1zSDK.getRevenue(this.getMonetizationNetwork)) {
                return;
            }
        } else if (!AFh1zSDK.getRevenue(this.getMonetizationNetwork)) {
            return;
        }
        map.put("inst_app", Boolean.TRUE);
        AFKeystoreWrapper = (values + 101) % 128;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        String str = (String) objArr[0];
        if (str == null) {
            return null;
        }
        values = (AFKeystoreWrapper + 123) % 128;
        try {
            if (StringsKt.trim(str).toString().length() <= 0) {
                return null;
            }
            AFKeystoreWrapper = (values + 89) % 128;
            return new File(StringsKt.trim(str).toString());
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final long getCurrencyIso4217Code() {
        int i6 = values + 87;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 != 0) {
            return System.currentTimeMillis();
        }
        System.currentTimeMillis();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        AFi1pSDK aFi1pSDK;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1rSDK aFi1rSDK = this.component2.getMediationNetwork;
        if (aFi1rSDK != null) {
            int i6 = values + 115;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 == 0) {
                aFi1pSDK = aFi1rSDK.getMonetizationNetwork();
                int i7 = 62 / 0;
            } else {
                aFi1pSDK = aFi1rSDK.getMonetizationNetwork();
            }
        } else {
            aFi1pSDK = null;
        }
        if (aFi1pSDK != null) {
            int i8 = values + 105;
            AFKeystoreWrapper = i8 % 128;
            if (i8 % 2 == 0) {
                map.put("network", aFi1pSDK.AFAdRevenueData);
                map.put("ivc", Boolean.valueOf(aFi1pSDK.getMediationNetwork()));
                if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                    return;
                }
            } else {
                map.put("network", aFi1pSDK.AFAdRevenueData);
                map.put("ivc", Boolean.valueOf(aFi1pSDK.getMediationNetwork()));
                if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                    return;
                }
            }
            String str = aFi1pSDK.getCurrencyIso4217Code;
            if (str != null) {
                map.put("operator", str);
            } else {
                values = (AFKeystoreWrapper + 97) % 128;
            }
            String str2 = aFi1pSDK.getMediationNetwork;
            if (str2 != null) {
                map.put("carrier", str2);
                return;
            }
            return;
        }
        int i9 = values + 25;
        AFKeystoreWrapper = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 98 / 0;
        }
    }

    private void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull String str) {
        AFKeystoreWrapper = (values + 91) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMediationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            this.component1.AFAdRevenueData("prev_event_name", str);
            this.component1.getMonetizationNetwork("prev_event_timestamp", System.currentTimeMillis());
            int i6 = values + 33;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 16 / 0;
            }
        } catch (Exception e6) {
            AFLogger.afErrorLog("Error while processing previous event.", e6);
        }
    }

    private final String getMediationNetwork(String str) {
        String revenue;
        int i6 = values + 25;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            revenue = this.component3.getRevenue(str);
            int i7 = 50 / 0;
        } else {
            revenue = this.component3.getRevenue(str);
        }
        int i8 = AFKeystoreWrapper + 79;
        values = i8 % 128;
        if (i8 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private static String getMediationNetwork(AFd1rSDK aFd1rSDK, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{aFd1rSDK, str}, -1548056329, 1548056332, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMediationNetwork(@NotNull AFa1oSDK aFa1oSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, 1541874918, -1541874906, System.identityHashCode(this));
    }

    private void getRevenue(@NotNull Map<String, Object> map, boolean z6) {
        int i6 = AFKeystoreWrapper + 103;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.getRevenue);
            int i7 = 35 / 0;
            if (!z6) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.getRevenue);
            if (!z6) {
                return;
            }
        }
        int i8 = AFKeystoreWrapper + 59;
        values = i8 % 128;
        if (i8 % 2 == 0) {
            map.put("platform_extension_v2", this.AFAdRevenueData.getMediationNetwork());
        } else {
            map.put("platform_extension_v2", this.AFAdRevenueData.getMediationNetwork());
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    @Nullable
    public final Long AFAdRevenueData() {
        Context context = this.copy.AFAdRevenueData;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                PackageInfo w_ = w_(packageManager, packageName);
                if (w_ != null) {
                    int i6 = AFKeystoreWrapper + 17;
                    values = i6 % 128;
                    if (i6 % 2 == 0) {
                        return Long.valueOf(w_.firstInstallTime);
                    }
                    long j6 = w_.firstInstallTime;
                    throw null;
                }
            }
            return null;
        }
        AFKeystoreWrapper = (values + 27) % 128;
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1rSDK aFd1rSDK = (AFd1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i6 = AFKeystoreWrapper + 79;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            int i7 = 56 / 0;
            if (monetizationNetwork != null) {
                return monetizationNetwork;
            }
        } else {
            String monetizationNetwork2 = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            if (monetizationNetwork2 != null) {
                return monetizationNetwork2;
            }
        }
        aFd1rSDK.AFAdRevenueData("CACHED_CHANNEL", str);
        values = (AFKeystoreWrapper + 31) % 128;
        return str;
    }

    @NotNull
    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i6 = AFKeystoreWrapper + 107;
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void getRevenue(@NotNull AFa1oSDK aFa1oSDK, @Nullable String str, @Nullable String str2, @Nullable AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        if (aFa1oSDK.getCurrencyIso4217Code() == AFf1zSDK.CONVERSION) {
            int i6 = AFKeystoreWrapper + 53;
            values = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                toString(monetizationNetwork);
                copydefault(monetizationNetwork);
                equals(monetizationNetwork);
                AFc1rSDK.getMonetizationNetwork(this.copy, this.component1);
                int i7 = 72 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                toString(monetizationNetwork);
                copydefault(monetizationNetwork);
                equals(monetizationNetwork);
                AFc1rSDK.getMonetizationNetwork(this.copy, this.component1);
            }
        }
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        AFKeystoreWrapper(monetizationNetwork);
        component3(monetizationNetwork);
        component2((Map<String, ? extends Object>) monetizationNetwork);
        getCurrencyIso4217Code(new Object[]{monetizationNetwork, str2}, -830168679, 830168685, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(new Object[]{this, monetizationNetwork, str}, 86217130, -86217129, System.identityHashCode(this));
        valueOf(monetizationNetwork);
        if (aFc1aSDK == null) {
            int i8 = AFKeystoreWrapper + 97;
            values = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i9 = values + 75;
        AFKeystoreWrapper = i9 % 128;
        if (i9 % 2 != 0) {
            aFc1aSDK.getRevenue(monetizationNetwork);
        } else {
            aFc1aSDK.getRevenue(monetizationNetwork);
            throw null;
        }
    }

    @Nullable
    private String getMonetizationNetwork() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 76539304, -76539295, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r0 = kotlin.Result.Companion;
        r11 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r11.get("af_deeplink") != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r11.get("af_deeplink") != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r1 = kotlin.Result.Companion;
        r1 = new org.json.JSONObject(r0);
        r1.put("isPush", com.amazon.a.a.o.b.af);
        r11.put("af_deeplink", r1.toString());
        r11 = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
     */
    @Override // com.appsflyer.internal.AFg1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFAdRevenueData(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.appsflyer.internal.AFd1tSDK r0 = r10.equals
            java.lang.String r0 = r0.AFAdRevenueData
            if (r0 == 0) goto L79
            int r1 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1iSDK.values = r2
            int r1 = r1 % 2
            java.lang.String r2 = "af_deeplink"
            if (r1 == 0) goto L24
            java.lang.Object r1 = r11.get(r2)
            r3 = 85
            int r3 = r3 / 0
            if (r1 == 0) goto L30
            goto L2a
        L24:
            java.lang.Object r1 = r11.get(r2)
            if (r1 == 0) goto L30
        L2a:
            java.lang.String r11 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.afDebugLog(r11)
            goto L79
        L30:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L4c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "isPush"
            java.lang.String r3 = "true"
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            r11.put(r2, r0)     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r11 = kotlin.Result.constructor-impl(r11)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r0 = move-exception
            r11 = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.constructor-impl(r11)
        L58:
            java.lang.Throwable r3 = kotlin.Result.exceptionOrNull-impl(r11)
            if (r3 == 0) goto L6e
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r1 = com.appsflyer.internal.AFh1vSDK.GENERAL
            r8 = 120(0x78, float:1.68E-43)
            r9 = 0
            java.lang.String r2 = "Exception while trying to create JSONObject from pushPayload"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.appsflyer.internal.AFh1uSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L6e:
            kotlin.Result.box-impl(r11)
            int r11 = com.appsflyer.internal.AFg1iSDK.values
            int r11 = r11 + 117
            int r11 = r11 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r11
        L79:
            com.appsflyer.internal.AFd1tSDK r11 = r10.equals
            r0 = 0
            r11.AFAdRevenueData = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFAdRevenueData(java.util.Map):void");
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i6, int i7) {
        int i8 = values + 7;
        AFKeystoreWrapper = i8 % 128;
        if (i8 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i6));
            map.put("iaecounter", String.valueOf(i7));
            map.put("isFirstCall", String.valueOf(!copy()));
            int i9 = values + 17;
            AFKeystoreWrapper = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i6));
        map.put("iaecounter", String.valueOf(i7));
        copy();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        r4.put("btch", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void areAllFieldsValid(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.values = r1
            int r0 = r0 % 2
            java.lang.String r1 = "btl"
            if (r0 == 0) goto L28
            com.appsflyer.internal.AFd1vSDK r0 = r3.getMediationNetwork
            android.content.Context r2 = r3.getMonetizationNetwork
            com.appsflyer.internal.AFd1vSDK$AFa1zSDK r0 = r0.AFAdRevenueData(r2)
            float r2 = r0.getCurrencyIso4217Code
            java.lang.String r0 = r0.AFAdRevenueData
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.put(r1, r2)
            r1 = 80
            int r1 = r1 / 0
            if (r0 == 0) goto L42
            goto L3d
        L28:
            com.appsflyer.internal.AFd1vSDK r0 = r3.getMediationNetwork
            android.content.Context r2 = r3.getMonetizationNetwork
            com.appsflyer.internal.AFd1vSDK$AFa1zSDK r0 = r0.AFAdRevenueData(r2)
            float r2 = r0.getCurrencyIso4217Code
            java.lang.String r0 = r0.AFAdRevenueData
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.put(r1, r2)
            if (r0 == 0) goto L42
        L3d:
            java.lang.String r1 = "btch"
            r4.put(r1, r0)
        L42:
            int r4 = com.appsflyer.internal.AFg1iSDK.values
            int r4 = r4 + 5
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.areAllFieldsValid(java.util.Map):void");
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMonetizationNetwork(@NotNull AFa1oSDK aFa1oSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, -1645166160, 1645166165, System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // com.appsflyer.internal.AFg1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getCurrencyIso4217Code(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFa1oSDK r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map r1 = r5.getMonetizationNetwork()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r0 = "open_referrer"
            java.lang.String r2 = r5.AFAdRevenueData
            r1.put(r0, r2)
            java.lang.String r0 = r5.component3
            r2 = 1
            if (r0 == 0) goto L29
            int r3 = com.appsflyer.internal.AFg1iSDK.values
            int r3 = r3 + 25
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r3
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == r2) goto L3b
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 109
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0
            java.lang.String r0 = "af_web_referrer"
            java.lang.String r5 = r5.component3
            r1.put(r0, r5)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFa1oSDK):void");
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, @Nullable String str) {
        values = (AFKeystoreWrapper + 91) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        boolean z6 = false;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i6 = AFKeystoreWrapper + 29;
            values = i6 % 128;
            if (i6 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.amazon.a.a.o.b.af);
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.amazon.a.a.o.b.af);
                int i7 = 7 / 0;
                return;
            }
        }
        String revenue = this.toString.getRevenue(this.component1);
        if (revenue == null || revenue.length() == 0) {
            values = (AFKeystoreWrapper + 93) % 128;
            z6 = true;
        }
        if (!z6) {
            map.put("imei", revenue);
        }
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            AFKeystoreWrapper = (values + 5) % 128;
            this.component1.AFAdRevenueData("androidIdCached", currencyIso4217Code);
            map.put("android_id", currencyIso4217Code);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
            values = (AFKeystoreWrapper + 31) % 128;
        }
        AFb1tSDK currencyIso4217Code2 = AFb1vSDK.getCurrencyIso4217Code(this.getMonetizationNetwork);
        if (currencyIso4217Code2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code2.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = currencyIso4217Code2.getRevenue;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = currencyIso4217Code2.AFAdRevenueData;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    private static void getRevenue(@NotNull Map<String, Object> map, @NotNull AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        String str = aFa1oSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1oSDK.getCurrencyIso4217Code;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i6 = AFKeystoreWrapper + 33;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i7 = 40 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        int i8 = values + 123;
        AFKeystoreWrapper = i8 % 128;
        int i9 = i8 % 2;
        String mediationNetwork = aFg1iSDK.getMediationNetwork("AF_STORE");
        if (i9 == 0) {
            int i10 = 35 / 0;
        }
        return mediationNetwork;
    }

    private static String getRevenue(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, 2000545293, -2000545286, (int) System.currentTimeMillis());
    }

    private static File getRevenue(String str) {
        return (File) getCurrencyIso4217Code(new Object[]{str}, 1393711468, -1393711457, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (component2() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (component2() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        com.appsflyer.internal.AFg1iSDK.values = (com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper + 37) % 128;
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
        r1 = r9.format(new java.util.Date());
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getCurrencyIso4217Code(@org.jetbrains.annotations.NotNull java.text.SimpleDateFormat r9) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r0 = r0 + 75
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.values = r0
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.appsflyer.internal.AFd1rSDK r1 = r8.component1
            r2 = 0
            java.lang.String r3 = "appsFlyerFirstInstall"
            java.lang.String r1 = r1.getMonetizationNetwork(r3, r2)
            if (r1 != 0) goto L5b
            int r1 = com.appsflyer.internal.AFg1iSDK.values
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L2f
            boolean r1 = r8.component2()
            r2 = 74
            int r2 = r2 / 0
            if (r1 == 0) goto L45
            goto L35
        L2f:
            boolean r1 = r8.component2()
            if (r1 == 0) goto L45
        L35:
            java.lang.String r1 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r9 = r9.format(r1)
            r1 = r9
            goto L4e
        L45:
            int r9 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r9 = r9 + 37
            int r9 = r9 % 128
            com.appsflyer.internal.AFg1iSDK.values = r9
            r1 = r0
        L4e:
            com.appsflyer.internal.AFd1rSDK r9 = r8.component1
            r9.AFAdRevenueData(r3, r1)
            int r9 = com.appsflyer.internal.AFg1iSDK.values
            int r9 = r9 + 77
            int r9 = r9 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r9
        L5b:
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r3 = com.appsflyer.internal.AFh1vSDK.GENERAL
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r4 = "AppsFlyer: first launch date: "
            r9.append(r4)
            r9.append(r1)
            java.lang.String r4 = r9.toString()
            r6 = 4
            r7 = 0
            r5 = 0
            com.appsflyer.internal.AFh1uSDK.i$default(r2, r3, r4, r5, r6, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.getCurrencyIso4217Code(java.text.SimpleDateFormat):java.lang.String");
    }

    private static void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        getCurrencyIso4217Code(new Object[]{map, str}, -830168679, 830168685, (int) System.currentTimeMillis());
    }

    private final AppsFlyerProperties getRevenue() {
        return (AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r5.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getCurrencyIso4217Code(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            int r1 = java.lang.System.identityHashCode(r4)
            r2 = 1273246331(0x4be4327b, float:2.9910262E7)
            r3 = -1273246327(0xffffffffb41bcd89, float:-1.4510273E-7)
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r2, r3, r1)
            com.appsflyer.AppsFlyerProperties r0 = (com.appsflyer.AppsFlyerProperties) r0
            java.lang.String r1 = "collectAndroidId"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 0
            if (r0 == 0) goto L58
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 115
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0
            if (r5 == 0) goto L34
            int r0 = r0 + 123
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.values = r0
            int r0 = r5.length()
            if (r0 != 0) goto L58
        L34:
            boolean r5 = r4.AFKeystoreWrapper()
            if (r5 == 0) goto L57
            int r5 = com.appsflyer.internal.AFg1iSDK.values
            int r5 = r5 + 123
            int r0 = r5 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L53
            java.lang.String r5 = r4.copydefault()
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 115
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0
            return r5
        L53:
            r4.copydefault()
            throw r1
        L57:
            return r1
        L58:
            if (r5 == 0) goto L63
            int r0 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r0 = r0 + 107
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.values = r0
            return r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.getCurrencyIso4217Code(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (r2.get("referrer") == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r0 = com.appsflyer.internal.AFg1iSDK.values + 75;
        com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if ((r0 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r2.put("referrer", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        r2.put("referrer", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r2.get("referrer") == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:
    
        if (r9.length() != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        r2.put("referrer", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        if (r9 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r9 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AFAdRevenueData(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            com.appsflyer.internal.AFg1iSDK r1 = (com.appsflyer.internal.AFg1iSDK) r1
            r2 = 1
            r2 = r9[r2]
            java.util.Map r2 = (java.util.Map) r2
            r3 = 2
            r9 = r9[r3]
            java.lang.String r9 = (java.lang.String) r9
            int r4 = com.appsflyer.internal.AFg1iSDK.values
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r5
            int r4 = r4 % r3
            java.lang.String r5 = ""
            java.lang.String r6 = "referrer"
            if (r4 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            r4 = 58
            int r4 = r4 / r0
            if (r9 == 0) goto L36
            goto L2c
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            if (r9 == 0) goto L36
        L2c:
            int r4 = r9.length()
            if (r4 != 0) goto L33
            goto L36
        L33:
            r2.put(r6, r9)
        L36:
            com.appsflyer.internal.AFd1rSDK r9 = r1.component1
            java.lang.String r4 = "extraReferrers"
            r5 = 0
            java.lang.String r9 = r9.getMonetizationNetwork(r4, r5)
            if (r9 == 0) goto L56
            int r7 = com.appsflyer.internal.AFg1iSDK.values
            int r7 = r7 + 17
            int r8 = r7 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r8
            int r7 = r7 % r3
            if (r7 != 0) goto L53
            r2.put(r4, r9)
            r9 = 17
            int r9 = r9 / r0
            goto L56
        L53:
            r2.put(r4, r9)
        L56:
            java.lang.Object[] r9 = new java.lang.Object[]{r1}
            int r4 = java.lang.System.identityHashCode(r1)
            r7 = 1273246331(0x4be4327b, float:2.9910262E7)
            r8 = -1273246327(0xffffffffb41bcd89, float:-1.4510273E-7)
            java.lang.Object r9 = getCurrencyIso4217Code(r9, r7, r8, r4)
            com.appsflyer.AppsFlyerProperties r9 = (com.appsflyer.AppsFlyerProperties) r9
            com.appsflyer.internal.AFd1rSDK r1 = r1.component1
            java.lang.String r9 = r9.getReferrer(r1)
            if (r9 == 0) goto La7
            int r1 = r9.length()
            if (r1 != 0) goto L79
            goto La7
        L79:
            int r1 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r1 = r1 + 11
            int r4 = r1 % 128
            com.appsflyer.internal.AFg1iSDK.values = r4
            int r1 = r1 % r3
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r2.get(r6)
            r4 = 74
            int r4 = r4 / r0
            if (r1 != 0) goto La7
            goto L94
        L8e:
            java.lang.Object r0 = r2.get(r6)
            if (r0 != 0) goto La7
        L94:
            int r0 = com.appsflyer.internal.AFg1iSDK.values
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r1
            int r0 = r0 % r3
            if (r0 == 0) goto La3
            r2.put(r6, r9)
            goto La7
        La3:
            r2.put(r6, r9)
            throw r5
        La7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.AFAdRevenueData(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r2.exists() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean getCurrencyIso4217Code(java.io.File r2) {
        /*
            int r0 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1iSDK.values = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 92
            int r0 = r0 / r1
            if (r2 == 0) goto L1d
            goto L15
        L13:
            if (r2 == 0) goto L1d
        L15:
            boolean r2 = r2.exists()
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            return r1
        L1d:
            int r2 = com.appsflyer.internal.AFg1iSDK.values
            int r2 = r2 + 81
            int r0 = r2 % 128
            com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L2b
            r2 = 1
            return r2
        L2b:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1iSDK.getCurrencyIso4217Code(java.io.File):boolean");
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 86217130, -86217129, System.identityHashCode(this));
    }

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static String AFAdRevenueData(@Nullable String str) {
        AFKeystoreWrapper = (values + 103) % 128;
        try {
            Object invoke = Class.forName(com.amazon.a.a.o.b.at).getMethod(com.amazon.a.a.o.b.au, String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            AFKeystoreWrapper = (values + 67) % 128;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }
}
