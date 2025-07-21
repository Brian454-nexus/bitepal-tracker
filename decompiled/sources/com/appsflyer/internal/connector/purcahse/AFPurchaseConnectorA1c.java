package com.appsflyer.internal.connector.purcahse;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1c {
    public int InAppPurchaseEvent;
    public int getQuantity;
    public int toJsonMap;

    public static void InAppPurchaseEvent(int[] iArr) {
        for (int i6 = 0; i6 < iArr.length / 2; i6++) {
            int i7 = iArr[i6];
            iArr[i6] = iArr[(iArr.length - i6) - 1];
            iArr[(iArr.length - i6) - 1] = i7;
        }
    }

    public static int getQuantity(int i6) {
        int[][] iArr = AFPurchaseConnectorA1p.getQuantity.getPackageName;
        return ((iArr[0][(i6 >>> 24) & 255] + iArr[1][(i6 >>> 16) & 255]) ^ iArr[2][(i6 >>> 8) & 255]) + iArr[3][i6 & 255];
    }
}
