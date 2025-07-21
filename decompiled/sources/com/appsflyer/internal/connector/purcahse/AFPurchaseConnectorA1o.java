package com.appsflyer.internal.connector.purcahse;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1o {
    public static void getOneTimePurchaseOfferDetails(int i6, int i7, boolean z6, int i8, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z6) {
            getQuantity(iArr);
        }
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i6 ^ iArr[i9];
            int oneTimePurchaseOfferDetails = i7 ^ getOneTimePurchaseOfferDetails(i10, iArr2);
            i9++;
            i7 = i10;
            i6 = oneTimePurchaseOfferDetails;
        }
        int i11 = i6 ^ iArr[iArr.length - 2];
        int i12 = i7 ^ iArr[iArr.length - 1];
        if (!z6) {
            getQuantity(iArr);
        }
        iArr3[0] = i12;
        iArr3[1] = i11;
    }

    private static void getQuantity(int[] iArr) {
        for (int i6 = 0; i6 < iArr.length / 2; i6++) {
            int i7 = iArr[i6];
            iArr[i6] = iArr[(iArr.length - i6) - 1];
            iArr[(iArr.length - i6) - 1] = i7;
        }
    }

    private static int getOneTimePurchaseOfferDetails(int i6, int[][] iArr) {
        return ((iArr[0][i6 >>> 24] + iArr[1][(i6 >>> 16) & 255]) ^ iArr[2][(i6 >>> 8) & 255]) + iArr[3][i6 & 255];
    }
}
