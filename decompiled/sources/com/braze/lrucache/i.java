package com.braze.lrucache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final FileInputStream f12375a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f12376b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f12377c;

    /* renamed from: d, reason: collision with root package name */
    public int f12378d;

    /* renamed from: e, reason: collision with root package name */
    public int f12379e;

    public i(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(j.f12380a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f12375a = fileInputStream;
        this.f12376b = charset;
        this.f12377c = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
    }

    public final String a() {
        int i6;
        synchronized (this.f12375a) {
            try {
                byte[] bArr = this.f12377c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f12378d >= this.f12379e) {
                    int read = this.f12375a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f12378d = 0;
                    this.f12379e = read;
                }
                for (int i7 = this.f12378d; i7 != this.f12379e; i7++) {
                    byte[] bArr2 = this.f12377c;
                    if (bArr2[i7] == 10) {
                        int i8 = this.f12378d;
                        if (i7 != i8) {
                            i6 = i7 - 1;
                            if (bArr2[i6] == 13) {
                                String str = new String(bArr2, i8, i6 - i8, this.f12376b.name());
                                this.f12378d = i7 + 1;
                                return str;
                            }
                        }
                        i6 = i7;
                        String str2 = new String(bArr2, i8, i6 - i8, this.f12376b.name());
                        this.f12378d = i7 + 1;
                        return str2;
                    }
                }
                h hVar = new h(this, (this.f12379e - this.f12378d) + 80);
                while (true) {
                    byte[] bArr3 = this.f12377c;
                    int i9 = this.f12378d;
                    hVar.write(bArr3, i9, this.f12379e - i9);
                    this.f12379e = -1;
                    FileInputStream fileInputStream = this.f12375a;
                    byte[] bArr4 = this.f12377c;
                    int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f12378d = 0;
                    this.f12379e = read2;
                    for (int i10 = 0; i10 != this.f12379e; i10++) {
                        byte[] bArr5 = this.f12377c;
                        if (bArr5[i10] == 10) {
                            int i11 = this.f12378d;
                            if (i10 != i11) {
                                hVar.write(bArr5, i11, i10 - i11);
                            }
                            this.f12378d = i10 + 1;
                            return hVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f12375a) {
            try {
                if (this.f12377c != null) {
                    this.f12377c = null;
                    this.f12375a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
