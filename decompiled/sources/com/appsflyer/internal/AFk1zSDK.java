package com.appsflyer.internal;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFk1zSDK {
    public static void AFAdRevenueData(byte[] bArr, byte b6, long j6) {
        for (int i6 = 0; i6 < bArr.length; i6++) {
            if (((1 << i6) & j6) != 0) {
                bArr[i6] = (byte) (bArr[i6] ^ b6);
            }
        }
    }
}
