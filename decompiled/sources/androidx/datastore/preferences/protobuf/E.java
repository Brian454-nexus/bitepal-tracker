package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1047y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f8660a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f8661b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends E {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f8662c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j6) {
            return (List) p0.C(obj, j6);
        }

        public static List g(Object obj, long j6, int i6) {
            List f6 = f(obj, j6);
            if (f6.isEmpty()) {
                List c6 = f6 instanceof D ? new C(i6) : ((f6 instanceof Y) && (f6 instanceof AbstractC1047y.b)) ? ((AbstractC1047y.b) f6).e(i6) : new ArrayList(i6);
                p0.R(obj, j6, c6);
                return c6;
            }
            if (f8662c.isAssignableFrom(f6.getClass())) {
                ArrayList arrayList = new ArrayList(f6.size() + i6);
                arrayList.addAll(f6);
                p0.R(obj, j6, arrayList);
                return arrayList;
            }
            if (f6 instanceof o0) {
                C c7 = new C(f6.size() + i6);
                c7.addAll((o0) f6);
                p0.R(obj, j6, c7);
                return c7;
            }
            if ((f6 instanceof Y) && (f6 instanceof AbstractC1047y.b)) {
                AbstractC1047y.b bVar = (AbstractC1047y.b) f6;
                if (!bVar.g()) {
                    AbstractC1047y.b e6 = bVar.e(f6.size() + i6);
                    p0.R(obj, j6, e6);
                    return e6;
                }
            }
            return f6;
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void c(Object obj, long j6) {
            Object unmodifiableList;
            List list = (List) p0.C(obj, j6);
            if (list instanceof D) {
                unmodifiableList = ((D) list).getUnmodifiableView();
            } else {
                if (f8662c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC1047y.b)) {
                    AbstractC1047y.b bVar = (AbstractC1047y.b) list;
                    if (bVar.g()) {
                        bVar.d();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            p0.R(obj, j6, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void d(Object obj, Object obj2, long j6) {
            List f6 = f(obj2, j6);
            List g6 = g(obj, j6, f6.size());
            int size = g6.size();
            int size2 = f6.size();
            if (size > 0 && size2 > 0) {
                g6.addAll(f6);
            }
            if (size > 0) {
                f6 = g6;
            }
            p0.R(obj, j6, f6);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public List e(Object obj, long j6) {
            return g(obj, j6, 10);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends E {
        public c() {
            super();
        }

        public static AbstractC1047y.b f(Object obj, long j6) {
            return (AbstractC1047y.b) p0.C(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void c(Object obj, long j6) {
            f(obj, j6).d();
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void d(Object obj, Object obj2, long j6) {
            AbstractC1047y.b f6 = f(obj, j6);
            AbstractC1047y.b f7 = f(obj2, j6);
            int size = f6.size();
            int size2 = f7.size();
            if (size > 0 && size2 > 0) {
                if (!f6.g()) {
                    f6 = f6.e(size2 + size);
                }
                f6.addAll(f7);
            }
            if (size > 0) {
                f7 = f6;
            }
            p0.R(obj, j6, f7);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public List e(Object obj, long j6) {
            AbstractC1047y.b f6 = f(obj, j6);
            if (f6.g()) {
                return f6;
            }
            int size = f6.size();
            AbstractC1047y.b e6 = f6.e(size == 0 ? 10 : size * 2);
            p0.R(obj, j6, e6);
            return e6;
        }
    }

    static {
        f8660a = new b();
        f8661b = new c();
    }

    public static E a() {
        return f8660a;
    }

    public static E b() {
        return f8661b;
    }

    public abstract void c(Object obj, long j6);

    public abstract void d(Object obj, Object obj2, long j6);

    public abstract List e(Object obj, long j6);

    public E() {
    }
}
