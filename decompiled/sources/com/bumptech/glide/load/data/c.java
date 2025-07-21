package com.bumptech.glide.load.data;

import java.io.OutputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f13260a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13261b;

    /* renamed from: c, reason: collision with root package name */
    public U4.b f13262c;

    /* renamed from: d, reason: collision with root package name */
    public int f13263d;

    public c(OutputStream outputStream, U4.b bVar) {
        this(outputStream, bVar, 65536);
    }

    public final void D() {
        byte[] bArr = this.f13261b;
        if (bArr != null) {
            this.f13262c.put(bArr);
            this.f13261b = null;
        }
    }

    public final void a() {
        int i6 = this.f13263d;
        if (i6 > 0) {
            this.f13260a.write(this.f13261b, 0, i6);
            this.f13263d = 0;
        }
    }

    public final void c() {
        if (this.f13263d == this.f13261b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f13260a.close();
            D();
        } catch (Throwable th) {
            this.f13260a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f13260a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i6) {
        byte[] bArr = this.f13261b;
        int i7 = this.f13263d;
        this.f13263d = i7 + 1;
        bArr[i7] = (byte) i6;
        c();
    }

    public c(OutputStream outputStream, U4.b bVar, int i6) {
        this.f13260a = outputStream;
        this.f13262c = bVar;
        this.f13261b = (byte[]) bVar.d(i6, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i6, int i7) {
        int i8 = 0;
        do {
            int i9 = i7 - i8;
            int i10 = i6 + i8;
            int i11 = this.f13263d;
            if (i11 == 0 && i9 >= this.f13261b.length) {
                this.f13260a.write(bArr, i10, i9);
                return;
            }
            int min = Math.min(i9, this.f13261b.length - i11);
            System.arraycopy(bArr, i10, this.f13261b, this.f13263d, min);
            this.f13263d += min;
            i8 += min;
            c();
        } while (i8 < i7);
    }
}
