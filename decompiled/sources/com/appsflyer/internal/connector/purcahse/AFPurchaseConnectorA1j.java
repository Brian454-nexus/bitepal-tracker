package com.appsflyer.internal.connector.purcahse;

import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1j {
    private static byte[] equals = new byte[256];
    static final byte[] InAppPurchaseEvent = new byte[256];
    static final int[] toJsonMap = new int[256];
    static final int[] getOneTimePurchaseOfferDetails = new int[256];
    static final int[] getQuantity = new int[256];
    static final int[] getPackageName = new int[256];
    private static int[] stopObservingTransactions = new int[10];

    static {
        byte[] bArr;
        int i6;
        byte b6 = 1;
        byte b7 = 1;
        do {
            b6 = (byte) (((b6 & ByteCompanionObject.MIN_VALUE) != 0 ? 27 : 0) ^ ((b6 << 1) ^ b6));
            byte b8 = (byte) (b7 ^ (b7 << 1));
            byte b9 = (byte) (b8 ^ (b8 << 2));
            byte b10 = (byte) (b9 ^ (b9 << 4));
            b7 = (byte) (b10 ^ ((b10 & ByteCompanionObject.MIN_VALUE) != 0 ? (byte) 9 : (byte) 0));
            bArr = equals;
            i6 = b6 & 255;
            int i7 = b7 & 255;
            bArr[i6] = (byte) (((((b7 ^ 99) ^ ((i7 << 1) | (i7 >> 7))) ^ ((i7 << 2) | (i7 >> 6))) ^ ((i7 << 3) | (i7 >> 5))) ^ ((i7 >> 4) | (i7 << 4)));
        } while (i6 != 1);
        bArr[0] = 99;
        for (int i8 = 0; i8 < 256; i8++) {
            int i9 = equals[i8] & 255;
            InAppPurchaseEvent[i9] = (byte) i8;
            int i10 = i8 << 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            int i11 = i10 << 1;
            if (i11 >= 256) {
                i11 ^= 283;
            }
            int i12 = i11 << 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            int i13 = i12 ^ i8;
            int i14 = ((i10 ^ (i11 ^ i12)) << 24) | (i13 << 16) | ((i13 ^ i11) << 8) | (i13 ^ i10);
            toJsonMap[i9] = i14;
            getOneTimePurchaseOfferDetails[i9] = (i14 >>> 8) | (i14 << 24);
            getQuantity[i9] = (i14 >>> 16) | (i14 << 16);
            getPackageName[i9] = (i14 << 8) | (i14 >>> 24);
        }
        stopObservingTransactions[0] = 16777216;
        int i15 = 1;
        for (int i16 = 1; i16 < 10; i16++) {
            i15 <<= 1;
            if (i15 >= 256) {
                i15 ^= 283;
            }
            stopObservingTransactions[i16] = i15 << 24;
        }
    }

    public static int[] getPackageName(byte[] bArr, int i6) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i7 = 4;
        int i8 = (i6 + 1) * 4;
        int[] iArr = new int[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i9 + 3;
            int i12 = ((bArr[i9 + 1] & 255) << 16) | (bArr[i9] << 24) | ((bArr[i9 + 2] & 255) << 8);
            i9 += 4;
            iArr[i10] = i12 | (bArr[i11] & 255);
        }
        int i13 = 4;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i8) {
            int i16 = iArr[i13 - 1];
            if (i14 == 0) {
                byte[] bArr2 = equals;
                i16 = ((bArr2[i16 >>> 24] & 255) | (((bArr2[(i16 >>> 16) & 255] << 24) | ((bArr2[(i16 >>> 8) & 255] & 255) << 16)) | ((bArr2[i16 & 255] & 255) << 8))) ^ stopObservingTransactions[i15];
                i14 = 4;
                i15++;
            }
            iArr[i13] = i16 ^ iArr[i13 - 4];
            i13++;
            i14--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i8];
        int i17 = i6 * 4;
        iArr2[0] = iArr[i17];
        int i18 = 1;
        iArr2[1] = iArr[i17 + 1];
        iArr2[2] = iArr[i17 + 2];
        char c6 = 3;
        iArr2[3] = iArr[i17 + 3];
        int i19 = i17 - 4;
        while (i18 < i6) {
            int i20 = iArr[i19];
            int[] iArr3 = toJsonMap;
            byte[] bArr3 = equals;
            int i21 = iArr3[bArr3[i20 >>> 24] & 255];
            int[] iArr4 = getOneTimePurchaseOfferDetails;
            int i22 = i21 ^ iArr4[bArr3[(i20 >>> 16) & 255] & 255];
            int[] iArr5 = getQuantity;
            int i23 = i22 ^ iArr5[bArr3[(i20 >>> 8) & 255] & 255];
            int[] iArr6 = getPackageName;
            iArr2[i7] = iArr6[bArr3[i20 & 255] & 255] ^ i23;
            int i24 = iArr[i19 + 1];
            char c7 = c6;
            int[] iArr7 = iArr2;
            iArr7[i7 + 1] = ((iArr4[bArr3[(i24 >>> 16) & 255] & 255] ^ iArr3[bArr3[i24 >>> 24] & 255]) ^ iArr5[bArr3[(i24 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i24 & 255] & 255];
            int i25 = iArr[i19 + 2];
            int i26 = i7 + 3;
            iArr7[i7 + 2] = iArr6[bArr3[i25 & 255] & 255] ^ ((iArr3[bArr3[i25 >>> 24] & 255] ^ iArr4[bArr3[(i25 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i25 >>> 8) & 255] & 255]);
            int i27 = iArr[i19 + 3];
            i7 += 4;
            iArr7[i26] = iArr6[bArr3[i27 & 255] & 255] ^ ((iArr3[bArr3[i27 >>> 24] & 255] ^ iArr4[bArr3[(i27 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i27 >>> 8) & 255] & 255]);
            i19 -= 4;
            i18++;
            c6 = c7;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i7] = iArr[i19];
        iArr8[i7 + 1] = iArr[i19 + 1];
        iArr8[i7 + 2] = iArr[i19 + 2];
        iArr8[i7 + 3] = iArr[i19 + 3];
        return iArr8;
    }

    public static byte[][] toJsonMap(int i6) {
        byte[][] bArr = new byte[4];
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = i6 >>> (i7 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i8 & 3);
            bArr2[1] = (byte) ((i8 >> 2) & 3);
            bArr2[2] = (byte) ((i8 >> 4) & 3);
            bArr2[3] = (byte) ((i8 >> 6) & 3);
            bArr[i7] = bArr2;
        }
        return bArr;
    }
}
