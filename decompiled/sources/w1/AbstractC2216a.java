package w1;

import android.os.Handler;
import android.os.Looper;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import h1.v1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l1.t;
import w1.InterfaceC2212D;
import w1.K;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2216a implements InterfaceC2212D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19914a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f19915b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final K.a f19916c = new K.a();

    /* renamed from: d, reason: collision with root package name */
    public final t.a f19917d = new t.a();

    /* renamed from: e, reason: collision with root package name */
    public Looper f19918e;

    /* renamed from: f, reason: collision with root package name */
    public Z0.G f19919f;

    /* renamed from: g, reason: collision with root package name */
    public v1 f19920g;

    public final v1 A() {
        return (v1) AbstractC1119a.i(this.f19920g);
    }

    public final boolean B() {
        return !this.f19915b.isEmpty();
    }

    public abstract void C(InterfaceC1266x interfaceC1266x);

    public final void D(Z0.G g6) {
        this.f19919f = g6;
        Iterator it = this.f19914a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2212D.c) it.next()).a(this, g6);
        }
    }

    public abstract void E();

    @Override // w1.InterfaceC2212D
    public final void a(InterfaceC2212D.c cVar, InterfaceC1266x interfaceC1266x, v1 v1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f19918e;
        AbstractC1119a.a(looper == null || looper == myLooper);
        this.f19920g = v1Var;
        Z0.G g6 = this.f19919f;
        this.f19914a.add(cVar);
        if (this.f19918e == null) {
            this.f19918e = myLooper;
            this.f19915b.add(cVar);
            C(interfaceC1266x);
        } else if (g6 != null) {
            h(cVar);
            cVar.a(this, g6);
        }
    }

    @Override // w1.InterfaceC2212D
    public final void b(InterfaceC2212D.c cVar) {
        boolean isEmpty = this.f19915b.isEmpty();
        this.f19915b.remove(cVar);
        if (isEmpty || !this.f19915b.isEmpty()) {
            return;
        }
        y();
    }

    @Override // w1.InterfaceC2212D
    public final void c(Handler handler, K k6) {
        AbstractC1119a.e(handler);
        AbstractC1119a.e(k6);
        this.f19916c.g(handler, k6);
    }

    @Override // w1.InterfaceC2212D
    public final void f(K k6) {
        this.f19916c.v(k6);
    }

    @Override // w1.InterfaceC2212D
    public final void h(InterfaceC2212D.c cVar) {
        AbstractC1119a.e(this.f19918e);
        boolean isEmpty = this.f19915b.isEmpty();
        this.f19915b.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    @Override // w1.InterfaceC2212D
    public final void i(InterfaceC2212D.c cVar) {
        this.f19914a.remove(cVar);
        if (!this.f19914a.isEmpty()) {
            b(cVar);
            return;
        }
        this.f19918e = null;
        this.f19919f = null;
        this.f19920g = null;
        this.f19915b.clear();
        E();
    }

    @Override // w1.InterfaceC2212D
    public final void n(l1.t tVar) {
        this.f19917d.n(tVar);
    }

    @Override // w1.InterfaceC2212D
    public final void p(Handler handler, l1.t tVar) {
        AbstractC1119a.e(handler);
        AbstractC1119a.e(tVar);
        this.f19917d.g(handler, tVar);
    }

    public final t.a t(int i6, InterfaceC2212D.b bVar) {
        return this.f19917d.o(i6, bVar);
    }

    public final t.a v(InterfaceC2212D.b bVar) {
        return this.f19917d.o(0, bVar);
    }

    public final K.a w(int i6, InterfaceC2212D.b bVar) {
        return this.f19916c.y(i6, bVar);
    }

    public final K.a x(InterfaceC2212D.b bVar) {
        return this.f19916c.y(0, bVar);
    }

    public void y() {
    }

    public void z() {
    }
}
