package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1pSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component3 = 1;
    private static char[] getMediationNetwork;
    private static int[] getMonetizationNetwork;
    private final Map<String, Object> getCurrencyIso4217Code;
    private final Context getRevenue;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class AFa1tSDK {
        @NonNull
        public static byte[] AFAdRevenueData(@NonNull String str) {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] AFAdRevenueData(@NonNull byte[] bArr) {
            for (int i6 = 0; i6 < bArr.length; i6++) {
                bArr[i6] = (byte) (bArr[i6] ^ ((i6 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getRevenue();
        TextUtils.getOffsetAfter("", 0);
        Color.green(0);
        ExpandableListView.getPackedPositionGroup(0L);
        View.MeasureSpec.getMode(0);
        AFAdRevenueData = (component3 + 33) % 128;
    }

    public AFd1pSDK(Map<String, Object> map, Context context) {
        this.getCurrencyIso4217Code = map;
        this.getRevenue = context;
        put(AFAdRevenueData(), getMonetizationNetwork());
    }

    @NonNull
    private String AFAdRevenueData() {
        component3 = (AFAdRevenueData + 17) % 128;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 39, 0}, objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            b(new int[]{-567587348, 685275732, 774183725, 1950249640}, 5 - (Process.myPid() >> 22), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                component3 = (AFAdRevenueData + 15) % 128;
                Object[] objArr3 = new Object[1];
                b(new int[]{771415351, 1340640973, 898108640, 1414007016}, 8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder monetizationNetwork = getMonetizationNetwork(num, obj2, sb.toString());
            int length = monetizationNetwork.length();
            if (length > 4) {
                component3 = (AFAdRevenueData + 121) % 128;
                monetizationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    int i6 = AFAdRevenueData + 63;
                    component3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length += 60;
                        monetizationNetwork.append('\\');
                    } else {
                        length++;
                        monetizationNetwork.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            b(new int[]{-1162491069, 578015546}, 3 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            monetizationNetwork.insert(0, ((String) objArr4[0]).intern());
            return monetizationNetwork.toString();
        } catch (Exception e6) {
            Object[] objArr5 = new Object[1];
            a("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001", true, new int[]{12, 40, 198, 0}, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e6);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(null, true, new int[]{52, 42, 5, 36}, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e6);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            b(new int[]{-1926642792, 534003380, 211775158, 1507918137}, TextUtils.getOffsetBefore("", 0) + 7, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static void a(String str, boolean z6, int[] iArr, Object[] objArr) {
        int i6;
        int length;
        char[] cArr;
        int i7;
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr2 = getMediationNetwork;
        if (cArr2 != null) {
            int i12 = $11 + 19;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i7 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i7 = 0;
            }
            while (i7 < length) {
                cArr[i7] = (char) (cArr2[i7] ^ 740144413554588574L);
                i7++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i9];
        System.arraycopy(cArr2, i8, cArr3, 0, i9);
        if (bArr2 != null) {
            $10 = ($11 + 49) % 128;
            char[] cArr4 = new char[i9];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            char c6 = 0;
            while (true) {
                int i13 = aFk1oSDK.getCurrencyIso4217Code;
                if (i13 >= i9) {
                    break;
                }
                if (bArr2[i13] == 1) {
                    cArr4[i13] = (char) (((cArr3[i13] * 2) + 1) - c6);
                    $11 = ($10 + 61) % 128;
                } else {
                    cArr4[i13] = (char) ((cArr3[i13] * 2) - c6);
                }
                c6 = cArr4[i13];
                aFk1oSDK.getCurrencyIso4217Code = i13 + 1;
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i9];
            System.arraycopy(cArr3, 0, cArr5, 0, i9);
            int i14 = i9 - i11;
            System.arraycopy(cArr5, 0, cArr3, i14, i11);
            System.arraycopy(cArr5, i11, cArr3, 0, i14);
        }
        if (z6) {
            char[] cArr6 = new char[i9];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i15 = aFk1oSDK.getCurrencyIso4217Code;
                if (i15 >= i9) {
                    break;
                }
                cArr6[i15] = cArr3[(i9 - i15) - 1];
                aFk1oSDK.getCurrencyIso4217Code = i15 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i16 = aFk1oSDK.getCurrencyIso4217Code;
                if (i16 >= i9) {
                    break;
                }
                int i17 = $10 + 9;
                int i18 = i17 % 128;
                $11 = i18;
                if (i17 % 2 == 0) {
                    cArr3[i16] = (char) (cArr3[i16] * iArr[2]);
                    i6 = i16 - 1;
                } else {
                    cArr3[i16] = (char) (cArr3[i16] - iArr[2]);
                    i6 = i16 + 1;
                }
                aFk1oSDK.getCurrencyIso4217Code = i6;
                $10 = (i18 + 77) % 128;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void b(int[] iArr, int i6, Object[] objArr) {
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMonetizationNetwork;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                iArr3[i7] = (int) (iArr2[i7] ^ 7040698834646313678L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMonetizationNetwork;
        if (iArr5 != null) {
            $10 = ($11 + 65) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                iArr6[i8] = (int) (iArr5[i8] ^ 7040698834646313678L);
                i8++;
                $10 = ($11 + 79) % 128;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1pSDK.AFAdRevenueData = 0;
        while (true) {
            int i9 = aFk1pSDK.AFAdRevenueData;
            if (i9 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i6);
                return;
            }
            $11 = ($10 + 101) % 128;
            int i10 = iArr[i9];
            char c6 = (char) (i10 >> 16);
            cArr[0] = c6;
            char c7 = (char) i10;
            cArr[1] = c7;
            char c8 = (char) (iArr[i9 + 1] >> 16);
            cArr[2] = c8;
            char c9 = (char) iArr[i9 + 1];
            cArr[3] = c9;
            aFk1pSDK.getCurrencyIso4217Code = (c6 << 16) + c7;
            aFk1pSDK.getMonetizationNetwork = (c8 << 16) + c9;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = aFk1pSDK.getCurrencyIso4217Code ^ iArr4[i11];
                aFk1pSDK.getCurrencyIso4217Code = i12;
                int revenue = AFk1pSDK.getRevenue(i12) ^ aFk1pSDK.getMonetizationNetwork;
                int i13 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = revenue;
                aFk1pSDK.getMonetizationNetwork = i13;
            }
            int i14 = aFk1pSDK.getCurrencyIso4217Code;
            int i15 = aFk1pSDK.getMonetizationNetwork;
            aFk1pSDK.getCurrencyIso4217Code = i15;
            aFk1pSDK.getMonetizationNetwork = i14;
            int i16 = i14 ^ iArr4[16];
            aFk1pSDK.getMonetizationNetwork = i16;
            int i17 = i15 ^ iArr4[17];
            aFk1pSDK.getCurrencyIso4217Code = i17;
            cArr[0] = (char) (i17 >>> 16);
            cArr[1] = (char) i17;
            cArr[2] = (char) (i16 >>> 16);
            cArr[3] = (char) i16;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            int i18 = aFk1pSDK.AFAdRevenueData;
            cArr2[i18 * 2] = cArr[0];
            cArr2[(i18 * 2) + 1] = cArr[1];
            cArr2[(i18 * 2) + 2] = cArr[2];
            cArr2[(i18 * 2) + 3] = cArr[3];
            aFk1pSDK.AFAdRevenueData = i18 + 2;
        }
    }

    private static StringBuilder getMonetizationNetwork(@NonNull String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i6 = 0; i6 < 3; i6++) {
            arrayList.add(Integer.valueOf(strArr[i6].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < intValue; i7++) {
            AFAdRevenueData = (component3 + 1) % 128;
            Integer num = null;
            for (int i8 = 0; i8 < 3; i8++) {
                int charAt = strArr[i8].charAt(i7);
                if (num == null) {
                    component3 = (AFAdRevenueData + 79) % 128;
                } else {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
        }
        return sb;
    }

    public static void getRevenue() {
        getMediationNetwork = new char[]{15322, 15124, 15127, 15118, 15115, 15116, 15118, 15117, 15108, 15119, 15120, 15115, 15113, 15018, 15018, 15016, 14991, 14988, 15019, 15024, 14997, 14999, 15029, 15024, 14997, 14999, 15022, 15023, 15018, 15022, 15025, 15023, 15025, 15025, 15026, 14999, 14998, 15028, 15024, 15022, 15029, 15031, 14999, 14988, 15019, 14976, 15002, 14996, 15029, 15020, 15026, 14999, 15339, 15348, 15350, 15331, 15348, 15291, 15347, 15335, 15344, 15330, 15291, 15328, 15348, 15342, 15291, 15349, 15348, 15342, 15291, 15346, 15341, 15344, 15335, 15352, 15337, 15348, 15341, 15348, 15346, 15291, 15351, 15348, 15343, 15344, 15352, 15349, 15291, 15265, 15341, 15338, 15344, 15335, 15348, 15176, 15172, 15174, 15177, 15173, 15276, 15281, 15277, 15350, 15337, 15310, 15159, 15154, 15164, 15161, 15129, 15329, 15167, 15162, 15135, 15329, 15160, 15161, 15156, 15160, 15163, 15161, 15163, 15163, 15164, 15329, 15328, 15166, 15162, 15160, 15167, 15105, 15329, 15328, 15159, 15154, 15164, 15113, 15134, 15134, 15167, 15158, 15164, 15234, 15274, 15278, 15279, 15314, 15317, 15275, 15312, 15316, 15276, 15274, 15276, 15316, 15357, 15357, 15357, 15359, 15359, 15292, 15322, 15320, 15316, 15321, 15322, 15323, 15311, 15298, 15307, 15317, 15314, 15306, 15316, 15327, 15270, 15312, 15344, 15346, 15344, 15349, 15356, 15321, 15311, 15343, 15351, 15346, 15343, 15349, 15317, 15319, 15352, 15346, 15342, 15349, 15351, 15353, 15300, 15115, 15338, 15112, 14998, 15272, 15353, 15348, 15344, 15355, 15316, 15276, 15311, 15310, 15310, 15310, 15311, 15310, 15310, 15310, 15317};
        getMonetizationNetwork = new int[]{-1334944241, -2015133716, 1811231825, -1913690757, -174115752, 1467114833, 1797153774, 2026579881, 1639262049, 1847177514, 514793336, 368887070, 831481797, -2035262010, -2018931947, -1447277916, 1856515781, -1151882951};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0286 A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #3 {Exception -> 0x0164, blocks: (B:10:0x012b, B:12:0x0147, B:13:0x0167, B:15:0x0172, B:18:0x019a, B:20:0x0286, B:24:0x029f, B:28:0x02a4, B:30:0x02a7, B:26:0x02aa, B:37:0x02af), top: B:9:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getMonetizationNetwork() {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1pSDK.getMonetizationNetwork():java.lang.String");
    }
}
