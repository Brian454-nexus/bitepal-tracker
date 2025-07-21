package A;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f8a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(long j6);

        void b(Surface surface);

        void c(long j6);

        String d();

        void e();

        void f(String str);

        Object g();

        Surface getSurface();
    }

    public i(int i6, Surface surface) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f8a = new m(i6, surface);
        } else if (i7 >= 28) {
            this.f8a = new l(i6, surface);
        } else {
            this.f8a = new k(i6, surface);
        }
    }

    public static i i(Object obj) {
        if (obj == null) {
            return null;
        }
        int i6 = Build.VERSION.SDK_INT;
        a j6 = i6 >= 33 ? m.j((OutputConfiguration) obj) : i6 >= 28 ? l.i((OutputConfiguration) obj) : k.h((OutputConfiguration) obj);
        if (j6 == null) {
            return null;
        }
        return new i(j6);
    }

    public void a(Surface surface) {
        this.f8a.b(surface);
    }

    public void b() {
        this.f8a.e();
    }

    public String c() {
        return this.f8a.d();
    }

    public Surface d() {
        return this.f8a.getSurface();
    }

    public void e(long j6) {
        this.f8a.c(j6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f8a.equals(((i) obj).f8a);
        }
        return false;
    }

    public void f(String str) {
        this.f8a.f(str);
    }

    public void g(long j6) {
        this.f8a.a(j6);
    }

    public Object h() {
        return this.f8a.g();
    }

    public int hashCode() {
        return this.f8a.hashCode();
    }

    public i(a aVar) {
        this.f8a = aVar;
    }
}
