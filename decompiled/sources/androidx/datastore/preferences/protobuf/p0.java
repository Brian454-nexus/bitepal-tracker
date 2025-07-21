package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f8816a = D();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f8817b = AbstractC1027d.b();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8818c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8819d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final e f8820e = B();

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f8821f = T();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f8822g = S();

    /* renamed from: h, reason: collision with root package name */
    public static final long f8823h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f8824i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f8825j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f8826k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f8827l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f8828m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f8829n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f8830o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f8831p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f8832q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f8833r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f8834s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f8835t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f8836u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f8837v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f8838w;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j6) {
            return p0.f8838w ? p0.s(obj, j6) : p0.t(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j6) {
            return p0.f8838w ? p0.v(obj, j6) : p0.w(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j6) {
            return Double.longBitsToDouble(h(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j6) {
            return Float.intBitsToFloat(g(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j6, boolean z6) {
            if (p0.f8838w) {
                p0.I(obj, j6, z6);
            } else {
                p0.J(obj, j6, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j6, byte b6) {
            if (p0.f8838w) {
                p0.L(obj, j6, b6);
            } else {
                p0.M(obj, j6, b6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j6, double d6) {
            p(obj, j6, Double.doubleToLongBits(d6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j6, float f6) {
            o(obj, j6, Float.floatToIntBits(f6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean s() {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j6) {
            return p0.f8838w ? p0.s(obj, j6) : p0.t(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j6) {
            return p0.f8838w ? p0.v(obj, j6) : p0.w(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j6) {
            return Double.longBitsToDouble(h(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j6) {
            return Float.intBitsToFloat(g(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j6, boolean z6) {
            if (p0.f8838w) {
                p0.I(obj, j6, z6);
            } else {
                p0.J(obj, j6, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j6, byte b6) {
            if (p0.f8838w) {
                p0.L(obj, j6, b6);
            } else {
                p0.M(obj, j6, b6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j6, double d6) {
            p(obj, j6, Double.doubleToLongBits(d6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j6, float f6) {
            o(obj, j6, Float.floatToIntBits(f6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean s() {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j6) {
            return this.f8839a.getBoolean(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j6) {
            return this.f8839a.getByte(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j6) {
            return this.f8839a.getDouble(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j6) {
            return this.f8839a.getFloat(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j6, boolean z6) {
            this.f8839a.putBoolean(obj, j6, z6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j6, byte b6) {
            this.f8839a.putByte(obj, j6, b6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j6, double d6) {
            this.f8839a.putDouble(obj, j6, d6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j6, float f6) {
            this.f8839a.putFloat(obj, j6, f6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f8839a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                p0.G(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f8839a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                p0.G(th);
                return false;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f8839a;

        public e(Unsafe unsafe) {
            this.f8839a = unsafe;
        }

        public final int a(Class cls) {
            return this.f8839a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f8839a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j6);

        public abstract byte d(Object obj, long j6);

        public abstract double e(Object obj, long j6);

        public abstract float f(Object obj, long j6);

        public final int g(Object obj, long j6) {
            return this.f8839a.getInt(obj, j6);
        }

        public final long h(Object obj, long j6) {
            return this.f8839a.getLong(obj, j6);
        }

        public final Object i(Object obj, long j6) {
            return this.f8839a.getObject(obj, j6);
        }

        public final long j(Field field) {
            return this.f8839a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j6, boolean z6);

        public abstract void l(Object obj, long j6, byte b6);

        public abstract void m(Object obj, long j6, double d6);

        public abstract void n(Object obj, long j6, float f6);

        public final void o(Object obj, long j6, int i6) {
            this.f8839a.putInt(obj, j6, i6);
        }

        public final void p(Object obj, long j6, long j7) {
            this.f8839a.putLong(obj, j6, j7);
        }

        public final void q(Object obj, long j6, Object obj2) {
            this.f8839a.putObject(obj, j6, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f8839a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                p0.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f8839a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p0.b() != null;
            } catch (Throwable th) {
                p0.G(th);
                return false;
            }
        }
    }

    static {
        long l6 = l(byte[].class);
        f8823h = l6;
        f8824i = l(boolean[].class);
        f8825j = m(boolean[].class);
        f8826k = l(int[].class);
        f8827l = m(int[].class);
        f8828m = l(long[].class);
        f8829n = m(long[].class);
        f8830o = l(float[].class);
        f8831p = m(float[].class);
        f8832q = l(double[].class);
        f8833r = m(double[].class);
        f8834s = l(Object[].class);
        f8835t = m(Object[].class);
        f8836u = q(n());
        f8837v = (int) (l6 & 7);
        f8838w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long A(Object obj, long j6) {
        return f8820e.h(obj, j6);
    }

    public static e B() {
        Unsafe unsafe = f8816a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1027d.c()) {
            return new d(unsafe);
        }
        if (f8818c) {
            return new c(unsafe);
        }
        if (f8819d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object C(Object obj, long j6) {
        return f8820e.i(obj, j6);
    }

    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean E() {
        return f8822g;
    }

    public static boolean F() {
        return f8821f;
    }

    public static void G(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void H(Object obj, long j6, boolean z6) {
        f8820e.k(obj, j6, z6);
    }

    public static void I(Object obj, long j6, boolean z6) {
        L(obj, j6, z6 ? (byte) 1 : (byte) 0);
    }

    public static void J(Object obj, long j6, boolean z6) {
        M(obj, j6, z6 ? (byte) 1 : (byte) 0);
    }

    public static void K(byte[] bArr, long j6, byte b6) {
        f8820e.l(bArr, f8823h + j6, b6);
    }

    public static void L(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int z6 = z(obj, j7);
        int i6 = ((~((int) j6)) & 3) << 3;
        P(obj, j7, ((255 & b6) << i6) | (z6 & (~(255 << i6))));
    }

    public static void M(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        P(obj, j7, ((255 & b6) << i6) | (z(obj, j7) & (~(255 << i6))));
    }

    public static void N(Object obj, long j6, double d6) {
        f8820e.m(obj, j6, d6);
    }

    public static void O(Object obj, long j6, float f6) {
        f8820e.n(obj, j6, f6);
    }

    public static void P(Object obj, long j6, int i6) {
        f8820e.o(obj, j6, i6);
    }

    public static void Q(Object obj, long j6, long j7) {
        f8820e.p(obj, j6, j7);
    }

    public static void R(Object obj, long j6, Object obj2) {
        f8820e.q(obj, j6, obj2);
    }

    public static boolean S() {
        e eVar = f8820e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static boolean T() {
        e eVar = f8820e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public static /* synthetic */ Field b() {
        return n();
    }

    public static Object k(Class cls) {
        try {
            return f8816a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int l(Class cls) {
        if (f8822g) {
            return f8820e.a(cls);
        }
        return -1;
    }

    public static int m(Class cls) {
        if (f8822g) {
            return f8820e.b(cls);
        }
        return -1;
    }

    public static Field n() {
        Field p6;
        if (AbstractC1027d.c() && (p6 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p6;
        }
        Field p7 = p(Buffer.class, "address");
        if (p7 == null || p7.getType() != Long.TYPE) {
            return null;
        }
        return p7;
    }

    public static boolean o(Class cls) {
        if (!AbstractC1027d.c()) {
            return false;
        }
        try {
            Class cls2 = f8817b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f8820e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean r(Object obj, long j6) {
        return f8820e.c(obj, j6);
    }

    public static boolean s(Object obj, long j6) {
        return v(obj, j6) != 0;
    }

    public static boolean t(Object obj, long j6) {
        return w(obj, j6) != 0;
    }

    public static byte u(byte[] bArr, long j6) {
        return f8820e.d(bArr, f8823h + j6);
    }

    public static byte v(Object obj, long j6) {
        return (byte) ((z(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte w(Object obj, long j6) {
        return (byte) ((z(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static double x(Object obj, long j6) {
        return f8820e.e(obj, j6);
    }

    public static float y(Object obj, long j6) {
        return f8820e.f(obj, j6);
    }

    public static int z(Object obj, long j6) {
        return f8820e.g(obj, j6);
    }
}
