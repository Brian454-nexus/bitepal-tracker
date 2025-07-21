package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long getCurrencyIso4217Code = 0;
    private static int getMediationNetwork = 1;
    private static int getMonetizationNetwork;

    static {
        getRevenue();
        Process.getElapsedCpuTime();
        int i6 = getMonetizationNetwork + 125;
        getMediationNetwork = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
    }

    private static void a(String str, int i6, Object[] objArr) {
        int i7 = ($10 + 21) % 128;
        $11 = i7;
        char[] cArr = str;
        if (str != null) {
            $10 = (i7 + 107) % 128;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        aFk1rSDK.AFAdRevenueData = i6;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1rSDK.getMediationNetwork = 0;
        while (true) {
            int i8 = aFk1rSDK.getMediationNetwork;
            if (i8 >= cArr2.length) {
                break;
            }
            $11 = ($10 + 31) % 128;
            jArr[i8] = (cArr2[i8] ^ (i8 * aFk1rSDK.AFAdRevenueData)) ^ (getCurrencyIso4217Code ^ 7264887542928058188L);
            aFk1rSDK.getMediationNetwork = i8 + 1;
        }
        char[] cArr3 = new char[length];
        aFk1rSDK.getMediationNetwork = 0;
        while (true) {
            int i9 = aFk1rSDK.getMediationNetwork;
            if (i9 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            } else {
                $10 = ($11 + 35) % 128;
                cArr3[i9] = (char) jArr[i9];
                aFk1rSDK.getMediationNetwork = i9 + 1;
            }
        }
    }

    @NonNull
    private static AFi1tSDK getMonetizationNetwork(@NonNull AFi1vSDK aFi1vSDK, String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (str == null) {
            return new AFi1tSDK(aFi1vSDK.getCurrencyIso4217Code == AFi1zSDK.DEFAULT, AFi1wSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("ᕨ侻ꃊԑ縤퍲㖞溨쏰␉饒\uf273咍觘\ue2e5䜴롙ᵮ瞹\ua8c7ക昭\udb4d㶖隧쯰Ⰱ腞啕岏뇔\ueae7伍ꁞը羶탁㕥渼썉▕黕\uf3f0呫褨\ue27d䒂맒ዼ県ꡞ\u0d65枰\ud8c3㷫阿쭄ⷡ蚧\ufbcf尛넯\uea73䳷", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23250, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getCurrencyIso4217Code == AFi1zSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.AFAdRevenueData, "android", "v1", str4).equals(str);
        return new AFi1tSDK(equals, equals ? AFi1wSDK.SUCCESS : AFi1wSDK.FAILURE);
    }

    public static void getRevenue() {
        getCurrencyIso4217Code = -2677878734856900073L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork = (r0 + 91) % 128;
        r4 = getMonetizationNetwork(r4, r5, r6, r7);
        r5 = com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork + 37;
        com.appsflyer.internal.AFg1ySDK.getMediationNetwork = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if ((r5 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r7 == null) goto L15;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFi1tSDK getMediationNetwork(@androidx.annotation.NonNull com.appsflyer.internal.AFi1vSDK r4, java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1ySDK.getMediationNetwork
            int r1 = r0 + 37
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L12
            r1 = 4
            int r1 = r1 / r2
            if (r4 == 0) goto L31
            goto L14
        L12:
            if (r4 == 0) goto L31
        L14:
            if (r6 == 0) goto L31
            if (r7 == 0) goto L31
            int r0 = r0 + 91
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork = r0
            com.appsflyer.internal.AFi1tSDK r4 = getMonetizationNetwork(r4, r5, r6, r7)
            int r5 = com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork
            int r5 = r5 + 37
            int r6 = r5 % 128
            com.appsflyer.internal.AFg1ySDK.getMediationNetwork = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L2f
            return r4
        L2f:
            r4 = 0
            throw r4
        L31:
            com.appsflyer.internal.AFi1tSDK r4 = new com.appsflyer.internal.AFi1tSDK
            com.appsflyer.internal.AFi1wSDK r5 = com.appsflyer.internal.AFi1wSDK.INTERNAL_ERROR
            r4.<init>(r2, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1ySDK.getMediationNetwork(com.appsflyer.internal.AFi1vSDK, java.lang.String, java.lang.String, java.lang.String):com.appsflyer.internal.AFi1tSDK");
    }

    private static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
        getMediationNetwork = (getMonetizationNetwork + 101) % 128;
        String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (monetizationNetwork.length() < 12) {
            int i6 = getMediationNetwork + 49;
            getMonetizationNetwork = i6 % 128;
            if (i6 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        return monetizationNetwork.substring(0, 12);
    }
}
