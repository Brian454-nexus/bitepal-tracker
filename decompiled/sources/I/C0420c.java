package I;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: I.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0420c extends K {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2423a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2424b;

    public C0420c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f2423a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f2424b = handler;
    }

    @Override // I.K
    public Executor b() {
        return this.f2423a;
    }

    @Override // I.K
    public Handler c() {
        return this.f2424b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k6 = (K) obj;
            if (this.f2423a.equals(k6.b()) && this.f2424b.equals(k6.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2423a.hashCode() ^ 1000003) * 1000003) ^ this.f2424b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2423a + ", schedulerHandler=" + this.f2424b + "}";
    }
}
