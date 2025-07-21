package U4;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements U4.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f5230a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final b f5231b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final Map f5232c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f5233d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f5234e;

    /* renamed from: f, reason: collision with root package name */
    public int f5235f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final b f5236a;

        /* renamed from: b, reason: collision with root package name */
        public int f5237b;

        /* renamed from: c, reason: collision with root package name */
        public Class f5238c;

        public a(b bVar) {
            this.f5236a = bVar;
        }

        @Override // U4.l
        public void a() {
            this.f5236a.c(this);
        }

        public void b(int i6, Class cls) {
            this.f5237b = i6;
            this.f5238c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f5237b == aVar.f5237b && this.f5238c == aVar.f5238c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i6 = this.f5237b * 31;
            Class cls = this.f5238c;
            return i6 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f5237b + "array=" + this.f5238c + '}';
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends c {
        @Override // U4.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i6, Class cls) {
            a aVar = (a) b();
            aVar.b(i6, cls);
            return aVar;
        }
    }

    public i(int i6) {
        this.f5234e = i6;
    }

    @Override // U4.b
    public synchronized void a(int i6) {
        try {
            if (i6 >= 40) {
                b();
            } else if (i6 >= 20 || i6 == 15) {
                g(this.f5234e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // U4.b
    public synchronized void b() {
        g(0);
    }

    @Override // U4.b
    public synchronized Object c(int i6, Class cls) {
        return k(this.f5231b.e(i6, cls), cls);
    }

    @Override // U4.b
    public synchronized Object d(int i6, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i6));
        } catch (Throwable th) {
            throw th;
        }
        return k(o(i6, num) ? this.f5231b.e(num.intValue(), cls) : this.f5231b.e(i6, cls), cls);
    }

    public final void e(int i6, Class cls) {
        NavigableMap l6 = l(cls);
        Integer num = (Integer) l6.get(Integer.valueOf(i6));
        if (num != null) {
            if (num.intValue() == 1) {
                l6.remove(Integer.valueOf(i6));
                return;
            } else {
                l6.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i6 + ", this: " + this);
    }

    public final void f() {
        g(this.f5234e);
    }

    public final void g(int i6) {
        while (this.f5235f > i6) {
            Object f6 = this.f5230a.f();
            n5.k.d(f6);
            U4.a h6 = h(f6);
            this.f5235f -= h6.c(f6) * h6.b();
            e(h6.c(f6), f6.getClass());
            if (Log.isLoggable(h6.a(), 2)) {
                Log.v(h6.a(), "evicted: " + h6.c(f6));
            }
        }
    }

    public final U4.a h(Object obj) {
        return i(obj.getClass());
    }

    public final U4.a i(Class cls) {
        U4.a fVar;
        U4.a aVar = (U4.a) this.f5233d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f5233d.put(cls, fVar);
        return fVar;
    }

    public final Object j(a aVar) {
        return this.f5230a.a(aVar);
    }

    public final Object k(a aVar, Class cls) {
        U4.a i6 = i(cls);
        Object j6 = j(aVar);
        if (j6 != null) {
            this.f5235f -= i6.c(j6) * i6.b();
            e(i6.c(j6), cls);
        }
        if (j6 != null) {
            return j6;
        }
        if (Log.isLoggable(i6.a(), 2)) {
            Log.v(i6.a(), "Allocated " + aVar.f5237b + " bytes");
        }
        return i6.newArray(aVar.f5237b);
    }

    public final NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f5232c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5232c.put(cls, treeMap);
        return treeMap;
    }

    public final boolean m() {
        int i6 = this.f5235f;
        return i6 == 0 || this.f5234e / i6 >= 2;
    }

    public final boolean n(int i6) {
        return i6 <= this.f5234e / 2;
    }

    public final boolean o(int i6, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i6 * 8;
        }
        return false;
    }

    @Override // U4.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        U4.a i6 = i(cls);
        int c6 = i6.c(obj);
        int b6 = i6.b() * c6;
        if (n(b6)) {
            a e6 = this.f5231b.e(c6, cls);
            this.f5230a.d(e6, obj);
            NavigableMap l6 = l(cls);
            Integer num = (Integer) l6.get(Integer.valueOf(e6.f5237b));
            Integer valueOf = Integer.valueOf(e6.f5237b);
            int i7 = 1;
            if (num != null) {
                i7 = 1 + num.intValue();
            }
            l6.put(valueOf, Integer.valueOf(i7));
            this.f5235f += b6;
            f();
        }
    }
}
