package i5;

import j0.C1638a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n5.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f16080a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final C1638a f16081b = new C1638a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f16080a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f16081b) {
            list = (List) this.f16081b.get(jVar);
        }
        this.f16080a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f16081b) {
            this.f16081b.put(new j(cls, cls2, cls3), list);
        }
    }
}
