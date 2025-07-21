package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1024a;
import androidx.datastore.preferences.protobuf.AbstractC1047y;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1045w extends AbstractC1024a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1045w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends AbstractC1024a.AbstractC0127a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1045w f8956a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC1045w f8957b;

        public a(AbstractC1045w abstractC1045w) {
            this.f8956a = abstractC1045w;
            if (abstractC1045w.z()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f8957b = m();
        }

        public static void l(Object obj, Object obj2) {
            a0.a().d(obj).a(obj, obj2);
        }

        private AbstractC1045w m() {
            return this.f8956a.F();
        }

        public final AbstractC1045w f() {
            AbstractC1045w c6 = c();
            if (c6.x()) {
                return c6;
            }
            throw AbstractC1024a.AbstractC0127a.e(c6);
        }

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC1045w c() {
            if (!this.f8957b.z()) {
                return this.f8957b;
            }
            this.f8957b.A();
            return this.f8957b;
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.f8957b = c();
            return newBuilderForType;
        }

        public final void i() {
            if (this.f8957b.z()) {
                return;
            }
            j();
        }

        public void j() {
            AbstractC1045w m6 = m();
            l(m6, this.f8957b);
            this.f8957b = m6;
        }

        @Override // androidx.datastore.preferences.protobuf.P
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC1045w getDefaultInstanceForType() {
            return this.f8956a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends AbstractC1025b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1045w f8958b;

        public b(AbstractC1045w abstractC1045w) {
            this.f8958b = abstractC1045w;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends AbstractC1036m {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC1047y.b C(AbstractC1047y.b bVar) {
        int size = bVar.size();
        return bVar.e(size == 0 ? 10 : size * 2);
    }

    public static Object E(O o6, String str, Object[] objArr) {
        return new c0(o6, str, objArr);
    }

    public static AbstractC1045w G(AbstractC1045w abstractC1045w, InputStream inputStream) {
        return h(H(abstractC1045w, AbstractC1031h.f(inputStream), C1038o.b()));
    }

    public static AbstractC1045w H(AbstractC1045w abstractC1045w, AbstractC1031h abstractC1031h, C1038o c1038o) {
        AbstractC1045w F6 = abstractC1045w.F();
        try {
            e0 d6 = a0.a().d(F6);
            d6.h(F6, C1032i.O(abstractC1031h), c1038o);
            d6.b(F6);
            return F6;
        } catch (k0 e6) {
            throw e6.a().k(F6);
        } catch (C1048z e7) {
            e = e7;
            if (e.a()) {
                e = new C1048z(e);
            }
            throw e.k(F6);
        } catch (IOException e8) {
            if (e8.getCause() instanceof C1048z) {
                throw ((C1048z) e8.getCause());
            }
            throw new C1048z(e8).k(F6);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof C1048z) {
                throw ((C1048z) e9.getCause());
            }
            throw e9;
        }
    }

    public static void I(Class cls, AbstractC1045w abstractC1045w) {
        abstractC1045w.B();
        defaultInstanceMap.put(cls, abstractC1045w);
    }

    public static AbstractC1045w h(AbstractC1045w abstractC1045w) {
        if (abstractC1045w == null || abstractC1045w.x()) {
            return abstractC1045w;
        }
        throw abstractC1045w.e().a().k(abstractC1045w);
    }

    public static AbstractC1047y.b q() {
        return b0.c();
    }

    public static AbstractC1045w r(Class cls) {
        AbstractC1045w abstractC1045w = defaultInstanceMap.get(cls);
        if (abstractC1045w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1045w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1045w != null) {
            return abstractC1045w;
        }
        AbstractC1045w defaultInstanceForType = ((AbstractC1045w) p0.k(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean y(AbstractC1045w abstractC1045w, boolean z6) {
        byte byteValue = ((Byte) abstractC1045w.n(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c6 = a0.a().d(abstractC1045w).c(abstractC1045w);
        if (z6) {
            abstractC1045w.o(d.SET_MEMOIZED_IS_INITIALIZED, c6 ? abstractC1045w : null);
        }
        return c6;
    }

    public void A() {
        a0.a().d(this).b(this);
        B();
    }

    public void B() {
        this.memoizedSerializedSize &= IntCompanionObject.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) n(d.NEW_BUILDER);
    }

    public AbstractC1045w F() {
        return (AbstractC1045w) n(d.NEW_MUTABLE_INSTANCE);
    }

    public void J(int i6) {
        this.memoizedHashCode = i6;
    }

    public void K(int i6) {
        if (i6 >= 0) {
            this.memoizedSerializedSize = (i6 & IntCompanionObject.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public void a(AbstractC1033j abstractC1033j) {
        a0.a().d(this).i(this, C1034k.P(abstractC1033j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1024a
    public int d(e0 e0Var) {
        if (!z()) {
            if (u() != Integer.MAX_VALUE) {
                return u();
            }
            int l6 = l(e0Var);
            K(l6);
            return l6;
        }
        int l7 = l(e0Var);
        if (l7 >= 0) {
            return l7;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + l7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a0.a().d(this).d(this, (AbstractC1045w) obj);
        }
        return false;
    }

    public Object g() {
        return n(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public int getSerializedSize() {
        return d(null);
    }

    public int hashCode() {
        if (z()) {
            return k();
        }
        if (v()) {
            J(k());
        }
        return t();
    }

    public void i() {
        this.memoizedHashCode = 0;
    }

    public void j() {
        K(IntCompanionObject.MAX_VALUE);
    }

    public int k() {
        return a0.a().d(this).g(this);
    }

    public final int l(e0 e0Var) {
        return e0Var == null ? a0.a().d(this).e(this) : e0Var.e(this);
    }

    public final a m() {
        return (a) n(d.NEW_BUILDER);
    }

    public Object n(d dVar) {
        return p(dVar, null, null);
    }

    public Object o(d dVar, Object obj) {
        return p(dVar, obj, null);
    }

    public abstract Object p(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final AbstractC1045w getDefaultInstanceForType() {
        return (AbstractC1045w) n(d.GET_DEFAULT_INSTANCE);
    }

    public int t() {
        return this.memoizedHashCode;
    }

    public String toString() {
        return Q.f(this, super.toString());
    }

    public int u() {
        return this.memoizedSerializedSize & IntCompanionObject.MAX_VALUE;
    }

    public boolean v() {
        return t() == 0;
    }

    public final boolean x() {
        return y(this, true);
    }

    public boolean z() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }
}
