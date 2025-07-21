package com.braze.lrucache;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream[] f12350a;

    public e(InputStream[] inputStreamArr) {
        this.f12350a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f12350a) {
            Charset charset = j.f12380a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e6) {
                    throw e6;
                } catch (Exception unused) {
                }
            }
        }
    }
}
