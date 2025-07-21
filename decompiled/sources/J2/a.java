package J2;

import android.os.Parcelable;
import j0.C1638a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1638a f2865a;

    /* renamed from: b, reason: collision with root package name */
    public final C1638a f2866b;

    /* renamed from: c, reason: collision with root package name */
    public final C1638a f2867c;

    public a(C1638a c1638a, C1638a c1638a2, C1638a c1638a3) {
        this.f2865a = c1638a;
        this.f2866b = c1638a2;
        this.f2867c = c1638a3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i6) {
        w(i6);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i6) {
        w(i6);
        C(charSequence);
    }

    public abstract void E(int i6);

    public void F(int i6, int i7) {
        w(i7);
        E(i6);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i6) {
        w(i6);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i6) {
        w(i6);
        I(str);
    }

    public void K(c cVar, a aVar) {
        try {
            e(cVar.getClass()).invoke(null, cVar, aVar);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (!(e9.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
            }
            throw ((RuntimeException) e9.getCause());
        }
    }

    public void L(c cVar) {
        if (cVar == null) {
            I(null);
            return;
        }
        N(cVar);
        a b6 = b();
        K(cVar, b6);
        b6.a();
    }

    public void M(c cVar, int i6) {
        w(i6);
        L(cVar);
    }

    public final void N(c cVar) {
        try {
            I(c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class cls) {
        Class cls2 = (Class) this.f2867c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2867c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) {
        Method method = (Method) this.f2865a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f2865a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) {
        Method method = (Method) this.f2866b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c6 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c6.getDeclaredMethod("write", cls, a.class);
        this.f2866b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z6, int i6) {
        return !m(i6) ? z6 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i6) {
        return !m(i6) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i6) {
        return !m(i6) ? charSequence : k();
    }

    public abstract boolean m(int i6);

    public c n(String str, a aVar) {
        try {
            return (c) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract int o();

    public int p(int i6, int i7) {
        return !m(i7) ? i6 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i6) {
        return !m(i6) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i6) {
        return !m(i6) ? str : s();
    }

    public c u() {
        String s6 = s();
        if (s6 == null) {
            return null;
        }
        return n(s6, b());
    }

    public c v(c cVar, int i6) {
        return !m(i6) ? cVar : u();
    }

    public abstract void w(int i6);

    public void x(boolean z6, boolean z7) {
    }

    public abstract void y(boolean z6);

    public void z(boolean z6, int i6) {
        w(i6);
        y(z6);
    }
}
