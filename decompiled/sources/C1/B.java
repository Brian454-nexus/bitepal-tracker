package C1;

import C1.B;
import Z0.N;
import android.os.Handler;
import android.os.SystemClock;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.C1330f;
import g1.C1332g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface B {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f462a;

        /* renamed from: b, reason: collision with root package name */
        public final B f463b;

        public a(Handler handler, B b6) {
            this.f462a = b6 != null ? (Handler) AbstractC1119a.e(handler) : null;
            this.f463b = b6;
        }

        public static /* synthetic */ void d(a aVar, C1330f c1330f) {
            aVar.getClass();
            c1330f.c();
            ((B) AbstractC1117K.i(aVar.f463b)).y(c1330f);
        }

        public void k(final String str, final long j6, final long j7) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).g(str, j6, j7);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).f(str);
                    }
                });
            }
        }

        public void m(final C1330f c1330f) {
            c1330f.c();
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.a.d(B.a.this, c1330f);
                    }
                });
            }
        }

        public void n(final int i6, final long j6) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).o(i6, j6);
                    }
                });
            }
        }

        public void o(final C1330f c1330f) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).n(c1330f);
                    }
                });
            }
        }

        public void p(final Z0.q qVar, final C1332g c1332g) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).h(qVar, c1332g);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f462a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f462a.post(new Runnable() { // from class: C1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).p(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j6, final int i6) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).z(j6, i6);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).u(exc);
                    }
                });
            }
        }

        public void t(final N n6) {
            Handler handler = this.f462a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((B) AbstractC1117K.i(B.a.this.f463b)).a(n6);
                    }
                });
            }
        }
    }

    void a(N n6);

    void f(String str);

    void g(String str, long j6, long j7);

    void h(Z0.q qVar, C1332g c1332g);

    void n(C1330f c1330f);

    void o(int i6, long j6);

    void p(Object obj, long j6);

    void u(Exception exc);

    void y(C1330f c1330f);

    void z(long j6, int i6);
}
