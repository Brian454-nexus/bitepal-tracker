package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1064p {

    /* renamed from: a, reason: collision with root package name */
    public static final C1064p f9065a = new C1064p();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9066b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f9067c = new HashMap();

    public static final String c(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public static final InterfaceC1059k f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z6 = object instanceof InterfaceC1059k;
        boolean z7 = object instanceof DefaultLifecycleObserver;
        if (z6 && z7) {
            return new C1052d((DefaultLifecycleObserver) object, (InterfaceC1059k) object);
        }
        if (z7) {
            return new C1052d((DefaultLifecycleObserver) object, null);
        }
        if (z6) {
            return (InterfaceC1059k) object;
        }
        Class<?> cls = object.getClass();
        C1064p c1064p = f9065a;
        if (c1064p.d(cls) != 2) {
            return new y(object);
        }
        Object obj = f9067c.get(cls);
        Intrinsics.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c1064p.a((Constructor) list.get(0), object);
            return new L(null);
        }
        int size = list.size();
        InterfaceC1054f[] interfaceC1054fArr = new InterfaceC1054f[size];
        for (int i6 = 0; i6 < size; i6++) {
            f9065a.a((Constructor) list.get(i6), object);
            interfaceC1054fArr[i6] = null;
        }
        return new C1051c(interfaceC1054fArr);
    }

    public final InterfaceC1054f a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            android.support.v4.media.session.b.a(newInstance);
            return null;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c6 = c(name);
            if (fullPackage.length() != 0) {
                c6 = fullPackage + com.amazon.a.a.o.c.a.b.f11260a + c6;
            }
            Class<?> cls2 = Class.forName(c6);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final int d(Class cls) {
        Map map = f9066b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g6 = g(cls);
        map.put(cls, Integer.valueOf(g6));
        return g6;
    }

    public final boolean e(Class cls) {
        return cls != null && InterfaceC1060l.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b6 = b(cls);
        if (b6 != null) {
            f9067c.put(cls, CollectionsKt.listOf(b6));
            return 2;
        }
        if (C1050b.f9027c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f9067c.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f9067c.get(intrface);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f9067c.put(cls, arrayList);
        return 2;
    }
}
