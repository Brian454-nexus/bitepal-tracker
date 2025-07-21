package com.amazon.c.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11372a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11373b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11374c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11375d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11376e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11377f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11378g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11379h = 32;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f11380i = true;

    /* renamed from: j, reason: collision with root package name */
    private static final int f11381j = 76;

    /* renamed from: k, reason: collision with root package name */
    private static final byte f11382k = 61;

    /* renamed from: m, reason: collision with root package name */
    private static final String f11384m = "US-ASCII";

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f11387p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: n, reason: collision with root package name */
    private static final byte f11385n = -5;

    /* renamed from: o, reason: collision with root package name */
    private static final byte f11386o = -1;

    /* renamed from: l, reason: collision with root package name */
    private static final byte f11383l = 10;

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f11388q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f11385n, f11385n, -9, -9, f11385n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f11385n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, f11386o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f11383l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f11389r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f11390s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f11385n, f11385n, -9, -9, f11385n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f11385n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, f11386o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f11383l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f11391t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: u, reason: collision with root package name */
    private static final byte[] f11392u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f11385n, f11385n, -9, -9, f11385n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f11385n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, f11383l, -9, -9, -9, f11386o, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11393a;

        /* renamed from: b, reason: collision with root package name */
        private int f11394b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f11395c;

        /* renamed from: d, reason: collision with root package name */
        private int f11396d;

        /* renamed from: e, reason: collision with root package name */
        private int f11397e;

        /* renamed from: f, reason: collision with root package name */
        private int f11398f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f11399g;

        /* renamed from: h, reason: collision with root package name */
        private int f11400h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f11401i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read;
            if (this.f11394b < 0) {
                if (this.f11393a) {
                    byte[] bArr = new byte[3];
                    int i6 = 0;
                    for (int i7 = 0; i7 < 3; i7++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i7] = (byte) read2;
                        i6++;
                    }
                    if (i6 <= 0) {
                        return -1;
                    }
                    c.b(bArr, 0, i6, this.f11395c, 0, this.f11400h);
                    this.f11394b = 0;
                    this.f11397e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i8 = 0;
                    while (i8 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.f11401i[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i8] = (byte) read;
                        i8++;
                    }
                    if (i8 != 4) {
                        if (i8 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f11397e = c.b(bArr2, 0, this.f11395c, 0, this.f11400h);
                    this.f11394b = 0;
                }
            }
            int i9 = this.f11394b;
            if (i9 >= 0) {
                if (i9 >= this.f11397e) {
                    return -1;
                }
                if (this.f11393a && this.f11399g && this.f11398f >= 76) {
                    this.f11398f = 0;
                    return 10;
                }
                this.f11398f++;
                byte[] bArr3 = this.f11395c;
                int i10 = i9 + 1;
                this.f11394b = i10;
                byte b6 = bArr3[i9];
                if (i10 >= this.f11396d) {
                    this.f11394b = -1;
                }
                return b6 & c.f11386o;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        public a(InputStream inputStream, int i6) {
            super(inputStream);
            this.f11400h = i6;
            this.f11399g = (i6 & 8) > 0;
            boolean z6 = (i6 & 1) > 0;
            this.f11393a = z6;
            int i7 = z6 ? 4 : 3;
            this.f11396d = i7;
            this.f11395c = new byte[i7];
            this.f11394b = -1;
            this.f11398f = 0;
            this.f11401i = c.c(i6);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i6 + i8] = (byte) read;
                    i8++;
                } else if (i8 == 0) {
                    return -1;
                }
            }
            return i8;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11402a;

        /* renamed from: b, reason: collision with root package name */
        private int f11403b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f11404c;

        /* renamed from: d, reason: collision with root package name */
        private int f11405d;

        /* renamed from: e, reason: collision with root package name */
        private int f11406e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f11407f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f11408g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f11409h;

        /* renamed from: i, reason: collision with root package name */
        private int f11410i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f11411j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() {
            int i6 = this.f11403b;
            if (i6 > 0) {
                if (!this.f11402a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(c.b(this.f11408g, this.f11404c, i6, this.f11410i));
                this.f11403b = 0;
            }
        }

        public void b() {
            a();
            this.f11409h = true;
        }

        public void c() {
            this.f11409h = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
            super.close();
            this.f11404c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i6) {
            if (this.f11409h) {
                ((FilterOutputStream) this).out.write(i6);
                return;
            }
            if (this.f11402a) {
                byte[] bArr = this.f11404c;
                int i7 = this.f11403b;
                int i8 = i7 + 1;
                this.f11403b = i8;
                bArr[i7] = (byte) i6;
                int i9 = this.f11405d;
                if (i8 >= i9) {
                    ((FilterOutputStream) this).out.write(c.b(this.f11408g, bArr, i9, this.f11410i));
                    int i10 = this.f11406e + 4;
                    this.f11406e = i10;
                    if (this.f11407f && i10 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.f11406e = 0;
                    }
                    this.f11403b = 0;
                    return;
                }
                return;
            }
            byte b6 = this.f11411j[i6 & 127];
            if (b6 <= -5) {
                if (b6 != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
                return;
            }
            byte[] bArr2 = this.f11404c;
            int i11 = this.f11403b;
            int i12 = i11 + 1;
            this.f11403b = i12;
            bArr2[i11] = (byte) i6;
            if (i12 >= this.f11405d) {
                ((FilterOutputStream) this).out.write(this.f11408g, 0, c.b(bArr2, 0, this.f11408g, 0, this.f11410i));
                this.f11403b = 0;
            }
        }

        public b(OutputStream outputStream, int i6) {
            super(outputStream);
            this.f11407f = (i6 & 8) != 0;
            boolean z6 = (i6 & 1) != 0;
            this.f11402a = z6;
            int i7 = z6 ? 3 : 4;
            this.f11405d = i7;
            this.f11404c = new byte[i7];
            this.f11403b = 0;
            this.f11406e = 0;
            this.f11409h = false;
            this.f11408g = new byte[4];
            this.f11410i = i6;
            this.f11411j = c.c(i6);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i6, int i7) {
            if (this.f11409h) {
                ((FilterOutputStream) this).out.write(bArr, i6, i7);
                return;
            }
            for (int i8 = 0; i8 < i7; i8++) {
                write(bArr[i6 + i8]);
            }
        }
    }

    private c() {
    }

    private static final byte[] b(int i6) {
        if ((i6 & 16) == 16) {
            return f11389r;
        }
        if ((i6 & 32) == 32) {
            return f11391t;
        }
        return f11387p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i6) {
        if ((i6 & 16) == 16) {
            return f11390s;
        }
        if ((i6 & 32) == 32) {
            return f11392u;
        }
        return f11388q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, byte[] bArr2, int i6, int i7) {
        b(bArr2, 0, i6, bArr, 0, i7);
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        return c(bArr, 0, bArr.length, 0);
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            b(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i6, int i7, byte[] bArr2, int i8, int i9) {
        byte[] b6 = b(i9);
        int i10 = (i7 > 0 ? (bArr[i6] << 24) >>> 8 : 0) | (i7 > 1 ? (bArr[i6 + 1] << 24) >>> 16 : 0) | (i7 > 2 ? (bArr[i6 + 2] << 24) >>> 24 : 0);
        if (i7 == 1) {
            bArr2[i8] = b6[i10 >>> 18];
            bArr2[i8 + 1] = b6[(i10 >>> 12) & 63];
            bArr2[i8 + 2] = 61;
            bArr2[i8 + 3] = 61;
            return bArr2;
        }
        if (i7 == 2) {
            bArr2[i8] = b6[i10 >>> 18];
            bArr2[i8 + 1] = b6[(i10 >>> 12) & 63];
            bArr2[i8 + 2] = b6[(i10 >>> 6) & 63];
            bArr2[i8 + 3] = 61;
            return bArr2;
        }
        if (i7 != 3) {
            return bArr2;
        }
        bArr2[i8] = b6[i10 >>> 18];
        bArr2[i8 + 1] = b6[(i10 >>> 12) & 63];
        bArr2[i8 + 2] = b6[(i10 >>> 6) & 63];
        bArr2[i8 + 3] = b6[i10 & 63];
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i6, int i7, int i8) {
        int i9;
        if (bArr != null) {
            if (i6 < 0 || (i9 = i6 + i7) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            if (i7 == 0) {
                return new byte[0];
            }
            if (i7 >= 4) {
                byte[] c6 = c(i8);
                byte[] bArr2 = new byte[(i7 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i10 = 0;
                int i11 = 0;
                while (i6 < i9) {
                    byte b6 = bArr[i6];
                    byte b7 = c6[b6 & f11386o];
                    if (b7 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i6] & f11386o), Integer.valueOf(i6)));
                    }
                    if (b7 >= -1) {
                        int i12 = i10 + 1;
                        bArr3[i10] = b6;
                        if (i12 > 3) {
                            i11 += b(bArr3, 0, bArr2, i11, i8);
                            if (bArr[i6] == 61) {
                                break;
                            }
                            i10 = 0;
                        } else {
                            i10 = i12;
                        }
                    }
                    i6++;
                }
                byte[] bArr4 = new byte[i11];
                System.arraycopy(bArr2, 0, bArr4, 0, i11);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i7);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            b(bArr2, bArr, min, 0);
            for (int i6 = 0; i6 < 4; i6++) {
                charBuffer.put((char) (bArr2[i6] & f11386o));
            }
        }
    }

    public static String a(Serializable serializable) {
        return a(serializable, 0);
    }

    public static byte[] b(byte[] bArr) {
        try {
            return b(bArr, 0, bArr.length, 0);
        } catch (IOException e6) {
            if (f11380i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Serializable serializable, int i6) {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ObjectOutputStream objectOutputStream;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bVar = new b(byteArrayOutputStream, i6 | 1);
                    try {
                        if ((i6 & 2) != 0) {
                            outputStream = new GZIPOutputStream(bVar);
                            try {
                                objectOutputStream2 = new ObjectOutputStream(outputStream);
                                outputStream = outputStream;
                            } catch (IOException e6) {
                                e = e6;
                                objectOutputStream = objectOutputStream2;
                                objectOutputStream2 = byteArrayOutputStream;
                                outputStream = outputStream;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                    byteArrayOutputStream = objectOutputStream2;
                                    objectOutputStream2 = objectOutputStream3;
                                    try {
                                        objectOutputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        bVar.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream2.close();
                                outputStream.close();
                                bVar.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream2 = new ObjectOutputStream(bVar);
                            outputStream = null;
                        }
                        objectOutputStream2.writeObject(serializable);
                        try {
                            objectOutputStream2.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            bVar.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), f11384m);
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e7) {
                        e = e7;
                        ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                        objectOutputStream2 = byteArrayOutputStream;
                        objectOutputStream = objectOutputStream4;
                        outputStream = objectOutputStream4;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = objectOutputStream2;
                    }
                } catch (IOException e8) {
                    e = e8;
                    outputStream = null;
                    bVar = null;
                    objectOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                    bVar = null;
                }
            } catch (IOException e9) {
                e = e9;
                outputStream = null;
                objectOutputStream = null;
                bVar = null;
            } catch (Throwable th5) {
                th = th5;
                outputStream = null;
                byteArrayOutputStream = 0;
                bVar = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static byte[] b(byte[] bArr, int i6, int i7, int i8) {
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ?? r42;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i6);
        }
        if (i7 >= 0) {
            if (i6 + i7 > bArr2.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(bArr2.length)));
            }
            if ((i8 & 2) != 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar = new b(byteArrayOutputStream, i8 | 1);
                        try {
                            r42 = new GZIPOutputStream(bVar);
                        } catch (IOException e6) {
                            e = e6;
                            r42 = 0;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused) {
                            }
                            try {
                                bVar.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused3) {
                                throw th;
                            }
                        }
                    } catch (IOException e7) {
                        e = e7;
                        bVar = null;
                        r42 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                    }
                } catch (IOException e8) {
                    e = e8;
                    bVar = null;
                    r42 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    bVar = null;
                }
                try {
                    r42.write(bArr2, i6, i7);
                    r42.close();
                    try {
                        r42.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        bVar.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e9) {
                    e = e9;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    r42 = r42;
                    try {
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        byteArrayOutputStream2 = r42;
                        byteArrayOutputStream2.close();
                        bVar.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream2 = r42;
                    byteArrayOutputStream2.close();
                    bVar.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            }
            boolean z6 = (i8 & 8) != 0;
            int i9 = ((i7 / 3) * 4) + (i7 % 3 > 0 ? 4 : 0);
            if (z6) {
                i9 += i9 / 76;
            }
            int i10 = i9;
            byte[] bArr3 = new byte[i10];
            int i11 = i7 - 2;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                b(bArr2, i13 + i6, 3, bArr3, i12, i8);
                i14 += 4;
                if (z6 && i14 >= 76) {
                    bArr3[i12 + 4] = f11383l;
                    i12++;
                    i14 = 0;
                }
                i13 += 3;
                i12 += 4;
                bArr2 = bArr;
            }
            if (i13 < i7) {
                b(bArr, i13 + i6, i7 - i13, bArr3, i12, i8);
                i12 += 4;
            }
            if (i12 > i10 - 1) {
                return bArr3;
            }
            byte[] bArr4 = new byte[i12];
            System.arraycopy(bArr3, 0, bArr4, 0, i12);
            return bArr4;
        }
        throw new IllegalArgumentException("Cannot have length offset: " + i7);
    }

    public static String c(String str) {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i6 = 0;
                while (true) {
                    try {
                        int read = aVar2.read(bArr, i6, ConstantsKt.DEFAULT_BLOCK_SIZE);
                        if (read < 0) {
                            break;
                        }
                        i6 += read;
                    } catch (IOException e6) {
                        throw e6;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i6, f11384m);
                try {
                    aVar2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            throw e7;
        }
    }

    public static void c(String str, String str2) {
        BufferedOutputStream bufferedOutputStream;
        byte[] b6 = b(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(b6);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e6) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e7) {
            throw e7;
        }
    }

    public static String a(byte[] bArr) {
        String str;
        try {
            str = a(bArr, 0, bArr.length, 0);
        } catch (IOException e6) {
            if (!f11380i) {
                throw new AssertionError(e6.getMessage());
            }
            str = null;
        }
        if (f11380i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i6) {
        return a(bArr, 0, bArr.length, i6);
    }

    public static String a(byte[] bArr, int i6, int i7) {
        String str;
        try {
            str = a(bArr, i6, i7, 0);
        } catch (IOException e6) {
            if (!f11380i) {
                throw new AssertionError(e6.getMessage());
            }
            str = null;
        }
        if (f11380i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i6, int i7, int i8) {
        byte[] b6 = b(bArr, i6, i7, i8);
        try {
            return new String(b6, f11384m);
        } catch (UnsupportedEncodingException unused) {
            return new String(b6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i6, byte[] bArr2, int i7, int i8) {
        int i9;
        int i10;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 != null) {
            if (i6 >= 0 && (i9 = i6 + 3) < bArr.length) {
                if (i7 >= 0 && (i10 = i7 + 2) < bArr2.length) {
                    byte[] c6 = c(i8);
                    byte b6 = bArr[i6 + 2];
                    if (b6 == 61) {
                        bArr2[i7] = (byte) ((((c6[bArr[i6 + 1]] & f11386o) << 12) | ((c6[bArr[i6]] & f11386o) << 18)) >>> 16);
                        return 1;
                    }
                    byte b7 = bArr[i9];
                    if (b7 == 61) {
                        int i11 = ((c6[bArr[i6 + 1]] & f11386o) << 12) | ((c6[bArr[i6]] & f11386o) << 18) | ((c6[b6] & f11386o) << 6);
                        bArr2[i7] = (byte) (i11 >>> 16);
                        bArr2[i7 + 1] = (byte) (i11 >>> 8);
                        return 2;
                    }
                    int i12 = ((c6[bArr[i6 + 1]] & f11386o) << 12) | ((c6[bArr[i6]] & f11386o) << 18) | ((c6[b6] & f11386o) << 6) | (c6[b7] & f11386o);
                    bArr2[i7] = (byte) (i12 >> 16);
                    bArr2[i7 + 1] = (byte) (i12 >> 8);
                    bArr2[i10] = (byte) i12;
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i7)));
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i6)));
        }
        throw new NullPointerException("Destination array was null.");
    }

    public static byte[] a(String str) {
        return a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static byte[] a(String str, int i6) {
        byte[] bytes;
        ByteArrayInputStream length;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes(f11384m);
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] c6 = c(bytes, 0, bytes.length, i6);
            boolean z6 = (i6 & 4) != 0;
            if (c6 != null && (length = c6.length) >= 4 && !z6 && 35615 == ((c6[0] & f11386o) | ((c6[1] << 8) & 65280))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(c6);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, read);
                                    } catch (IOException e6) {
                                        e = e6;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayInputStream = byteArrayInputStream;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            length = byteArrayInputStream;
                                            gZIPInputStream.close();
                                            length.close();
                                            return c6;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                                throw th;
                                            } catch (Exception unused4) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                }
                                c6 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                length = byteArrayInputStream;
                            } catch (IOException e7) {
                                e = e7;
                                gZIPInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e8) {
                            e = e8;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused5) {
                    }
                } catch (IOException e9) {
                    e = e9;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return c6;
        }
        throw new NullPointerException("Input string was null.");
    }

    public static byte[] b(String str) {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i6 = 0;
                    while (true) {
                        try {
                            int read = aVar2.read(bArr, i6, ConstantsKt.DEFAULT_BLOCK_SIZE);
                            if (read < 0) {
                                break;
                            }
                            i6 += read;
                        } catch (IOException e6) {
                            throw e6;
                        } catch (Throwable th) {
                            th = th;
                            aVar = aVar2;
                            try {
                                aVar.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, 0, bArr2, 0, i6);
                    try {
                        aVar2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            throw e7;
        }
    }

    public static void a(byte[] bArr, String str) {
        b bVar;
        if (bArr != null) {
            b bVar2 = null;
            try {
                try {
                    bVar = new b(new FileOutputStream(str), 1);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bVar.write(bArr);
                    try {
                        bVar.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (IOException e6) {
                    throw e6;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    try {
                        bVar2.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e7) {
                throw e7;
            }
        }
        throw new NullPointerException("Data to encode was null.");
    }

    public static void a(String str, String str2) {
        b bVar;
        b bVar2 = null;
        try {
            try {
                bVar = new b(new FileOutputStream(str2), 0);
            } catch (IOException e6) {
                throw e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bVar.write(str.getBytes(f11384m));
            try {
                bVar.close();
            } catch (Exception unused) {
            }
        } catch (IOException e7) {
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            try {
                bVar2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    public static void b(String str, String str2) {
        BufferedOutputStream bufferedOutputStream;
        String c6 = c(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(c6.getBytes(f11384m));
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e6) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e7) {
            throw e7;
        }
    }
}
