package X4;

import X4.n;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    public static final c f6292e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final n f6293f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f6294a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6295b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f6296c;

    /* renamed from: d, reason: collision with root package name */
    public final y0.d f6297d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements n {
        @Override // X4.n
        public n.a a(Object obj, int i6, int i7, R4.h hVar) {
            return null;
        }

        @Override // X4.n
        public boolean b(Object obj) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class f6298a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f6299b;

        /* renamed from: c, reason: collision with root package name */
        public final o f6300c;

        public b(Class cls, Class cls2, o oVar) {
            this.f6298a = cls;
            this.f6299b = cls2;
            this.f6300c = oVar;
        }

        public boolean a(Class cls) {
            return this.f6298a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f6299b.isAssignableFrom(cls2);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public q a(List list, y0.d dVar) {
            return new q(list, dVar);
        }
    }

    public r(y0.d dVar) {
        this(dVar, f6292e);
    }

    public static n f() {
        return f6293f;
    }

    public final void a(Class cls, Class cls2, o oVar, boolean z6) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f6294a;
        list.add(z6 ? list.size() : 0, bVar);
    }

    public synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public final n c(b bVar) {
        return (n) n5.k.d(bVar.f6300c.d(this));
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z6 = false;
            for (b bVar : this.f6294a) {
                if (this.f6296c.contains(bVar)) {
                    z6 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f6296c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f6296c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f6295b.a(arrayList, this.f6297d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z6) {
                throw new i.c(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f6296c.clear();
            throw th;
        }
    }

    public synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f6294a) {
                if (!this.f6296c.contains(bVar) && bVar.a(cls)) {
                    this.f6296c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f6296c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f6296c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f6294a) {
            if (!arrayList.contains(bVar.f6299b) && bVar.a(cls)) {
                arrayList.add(bVar.f6299b);
            }
        }
        return arrayList;
    }

    public r(y0.d dVar, c cVar) {
        this.f6294a = new ArrayList();
        this.f6296c = new HashSet();
        this.f6297d = dVar;
        this.f6295b = cVar;
    }
}
