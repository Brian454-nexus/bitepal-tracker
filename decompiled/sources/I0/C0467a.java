package I0;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: I0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0467a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2581a;

    public C0467a(int i6) {
        this.f2581a = new AtomicInteger(i6);
    }

    public final int a() {
        return this.f2581a.decrementAndGet();
    }

    public final int b() {
        return this.f2581a.get();
    }

    public final int c() {
        return this.f2581a.getAndIncrement();
    }

    public final int d() {
        return this.f2581a.incrementAndGet();
    }
}
