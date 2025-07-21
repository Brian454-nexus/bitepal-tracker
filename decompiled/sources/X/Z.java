package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Z implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5829a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f5830b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5831c;

    /* renamed from: d, reason: collision with root package name */
    public final r f5832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5833e;

    /* renamed from: f, reason: collision with root package name */
    public final L.d f5834f;

    public Z(Q q6, long j6, r rVar, boolean z6, boolean z7) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5829a = atomicBoolean;
        L.d b6 = L.d.b();
        this.f5834f = b6;
        this.f5830b = q6;
        this.f5831c = j6;
        this.f5832d = rVar;
        this.f5833e = z6;
        if (z7) {
            atomicBoolean.set(true);
        } else {
            b6.c("stop");
        }
    }

    public static Z a(C0810t c0810t, long j6) {
        y0.g.g(c0810t, "The given PendingRecording cannot be null.");
        return new Z(c0810t.e(), j6, c0810t.d(), c0810t.g(), true);
    }

    public static Z c(C0810t c0810t, long j6) {
        y0.g.g(c0810t, "The given PendingRecording cannot be null.");
        return new Z(c0810t.e(), j6, c0810t.d(), c0810t.g(), false);
    }

    public r D() {
        return this.f5832d;
    }

    public long I() {
        return this.f5831c;
    }

    public void P() {
        if (this.f5829a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.f5830b.W(this);
    }

    public void R() {
        if (this.f5829a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.f5830b.f0(this);
    }

    public void T() {
        close();
    }

    public final void Y(int i6, Throwable th) {
        this.f5834f.a();
        if (this.f5829a.getAndSet(true)) {
            return;
        }
        this.f5830b.u0(this, i6, th);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Y(0, null);
    }

    public void finalize() {
        try {
            this.f5834f.d();
            Y(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
