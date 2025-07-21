package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13267c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13268d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13269e;

    /* renamed from: a, reason: collision with root package name */
    public final byte f13270a;

    /* renamed from: b, reason: collision with root package name */
    public int f13271b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f13267c = bArr;
        int length = bArr.length;
        f13268d = length;
        f13269e = length + 2;
    }

    public g(InputStream inputStream, int i6) {
        super(inputStream);
        if (i6 >= -1 && i6 <= 8) {
            this.f13270a = (byte) i6;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        int i6;
        int i7 = this.f13271b;
        if (i7 < 2 || i7 > (i6 = f13269e)) {
            read = super.read();
        } else if (i7 == i6) {
            read = this.f13270a;
        } else {
            read = f13267c[i7 - 2] & 255;
        }
        if (read != -1) {
            this.f13271b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) {
        long skip = super.skip(j6);
        if (skip > 0) {
            this.f13271b = (int) (this.f13271b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        int i8;
        int i9 = this.f13271b;
        int i10 = f13269e;
        if (i9 > i10) {
            i8 = super.read(bArr, i6, i7);
        } else if (i9 == i10) {
            bArr[i6] = this.f13270a;
            i8 = 1;
        } else if (i9 < 2) {
            i8 = super.read(bArr, i6, 2 - i9);
        } else {
            int min = Math.min(i10 - i9, i7);
            System.arraycopy(f13267c, this.f13271b - 2, bArr, i6, min);
            i8 = min;
        }
        if (i8 > 0) {
            this.f13271b += i8;
        }
        return i8;
    }
}
