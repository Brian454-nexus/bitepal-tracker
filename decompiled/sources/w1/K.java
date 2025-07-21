package w1;

import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.InterfaceC2212D;
import w1.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface K {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19783a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2212D.b f19784b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f19785c;

        /* renamed from: w1.K$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0266a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f19786a;

            /* renamed from: b, reason: collision with root package name */
            public K f19787b;

            public C0266a(Handler handler, K k6) {
                this.f19786a = handler;
                this.f19787b = k6;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, K k6) {
            AbstractC1119a.e(handler);
            AbstractC1119a.e(k6);
            this.f19785c.add(new C0266a(handler, k6));
        }

        public void h(int i6, Z0.q qVar, int i7, Object obj, long j6) {
            i(new C2210B(1, i6, qVar, i7, obj, AbstractC1117K.k1(j6), -9223372036854775807L));
        }

        public void i(final C2210B c2210b) {
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                final K k6 = c0266a.f19787b;
                AbstractC1117K.S0(c0266a.f19786a, new Runnable() { // from class: w1.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        k6.V(r0.f19783a, K.a.this.f19784b, c2210b);
                    }
                });
            }
        }

        public void j(C2239y c2239y, int i6) {
            k(c2239y, i6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void k(C2239y c2239y, int i6, int i7, Z0.q qVar, int i8, Object obj, long j6, long j7) {
            l(c2239y, new C2210B(i6, i7, qVar, i8, obj, AbstractC1117K.k1(j6), AbstractC1117K.k1(j7)));
        }

        public void l(final C2239y c2239y, final C2210B c2210b) {
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                final K k6 = c0266a.f19787b;
                AbstractC1117K.S0(c0266a.f19786a, new Runnable() { // from class: w1.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        k6.e0(r0.f19783a, K.a.this.f19784b, c2239y, c2210b);
                    }
                });
            }
        }

        public void m(C2239y c2239y, int i6) {
            n(c2239y, i6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void n(C2239y c2239y, int i6, int i7, Z0.q qVar, int i8, Object obj, long j6, long j7) {
            o(c2239y, new C2210B(i6, i7, qVar, i8, obj, AbstractC1117K.k1(j6), AbstractC1117K.k1(j7)));
        }

        public void o(final C2239y c2239y, final C2210B c2210b) {
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                final K k6 = c0266a.f19787b;
                AbstractC1117K.S0(c0266a.f19786a, new Runnable() { // from class: w1.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        k6.W(r0.f19783a, K.a.this.f19784b, c2239y, c2210b);
                    }
                });
            }
        }

        public void p(C2239y c2239y, int i6, int i7, Z0.q qVar, int i8, Object obj, long j6, long j7, IOException iOException, boolean z6) {
            r(c2239y, new C2210B(i6, i7, qVar, i8, obj, AbstractC1117K.k1(j6), AbstractC1117K.k1(j7)), iOException, z6);
        }

        public void q(C2239y c2239y, int i6, IOException iOException, boolean z6) {
            p(c2239y, i6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z6);
        }

        public void r(final C2239y c2239y, final C2210B c2210b, final IOException iOException, final boolean z6) {
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                final K k6 = c0266a.f19787b;
                AbstractC1117K.S0(c0266a.f19786a, new Runnable() { // from class: w1.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        k6.N(r0.f19783a, K.a.this.f19784b, c2239y, c2210b, iOException, z6);
                    }
                });
            }
        }

        public void s(C2239y c2239y, int i6) {
            t(c2239y, i6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(C2239y c2239y, int i6, int i7, Z0.q qVar, int i8, Object obj, long j6, long j7) {
            u(c2239y, new C2210B(i6, i7, qVar, i8, obj, AbstractC1117K.k1(j6), AbstractC1117K.k1(j7)));
        }

        public void u(final C2239y c2239y, final C2210B c2210b) {
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                final K k6 = c0266a.f19787b;
                AbstractC1117K.S0(c0266a.f19786a, new Runnable() { // from class: w1.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        k6.R(r0.f19783a, K.a.this.f19784b, c2239y, c2210b);
                    }
                });
            }
        }

        public void v(K k6) {
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                if (c0266a.f19787b == k6) {
                    this.f19785c.remove(c0266a);
                }
            }
        }

        public void w(int i6, long j6, long j7) {
            x(new C2210B(1, i6, null, 3, null, AbstractC1117K.k1(j6), AbstractC1117K.k1(j7)));
        }

        public void x(final C2210B c2210b) {
            final InterfaceC2212D.b bVar = (InterfaceC2212D.b) AbstractC1119a.e(this.f19784b);
            Iterator it = this.f19785c.iterator();
            while (it.hasNext()) {
                C0266a c0266a = (C0266a) it.next();
                final K k6 = c0266a.f19787b;
                AbstractC1117K.S0(c0266a.f19786a, new Runnable() { // from class: w1.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        k6.U(K.a.this.f19783a, bVar, c2210b);
                    }
                });
            }
        }

        public a y(int i6, InterfaceC2212D.b bVar) {
            return new a(this.f19785c, i6, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i6, InterfaceC2212D.b bVar) {
            this.f19785c = copyOnWriteArrayList;
            this.f19783a = i6;
            this.f19784b = bVar;
        }
    }

    void N(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b, IOException iOException, boolean z6);

    void R(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b);

    void U(int i6, InterfaceC2212D.b bVar, C2210B c2210b);

    void V(int i6, InterfaceC2212D.b bVar, C2210B c2210b);

    void W(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b);

    void e0(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b);
}
