package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFk1vSDK extends FilterInputStream {
    private static final short AFAdRevenueData = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;
    private int valueOf;

    public AFk1vSDK(InputStream inputStream, int[] iArr, int i6, byte[] bArr, int i7, int i8) {
        this(inputStream, iArr, i6, bArr, i7, i8, (byte) 0);
    }

    private int getMediationNetwork() {
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.getRevenue == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i6 = this.areAllFieldsValid;
            bArr[0] = (byte) i6;
            if (i6 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i7 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.getMediationNetwork, i7, 8 - i7);
                if (read <= 0) {
                    break;
                }
                i7 += read;
            } while (i7 < 8);
            if (i7 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = this.equals;
            if (i8 == this.copydefault) {
                getRevenue();
            } else {
                if (this.valueOf <= i8) {
                    getRevenue();
                }
                int i9 = this.valueOf;
                if (i9 < this.copydefault) {
                    this.valueOf = i9 + 1;
                } else {
                    this.valueOf = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = read2;
            this.getRevenue = 0;
            this.component2 = read2 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.component2;
    }

    private void getRevenue() {
        if (this.component4 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        boolean z6 = true;
        char c6 = 2;
        int i6 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i7 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i8 = 0;
        while (true) {
            int i9 = this.component1;
            if (i8 >= i9) {
                break;
            }
            short s6 = AFAdRevenueData;
            i7 -= ((((i9 - i8) * s6) + i6) ^ ((i6 << 4) + this.copy)) ^ ((i6 >>> 5) + this.toString);
            i6 -= (((i7 << 4) + this.component3) ^ ((s6 * (i9 - i8)) + i7)) ^ ((i7 >>> 5) + this.hashCode);
            i8++;
            c6 = c6;
            z6 = z6;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i6 >> 24);
        bArr3[z6 ? 1 : 0] = (byte) (i6 >> 16);
        bArr3[c6] = (byte) (i6 >> 8);
        bArr3[3] = (byte) i6;
        bArr3[4] = (byte) (i7 >> 24);
        bArr3[5] = (byte) (i7 >> 16);
        bArr3[6] = (byte) (i7 >> 8);
        bArr3[7] = (byte) i7;
        if (this.component4 == 3) {
            for (int i10 = 0; i10 < 8; i10++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i10] = (byte) (bArr4[i10] ^ this.getMonetizationNetwork[i10]);
            }
            byte[] bArr5 = this.getCurrencyIso4217Code;
            System.arraycopy(bArr5, 0, this.getMonetizationNetwork, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getMediationNetwork();
        return this.component2 - this.getRevenue;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getMediationNetwork();
        int i6 = this.getRevenue;
        if (i6 >= this.component2) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getRevenue = i6 + 1;
        return bArr[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) {
        long j7 = 0;
        while (j7 < j6 && read() != -1) {
            j7++;
        }
        return j7;
    }

    private AFk1vSDK(InputStream inputStream, int[] iArr, int i6, byte[] bArr, int i7, int i8, byte b6) {
        super(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        this.areAllFieldsValid = IntCompanionObject.MAX_VALUE;
        this.valueOf = 1;
        this.getMediationNetwork = new byte[8];
        this.getMonetizationNetwork = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.getRevenue = 8;
        this.component2 = 8;
        this.component1 = Math.min(Math.max(i7, 5), 16);
        this.component4 = i8;
        if (i8 == 3) {
            System.arraycopy(bArr, 0, this.getMonetizationNetwork, 0, 8);
        }
        long j6 = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i6 == 0) {
            this.component3 = (int) j6;
            long j7 = j6 >> 3;
            short s6 = AFAdRevenueData;
            this.hashCode = (int) ((s6 * j7) >> 32);
            this.copy = (int) (j6 >> 32);
            this.toString = (int) (j7 + s6);
        } else {
            int i9 = (int) j6;
            this.component3 = i9;
            this.hashCode = i9 * i6;
            this.copy = i6 ^ i9;
            this.toString = (int) (j6 >> 32);
        }
        this.equals = 100;
        this.copydefault = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            getMediationNetwork();
            int i10 = this.getRevenue;
            if (i10 >= this.component2) {
                if (i9 == i6) {
                    return -1;
                }
                return i7 - (i8 - i9);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getRevenue = i10 + 1;
            bArr[i9] = bArr2[i10];
        }
        return i7;
    }
}
