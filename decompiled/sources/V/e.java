package V;

import I.C0464y0;
import I.D0;
import I.InterfaceC0462x0;
import I.Y0;
import O.j;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0464y0 f5274a;

    public e() {
        this(C0464y0.a0());
    }

    @Override // I.Y0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f c() {
        return new f(D0.Z(this.f5274a));
    }

    @Override // F.E
    public InterfaceC0462x0 b() {
        return this.f5274a;
    }

    public e d(Class cls) {
        b().H(j.f3872D, cls);
        if (b().e(j.f3871C, null) == null) {
            e(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public e e(String str) {
        b().H(j.f3871C, str);
        return this;
    }

    public e(C0464y0 c0464y0) {
        this.f5274a = c0464y0;
        Class cls = (Class) c0464y0.e(j.f3872D, null);
        if (cls != null && !cls.equals(d.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        d(d.class);
    }
}
