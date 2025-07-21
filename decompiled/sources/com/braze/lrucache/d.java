package com.braze.lrucache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f12346a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f12347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f12349d;

    public d(f fVar, g gVar) {
        this.f12349d = fVar;
        this.f12346a = gVar;
        this.f12347b = gVar.f12370c ? null : new boolean[fVar.f12360g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        c cVar;
        f fVar = this.f12349d;
        if (fVar.f12360g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f12349d.f12360g);
        }
        synchronized (fVar) {
            try {
                g gVar = this.f12346a;
                if (gVar.f12371d != this) {
                    throw new IllegalStateException();
                }
                if (!gVar.f12370c) {
                    this.f12347b[0] = true;
                }
                File a6 = gVar.a(0);
                try {
                    fileOutputStream = new FileOutputStream(a6);
                } catch (FileNotFoundException unused) {
                    this.f12349d.f12354a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(a6);
                    } catch (FileNotFoundException unused2) {
                        return f.f12353q;
                    }
                }
                cVar = new c(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
