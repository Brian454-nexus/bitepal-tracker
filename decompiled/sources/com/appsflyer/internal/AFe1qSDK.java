package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlin.text.Regex;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int areAllFieldsValid = 0;
    private static byte[] component1 = null;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copy = 0;
    private static int copydefault = 1;
    private static short[] equals;
    private static String getRevenue;
    private final AFe1iSDK component4;
    private final AFe1wSDK getCurrencyIso4217Code;
    private final AFd1qSDK getMediationNetwork;
    private final AppsFlyerProperties getMonetizationNetwork;

    static {
        getCurrencyIso4217Code();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i6 = copydefault + 55;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public AFe1qSDK(AFe1wSDK aFe1wSDK, AFd1qSDK aFd1qSDK, AppsFlyerProperties appsFlyerProperties, AFe1iSDK aFe1iSDK) {
        this.getCurrencyIso4217Code = aFe1wSDK;
        this.getMediationNetwork = aFd1qSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
        this.component4 = aFe1iSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i6, int i7, int i8) {
        int i9 = ~i6;
        int i10 = (i6 * (-520)) + (i7 * 522) + ((~(i9 | i7 | i8)) * 521);
        int i11 = ~(i6 | (~i7));
        int i12 = i10 + (i11 * (-1042)) + ((i11 | (~(i7 | (~i8) | i9))) * 521);
        if (i12 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i12 != 2) {
            AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            String packageName = aFe1qSDK.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName();
            AFd1qSDK aFd1qSDK = aFe1qSDK.getMediationNetwork;
            AFe1tSDK aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{aFe1qSDK, AFe1sSDK.getRevenue(packageName, AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue), str, str2), new AFe1rSDK()}, -194014191, 194014192, System.identityHashCode(aFe1qSDK));
            copy = (copydefault + 119) % 128;
            return aFe1tSDK;
        }
        return getMediationNetwork(objArr);
    }

    private static void a(short s6, int i6, int i7, int i8, byte b6, Object[] objArr) {
        int i9;
        boolean z6;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        StringBuilder sb = new StringBuilder();
        int i10 = i6 + ((int) (component2 ^ 3554368215783393998L));
        boolean z7 = i10 != -1;
        if (!z7) {
            byte[] bArr = component1;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    $11 = ($10 + 9) % 128;
                    bArr2[i11] = (byte) (bArr[i11] ^ 3554368215783393998L);
                }
                bArr = bArr2;
            }
            i10 = bArr != null ? (byte) (((byte) (component1[((int) (component3 ^ 3554368215783393998L)) + i7] ^ 3554368215783393998L)) + ((int) (component2 ^ 3554368215783393998L))) : (short) (((short) (equals[((int) (component3 ^ 3554368215783393998L)) + i7] ^ 3554368215783393998L)) + ((int) (component2 ^ 3554368215783393998L)));
        }
        if (i10 > 0) {
            int i12 = ((i7 + i10) - 2) + ((int) (component3 ^ 3554368215783393998L));
            if (!z7) {
                $10 = ($11 + 41) % 128;
                i9 = 1;
            } else {
                i9 = 0;
            }
            aFk1jSDK.getCurrencyIso4217Code = i12 + i9;
            char c6 = (char) (((int) (areAllFieldsValid ^ 3554368215783393998L)) + i8);
            aFk1jSDK.AFAdRevenueData = c6;
            sb.append(c6);
            aFk1jSDK.getMonetizationNetwork = aFk1jSDK.AFAdRevenueData;
            byte[] bArr3 = component1;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i13 = 0; i13 < length2; i13++) {
                    $11 = ($10 + 33) % 128;
                    bArr4[i13] = (byte) (bArr3[i13] ^ 3554368215783393998L);
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $10 = ($11 + 71) % 128;
                z6 = true;
            } else {
                z6 = false;
            }
            aFk1jSDK.getRevenue = 1;
            while (aFk1jSDK.getRevenue < i10) {
                if (z6) {
                    byte[] bArr5 = component1;
                    aFk1jSDK.getCurrencyIso4217Code = aFk1jSDK.getCurrencyIso4217Code - 1;
                    aFk1jSDK.AFAdRevenueData = (char) (aFk1jSDK.getMonetizationNetwork + (((byte) (((byte) (bArr5[r7] ^ 3554368215783393998L)) + s6)) ^ b6));
                    $11 = ($10 + 107) % 128;
                } else {
                    short[] sArr = equals;
                    aFk1jSDK.getCurrencyIso4217Code = aFk1jSDK.getCurrencyIso4217Code - 1;
                    aFk1jSDK.AFAdRevenueData = (char) (aFk1jSDK.getMonetizationNetwork + (((short) (((short) (sArr[r7] ^ 3554368215783393998L)) + s6)) ^ b6));
                }
                sb.append(aFk1jSDK.AFAdRevenueData);
                aFk1jSDK.getMonetizationNetwork = aFk1jSDK.AFAdRevenueData;
                aFk1jSDK.getRevenue++;
            }
        }
        objArr[0] = sb.toString();
    }

    public final AFe1tSDK<String> getCurrencyIso4217Code(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", getRevenue());
        if (str2 != null) {
            int i6 = copydefault + 5;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                hashMap.put("brand_domain", str2);
                copydefault = (copy + 59) % 128;
            } else {
                hashMap.put("brand_domain", str2);
                throw null;
            }
        }
        String jSONObject = AFa1mSDK.getMediationNetwork((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (-67) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-864846193) - View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0) + 1981934312, (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        hashMap2.put(((String) objArr[0]).intern(), getRevenue(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append("/");
        sb.append(str);
        return getMonetizationNetwork(new AFe1mSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFe1oSDK(), true);
    }

    public final AFe1tSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        String monetizationNetwork;
        copydefault = (copy + 29) % 128;
        try {
            Object[] objArr = {map, str};
            boolean z6 = false;
            Map map2 = AFa1vSDK.registerClient;
            Object obj = map2.get(-113710151);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35, TextUtils.getOffsetAfter("", 0) + 37, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-113710151, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").matches(str2) || new Regex("3.?(\\d+)?.?(\\d+)").matches(str2)) {
                z6 = true;
            } else {
                copydefault = (copy + 77) % 128;
            }
            if (!(!z6)) {
                copydefault = (copy + 23) % 128;
                monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e6) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e6);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1vSDK.registerClient;
            Object obj = map2.get(-113710151);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, View.MeasureSpec.makeMeasureSpec(0, 0) + 37, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-113710151, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            copydefault = (copy + 71) % 128;
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getMediationNetwork(aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
            copy = (copydefault + 47) % 128;
            return aFe1tSDK;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1vSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th2, false, false);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        String monetizationNetwork;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1vSDK.registerClient;
            Object obj = map2.get(-113710151);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue(34 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 38, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-113710151, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            if (str2 != null) {
                copy = (copydefault + 25) % 128;
                if (str2.length() != 0) {
                    copy = (copydefault + 103) % 128;
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").matches(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str2)) {
                        monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
                    }
                }
            }
            copy = (copydefault + 105) % 128;
            monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e6) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e6);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> AFAdRevenueData(AFa1oSDK aFa1oSDK, String str, AFd1nSDK aFd1nSDK) {
        copy = (copydefault + 43) % 128;
        try {
            Object[] objArr = {aFa1oSDK, str, aFd1nSDK};
            Map map = AFa1vSDK.registerClient;
            Object obj = map.get(1754022303);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue(TextUtils.lastIndexOf("", '0') + 36, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, (char) View.combineMeasuredStates(0, 0))).getMethod("getRevenue", AFa1oSDK.class, String.class, AFd1nSDK.class);
                map.put(1754022303, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            copydefault = (copy + 49) % 128;
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFa1oSDK.component4, bArr, "POST", Collections.EMPTY_MAP, aFa1oSDK.AFAdRevenueData()), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th2);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> getMonetizationNetwork(@NonNull String str) {
        AFe1mSDK aFe1mSDK = new AFe1mSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFe1mSDK.component3 = 10000;
        aFe1mSDK.AFAdRevenueData = false;
        AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        copydefault = (copy + 25) % 128;
        return aFe1tSDK;
    }

    @NonNull
    public final AFe1tSDK<DdlResponse> getRevenue(AFc1qSDK aFc1qSDK) {
        AFe1tSDK<DdlResponse> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFc1qSDK.component4, AFa1mSDK.getMediationNetwork((Map<String, ?>) aFc1qSDK.getMonetizationNetwork()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFc1qSDK.AFAdRevenueData()), new AFc1jSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i6 = copydefault + 105;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 97 / 0;
        }
        return aFe1tSDK;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        AFe1mSDK aFe1mSDK = (AFe1mSDK) objArr[1];
        AFe1jSDK aFe1jSDK = (AFe1jSDK) objArr[2];
        copydefault = (copy + 89) % 128;
        AFe1tSDK monetizationNetwork = aFe1qSDK.getMonetizationNetwork(aFe1mSDK, aFe1jSDK, aFe1qSDK.getMediationNetwork());
        int i6 = copy + 59;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        UUID uuid = (UUID) objArr[3];
        String str3 = (String) objArr[4];
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> revenue = aFe1qSDK.getRevenue();
        String valueOf = String.valueOf(revenue.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(revenue.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(revenue.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(revenue.get("sdk")));
        Object[] objArr2 = new Object[1];
        a((short) (Process.myPid() >> 22), (-68) - View.resolveSizeAndState(0, 0, 0), (-864846193) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1981934312 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
        hashMap.put(((String) objArr2[0]).intern(), getRevenue(str3, obj, "GET", obj, str, str2, valueOf));
        AFe1tSDK aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{aFe1qSDK, new AFe1mSDK(obj2, null, "GET", hashMap, false), new AFe1gSDK()}, -194014191, 194014192, System.identityHashCode(aFe1qSDK));
        int i6 = copy + 45;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return aFe1tSDK;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
    
        r5 = com.appsflyer.internal.AFe1qSDK.copy + 27;
        com.appsflyer.internal.AFe1qSDK.copydefault = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r5 = com.appsflyer.internal.AFe1iSDK.AFAdRevenueData;
        r1 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        r5 = com.appsflyer.internal.AFe1iSDK.AFAdRevenueData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x001f, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r5 = com.appsflyer.internal.AFe1iSDK.getMediationNetwork;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1tSDK<com.appsflyer.internal.AFi1vSDK> getCurrencyIso4217Code(boolean r5, boolean r6, @androidx.annotation.NonNull java.lang.String r7, int r8) {
        /*
            r4 = this;
            int r8 = com.appsflyer.internal.AFe1qSDK.copy
            int r8 = r8 + 29
            int r0 = r8 % 128
            com.appsflyer.internal.AFe1qSDK.copydefault = r0
            int r8 = r8 % 2
            java.lang.String r0 = ""
            if (r8 != 0) goto L1a
            com.appsflyer.internal.AFe1iSDK r8 = r4.component4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r1 = 51
            int r1 = r1 / 0
            if (r5 == 0) goto L37
            goto L21
        L1a:
            com.appsflyer.internal.AFe1iSDK r8 = r4.component4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r5 == 0) goto L37
        L21:
            int r5 = com.appsflyer.internal.AFe1qSDK.copy
            int r5 = r5 + 27
            int r1 = r5 % 128
            com.appsflyer.internal.AFe1qSDK.copydefault = r1
            int r5 = r5 % 2
            if (r5 != 0) goto L34
            java.lang.String r5 = com.appsflyer.internal.AFe1iSDK.AFAdRevenueData
            r1 = 26
            int r1 = r1 / 0
            goto L39
        L34:
            java.lang.String r5 = com.appsflyer.internal.AFe1iSDK.AFAdRevenueData
            goto L39
        L37:
            java.lang.String r5 = com.appsflyer.internal.AFe1iSDK.getMediationNetwork
        L39:
            r1 = 0
            if (r6 == 0) goto L4c
            int r6 = com.appsflyer.internal.AFe1qSDK.copydefault
            int r6 = r6 + 119
            int r2 = r6 % 128
            com.appsflyer.internal.AFe1qSDK.copy = r2
            int r6 = r6 % 2
            if (r6 != 0) goto L4b
            java.lang.String r6 = "stg"
            goto L4d
        L4b:
            throw r1
        L4c:
            r6 = r0
        L4d:
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            boolean r2 = com.appsflyer.internal.AFe1iSDK.getCurrencyIso4217Code()
            if (r2 == 0) goto L73
            int r2 = com.appsflyer.internal.AFe1qSDK.copy
            int r2 = r2 + 117
            int r3 = r2 % 128
            com.appsflyer.internal.AFe1qSDK.copydefault = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L6a
            kotlin.Lazy r1 = r8.getCurrencyIso4217Code
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            goto L74
        L6a:
            kotlin.Lazy r5 = r8.getCurrencyIso4217Code
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            throw r1
        L73:
            r1 = r0
        L74:
            java.lang.String r8 = r8.AFAdRevenueData()
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6, r8, r7}
            r7 = 4
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r5 = java.lang.String.format(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            com.appsflyer.internal.AFe1mSDK r6 = new com.appsflyer.internal.AFe1mSDK
            java.lang.String r7 = "GET"
            r6.<init>(r5, r7)
            r5 = 1500(0x5dc, float:2.102E-42)
            r6.component3 = r5
            com.appsflyer.internal.AFe1pSDK r5 = new com.appsflyer.internal.AFe1pSDK
            r5.<init>()
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r6, r5}
            int r6 = java.lang.System.identityHashCode(r4)
            r7 = -194014191(0xfffffffff46f9411, float:-7.592542E31)
            r8 = 194014192(0xb906bf0, float:5.562919E-32)
            java.lang.Object r5 = AFAdRevenueData(r5, r7, r8, r6)
            com.appsflyer.internal.AFe1tSDK r5 = (com.appsflyer.internal.AFe1tSDK) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1qSDK.getCurrencyIso4217Code(boolean, boolean, java.lang.String, int):com.appsflyer.internal.AFe1tSDK");
    }

    public final AFe1tSDK<String> AFAdRevenueData(AFh1hSDK aFh1hSDK) {
        AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFh1hSDK.component4, aFh1hSDK.getMediationNetwork(), "POST", Collections.EMPTY_MAP, true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i6 = copydefault + 31;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return aFe1tSDK;
        }
        throw null;
    }

    private <T> AFe1tSDK<T> getMonetizationNetwork(AFe1mSDK aFe1mSDK, AFe1jSDK<T> aFe1jSDK, boolean z6) {
        aFe1mSDK.getMonetizationNetwork = z6;
        AFe1wSDK aFe1wSDK = this.getCurrencyIso4217Code;
        AFe1tSDK<T> aFe1tSDK = new AFe1tSDK<>(aFe1mSDK, aFe1wSDK.getMonetizationNetwork, aFe1wSDK.getMediationNetwork, aFe1jSDK);
        int i6 = copy + 89;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return aFe1tSDK;
        }
        throw null;
    }

    private Map<String, Object> getRevenue() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.15.2");
        hashMap.put("counter", Integer.valueOf(this.getMediationNetwork.getRevenue.getMediationNetwork("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) - 75, TextUtils.indexOf((CharSequence) "", '0', 0) - 864846181, 1981934345 - Color.red(0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData;
        hashMap.put("app_version_name", AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
        hashMap.put("app_id", this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName());
        hashMap.put("platformextension", new AFb1aSDK().getMediationNetwork());
        int i6 = copydefault + 29;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return hashMap;
    }

    public final AFe1ySDK AFAdRevenueData(Map<String, Object> map, String str) {
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1vSDK.registerClient;
                Object obj = map2.get(-113710151);
                if (obj == null) {
                    obj = ((Class) AFa1vSDK.getRevenue(MotionEvent.axisFromString("") + 36, 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map2.put(-113710151, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                copydefault = (copy + 99) % 128;
                AFe1ySDK aFe1ySDK = new AFe1ySDK(this.getMediationNetwork, bArr);
                int i6 = copy + 101;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    return aFe1ySDK;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e6);
            return null;
        }
    }

    private <T> AFe1tSDK<T> AFAdRevenueData(AFe1mSDK aFe1mSDK, AFe1jSDK<T> aFe1jSDK) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, aFe1jSDK}, -194014191, 194014192, System.identityHashCode(this));
    }

    private boolean getMediationNetwork() {
        if (this.getMonetizationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        int i6 = (copydefault + 77) % 128;
        copy = i6;
        copydefault = (i6 + 67) % 128;
        return true;
    }

    public final AFe1tSDK<Map<String, Object>> getMediationNetwork(String str, String str2) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, str, str2}, -465858035, 465858035, System.identityHashCode(this));
    }

    public static void getCurrencyIso4217Code() {
        component3 = 1161415615;
        component2 = 1991592606;
        areAllFieldsValid = -9740393;
        component1 = new byte[]{Base64.padSymbol, 51, -49, -35, Base64.padSymbol, -55, 48, -40, -24, 9, -21, 56, -61, 33, -34, -50, -50};
    }

    public final AFe1tSDK<Map<String, String>> getCurrencyIso4217Code(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, str, str2, uuid, str3}, -15930200, 15930202, System.identityHashCode(this));
    }

    private static String getRevenue(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(join, sb.toString());
        int i6 = copydefault + 11;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }
}
