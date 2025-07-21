package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1wSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int[] component3 = {-822670749, 1075086223, 147004145, 479090167, -532315947, 551557374, 1465503631, -1445164187, -1205793421, -530934650, 1110614146, 1724100027, -1279723807, 1741964355, -470761703, -2125897653, 1290985041, -235853772};
    private static int copy = 1;

    @NonNull
    private final AFd1nSDK AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component4;
    private long getCurrencyIso4217Code;

    @NonNull
    private final AFg1uSDK getMediationNetwork;
    Map<String, Object> getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component1 = false;

    /* renamed from: com.appsflyer.internal.AFg1wSDK$4 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass4 implements AFg1uSDK.AFa1vSDK {
        public AnonymousClass4() {
        }

        @Override // com.appsflyer.internal.AFg1uSDK.AFa1vSDK
        public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
            AFg1wSDK.this.getRevenue = new ConcurrentHashMap();
            AFg1wSDK.this.getRevenue.put("signedData", str);
            AFg1wSDK.this.getRevenue.put("signature", str2);
            AFg1wSDK.this.component2();
            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
        }

        @Override // com.appsflyer.internal.AFg1uSDK.AFa1vSDK
        public final void getCurrencyIso4217Code(String str, Exception exc) {
            AFg1wSDK.this.getRevenue = new ConcurrentHashMap();
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            AFg1wSDK.this.component2();
            AFg1wSDK.this.getRevenue.put("error", message);
            AFLogger.afErrorLog(str, exc, true, true, false);
        }
    }

    public AFg1wSDK(@NonNull AFd1nSDK aFd1nSDK, @NonNull AFg1uSDK aFg1uSDK) {
        this.AFAdRevenueData = aFd1nSDK;
        this.getMediationNetwork = aFg1uSDK;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1pSDK aFd1pSDK = new AFd1pSDK((Map) objArr[1], ((AFg1wSDK) objArr[0]).AFAdRevenueData.AFAdRevenueData);
        int i6 = component2 + 89;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private static void a(int[] iArr, int i6, Object[] objArr) {
        int length;
        int[] iArr2;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                int i8 = $11 + 27;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    iArr4[i7] = (int) (iArr3[i7] ^ 7040698834646313678L);
                } else {
                    iArr4[i7] = (int) (iArr3[i7] ^ 7040698834646313678L);
                    i7++;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int i9 = $10 + 11;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                iArr2[i10] = (int) (iArr6[i10] ^ 7040698834646313678L);
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFk1pSDK.AFAdRevenueData = 0;
        while (true) {
            int i11 = aFk1pSDK.AFAdRevenueData;
            if (i11 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i6);
                return;
            }
            int i12 = iArr[i11];
            char c6 = (char) (i12 >> 16);
            cArr[0] = c6;
            char c7 = (char) i12;
            cArr[1] = c7;
            char c8 = (char) (iArr[i11 + 1] >> 16);
            cArr[2] = c8;
            char c9 = (char) iArr[i11 + 1];
            cArr[3] = c9;
            aFk1pSDK.getCurrencyIso4217Code = (c6 << 16) + c7;
            aFk1pSDK.getMonetizationNetwork = (c8 << 16) + c9;
            AFk1pSDK.getCurrencyIso4217Code(iArr5);
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = aFk1pSDK.getCurrencyIso4217Code ^ iArr5[i13];
                aFk1pSDK.getCurrencyIso4217Code = i14;
                int revenue = AFk1pSDK.getRevenue(i14) ^ aFk1pSDK.getMonetizationNetwork;
                int i15 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = revenue;
                aFk1pSDK.getMonetizationNetwork = i15;
            }
            int i16 = aFk1pSDK.getCurrencyIso4217Code;
            int i17 = aFk1pSDK.getMonetizationNetwork;
            aFk1pSDK.getCurrencyIso4217Code = i17;
            aFk1pSDK.getMonetizationNetwork = i16;
            int i18 = i16 ^ iArr5[16];
            aFk1pSDK.getMonetizationNetwork = i18;
            int i19 = i17 ^ iArr5[17];
            aFk1pSDK.getCurrencyIso4217Code = i19;
            cArr[0] = (char) (i19 >>> 16);
            cArr[1] = (char) i19;
            cArr[2] = (char) (i18 >>> 16);
            cArr[3] = (char) i18;
            AFk1pSDK.getCurrencyIso4217Code(iArr5);
            int i20 = aFk1pSDK.AFAdRevenueData;
            cArr2[i20 * 2] = cArr[0];
            cArr2[(i20 * 2) + 1] = cArr[1];
            cArr2[(i20 * 2) + 2] = cArr[2];
            cArr2[(i20 * 2) + 3] = cArr[3];
            aFk1pSDK.AFAdRevenueData = i20 + 2;
        }
    }

    private boolean areAllFieldsValid() {
        Map<String, Object> map = this.getRevenue;
        if (map != null) {
            int i6 = copy + 3;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                map.isEmpty();
                throw null;
            }
            if (!map.isEmpty()) {
                int i7 = component2 + 97;
                copy = i7 % 128;
                return i7 % 2 != 0;
            }
        }
        return false;
    }

    private long component4() {
        int i6 = copy + 29;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return this.getCurrencyIso4217Code;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i6, int i7, int i8) {
        int i9 = ~i7;
        int i10 = ~i8;
        int i11 = ~(i9 | i10);
        int i12 = ~i6;
        int i13 = (i6 * 371) + (i7 * 371) + ((i11 | (~(i12 | i8))) * (-370));
        int i14 = (~(i8 | i9)) | (~(i10 | i12));
        int i15 = ~(i6 | i7);
        int i16 = i13 + ((i14 | i15) * (-370)) + (i15 * 370);
        if (i16 == 1) {
            AFg1wSDK aFg1wSDK = (AFg1wSDK) objArr[0];
            String str = (String) objArr[1];
            copy = (component2 + 107) % 128;
            aFg1wSDK.areAllFieldsValid = str;
            copy = (component2 + 103) % 128;
            return null;
        }
        if (i16 != 2) {
            AFg1wSDK aFg1wSDK2 = (AFg1wSDK) objArr[0];
            copy = (component2 + 61) % 128;
            String str2 = aFg1wSDK2.component4;
            copy = (component2 + 53) % 128;
            return str2;
        }
        return AFAdRevenueData(objArr);
    }

    public final void component2() {
        int i6 = copy + 91;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        this.getRevenue.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code));
        this.getRevenue.put("lvl_timestamp", Long.valueOf(component4()));
    }

    @NonNull
    public final Map<String, Object> getMediationNetwork() {
        HashMap hashMap = new HashMap();
        if (areAllFieldsValid()) {
            copy = (component2 + 65) % 128;
            hashMap.put("lvl", this.getRevenue);
            return hashMap;
        }
        if (this.getMonetizationNetwork) {
            this.getRevenue = new HashMap();
            component2();
            this.getRevenue.put("error", "pending LVL response");
            hashMap.put("lvl", this.getRevenue);
            copy = (component2 + 73) % 128;
        }
        return hashMap;
    }

    public final boolean getMonetizationNetwork() {
        component2 = (copy + 19) % 128;
        if (this.getMonetizationNetwork && (!areAllFieldsValid())) {
            return true;
        }
        int i6 = component2 + 41;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final String getRevenue() {
        component2 = (copy + 61) % 128;
        String str = this.areAllFieldsValid;
        component2 = (copy + 55) % 128;
        return str;
    }

    private long getMonetizationNetwork(AFd1qSDK aFd1qSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue));
        sb.append(component4());
        long revenue = AFb1jSDK.getRevenue(sb.toString());
        int i6 = component2 + 11;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public final String getRevenue(AFd1rSDK aFd1rSDK) {
        String str;
        boolean z6 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("imeiCached", (String) null);
        if (z6 && AFc1sSDK.getRevenue(this.areAllFieldsValid)) {
            Context context = this.AFAdRevenueData.AFAdRevenueData;
            if (context != null) {
                int i6 = component2 + 117;
                copy = i6 % 128;
                if (i6 % 2 != 0) {
                    if (!(!getMonetizationNetwork(context))) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                        } catch (InvocationTargetException e6) {
                            if (monetizationNetwork != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                            } else {
                                monetizationNetwork = null;
                            }
                            StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                            sb.append(e6.getMessage());
                            AFLogger.afErrorLog(sb.toString(), e6);
                        } catch (Exception e7) {
                            if (monetizationNetwork != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                            } else {
                                monetizationNetwork = null;
                            }
                            StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                            sb2.append(e7.getMessage());
                            AFLogger.afErrorLog(sb2.toString(), e7);
                        }
                        if (str == null) {
                            if (monetizationNetwork != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                            } else {
                                monetizationNetwork = null;
                            }
                            copy = (component2 + 53) % 128;
                            str = monetizationNetwork;
                        }
                    }
                } else {
                    getMonetizationNetwork(context);
                    throw null;
                }
            }
            str = null;
        } else {
            if (this.areAllFieldsValid != null) {
                str = this.areAllFieldsValid;
            }
            str = null;
        }
        if (!AFc1sSDK.getRevenue(str)) {
            aFd1rSDK.AFAdRevenueData("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue(r2) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue(r2) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r8.getCurrencyIso4217Code = r2.substring(0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r2 = com.appsflyer.internal.AFd1qSDK.getMediationNetwork();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void AFAdRevenueData(java.util.Map<java.lang.String, java.lang.Object> r7, com.appsflyer.internal.AFd1qSDK r8) {
        /*
            r0 = 1
            r1 = 57
            java.lang.String r2 = r8.getCurrencyIso4217Code
            boolean r2 = com.appsflyer.internal.AFc1sSDK.getRevenue(r2)
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L3d
            int r2 = com.appsflyer.internal.AFg1wSDK.component2
            int r2 = r2 + 69
            int r5 = r2 % 128
            com.appsflyer.internal.AFg1wSDK.copy = r5
            int r2 = r2 % 2
            java.lang.String r5 = "com.appsflyer.security.uuid"
            if (r2 != 0) goto L29
            java.lang.String r2 = r8.getRevenue(r5)
            boolean r5 = com.appsflyer.internal.AFc1sSDK.getRevenue(r2)
            int r6 = r1 / 0
            if (r5 == 0) goto L37
            goto L33
        L29:
            java.lang.String r2 = r8.getRevenue(r5)
            boolean r5 = com.appsflyer.internal.AFc1sSDK.getRevenue(r2)
            if (r5 == 0) goto L37
        L33:
            java.lang.String r2 = com.appsflyer.internal.AFd1qSDK.getMediationNetwork()
        L37:
            java.lang.String r2 = r2.substring(r4, r3)
            r8.getCurrencyIso4217Code = r2
        L3d:
            java.lang.String r8 = r8.getCurrencyIso4217Code
            r2 = 6
            int[] r2 = new int[r2]     // Catch: java.lang.Exception -> L8d
            r2 = {x0098: FILL_ARRAY_DATA , data: [1091213027, 1132401161, -1174855883, -1091241639, -1587464187, 1289805057} // fill-array     // Catch: java.lang.Exception -> L8d
            int r5 = android.view.ViewConfiguration.getTouchSlop()     // Catch: java.lang.Exception -> L8d
            int r3 = r5 >> 8
            int r3 = 12 - r3
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L8d
            a(r2, r3, r5)     // Catch: java.lang.Exception -> L8d
            r2 = r5[r4]     // Catch: java.lang.Exception -> L8d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L8d
            java.lang.String r2 = r2.intern()     // Catch: java.lang.Exception -> L8d
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Exception -> L8d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L8d
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L8d
            char[] r8 = r8.toCharArray()     // Catch: java.lang.Exception -> L8d
            r5 = 94
            long r2 = r2 % r5
            int r2 = (int) r2
            int r2 = r2 + 33
            int r3 = com.appsflyer.internal.AFg1wSDK.copy
            int r3 = r3 + r1
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1wSDK.component2 = r3
        L77:
            int r1 = r8.length     // Catch: java.lang.Exception -> L8d
            if (r4 >= r1) goto L82
            char r1 = r8[r4]     // Catch: java.lang.Exception -> L8d
            r1 = r1 ^ r2
            char r1 = (char) r1     // Catch: java.lang.Exception -> L8d
            r8[r4] = r1     // Catch: java.lang.Exception -> L8d
            int r4 = r4 + r0
            goto L77
        L82:
            java.lang.String r0 = "sbid"
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L8d
            r1.<init>(r8)     // Catch: java.lang.Exception -> L8d
            r7.put(r0, r1)     // Catch: java.lang.Exception -> L8d
            return
        L8d:
            r7 = move-exception
            com.appsflyer.AFLogger r8 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r0 = com.appsflyer.internal.AFh1vSDK.GENERAL
            java.lang.String r1 = "Exception occurred while generating sbid "
            r8.e(r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1wSDK.AFAdRevenueData(java.util.Map, com.appsflyer.internal.AFd1qSDK):void");
    }

    private static boolean getMonetizationNetwork(Context context) {
        copy = (component2 + 23) % 128;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i6 = component2 + 41;
            copy = i6 % 128;
            if (i6 % 2 != 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AFb1rSDK.getRevenue();
                return AFb1rSDK.getRevenue(context) ^ true;
            }
        }
        component2 = (copy + 15) % 128;
    }

    public final void getCurrencyIso4217Code(String str) {
        component2 = (copy + 121) % 128;
        this.component4 = str;
        int i6 = component2 + 65;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        int i6 = component2 + 99;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return this.component1;
        }
        int i7 = 49 / 0;
        return this.component1;
    }

    public final void getCurrencyIso4217Code(boolean z6) {
        int i6 = copy + 109;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            this.component1 = z6;
        } else {
            this.component1 = z6;
            throw null;
        }
    }

    public final void getMediationNetwork(AFd1qSDK aFd1qSDK) {
        this.getCurrencyIso4217Code = System.currentTimeMillis();
        this.getMonetizationNetwork = this.getMediationNetwork.getMediationNetwork(getMonetizationNetwork(aFd1qSDK), this.AFAdRevenueData.AFAdRevenueData, new AFg1uSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFg1wSDK.4
            public AnonymousClass4() {
            }

            @Override // com.appsflyer.internal.AFg1uSDK.AFa1vSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFg1wSDK.this.getRevenue = new ConcurrentHashMap();
                AFg1wSDK.this.getRevenue.put("signedData", str);
                AFg1wSDK.this.getRevenue.put("signature", str2);
                AFg1wSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFg1uSDK.AFa1vSDK
            public final void getCurrencyIso4217Code(String str, Exception exc) {
                AFg1wSDK.this.getRevenue = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFg1wSDK.this.component2();
                AFg1wSDK.this.getRevenue.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        copy = (component2 + 9) % 128;
    }

    public final Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFAdRevenueData.AFAdRevenueData};
                Map map2 = AFa1vSDK.registerClient;
                Object obj = map2.get(-1068415224);
                if (obj == null) {
                    obj = ((Class) AFa1vSDK.getRevenue(Color.blue(0) + 37, 360 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (40289 - View.combineMeasuredStates(0, 0)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-1068415224, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                int i6 = copy + 71;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return map3;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, map}, 896699170, -896699168, System.identityHashCode(this));
    }

    public static void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        try {
            new AFb1sSDK(aFa1oSDK).afInfoLog();
            copy = (component2 + 35) % 128;
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e6);
        }
    }

    public final String AFAdRevenueData() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1684451992, 1684451992, System.identityHashCode(this));
    }

    public final void getRevenue(@NonNull String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, 1318882910, -1318882909, System.identityHashCode(this));
    }
}
