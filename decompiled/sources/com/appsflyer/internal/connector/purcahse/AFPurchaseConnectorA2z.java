package com.appsflyer.internal.connector.purcahse;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA2z {
    public int getOneTimePurchaseOfferDetails;
    public int getPackageName;

    public static char[] getOneTimePurchaseOfferDetails(long j6, char[] cArr, int i6) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i7 = 0;
        int i8 = 4;
        for (int i9 = 0; i9 < cArr.length; i9++) {
            if (((j6 >>> i9) & 1) == i6 && i7 < 4) {
                cArr2[i7] = cArr[i9];
            } else if (i8 < length) {
                cArr2[i8] = cArr[i9];
                i8++;
            } else {
                cArr2[i7] = cArr[i9];
            }
            i7++;
        }
        return cArr2;
    }
}
