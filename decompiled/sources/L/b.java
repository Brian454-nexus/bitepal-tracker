package L;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f3020a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f3021b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f3020a = outputStream;
        this.f3021b = byteOrder;
    }

    public void D(int i6) {
        ByteOrder byteOrder = this.f3021b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3020a.write(i6 & 255);
            this.f3020a.write((i6 >>> 8) & 255);
            this.f3020a.write((i6 >>> 16) & 255);
            this.f3020a.write((i6 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f3020a.write((i6 >>> 24) & 255);
            this.f3020a.write((i6 >>> 16) & 255);
            this.f3020a.write((i6 >>> 8) & 255);
            this.f3020a.write(i6 & 255);
        }
    }

    public void I(short s6) {
        ByteOrder byteOrder = this.f3021b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3020a.write(s6 & 255);
            this.f3020a.write((s6 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f3020a.write((s6 >>> 8) & 255);
            this.f3020a.write(s6 & 255);
        }
    }

    public void P(long j6) {
        D((int) j6);
    }

    public void R(int i6) {
        I((short) i6);
    }

    public void a(ByteOrder byteOrder) {
        this.f3021b = byteOrder;
    }

    public void c(int i6) {
        this.f3020a.write(i6);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f3020a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i6, int i7) {
        this.f3020a.write(bArr, i6, i7);
    }
}
