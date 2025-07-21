package n5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f17775a;

    /* renamed from: b, reason: collision with root package name */
    public int f17776b;

    public c(InputStream inputStream, long j6) {
        super(inputStream);
        this.f17775a = j6;
    }

    public static InputStream c(InputStream inputStream, long j6) {
        return new c(inputStream, j6);
    }

    public final int a(int i6) {
        if (i6 >= 0) {
            this.f17776b += i6;
            return i6;
        }
        if (this.f17775a - this.f17776b <= 0) {
            return i6;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f17775a + ", but read: " + this.f17776b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f17775a - this.f17776b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i6, int i7) {
        return a(super.read(bArr, i6, i7));
    }
}
