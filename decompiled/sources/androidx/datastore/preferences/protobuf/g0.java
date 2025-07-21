package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1047y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8731a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f8732b = B(false);

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f8733c = B(true);

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f8734d = new n0();

    public static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static l0 B(boolean z6) {
        try {
            Class C6 = C();
            if (C6 == null) {
                return null;
            }
            return (l0) C6.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC1039p abstractC1039p, Object obj, Object obj2) {
        C1041s c6 = abstractC1039p.c(obj2);
        if (c6.j()) {
            return;
        }
        abstractC1039p.d(obj).p(c6);
    }

    public static void E(J j6, Object obj, Object obj2, long j7) {
        p0.R(obj, j7, j6.a(p0.C(obj, j7), p0.C(obj2, j7)));
    }

    public static void F(l0 l0Var, Object obj, Object obj2) {
        l0Var.p(obj, l0Var.k(l0Var.g(obj), l0Var.g(obj2)));
    }

    public static l0 G() {
        return f8732b;
    }

    public static l0 H() {
        return f8733c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC1045w.class.isAssignableFrom(cls) && (cls2 = f8731a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object K(Object obj, int i6, int i7, Object obj2, l0 l0Var) {
        if (obj2 == null) {
            obj2 = l0Var.f(obj);
        }
        l0Var.e(obj2, i6, i7);
        return obj2;
    }

    public static l0 L() {
        return f8734d;
    }

    public static void M(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.w(i6, list, z6);
    }

    public static void N(int i6, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i6, list);
    }

    public static void O(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i6, list, z6);
    }

    public static void P(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i6, list, z6);
    }

    public static void Q(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i6, list, z6);
    }

    public static void R(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.s(i6, list, z6);
    }

    public static void S(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i6, list, z6);
    }

    public static void T(int i6, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.K(i6, list, e0Var);
    }

    public static void U(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.m(i6, list, z6);
    }

    public static void V(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.E(i6, list, z6);
    }

    public static void W(int i6, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i6, list, e0Var);
    }

    public static void X(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.t(i6, list, z6);
    }

    public static void Y(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i6, list, z6);
    }

    public static void Z(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.C(i6, list, z6);
    }

    public static int a(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(size) : size * AbstractC1033j.c(i6, true);
    }

    public static void a0(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i6, list, z6);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i6, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i6, list);
    }

    public static int c(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O5 = size * AbstractC1033j.O(i6);
        for (int i7 = 0; i7 < list.size(); i7++) {
            O5 += AbstractC1033j.g((AbstractC1030g) list.get(i7));
        }
        return O5;
    }

    public static void c0(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.x(i6, list, z6);
    }

    public static int d(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e6 = e(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(e6) : e6 + (size * AbstractC1033j.O(i6));
    }

    public static void d0(int i6, List list, s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i6, list, z6);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1046x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.k(((Integer) list.get(i7)).intValue());
        }
        return i6;
    }

    public static int f(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(size * 4) : size * AbstractC1033j.l(i6, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(size * 8) : size * AbstractC1033j.n(i6, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i6, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC1033j.r(i6, (O) list.get(i8), e0Var);
        }
        return i7;
    }

    public static int k(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l6 = l(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(l6) : l6 + (size * AbstractC1033j.O(i6));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1046x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.v(((Integer) list.get(i7)).intValue());
        }
        return i6;
    }

    public static int m(int i6, List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        int n6 = n(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(n6) : n6 + (list.size() * AbstractC1033j.O(i6));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.x(((Long) list.get(i7)).longValue());
        }
        return i6;
    }

    public static int o(int i6, Object obj, e0 e0Var) {
        return AbstractC1033j.z(i6, (O) obj, e0Var);
    }

    public static int p(int i6, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O5 = AbstractC1033j.O(i6) * size;
        for (int i7 = 0; i7 < size; i7++) {
            O5 += AbstractC1033j.B((O) list.get(i7), e0Var);
        }
        return O5;
    }

    public static int q(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r6 = r(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(r6) : r6 + (size * AbstractC1033j.O(i6));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1046x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.J(((Integer) list.get(i7)).intValue());
        }
        return i6;
    }

    public static int s(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t6 = t(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(t6) : t6 + (size * AbstractC1033j.O(i6));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.L(((Long) list.get(i7)).longValue());
        }
        return i6;
    }

    public static int u(int i6, List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int O5 = AbstractC1033j.O(i6) * size;
        if (!(list instanceof D)) {
            while (i7 < size) {
                Object obj = list.get(i7);
                O5 += obj instanceof AbstractC1030g ? AbstractC1033j.g((AbstractC1030g) obj) : AbstractC1033j.N((String) obj);
                i7++;
            }
            return O5;
        }
        D d6 = (D) list;
        while (i7 < size) {
            Object f6 = d6.f(i7);
            O5 += f6 instanceof AbstractC1030g ? AbstractC1033j.g((AbstractC1030g) f6) : AbstractC1033j.N((String) f6);
            i7++;
        }
        return O5;
    }

    public static int v(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w6 = w(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(w6) : w6 + (size * AbstractC1033j.O(i6));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1046x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.Q(((Integer) list.get(i7)).intValue());
        }
        return i6;
    }

    public static int x(int i6, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y6 = y(list);
        return z6 ? AbstractC1033j.O(i6) + AbstractC1033j.y(y6) : y6 + (size * AbstractC1033j.O(i6));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += AbstractC1033j.S(((Long) list.get(i7)).longValue());
        }
        return i6;
    }

    public static Object z(Object obj, int i6, List list, AbstractC1047y.a aVar, Object obj2, l0 l0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue)) {
                    obj2 = K(obj, i6, intValue, obj2, l0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Integer num = (Integer) list.get(i8);
            int intValue2 = num.intValue();
            if (aVar.a(intValue2)) {
                if (i8 != i7) {
                    list.set(i7, num);
                }
                i7++;
            } else {
                obj2 = K(obj, i6, intValue2, obj2, l0Var);
            }
        }
        if (i7 != size) {
            list.subList(i7, size).clear();
        }
        return obj2;
    }
}
