package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFk1xSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private int component1;
    private byte[] component2;
    private byte[] component3;
    private byte[] component4;
    private int copydefault;
    private AFj1aSDK getCurrencyIso4217Code;
    private int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i6, boolean z6, int i7) {
        this(inputStream, iArr, bArr, i6, false, i7, (byte) 0);
    }

    private void getMonetizationNetwork() {
        if (this.toString == 2) {
            byte[] bArr = this.component3;
            System.arraycopy(bArr, 0, this.component2, 0, bArr.length);
        }
        byte[] bArr2 = this.component3;
        int i6 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i7 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i8 = this.AFAdRevenueData;
        AFj1aSDK aFj1aSDK = this.getCurrencyIso4217Code;
        AFk1ySDK.getRevenue(i6, i7, false, i8, aFj1aSDK.getRevenue, aFj1aSDK.getMonetizationNetwork, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i9 = iArr[0];
        int i10 = iArr[1];
        byte[] bArr3 = this.component3;
        bArr3[0] = (byte) (i9 >> 24);
        bArr3[1] = (byte) (i9 >> 16);
        bArr3[2] = (byte) (i9 >> 8);
        bArr3[3] = (byte) i9;
        bArr3[4] = (byte) (i10 >> 24);
        bArr3[5] = (byte) (i10 >> 16);
        bArr3[6] = (byte) (i10 >> 8);
        bArr3[7] = (byte) i10;
        if (this.toString == 2) {
            for (int i11 = 0; i11 < 8; i11++) {
                byte[] bArr4 = this.component3;
                bArr4[i11] = (byte) (bArr4[i11] ^ this.component4[i11]);
            }
            byte[] bArr5 = this.component2;
            System.arraycopy(bArr5, 0, this.component4, 0, bArr5.length);
        }
    }

    private int getRevenue() {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.component1 == 8) {
            byte[] bArr = this.component3;
            int i6 = this.hashCode;
            bArr[0] = (byte) i6;
            if (i6 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i7 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component3, i7, 8 - i7);
                if (read <= 0) {
                    break;
                }
                i7 += read;
            } while (i7 < 8);
            if (i7 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = this.getRevenue;
            if (i8 == this.getMonetizationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getMediationNetwork <= i8) {
                    getMonetizationNetwork();
                }
                int i9 = this.getMediationNetwork;
                if (i9 < this.getMonetizationNetwork) {
                    this.getMediationNetwork = i9 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.hashCode = read2;
            this.component1 = 0;
            this.copydefault = read2 < 0 ? 8 - (this.component3[7] & 255) : 8;
        }
        return this.copydefault;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getRevenue();
        return this.copydefault - this.component1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getRevenue();
        int i6 = this.component1;
        if (i6 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.component1 = i6 + 1;
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

    private AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i6, boolean z6, int i7, byte b6) {
        super(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        this.getMediationNetwork = 1;
        this.hashCode = IntCompanionObject.MAX_VALUE;
        int min = Math.min(Math.max(i6, 3), 16);
        this.AFAdRevenueData = min;
        this.component3 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component4 = bArr2;
        this.component2 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component1 = 8;
        this.copydefault = 8;
        this.toString = i7;
        if (i7 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getCurrencyIso4217Code = new AFj1aSDK(iArr, min, true, false);
        this.getRevenue = 100;
        this.getMonetizationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            getRevenue();
            int i10 = this.component1;
            if (i10 >= this.copydefault) {
                if (i9 == i6) {
                    return -1;
                }
                return i7 - (i8 - i9);
            }
            byte[] bArr2 = this.component3;
            this.component1 = i10 + 1;
            bArr[i9] = bArr2[i10];
        }
        return i7;
    }
}
