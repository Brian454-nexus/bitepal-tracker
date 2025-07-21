package X;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0813w {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f6008b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f6009c;

    /* renamed from: a, reason: collision with root package name */
    public final Map f6010a = new HashMap();

    /* renamed from: X.w$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a c(AbstractC0811u abstractC0811u, int i6) {
            return new C0800i(abstractC0811u, i6);
        }

        public abstract int a();

        public abstract AbstractC0811u b();
    }

    static {
        HashMap hashMap = new HashMap();
        f6008b = hashMap;
        hashMap.put(AbstractC0811u.f5977d, Range.create(2160, 4319));
        hashMap.put(AbstractC0811u.f5976c, Range.create(1080, 1439));
        hashMap.put(AbstractC0811u.f5975b, Range.create(720, 1079));
        hashMap.put(AbstractC0811u.f5974a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f6009c = hashMap2;
        hashMap2.put(0, L.a.f3013a);
        hashMap2.put(1, L.a.f3015c);
    }

    public C0813w(List list, Map map) {
        for (AbstractC0811u abstractC0811u : f6008b.keySet()) {
            this.f6010a.put(a.c(abstractC0811u, -1), new ArrayList());
            Iterator it = f6009c.keySet().iterator();
            while (it.hasNext()) {
                this.f6010a.put(a.c(abstractC0811u, ((Integer) it.next()).intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        h(map);
    }

    public static /* synthetic */ int a(int i6, Size size, Size size2) {
        return Math.abs(S.d.a(size) - i6) - Math.abs(S.d.a(size2) - i6);
    }

    public static Integer d(Size size) {
        for (Map.Entry entry : f6009c.entrySet()) {
            if (L.a.b(size, (Rational) entry.getValue(), S.d.f4638b)) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }

    public static AbstractC0811u e(Size size) {
        for (Map.Entry entry : f6008b.entrySet()) {
            if (((Range) entry.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                return (AbstractC0811u) entry.getKey();
            }
        }
        return null;
    }

    public final void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            List f6 = f((AbstractC0811u) entry.getKey(), -1);
            Objects.requireNonNull(f6);
            f6.add((Size) entry.getValue());
        }
    }

    public final void c(List list) {
        Integer d6;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            AbstractC0811u e6 = e(size);
            if (e6 != null && (d6 = d(size)) != null) {
                List f6 = f(e6, d6.intValue());
                Objects.requireNonNull(f6);
                f6.add(size);
            }
        }
    }

    public final List f(AbstractC0811u abstractC0811u, int i6) {
        return (List) this.f6010a.get(a.c(abstractC0811u, i6));
    }

    public List g(AbstractC0811u abstractC0811u, int i6) {
        List f6 = f(abstractC0811u, i6);
        return f6 != null ? new ArrayList(f6) : new ArrayList(0);
    }

    public final void h(Map map) {
        for (Map.Entry entry : this.f6010a.entrySet()) {
            Size size = (Size) map.get(((a) entry.getKey()).b());
            if (size != null) {
                final int a6 = S.d.a(size);
                Collections.sort((List) entry.getValue(), new Comparator() { // from class: X.v
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C0813w.a(a6, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }
}
