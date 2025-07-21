package n5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final Queue f17777c = l.g(0);

    /* renamed from: a, reason: collision with root package name */
    public InputStream f17778a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f17779b;

    public static d c(InputStream inputStream) {
        d dVar;
        Queue queue = f17777c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.I(inputStream);
        return dVar;
    }

    public void D() {
        this.f17779b = null;
        this.f17778a = null;
        Queue queue = f17777c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void I(InputStream inputStream) {
        this.f17778a = inputStream;
    }

    public IOException a() {
        return this.f17779b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f17778a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17778a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i6) {
        this.f17778a.mark(i6);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f17778a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f17778a.read();
        } catch (IOException e6) {
            this.f17779b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f17778a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j6) {
        try {
            return this.f17778a.skip(j6);
        } catch (IOException e6) {
            this.f17779b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f17778a.read(bArr);
        } catch (IOException e6) {
            this.f17779b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        try {
            return this.f17778a.read(bArr, i6, i7);
        } catch (IOException e6) {
            this.f17779b = e6;
            throw e6;
        }
    }
}
