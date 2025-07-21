package l1;

import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.t;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface t {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17025a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2212D.b f17026b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f17027c;

        /* renamed from: l1.t$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0216a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f17028a;

            /* renamed from: b, reason: collision with root package name */
            public t f17029b;

            public C0216a(Handler handler, t tVar) {
                this.f17028a = handler;
                this.f17029b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void c(a aVar, t tVar, int i6) {
            tVar.l0(aVar.f17025a, aVar.f17026b);
            tVar.F(aVar.f17025a, aVar.f17026b, i6);
        }

        public void g(Handler handler, t tVar) {
            AbstractC1119a.e(handler);
            AbstractC1119a.e(tVar);
            this.f17027c.add(new C0216a(handler, tVar));
        }

        public void h() {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                final t tVar = c0216a.f17029b;
                AbstractC1117K.S0(c0216a.f17028a, new Runnable() { // from class: l1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.P(r0.f17025a, t.a.this.f17026b);
                    }
                });
            }
        }

        public void i() {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                final t tVar = c0216a.f17029b;
                AbstractC1117K.S0(c0216a.f17028a, new Runnable() { // from class: l1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.o0(r0.f17025a, t.a.this.f17026b);
                    }
                });
            }
        }

        public void j() {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                final t tVar = c0216a.f17029b;
                AbstractC1117K.S0(c0216a.f17028a, new Runnable() { // from class: l1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.Z(r0.f17025a, t.a.this.f17026b);
                    }
                });
            }
        }

        public void k(final int i6) {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                final t tVar = c0216a.f17029b;
                AbstractC1117K.S0(c0216a.f17028a, new Runnable() { // from class: l1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.c(t.a.this, tVar, i6);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                final t tVar = c0216a.f17029b;
                AbstractC1117K.S0(c0216a.f17028a, new Runnable() { // from class: l1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.H(r0.f17025a, t.a.this.f17026b, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                final t tVar = c0216a.f17029b;
                AbstractC1117K.S0(c0216a.f17028a, new Runnable() { // from class: l1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.g0(r0.f17025a, t.a.this.f17026b);
                    }
                });
            }
        }

        public void n(t tVar) {
            Iterator it = this.f17027c.iterator();
            while (it.hasNext()) {
                C0216a c0216a = (C0216a) it.next();
                if (c0216a.f17029b == tVar) {
                    this.f17027c.remove(c0216a);
                }
            }
        }

        public a o(int i6, InterfaceC2212D.b bVar) {
            return new a(this.f17027c, i6, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i6, InterfaceC2212D.b bVar) {
            this.f17027c = copyOnWriteArrayList;
            this.f17025a = i6;
            this.f17026b = bVar;
        }
    }

    void F(int i6, InterfaceC2212D.b bVar, int i7);

    void H(int i6, InterfaceC2212D.b bVar, Exception exc);

    void P(int i6, InterfaceC2212D.b bVar);

    void Z(int i6, InterfaceC2212D.b bVar);

    void g0(int i6, InterfaceC2212D.b bVar);

    default void l0(int i6, InterfaceC2212D.b bVar) {
    }

    void o0(int i6, InterfaceC2212D.b bVar);
}
