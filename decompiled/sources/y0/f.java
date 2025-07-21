package y0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f extends e {

    /* renamed from: c, reason: collision with root package name */
    public final Object f21176c;

    public f(int i6) {
        super(i6);
        this.f21176c = new Object();
    }

    @Override // y0.e, y0.d
    public boolean a(Object instance) {
        boolean a6;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f21176c) {
            a6 = super.a(instance);
        }
        return a6;
    }

    @Override // y0.e, y0.d
    public Object b() {
        Object b6;
        synchronized (this.f21176c) {
            b6 = super.b();
        }
        return b6;
    }
}
