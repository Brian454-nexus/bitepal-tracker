package j0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.AbstractC1654a;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1638a extends k implements Map {

    /* renamed from: d, reason: collision with root package name */
    public C0209a f16091d;

    /* renamed from: e, reason: collision with root package name */
    public c f16092e;

    /* renamed from: f, reason: collision with root package name */
    public e f16093f;

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0209a extends AbstractSet {
        public C0209a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1638a.this.size();
        }
    }

    /* renamed from: j0.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b extends g {
        public b() {
            super(C1638a.this.size());
        }

        @Override // j0.g
        public Object a(int i6) {
            return C1638a.this.f(i6);
        }

        @Override // j0.g
        public void b(int i6) {
            C1638a.this.h(i6);
        }
    }

    /* renamed from: j0.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public int f16097a;

        /* renamed from: b, reason: collision with root package name */
        public int f16098b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16099c;

        public d() {
            this.f16097a = C1638a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f16098b++;
            this.f16099c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f16099c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC1654a.c(entry.getKey(), C1638a.this.f(this.f16098b)) && AbstractC1654a.c(entry.getValue(), C1638a.this.j(this.f16098b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f16099c) {
                return C1638a.this.f(this.f16098b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f16099c) {
                return C1638a.this.j(this.f16098b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16098b < this.f16097a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f16099c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object f6 = C1638a.this.f(this.f16098b);
            Object j6 = C1638a.this.j(this.f16098b);
            return (f6 == null ? 0 : f6.hashCode()) ^ (j6 != null ? j6.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16099c) {
                throw new IllegalStateException();
            }
            C1638a.this.h(this.f16098b);
            this.f16098b--;
            this.f16097a--;
            this.f16099c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f16099c) {
                return C1638a.this.i(this.f16098b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + com.amazon.a.a.o.b.f.f11249b + getValue();
        }
    }

    /* renamed from: j0.a$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class f extends g {
        public f() {
            super(C1638a.this.size());
        }

        @Override // j0.g
        public Object a(int i6) {
            return C1638a.this.j(i6);
        }

        @Override // j0.g
        public void b(int i6) {
            C1638a.this.h(i6);
        }
    }

    public C1638a() {
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // j0.k, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // j0.k, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0209a c0209a = this.f16091d;
        if (c0209a != null) {
            return c0209a;
        }
        C0209a c0209a2 = new C0209a();
        this.f16091d = c0209a2;
        return c0209a2;
    }

    @Override // j0.k, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    public boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f16092e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f16092e = cVar2;
        return cVar2;
    }

    public boolean m(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean n(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j0.k, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f16093f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f16093f = eVar2;
        return eVar2;
    }

    public C1638a(int i6) {
        super(i6);
    }

    /* renamed from: j0.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C1638a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C1638a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C1638a.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C1638a.l(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i6 = 0;
            for (int size = C1638a.this.size() - 1; size >= 0; size--) {
                Object f6 = C1638a.this.f(size);
                i6 += f6 == null ? 0 : f6.hashCode();
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C1638a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int d6 = C1638a.this.d(obj);
            if (d6 < 0) {
                return false;
            }
            C1638a.this.h(d6);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C1638a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C1638a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C1638a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C1638a.this.size();
            Object[] objArr = new Object[size];
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = C1638a.this.f(i6);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = C1638a.this.f(i6);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: j0.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C1638a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C1638a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C1638a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int a6 = C1638a.this.a(obj);
            if (a6 < 0) {
                return false;
            }
            C1638a.this.h(a6);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C1638a.this.size();
            int i6 = 0;
            boolean z6 = false;
            while (i6 < size) {
                if (collection.contains(C1638a.this.j(i6))) {
                    C1638a.this.h(i6);
                    i6--;
                    size--;
                    z6 = true;
                }
                i6++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C1638a.this.size();
            int i6 = 0;
            boolean z6 = false;
            while (i6 < size) {
                if (!collection.contains(C1638a.this.j(i6))) {
                    C1638a.this.h(i6);
                    i6--;
                    size--;
                    z6 = true;
                }
                i6++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public int size() {
            return C1638a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C1638a.this.size();
            Object[] objArr = new Object[size];
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = C1638a.this.j(i6);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i6 = 0; i6 < size; i6++) {
                objArr[i6] = C1638a.this.j(i6);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C1638a(k kVar) {
        super(kVar);
    }
}
