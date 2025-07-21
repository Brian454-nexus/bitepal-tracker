package M0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3362a;

    public b(boolean z6) {
        this.f3362a = new AtomicBoolean(z6);
    }

    public final boolean a() {
        return this.f3362a.get();
    }

    public final void b(boolean z6) {
        this.f3362a.set(z6);
    }
}
