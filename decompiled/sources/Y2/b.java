package Y2;

import W2.k;
import X2.E;
import X2.InterfaceC0821e;
import X2.t;
import X2.v;
import X2.w;
import android.content.Context;
import android.text.TextUtils;
import b3.C1089e;
import b3.InterfaceC1087c;
import b3.InterfaceC1088d;
import com.amazon.a.a.o.b.f;
import d3.n;
import f3.m;
import f3.u;
import f3.x;
import g3.r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements t, InterfaceC1087c, InterfaceC0821e {

    /* renamed from: j, reason: collision with root package name */
    public static final String f6529j = k.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f6530a;

    /* renamed from: b, reason: collision with root package name */
    public final E f6531b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1088d f6532c;

    /* renamed from: e, reason: collision with root package name */
    public a f6534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6535f;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f6538i;

    /* renamed from: d, reason: collision with root package name */
    public final Set f6533d = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final w f6537h = new w();

    /* renamed from: g, reason: collision with root package name */
    public final Object f6536g = new Object();

    public b(Context context, androidx.work.a aVar, n nVar, E e6) {
        this.f6530a = context;
        this.f6531b = e6;
        this.f6532c = new C1089e(nVar, this);
        this.f6534e = new a(this, aVar.k());
    }

    @Override // X2.t
    public void a(u... uVarArr) {
        if (this.f6538i == null) {
            g();
        }
        if (!this.f6538i.booleanValue()) {
            k.e().f(f6529j, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f6537h.a(x.a(uVar))) {
                long c6 = uVar.c();
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar.f14118b == W2.u.ENQUEUED) {
                    if (currentTimeMillis < c6) {
                        a aVar = this.f6534e;
                        if (aVar != null) {
                            aVar.a(uVar);
                        }
                    } else if (uVar.h()) {
                        if (uVar.f14126j.h()) {
                            k.e().a(f6529j, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (uVar.f14126j.e()) {
                            k.e().a(f6529j, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f14117a);
                        }
                    } else if (!this.f6537h.a(x.a(uVar))) {
                        k.e().a(f6529j, "Starting work for " + uVar.f14117a);
                        this.f6531b.x(this.f6537h.e(uVar));
                    }
                }
            }
        }
        synchronized (this.f6536g) {
            try {
                if (!hashSet.isEmpty()) {
                    k.e().a(f6529j, "Starting tracking for " + TextUtils.join(f.f11248a, hashSet2));
                    this.f6533d.addAll(hashSet);
                    this.f6532c.b(this.f6533d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X2.InterfaceC0821e
    public void b(m mVar, boolean z6) {
        this.f6537h.b(mVar);
        i(mVar);
    }

    @Override // b3.InterfaceC1087c
    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m a6 = x.a((u) it.next());
            k.e().a(f6529j, "Constraints not met: Cancelling work ID " + a6);
            v b6 = this.f6537h.b(a6);
            if (b6 != null) {
                this.f6531b.A(b6);
            }
        }
    }

    @Override // X2.t
    public boolean d() {
        return false;
    }

    @Override // X2.t
    public void e(String str) {
        if (this.f6538i == null) {
            g();
        }
        if (!this.f6538i.booleanValue()) {
            k.e().f(f6529j, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        k.e().a(f6529j, "Cancelling work ID " + str);
        a aVar = this.f6534e;
        if (aVar != null) {
            aVar.b(str);
        }
        Iterator it = this.f6537h.c(str).iterator();
        while (it.hasNext()) {
            this.f6531b.A((v) it.next());
        }
    }

    @Override // b3.InterfaceC1087c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m a6 = x.a((u) it.next());
            if (!this.f6537h.a(a6)) {
                k.e().a(f6529j, "Constraints met: Scheduling work ID " + a6);
                this.f6531b.x(this.f6537h.d(a6));
            }
        }
    }

    public final void g() {
        this.f6538i = Boolean.valueOf(r.b(this.f6530a, this.f6531b.k()));
    }

    public final void h() {
        if (this.f6535f) {
            return;
        }
        this.f6531b.o().g(this);
        this.f6535f = true;
    }

    public final void i(m mVar) {
        synchronized (this.f6536g) {
            try {
                Iterator it = this.f6533d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u uVar = (u) it.next();
                    if (x.a(uVar).equals(mVar)) {
                        k.e().a(f6529j, "Stopping tracking for " + mVar);
                        this.f6533d.remove(uVar);
                        this.f6532c.b(this.f6533d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
