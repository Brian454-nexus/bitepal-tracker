package com.appsflyer.internal.connector.purcahse;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1h extends FilterInputStream {
    private final byte[][] PurchaseClient;
    private final byte[] PurchaseClientBuilder;
    private final int autoLogInApps;
    private final int[] equals;
    private int getVERSION_NAME;
    private final byte[] hashCode;
    private final int logSubscriptions;
    private int setSandbox;
    private int setSubscriptionPurchaseEventDataSource;
    private int setSubscriptionValidationResultListener;
    private final int startObservingTransactions;
    private final int[] stopObservingTransactions;
    private static final byte[] toJsonMap = AFPurchaseConnectorA1j.InAppPurchaseEvent;
    private static final int[] getQuantity = AFPurchaseConnectorA1j.toJsonMap;
    private static final int[] InAppPurchaseEvent = AFPurchaseConnectorA1j.getOneTimePurchaseOfferDetails;
    private static final int[] getOneTimePurchaseOfferDetails = AFPurchaseConnectorA1j.getQuantity;
    private static final int[] getPackageName = AFPurchaseConnectorA1j.getPackageName;

    public AFPurchaseConnectorA1h(InputStream inputStream, int i6, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i6, bArr, bArr2, (byte) 0);
    }

    private void getOneTimePurchaseOfferDetails(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.stopObservingTransactions;
        boolean z6 = true;
        char c6 = 2;
        char c7 = '\b';
        char c8 = 3;
        int i6 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.equals;
        iArr[0] = i6 ^ iArr2[0];
        char c9 = 5;
        char c10 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c11 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i7 = 1;
        int i8 = 4;
        while (i7 < this.startObservingTransactions) {
            int[] iArr3 = getQuantity;
            int[] iArr4 = this.stopObservingTransactions;
            boolean z7 = z6;
            byte[][] bArr3 = this.PurchaseClient;
            byte[] bArr4 = bArr3[0];
            int i9 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = InAppPurchaseEvent;
            byte[] bArr5 = bArr3[z7 ? 1 : 0];
            char c12 = c6;
            int i10 = i9 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getOneTimePurchaseOfferDetails;
            byte[] bArr6 = bArr3[c12];
            char c13 = c8;
            int i11 = i10 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getPackageName;
            byte[] bArr7 = bArr3[c13];
            char c14 = c7;
            int i12 = i11 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.equals;
            int i13 = i12 ^ iArr8[i8];
            char c15 = c11;
            char c16 = c9;
            int i14 = (((iArr3[iArr4[bArr4[z7 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z7 ? 1 : 0]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[z7 ? 1 : 0]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[z7 ? 1 : 0]] & 255]) ^ iArr8[i8 + 1];
            int i15 = (((iArr3[iArr4[bArr4[c12]] >>> 24] ^ iArr5[(iArr4[bArr5[c12]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c12]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c12]] & 255]) ^ iArr8[i8 + 2];
            int i16 = (((iArr3[iArr4[bArr4[c13]] >>> 24] ^ iArr5[(iArr4[bArr5[c13]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c13]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c13]] & 255]) ^ iArr8[i8 + 3];
            iArr4[0] = i13;
            iArr4[z7 ? 1 : 0] = i14;
            iArr4[c12] = i15;
            iArr4[c13] = i16;
            i7++;
            i8 += 4;
            z6 = z7 ? 1 : 0;
            c6 = c12;
            c8 = c13;
            c7 = c14;
            c9 = c16;
            c11 = c15;
            c10 = c10;
        }
        boolean z8 = z6;
        char c17 = c6;
        char c18 = c8;
        char c19 = c7;
        char c20 = c11;
        int[] iArr9 = this.equals;
        int i17 = iArr9[i8];
        byte[] bArr8 = toJsonMap;
        int[] iArr10 = this.stopObservingTransactions;
        byte[][] bArr9 = this.PurchaseClient;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i17 >>> 24));
        byte[] bArr11 = bArr9[z8 ? 1 : 0];
        bArr2[z8 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i17 >>> 16));
        byte[] bArr12 = bArr9[c17];
        bArr2[c17] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i17 >>> 8));
        byte[] bArr13 = bArr9[c18];
        bArr2[c18] = (byte) (i17 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i18 = iArr9[i8 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z8 ? 1 : 0]] >>> 24] ^ (i18 >>> 24));
        bArr2[c9] = (byte) (bArr8[(iArr10[bArr11[z8 ? 1 : 0]] >>> 16) & 255] ^ (i18 >>> 16));
        bArr2[c10] = (byte) (bArr8[(iArr10[bArr12[z8 ? 1 : 0]] >>> 8) & 255] ^ (i18 >>> 8));
        bArr2[7] = (byte) (i18 ^ bArr8[iArr10[bArr13[z8 ? 1 : 0]] & 255]);
        int i19 = iArr9[i8 + 2];
        bArr2[c19] = (byte) (bArr8[iArr10[bArr10[c17]] >>> 24] ^ (i19 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c17]] >>> 16) & 255] ^ (i19 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c17]] >>> 8) & 255] ^ (i19 >>> 8));
        bArr2[11] = (byte) (i19 ^ bArr8[iArr10[bArr13[c17]] & 255]);
        int i20 = iArr9[i8 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c18]] >>> 24] ^ (i20 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c18]] >>> 16) & 255] ^ (i20 >>> 16));
        bArr2[c20] = (byte) (bArr8[(iArr10[bArr12[c18]] >>> 8) & 255] ^ (i20 >>> 8));
        bArr2[15] = (byte) (i20 ^ bArr8[iArr10[bArr13[c18]] & 255]);
    }

    private int toJsonMap() {
        if (this.getVERSION_NAME == Integer.MAX_VALUE) {
            this.getVERSION_NAME = ((FilterInputStream) this).in.read();
        }
        if (this.setSubscriptionValidationResultListener == 16) {
            byte[] bArr = this.hashCode;
            int i6 = this.getVERSION_NAME;
            bArr[0] = (byte) i6;
            if (i6 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i7 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.hashCode, i7, 16 - i7);
                if (read <= 0) {
                    break;
                }
                i7 += read;
            } while (i7 < 16);
            if (i7 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = this.autoLogInApps;
            if (i8 == this.logSubscriptions) {
                getOneTimePurchaseOfferDetails(this.hashCode, this.PurchaseClientBuilder);
            } else {
                if (this.setSandbox <= i8) {
                    getOneTimePurchaseOfferDetails(this.hashCode, this.PurchaseClientBuilder);
                } else {
                    byte[] bArr2 = this.hashCode;
                    System.arraycopy(bArr2, 0, this.PurchaseClientBuilder, 0, bArr2.length);
                }
                int i9 = this.setSandbox;
                if (i9 < this.logSubscriptions) {
                    this.setSandbox = i9 + 1;
                } else {
                    this.setSandbox = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.getVERSION_NAME = read2;
            this.setSubscriptionValidationResultListener = 0;
            this.setSubscriptionPurchaseEventDataSource = read2 < 0 ? 16 - (this.PurchaseClientBuilder[15] & 255) : 16;
        }
        return this.setSubscriptionPurchaseEventDataSource;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        toJsonMap();
        return this.setSubscriptionPurchaseEventDataSource - this.setSubscriptionValidationResultListener;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        toJsonMap();
        int i6 = this.setSubscriptionValidationResultListener;
        if (i6 >= this.setSubscriptionPurchaseEventDataSource) {
            return -1;
        }
        byte[] bArr = this.PurchaseClientBuilder;
        this.setSubscriptionValidationResultListener = i6 + 1;
        return bArr[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) {
        long j7 = 0;
        while (j7 < j6 && read() != -1) {
            j7++;
        }
        return j7;
    }

    private AFPurchaseConnectorA1h(InputStream inputStream, int i6, byte[] bArr, byte[][] bArr2, byte b6) {
        super(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        this.stopObservingTransactions = new int[4];
        this.hashCode = new byte[16];
        this.PurchaseClientBuilder = new byte[16];
        this.setSandbox = 1;
        this.getVERSION_NAME = IntCompanionObject.MAX_VALUE;
        this.setSubscriptionValidationResultListener = 16;
        this.setSubscriptionPurchaseEventDataSource = 16;
        this.startObservingTransactions = i6;
        this.equals = AFPurchaseConnectorA1j.getPackageName(bArr, i6);
        byte[][] bArr3 = new byte[bArr2.length];
        for (int i7 = 0; i7 < bArr2.length; i7++) {
            bArr3[i7] = new byte[bArr2[i7].length];
            int i8 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i7];
                if (i8 < bArr4.length) {
                    bArr3[i7][bArr4[i8]] = (byte) i8;
                    i8++;
                }
            }
        }
        this.PurchaseClient = bArr3;
        this.autoLogInApps = 100;
        this.logSubscriptions = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            toJsonMap();
            int i10 = this.setSubscriptionValidationResultListener;
            if (i10 >= this.setSubscriptionPurchaseEventDataSource) {
                if (i9 == i6) {
                    return -1;
                }
                return i7 - (i8 - i9);
            }
            byte[] bArr2 = this.PurchaseClientBuilder;
            this.setSubscriptionValidationResultListener = i10 + 1;
            bArr[i9] = bArr2[i10];
        }
        return i7;
    }
}
