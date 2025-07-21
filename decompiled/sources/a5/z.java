package a5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class z extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f7805a;

    /* renamed from: b, reason: collision with root package name */
    public int f7806b;

    /* renamed from: c, reason: collision with root package name */
    public int f7807c;

    /* renamed from: d, reason: collision with root package name */
    public int f7808d;

    /* renamed from: e, reason: collision with root package name */
    public int f7809e;

    /* renamed from: f, reason: collision with root package name */
    public final U4.b f7810f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public z(InputStream inputStream, U4.b bVar) {
        this(inputStream, bVar, 65536);
    }

    public static IOException I() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void D() {
        if (this.f7805a != null) {
            this.f7810f.put(this.f7805a);
            this.f7805a = null;
        }
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i6 = this.f7808d;
        if (i6 != -1) {
            int i7 = this.f7809e - i6;
            int i8 = this.f7807c;
            if (i7 < i8) {
                if (i6 == 0 && i8 > bArr.length && this.f7806b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i8) {
                        i8 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f7810f.d(i8, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f7805a = bArr2;
                    this.f7810f.put(bArr);
                    bArr = bArr2;
                } else if (i6 > 0) {
                    System.arraycopy(bArr, i6, bArr, 0, bArr.length - i6);
                }
                int i9 = this.f7809e - this.f7808d;
                this.f7809e = i9;
                this.f7808d = 0;
                this.f7806b = 0;
                int read = inputStream.read(bArr, i9, bArr.length - i9);
                int i10 = this.f7809e;
                if (read > 0) {
                    i10 += read;
                }
                this.f7806b = i10;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f7808d = -1;
            this.f7809e = 0;
            this.f7806b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f7805a == null || inputStream == null) {
            throw I();
        }
        return (this.f7806b - this.f7809e) + inputStream.available();
    }

    public synchronized void c() {
        this.f7807c = this.f7805a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f7805a != null) {
            this.f7810f.put(this.f7805a);
            this.f7805a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i6) {
        this.f7807c = Math.max(this.f7807c, i6);
        this.f7808d = this.f7809e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f7805a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f7809e >= this.f7806b && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f7805a && (bArr = this.f7805a) == null) {
                throw I();
            }
            int i6 = this.f7806b;
            int i7 = this.f7809e;
            if (i6 - i7 <= 0) {
                return -1;
            }
            this.f7809e = i7 + 1;
            return bArr[i7] & 255;
        }
        throw I();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f7805a == null) {
            throw new IOException("Stream is closed");
        }
        int i6 = this.f7808d;
        if (-1 == i6) {
            throw new a("Mark has been invalidated, pos: " + this.f7809e + " markLimit: " + this.f7807c);
        }
        this.f7809e = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f7805a;
        if (bArr == null) {
            throw I();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw I();
        }
        int i6 = this.f7806b;
        int i7 = this.f7809e;
        if (i6 - i7 >= j6) {
            this.f7809e = (int) (i7 + j6);
            return j6;
        }
        long j7 = i6 - i7;
        this.f7809e = i6;
        if (this.f7808d == -1 || j6 > this.f7807c) {
            long skip = inputStream.skip(j6 - j7);
            if (skip > 0) {
                this.f7808d = -1;
            }
            return j7 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j7;
        }
        int i8 = this.f7806b;
        int i9 = this.f7809e;
        if (i8 - i9 >= j6 - j7) {
            this.f7809e = (int) ((i9 + j6) - j7);
            return j6;
        }
        long j8 = (j7 + i8) - i9;
        this.f7809e = i8;
        return j8;
    }

    public z(InputStream inputStream, U4.b bVar, int i6) {
        super(inputStream);
        this.f7808d = -1;
        this.f7810f = bVar;
        this.f7805a = (byte[]) bVar.d(i6, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        byte[] bArr2 = this.f7805a;
        if (bArr2 == null) {
            throw I();
        }
        if (i7 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i10 = this.f7809e;
            int i11 = this.f7806b;
            if (i10 < i11) {
                int i12 = i11 - i10 >= i7 ? i7 : i11 - i10;
                System.arraycopy(bArr2, i10, bArr, i6, i12);
                this.f7809e += i12;
                if (i12 == i7 || inputStream.available() == 0) {
                    return i12;
                }
                i6 += i12;
                i8 = i7 - i12;
            } else {
                i8 = i7;
            }
            while (true) {
                if (this.f7808d == -1 && i8 >= bArr2.length) {
                    i9 = inputStream.read(bArr, i6, i8);
                    if (i9 == -1) {
                        return i8 != i7 ? i7 - i8 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i8 != i7 ? i7 - i8 : -1;
                    }
                    if (bArr2 != this.f7805a && (bArr2 = this.f7805a) == null) {
                        throw I();
                    }
                    int i13 = this.f7806b;
                    int i14 = this.f7809e;
                    i9 = i13 - i14 >= i8 ? i8 : i13 - i14;
                    System.arraycopy(bArr2, i14, bArr, i6, i9);
                    this.f7809e += i9;
                }
                i8 -= i9;
                if (i8 == 0) {
                    return i7;
                }
                if (inputStream.available() == 0) {
                    return i7 - i8;
                }
                i6 += i9;
            }
        } else {
            throw I();
        }
    }
}
