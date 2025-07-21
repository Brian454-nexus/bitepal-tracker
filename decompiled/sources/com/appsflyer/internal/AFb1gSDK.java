package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1gSDK implements AFb1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFAdRevenueData;
    private static long component2 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault;
    private static char equals;
    private final AFd1kSDK component3;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMediationNetwork = true;

    @NonNull
    private final Map<String, Object> getRevenue = new HashMap();
    private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean areAllFieldsValid = false;

    static {
        component2();
        AFAdRevenueData = 98166;
        copydefault = (copy + 55) % 128;
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.component3 = aFd1kSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c6, String str, String str2, String str3, int i6, Object[] objArr) {
        char[] cArr;
        if (str3 != null) {
            int i7 = $10 + 117;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray2, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c6);
        cArr4[2] = (char) (cArr4[2] + ((char) i6));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        aFk1sSDK.getMediationNetwork = 0;
        while (true) {
            int i8 = aFk1sSDK.getMediationNetwork;
            if (i8 >= length3) {
                break;
            }
            $11 = ($10 + 63) % 128;
            int i9 = (i8 + 3) % 4;
            int i10 = cArr3[i8 % 4] * 32718;
            char c7 = cArr4[(i8 + 2) % 4];
            char c8 = (char) ((i10 + c7) % 65535);
            aFk1sSDK.getMonetizationNetwork = c8;
            cArr4[i9] = (char) (((cArr3[i9] * 32718) + c7) / 65535);
            cArr3[i9] = c8;
            cArr5[i8] = (char) ((((charArray[i8] ^ c8) ^ (component2 ^ 4316357171685541830L)) ^ ((int) (component4 ^ 4316357171685541830L))) ^ ((char) (equals ^ 4316357171685541830L)));
            aFk1sSDK.getMediationNetwork = i8 + 1;
        }
        String str4 = new String(cArr5);
        int i11 = $11 + 25;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    private static String component1() {
        int i6 = copydefault + 75;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return "6.15.2";
        }
        throw null;
    }

    public static void component2() {
        component2 = -7965111987969810777L;
        component4 = -2046375994;
        equals = (char) 51142;
    }

    private static float component3() {
        float nextFloat = new Random().nextFloat();
        int i6 = copy + 89;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return nextFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.areAllFieldsValid = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        getMonetizationNetwork("r_debugging_on", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", java.util.Locale.ENGLISH).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r0 = com.appsflyer.internal.AFb1gSDK.copydefault + 45;
        com.appsflyer.internal.AFb1gSDK.copy = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r0 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.e(com.appsflyer.internal.AFh1vSDK.PROXY, "Error while starting remote debugger", r0, true, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x001c, code lost:
    
        if (r8.areAllFieldsValid != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r8.areAllFieldsValid != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void component4() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = com.appsflyer.internal.AFb1gSDK.copydefault     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1gSDK.copy = r1     // Catch: java.lang.Throwable -> L18
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L1a
            boolean r0 = r8.areAllFieldsValid     // Catch: java.lang.Throwable -> L18
            r2 = 93
            int r2 = r2 / r1
            if (r0 == 0) goto L20
            goto L1e
        L16:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            goto L61
        L1a:
            boolean r0 = r8.areAllFieldsValid     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L20
        L1e:
            monitor-exit(r8)
            return
        L20:
            r0 = 1
            r8.areAllFieldsValid = r0     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "r_debugging_on"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ssZ"
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L51
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L51
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r2.format(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L51
            r8.getMonetizationNetwork(r0, r2, r1)     // Catch: java.lang.Throwable -> L51
            int r0 = com.appsflyer.internal.AFb1gSDK.copydefault     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1gSDK.copy = r1     // Catch: java.lang.Throwable -> L18
            int r0 = r0 % 2
            if (r0 == 0) goto L4d
            monitor-exit(r8)
            return
        L4d:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L51:
            r0 = move-exception
            r4 = r0
            com.appsflyer.AFLogger r1 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L18
            com.appsflyer.internal.AFh1vSDK r2 = com.appsflyer.internal.AFh1vSDK.PROXY     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "Error while starting remote debugger"
            r6 = 1
            r7 = 1
            r5 = 1
            r1.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r8)
            return
        L61:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1gSDK.component4():void");
    }

    @NonNull
    private synchronized Map<String, Object> copy() {
        int i6 = copydefault + 3;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            this.getRevenue.put("data", this.getCurrencyIso4217Code);
            copydefault();
            throw null;
        }
        this.getRevenue.put("data", this.getCurrencyIso4217Code);
        copydefault();
        return this.getRevenue;
    }

    private synchronized void copydefault() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (copy + 41) % 128;
    }

    private boolean equals() {
        int i6 = copy;
        copydefault = (i6 + 105) % 128;
        if (!this.component1) {
            return false;
        }
        copydefault = (i6 + 123) % 128;
        if (!this.getMediationNetwork && !this.areAllFieldsValid) {
            return false;
        }
        copydefault = (i6 + 41) % 128;
        return true;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i6, int i7, int i8) {
        AFh1cSDK aFh1cSDK;
        int i9 = ~((~i6) | i7);
        int i10 = (i6 * 71) + (i7 * (-69)) + (((~(i7 | i8)) | i9) * (-140)) + ((~(i6 | i7 | i8)) * 70) + (((~(i6 | i8)) | (~((~i7) | i6)) | i9) * 70);
        if (i10 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i10 == 2) {
            return getRevenue(objArr);
        }
        if (i10 != 3) {
            float floatValue = ((Number) objArr[0]).floatValue();
            double d6 = floatValue;
            if (d6 >= 1.0d) {
                return Boolean.TRUE;
            }
            if (d6 <= 0.0d) {
                copy = (copydefault + 111) % 128;
                return Boolean.FALSE;
            }
            if (component3() > floatValue) {
                return Boolean.FALSE;
            }
            copy = (copydefault + 121) % 128;
            return Boolean.TRUE;
        }
        AFi1vSDK aFi1vSDK = (AFi1vSDK) objArr[0];
        int i11 = copy;
        copydefault = (i11 + 43) % 128;
        if (aFi1vSDK != null && (aFh1cSDK = aFi1vSDK.getRevenue) != null) {
            return aFh1cSDK.getCurrencyIso4217Code;
        }
        copydefault = (i11 + 15) % 128;
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1gSDK aFb1gSDK = (AFb1gSDK) objArr[0];
        String str = (String) objArr[1];
        PackageManager packageManager = (PackageManager) objArr[2];
        int i6 = copy + 107;
        copydefault = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                Map<String, Object> l_ = aFb1gSDK.l_(str, packageManager);
                AFg1wSDK AFKeystoreWrapper = aFb1gSDK.component3.AFKeystoreWrapper();
                final AFe1ySDK AFAdRevenueData2 = aFb1gSDK.component3.getCurrencyIso4217Code().AFAdRevenueData(l_, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper)));
                if (AFAdRevenueData2 == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    copy = (copydefault + 1) % 128;
                    return null;
                }
                aFb1gSDK.component3.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1ySDK.this.AFAdRevenueData();
                    }
                });
                return null;
            }
            Map<String, Object> l_2 = aFb1gSDK.l_(str, packageManager);
            AFg1wSDK AFKeystoreWrapper2 = aFb1gSDK.component3.AFKeystoreWrapper();
            aFb1gSDK.component3.getCurrencyIso4217Code().AFAdRevenueData(l_2, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper2}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper2)));
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
            return null;
        }
    }

    private Map<String, Object> l_(String str, PackageManager packageManager) {
        copy = (copydefault + 65) % 128;
        m_(str, packageManager, this.component3.AFKeystoreWrapper(), this.component3.e());
        Map<String, Object> copy2 = copy();
        int i6 = copydefault + 89;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return copy2;
        }
        throw null;
    }

    private synchronized void m_(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1tSDK aFd1tSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getRevenue.clear();
            if (string != null) {
                try {
                    this.getRevenue.putAll(AFa1mSDK.getRevenue(new JSONObject(string)));
                    copy = (copydefault + 59) % 128;
                } catch (Throwable unused) {
                }
            } else {
                AFb1rSDK revenue = AFb1rSDK.getRevenue();
                AdvertisingIdData advertisingIdData = AFb1rSDK.getRevenue().getMonetizationNetwork().getMediationNetwork().AFAdRevenueData.component4;
                String str2 = null;
                AFb1tSDK aFb1tSDK = advertisingIdData != null ? new AFb1tSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
                if (aFb1tSDK != null) {
                    copydefault = (copy + 3) % 128;
                    str2 = aFb1tSDK.getRevenue;
                }
                getMediationNetwork(str2, aFg1wSDK.getRevenue(), aFd1tSDK.getRevenue);
                StringBuilder sb = new StringBuilder("6.15.2.");
                sb.append(AFb1rSDK.getCurrencyIso4217Code);
                String obj = sb.toString();
                AFg1wSDK AFKeystoreWrapper = revenue.getMonetizationNetwork().AFKeystoreWrapper();
                getRevenue(obj, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper)), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    AFAdRevenueData(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getRevenue).toString());
            }
            this.getRevenue.put("launch_counter", String.valueOf(this.component3.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0)));
        } catch (Throwable th) {
            throw th;
        }
    }

    private void valueOf() {
        int i6 = copy + 107;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            this.component3.getRevenue().AFAdRevenueData("participantInProxy");
            throw null;
        }
        this.component3.getRevenue().AFAdRevenueData("participantInProxy");
        copy = (copydefault + 89) % 128;
    }

    private boolean values() {
        copydefault = (copy + 63) % 128;
        boolean mediationNetwork = this.component3.getRevenue().getMediationNetwork("participantInProxy");
        copydefault = (copy + 101) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void AFAdRevenueData() {
        try {
            if (!this.areAllFieldsValid) {
                int i6 = copy;
                copydefault = (i6 + 53) % 128;
                if (!this.getMediationNetwork) {
                    int i7 = i6 + 7;
                    copydefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        return;
                    } else {
                        throw null;
                    }
                }
            }
            this.areAllFieldsValid = false;
            this.getMediationNetwork = false;
            try {
                getMonetizationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean areAllFieldsValid() {
        int i6 = copy + 19;
        int i7 = i6 % 128;
        copydefault = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        boolean z6 = this.areAllFieldsValid;
        int i8 = i7 + 45;
        copy = i8 % 128;
        if (i8 % 2 != 0) {
            return z6;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean getCurrencyIso4217Code() {
        copydefault = (copy + 53) % 128;
        boolean mediationNetwork = getMediationNetwork((AFi1uSDK) getMonetizationNetwork(new Object[]{this.component3.component2().getCurrencyIso4217Code.getRevenue}, 1236177641, -1236177638, (int) System.currentTimeMillis()), (AFi1uSDK) getMonetizationNetwork(new Object[]{this.component3.component2().getCurrencyIso4217Code.AFAdRevenueData}, 1236177641, -1236177638, (int) System.currentTimeMillis()));
        if (mediationNetwork) {
            component4();
            copy = (copydefault + 25) % 128;
            return mediationNetwork;
        }
        getMediationNetwork();
        AFAdRevenueData();
        copy = (copydefault + 91) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, String... strArr) {
        copy = (copydefault + 71) % 128;
        getMonetizationNetwork("public_api_call", str, strArr);
        copy = (copydefault + 107) % 128;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void k_(String str, PackageManager packageManager) {
        getMonetizationNetwork(new Object[]{this, str, packageManager}, 1187970804, -1187970802, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, String str2) {
        copydefault = (copy + 55) % 128;
        getMonetizationNetwork("server_request", str, str2);
        int i6 = copy + 61;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, int i6, String str2) {
        copy = (copydefault + 63) % 128;
        getMonetizationNetwork("server_response", str, String.valueOf(i6), str2);
        int i7 = copy + 39;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 20 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void getMediationNetwork() {
        try {
            int i6 = copydefault + 19;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                this.getMediationNetwork = false;
                getMonetizationNetwork();
            } else {
                this.getMediationNetwork = false;
                getMonetizationNetwork();
            }
            copydefault();
            int i7 = copy + 23;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 73 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void AFAdRevenueData(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.getRevenue.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.getRevenue.put("app_version", str2);
            copydefault = (copy + 97) % 128;
        }
        if (str3 != null && str3.length() > 0) {
            this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
            copy = (copydefault + 61) % 128;
        }
        if (str4 != null) {
            copydefault = (copy + 41) % 128;
            if (str4.length() > 0) {
                copy = (copydefault + 57) % 128;
                this.getRevenue.put("preInstall", str4);
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void getMonetizationNetwork() {
        try {
            int i6 = copy + 115;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                this.getRevenue.clear();
                this.getCurrencyIso4217Code.clear();
            } else {
                this.getRevenue.clear();
                this.getCurrencyIso4217Code.clear();
            }
            this.getMonetizationNetwork = 0;
            copy = (copydefault + 21) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getRevenue() {
        int i6 = copydefault + 41;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            this.component1 = false;
        } else {
            this.component1 = false;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i6 = copydefault + 25;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            getMonetizationNetwork(null, str, str2);
        } else {
            getMonetizationNetwork(null, str, str2);
        }
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3) {
        copydefault = (copy + 67) % 128;
        try {
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            a((char) ((-16733443) - Color.rgb(0, 0, 0)), "鰒冷ﵪ\ue6aa", "쩽缤䈽\ufade쏟", "奡雜ﬣꪐ", 1783740316 - View.getDefaultSize(0, 0), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getRevenue.put("model", Build.MODEL);
            this.getRevenue.put("platform", "Android");
            this.getRevenue.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i6 = copy + 93;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    if (str.length() > 0) {
                        this.getRevenue.put("advertiserId", str);
                    }
                } else {
                    str.length();
                    throw null;
                }
            }
            if (str2 != null) {
                copy = (copydefault + 101) % 128;
                if (str2.length() > 0) {
                    this.getRevenue.put("imei", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i7 = copy + 97;
                copydefault = i7 % 128;
                if (i7 % 2 == 0) {
                    this.getRevenue.put("android_id", str3);
                } else {
                    this.getRevenue.put("android_id", str3);
                    throw null;
                }
            }
            copy = (copydefault + 85) % 128;
        } catch (Throwable unused) {
        }
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        try {
            this.getRevenue.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                int i6 = copy + 55;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    this.getRevenue.put("devkey", str2);
                } else {
                    this.getRevenue.put("devkey", str2);
                    throw null;
                }
            }
            if (str3 != null) {
                copydefault = (copy + 51) % 128;
                if (str3.length() > 0) {
                    this.getRevenue.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null) {
                copy = (copydefault + 77) % 128;
                if (str4.length() > 0) {
                    this.getRevenue.put("uid", str4);
                    copydefault = (copy + 83) % 128;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean getCurrencyIso4217Code(String str) {
        if (AFc1sSDK.getMonetizationNetwork(str)) {
            copy = (copydefault + 57) % 128;
            return true;
        }
        Context context = this.component3.getMediationNetwork().getMonetizationNetwork.AFAdRevenueData;
        boolean equals2 = str.equals(AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
        copy = (copydefault + 31) % 128;
        return equals2;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String message;
        StackTraceElement[] stackTrace;
        AFb1gSDK aFb1gSDK = (AFb1gSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
            copydefault = (copy + 27) % 128;
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            int i6 = copydefault + 33;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                stackTrace = th.getStackTrace();
                int i7 = 50 / 0;
            } else {
                stackTrace = th.getStackTrace();
            }
        } else {
            stackTrace = cause.getStackTrace();
        }
        aFb1gSDK.getMonetizationNetwork("exception", simpleName, getRevenue(message, stackTrace));
        int i8 = copydefault + 15;
        copy = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static boolean getCurrencyIso4217Code(float f6) {
        return ((Boolean) getMonetizationNetwork(new Object[]{Float.valueOf(f6)}, 169076754, -169076754, (int) System.currentTimeMillis())).booleanValue();
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        copy = (copydefault + 67) % 128;
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        int i6 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i6 < stackTraceElementArr.length) {
            int i7 = copydefault + 65;
            copy = i7 % 128;
            if (i7 % 2 == 0) {
                strArr[i6] = stackTraceElementArr[i6].toString();
                i6 += 106;
            } else {
                strArr[i6] = stackTraceElementArr[i6].toString();
                i6++;
            }
        }
        return strArr;
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String... strArr) {
        String obj;
        try {
            copydefault = (copy + 19) % 128;
            if (!equals() || this.getMonetizationNetwork >= 98304) {
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String join = TextUtils.join(", ", strArr);
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(currentTimeMillis);
                    sb.append(" ");
                    sb.append(Thread.currentThread().getId());
                    sb.append(" _/AppsFlyer_6.15.2 [");
                    sb.append(str);
                    sb.append("] ");
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(join);
                    obj = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(currentTimeMillis);
                    sb2.append(" ");
                    sb2.append(Thread.currentThread().getId());
                    sb2.append(" ");
                    sb2.append(str2);
                    sb2.append("/AppsFlyer_6.15.2 ");
                    sb2.append(join);
                    obj = sb2.toString();
                }
                int length = this.getMonetizationNetwork + (obj.length() << 1);
                int i6 = AFAdRevenueData;
                boolean z6 = false;
                if (length > i6) {
                    obj = obj.substring(0, (i6 - this.getMonetizationNetwork) / 2);
                    z6 = true;
                }
                this.getCurrencyIso4217Code.add(obj);
                this.getMonetizationNetwork += obj.length() << 1;
                if (z6) {
                    int i7 = copydefault + 43;
                    copy = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork += 24700;
                    } else {
                        this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork += 138;
                    }
                    copydefault = (copy + 37) % 128;
                }
                int i8 = copydefault + 55;
                copy = i8 % 128;
                if (i8 % 2 != 0) {
                } else {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean getMediationNetwork(AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        copy = (copydefault + 57) % 128;
        if (aFi1uSDK == null) {
            valueOf();
            return false;
        }
        if (!aFi1uSDK.getCurrencyIso4217Code()) {
            return false;
        }
        if (this.component3.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0) > aFi1uSDK.AFAdRevenueData) {
            return false;
        }
        if (!getRevenue(aFi1uSDK, aFi1uSDK2)) {
            int i6 = copy + 27;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            int i7 = 65 / 0;
            return false;
        }
        if (!getCurrencyIso4217Code(aFi1uSDK.getMonetizationNetwork)) {
            copy = (copydefault + 85) % 128;
            return false;
        }
        if (getMediationNetwork(aFi1uSDK.getMediationNetwork)) {
            return true;
        }
        int i8 = copydefault + 85;
        copy = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        int i9 = 26 / 0;
        return false;
    }

    private boolean getRevenue(@NonNull AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        boolean currencyIso4217Code;
        int i6 = copy + 47;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            if (aFi1uSDK.equals(aFi1uSDK2)) {
                copydefault = (copy + 119) % 128;
                currencyIso4217Code = values();
            } else {
                currencyIso4217Code = getCurrencyIso4217Code(aFi1uSDK.getRevenue);
                getMediationNetwork(currencyIso4217Code);
            }
            int i7 = copy + 39;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                return currencyIso4217Code;
            }
            throw null;
        }
        aFi1uSDK.equals(aFi1uSDK2);
        throw null;
    }

    private static AFi1uSDK getRevenue(AFi1vSDK aFi1vSDK) {
        return (AFi1uSDK) getMonetizationNetwork(new Object[]{aFi1vSDK}, 1236177641, -1236177638, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getRevenue(Throwable th) {
        getMonetizationNetwork(new Object[]{this, th}, 353230021, -353230020, System.identityHashCode(this));
    }

    private static boolean getMediationNetwork(String str) {
        int i6 = copy + 95;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            if (!AFc1sSDK.getMonetizationNetwork(str)) {
                new AFe1vSDK();
                return AFe1vSDK.getMonetizationNetwork(component1(), str);
            }
            int i7 = copy + 67;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 73 / 0;
            }
            return true;
        }
        AFc1sSDK.getMonetizationNetwork(str);
        throw null;
    }

    private void getMediationNetwork(boolean z6) {
        int i6 = copy + 79;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            this.component3.getRevenue().getRevenue("participantInProxy", z6);
            copy = (copydefault + 3) % 128;
        } else {
            this.component3.getRevenue().getRevenue("participantInProxy", z6);
            throw null;
        }
    }
}
