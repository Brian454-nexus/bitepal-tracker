package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFInAppEventParameterName;
    private final byte[][] areAllFieldsValid;
    private final byte[] component1;
    private final int component2;
    private final int[] component3;
    private final int[] component4;
    private int copy;
    private int copydefault;
    private final byte[] equals;
    private final int hashCode;
    private final int toString;
    private int values;
    private static final byte[] getMediationNetwork = AFk1uSDK.getRevenue;
    private static final int[] getRevenue = AFk1uSDK.getMonetizationNetwork;
    private static final int[] AFAdRevenueData = AFk1uSDK.getCurrencyIso4217Code;
    private static final int[] getMonetizationNetwork = AFk1uSDK.getMediationNetwork;
    private static final int[] getCurrencyIso4217Code = AFk1uSDK.AFAdRevenueData;

    public AFk1tSDK(InputStream inputStream, int i6, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i6, bArr, bArr2, (byte) 0);
    }

    private static byte[][] AFAdRevenueData(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            bArr2[i6] = new byte[bArr[i6].length];
            int i7 = 0;
            while (true) {
                byte[] bArr3 = bArr[i6];
                if (i7 < bArr3.length) {
                    bArr2[i6][bArr3[i7]] = (byte) i7;
                    i7++;
                }
            }
        }
        return bArr2;
    }

    private int getMediationNetwork() {
        if (this.copydefault == Integer.MAX_VALUE) {
            this.copydefault = ((FilterInputStream) this).in.read();
        }
        if (this.values == 16) {
            byte[] bArr = this.component1;
            int i6 = this.copydefault;
            bArr[0] = (byte) i6;
            if (i6 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i7 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i7, 16 - i7);
                if (read <= 0) {
                    break;
                }
                i7 += read;
            } while (i7 < 16);
            if (i7 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = this.hashCode;
            if (i8 == this.toString) {
                AFAdRevenueData(this.component1, this.equals);
            } else {
                if (this.copy <= i8) {
                    AFAdRevenueData(this.component1, this.equals);
                } else {
                    byte[] bArr2 = this.component1;
                    System.arraycopy(bArr2, 0, this.equals, 0, bArr2.length);
                }
                int i9 = this.copy;
                if (i9 < this.toString) {
                    this.copy = i9 + 1;
                } else {
                    this.copy = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.copydefault = read2;
            this.values = 0;
            this.AFInAppEventParameterName = read2 < 0 ? 16 - (this.equals[15] & 255) : 16;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getMediationNetwork();
        return this.AFInAppEventParameterName - this.values;
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
        getMediationNetwork();
        int i6 = this.values;
        if (i6 >= this.AFInAppEventParameterName) {
            return -1;
        }
        byte[] bArr = this.equals;
        this.values = i6 + 1;
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

    private AFk1tSDK(InputStream inputStream, int i6, byte[] bArr, byte[][] bArr2, byte b6) {
        super(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        this.component3 = new int[4];
        this.component1 = new byte[16];
        this.equals = new byte[16];
        this.copy = 1;
        this.copydefault = IntCompanionObject.MAX_VALUE;
        this.values = 16;
        this.AFInAppEventParameterName = 16;
        this.component2 = i6;
        this.component4 = AFk1uSDK.getMediationNetwork(bArr, i6);
        this.areAllFieldsValid = AFAdRevenueData(bArr2);
        this.hashCode = 100;
        this.toString = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            getMediationNetwork();
            int i10 = this.values;
            if (i10 >= this.AFInAppEventParameterName) {
                if (i9 == i6) {
                    return -1;
                }
                return i7 - (i8 - i9);
            }
            byte[] bArr2 = this.equals;
            this.values = i10 + 1;
            bArr[i9] = bArr2[i10];
        }
        return i7;
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component3;
        boolean z6 = true;
        char c6 = 2;
        char c7 = '\b';
        char c8 = 3;
        int i6 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component4;
        iArr[0] = i6 ^ iArr2[0];
        char c9 = 5;
        char c10 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c11 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i7 = 1;
        int i8 = 4;
        while (i7 < this.component2) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component3;
            boolean z7 = z6;
            byte[][] bArr3 = this.areAllFieldsValid;
            byte[] bArr4 = bArr3[0];
            int i9 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFAdRevenueData;
            byte[] bArr5 = bArr3[z7 ? 1 : 0];
            char c12 = c6;
            int i10 = i9 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMonetizationNetwork;
            byte[] bArr6 = bArr3[c12];
            char c13 = c8;
            int i11 = i10 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getCurrencyIso4217Code;
            byte[] bArr7 = bArr3[c13];
            char c14 = c7;
            int i12 = i11 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component4;
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
        int[] iArr9 = this.component4;
        int i17 = iArr9[i8];
        byte[] bArr8 = getMediationNetwork;
        int[] iArr10 = this.component3;
        byte[][] bArr9 = this.areAllFieldsValid;
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
}
