package n5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17785a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f17786b;

    /* renamed from: c, reason: collision with root package name */
    public long f17787c;

    /* renamed from: d, reason: collision with root package name */
    public long f17788d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f17789a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17790b;

        public a(Object obj, int i6) {
            this.f17789a = obj;
            this.f17790b = i6;
        }
    }

    public h(long j6) {
        this.f17786b = j6;
        this.f17787c = j6;
    }

    public void b() {
        m(0L);
    }

    public final void f() {
        m(this.f17787c);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f17785a.get(obj);
        return aVar != null ? aVar.f17789a : null;
    }

    public synchronized long h() {
        return this.f17787c;
    }

    public int i(Object obj) {
        return 1;
    }

    public void j(Object obj, Object obj2) {
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i6 = i(obj2);
        long j6 = i6;
        if (j6 >= this.f17787c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f17788d += j6;
        }
        a aVar = (a) this.f17785a.put(obj, obj2 == null ? null : new a(obj2, i6));
        if (aVar != null) {
            this.f17788d -= aVar.f17790b;
            if (!aVar.f17789a.equals(obj2)) {
                j(obj, aVar.f17789a);
            }
        }
        f();
        return aVar != null ? aVar.f17789a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f17785a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f17788d -= aVar.f17790b;
        return aVar.f17789a;
    }

    public synchronized void m(long j6) {
        while (this.f17788d > j6) {
            Iterator it = this.f17785a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f17788d -= aVar.f17790b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f17789a);
        }
    }
}
