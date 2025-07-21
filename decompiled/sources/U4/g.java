package U4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f5224a = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Map f5225b = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f5226a;

        /* renamed from: b, reason: collision with root package name */
        public List f5227b;

        /* renamed from: c, reason: collision with root package name */
        public a f5228c;

        /* renamed from: d, reason: collision with root package name */
        public a f5229d;

        public a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f5227b == null) {
                this.f5227b = new ArrayList();
            }
            this.f5227b.add(obj);
        }

        public Object b() {
            int c6 = c();
            if (c6 > 0) {
                return this.f5227b.remove(c6 - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f5227b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f5229d = this;
            this.f5228c = this;
            this.f5226a = obj;
        }
    }

    public static void e(a aVar) {
        a aVar2 = aVar.f5229d;
        aVar2.f5228c = aVar.f5228c;
        aVar.f5228c.f5229d = aVar2;
    }

    public static void g(a aVar) {
        aVar.f5228c.f5229d = aVar;
        aVar.f5229d.f5228c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f5225b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f5225b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a aVar) {
        e(aVar);
        a aVar2 = this.f5224a;
        aVar.f5229d = aVar2;
        aVar.f5228c = aVar2.f5228c;
        g(aVar);
    }

    public final void c(a aVar) {
        e(aVar);
        a aVar2 = this.f5224a;
        aVar.f5229d = aVar2.f5229d;
        aVar.f5228c = aVar2;
        g(aVar);
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f5225b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f5225b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f5224a.f5229d; !aVar.equals(this.f5224a); aVar = aVar.f5229d) {
            Object b6 = aVar.b();
            if (b6 != null) {
                return b6;
            }
            e(aVar);
            this.f5225b.remove(aVar.f5226a);
            ((l) aVar.f5226a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f5224a.f5228c;
        boolean z6 = false;
        while (!aVar.equals(this.f5224a)) {
            sb.append('{');
            sb.append(aVar.f5226a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.f5228c;
            z6 = true;
        }
        if (z6) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
