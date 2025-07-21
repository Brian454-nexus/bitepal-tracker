package V4;

import P4.a;
import V4.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    public final File f5315b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5316c;

    /* renamed from: e, reason: collision with root package name */
    public P4.a f5318e;

    /* renamed from: d, reason: collision with root package name */
    public final c f5317d = new c();

    /* renamed from: a, reason: collision with root package name */
    public final j f5314a = new j();

    public e(File file, long j6) {
        this.f5315b = file;
        this.f5316c = j6;
    }

    public static a c(File file, long j6) {
        return new e(file, j6);
    }

    @Override // V4.a
    public File a(R4.f fVar) {
        String b6 = this.f5314a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b6 + " for for Key: " + fVar);
        }
        try {
            a.e t02 = d().t0(b6);
            if (t02 != null) {
                return t02.a(0);
            }
            return null;
        } catch (IOException e6) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            return null;
        }
    }

    @Override // V4.a
    public void b(R4.f fVar, a.b bVar) {
        P4.a d6;
        String b6 = this.f5314a.b(fVar);
        this.f5317d.a(b6);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b6 + " for for Key: " + fVar);
            }
            try {
                d6 = d();
            } catch (IOException e6) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e6);
                }
            }
            if (d6.t0(b6) != null) {
                return;
            }
            a.c q02 = d6.q0(b6);
            if (q02 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + b6);
            }
            try {
                if (bVar.a(q02.f(0))) {
                    q02.e();
                }
                q02.b();
            } catch (Throwable th) {
                q02.b();
                throw th;
            }
        } finally {
            this.f5317d.b(b6);
        }
    }

    public final synchronized P4.a d() {
        try {
            if (this.f5318e == null) {
                this.f5318e = P4.a.v0(this.f5315b, 1, 1, this.f5316c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5318e;
    }
}
