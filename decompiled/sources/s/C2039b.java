package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2039b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f18727a;

    /* renamed from: b, reason: collision with root package name */
    public c f18728b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f18729c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f18730d = 0;

    /* renamed from: s.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // s.C2039b.e
        public c b(c cVar) {
            return cVar.f18734d;
        }

        @Override // s.C2039b.e
        public c c(c cVar) {
            return cVar.f18733c;
        }
    }

    /* renamed from: s.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0244b extends e {
        public C0244b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // s.C2039b.e
        public c b(c cVar) {
            return cVar.f18733c;
        }

        @Override // s.C2039b.e
        public c c(c cVar) {
            return cVar.f18734d;
        }
    }

    /* renamed from: s.b$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f18731a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f18732b;

        /* renamed from: c, reason: collision with root package name */
        public c f18733c;

        /* renamed from: d, reason: collision with root package name */
        public c f18734d;

        public c(Object obj, Object obj2) {
            this.f18731a = obj;
            this.f18732b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f18731a.equals(cVar.f18731a) && this.f18732b.equals(cVar.f18732b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f18731a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f18732b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f18731a.hashCode() ^ this.f18732b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f18731a + com.amazon.a.a.o.b.f.f11249b + this.f18732b;
        }
    }

    /* renamed from: s.b$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f18735a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18736b = true;

        public d() {
        }

        @Override // s.C2039b.f
        public void a(c cVar) {
            c cVar2 = this.f18735a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f18734d;
                this.f18735a = cVar3;
                this.f18736b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f18736b) {
                this.f18736b = false;
                this.f18735a = C2039b.this.f18727a;
            } else {
                c cVar = this.f18735a;
                this.f18735a = cVar != null ? cVar.f18733c : null;
            }
            return this.f18735a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18736b) {
                return C2039b.this.f18727a != null;
            }
            c cVar = this.f18735a;
            return (cVar == null || cVar.f18733c == null) ? false : true;
        }
    }

    /* renamed from: s.b$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f18738a;

        /* renamed from: b, reason: collision with root package name */
        public c f18739b;

        public e(c cVar, c cVar2) {
            this.f18738a = cVar2;
            this.f18739b = cVar;
        }

        @Override // s.C2039b.f
        public void a(c cVar) {
            if (this.f18738a == cVar && cVar == this.f18739b) {
                this.f18739b = null;
                this.f18738a = null;
            }
            c cVar2 = this.f18738a;
            if (cVar2 == cVar) {
                this.f18738a = b(cVar2);
            }
            if (this.f18739b == cVar) {
                this.f18739b = e();
            }
        }

        public abstract c b(c cVar);

        public abstract c c(c cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f18739b;
            this.f18739b = e();
            return cVar;
        }

        public final c e() {
            c cVar = this.f18739b;
            c cVar2 = this.f18738a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18739b != null;
        }
    }

    /* renamed from: s.b$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class f {
        public abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f18727a;
    }

    public c b(Object obj) {
        c cVar = this.f18727a;
        while (cVar != null && !cVar.f18731a.equals(obj)) {
            cVar = cVar.f18733c;
        }
        return cVar;
    }

    public d c() {
        d dVar = new d();
        this.f18729c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0244b c0244b = new C0244b(this.f18728b, this.f18727a);
        this.f18729c.put(c0244b, Boolean.FALSE);
        return c0244b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2039b)) {
            return false;
        }
        C2039b c2039b = (C2039b) obj;
        if (size() != c2039b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2039b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry h() {
        return this.f18728b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((Map.Entry) it.next()).hashCode();
        }
        return i6;
    }

    public c i(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f18730d++;
        c cVar2 = this.f18728b;
        if (cVar2 == null) {
            this.f18727a = cVar;
            this.f18728b = cVar;
            return cVar;
        }
        cVar2.f18733c = cVar;
        cVar.f18734d = cVar2;
        this.f18728b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f18727a, this.f18728b);
        this.f18729c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object k(Object obj, Object obj2) {
        c b6 = b(obj);
        if (b6 != null) {
            return b6.f18732b;
        }
        i(obj, obj2);
        return null;
    }

    public Object l(Object obj) {
        c b6 = b(obj);
        if (b6 == null) {
            return null;
        }
        this.f18730d--;
        if (!this.f18729c.isEmpty()) {
            Iterator it = this.f18729c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(b6);
            }
        }
        c cVar = b6.f18734d;
        if (cVar != null) {
            cVar.f18733c = b6.f18733c;
        } else {
            this.f18727a = b6.f18733c;
        }
        c cVar2 = b6.f18733c;
        if (cVar2 != null) {
            cVar2.f18734d = cVar;
        } else {
            this.f18728b = cVar;
        }
        b6.f18733c = null;
        b6.f18734d = null;
        return b6.f18732b;
    }

    public int size() {
        return this.f18730d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
