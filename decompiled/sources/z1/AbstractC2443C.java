package z1;

import Z0.C0830b;
import Z0.G;
import c1.AbstractC1119a;
import g1.J0;
import g1.K0;
import w1.InterfaceC2212D;
import w1.l0;

/* renamed from: z1.C, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2443C {

    /* renamed from: a, reason: collision with root package name */
    public a f21477a;

    /* renamed from: b, reason: collision with root package name */
    public A1.d f21478b;

    /* renamed from: z1.C$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(J0 j02);

        void b();
    }

    public final A1.d b() {
        return (A1.d) AbstractC1119a.i(this.f21478b);
    }

    public abstract K0.a c();

    public void d(a aVar, A1.d dVar) {
        this.f21477a = aVar;
        this.f21478b = dVar;
    }

    public final void e() {
        a aVar = this.f21477a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void f(J0 j02) {
        a aVar = this.f21477a;
        if (aVar != null) {
            aVar.a(j02);
        }
    }

    public abstract boolean g();

    public abstract void h(Object obj);

    public void i() {
        this.f21477a = null;
        this.f21478b = null;
    }

    public abstract C2444D j(K0[] k0Arr, l0 l0Var, InterfaceC2212D.b bVar, G g6);

    public abstract void k(C0830b c0830b);
}
