package T4;

import T4.h;
import X4.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f4941a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List f4942b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.d f4943c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4944d;

    /* renamed from: e, reason: collision with root package name */
    public int f4945e;

    /* renamed from: f, reason: collision with root package name */
    public int f4946f;

    /* renamed from: g, reason: collision with root package name */
    public Class f4947g;

    /* renamed from: h, reason: collision with root package name */
    public h.e f4948h;

    /* renamed from: i, reason: collision with root package name */
    public R4.h f4949i;

    /* renamed from: j, reason: collision with root package name */
    public Map f4950j;

    /* renamed from: k, reason: collision with root package name */
    public Class f4951k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4952l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4953m;

    /* renamed from: n, reason: collision with root package name */
    public R4.f f4954n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f4955o;

    /* renamed from: p, reason: collision with root package name */
    public j f4956p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4957q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4958r;

    public void a() {
        this.f4943c = null;
        this.f4944d = null;
        this.f4954n = null;
        this.f4947g = null;
        this.f4951k = null;
        this.f4949i = null;
        this.f4955o = null;
        this.f4950j = null;
        this.f4956p = null;
        this.f4941a.clear();
        this.f4952l = false;
        this.f4942b.clear();
        this.f4953m = false;
    }

    public U4.b b() {
        return this.f4943c.b();
    }

    public List c() {
        if (!this.f4953m) {
            this.f4953m = true;
            this.f4942b.clear();
            List g6 = g();
            int size = g6.size();
            for (int i6 = 0; i6 < size; i6++) {
                n.a aVar = (n.a) g6.get(i6);
                if (!this.f4942b.contains(aVar.f6276a)) {
                    this.f4942b.add(aVar.f6276a);
                }
                for (int i7 = 0; i7 < aVar.f6277b.size(); i7++) {
                    if (!this.f4942b.contains(aVar.f6277b.get(i7))) {
                        this.f4942b.add(aVar.f6277b.get(i7));
                    }
                }
            }
        }
        return this.f4942b;
    }

    public V4.a d() {
        return this.f4948h.a();
    }

    public j e() {
        return this.f4956p;
    }

    public int f() {
        return this.f4946f;
    }

    public List g() {
        if (!this.f4952l) {
            this.f4952l = true;
            this.f4941a.clear();
            List i6 = this.f4943c.i().i(this.f4944d);
            int size = i6.size();
            for (int i7 = 0; i7 < size; i7++) {
                n.a a6 = ((X4.n) i6.get(i7)).a(this.f4944d, this.f4945e, this.f4946f, this.f4949i);
                if (a6 != null) {
                    this.f4941a.add(a6);
                }
            }
        }
        return this.f4941a;
    }

    public t h(Class cls) {
        return this.f4943c.i().h(cls, this.f4947g, this.f4951k);
    }

    public Class i() {
        return this.f4944d.getClass();
    }

    public List j(File file) {
        return this.f4943c.i().i(file);
    }

    public R4.h k() {
        return this.f4949i;
    }

    public com.bumptech.glide.g l() {
        return this.f4955o;
    }

    public List m() {
        return this.f4943c.i().j(this.f4944d.getClass(), this.f4947g, this.f4951k);
    }

    public R4.k n(v vVar) {
        return this.f4943c.i().k(vVar);
    }

    public com.bumptech.glide.load.data.e o(Object obj) {
        return this.f4943c.i().l(obj);
    }

    public R4.f p() {
        return this.f4954n;
    }

    public R4.d q(Object obj) {
        return this.f4943c.i().m(obj);
    }

    public Class r() {
        return this.f4951k;
    }

    public R4.l s(Class cls) {
        R4.l lVar = (R4.l) this.f4950j.get(cls);
        if (lVar == null) {
            Iterator it = this.f4950j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (R4.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f4950j.isEmpty() || !this.f4957q) {
            return Z4.j.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int t() {
        return this.f4945e;
    }

    public boolean u(Class cls) {
        return h(cls) != null;
    }

    public void v(com.bumptech.glide.d dVar, Object obj, R4.f fVar, int i6, int i7, j jVar, Class cls, Class cls2, com.bumptech.glide.g gVar, R4.h hVar, Map map, boolean z6, boolean z7, h.e eVar) {
        this.f4943c = dVar;
        this.f4944d = obj;
        this.f4954n = fVar;
        this.f4945e = i6;
        this.f4946f = i7;
        this.f4956p = jVar;
        this.f4947g = cls;
        this.f4948h = eVar;
        this.f4951k = cls2;
        this.f4955o = gVar;
        this.f4949i = hVar;
        this.f4950j = map;
        this.f4957q = z6;
        this.f4958r = z7;
    }

    public boolean w(v vVar) {
        return this.f4943c.i().n(vVar);
    }

    public boolean x() {
        return this.f4958r;
    }

    public boolean y(R4.f fVar) {
        List g6 = g();
        int size = g6.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((n.a) g6.get(i6)).f6276a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
