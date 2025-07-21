package n5;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f17791a;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f17791a = IntCompanionObject.MIN_VALUE;
    }

    public final long a(long j6) {
        int i6 = this.f17791a;
        if (i6 == 0) {
            return -1L;
        }
        return (i6 == Integer.MIN_VALUE || j6 <= ((long) i6)) ? j6 : i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i6 = this.f17791a;
        return i6 == Integer.MIN_VALUE ? super.available() : Math.min(i6, super.available());
    }

    public final void c(long j6) {
        int i6 = this.f17791a;
        if (i6 == Integer.MIN_VALUE || j6 == -1) {
            return;
        }
        this.f17791a = (int) (i6 - j6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i6) {
        super.mark(i6);
        this.f17791a = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f17791a = IntCompanionObject.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) {
        long a6 = a(j6);
        if (a6 == -1) {
            return 0L;
        }
        long skip = super.skip(a6);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        int a6 = (int) a(i7);
        if (a6 == -1) {
            return -1;
        }
        int read = super.read(bArr, i6, a6);
        c(read);
        return read;
    }
}
