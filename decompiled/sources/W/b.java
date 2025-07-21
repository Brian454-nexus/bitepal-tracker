package W;

import F.I0;
import F.InterfaceC0340l;
import F.InterfaceC0341m;
import F.r;
import I.InterfaceC0459w;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1060l;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements InterfaceC1060l, InterfaceC0340l {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1061m f5344b;

    /* renamed from: c, reason: collision with root package name */
    public final O.e f5345c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5343a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5346d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5347e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5348f = false;

    public b(InterfaceC1061m interfaceC1061m, O.e eVar) {
        this.f5344b = interfaceC1061m;
        this.f5345c = eVar;
        if (interfaceC1061m.getLifecycle().b().b(AbstractC1057i.b.STARTED)) {
            eVar.l();
        } else {
            eVar.w();
        }
        interfaceC1061m.getLifecycle().a(this);
    }

    @Override // F.InterfaceC0340l
    public InterfaceC0341m a() {
        return this.f5345c.a();
    }

    @Override // F.InterfaceC0340l
    public r b() {
        return this.f5345c.b();
    }

    public void f(Collection collection) {
        synchronized (this.f5343a) {
            this.f5345c.i(collection);
        }
    }

    public O.e i() {
        return this.f5345c;
    }

    public InterfaceC1061m l() {
        InterfaceC1061m interfaceC1061m;
        synchronized (this.f5343a) {
            interfaceC1061m = this.f5344b;
        }
        return interfaceC1061m;
    }

    public void o(InterfaceC0459w interfaceC0459w) {
        this.f5345c.o(interfaceC0459w);
    }

    @v(AbstractC1057i.a.ON_DESTROY)
    public void onDestroy(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5343a) {
            O.e eVar = this.f5345c;
            eVar.O(eVar.E());
        }
    }

    @v(AbstractC1057i.a.ON_PAUSE)
    public void onPause(InterfaceC1061m interfaceC1061m) {
        this.f5345c.h(false);
    }

    @v(AbstractC1057i.a.ON_RESUME)
    public void onResume(InterfaceC1061m interfaceC1061m) {
        this.f5345c.h(true);
    }

    @v(AbstractC1057i.a.ON_START)
    public void onStart(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5343a) {
            try {
                if (!this.f5347e && !this.f5348f) {
                    this.f5345c.l();
                    this.f5346d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @v(AbstractC1057i.a.ON_STOP)
    public void onStop(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5343a) {
            try {
                if (!this.f5347e && !this.f5348f) {
                    this.f5345c.w();
                    this.f5346d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List p() {
        List unmodifiableList;
        synchronized (this.f5343a) {
            unmodifiableList = Collections.unmodifiableList(this.f5345c.E());
        }
        return unmodifiableList;
    }

    public boolean q(I0 i02) {
        boolean contains;
        synchronized (this.f5343a) {
            contains = this.f5345c.E().contains(i02);
        }
        return contains;
    }

    public void r() {
        synchronized (this.f5343a) {
            try {
                if (this.f5347e) {
                    return;
                }
                onStop(this.f5344b);
                this.f5347e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(Collection collection) {
        synchronized (this.f5343a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f5345c.E());
            this.f5345c.O(arrayList);
        }
    }

    public void t() {
        synchronized (this.f5343a) {
            O.e eVar = this.f5345c;
            eVar.O(eVar.E());
        }
    }

    public void u() {
        synchronized (this.f5343a) {
            try {
                if (this.f5347e) {
                    this.f5347e = false;
                    if (this.f5344b.getLifecycle().b().b(AbstractC1057i.b.STARTED)) {
                        onStart(this.f5344b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
