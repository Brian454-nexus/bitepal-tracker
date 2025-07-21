package e1;

import c1.AbstractC1119a;
import java.io.InputStream;

/* renamed from: e1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1250h extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1248f f13814a;

    /* renamed from: b, reason: collision with root package name */
    public final C1252j f13815b;

    /* renamed from: f, reason: collision with root package name */
    public long f13819f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13817d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13818e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13816c = new byte[1];

    public C1250h(InterfaceC1248f interfaceC1248f, C1252j c1252j) {
        this.f13814a = interfaceC1248f;
        this.f13815b = c1252j;
    }

    public final void a() {
        if (this.f13817d) {
            return;
        }
        this.f13814a.r(this.f13815b);
        this.f13817d = true;
    }

    public void c() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f13818e) {
            return;
        }
        this.f13814a.close();
        this.f13818e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f13816c) == -1) {
            return -1;
        }
        return this.f13816c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        AbstractC1119a.g(!this.f13818e);
        a();
        int read = this.f13814a.read(bArr, i6, i7);
        if (read == -1) {
            return -1;
        }
        this.f13819f += read;
        return read;
    }
}
