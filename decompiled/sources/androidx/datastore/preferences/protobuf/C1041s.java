package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1041s {

    /* renamed from: d, reason: collision with root package name */
    public static final C1041s f8879d = new C1041s(true);

    /* renamed from: a, reason: collision with root package name */
    public final h0 f8880a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8881b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8882c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8883a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8884b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f8884b = iArr;
            try {
                iArr[r0.b.f8847c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8884b[r0.b.f8848d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8884b[r0.b.f8849e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8884b[r0.b.f8850f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8884b[r0.b.f8851g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8884b[r0.b.f8852h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8884b[r0.b.f8853i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8884b[r0.b.f8854j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8884b[r0.b.f8856l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8884b[r0.b.f8857m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8884b[r0.b.f8855k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8884b[r0.b.f8858n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8884b[r0.b.f8859o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8884b[r0.b.f8861q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8884b[r0.b.f8862r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8884b[r0.b.f8863s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8884b[r0.b.f8864t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8884b[r0.b.f8860p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f8883a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8883a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8883a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8883a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8883a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8883a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8883a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8883a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8883a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b extends Comparable {
        r0.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public C1041s() {
        this.f8880a = h0.q(16);
    }

    public static int b(r0.b bVar, int i6, Object obj) {
        int O5 = AbstractC1033j.O(i6);
        if (bVar == r0.b.f8856l) {
            O5 *= 2;
        }
        return O5 + c(bVar, obj);
    }

    public static int c(r0.b bVar, Object obj) {
        switch (a.f8884b[bVar.ordinal()]) {
            case 1:
                return AbstractC1033j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC1033j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC1033j.x(((Long) obj).longValue());
            case 4:
                return AbstractC1033j.S(((Long) obj).longValue());
            case 5:
                return AbstractC1033j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC1033j.o(((Long) obj).longValue());
            case 7:
                return AbstractC1033j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC1033j.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1033j.s((O) obj);
            case 10:
                return AbstractC1033j.A((O) obj);
            case 11:
                return obj instanceof AbstractC1030g ? AbstractC1033j.g((AbstractC1030g) obj) : AbstractC1033j.N((String) obj);
            case 12:
                return obj instanceof AbstractC1030g ? AbstractC1033j.g((AbstractC1030g) obj) : AbstractC1033j.e((byte[]) obj);
            case 13:
                return AbstractC1033j.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC1033j.F(((Integer) obj).intValue());
            case 15:
                return AbstractC1033j.H(((Long) obj).longValue());
            case 16:
                return AbstractC1033j.J(((Integer) obj).intValue());
            case 17:
                return AbstractC1033j.L(((Long) obj).longValue());
            case 18:
                return AbstractC1033j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int i6 = 0;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i6 += b(liteType, number, it.next());
            }
            return i6;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i6 += c(liteType, it2.next());
        }
        return AbstractC1033j.O(number) + i6 + AbstractC1033j.Q(i6);
    }

    public static int i(r0.b bVar, boolean z6) {
        if (z6) {
            return 2;
        }
        return bVar.b();
    }

    public static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    public static boolean m(r0.b bVar, Object obj) {
        AbstractC1047y.a(obj);
        switch (a.f8883a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC1030g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof O;
            default:
                return false;
        }
    }

    public static C1041s r() {
        return new C1041s();
    }

    public static void u(AbstractC1033j abstractC1033j, r0.b bVar, int i6, Object obj) {
        if (bVar == r0.b.f8856l) {
            abstractC1033j.q0(i6, (O) obj);
        } else {
            abstractC1033j.M0(i6, i(bVar, false));
            v(abstractC1033j, bVar, obj);
        }
    }

    public static void v(AbstractC1033j abstractC1033j, r0.b bVar, Object obj) {
        switch (a.f8884b[bVar.ordinal()]) {
            case 1:
                abstractC1033j.h0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC1033j.p0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC1033j.x0(((Long) obj).longValue());
                return;
            case 4:
                abstractC1033j.Q0(((Long) obj).longValue());
                return;
            case 5:
                abstractC1033j.v0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC1033j.n0(((Long) obj).longValue());
                return;
            case 7:
                abstractC1033j.l0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC1033j.b0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC1033j.s0((O) obj);
                return;
            case 10:
                abstractC1033j.z0((O) obj);
                return;
            case 11:
                if (obj instanceof AbstractC1030g) {
                    abstractC1033j.f0((AbstractC1030g) obj);
                    return;
                } else {
                    abstractC1033j.L0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof AbstractC1030g) {
                    abstractC1033j.f0((AbstractC1030g) obj);
                    return;
                } else {
                    abstractC1033j.c0((byte[]) obj);
                    return;
                }
            case 13:
                abstractC1033j.O0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC1033j.D0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC1033j.F0(((Long) obj).longValue());
                return;
            case 16:
                abstractC1033j.H0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC1033j.J0(((Long) obj).longValue());
                return;
            case 18:
                abstractC1033j.j0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1041s clone() {
        C1041s r6 = r();
        for (int i6 = 0; i6 < this.f8880a.k(); i6++) {
            Map.Entry j6 = this.f8880a.j(i6);
            android.support.v4.media.session.b.a(j6.getKey());
            r6.s(null, j6.getValue());
        }
        for (Map.Entry entry : this.f8880a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            r6.s(null, entry.getValue());
        }
        r6.f8882c = this.f8882c;
        return r6;
    }

    public Iterator e() {
        return this.f8882c ? new B(this.f8880a.h().iterator()) : this.f8880a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1041s) {
            return this.f8880a.equals(((C1041s) obj).f8880a);
        }
        return false;
    }

    public int f() {
        int i6 = 0;
        for (int i7 = 0; i7 < this.f8880a.k(); i7++) {
            i6 += g(this.f8880a.j(i7));
        }
        Iterator it = this.f8880a.m().iterator();
        while (it.hasNext()) {
            i6 += g((Map.Entry) it.next());
        }
        return i6;
    }

    public final int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int i6 = 0;
        for (int i7 = 0; i7 < this.f8880a.k(); i7++) {
            Map.Entry j6 = this.f8880a.j(i7);
            android.support.v4.media.session.b.a(j6.getKey());
            i6 += d(null, j6.getValue());
        }
        for (Map.Entry entry : this.f8880a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i6 += d(null, entry.getValue());
        }
        return i6;
    }

    public int hashCode() {
        return this.f8880a.hashCode();
    }

    public boolean j() {
        return this.f8880a.isEmpty();
    }

    public boolean k() {
        for (int i6 = 0; i6 < this.f8880a.k(); i6++) {
            if (!l(this.f8880a.j(i6))) {
                return false;
            }
        }
        Iterator it = this.f8880a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f8882c ? new B(this.f8880a.entrySet().iterator()) : this.f8880a.entrySet().iterator();
    }

    public void o() {
        if (this.f8881b) {
            return;
        }
        for (int i6 = 0; i6 < this.f8880a.k(); i6++) {
            Map.Entry j6 = this.f8880a.j(i6);
            if (j6.getValue() instanceof AbstractC1045w) {
                ((AbstractC1045w) j6.getValue()).A();
            }
        }
        this.f8880a.p();
        this.f8881b = true;
    }

    public void p(C1041s c1041s) {
        for (int i6 = 0; i6 < c1041s.f8880a.k(); i6++) {
            q(c1041s.f8880a.j(i6));
        }
        Iterator it = c1041s.f8880a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.isRepeated()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f8880a.put(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.getLiteType().a(), obj.getClass().getName()));
        }
    }

    public C1041s(boolean z6) {
        this(h0.q(0));
        o();
    }

    public C1041s(h0 h0Var) {
        this.f8880a = h0Var;
        o();
    }
}
