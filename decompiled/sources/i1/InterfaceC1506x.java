package i1;

import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.C1330f;
import g1.C1332g;
import i1.InterfaceC1506x;
import i1.InterfaceC1507y;

/* renamed from: i1.x, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1506x {

    /* renamed from: i1.x$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f15976a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1506x f15977b;

        public a(Handler handler, InterfaceC1506x interfaceC1506x) {
            this.f15976a = interfaceC1506x != null ? (Handler) AbstractC1119a.e(handler) : null;
            this.f15977b = interfaceC1506x;
        }

        public static /* synthetic */ void d(a aVar, C1330f c1330f) {
            aVar.getClass();
            c1330f.c();
            ((InterfaceC1506x) AbstractC1117K.i(aVar.f15977b)).t(c1330f);
        }

        public void m(final Exception exc) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).s(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).d(exc);
                    }
                });
            }
        }

        public void o(final InterfaceC1507y.a aVar) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).b(aVar);
                    }
                });
            }
        }

        public void p(final InterfaceC1507y.a aVar) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).e(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j6, final long j7) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).l(str, j6, j7);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).k(str);
                    }
                });
            }
        }

        public void s(final C1330f c1330f) {
            c1330f.c();
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1506x.a.d(InterfaceC1506x.a.this, c1330f);
                    }
                });
            }
        }

        public void t(final C1330f c1330f) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).j(c1330f);
                    }
                });
            }
        }

        public void u(final Z0.q qVar, final C1332g c1332g) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).v(qVar, c1332g);
                    }
                });
            }
        }

        public void v(final long j6) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).r(j6);
                    }
                });
            }
        }

        public void w(final boolean z6) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).c(z6);
                    }
                });
            }
        }

        public void x(final int i6, final long j6, final long j7) {
            Handler handler = this.f15976a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: i1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1506x) AbstractC1117K.i(InterfaceC1506x.a.this.f15977b)).w(i6, j6, j7);
                    }
                });
            }
        }
    }

    void b(InterfaceC1507y.a aVar);

    void c(boolean z6);

    void d(Exception exc);

    void e(InterfaceC1507y.a aVar);

    void j(C1330f c1330f);

    void k(String str);

    void l(String str, long j6, long j7);

    void r(long j6);

    void s(Exception exc);

    void t(C1330f c1330f);

    void v(Z0.q qVar, C1332g c1332g);

    void w(int i6, long j6, long j7);
}
