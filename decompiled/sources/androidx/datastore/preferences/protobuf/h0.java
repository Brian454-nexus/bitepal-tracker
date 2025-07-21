package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public final int f8758a;

    /* renamed from: b, reason: collision with root package name */
    public List f8759b;

    /* renamed from: c, reason: collision with root package name */
    public Map f8760c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8761d;

    /* renamed from: e, reason: collision with root package name */
    public volatile g f8762e;

    /* renamed from: f, reason: collision with root package name */
    public Map f8763f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c f8764g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends h0 {
        public a(int i6) {
            super(i6, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    android.support.v4.media.session.b.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends g {
        public c() {
            super(h0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(h0.this, null);
        }

        public /* synthetic */ c(h0 h0Var, a aVar) {
            this();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f8769a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f8770b = new b();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f8769a;
            }
        }

        public static Iterable b() {
            return f8770b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements Map.Entry, Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final Comparable f8771a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8772b;

        public e(h0 h0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f8771a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f8771a, entry.getKey()) && b(this.f8772b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f8772b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f8771a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f8772b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            h0.this.g();
            Object obj2 = this.f8772b;
            this.f8772b = obj;
            return obj2;
        }

        public String toString() {
            return this.f8771a + com.amazon.a.a.o.b.f.f11249b + this.f8772b;
        }

        public e(Comparable comparable, Object obj) {
            this.f8771a = comparable;
            this.f8772b = obj;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            h0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(h0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h0.this.size();
        }

        public /* synthetic */ g(h0 h0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ h0(int i6, a aVar) {
        this(i6);
    }

    public static h0 q(int i6) {
        return new a(i6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f8759b.isEmpty()) {
            this.f8759b.clear();
        }
        if (this.f8760c.isEmpty()) {
            return;
        }
        this.f8760c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f8760c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f8762e == null) {
            this.f8762e = new g(this, null);
        }
        return this.f8762e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        int size = size();
        if (size != h0Var.size()) {
            return false;
        }
        int k6 = k();
        if (k6 != h0Var.k()) {
            return entrySet().equals(h0Var.entrySet());
        }
        for (int i6 = 0; i6 < k6; i6++) {
            if (!j(i6).equals(h0Var.j(i6))) {
                return false;
            }
        }
        if (k6 != size) {
            return this.f8760c.equals(h0Var.f8760c);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i6;
        int size = this.f8759b.size();
        int i7 = size - 1;
        if (i7 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f8759b.get(i7)).getKey());
            if (compareTo > 0) {
                i6 = size + 1;
                return -i6;
            }
            if (compareTo == 0) {
                return i7;
            }
        }
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) / 2;
            int compareTo2 = comparable.compareTo(((e) this.f8759b.get(i9)).getKey());
            if (compareTo2 < 0) {
                i7 = i9 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i9;
                }
                i8 = i9 + 1;
            }
        }
        i6 = i8 + 1;
        return -i6;
    }

    public final void g() {
        if (this.f8761d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f6 = f(comparable);
        return f6 >= 0 ? ((e) this.f8759b.get(f6)).getValue() : this.f8760c.get(comparable);
    }

    public Set h() {
        if (this.f8764g == null) {
            this.f8764g = new c(this, null);
        }
        return this.f8764g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k6 = k();
        int i6 = 0;
        for (int i7 = 0; i7 < k6; i7++) {
            i6 += ((e) this.f8759b.get(i7)).hashCode();
        }
        return l() > 0 ? i6 + this.f8760c.hashCode() : i6;
    }

    public final void i() {
        g();
        if (!this.f8759b.isEmpty() || (this.f8759b instanceof ArrayList)) {
            return;
        }
        this.f8759b = new ArrayList(this.f8758a);
    }

    public Map.Entry j(int i6) {
        return (Map.Entry) this.f8759b.get(i6);
    }

    public int k() {
        return this.f8759b.size();
    }

    public int l() {
        return this.f8760c.size();
    }

    public Iterable m() {
        return this.f8760c.isEmpty() ? d.b() : this.f8760c.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f8760c.isEmpty() && !(this.f8760c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8760c = treeMap;
            this.f8763f = treeMap.descendingMap();
        }
        return (SortedMap) this.f8760c;
    }

    public boolean o() {
        return this.f8761d;
    }

    public void p() {
        if (this.f8761d) {
            return;
        }
        this.f8760c = this.f8760c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8760c);
        this.f8763f = this.f8763f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8763f);
        this.f8761d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Object put(Comparable comparable, Object obj) {
        g();
        int f6 = f(comparable);
        if (f6 >= 0) {
            return ((e) this.f8759b.get(f6)).setValue(obj);
        }
        i();
        int i6 = -(f6 + 1);
        if (i6 >= this.f8758a) {
            return n().put(comparable, obj);
        }
        int size = this.f8759b.size();
        int i7 = this.f8758a;
        if (size == i7) {
            e eVar = (e) this.f8759b.remove(i7 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f8759b.add(i6, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f6 = f(comparable);
        if (f6 >= 0) {
            return s(f6);
        }
        if (this.f8760c.isEmpty()) {
            return null;
        }
        return this.f8760c.remove(comparable);
    }

    public final Object s(int i6) {
        g();
        Object value = ((e) this.f8759b.remove(i6)).getValue();
        if (!this.f8760c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f8759b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8759b.size() + this.f8760c.size();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f8765a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f8766b;

        public b() {
            this.f8765a = h0.this.f8759b.size();
        }

        public final Iterator a() {
            if (this.f8766b == null) {
                this.f8766b = h0.this.f8763f.entrySet().iterator();
            }
            return this.f8766b;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = h0.this.f8759b;
            int i6 = this.f8765a - 1;
            this.f8765a = i6;
            return (Map.Entry) list.get(i6);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i6 = this.f8765a;
            return (i6 > 0 && i6 <= h0.this.f8759b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(h0 h0Var, a aVar) {
            this();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f8774a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f8775b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f8776c;

        public f() {
            this.f8774a = -1;
        }

        public final Iterator a() {
            if (this.f8776c == null) {
                this.f8776c = h0.this.f8760c.entrySet().iterator();
            }
            return this.f8776c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f8775b = true;
            int i6 = this.f8774a + 1;
            this.f8774a = i6;
            return i6 < h0.this.f8759b.size() ? (Map.Entry) h0.this.f8759b.get(this.f8774a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8774a + 1 < h0.this.f8759b.size() || (!h0.this.f8760c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8775b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f8775b = false;
            h0.this.g();
            if (this.f8774a >= h0.this.f8759b.size()) {
                a().remove();
                return;
            }
            h0 h0Var = h0.this;
            int i6 = this.f8774a;
            this.f8774a = i6 - 1;
            h0Var.s(i6);
        }

        public /* synthetic */ f(h0 h0Var, a aVar) {
            this();
        }
    }

    public h0(int i6) {
        this.f8758a = i6;
        this.f8759b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f8760c = map;
        this.f8763f = map;
    }
}
