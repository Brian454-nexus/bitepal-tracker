package K0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2914a;

    public a(boolean z6) {
        this.f2914a = new AtomicBoolean(z6);
    }

    public final boolean a() {
        return this.f2914a.get();
    }

    public final void b(boolean z6) {
        this.f2914a.set(z6);
    }
}
