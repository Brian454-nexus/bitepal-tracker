package g5;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1060l;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements j, InterfaceC1060l {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14934a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1057i f14935b;

    public k(AbstractC1057i abstractC1057i) {
        this.f14935b = abstractC1057i;
        abstractC1057i.a(this);
    }

    @Override // g5.j
    public void a(l lVar) {
        this.f14934a.add(lVar);
        if (this.f14935b.b() == AbstractC1057i.b.DESTROYED) {
            lVar.f();
        } else if (this.f14935b.b().b(AbstractC1057i.b.STARTED)) {
            lVar.a();
        } else {
            lVar.j();
        }
    }

    @Override // g5.j
    public void b(l lVar) {
        this.f14934a.remove(lVar);
    }

    @v(AbstractC1057i.a.ON_DESTROY)
    public void onDestroy(@NonNull InterfaceC1061m interfaceC1061m) {
        Iterator it = n5.l.k(this.f14934a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).f();
        }
        interfaceC1061m.getLifecycle().c(this);
    }

    @v(AbstractC1057i.a.ON_START)
    public void onStart(@NonNull InterfaceC1061m interfaceC1061m) {
        Iterator it = n5.l.k(this.f14934a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }

    @v(AbstractC1057i.a.ON_STOP)
    public void onStop(@NonNull InterfaceC1061m interfaceC1061m) {
        Iterator it = n5.l.k(this.f14934a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).j();
        }
    }
}
