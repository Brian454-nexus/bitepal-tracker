package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import java.util.Iterator;
import java.util.Map;
import r.C2016c;
import s.C2039b;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1065q {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f9068k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9069a;

    /* renamed from: b, reason: collision with root package name */
    public C2039b f9070b;

    /* renamed from: c, reason: collision with root package name */
    public int f9071c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9072d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9073e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f9074f;

    /* renamed from: g, reason: collision with root package name */
    public int f9075g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9076h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9077i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f9078j;

    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1065q.this.f9069a) {
                obj = AbstractC1065q.this.f9074f;
                AbstractC1065q.this.f9074f = AbstractC1065q.f9068k;
            }
            AbstractC1065q.this.p(obj);
        }
    }

    /* renamed from: androidx.lifecycle.q$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends d {
        public b(u uVar) {
            super(uVar);
        }

        @Override // androidx.lifecycle.AbstractC1065q.d
        public boolean e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.q$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends d implements InterfaceC1059k {

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC1061m f9081e;

        public c(InterfaceC1061m interfaceC1061m, u uVar) {
            super(uVar);
            this.f9081e = interfaceC1061m;
        }

        @Override // androidx.lifecycle.AbstractC1065q.d
        public void b() {
            this.f9081e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.InterfaceC1059k
        public void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
            AbstractC1057i.b b6 = this.f9081e.getLifecycle().b();
            if (b6 == AbstractC1057i.b.DESTROYED) {
                AbstractC1065q.this.n(this.f9083a);
                return;
            }
            AbstractC1057i.b bVar = null;
            while (bVar != b6) {
                a(e());
                bVar = b6;
                b6 = this.f9081e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.AbstractC1065q.d
        public boolean d(InterfaceC1061m interfaceC1061m) {
            return this.f9081e == interfaceC1061m;
        }

        @Override // androidx.lifecycle.AbstractC1065q.d
        public boolean e() {
            return this.f9081e.getLifecycle().b().b(AbstractC1057i.b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.q$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final u f9083a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9084b;

        /* renamed from: c, reason: collision with root package name */
        public int f9085c = -1;

        public d(u uVar) {
            this.f9083a = uVar;
        }

        public void a(boolean z6) {
            if (z6 == this.f9084b) {
                return;
            }
            this.f9084b = z6;
            AbstractC1065q.this.c(z6 ? 1 : -1);
            if (this.f9084b) {
                AbstractC1065q.this.e(this);
            }
        }

        public void b() {
        }

        public boolean d(InterfaceC1061m interfaceC1061m) {
            return false;
        }

        public abstract boolean e();
    }

    public AbstractC1065q(Object obj) {
        this.f9069a = new Object();
        this.f9070b = new C2039b();
        this.f9071c = 0;
        this.f9074f = f9068k;
        this.f9078j = new a();
        this.f9073e = obj;
        this.f9075g = 0;
    }

    public static void b(String str) {
        if (C2016c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i6) {
        int i7 = this.f9071c;
        this.f9071c = i6 + i7;
        if (this.f9072d) {
            return;
        }
        this.f9072d = true;
        while (true) {
            try {
                int i8 = this.f9071c;
                if (i7 == i8) {
                    this.f9072d = false;
                    return;
                }
                boolean z6 = i7 == 0 && i8 > 0;
                boolean z7 = i7 > 0 && i8 == 0;
                if (z6) {
                    k();
                } else if (z7) {
                    l();
                }
                i7 = i8;
            } catch (Throwable th) {
                this.f9072d = false;
                throw th;
            }
        }
    }

    public final void d(d dVar) {
        if (dVar.f9084b) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i6 = dVar.f9085c;
            int i7 = this.f9075g;
            if (i6 >= i7) {
                return;
            }
            dVar.f9085c = i7;
            dVar.f9083a.a(this.f9073e);
        }
    }

    public void e(d dVar) {
        if (this.f9076h) {
            this.f9077i = true;
            return;
        }
        this.f9076h = true;
        do {
            this.f9077i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                C2039b.d c6 = this.f9070b.c();
                while (c6.hasNext()) {
                    d((d) ((Map.Entry) c6.next()).getValue());
                    if (this.f9077i) {
                        break;
                    }
                }
            }
        } while (this.f9077i);
        this.f9076h = false;
    }

    public Object f() {
        Object obj = this.f9073e;
        if (obj != f9068k) {
            return obj;
        }
        return null;
    }

    public int g() {
        return this.f9075g;
    }

    public boolean h() {
        return this.f9071c > 0;
    }

    public void i(InterfaceC1061m interfaceC1061m, u uVar) {
        b("observe");
        if (interfaceC1061m.getLifecycle().b() == AbstractC1057i.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1061m, uVar);
        d dVar = (d) this.f9070b.k(uVar, cVar);
        if (dVar != null && !dVar.d(interfaceC1061m)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC1061m.getLifecycle().a(cVar);
    }

    public void j(u uVar) {
        b("observeForever");
        b bVar = new b(uVar);
        d dVar = (d) this.f9070b.k(uVar, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    public void k() {
    }

    public void l() {
    }

    public void m(Object obj) {
        boolean z6;
        synchronized (this.f9069a) {
            z6 = this.f9074f == f9068k;
            this.f9074f = obj;
        }
        if (z6) {
            C2016c.g().c(this.f9078j);
        }
    }

    public void n(u uVar) {
        b("removeObserver");
        d dVar = (d) this.f9070b.l(uVar);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    public void o(InterfaceC1061m interfaceC1061m) {
        b("removeObservers");
        Iterator it = this.f9070b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((d) entry.getValue()).d(interfaceC1061m)) {
                n((u) entry.getKey());
            }
        }
    }

    public void p(Object obj) {
        b("setValue");
        this.f9075g++;
        this.f9073e = obj;
        e(null);
    }

    public AbstractC1065q() {
        this.f9069a = new Object();
        this.f9070b = new C2039b();
        this.f9071c = 0;
        Object obj = f9068k;
        this.f9074f = obj;
        this.f9078j = new a();
        this.f9073e = obj;
        this.f9075g = -1;
    }
}
