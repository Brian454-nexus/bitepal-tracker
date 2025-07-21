package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import s.C2039b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r extends C1067t {

    /* renamed from: l, reason: collision with root package name */
    public C2039b f9087l = new C2039b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1065q f9088a;

        /* renamed from: b, reason: collision with root package name */
        public final u f9089b;

        /* renamed from: c, reason: collision with root package name */
        public int f9090c = -1;

        public a(AbstractC1065q abstractC1065q, u uVar) {
            this.f9088a = abstractC1065q;
            this.f9089b = uVar;
        }

        @Override // androidx.lifecycle.u
        public void a(Object obj) {
            if (this.f9090c != this.f9088a.g()) {
                this.f9090c = this.f9088a.g();
                this.f9089b.a(obj);
            }
        }

        public void b() {
            this.f9088a.j(this);
        }

        public void c() {
            this.f9088a.n(this);
        }
    }

    @Override // androidx.lifecycle.AbstractC1065q
    public void k() {
        Iterator it = this.f9087l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // androidx.lifecycle.AbstractC1065q
    public void l() {
        Iterator it = this.f9087l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    public void q(AbstractC1065q abstractC1065q, u uVar) {
        if (abstractC1065q == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC1065q, uVar);
        a aVar2 = (a) this.f9087l.k(abstractC1065q, aVar);
        if (aVar2 != null && aVar2.f9089b != uVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && h()) {
            aVar.b();
        }
    }

    public void r(AbstractC1065q abstractC1065q) {
        a aVar = (a) this.f9087l.l(abstractC1065q);
        if (aVar != null) {
            aVar.c();
        }
    }
}
