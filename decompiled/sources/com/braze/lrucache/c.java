package com.braze.lrucache;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f12345a = dVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f12345a.f12348c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f12345a.f12348c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i6) {
        try {
            ((FilterOutputStream) this).out.write(i6);
        } catch (IOException unused) {
            this.f12345a.f12348c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i7) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i6, i7);
        } catch (IOException unused) {
            this.f12345a.f12348c = true;
        }
    }
}
