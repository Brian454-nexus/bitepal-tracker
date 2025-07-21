package P4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f4401a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f4402b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4403c;

    /* renamed from: d, reason: collision with root package name */
    public int f4404d;

    /* renamed from: e, reason: collision with root package name */
    public int f4405e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i6) {
            super(i6);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i6 = ((ByteArrayOutputStream) this).count;
            if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                i6--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i6, b.this.f4402b.name());
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, ConstantsKt.DEFAULT_BUFFER_SIZE, charset);
    }

    public boolean D() {
        return this.f4405e == -1;
    }

    public String I() {
        int i6;
        byte[] bArr;
        int i7;
        synchronized (this.f4401a) {
            try {
                if (this.f4403c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f4404d >= this.f4405e) {
                    c();
                }
                for (int i8 = this.f4404d; i8 != this.f4405e; i8++) {
                    byte[] bArr2 = this.f4403c;
                    if (bArr2[i8] == 10) {
                        int i9 = this.f4404d;
                        if (i8 != i9) {
                            i7 = i8 - 1;
                            if (bArr2[i7] == 13) {
                                String str = new String(bArr2, i9, i7 - i9, this.f4402b.name());
                                this.f4404d = i8 + 1;
                                return str;
                            }
                        }
                        i7 = i8;
                        String str2 = new String(bArr2, i9, i7 - i9, this.f4402b.name());
                        this.f4404d = i8 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f4405e - this.f4404d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f4403c;
                    int i10 = this.f4404d;
                    aVar.write(bArr3, i10, this.f4405e - i10);
                    this.f4405e = -1;
                    c();
                    i6 = this.f4404d;
                    while (i6 != this.f4405e) {
                        bArr = this.f4403c;
                        if (bArr[i6] == 10) {
                            break loop1;
                        }
                        i6++;
                    }
                }
                int i11 = this.f4404d;
                if (i6 != i11) {
                    aVar.write(bArr, i11, i6 - i11);
                }
                this.f4404d = i6 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        InputStream inputStream = this.f4401a;
        byte[] bArr = this.f4403c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f4404d = 0;
        this.f4405e = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4401a) {
            try {
                if (this.f4403c != null) {
                    this.f4403c = null;
                    this.f4401a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(InputStream inputStream, int i6, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i6 >= 0) {
            if (charset.equals(c.f4407a)) {
                this.f4401a = inputStream;
                this.f4402b = charset;
                this.f4403c = new byte[i6];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
