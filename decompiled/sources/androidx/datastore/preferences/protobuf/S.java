package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1047y;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class S implements e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f8678r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f8679s = p0.D();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8680a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8682c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8683d;

    /* renamed from: e, reason: collision with root package name */
    public final O f8684e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8685f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8686g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8687h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8688i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f8689j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8690k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8691l;

    /* renamed from: m, reason: collision with root package name */
    public final U f8692m;

    /* renamed from: n, reason: collision with root package name */
    public final E f8693n;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f8694o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1039p f8695p;

    /* renamed from: q, reason: collision with root package name */
    public final J f8696q;

    public S(int[] iArr, Object[] objArr, int i6, int i7, O o6, boolean z6, boolean z7, int[] iArr2, int i8, int i9, U u6, E e6, l0 l0Var, AbstractC1039p abstractC1039p, J j6) {
        this.f8680a = iArr;
        this.f8681b = objArr;
        this.f8682c = i6;
        this.f8683d = i7;
        this.f8686g = o6 instanceof AbstractC1045w;
        this.f8687h = z6;
        this.f8685f = abstractC1039p != null && abstractC1039p.e(o6);
        this.f8688i = z7;
        this.f8689j = iArr2;
        this.f8690k = i8;
        this.f8691l = i9;
        this.f8692m = u6;
        this.f8693n = e6;
        this.f8694o = l0Var;
        this.f8695p = abstractC1039p;
        this.f8684e = o6;
        this.f8696q = j6;
    }

    public static boolean A(Object obj, int i6, e0 e0Var) {
        return e0Var.c(p0.C(obj, U(i6)));
    }

    public static boolean D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1045w) {
            return ((AbstractC1045w) obj).z();
        }
        return true;
    }

    public static boolean G(int i6) {
        return (i6 & 268435456) != 0;
    }

    public static List H(Object obj, long j6) {
        return (List) p0.C(obj, j6);
    }

    public static long I(Object obj, long j6) {
        return p0.A(obj, j6);
    }

    public static S Q(Class cls, M m6, U u6, E e6, l0 l0Var, AbstractC1039p abstractC1039p, J j6) {
        if (m6 instanceof c0) {
            return S((c0) m6, u6, e6, l0Var, abstractC1039p, j6);
        }
        android.support.v4.media.session.b.a(m6);
        return R(null, u6, e6, l0Var, abstractC1039p, j6);
    }

    public static S R(i0 i0Var, U u6, E e6, l0 l0Var, AbstractC1039p abstractC1039p, J j6) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.S S(androidx.datastore.preferences.protobuf.c0 r33, androidx.datastore.preferences.protobuf.U r34, androidx.datastore.preferences.protobuf.E r35, androidx.datastore.preferences.protobuf.l0 r36, androidx.datastore.preferences.protobuf.AbstractC1039p r37, androidx.datastore.preferences.protobuf.J r38) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.S(androidx.datastore.preferences.protobuf.c0, androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.E, androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.J):androidx.datastore.preferences.protobuf.S");
    }

    public static long U(int i6) {
        return i6 & 1048575;
    }

    public static boolean V(Object obj, long j6) {
        return ((Boolean) p0.C(obj, j6)).booleanValue();
    }

    public static double W(Object obj, long j6) {
        return ((Double) p0.C(obj, j6)).doubleValue();
    }

    public static float X(Object obj, long j6) {
        return ((Float) p0.C(obj, j6)).floatValue();
    }

    public static int Y(Object obj, long j6) {
        return ((Integer) p0.C(obj, j6)).intValue();
    }

    public static long Z(Object obj, long j6) {
        return ((Long) p0.C(obj, j6)).longValue();
    }

    public static Field g0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static boolean k(Object obj, long j6) {
        return p0.r(obj, j6);
    }

    public static void l(Object obj) {
        if (D(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double m(Object obj, long j6) {
        return p0.x(obj, j6);
    }

    public static int m0(int i6) {
        return (i6 & 267386880) >>> 20;
    }

    public static float p(Object obj, long j6) {
        return p0.y(obj, j6);
    }

    public static int w(Object obj, long j6) {
        return p0.z(obj, j6);
    }

    public static boolean x(int i6) {
        return (i6 & 536870912) != 0;
    }

    public final boolean B(Object obj, int i6, int i7) {
        List list = (List) p0.C(obj, U(i6));
        if (list.isEmpty()) {
            return true;
        }
        e0 s6 = s(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!s6.c(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final boolean C(Object obj, int i6, int i7) {
        Map h6 = this.f8696q.h(p0.C(obj, U(i6)));
        if (h6.isEmpty()) {
            return true;
        }
        if (this.f8696q.c(r(i7)).f8671c.a() != r0.c.MESSAGE) {
            return true;
        }
        e0 e0Var = null;
        for (Object obj2 : h6.values()) {
            if (e0Var == null) {
                e0Var = a0.a().c(obj2.getClass());
            }
            if (!e0Var.c(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean E(Object obj, Object obj2, int i6) {
        long b02 = b0(i6) & 1048575;
        return p0.z(obj, b02) == p0.z(obj2, b02);
    }

    public final boolean F(Object obj, int i6, int i7) {
        return p0.z(obj, (long) (b0(i7) & 1048575)) == i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x00a8, code lost:
    
        r0 = r9.f8690k;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00ad, code lost:
    
        if (r0 >= r9.f8691l) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00af, code lost:
    
        r4 = r9.o(r2, r9.f8689j[r0], r4, r5, r19);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00c0, code lost:
    
        if (r4 == null) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00c2, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:44:0x06d8 A[Catch: all -> 0x06f9, TRY_LEAVE, TryCatch #11 {all -> 0x06f9, blocks: (B:42:0x06d2, B:44:0x06d8, B:57:0x06fd, B:58:0x0702), top: B:41:0x06d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0732 A[LOOP:4: B:71:0x072e->B:73:0x0732, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0745  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(androidx.datastore.preferences.protobuf.l0 r17, androidx.datastore.preferences.protobuf.AbstractC1039p r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.d0 r20, androidx.datastore.preferences.protobuf.C1038o r21) {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.J(androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o):void");
    }

    public final void K(Object obj, int i6, Object obj2, C1038o c1038o, d0 d0Var) {
        long U5 = U(n0(i6));
        Object C6 = p0.C(obj, U5);
        if (C6 == null) {
            C6 = this.f8696q.e(obj2);
            p0.R(obj, U5, C6);
        } else if (this.f8696q.g(C6)) {
            Object e6 = this.f8696q.e(obj2);
            this.f8696q.a(e6, C6);
            p0.R(obj, U5, e6);
            C6 = e6;
        }
        d0Var.K(this.f8696q.d(C6), this.f8696q.c(obj2), c1038o);
    }

    public final void L(Object obj, Object obj2, int i6) {
        if (y(obj2, i6)) {
            long U5 = U(n0(i6));
            Unsafe unsafe = f8679s;
            Object object = unsafe.getObject(obj2, U5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + T(i6) + " is present but null: " + obj2);
            }
            e0 s6 = s(i6);
            if (!y(obj, i6)) {
                if (D(object)) {
                    Object f6 = s6.f();
                    s6.a(f6, object);
                    unsafe.putObject(obj, U5, f6);
                } else {
                    unsafe.putObject(obj, U5, object);
                }
                h0(obj, i6);
                return;
            }
            Object object2 = unsafe.getObject(obj, U5);
            if (!D(object2)) {
                Object f7 = s6.f();
                s6.a(f7, object2);
                unsafe.putObject(obj, U5, f7);
                object2 = f7;
            }
            s6.a(object2, object);
        }
    }

    public final void M(Object obj, Object obj2, int i6) {
        int T5 = T(i6);
        if (F(obj2, T5, i6)) {
            long U5 = U(n0(i6));
            Unsafe unsafe = f8679s;
            Object object = unsafe.getObject(obj2, U5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + T(i6) + " is present but null: " + obj2);
            }
            e0 s6 = s(i6);
            if (!F(obj, T5, i6)) {
                if (D(object)) {
                    Object f6 = s6.f();
                    s6.a(f6, object);
                    unsafe.putObject(obj, U5, f6);
                } else {
                    unsafe.putObject(obj, U5, object);
                }
                i0(obj, T5, i6);
                return;
            }
            Object object2 = unsafe.getObject(obj, U5);
            if (!D(object2)) {
                Object f7 = s6.f();
                s6.a(f7, object2);
                unsafe.putObject(obj, U5, f7);
                object2 = f7;
            }
            s6.a(object2, object);
        }
    }

    public final void N(Object obj, Object obj2, int i6) {
        int n02 = n0(i6);
        long U5 = U(n02);
        int T5 = T(i6);
        switch (m0(n02)) {
            case 0:
                if (y(obj2, i6)) {
                    p0.N(obj, U5, p0.x(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 1:
                if (y(obj2, i6)) {
                    p0.O(obj, U5, p0.y(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 2:
                if (y(obj2, i6)) {
                    p0.Q(obj, U5, p0.A(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 3:
                if (y(obj2, i6)) {
                    p0.Q(obj, U5, p0.A(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 4:
                if (y(obj2, i6)) {
                    p0.P(obj, U5, p0.z(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 5:
                if (y(obj2, i6)) {
                    p0.Q(obj, U5, p0.A(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 6:
                if (y(obj2, i6)) {
                    p0.P(obj, U5, p0.z(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 7:
                if (y(obj2, i6)) {
                    p0.H(obj, U5, p0.r(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 8:
                if (y(obj2, i6)) {
                    p0.R(obj, U5, p0.C(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 9:
                L(obj, obj2, i6);
                return;
            case 10:
                if (y(obj2, i6)) {
                    p0.R(obj, U5, p0.C(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 11:
                if (y(obj2, i6)) {
                    p0.P(obj, U5, p0.z(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 12:
                if (y(obj2, i6)) {
                    p0.P(obj, U5, p0.z(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 13:
                if (y(obj2, i6)) {
                    p0.P(obj, U5, p0.z(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 14:
                if (y(obj2, i6)) {
                    p0.Q(obj, U5, p0.A(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 15:
                if (y(obj2, i6)) {
                    p0.P(obj, U5, p0.z(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 16:
                if (y(obj2, i6)) {
                    p0.Q(obj, U5, p0.A(obj2, U5));
                    h0(obj, i6);
                    return;
                }
                return;
            case 17:
                L(obj, obj2, i6);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f8693n.d(obj, obj2, U5);
                return;
            case 50:
                g0.E(this.f8696q, obj, obj2, U5);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (F(obj2, T5, i6)) {
                    p0.R(obj, U5, p0.C(obj2, U5));
                    i0(obj, T5, i6);
                    return;
                }
                return;
            case 60:
                M(obj, obj2, i6);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (F(obj2, T5, i6)) {
                    p0.R(obj, U5, p0.C(obj2, U5));
                    i0(obj, T5, i6);
                    return;
                }
                return;
            case 68:
                M(obj, obj2, i6);
                return;
            default:
                return;
        }
    }

    public final Object O(Object obj, int i6) {
        e0 s6 = s(i6);
        long U5 = U(n0(i6));
        if (!y(obj, i6)) {
            return s6.f();
        }
        Object object = f8679s.getObject(obj, U5);
        if (D(object)) {
            return object;
        }
        Object f6 = s6.f();
        if (object != null) {
            s6.a(f6, object);
        }
        return f6;
    }

    public final Object P(Object obj, int i6, int i7) {
        e0 s6 = s(i7);
        if (!F(obj, i6, i7)) {
            return s6.f();
        }
        Object object = f8679s.getObject(obj, U(n0(i7)));
        if (D(object)) {
            return object;
        }
        Object f6 = s6.f();
        if (object != null) {
            s6.a(f6, object);
        }
        return f6;
    }

    public final int T(int i6) {
        return this.f8680a[i6];
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i6 = 0; i6 < this.f8680a.length; i6 += 3) {
            N(obj, obj2, i6);
        }
        g0.F(this.f8694o, obj, obj2);
        if (this.f8685f) {
            g0.D(this.f8695p, obj, obj2);
        }
    }

    public final int a0(int i6) {
        if (i6 < this.f8682c || i6 > this.f8683d) {
            return -1;
        }
        return j0(i6, 0);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj) {
        if (D(obj)) {
            if (obj instanceof AbstractC1045w) {
                AbstractC1045w abstractC1045w = (AbstractC1045w) obj;
                abstractC1045w.j();
                abstractC1045w.i();
                abstractC1045w.B();
            }
            int length = this.f8680a.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int n02 = n0(i6);
                long U5 = U(n02);
                int m02 = m0(n02);
                if (m02 != 9) {
                    if (m02 != 60 && m02 != 68) {
                        switch (m02) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f8693n.c(obj, U5);
                                break;
                            case 50:
                                Unsafe unsafe = f8679s;
                                Object object = unsafe.getObject(obj, U5);
                                if (object != null) {
                                    unsafe.putObject(obj, U5, this.f8696q.b(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (F(obj, T(i6), i6)) {
                        s(i6).b(f8679s.getObject(obj, U5));
                    }
                }
                if (y(obj, i6)) {
                    s(i6).b(f8679s.getObject(obj, U5));
                }
            }
            this.f8694o.j(obj);
            if (this.f8685f) {
                this.f8695p.f(obj);
            }
        }
    }

    public final int b0(int i6) {
        return this.f8680a[i6 + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean c(Object obj) {
        int i6;
        int i7;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i9 < this.f8690k) {
            int i11 = this.f8689j[i9];
            int T5 = T(i11);
            int n02 = n0(i11);
            int i12 = this.f8680a[i11 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i8) {
                if (i13 != 1048575) {
                    i10 = f8679s.getInt(obj, i13);
                }
                i7 = i10;
                i6 = i13;
            } else {
                i6 = i8;
                i7 = i10;
            }
            Object obj2 = obj;
            if (G(n02) && !z(obj2, i11, i6, i7, i14)) {
                return false;
            }
            int m02 = m0(n02);
            if (m02 != 9 && m02 != 17) {
                if (m02 != 27) {
                    if (m02 == 60 || m02 == 68) {
                        if (F(obj2, T5, i11) && !A(obj2, n02, s(i11))) {
                            return false;
                        }
                    } else if (m02 != 49) {
                        if (m02 == 50 && !C(obj2, n02, i11)) {
                            return false;
                        }
                    }
                }
                if (!B(obj2, n02, i11)) {
                    return false;
                }
            } else if (z(obj2, i11, i6, i7, i14) && !A(obj2, n02, s(i11))) {
                return false;
            }
            i9++;
            obj = obj2;
            i8 = i6;
            i10 = i7;
        }
        return !this.f8685f || this.f8695p.c(obj).k();
    }

    public final void c0(Object obj, long j6, d0 d0Var, e0 e0Var, C1038o c1038o) {
        d0Var.M(this.f8693n.e(obj, j6), e0Var, c1038o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean d(Object obj, Object obj2) {
        int length = this.f8680a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            if (!n(obj, obj2, i6)) {
                return false;
            }
        }
        if (!this.f8694o.g(obj).equals(this.f8694o.g(obj2))) {
            return false;
        }
        if (this.f8685f) {
            return this.f8695p.c(obj).equals(this.f8695p.c(obj2));
        }
        return true;
    }

    public final void d0(Object obj, int i6, d0 d0Var, e0 e0Var, C1038o c1038o) {
        d0Var.N(this.f8693n.e(obj, U(i6)), e0Var, c1038o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int e(Object obj) {
        return this.f8687h ? u(obj) : t(obj);
    }

    public final void e0(Object obj, int i6, d0 d0Var) {
        if (x(i6)) {
            p0.R(obj, U(i6), d0Var.H());
        } else if (this.f8686g) {
            p0.R(obj, U(i6), d0Var.v());
        } else {
            p0.R(obj, U(i6), d0Var.z());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object f() {
        return this.f8692m.a(this.f8684e);
    }

    public final void f0(Object obj, int i6, d0 d0Var) {
        if (x(i6)) {
            d0Var.y(this.f8693n.e(obj, U(i6)));
        } else {
            d0Var.x(this.f8693n.e(obj, U(i6)));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(Object obj) {
        int i6;
        int f6;
        int length = this.f8680a.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int n02 = n0(i8);
            int T5 = T(i8);
            long U5 = U(n02);
            int i9 = 37;
            switch (m0(n02)) {
                case 0:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.f(Double.doubleToLongBits(p0.x(obj, U5)));
                    i7 = i6 + f6;
                    break;
                case 1:
                    i6 = i7 * 53;
                    f6 = Float.floatToIntBits(p0.y(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 2:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.f(p0.A(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 3:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.f(p0.A(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 4:
                    i6 = i7 * 53;
                    f6 = p0.z(obj, U5);
                    i7 = i6 + f6;
                    break;
                case 5:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.f(p0.A(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 6:
                    i6 = i7 * 53;
                    f6 = p0.z(obj, U5);
                    i7 = i6 + f6;
                    break;
                case 7:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.c(p0.r(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 8:
                    i6 = i7 * 53;
                    f6 = ((String) p0.C(obj, U5)).hashCode();
                    i7 = i6 + f6;
                    break;
                case 9:
                    Object C6 = p0.C(obj, U5);
                    if (C6 != null) {
                        i9 = C6.hashCode();
                    }
                    i7 = (i7 * 53) + i9;
                    break;
                case 10:
                    i6 = i7 * 53;
                    f6 = p0.C(obj, U5).hashCode();
                    i7 = i6 + f6;
                    break;
                case 11:
                    i6 = i7 * 53;
                    f6 = p0.z(obj, U5);
                    i7 = i6 + f6;
                    break;
                case 12:
                    i6 = i7 * 53;
                    f6 = p0.z(obj, U5);
                    i7 = i6 + f6;
                    break;
                case 13:
                    i6 = i7 * 53;
                    f6 = p0.z(obj, U5);
                    i7 = i6 + f6;
                    break;
                case 14:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.f(p0.A(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 15:
                    i6 = i7 * 53;
                    f6 = p0.z(obj, U5);
                    i7 = i6 + f6;
                    break;
                case 16:
                    i6 = i7 * 53;
                    f6 = AbstractC1047y.f(p0.A(obj, U5));
                    i7 = i6 + f6;
                    break;
                case 17:
                    Object C7 = p0.C(obj, U5);
                    if (C7 != null) {
                        i9 = C7.hashCode();
                    }
                    i7 = (i7 * 53) + i9;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i6 = i7 * 53;
                    f6 = p0.C(obj, U5).hashCode();
                    i7 = i6 + f6;
                    break;
                case 50:
                    i6 = i7 * 53;
                    f6 = p0.C(obj, U5).hashCode();
                    i7 = i6 + f6;
                    break;
                case 51:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.f(Double.doubleToLongBits(W(obj, U5)));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Float.floatToIntBits(X(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.f(Z(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.f(Z(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Y(obj, U5);
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.f(Z(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Y(obj, U5);
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.c(V(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = ((String) p0.C(obj, U5)).hashCode();
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = p0.C(obj, U5).hashCode();
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = p0.C(obj, U5).hashCode();
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Y(obj, U5);
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Y(obj, U5);
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Y(obj, U5);
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.f(Z(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = Y(obj, U5);
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = AbstractC1047y.f(Z(obj, U5));
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (F(obj, T5, i8)) {
                        i6 = i7 * 53;
                        f6 = p0.C(obj, U5).hashCode();
                        i7 = i6 + f6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i7 * 53) + this.f8694o.g(obj).hashCode();
        return this.f8685f ? (hashCode * 53) + this.f8695p.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void h(Object obj, d0 d0Var, C1038o c1038o) {
        c1038o.getClass();
        l(obj);
        J(this.f8694o, this.f8695p, obj, d0Var, c1038o);
    }

    public final void h0(Object obj, int i6) {
        int b02 = b0(i6);
        long j6 = 1048575 & b02;
        if (j6 == 1048575) {
            return;
        }
        p0.P(obj, j6, (1 << (b02 >>> 20)) | p0.z(obj, j6));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void i(Object obj, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            q0(obj, s0Var);
        } else if (this.f8687h) {
            p0(obj, s0Var);
        } else {
            o0(obj, s0Var);
        }
    }

    public final void i0(Object obj, int i6, int i7) {
        p0.P(obj, b0(i7) & 1048575, i6);
    }

    public final boolean j(Object obj, Object obj2, int i6) {
        return y(obj, i6) == y(obj2, i6);
    }

    public final int j0(int i6, int i7) {
        int length = (this.f8680a.length / 3) - 1;
        while (i7 <= length) {
            int i8 = (length + i7) >>> 1;
            int i9 = i8 * 3;
            int T5 = T(i9);
            if (i6 == T5) {
                return i9;
            }
            if (i6 < T5) {
                length = i8 - 1;
            } else {
                i7 = i8 + 1;
            }
        }
        return -1;
    }

    public final void k0(Object obj, int i6, Object obj2) {
        f8679s.putObject(obj, U(n0(i6)), obj2);
        h0(obj, i6);
    }

    public final void l0(Object obj, int i6, int i7, Object obj2) {
        f8679s.putObject(obj, U(n0(i7)), obj2);
        i0(obj, i6, i7);
    }

    public final boolean n(Object obj, Object obj2, int i6) {
        int n02 = n0(i6);
        long U5 = U(n02);
        switch (m0(n02)) {
            case 0:
                return j(obj, obj2, i6) && Double.doubleToLongBits(p0.x(obj, U5)) == Double.doubleToLongBits(p0.x(obj2, U5));
            case 1:
                return j(obj, obj2, i6) && Float.floatToIntBits(p0.y(obj, U5)) == Float.floatToIntBits(p0.y(obj2, U5));
            case 2:
                return j(obj, obj2, i6) && p0.A(obj, U5) == p0.A(obj2, U5);
            case 3:
                return j(obj, obj2, i6) && p0.A(obj, U5) == p0.A(obj2, U5);
            case 4:
                return j(obj, obj2, i6) && p0.z(obj, U5) == p0.z(obj2, U5);
            case 5:
                return j(obj, obj2, i6) && p0.A(obj, U5) == p0.A(obj2, U5);
            case 6:
                return j(obj, obj2, i6) && p0.z(obj, U5) == p0.z(obj2, U5);
            case 7:
                return j(obj, obj2, i6) && p0.r(obj, U5) == p0.r(obj2, U5);
            case 8:
                return j(obj, obj2, i6) && g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            case 9:
                return j(obj, obj2, i6) && g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            case 10:
                return j(obj, obj2, i6) && g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            case 11:
                return j(obj, obj2, i6) && p0.z(obj, U5) == p0.z(obj2, U5);
            case 12:
                return j(obj, obj2, i6) && p0.z(obj, U5) == p0.z(obj2, U5);
            case 13:
                return j(obj, obj2, i6) && p0.z(obj, U5) == p0.z(obj2, U5);
            case 14:
                return j(obj, obj2, i6) && p0.A(obj, U5) == p0.A(obj2, U5);
            case 15:
                return j(obj, obj2, i6) && p0.z(obj, U5) == p0.z(obj2, U5);
            case 16:
                return j(obj, obj2, i6) && p0.A(obj, U5) == p0.A(obj2, U5);
            case 17:
                return j(obj, obj2, i6) && g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            case 50:
                return g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return E(obj, obj2, i6) && g0.J(p0.C(obj, U5), p0.C(obj2, U5));
            default:
                return true;
        }
    }

    public final int n0(int i6) {
        return this.f8680a[i6 + 1];
    }

    public final Object o(Object obj, int i6, Object obj2, l0 l0Var, Object obj3) {
        T(i6);
        if (p0.C(obj, U(n0(i6))) == null) {
            return obj2;
        }
        q(i6);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(java.lang.Object r19, androidx.datastore.preferences.protobuf.s0 r20) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.o0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(java.lang.Object r13, androidx.datastore.preferences.protobuf.s0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.p0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final AbstractC1047y.a q(int i6) {
        android.support.v4.media.session.b.a(this.f8681b[((i6 / 3) * 2) + 1]);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(java.lang.Object r11, androidx.datastore.preferences.protobuf.s0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.q0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final Object r(int i6) {
        return this.f8681b[(i6 / 3) * 2];
    }

    public final void r0(s0 s0Var, int i6, Object obj, int i7) {
        if (obj != null) {
            s0Var.N(i6, this.f8696q.c(r(i7)), this.f8696q.h(obj));
        }
    }

    public final e0 s(int i6) {
        int i7 = (i6 / 3) * 2;
        e0 e0Var = (e0) this.f8681b[i7];
        if (e0Var != null) {
            return e0Var;
        }
        e0 c6 = a0.a().c((Class) this.f8681b[i7 + 1]);
        this.f8681b[i7] = c6;
        return c6;
    }

    public final void s0(int i6, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.k(i6, (String) obj);
        } else {
            s0Var.L(i6, (AbstractC1030g) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005e. Please report as an issue. */
    public final int t(Object obj) {
        int i6;
        int i7;
        int h6;
        int c6;
        boolean z6;
        int f6;
        int i8;
        int O5;
        int Q5;
        Unsafe unsafe = f8679s;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.f8680a.length) {
            int n02 = n0(i11);
            int T5 = T(i11);
            int m02 = m0(n02);
            if (m02 <= 17) {
                i6 = this.f8680a[i11 + 2];
                int i14 = i6 & i9;
                i7 = 1 << (i6 >>> 20);
                if (i14 != i10) {
                    i13 = unsafe.getInt(obj, i14);
                    i10 = i14;
                }
            } else {
                i6 = (!this.f8688i || m02 < EnumC1042t.f8902W.a() || m02 > EnumC1042t.f8920j0.a()) ? 0 : this.f8680a[i11 + 2] & i9;
                i7 = 0;
            }
            long U5 = U(n02);
            switch (m02) {
                case 0:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        h6 = AbstractC1033j.h(T5, 0.0d);
                        i12 += h6;
                        break;
                    }
                case 1:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        h6 = AbstractC1033j.p(T5, 0.0f);
                        i12 += h6;
                        break;
                    }
                case 2:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        h6 = AbstractC1033j.w(T5, unsafe.getLong(obj, U5));
                        i12 += h6;
                        break;
                    }
                case 3:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        h6 = AbstractC1033j.R(T5, unsafe.getLong(obj, U5));
                        i12 += h6;
                        break;
                    }
                case 4:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        h6 = AbstractC1033j.u(T5, unsafe.getInt(obj, U5));
                        i12 += h6;
                        break;
                    }
                case 5:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        h6 = AbstractC1033j.n(T5, 0L);
                        i12 += h6;
                        break;
                    }
                case 6:
                    if ((i13 & i7) != 0) {
                        h6 = AbstractC1033j.l(T5, 0);
                        i12 += h6;
                        break;
                    }
                    break;
                case 7:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.c(T5, true);
                        i12 += c6;
                    }
                    break;
                case 8:
                    if ((i13 & i7) != 0) {
                        Object object = unsafe.getObject(obj, U5);
                        c6 = object instanceof AbstractC1030g ? AbstractC1033j.f(T5, (AbstractC1030g) object) : AbstractC1033j.M(T5, (String) object);
                        i12 += c6;
                    }
                    break;
                case 9:
                    if ((i13 & i7) != 0) {
                        c6 = g0.o(T5, unsafe.getObject(obj, U5), s(i11));
                        i12 += c6;
                    }
                    break;
                case 10:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.f(T5, (AbstractC1030g) unsafe.getObject(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 11:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.P(T5, unsafe.getInt(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 12:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.j(T5, unsafe.getInt(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 13:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.E(T5, 0);
                        i12 += c6;
                    }
                    break;
                case 14:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.G(T5, 0L);
                        i12 += c6;
                    }
                    break;
                case 15:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.I(T5, unsafe.getInt(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 16:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.K(T5, unsafe.getLong(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 17:
                    if ((i13 & i7) != 0) {
                        c6 = AbstractC1033j.r(T5, (O) unsafe.getObject(obj, U5), s(i11));
                        i12 += c6;
                    }
                    break;
                case 18:
                    c6 = g0.h(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += c6;
                    break;
                case 19:
                    z6 = false;
                    f6 = g0.f(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 20:
                    z6 = false;
                    f6 = g0.m(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 21:
                    z6 = false;
                    f6 = g0.x(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 22:
                    z6 = false;
                    f6 = g0.k(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 23:
                    z6 = false;
                    f6 = g0.h(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 24:
                    z6 = false;
                    f6 = g0.f(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 25:
                    z6 = false;
                    f6 = g0.a(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 26:
                    c6 = g0.u(T5, (List) unsafe.getObject(obj, U5));
                    i12 += c6;
                    break;
                case 27:
                    c6 = g0.p(T5, (List) unsafe.getObject(obj, U5), s(i11));
                    i12 += c6;
                    break;
                case 28:
                    c6 = g0.c(T5, (List) unsafe.getObject(obj, U5));
                    i12 += c6;
                    break;
                case 29:
                    c6 = g0.v(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += c6;
                    break;
                case 30:
                    z6 = false;
                    f6 = g0.d(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 31:
                    z6 = false;
                    f6 = g0.f(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 32:
                    z6 = false;
                    f6 = g0.h(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 33:
                    z6 = false;
                    f6 = g0.q(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 34:
                    z6 = false;
                    f6 = g0.s(T5, (List) unsafe.getObject(obj, U5), false);
                    i12 += f6;
                    break;
                case 35:
                    i8 = g0.i((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 36:
                    i8 = g0.g((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 37:
                    i8 = g0.n((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 38:
                    i8 = g0.y((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 39:
                    i8 = g0.l((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 40:
                    i8 = g0.i((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 41:
                    i8 = g0.g((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 42:
                    i8 = g0.b((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 43:
                    i8 = g0.w((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 44:
                    i8 = g0.e((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 45:
                    i8 = g0.g((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 46:
                    i8 = g0.i((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 47:
                    i8 = g0.r((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 48:
                    i8 = g0.t((List) unsafe.getObject(obj, U5));
                    if (i8 > 0) {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i6, i8);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i8);
                        i12 += O5 + Q5 + i8;
                    }
                    break;
                case 49:
                    c6 = g0.j(T5, (List) unsafe.getObject(obj, U5), s(i11));
                    i12 += c6;
                    break;
                case 50:
                    c6 = this.f8696q.f(T5, unsafe.getObject(obj, U5), r(i11));
                    i12 += c6;
                    break;
                case 51:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.h(T5, 0.0d);
                        i12 += c6;
                    }
                    break;
                case 52:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.p(T5, 0.0f);
                        i12 += c6;
                    }
                    break;
                case 53:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.w(T5, Z(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 54:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.R(T5, Z(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 55:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.u(T5, Y(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 56:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.n(T5, 0L);
                        i12 += c6;
                    }
                    break;
                case 57:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.l(T5, 0);
                        i12 += c6;
                    }
                    break;
                case 58:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.c(T5, true);
                        i12 += c6;
                    }
                    break;
                case 59:
                    if (F(obj, T5, i11)) {
                        Object object2 = unsafe.getObject(obj, U5);
                        c6 = object2 instanceof AbstractC1030g ? AbstractC1033j.f(T5, (AbstractC1030g) object2) : AbstractC1033j.M(T5, (String) object2);
                        i12 += c6;
                    }
                    break;
                case 60:
                    if (F(obj, T5, i11)) {
                        c6 = g0.o(T5, unsafe.getObject(obj, U5), s(i11));
                        i12 += c6;
                    }
                    break;
                case 61:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.f(T5, (AbstractC1030g) unsafe.getObject(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 62:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.P(T5, Y(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 63:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.j(T5, Y(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 64:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.E(T5, 0);
                        i12 += c6;
                    }
                    break;
                case 65:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.G(T5, 0L);
                        i12 += c6;
                    }
                    break;
                case 66:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.I(T5, Y(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 67:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.K(T5, Z(obj, U5));
                        i12 += c6;
                    }
                    break;
                case 68:
                    if (F(obj, T5, i11)) {
                        c6 = AbstractC1033j.r(T5, (O) unsafe.getObject(obj, U5), s(i11));
                        i12 += c6;
                    }
                    break;
            }
            i11 += 3;
            i9 = 1048575;
        }
        int v6 = i12 + v(this.f8694o, obj);
        return this.f8685f ? v6 + this.f8695p.c(obj).h() : v6;
    }

    public final void t0(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.t(l0Var.g(obj), s0Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003b. Please report as an issue. */
    public final int u(Object obj) {
        int h6;
        int i6;
        int O5;
        int Q5;
        Unsafe unsafe = f8679s;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f8680a.length; i8 += 3) {
            int n02 = n0(i8);
            int m02 = m0(n02);
            int T5 = T(i8);
            long U5 = U(n02);
            int i9 = (m02 < EnumC1042t.f8902W.a() || m02 > EnumC1042t.f8920j0.a()) ? 0 : this.f8680a[i8 + 2] & 1048575;
            switch (m02) {
                case 0:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.h(T5, 0.0d);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.p(T5, 0.0f);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.w(T5, p0.A(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.R(T5, p0.A(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.u(T5, p0.z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.n(T5, 0L);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.l(T5, 0);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.c(T5, true);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(obj, i8)) {
                        Object C6 = p0.C(obj, U5);
                        h6 = C6 instanceof AbstractC1030g ? AbstractC1033j.f(T5, (AbstractC1030g) C6) : AbstractC1033j.M(T5, (String) C6);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (y(obj, i8)) {
                        h6 = g0.o(T5, p0.C(obj, U5), s(i8));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.f(T5, (AbstractC1030g) p0.C(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.P(T5, p0.z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.j(T5, p0.z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.E(T5, 0);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.G(T5, 0L);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.I(T5, p0.z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.K(T5, p0.A(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (y(obj, i8)) {
                        h6 = AbstractC1033j.r(T5, (O) p0.C(obj, U5), s(i8));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h6 = g0.h(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 19:
                    h6 = g0.f(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 20:
                    h6 = g0.m(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 21:
                    h6 = g0.x(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 22:
                    h6 = g0.k(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 23:
                    h6 = g0.h(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 24:
                    h6 = g0.f(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 25:
                    h6 = g0.a(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 26:
                    h6 = g0.u(T5, H(obj, U5));
                    i7 += h6;
                    break;
                case 27:
                    h6 = g0.p(T5, H(obj, U5), s(i8));
                    i7 += h6;
                    break;
                case 28:
                    h6 = g0.c(T5, H(obj, U5));
                    i7 += h6;
                    break;
                case 29:
                    h6 = g0.v(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 30:
                    h6 = g0.d(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 31:
                    h6 = g0.f(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 32:
                    h6 = g0.h(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 33:
                    h6 = g0.q(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 34:
                    h6 = g0.s(T5, H(obj, U5), false);
                    i7 += h6;
                    break;
                case 35:
                    i6 = g0.i((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 36:
                    i6 = g0.g((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 37:
                    i6 = g0.n((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 38:
                    i6 = g0.y((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 39:
                    i6 = g0.l((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 40:
                    i6 = g0.i((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 41:
                    i6 = g0.g((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 42:
                    i6 = g0.b((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 43:
                    i6 = g0.w((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 44:
                    i6 = g0.e((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 45:
                    i6 = g0.g((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 46:
                    i6 = g0.i((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 47:
                    i6 = g0.r((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 48:
                    i6 = g0.t((List) unsafe.getObject(obj, U5));
                    if (i6 <= 0) {
                        break;
                    } else {
                        if (this.f8688i) {
                            unsafe.putInt(obj, i9, i6);
                        }
                        O5 = AbstractC1033j.O(T5);
                        Q5 = AbstractC1033j.Q(i6);
                        h6 = O5 + Q5 + i6;
                        i7 += h6;
                        break;
                    }
                case 49:
                    h6 = g0.j(T5, H(obj, U5), s(i8));
                    i7 += h6;
                    break;
                case 50:
                    h6 = this.f8696q.f(T5, p0.C(obj, U5), r(i8));
                    i7 += h6;
                    break;
                case 51:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.h(T5, 0.0d);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.p(T5, 0.0f);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.w(T5, Z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.R(T5, Z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.u(T5, Y(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.n(T5, 0L);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.l(T5, 0);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.c(T5, true);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (F(obj, T5, i8)) {
                        Object C7 = p0.C(obj, U5);
                        h6 = C7 instanceof AbstractC1030g ? AbstractC1033j.f(T5, (AbstractC1030g) C7) : AbstractC1033j.M(T5, (String) C7);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (F(obj, T5, i8)) {
                        h6 = g0.o(T5, p0.C(obj, U5), s(i8));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.f(T5, (AbstractC1030g) p0.C(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.P(T5, Y(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.j(T5, Y(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.E(T5, 0);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.G(T5, 0L);
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.I(T5, Y(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.K(T5, Z(obj, U5));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (F(obj, T5, i8)) {
                        h6 = AbstractC1033j.r(T5, (O) p0.C(obj, U5), s(i8));
                        i7 += h6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i7 + v(this.f8694o, obj);
    }

    public final int v(l0 l0Var, Object obj) {
        return l0Var.h(l0Var.g(obj));
    }

    public final boolean y(Object obj, int i6) {
        int b02 = b0(i6);
        long j6 = 1048575 & b02;
        if (j6 != 1048575) {
            return (p0.z(obj, j6) & (1 << (b02 >>> 20))) != 0;
        }
        int n02 = n0(i6);
        long U5 = U(n02);
        switch (m0(n02)) {
            case 0:
                return Double.doubleToRawLongBits(p0.x(obj, U5)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.y(obj, U5)) != 0;
            case 2:
                return p0.A(obj, U5) != 0;
            case 3:
                return p0.A(obj, U5) != 0;
            case 4:
                return p0.z(obj, U5) != 0;
            case 5:
                return p0.A(obj, U5) != 0;
            case 6:
                return p0.z(obj, U5) != 0;
            case 7:
                return p0.r(obj, U5);
            case 8:
                Object C6 = p0.C(obj, U5);
                if (C6 instanceof String) {
                    return !((String) C6).isEmpty();
                }
                if (C6 instanceof AbstractC1030g) {
                    return !AbstractC1030g.f8721b.equals(C6);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.C(obj, U5) != null;
            case 10:
                return !AbstractC1030g.f8721b.equals(p0.C(obj, U5));
            case 11:
                return p0.z(obj, U5) != 0;
            case 12:
                return p0.z(obj, U5) != 0;
            case 13:
                return p0.z(obj, U5) != 0;
            case 14:
                return p0.A(obj, U5) != 0;
            case 15:
                return p0.z(obj, U5) != 0;
            case 16:
                return p0.A(obj, U5) != 0;
            case 17:
                return p0.C(obj, U5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean z(Object obj, int i6, int i7, int i8, int i9) {
        return i7 == 1048575 ? y(obj, i6) : (i8 & i9) != 0;
    }
}
