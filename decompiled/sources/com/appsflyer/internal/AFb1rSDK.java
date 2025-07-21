package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import j$.util.DesugarTimeZone;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1rSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName = null;
    private static boolean AFInAppEventType = false;
    private static AFb1rSDK component3 = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f11998e = 1;
    static final String getCurrencyIso4217Code;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork;
    public static final String getRevenue;
    private static int registerClient;
    private static boolean valueOf;
    private static int values;
    private AFg1xSDK AFKeystoreWrapper;
    Application component4;
    private Map<Long, String> copy;
    private boolean equals;
    private SharedPreferences hashCode;

    @NonNull
    private final AFd1oSDK toString;
    public volatile AppsFlyerConversionListener getMonetizationNetwork = null;
    private long component1 = -1;
    long areAllFieldsValid = -1;
    private long copydefault = TimeUnit.SECONDS.toMillis(5);
    boolean component2 = false;

    /* renamed from: com.appsflyer.internal.AFb1rSDK$5, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AFa1tSDK implements Runnable {
        private final AFa1oSDK getMediationNetwork;

        public AFa1tSDK(AFa1oSDK aFa1oSDK) {
            this.getMediationNetwork = aFa1oSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1rSDK.this.getRevenue(this.getMediationNetwork);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AFa1vSDK implements AFe1dSDK {
        public AFa1vSDK() {
        }

        private boolean AFAdRevenueData() {
            return AFb1rSDK.this.getMonetizationNetwork != null;
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getCurrencyIso4217Code(AFe1eSDK<?> aFe1eSDK) {
            if (aFe1eSDK instanceof AFf1fSDK) {
                AFb1rSDK.this.getMonetizationNetwork().component3().getRevenue(((AFf1eSDK) aFe1eSDK).component3.component1);
            }
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getMediationNetwork(AFe1eSDK<?> aFe1eSDK) {
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getMonetizationNetwork(AFe1eSDK<?> aFe1eSDK, AFe1cSDK aFe1cSDK) {
            JSONObject AFAdRevenueData;
            AFg1mSDK mediationNetwork;
            if (!(aFe1eSDK instanceof AFf1eSDK)) {
                if (!(aFe1eSDK instanceof AFg1cSDK) || aFe1cSDK == AFe1cSDK.SUCCESS) {
                    return;
                }
                AFg1bSDK aFg1bSDK = new AFg1bSDK(AFb1rSDK.this.getMonetizationNetwork());
                AFe1aSDK copy = AFb1rSDK.this.getMonetizationNetwork().copy();
                copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFg1bSDK));
                return;
            }
            AFf1eSDK aFf1eSDK = (AFf1eSDK) aFe1eSDK;
            boolean z6 = aFe1eSDK instanceof AFf1fSDK;
            if (z6 && AFAdRevenueData()) {
                AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1eSDK;
                if (aFf1fSDK.getMediationNetwork == AFe1cSDK.SUCCESS || aFf1fSDK.AFAdRevenueData == 1) {
                    AFg1cSDK aFg1cSDK = new AFg1cSDK(aFf1fSDK, AFb1rSDK.this.getMonetizationNetwork().getRevenue());
                    AFe1aSDK copy2 = AFb1rSDK.this.getMonetizationNetwork().copy();
                    copy2.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFg1cSDK));
                }
            }
            if (aFe1cSDK == AFe1cSDK.SUCCESS) {
                AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                aFb1rSDK.getMonetizationNetwork(aFb1rSDK.component4).AFAdRevenueData("sentSuccessfully", com.amazon.a.a.o.b.af);
                if (!(aFe1eSDK instanceof AFf1cSDK) && (mediationNetwork = new AFg1jSDK(AFb1rSDK.this.component4).getMediationNetwork()) != null && mediationNetwork.getCurrencyIso4217Code()) {
                    String str = mediationNetwork.getRevenue;
                    AFLogger.INSTANCE.d(AFh1vSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFg1jSDK.getMediationNetwork(str);
                }
                ResponseNetwork responseNetwork = ((AFf1oSDK) aFf1eSDK).component4;
                if (responseNetwork != null && (AFAdRevenueData = AFc1uSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                    AFb1rSDK.this.component2 = AFAdRevenueData.optBoolean("send_background", false);
                }
                if (z6) {
                    AFb1rSDK.this.areAllFieldsValid = System.currentTimeMillis();
                }
            }
        }
    }

    static {
        areAllFieldsValid();
        getCurrencyIso4217Code = "331";
        AFAdRevenueData = "6.15";
        StringBuilder sb = new StringBuilder();
        sb.append("6.15");
        sb.append("/androidevent?buildnumber=6.15.2&app_id=");
        getRevenue = sb.toString();
        getMediationNetwork = null;
        component3 = new AFb1rSDK();
        int i6 = registerClient + 113;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
    }

    public AFb1rSDK() {
        AFVersionDeclaration.init();
        this.toString = new AFd1oSDK();
        getMonetizationNetwork().i().getMediationNetwork();
        getMonetizationNetwork().i().AFAdRevenueData();
        AFe1aSDK copy = getMonetizationNetwork().copy();
        copy.getRevenue.add(new AFa1vSDK());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        int i6 = f11998e + 119;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            AFc1kSDK d6 = aFb1rSDK.getMonetizationNetwork().d();
            d6.getMediationNetwork = str;
            d6.getCurrencyIso4217Code = map;
            int i7 = 1 / 0;
            return null;
        }
        AFc1kSDK d7 = aFb1rSDK.getMonetizationNetwork().d();
        d7.getMediationNetwork = str;
        d7.getCurrencyIso4217Code = map;
        return null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        f11998e = (registerClient + 101) % 128;
        if (AFf1mSDK.component4()) {
            return null;
        }
        AFd1kSDK monetizationNetwork = aFb1rSDK.getMonetizationNetwork();
        AFe1aSDK copy = monetizationNetwork.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(new AFf1mSDK(monetizationNetwork)));
        int i6 = f11998e + 113;
        registerClient = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        f11998e = (registerClient + 121) % 128;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        aFb1rSDK.getMonetizationNetwork().d().component1 = strArr;
        int i6 = registerClient + 121;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        getCurrencyIso4217Code(new Object[]{aFb1rSDK, (Context) objArr[2]}, -608775197, 608775214, System.identityHashCode(aFb1rSDK));
        final AFd1kSDK monetizationNetwork = aFb1rSDK.getMonetizationNetwork();
        monetizationNetwork.AFKeystoreWrapper().getCurrencyIso4217Code(booleanValue);
        monetizationNetwork.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                AFb1rSDK.getRevenue(AFd1kSDK.this);
            }
        });
        if (booleanValue) {
            registerClient = (f11998e + 21) % 128;
            monetizationNetwork.getRevenue().getRevenue("is_stop_tracking_used", true);
        }
        int i6 = registerClient + 15;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Context context = (Context) objArr[2];
        int i6 = (f11998e + 93) % 128;
        registerClient = i6;
        if (context != null) {
            f11998e = (i6 + 81) % 128;
            if (aFb1rSDK.AFAdRevenueData()) {
                aFb1rSDK.setCustomerUserId(str);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(aFb1rSDK.getMonetizationNetwork().getRevenue());
                aFb1rSDK.getCurrencyIso4217Code(context, AFh1qSDK.setCustomerIdAndLogSession);
                AFg1wSDK AFKeystoreWrapper = aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper();
                if (referrer == null) {
                    int i7 = registerClient + 103;
                    f11998e = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    referrer = "";
                }
                if (context instanceof Activity) {
                    int i8 = registerClient + 95;
                    f11998e = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((Activity) context).getIntent();
                        int i9 = 16 / 0;
                    } else {
                        ((Activity) context).getIntent();
                    }
                }
                aFb1rSDK.getMonetizationNetwork(context, referrer);
                return null;
            }
            aFb1rSDK.setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        f11998e = (registerClient + 63) % 128;
        aFb1rSDK.start(context, null);
        int i6 = registerClient + 93;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r7.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r0 = new java.lang.StringBuilder("Setting partner data for ");
        r0.append(r2);
        r0.append(": ");
        r0.append(r7);
        com.appsflyer.AFLogger.afDebugLog(r0.toString());
        r0 = new org.json.JSONObject(r7).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r0 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r7 = new java.util.HashMap();
        r7.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r0)));
        r1.getRevenue.put(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        r1.getCurrencyIso4217Code.put(r2, r7);
        r1.getRevenue.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7.isEmpty() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object copy(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            com.appsflyer.internal.AFb1rSDK r1 = (com.appsflyer.internal.AFb1rSDK) r1
            r2 = 1
            r2 = r7[r2]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            r7 = r7[r3]
            java.util.Map r7 = (java.util.Map) r7
            com.appsflyer.internal.AFd1kSDK r1 = r1.getMonetizationNetwork()
            com.appsflyer.internal.AFd1tSDK r1 = r1.e()
            com.appsflyer.internal.AFc1aSDK r4 = r1.getMonetizationNetwork
            if (r4 != 0) goto L22
            com.appsflyer.internal.AFc1aSDK r4 = new com.appsflyer.internal.AFc1aSDK
            r4.<init>()
            r1.getMonetizationNetwork = r4
        L22:
            com.appsflyer.internal.AFc1aSDK r1 = r1.getMonetizationNetwork
            r4 = 0
            if (r2 == 0) goto Lbe
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L2f
            goto Lbe
        L2f:
            if (r7 == 0) goto La1
            int r5 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r5 = r5 + 31
            int r6 = r5 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r6
            int r5 = r5 % r3
            if (r5 == 0) goto L46
            boolean r3 = r7.isEmpty()
            r5 = 51
            int r5 = r5 / r0
            if (r3 == 0) goto L4d
            goto La1
        L46:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L4d
            goto La1
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Setting partner data for "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r7)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r3) goto L96
            java.lang.String r7 = "Partner data 1000 characters limit exceeded"
            com.appsflyer.AFLogger.afWarnLog(r7)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r3 = "limit exceeded: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "error"
            r7.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.getRevenue
            r0.put(r2, r7)
            return r4
        L96:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.getCurrencyIso4217Code
            r0.put(r2, r7)
            java.util.Map<java.lang.String, java.lang.Object> r7 = r1.getRevenue
            r7.remove(r2)
            return r4
        La1:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r1.getCurrencyIso4217Code
            java.lang.Object r7 = r7.remove(r2)
            if (r7 != 0) goto Lb4
            int r7 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r7 = r7 + 125
            int r7 = r7 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r7
            java.lang.String r7 = "Partner data is missing or `null`"
            goto Lba
        Lb4:
            java.lang.String r7 = "Cleared partner data for "
            java.lang.String r7 = r7.concat(r2)
        Lba:
            com.appsflyer.AFLogger.afWarnLog(r7)
            return r4
        Lbe:
            java.lang.String r7 = "Partner ID is missing or `null`"
            com.appsflyer.AFLogger.afWarnLog(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.copy(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        registerClient = (f11998e + 39) % 128;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i6 = f11998e + 11;
            registerClient = i6 % 128;
            if (i6 % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                registerClient = (f11998e + 125) % 128;
                if (map.get("advertiserId") != null) {
                    try {
                        if (AFc1sSDK.getRevenue(aFb1rSDK.getMonetizationNetwork().e().getRevenue) && map.remove("android_id") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                        if (AFc1sSDK.getRevenue(aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper().getRevenue()) && map.remove("imei") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        }
                        return null;
                    } catch (Exception e6) {
                        AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e6);
                    }
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        int i6 = registerClient + 105;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            aFb1rSDK.logEvent(context, str, map, null);
            int i7 = 52 / 0;
        } else {
            aFb1rSDK.logEvent(context, str, map, null);
        }
        int i8 = registerClient + 21;
        f11998e = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i6, int i7, int i8) {
        int i9 = ~i6;
        int i10 = (i6 * (-716)) + (i7 * 1435) + ((i7 | i9) * (-1434));
        int i11 = ~i8;
        int i12 = ~(i11 | i7);
        int i13 = ~(i6 | i7);
        int i14 = i9 | (~i7);
        int i15 = i10 + ((i12 | i13 | (~(i14 | i8))) * 717) + ((i13 | (~(i14 | i11)) | (~(i7 | i8))) * 717);
        switch (i15) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
                Context context = (Context) objArr[1];
                AFj1iSDK aFj1iSDK = new AFj1iSDK((Intent) objArr[2]);
                if (aFj1iSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
                    AFAdRevenueData(aFj1iSDK.AFAdRevenueData("appsflyer_preinstall"));
                    f11998e = (registerClient + 87) % 128;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String AFAdRevenueData2 = aFj1iSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFAdRevenueData2)));
                if (AFAdRevenueData2 != null) {
                    registerClient = (f11998e + 87) % 128;
                    aFb1rSDK.getMonetizationNetwork(context).AFAdRevenueData("referrer", AFAdRevenueData2);
                    AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                    appsFlyerProperties.set("AF_REFERRER", AFAdRevenueData2);
                    appsFlyerProperties.getCurrencyIso4217Code = AFAdRevenueData2;
                    if (AppsFlyerProperties.getInstance().getMonetizationNetwork()) {
                        AFLogger.afInfoLog("onReceive: isLaunchCalled");
                        aFb1rSDK.getCurrencyIso4217Code(context, AFh1qSDK.onReceive);
                        aFb1rSDK.getMonetizationNetwork(AFAdRevenueData2);
                    }
                }
                return null;
            case 5:
                return getCurrencyIso4217Code(objArr);
            case 6:
                return getRevenue(objArr);
            case 7:
                return component3(objArr);
            case 8:
                ((AFb1rSDK) objArr[0]).getMonetizationNetwork().e().getMediationNetwork = new AFc1cSDK((String[]) objArr[1]);
                f11998e = (registerClient + 57) % 128;
                return null;
            case 9:
                AFb1rSDK aFb1rSDK2 = (AFb1rSDK) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                int i16 = f11998e + 109;
                registerClient = i16 % 128;
                if (i16 % 2 != 0) {
                    AFb1cSDK copydefault = aFb1rSDK2.getMonetizationNetwork().copydefault();
                    String[] strArr = new String[1];
                    strArr[1] = String.valueOf(booleanValue);
                    copydefault.getMediationNetwork("setCollectAndroidID", strArr);
                } else {
                    aFb1rSDK2.getMonetizationNetwork().copydefault().getMediationNetwork("setCollectAndroidID", String.valueOf(booleanValue));
                }
                getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(booleanValue));
                getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(booleanValue));
                registerClient = (f11998e + 75) % 128;
                return null;
            case 10:
                AFb1rSDK aFb1rSDK3 = (AFb1rSDK) objArr[0];
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(booleanValue2)));
                if (booleanValue2) {
                    f11998e = (registerClient + 91) % 128;
                } else {
                    int i17 = f11998e + 87;
                    int i18 = i17 % 128;
                    registerClient = i18;
                    r7 = i17 % 2 == 0;
                    f11998e = (i18 + 43) % 128;
                }
                AFb1vSDK.getCurrencyIso4217Code = Boolean.valueOf(r7);
                AFd1kSDK monetizationNetwork = aFb1rSDK3.getMonetizationNetwork();
                monetizationNetwork.e().areAllFieldsValid = booleanValue2;
                if (booleanValue2) {
                    monetizationNetwork.e().component4 = null;
                    return null;
                }
                AFe1aSDK copy = monetizationNetwork.copy();
                copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(new AFf1pSDK(aFb1rSDK3.getMonetizationNetwork())));
                return null;
            case 11:
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objArr[0];
                long longValue = ((Number) objArr[1]).longValue();
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                String format = simpleDateFormat.format(new Date(longValue));
                f11998e = (registerClient + 11) % 128;
                return format;
            case 12:
                return component4(objArr);
            case 13:
                return component2(objArr);
            case 14:
                return areAllFieldsValid(objArr);
            case 15:
                return component1(objArr);
            case 16:
                return equals(objArr);
            case 17:
                return toString(objArr);
            case 18:
                return copy(objArr);
            case 19:
                return hashCode(objArr);
            case 20:
                return copydefault(objArr);
            case 21:
                return values(objArr);
            case 22:
                AFb1rSDK aFb1rSDK4 = (AFb1rSDK) objArr[0];
                AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
                f11998e = (registerClient + 31) % 128;
                r7 = aFa1oSDK.areAllFieldsValid == null;
                if (!(!aFb1rSDK4.AFAdRevenueData())) {
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return null;
                }
                if (r7) {
                    int i19 = f11998e + 73;
                    registerClient = i19 % 128;
                    if (i19 % 2 == 0 ? AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) : AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                        if (aFb1rSDK4.component3()) {
                            AppsFlyerRequestListener appsFlyerRequestListener = aFa1oSDK.getMediationNetwork;
                            if (appsFlyerRequestListener != null) {
                                appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            }
                            return null;
                        }
                    } else {
                        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    }
                    aFb1rSDK4.component1 = System.currentTimeMillis();
                }
                AFj1cSDK.getMonetizationNetwork(aFb1rSDK4.getMonetizationNetwork().AFAdRevenueData(), new AFa1tSDK(aFa1oSDK), 0L, TimeUnit.MILLISECONDS);
                return null;
            case 23:
                ((AFb1rSDK) objArr[0]).getRevenue(new AFh1lSDK());
                registerClient = (f11998e + 17) % 128;
                return null;
            default:
                String str = (String) objArr[0];
                int i20 = f11998e + 35;
                registerClient = i20 % 128;
                int i21 = i20 % 2;
                boolean z6 = AppsFlyerProperties.getInstance().getBoolean(str, false);
                f11998e = (registerClient + 109) % 128;
                return Boolean.valueOf(z6);
        }
    }

    public static AFb1rSDK getRevenue() {
        int i6 = f11998e + 11;
        registerClient = i6 % 128;
        if (i6 % 2 == 0) {
            return component3;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public static synchronized SharedPreferences h_(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1rSDK.class) {
            try {
                registerClient = (f11998e + 1) % 128;
                if (getRevenue().hashCode == null) {
                    int i6 = registerClient + 47;
                    f11998e = i6 % 128;
                    StrictMode.ThreadPolicy threadPolicy = i6 % 2;
                    try {
                        if (threadPolicy == 0) {
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            getRevenue().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                            threadPolicy = allowThreadDiskReads;
                        } else {
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            getRevenue().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                            threadPolicy = allowThreadDiskReads2;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                }
                sharedPreferences = getRevenue().hashCode;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        String str = (String) objArr[0];
        int i6 = f11998e + 121;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            AppsFlyerProperties.getInstance().getString(str);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i7 = f11998e + 3;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 36 / 0;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i_(Context context, Intent intent) {
        Uri uri;
        boolean z6;
        f11998e = (registerClient + 13) % 128;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFc1kSDK d6 = getMonetizationNetwork().d();
        AFd1rSDK revenue = getMonetizationNetwork().getRevenue();
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            int i6 = registerClient + 11;
            f11998e = i6 % 128;
            if (i6 % 2 == 0) {
                intent.getData();
                throw null;
            }
            uri = intent.getData();
        }
        if (uri == null || uri.toString().isEmpty()) {
            z6 = false;
        } else {
            f11998e = (registerClient + 109) % 128;
            z6 = true;
        }
        if (revenue.getMediationNetwork("ddl_sent") && !z6) {
            d6.getMonetizationNetwork("No direct deep link", null);
            return;
        }
        d6.n_(AFc1oSDK.AFAdRevenueData(d6.areAllFieldsValid.afInfoLog()), intent, context);
        int i7 = f11998e + 31;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i6 = registerClient + 51;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            AFd1oSDK aFd1oSDK = aFb1rSDK.toString;
            throw null;
        }
        AFd1oSDK aFd1oSDK2 = aFb1rSDK.toString;
        if (context != null) {
            AFd1nSDK aFd1nSDK = aFd1oSDK2.getCurrencyIso4217Code;
            if (context != null) {
                aFd1nSDK.AFAdRevenueData = context.getApplicationContext();
                f11998e = (registerClient + 33) % 128;
            }
        }
        return null;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        long longValue = ((Number) objArr[2]).longValue();
        f11998e = (registerClient + 101) % 128;
        aFb1rSDK.getMonetizationNetwork().d().getMonetizationNetwork = deepLinkListener;
        aFb1rSDK.getMonetizationNetwork().d().component3 = longValue;
        int i6 = registerClient + 111;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 17 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        registerClient = (f11998e + 35) % 128;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = getMonetizationNetwork().d().AFAdRevenueData;
        if (list.contains(asList)) {
            return;
        }
        f11998e = (registerClient + 77) % 128;
        list.add(asList);
        f11998e = (registerClient + 121) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z6) {
        int i6 = registerClient + 25;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z6);
            copydefault.getMediationNetwork("anonymizeUser", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("anonymizeUser", String.valueOf(z6));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z6);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        getCurrencyIso4217Code(new Object[]{this, str, map}, -1888684226, 1888684227, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z6) {
        registerClient = (f11998e + 117) % 128;
        getMonetizationNetwork().unregisterClient().AFAdRevenueData(z6);
        int i6 = registerClient + 37;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z6) {
        int i6 = registerClient + 31;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z6));
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z6));
            throw null;
        }
    }

    public final void g_(Context context, Intent intent) {
        getCurrencyIso4217Code(new Object[]{this, context, intent}, -687234173, 687234177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(@NonNull Context context) {
        getMonetizationNetwork().copydefault().getMediationNetwork("getAppsFlyerUID", new String[0]);
        if (context != null) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            AFd1qSDK mediationNetwork = getMonetizationNetwork().getMediationNetwork();
            return AFb1iSDK.getCurrencyIso4217Code(mediationNetwork.getMonetizationNetwork, mediationNetwork.getRevenue);
        }
        int i6 = (f11998e + 93) % 128;
        registerClient = i6;
        int i7 = i6 + 115;
        f11998e = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        registerClient = (f11998e + 55) % 128;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        String AFAdRevenueData2 = getMonetizationNetwork().getMediationNetwork().AFAdRevenueData(context);
        registerClient = (f11998e + 79) % 128;
        return AFAdRevenueData2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        f11998e = (registerClient + 65) % 128;
        String AFAdRevenueData2 = getMonetizationNetwork().AFInAppEventType().AFAdRevenueData();
        f11998e = (registerClient + 89) % 128;
        return AFAdRevenueData2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i6 = registerClient + 117;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        }
        getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        throw null;
    }

    public final synchronized AFg1xSDK getMediationNetwork() {
        AFg1xSDK aFg1xSDK;
        try {
            if (this.AFKeystoreWrapper == null) {
                registerClient = (f11998e + 37) % 128;
                this.AFKeystoreWrapper = new AFg1xSDK() { // from class: com.appsflyer.internal.c
                    @Override // com.appsflyer.internal.AFg1xSDK
                    public final void onRemoteConfigUpdateFinished(AFf1bSDK aFf1bSDK) {
                        AFb1rSDK.this.getCurrencyIso4217Code(aFf1bSDK);
                    }
                };
            }
            aFg1xSDK = this.AFKeystoreWrapper;
            f11998e = (registerClient + 119) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return aFg1xSDK;
    }

    public final AFd1kSDK getMonetizationNetwork() {
        int i6 = f11998e;
        AFd1oSDK aFd1oSDK = this.toString;
        registerClient = (i6 + 17) % 128;
        return aFd1oSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i6 = registerClient + 99;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String AFAdRevenueData2 = AFAdRevenueData(context, "AF_STORE");
        if (AFAdRevenueData2 != null) {
            f11998e = (registerClient + 81) % 128;
            return AFAdRevenueData2;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 2001963572, -2001963566, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        int i6 = (f11998e + 27) % 128;
        registerClient = i6;
        if (this.equals) {
            f11998e = (i6 + 51) % 128;
            return this;
        }
        this.equals = true;
        getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code(str);
        if (context != null) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            Application f_ = AFb1qSDK.f_(context);
            if (f_ == null) {
                return this;
            }
            this.component4 = f_;
            getMonetizationNetwork().valueOf().getMonetizationNetwork();
            getMonetizationNetwork().component3().getMediationNetwork = System.currentTimeMillis();
            AFe1aSDK copy = getMonetizationNetwork().copy();
            copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(new AFf1pSDK(getMonetizationNetwork())));
            AFi1qSDK registerClient2 = getMonetizationNetwork().registerClient();
            registerClient2.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1lSDK(registerClient2.getCurrencyIso4217Code) : new AFi1sSDK(registerClient2.getCurrencyIso4217Code);
            getMonetizationNetwork().afErrorLog().getCurrencyIso4217Code(new AFd1eSDK.AFa1vSDK() { // from class: com.appsflyer.internal.d
                @Override // com.appsflyer.internal.AFd1eSDK.AFa1vSDK
                public final void onConfigurationChanged(boolean z6) {
                    AFb1rSDK.this.getCurrencyIso4217Code(z6);
                }
            });
            getMonetizationNetwork().component2().AFAdRevenueData(getMediationNetwork());
            AFj1uSDK equals = getMonetizationNetwork().equals();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1rSDK.this.copydefault();
                }
            };
            AFi1eSDK AFAdRevenueData2 = equals.AFAdRevenueData(runnable);
            Runnable revenue = equals.getRevenue(AFAdRevenueData2, runnable);
            equals.getMonetizationNetwork(AFAdRevenueData2);
            equals.getMonetizationNetwork(new AFj1lSDK(equals.AFAdRevenueData.getMediationNetwork(), revenue));
            equals.getMonetizationNetwork(new AFj1zSDK(revenue, equals.AFAdRevenueData, new AFj1ySDK()));
            equals.getMonetizationNetwork(new AFj1pSDK(revenue, equals.AFAdRevenueData));
            if (equals.AFAdRevenueData.afDebugLog().AFAdRevenueData(AFg1hSDK.IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED)) {
                equals.getMonetizationNetwork(new AFj1rSDK(equals.AFAdRevenueData.getMonetizationNetwork(), equals.AFAdRevenueData.getMediationNetwork(), revenue));
            }
            equals.getCurrencyIso4217Code(revenue);
            int i7 = 0;
            if (!equals.AFAdRevenueData()) {
                Context context2 = equals.AFAdRevenueData.values().AFAdRevenueData;
                AFd1kSDK aFd1kSDK = equals.AFAdRevenueData;
                List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        registerClient = (f11998e + 25) % 128;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFj1tSDK(providerInfo, revenue, aFd1kSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                            f11998e = (registerClient + 53) % 128;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        equals.getMonetizationNetwork.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.PREINSTALL;
                        StringBuilder sb = new StringBuilder("Detected ");
                        sb.append(arrayList.size());
                        sb.append(" valid preinstall provider(s)");
                        aFLogger.d(aFh1vSDK, sb.toString());
                    }
                }
            }
            AFj1sSDK[] currencyIso4217Code = equals.getCurrencyIso4217Code();
            int length = currencyIso4217Code.length;
            while (i7 < length) {
                int i8 = registerClient + 59;
                f11998e = i8 % 128;
                if (i8 % 2 == 0) {
                    currencyIso4217Code[i7].getMediationNetwork(equals.AFAdRevenueData.values().AFAdRevenueData);
                    i7 += 52;
                } else {
                    currencyIso4217Code[i7].getMediationNetwork(equals.AFAdRevenueData.values().AFAdRevenueData);
                    i7++;
                }
            }
            if (getMonetizationNetwork().afDebugLog().AFAdRevenueData(AFg1hSDK.IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED)) {
                component1();
            }
            this.toString.AFKeystoreWrapper().getMediationNetwork(getMonetizationNetwork().getMediationNetwork());
        } else {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
        if (appsFlyerConversionListener == null) {
            int i9 = registerClient;
            int i10 = i9 + 103;
            f11998e = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            f11998e = (i9 + 13) % 128;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        copydefault.getMediationNetwork("init", str, str2);
        AFLogger.INSTANCE.force(AFh1vSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.15.2", getCurrencyIso4217Code));
        this.getMonetizationNetwork = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        registerClient = (f11998e + 25) % 128;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        getMonetizationNetwork().getMediationNetwork();
        boolean monetizationNetwork = AFd1qSDK.getMonetizationNetwork(context);
        int i6 = f11998e + 103;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        registerClient = (f11998e + 97) % 128;
        boolean currencyIso4217Code = getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i6 = registerClient + 97;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1vSDK.AD_REVENUE, "SDK is stopped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r0 = getMonetizationNetwork().AFKeystoreWrapper();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r0}, -1684451992, 1684451992, java.lang.System.identityHashCode(r0))) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        com.appsflyer.internal.AFb1rSDK.f11998e = (com.appsflyer.internal.AFb1rSDK.registerClient + 83) % 128;
        equals();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        getCurrencyIso4217Code(new java.lang.Object[]{r4, new com.appsflyer.internal.AFh1nSDK(r5, r6)}, 1781271842, -1781271820, java.lang.System.identityHashCode(r4));
        com.appsflyer.internal.AFb1rSDK.registerClient = (com.appsflyer.internal.AFb1rSDK.f11998e + 49) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        getMediationNetwork("logAdRevenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if (r4.equals == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4.equals == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r5.areAllFieldsValid() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1vSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logAdRevenue(@androidx.annotation.NonNull com.appsflyer.AFAdRevenueData r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L15
            boolean r0 = r4.equals
            r1 = 41
            int r1 = r1 / 0
            if (r0 != 0) goto L1f
            goto L19
        L15:
            boolean r0 = r4.equals
            if (r0 != 0) goto L1f
        L19:
            java.lang.String r5 = "logAdRevenue"
            getMediationNetwork(r5)
            return
        L1f:
            boolean r0 = r5.areAllFieldsValid()
            if (r0 != 0) goto L2f
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r6 = com.appsflyer.internal.AFh1vSDK.AD_REVENUE
            java.lang.String r0 = "Invalid ad revenue parameters provided"
            r5.w(r6, r0)
            return
        L2f:
            com.appsflyer.internal.AFd1kSDK r0 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFg1wSDK r0 = r0.AFKeystoreWrapper()
            boolean r0 = r0.getCurrencyIso4217Code()
            if (r0 == 0) goto L47
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r6 = com.appsflyer.internal.AFh1vSDK.AD_REVENUE
            java.lang.String r0 = "SDK is stopped"
            r5.w(r6, r0)
            return
        L47:
            com.appsflyer.internal.AFd1kSDK r0 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFg1wSDK r0 = r0.AFKeystoreWrapper()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            r2 = -1684451992(0xffffffff9b994d68, float:-2.536175E-22)
            r3 = 1684451992(0x6466b298, float:1.7022481E22)
            java.lang.Object r0 = com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(r1, r2, r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getRevenue(r0)
            if (r0 == 0) goto L75
            int r5 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r5 = r5 + 83
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r5
            equals()
            return
        L75:
            com.appsflyer.internal.AFh1nSDK r0 = new com.appsflyer.internal.AFh1nSDK
            r0.<init>(r5, r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r0}
            int r6 = java.lang.System.identityHashCode(r4)
            r0 = 1781271842(0x6a2c0d22, float:5.1999315E25)
            r1 = -1781271820(0xffffffff95d3f2f4, float:-8.5605534E-26)
            getCurrencyIso4217Code(r5, r0, r1, r6)
            int r5 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r5 = r5 + 49
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.logAdRevenue(com.appsflyer.AFAdRevenueData, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getMediationNetwork = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFh1vSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1eSDK.getRevenue(singletonMap);
        }
        aFh1eSDK.getCurrencyIso4217Code = hashMap;
        AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
        Map map2 = aFh1eSDK.getCurrencyIso4217Code;
        if (map2 == null) {
            map2 = new HashMap();
        }
        copydefault.getMediationNetwork("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1qSDK.logEvent);
        }
        getRevenue(aFh1eSDK, component3(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d6, double d7) {
        getMonetizationNetwork().copydefault().getMediationNetwork("logLocation", String.valueOf(d6), String.valueOf(d7));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d7));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d6));
        getRevenue(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        f11998e = (registerClient + 61) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        f11998e = (registerClient + 43) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("logSession", new String[0]);
        getMonetizationNetwork().copydefault().getRevenue();
        getCurrencyIso4217Code(context, AFh1qSDK.logSession);
        getRevenue(context, (String) null, (Map<String, Object>) null);
        f11998e = (registerClient + 7) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i6 = registerClient + 7;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            getMonetizationNetwork().w().AFAdRevenueData();
            throw null;
        }
        getMonetizationNetwork().w().AFAdRevenueData();
        int i7 = registerClient + 123;
        f11998e = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i6 = f11998e + 101;
        int i7 = i6 % 128;
        registerClient = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (uri != null) {
            int i8 = i7 + 75;
            f11998e = i8 % 128;
            if (i8 % 2 == 0) {
                uri.toString().isEmpty();
                throw null;
            }
            if (!uri.toString().isEmpty()) {
                if (context != null) {
                    getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
                    getMonetizationNetwork().d().o_(AFc1oSDK.AFAdRevenueData(getMonetizationNetwork().afInfoLog()), Uri.parse(uri.toString()));
                    return;
                }
                AFc1kSDK d6 = getMonetizationNetwork().d();
                StringBuilder sb = new StringBuilder("Context is \"");
                sb.append(context);
                sb.append("\"");
                d6.getMonetizationNetwork(sb.toString(), DeepLinkResult.Error.NETWORK);
                return;
            }
        }
        AFc1kSDK d7 = getMonetizationNetwork().d();
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        d7.getMonetizationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        getMonetizationNetwork().d().getMonetizationNetwork("performOnDeepLinking was called with null intent", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0013, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r6 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        getMonetizationNetwork().d().getMonetizationNetwork("performOnDeepLinking was called with null context", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
        com.appsflyer.internal.AFb1rSDK.registerClient = (com.appsflyer.internal.AFb1rSDK.f11998e + 7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        r6 = r6.getApplicationContext();
        getCurrencyIso4217Code(new java.lang.Object[]{r4, r6}, -608775197, 608775214, java.lang.System.identityHashCode(r4));
        getMonetizationNetwork().getMonetizationNetwork().execute(new com.appsflyer.internal.RunnableC1156b(r4, r6, r5));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performOnDeepLinking(@androidx.annotation.NonNull final android.content.Intent r5, @androidx.annotation.NonNull android.content.Context r6) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            r0 = 33
            int r0 = r0 / 0
            if (r5 != 0) goto L25
            goto L15
        L13:
            if (r5 != 0) goto L25
        L15:
            com.appsflyer.internal.AFd1kSDK r5 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFc1kSDK r5 = r5.d()
            java.lang.String r6 = "performOnDeepLinking was called with null intent"
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            r5.getMonetizationNetwork(r6, r0)
            return
        L25:
            if (r6 != 0) goto L3f
            com.appsflyer.internal.AFd1kSDK r5 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFc1kSDK r5 = r5.d()
            java.lang.String r6 = "performOnDeepLinking was called with null context"
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            r5.getMonetizationNetwork(r6, r0)
            int r5 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r5 = r5 + 7
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r5
            return
        L3f:
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r6}
            int r1 = java.lang.System.identityHashCode(r4)
            r2 = -608775197(0xffffffffdbb6d3e3, float:-1.02922835E17)
            r3 = 608775214(0x24492c2e, float:4.362235E-17)
            getCurrencyIso4217Code(r0, r2, r3, r1)
            com.appsflyer.internal.AFd1kSDK r0 = r4.getMonetizationNetwork()
            java.util.concurrent.ExecutorService r0 = r0.getMonetizationNetwork()
            com.appsflyer.internal.b r1 = new com.appsflyer.internal.b
            r1.<init>()
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.performOnDeepLinking(android.content.Intent, android.content.Context):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        registerClient = (f11998e + 123) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("registerConversionListener", new String[0]);
        getCurrencyIso4217Code(appsFlyerConversionListener);
        f11998e = (registerClient + 123) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        registerClient = (f11998e + 117) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            registerClient = (f11998e + 113) % 128;
            return;
        }
        getMediationNetwork = appsFlyerInAppPurchaseValidatorListener;
        int i6 = registerClient + 103;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        registerClient = (f11998e + 33) % 128;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        PurchaseHandler areAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        if (areAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, AFPurchaseConnectorA1l.getPackageName)) {
            AFf1nSDK aFf1nSDK = new AFf1nSDK(map, purchaseValidationCallback, areAllFieldsValid.getRevenue);
            AFe1aSDK aFe1aSDK = areAllFieldsValid.getMediationNetwork;
            aFe1aSDK.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1nSDK));
        }
        int i6 = registerClient + 81;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        f11998e = (registerClient + 77) % 128;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        PurchaseHandler areAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        if (areAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "subscriptions")) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(map, purchaseValidationCallback, areAllFieldsValid.getRevenue);
            AFe1aSDK aFe1aSDK = areAllFieldsValid.getMediationNetwork;
            aFe1aSDK.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1rSDK));
        }
        f11998e = (registerClient + 97) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x019a  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(android.app.Activity r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i6 = f11998e + 61;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (map != null) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i7 = registerClient + 47;
        f11998e = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, 1241603377, -1241603372, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        f11998e = (registerClient + 105) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("setAppId", str);
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
        int i6 = f11998e + 49;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if (r7.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005b, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_VERSION);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r1
            int r0 = r0 % 2
            java.lang.String r1 = "oneLinkSlug"
            java.lang.String r2 = "setAppInviteOneLink = "
            java.lang.String r3 = "setAppInviteOneLink"
            if (r0 == 0) goto L31
            com.appsflyer.internal.AFd1kSDK r0 = r6.getMonetizationNetwork()
            com.appsflyer.internal.AFb1cSDK r0 = r0.copydefault()
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 1
            r4[r5] = r7
            r0.getMediationNetwork(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L5b
            goto L4d
        L31:
            com.appsflyer.internal.AFd1kSDK r0 = r6.getMonetizationNetwork()
            com.appsflyer.internal.AFb1cSDK r0 = r0.copydefault()
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r0.getMediationNetwork(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L5b
        L4d:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L76
        L5b:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r0.remove(r2)
        L76:
            getMediationNetwork(r1, r7)
            int r7 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r7 = r7 + 55
            int r7 = r7 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z6) {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z6)}, 1505293153, -1505293144, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z6) {
        int i6 = f11998e + 113;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z6);
            copydefault.getMediationNetwork("setCollectIMEI", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setCollectIMEI", String.valueOf(z6));
        }
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z6));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z6));
        f11998e = (registerClient + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z6) {
        f11998e = (registerClient + 19) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("setCollectOaid", String.valueOf(z6));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z6));
        registerClient = (f11998e + 31) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        int i6 = registerClient + 55;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().e().component1 = appsFlyerConsent;
            throw null;
        }
        Objects.requireNonNull(appsFlyerConsent);
        getMonetizationNetwork().e().component1 = appsFlyerConsent;
        registerClient = (f11998e + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i6 = f11998e + 115;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[0] = str;
            copydefault.getMediationNetwork("setCurrencyCode", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        getCurrencyIso4217Code(new Object[]{this, str, context}, 231975276, -231975269, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        f11998e = (registerClient + 109) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        f11998e = (registerClient + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z6) {
        AFLogger.LogLevel logLevel;
        int i6 = registerClient + 81;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (z6) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            f11998e = (registerClient + 41) % 128;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z6) {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z6)}, -1685759045, 1685759055, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z6) {
        registerClient = (f11998e + 87) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z6)));
        AFAdRevenueData(AppsFlyerProperties.DISABLE_NETWORK_DATA, z6);
        f11998e = (registerClient + 71) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        registerClient = (f11998e + 69) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i6 = f11998e + 85;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        String str3;
        registerClient = (f11998e + 83) % 128;
        if (AFc1sSDK.getMonetizationNetwork(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i6 = f11998e + 69;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            str3 = str.trim();
            registerClient = (f11998e + 31) % 128;
        } else {
            str3 = "";
        }
        AFe1iSDK.getMonetizationNetwork(new AFe1hSDK(str3, str2.trim()));
        int i7 = f11998e + 23;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i6 = f11998e + 11;
        registerClient = i6 % 128;
        if (i6 % 2 == 0) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setImeiData", str);
            AFg1wSDK AFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper, str}, 1318882910, -1318882909, System.identityHashCode(AFKeystoreWrapper));
        } else {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = str;
            copydefault.getMediationNetwork("setImeiData", strArr);
            AFg1wSDK AFKeystoreWrapper2 = getMonetizationNetwork().AFKeystoreWrapper();
            AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper2, str}, 1318882910, -1318882909, System.identityHashCode(AFKeystoreWrapper2));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z6) {
        int i6 = f11998e + 109;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z6);
            copydefault.getMediationNetwork("setIsUpdate", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setIsUpdate", String.valueOf(z6));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z6);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i6 = f11998e;
            int i7 = i6 + 73;
            registerClient = i7 % 128;
            r2 = i7 % 2 == 0;
            registerClient = (i6 + 99) % 128;
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("log", String.valueOf(r2));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (r2) {
            getMonetizationNetwork().i().component1();
        } else {
            getMonetizationNetwork().i().AFAdRevenueData();
            f11998e = (registerClient + 5) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i6) {
        registerClient = (f11998e + 113) % 128;
        this.copydefault = TimeUnit.SECONDS.toMillis(i6);
        int i7 = registerClient + 27;
        f11998e = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 22 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        f11998e = (registerClient + 81) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("setOaidData", str);
        AFb1vSDK.getRevenue = str;
        int i6 = f11998e + 59;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        getCurrencyIso4217Code(new Object[]{this, strArr}, 1539108454, -1539108439, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i6 = registerClient;
        f11998e = (i6 + 35) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i7 = i6 + 119;
        f11998e = i7 % 128;
        if (i7 % 2 == 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, str, map}, -1784713538, 1784713556, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i6 = f11998e + 11;
        registerClient = i6 % 128;
        if (i6 % 2 == 0) {
            getMonetizationNetwork().e().getCurrencyIso4217Code = AFb1jSDK.getMonetizationNetwork(str);
        } else {
            getMonetizationNetwork().e().getCurrencyIso4217Code = AFb1jSDK.getMonetizationNetwork(str);
            int i7 = 77 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i6 = registerClient + 117;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
        } else {
            Objects.requireNonNull(pluginInfo);
            getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                registerClient = (f11998e + 73) % 128;
            } catch (JSONException e6) {
                AFLogger.afErrorLog(e6.getMessage(), e6);
            }
        }
        if (str2 != null) {
            f11998e = (registerClient + 119) % 128;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            f11998e = (registerClient + 103) % 128;
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        registerClient = (f11998e + 113) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1kSDK d6 = getMonetizationNetwork().d();
        d6.component4.clear();
        d6.component4.addAll(Arrays.asList(strArr));
        int i6 = registerClient + 51;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i6 = registerClient + 91;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners(strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i6 = f11998e + 81;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            setSharingFilterForPartners("all");
        } else {
            setSharingFilterForPartners("all");
        }
        int i7 = f11998e + 35;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 74 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getCurrencyIso4217Code(new Object[]{this, strArr}, -2050013962, 2050013970, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        registerClient = (f11998e + 47) % 128;
        getMonetizationNetwork().copydefault().getMediationNetwork("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i6 = registerClient + 123;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        registerClient = (f11998e + 111) % 128;
        start(context, str, null);
        f11998e = (registerClient + 109) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z6, Context context) {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z6), context}, -2043587704, 2043587717, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        f11998e = (registerClient + 87) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i6 = registerClient + 45;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i6 = f11998e + 97;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            getMonetizationNetwork().copydefault().getMediationNetwork("unregisterConversionListener", new String[1]);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("unregisterConversionListener", new String[0]);
        }
        this.getMonetizationNetwork = null;
        registerClient = (f11998e + 47) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFg1jSDK aFg1jSDK = new AFg1jSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1vSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1vSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1mSDK mediationNetwork = aFg1jSDK.getMediationNetwork();
        if (mediationNetwork == null || !str.equals(mediationNetwork.getRevenue)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z6 = mediationNetwork == null || currentTimeMillis - mediationNetwork.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(2L);
            AFg1mSDK aFg1mSDK = new AFg1mSDK(str, currentTimeMillis, !z6);
            aFg1jSDK.AFAdRevenueData.AFAdRevenueData("afUninstallToken", aFg1mSDK.getRevenue);
            aFg1jSDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFg1mSDK.getCurrencyIso4217Code);
            aFg1jSDK.AFAdRevenueData.getRevenue("afUninstallToken_queued", aFg1mSDK.getCurrencyIso4217Code());
            if (z6) {
                AFg1jSDK.getMediationNetwork(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1aSDK copy = this.toString.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(new AFf1qSDK(this.toString, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        registerClient = (f11998e + 25) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z6) {
        f11998e = (registerClient + 21) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z6)), true);
        AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z6);
        f11998e = (registerClient + 75) % 128;
    }

    private static void a(String str, String str2, int[] iArr, int i6, Object[] objArr) {
        $10 = ($11 + 61) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            $11 = ($10 + 109) % 128;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $10 = ($11 + 47) % 128;
            for (int i7 = 0; i7 < length; i7++) {
                $11 = ($10 + 29) % 128;
                cArr4[i7] = (char) (cArr3[i7] ^ 358767465314578885L);
            }
            cArr3 = cArr4;
        }
        int i8 = (int) (358767465314578885L ^ values);
        if (AFInAppEventType) {
            $10 = ($11 + 71) % 128;
            int length2 = bArr2.length;
            aFk1nSDK.AFAdRevenueData = length2;
            char[] cArr5 = new char[length2];
            aFk1nSDK.getRevenue = 0;
            while (true) {
                int i9 = aFk1nSDK.getRevenue;
                int i10 = aFk1nSDK.AFAdRevenueData;
                if (i9 < i10) {
                    cArr5[i9] = (char) (cArr3[bArr2[(i10 - 1) - i9] + i6] - i8);
                    aFk1nSDK.getRevenue = i9 + 1;
                } else {
                    objArr[0] = new String(cArr5);
                    return;
                }
            }
        } else if (valueOf) {
            $10 = ($11 + 13) % 128;
            int length3 = cArr2.length;
            aFk1nSDK.AFAdRevenueData = length3;
            char[] cArr6 = new char[length3];
            aFk1nSDK.getRevenue = 0;
            while (true) {
                int i11 = aFk1nSDK.getRevenue;
                int i12 = aFk1nSDK.AFAdRevenueData;
                if (i11 < i12) {
                    cArr6[i11] = (char) (cArr3[cArr2[(i12 - 1) - i11] - i6] - i8);
                    aFk1nSDK.getRevenue = i11 + 1;
                } else {
                    objArr[0] = new String(cArr6);
                    return;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1nSDK.AFAdRevenueData = length4;
            char[] cArr7 = new char[length4];
            aFk1nSDK.getRevenue = 0;
            while (true) {
                int i13 = aFk1nSDK.getRevenue;
                int i14 = aFk1nSDK.AFAdRevenueData;
                if (i13 < i14) {
                    cArr7[i13] = (char) (cArr3[iArr[(i14 - 1) - i13] - i6] - i8);
                    aFk1nSDK.getRevenue = i13 + 1;
                } else {
                    objArr[0] = new String(cArr7);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void getMonetizationNetwork(org.json.JSONObject r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r14.keys()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L3d
            java.lang.Object r2 = r14.get(r2)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L3d
            r4.<init>(r2)     // Catch: org.json.JSONException -> L3d
        L21:
            int r2 = r4.length()     // Catch: org.json.JSONException -> L3d
            if (r3 >= r2) goto L9
            int r2 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r2 = r2 + 73
            int r2 = r2 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r2
            long r5 = r4.getLong(r3)     // Catch: org.json.JSONException -> L3d
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: org.json.JSONException -> L3d
            r0.add(r2)     // Catch: org.json.JSONException -> L3d
            int r3 = r3 + 1
            goto L21
        L3d:
            r2 = move-exception
            java.lang.String r3 = "error at timeStampArr"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r2)
            goto L9
        L44:
            java.util.Collections.sort(r0)
            java.util.Iterator r1 = r14.keys()
            r2 = 0
        L4c:
            r4 = r2
        L4d:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L55
            goto Le9
        L55:
            if (r4 != 0) goto Le9
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: org.json.JSONException -> L8f
            java.lang.Object r7 = r14.get(r5)     // Catch: org.json.JSONException -> L8f
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L8f
            r6.<init>(r7)     // Catch: org.json.JSONException -> L8f
            r7 = r3
        L69:
            int r8 = r6.length()     // Catch: org.json.JSONException -> L8f
            if (r7 >= r8) goto L4d
            int r8 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r8 = r8 + 71
            int r9 = r8 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r9
            int r8 = r8 % 2
            r9 = 1
            if (r8 == 0) goto L91
            long r10 = r6.getLong(r7)     // Catch: org.json.JSONException -> L8f
            java.lang.Object r8 = r0.get(r9)     // Catch: org.json.JSONException -> L8f
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: org.json.JSONException -> L8f
            long r12 = r8.longValue()     // Catch: org.json.JSONException -> L8f
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 == 0) goto L4c
            goto La3
        L8f:
            r5 = move-exception
            goto Le2
        L91:
            long r10 = r6.getLong(r7)     // Catch: org.json.JSONException -> L8f
            java.lang.Object r8 = r0.get(r3)     // Catch: org.json.JSONException -> L8f
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: org.json.JSONException -> L8f
            long r12 = r8.longValue()     // Catch: org.json.JSONException -> L8f
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 == 0) goto L4c
        La3:
            long r10 = r6.getLong(r7)     // Catch: org.json.JSONException -> L8f
            java.lang.Object r8 = r0.get(r9)     // Catch: org.json.JSONException -> L8f
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: org.json.JSONException -> L8f
            long r12 = r8.longValue()     // Catch: org.json.JSONException -> L8f
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 == 0) goto L4c
            int r8 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r8 = r8 + 123
            int r8 = r8 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r8
            long r10 = r6.getLong(r7)     // Catch: org.json.JSONException -> L8f
            int r8 = r0.size()     // Catch: org.json.JSONException -> L8f
            int r8 = r8 - r9
            java.lang.Object r8 = r0.get(r8)     // Catch: org.json.JSONException -> L8f
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: org.json.JSONException -> L8f
            long r8 = r8.longValue()     // Catch: org.json.JSONException -> L8f
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 != 0) goto Ld6
            goto L4c
        Ld6:
            int r7 = r7 + 1
            int r4 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r4 = r4 + 17
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r4
            r4 = r5
            goto L69
        Le2:
            java.lang.String r6 = "error at manageExtraReferrers"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r6, r5)
            goto L4d
        Le9:
            if (r4 == 0) goto Lee
            r14.remove(r4)
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.getMonetizationNetwork(org.json.JSONObject):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(AFd1kSDK aFd1kSDK) {
        int i6 = f11998e + 79;
        registerClient = i6 % 128;
        int i7 = i6 % 2;
        aFd1kSDK.valueOf().getCurrencyIso4217Code();
        if (i7 != 0) {
            throw null;
        }
        f11998e = (registerClient + 91) % 128;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        int i6 = f11998e + 77;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("getSdkVersion", new String[0]);
        } else {
            aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("getSdkVersion", new String[0]);
        }
        String areAllFieldsValid = AFd1qSDK.areAllFieldsValid();
        int i7 = registerClient + 35;
        f11998e = i7 % 128;
        if (i7 % 2 != 0) {
            return areAllFieldsValid;
        }
        throw null;
    }

    public final void component4() {
        getCurrencyIso4217Code(new Object[]{this}, -1730576944, 1730576958, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        registerClient = (f11998e + 99) % 128;
        if (getMonetizationNetwork().w().getMediationNetwork()) {
            int i6 = f11998e + 45;
            registerClient = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!this.equals) {
            getMediationNetwork("start");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        final AFh1oSDK component32 = getMonetizationNetwork().component3();
        component32.AFAdRevenueData(AFa1mSDK.AFAdRevenueData(context));
        if (this.component4 == null) {
            int i7 = f11998e + 119;
            registerClient = i7 % 128;
            if (i7 % 2 == 0) {
                Application f_ = AFb1qSDK.f_(context);
                if (f_ == null) {
                    return;
                } else {
                    this.component4 = f_;
                }
            } else {
                AFb1qSDK.f_(context);
                throw null;
            }
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.GENERAL;
        String str2 = getCurrencyIso4217Code;
        aFLogger.i(aFh1vSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.15.2", str2));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFh1vSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().getRevenue());
        if (!TextUtils.isEmpty(str)) {
            getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code(str);
        } else {
            AFg1wSDK AFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            if (TextUtils.isEmpty((String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper)))) {
                f11998e = (registerClient + 105) % 128;
                equals();
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        getMonetizationNetwork().component2().AFAdRevenueData(getMediationNetwork());
        getCurrencyIso4217Code(new Object[]{this}, -1730576944, 1730576958, System.identityHashCode(this));
        getCurrencyIso4217Code(this.component4.getBaseContext());
        getMonetizationNetwork().unregisterClient().getMediationNetwork();
        this.toString.w().getRevenue(context, new AFd1wSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFb1rSDK.4
            @Override // com.appsflyer.internal.AFd1wSDK.AFa1tSDK
            public final void getMonetizationNetwork(@NonNull AFh1mSDK aFh1mSDK) {
                component32.getMonetizationNetwork();
                AFd1kSDK monetizationNetwork = AFb1rSDK.this.getMonetizationNetwork();
                monetizationNetwork.component2().AFAdRevenueData(AFb1rSDK.this.getMediationNetwork());
                AFb1rSDK.this.component4();
                int mediationNetwork = monetizationNetwork.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (mediationNetwork < 2) {
                    AFb1rSDK.this.getMonetizationNetwork().component4().getMediationNetwork();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1mSDK != null) {
                    AFb1rSDK.this.getMonetizationNetwork().d().n_(AFc1oSDK.getMediationNetwork(aFh1iSDK), aFh1mSDK.getCurrencyIso4217Code, monetizationNetwork.values().AFAdRevenueData);
                }
                AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                aFh1iSDK.getMediationNetwork = appsFlyerRequestListener;
                aFb1rSDK.getRevenue(aFh1iSDK, aFh1mSDK);
            }

            @Override // com.appsflyer.internal.AFd1wSDK.AFa1tSDK
            public final void getRevenue() {
                Context context2 = AFb1rSDK.this.getMonetizationNetwork().values().AFAdRevenueData;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1oSDK aFh1oSDK = component32;
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = aFh1oSDK.areAllFieldsValid;
                if (j6 != 0) {
                    long j7 = currentTimeMillis - j6;
                    if (j7 > 0 && j7 < 1000) {
                        j7 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j7);
                    aFh1oSDK.equals = seconds;
                    aFh1oSDK.AFAdRevenueData.getMonetizationNetwork("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1rSDK.this.getMonetizationNetwork().afErrorLog().getMonetizationNetwork();
                AFb1cSDK copydefault = AFb1rSDK.this.getMonetizationNetwork().copydefault();
                if (copydefault.areAllFieldsValid()) {
                    copydefault.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        copydefault.k_(context2.getPackageName(), context2.getPackageManager());
                    }
                    copydefault.getMonetizationNetwork();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1rSDK.this.getMonetizationNetwork().component4().getRevenue();
                AFb1rSDK.this.getMonetizationNetwork().afInfoLog().getCurrencyIso4217Code();
            }
        });
        int i8 = registerClient + 89;
        f11998e = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 35 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j6) {
        getCurrencyIso4217Code(new Object[]{this, deepLinkListener, Long.valueOf(j6)}, 1858628735, -1858628714, System.identityHashCode(this));
    }

    private static void getMediationNetwork(String str, String str2) {
        registerClient = (f11998e + 67) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i6 = f11998e + 43;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copydefault().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        registerClient = (f11998e + 121) % 128;
        String str = null;
        int i6 = 0;
        while (i6 < length) {
            String str2 = strArr[i6];
            if (AnonymousClass5.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1jSDK.getMonetizationNetwork(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
            i6++;
            f11998e = (registerClient + 81) % 128;
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getCurrencyIso4217Code(new Object[]{this, context, str, str2, str3, str4, str5, map}, 123597494, -123597492, System.identityHashCode(this));
    }

    private void component1() {
        int i6 = f11998e + 119;
        registerClient = i6 % 128;
        if (i6 % 2 == 0) {
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1rSDK.this.copy();
                }
            });
        } else {
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1rSDK.this.copy();
                }
            });
            throw null;
        }
    }

    private static void equals() {
        f11998e = (registerClient + 119) % 128;
        AFLogger.INSTANCE.w(AFh1vSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        f11998e = (registerClient + 21) % 128;
    }

    public static void areAllFieldsValid() {
        AFInAppEventParameterName = new char[]{61619, 61630, 61617, 61516, 61627, 61511, 61631, 61517, 61504};
        values = -552931120;
        valueOf = true;
        AFInAppEventType = true;
    }

    @NonNull
    private AFj1sSDK[] component2() {
        int i6 = registerClient + 13;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return getMonetizationNetwork().equals().getCurrencyIso4217Code();
        }
        getMonetizationNetwork().equals().getCurrencyIso4217Code();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1jSDK aFi1jSDK) {
        AFf1jSDK aFf1jSDK = new AFf1jSDK(aFi1jSDK, getMonetizationNetwork().getMediationNetwork(), getMonetizationNetwork());
        AFe1aSDK copy = getMonetizationNetwork().copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1jSDK));
        int i6 = registerClient + 111;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static void AFAdRevenueData(String str, boolean z6) {
        f11998e = (registerClient + 57) % 128;
        AppsFlyerProperties.getInstance().set(str, z6);
        f11998e = (registerClient + 11) % 128;
    }

    private static void component2(Context context) {
        getCurrencyIso4217Code(new Object[]{context}, 2054602482, -2054602479, (int) System.currentTimeMillis());
    }

    private void getRevenue(Context context, String str, Map<String, Object> map) {
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getCurrencyIso4217Code = map;
        getRevenue(aFh1eSDK, component3(context));
        int i6 = f11998e + 63;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (getCurrencyIso4217Code(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (getCurrencyIso4217Code(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (getCurrencyIso4217Code() != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        com.appsflyer.internal.AFb1rSDK.registerClient = (com.appsflyer.internal.AFb1rSDK.f11998e + 105) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFAdRevenueData() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "waitForCustomerId"
            if (r0 == 0) goto L19
            boolean r0 = getCurrencyIso4217Code(r2)
            r2 = 44
            int r2 = r2 / r1
            if (r0 == 0) goto L2f
            goto L1f
        L19:
            boolean r0 = getCurrencyIso4217Code(r2)
            if (r0 == 0) goto L2f
        L1f:
            java.lang.String r0 = getCurrencyIso4217Code()
            if (r0 != 0) goto L2f
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 105
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r0
            r0 = 1
            return r0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.AFAdRevenueData():boolean");
    }

    private static void AFAdRevenueData(@NonNull AFa1oSDK aFa1oSDK, AFh1mSDK aFh1mSDK) {
        if (aFh1mSDK != null) {
            int i6 = (f11998e + 17) % 128;
            registerClient = i6;
            aFa1oSDK.AFAdRevenueData = aFh1mSDK.getRevenue;
            aFa1oSDK.component3 = aFh1mSDK.getMonetizationNetwork;
            f11998e = (i6 + 115) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r4.contains("android.permission.INTERNET") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            android.content.Context r4 = (android.content.Context) r4
            int r0 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r1
            int r0 = r0 % 2
            java.lang.String r1 = "android.permission.INTERNET"
            r2 = 0
            if (r0 != 0) goto L31
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L2f
            r3 = 11102(0x2b5e, float:1.5557E-41)
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String[] r4 = r4.requestedPermissions     // Catch: java.lang.Exception -> L2f
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Exception -> L2f
            boolean r0 = r4.contains(r1)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L6b
            goto L4b
        L2f:
            r4 = move-exception
            goto L95
        L31:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L2f
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String[] r4 = r4.requestedPermissions     // Catch: java.lang.Exception -> L2f
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Exception -> L2f
            boolean r0 = r4.contains(r1)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L6b
        L4b:
            int r0 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r1
            int r0 = r0 % 2
            java.lang.String r1 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            if (r0 == 0) goto L61
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Exception -> L2f
            com.appsflyer.internal.AFh1vSDK r3 = com.appsflyer.internal.AFh1vSDK.GENERAL     // Catch: java.lang.Exception -> L2f
            r0.w(r3, r1)     // Catch: java.lang.Exception -> L2f
            goto L6b
        L61:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Exception -> L2f
            com.appsflyer.internal.AFh1vSDK r0 = com.appsflyer.internal.AFh1vSDK.GENERAL     // Catch: java.lang.Exception -> L2f
            r4.w(r0, r1)     // Catch: java.lang.Exception -> L2f
            throw r2     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L69
        L69:
            r4 = move-exception
            throw r4
        L6b:
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r4.contains(r0)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L7c
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Exception -> L2f
            com.appsflyer.internal.AFh1vSDK r1 = com.appsflyer.internal.AFh1vSDK.GENERAL     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            r0.w(r1, r3)     // Catch: java.lang.Exception -> L2f
        L7c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2f
            r1 = 32
            if (r0 <= r1) goto L94
            java.lang.String r0 = "com.google.android.gms.permission.AD_ID"
            boolean r4 = r4.contains(r0)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L8b
            goto L94
        L8b:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Exception -> L2f
            com.appsflyer.internal.AFh1vSDK r0 = com.appsflyer.internal.AFh1vSDK.GENERAL     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml"
            r4.w(r0, r1)     // Catch: java.lang.Exception -> L2f
        L94:
            return r2
        L95:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r1 = com.appsflyer.internal.AFh1vSDK.GENERAL
            java.lang.String r3 = "Exception while validation permissions. "
            r0.e(r1, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.getMediationNetwork(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
    
        r5.component2 = r6;
        getCurrencyIso4217Code(new java.lang.Object[]{r4, r5}, 1781271842, -1781271820, java.lang.System.identityHashCode(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        r5 = r5.getMediationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        com.appsflyer.internal.AFb1rSDK.f11998e = (com.appsflyer.internal.AFb1rSDK.registerClient + 91) % 128;
        r5.onError(41, "No dev key");
        com.appsflyer.internal.AFb1rSDK.registerClient = (com.appsflyer.internal.AFb1rSDK.f11998e + 3) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r6}, -1684451992, 1684451992, java.lang.System.identityHashCode(r6))) == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r6}, -1684451992, 1684451992, java.lang.System.identityHashCode(r6))) == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006d, code lost:
    
        r6 = com.appsflyer.AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().getRevenue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007d, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007f, code lost:
    
        r6 = com.appsflyer.internal.AFb1rSDK.f11998e + 79;
        com.appsflyer.internal.AFb1rSDK.registerClient = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0089, code lost:
    
        if ((r6 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008b, code lost:
    
        r6 = 5 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getRevenue(@androidx.annotation.NonNull com.appsflyer.internal.AFa1oSDK r5, com.appsflyer.internal.AFh1mSDK r6) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r1
            int r0 = r0 % 2
            r1 = 1684451992(0x6466b298, float:1.7022481E22)
            r2 = -1684451992(0xffffffff9b994d68, float:-2.536175E-22)
            r3 = 0
            if (r0 == 0) goto L31
            AFAdRevenueData(r5, r6)
            com.appsflyer.internal.AFd1kSDK r6 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFg1wSDK r6 = r6.AFKeystoreWrapper()
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Object r6 = com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(r0, r2, r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r3 / r3
            if (r6 != 0) goto L6d
            goto L4c
        L31:
            AFAdRevenueData(r5, r6)
            com.appsflyer.internal.AFd1kSDK r6 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFg1wSDK r6 = r6.AFKeystoreWrapper()
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Object r6 = com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(r0, r2, r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L6d
        L4c:
            java.lang.String r6 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r6)
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.getMediationNetwork
            if (r5 == 0) goto L6c
            int r6 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r6 = r6 + 91
            int r6 = r6 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r6
            r6 = 41
            java.lang.String r0 = "No dev key"
            r5.onError(r6, r0)
            int r5 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r5 = r5 + 3
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r5
        L6c:
            return
        L6d:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()
            com.appsflyer.internal.AFd1kSDK r0 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFd1rSDK r0 = r0.getRevenue()
            java.lang.String r6 = r6.getReferrer(r0)
            if (r6 != 0) goto L8f
            int r6 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r6 = r6 + 79
            int r0 = r6 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L8d
            r6 = 5
            int r6 = r6 / r3
        L8d:
            java.lang.String r6 = ""
        L8f:
            r5.component2 = r6
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5}
            int r6 = java.lang.System.identityHashCode(r4)
            r0 = 1781271842(0x6a2c0d22, float:5.1999315E25)
            r1 = -1781271820(0xffffffff95d3f2f4, float:-8.5605534E-26)
            getCurrencyIso4217Code(r5, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.getRevenue(com.appsflyer.internal.AFa1oSDK, com.appsflyer.internal.AFh1mSDK):void");
    }

    private AFh1mSDK component3(Context context) {
        f11998e = (registerClient + 81) % 128;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1mSDK aFh1mSDK = new AFh1mSDK((Activity) context, getMonetizationNetwork().AFLogger());
        int i6 = registerClient + 125;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return aFh1mSDK;
        }
        throw null;
    }

    private String AFAdRevenueData(Context context, String str) {
        if (context == null) {
            int i6 = (registerClient + 65) % 128;
            f11998e = i6;
            int i7 = i6 + 51;
            registerClient = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        return getMonetizationNetwork().getMediationNetwork().getRevenue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() {
        getCurrencyIso4217Code(new Object[]{this}, -927250196, 927250219, System.identityHashCode(this));
    }

    private static void AFAdRevenueData(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                f11998e = (registerClient + 117) % 128;
                getMediationNetwork("preInstallName", str);
                f11998e = (registerClient + 65) % 128;
                return;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } catch (JSONException e6) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        final AFi1jSDK force = getMonetizationNetwork().force();
        if (force != null) {
            f11998e = (registerClient + 83) % 128;
            if (force.AFAdRevenueData()) {
                f11998e = (registerClient + 97) % 128;
                force.getCurrencyIso4217Code(new AFi1dSDK() { // from class: com.appsflyer.internal.g
                    @Override // com.appsflyer.internal.AFi1dSDK
                    public final void onRequestFinished() {
                        AFb1rSDK.this.getMediationNetwork(force);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (isStopped() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if (isStopped() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
    
        com.appsflyer.AFLogger.afInfoLog(java.lang.String.format(r4, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", r5, r0, java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r11.copydefault)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean component3() {
        /*
            r11 = this;
            int r0 = com.appsflyer.internal.AFb1rSDK.f11998e
            int r0 = r0 + 9
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.registerClient = r0
            long r0 = r11.component1
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto Lc1
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r11.component1
            long r2 = r2 - r4
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "yyyy/MM/dd HH:mm:ss.SSS Z"
            r0.<init>(r5, r4)
            long r5 = r11.component1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            long r6 = java.lang.System.currentTimeMillis()
            int r6 = (int) r6
            r7 = 1382084704(0x5260f060, float:2.41526374E11)
            r8 = -1382084693(0xffffffffad9f0fab, float:-1.8083165E-11)
            java.lang.Object r5 = getCurrencyIso4217Code(r5, r7, r8, r6)
            java.lang.String r5 = (java.lang.String) r5
            long r9 = r11.areAllFieldsValid
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6}
            long r9 = java.lang.System.currentTimeMillis()
            int r6 = (int) r9
            java.lang.Object r0 = getCurrencyIso4217Code(r0, r7, r8, r6)
            java.lang.String r0 = (java.lang.String) r0
            long r6 = r11.copydefault
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L8c
            int r6 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r6 = r6 + 31
            int r8 = r6 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r8
            int r6 = r6 % r7
            if (r6 != 0) goto L6d
            boolean r6 = r11.isStopped()
            r8 = 95
            int r8 = r8 / r1
            if (r6 != 0) goto L8c
            goto L73
        L6d:
            boolean r6 = r11.isStopped()
            if (r6 != 0) goto L8c
        L73:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            long r2 = r11.copydefault
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0, r1, r2}
            java.lang.String r1 = "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms"
            java.lang.String r0 = java.lang.String.format(r4, r1, r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            r0 = 1
            return r0
        L8c:
            boolean r6 = r11.isStopped()
            if (r6 != 0) goto Lcc
            int r6 = com.appsflyer.internal.AFb1rSDK.registerClient
            int r6 = r6 + 117
            int r8 = r6 % 128
            com.appsflyer.internal.AFb1rSDK.f11998e = r8
            int r6 = r6 % r7
            java.lang.String r8 = "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)"
            if (r6 != 0) goto Lb4
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r1] = r5
            r6[r1] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 3
            r6[r2] = r0
            java.lang.String r0 = java.lang.String.format(r4, r8, r6)
        Lb0:
            com.appsflyer.AFLogger.afInfoLog(r0)
            goto Lcc
        Lb4:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0, r2}
            java.lang.String r0 = java.lang.String.format(r4, r8, r0)
            goto Lb0
        Lc1:
            boolean r0 = r11.isStopped()
            if (r0 != 0) goto Lcc
            java.lang.String r0 = "Sending first launch for this session!"
            com.appsflyer.AFLogger.afInfoLog(r0)
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.component3():boolean");
    }

    private void getMonetizationNetwork(Context context, String str) {
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getCurrencyIso4217Code = null;
        aFh1iSDK.component2 = str;
        aFh1iSDK.AFAdRevenueData = null;
        getCurrencyIso4217Code(new Object[]{this, aFh1iSDK}, 1781271842, -1781271820, System.identityHashCode(this));
        f11998e = (registerClient + 11) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, context, str, map}, 1252837027, -1252837011, System.identityHashCode(this));
    }

    public final void AFAdRevenueData(@NonNull Context context) {
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
    }

    public static int getMediationNetwork(AFd1rSDK aFd1rSDK, boolean z6) {
        f11998e = (registerClient + 51) % 128;
        int revenue = getRevenue(aFd1rSDK, "appsFlyerCount", z6);
        registerClient = (f11998e + 9) % 128;
        return revenue;
    }

    private static void getMediationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFh1vSDK, sb.toString());
        int i6 = registerClient + 67;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r1.length() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        r1 = getMonetizationNetwork(r0);
        com.appsflyer.AppsFlyerProperties.getInstance().saveProperties(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        r2 = new java.lang.StringBuilder("sendWithEvent from activity: ");
        r2.append(r0.getClass().getName());
        com.appsflyer.AFLogger.afInfoLog(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        r0 = r11.getRevenue();
        r2 = getMonetizationNetwork(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        if (isStopped() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        r1 = getMediationNetwork(r1, false);
        r4 = new com.appsflyer.internal.AFj1jSDK(getMonetizationNetwork().getMediationNetwork());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, "");
        r6 = r11.getRevenue();
        r7 = r11 instanceof com.appsflyer.internal.AFh1nSDK;
        r8 = r11 instanceof com.appsflyer.internal.AFh1jSDK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        if ((r11 instanceof com.appsflyer.internal.AFh1lSDK) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (r8 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.getCurrencyIso4217Code);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0108, code lost:
    
        r3 = r4.getRevenue(com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork(r4.getMediationNetwork(r3), r7));
        getCurrencyIso4217Code(new java.lang.Object[]{r10, r2}, -1216379940, 1216379960, java.lang.System.identityHashCode(r10));
        r4 = new com.appsflyer.internal.AFc1tSDK(getMonetizationNetwork(), r11.getRevenue(r3).getRevenue(r2).getMediationNetwork(r1), getMonetizationNetwork().unregisterClient().getCurrencyIso4217Code());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0146, code lost:
    
        if (r0 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0148, code lost:
    
        r11 = component2();
        r0 = r11.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014f, code lost:
    
        if (r5 >= r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0151, code lost:
    
        r3 = r11[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
    
        if (r3.component2 != com.appsflyer.internal.AFj1sSDK.AFa1zSDK.STARTED) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0159, code lost:
    
        r1 = new java.lang.StringBuilder("Failed to get ");
        r1.append(r3.getMonetizationNetwork);
        r1.append(" referrer, wait ...");
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0172, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0181, code lost:
    
        if (getMonetizationNetwork().unregisterClient().getMonetizationNetwork() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0183, code lost:
    
        com.appsflyer.internal.AFb1rSDK.registerClient = (com.appsflyer.internal.AFb1rSDK.f11998e + 73) % 128;
        com.appsflyer.AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019f, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getMonetizationNetwork() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a1, code lost:
    
        com.appsflyer.internal.AFb1rSDK.registerClient = (com.appsflyer.internal.AFb1rSDK.f11998e + 89) % 128;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0192, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01aa, code lost:
    
        r11 = getMonetizationNetwork().AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b2, code lost:
    
        if (r5 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b4, code lost:
    
        r0 = 500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b9, code lost:
    
        com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r11, r4, r0, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b7, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        if (r6 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        com.appsflyer.internal.AFb1rSDK.f11998e = (com.appsflyer.internal.AFb1rSDK.registerClient + 65) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        if (r4.getRevenue.getRevenue.getMediationNetwork("appsFlyerCount", 0) >= 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r3 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.getMediationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        r3 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.areAllFieldsValid);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
    
        r3 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.component1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r3 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0056, code lost:
    
        if (r1.length() == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getRevenue(com.appsflyer.internal.AFa1oSDK r11) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.getRevenue(com.appsflyer.internal.AFa1oSDK):void");
    }

    private void getMonetizationNetwork(String str) {
        AFa1oSDK mediationNetwork = new AFh1jSDK().getMediationNetwork(getMonetizationNetwork().getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0));
        mediationNetwork.component2 = str;
        if (str != null) {
            registerClient = (f11998e + 45) % 128;
            if (str.length() <= 5 || !getMonetizationNetwork().equals().getMediationNetwork(mediationNetwork)) {
                return;
            }
            AFj1cSDK.getMonetizationNetwork(getMonetizationNetwork().AFAdRevenueData(), new AFa1tSDK(mediationNetwork), 5L, TimeUnit.MILLISECONDS);
            f11998e = (registerClient + 53) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        getCurrencyIso4217Code(new Object[]{this, context}, -1799167514, 1799167526, System.identityHashCode(this));
    }

    @NonNull
    public final Map<String, Object> getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        String str;
        Context context = getMonetizationNetwork().values().AFAdRevenueData;
        AFd1rSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1kSDK component1 = getMonetizationNetwork().component1();
        boolean currencyIso4217Code = getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        boolean revenue = aFa1oSDK.getRevenue();
        Map<String, Object> map = aFa1oSDK.getRevenue;
        long time = new Date().getTime();
        boolean z6 = false;
        Object[] objArr = new Object[1];
        a(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 127 - Color.blue(0), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (currencyIso4217Code) {
                AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!revenue) {
                    str = aFa1oSDK.areAllFieldsValid;
                } else {
                    int i6 = f11998e + 117;
                    registerClient = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 40 / 0;
                    }
                    str = "Launch";
                }
                sb.append(str);
                aFLogger.i(aFh1vSDK, sb.toString(), true);
            }
            getCurrencyIso4217Code(new Object[]{context}, 2054602482, -2054602479, (int) System.currentTimeMillis());
            int mediationNetwork = getMediationNetwork(monetizationNetwork, revenue);
            if (aFa1oSDK.areAllFieldsValid != null) {
                f11998e = (registerClient + 125) % 128;
                z6 = true;
            }
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, z6);
            if (revenue && mediationNetwork == 1) {
                AppsFlyerProperties.getInstance().getMonetizationNetwork = true;
            }
            component1.getCurrencyIso4217Code(map, mediationNetwork, currencyIso4217Code2);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFf1bSDK aFf1bSDK) {
        registerClient = (f11998e + 43) % 128;
        AFd1kSDK monetizationNetwork = getMonetizationNetwork();
        if (aFf1bSDK == AFf1bSDK.SUCCESS) {
            monetizationNetwork.afErrorLog().getCurrencyIso4217Code();
        }
        if (!monetizationNetwork.copydefault().getCurrencyIso4217Code()) {
            int i6 = registerClient + 7;
            f11998e = i6 % 128;
            if (i6 % 2 != 0) {
                monetizationNetwork.i().getCurrencyIso4217Code();
                return;
            } else {
                monetizationNetwork.i().getCurrencyIso4217Code();
                int i7 = 15 / 0;
                return;
            }
        }
        monetizationNetwork.i().getMediationNetwork();
    }

    public static String getMonetizationNetwork(AFd1rSDK aFd1rSDK, String str) {
        int i6 = registerClient + 59;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            if (monetizationNetwork != null) {
                int i7 = registerClient + 103;
                f11998e = i7 % 128;
                if (i7 % 2 != 0) {
                    return monetizationNetwork;
                }
                throw null;
            }
            aFd1rSDK.AFAdRevenueData("CACHED_CHANNEL", str);
            return str;
        }
        aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        throw null;
    }

    public final void getCurrencyIso4217Code(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        registerClient = (f11998e + 29) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String monetizationNetwork = getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
            if (monetizationNetwork == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
                f11998e = (registerClient + 55) % 128;
            } else {
                JSONObject jSONObject2 = new JSONObject(monetizationNetwork);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                registerClient = (f11998e + 29) % 128;
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                getMonetizationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            getMonetizationNetwork(context).AFAdRevenueData("extraReferrers", jSONObject.toString());
        } catch (JSONException e6) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e6);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    public final AFd1rSDK getMonetizationNetwork(Context context) {
        int i6 = registerClient + 63;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            AFd1rSDK revenue = getMonetizationNetwork().getRevenue();
            f11998e = (registerClient + 111) % 128;
            return revenue;
        }
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        getMonetizationNetwork().getRevenue();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r2 = r2.getApplicationContext();
        r3 = r1.getMonetizationNetwork().AFKeystoreWrapper();
        new java.lang.Thread(new com.appsflyer.internal.AFa1bSDK(r2, (java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r3}, -1684451992, 1684451992, java.lang.System.identityHashCode(r3)), r1.getMonetizationNetwork().getMediationNetwork(), r5, r6, r7, r8, r9, r14)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    public static boolean getRevenue(Context context) {
        registerClient = (f11998e + 49) % 128;
        try {
            if (GoogleApiAvailability.m().g(context) == 0) {
                int i6 = registerClient + 79;
                f11998e = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 46 / 0;
                }
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i8 = f11998e + 87;
            registerClient = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException e6) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e6);
            return false;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        registerClient = (f11998e + 13) % 128;
        aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("setAndroidIdData", str);
        aFb1rSDK.getMonetizationNetwork().e().getRevenue = str;
        int i6 = f11998e + 9;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return null;
    }

    private static int getRevenue(AFd1rSDK aFd1rSDK, String str, boolean z6) {
        f11998e = (registerClient + 33) % 128;
        int mediationNetwork = aFd1rSDK.getMediationNetwork(str, 0);
        if (!z6) {
            return mediationNetwork;
        }
        registerClient = (f11998e + 57) % 128;
        int i6 = mediationNetwork + 1;
        aFd1rSDK.AFAdRevenueData(str, i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z6) {
        if (z6) {
            int i6 = registerClient + 67;
            f11998e = i6 % 128;
            if (i6 % 2 != 0) {
                getMonetizationNetwork().i().getMonetizationNetwork();
                return;
            } else {
                getMonetizationNetwork().i().getMonetizationNetwork();
                throw null;
            }
        }
        getMonetizationNetwork().i().getRevenue();
        f11998e = (registerClient + 79) % 128;
    }

    private void getRevenue(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1216379940, 1216379960, System.identityHashCode(this));
    }

    private static String getRevenue(String str) {
        return (String) getCurrencyIso4217Code(new Object[]{str}, 143536171, -143536152, (int) System.currentTimeMillis());
    }

    @SuppressLint({"DiscouragedApi"})
    private static void getCurrencyIso4217Code(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT < 31) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                int i6 = registerClient + 53;
                f11998e = i6 % 128;
                if (i6 % 2 != 0) {
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        f11998e = (registerClient + 33) % 128;
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName());
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    public static String getCurrencyIso4217Code() {
        int i6 = registerClient + 117;
        f11998e = i6 % 128;
        if (i6 % 2 != 0) {
            return (String) getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID}, 143536171, -143536152, (int) System.currentTimeMillis());
        }
        int i7 = 44 / 0;
        return (String) getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID}, 143536171, -143536152, (int) System.currentTimeMillis());
    }

    private void getCurrencyIso4217Code(Context context, AFh1qSDK aFh1qSDK) {
        registerClient = (f11998e + 23) % 128;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFh1oSDK component32 = getMonetizationNetwork().component3();
        AFh1sSDK AFAdRevenueData2 = AFa1mSDK.AFAdRevenueData(context);
        if (!(!component32.getCurrencyIso4217Code())) {
            component32.getCurrencyIso4217Code.put("api_name", aFh1qSDK.toString());
            component32.AFAdRevenueData(AFAdRevenueData2);
            f11998e = (registerClient + 3) % 128;
        }
        component32.getMonetizationNetwork();
    }

    private void getCurrencyIso4217Code(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            f11998e = (registerClient + 33) % 128;
            return;
        }
        this.getMonetizationNetwork = appsFlyerConversionListener;
        int i6 = f11998e + 67;
        registerClient = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        Map<String, Object> map2;
        f11998e = (registerClient + 91) % 128;
        if (map.containsKey("meta")) {
            map2 = (Map) map.get("meta");
        } else {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            map2 = hashMap;
        }
        int i6 = registerClient + 97;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 35 / 0;
        }
        return map2;
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Intent intent;
        registerClient = (f11998e + 13) % 128;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    f11998e = (registerClient + 75) % 128;
                    str = extras.getString("af");
                    if (str != null) {
                        f11998e = (registerClient + 97) % 128;
                        AFLogger.INSTANCE.w(AFh1vSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                    }
                }
                return str;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.ENGAGEMENT, th.getMessage(), th);
            }
        }
        return null;
    }

    private static int getCurrencyIso4217Code(AFd1rSDK aFd1rSDK, boolean z6) {
        int i6 = registerClient + 43;
        f11998e = i6 % 128;
        if (i6 % 2 == 0) {
            getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z6);
            throw null;
        }
        int revenue = getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z6);
        registerClient = (f11998e + 97) % 128;
        return revenue;
    }

    private void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, 1781271842, -1781271820, System.identityHashCode(this));
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long j6) {
        return (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(j6)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{str}, -1187185472, 1187185472, (int) System.currentTimeMillis())).booleanValue();
    }
}
