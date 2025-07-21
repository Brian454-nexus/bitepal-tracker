package g5;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14965a = Collections.newSetFromMap(new WeakHashMap());

    @Override // g5.l
    public void a() {
        Iterator it = n5.l.k(this.f14965a).iterator();
        while (it.hasNext()) {
            ((k5.h) it.next()).a();
        }
    }

    public void b() {
        this.f14965a.clear();
    }

    public List c() {
        return n5.l.k(this.f14965a);
    }

    @Override // g5.l
    public void f() {
        Iterator it = n5.l.k(this.f14965a).iterator();
        while (it.hasNext()) {
            ((k5.h) it.next()).f();
        }
    }

    public void g(k5.h hVar) {
        this.f14965a.add(hVar);
    }

    @Override // g5.l
    public void j() {
        Iterator it = n5.l.k(this.f14965a).iterator();
        while (it.hasNext()) {
            ((k5.h) it.next()).j();
        }
    }

    public void o(k5.h hVar) {
        this.f14965a.remove(hVar);
    }
}
