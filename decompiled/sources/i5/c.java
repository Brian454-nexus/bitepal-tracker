package i5;

import T4.i;
import T4.t;
import f5.C1309g;
import j0.C1638a;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import n5.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final t f16077c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C1309g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final C1638a f16078a = new C1638a();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f16079b = new AtomicReference();

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j b6 = b(cls, cls2, cls3);
        synchronized (this.f16078a) {
            tVar = (t) this.f16078a.get(b6);
        }
        this.f16079b.set(b6);
        return tVar;
    }

    public final j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f16079b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public boolean c(t tVar) {
        return f16077c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f16078a) {
            C1638a c1638a = this.f16078a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f16077c;
            }
            c1638a.put(jVar, tVar);
        }
    }
}
