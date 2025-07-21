package P0;

import P0.AbstractComponentCallbacksC0708p;

/* renamed from: P0.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0717z {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.k f4291a = new j0.k();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC0708p.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        j0.k kVar = f4291a;
        j0.k kVar2 = (j0.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new j0.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e6) {
            throw new AbstractComponentCallbacksC0708p.h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e6);
        } catch (ClassNotFoundException e7) {
            throw new AbstractComponentCallbacksC0708p.h("Unable to instantiate fragment " + str + ": make sure class name exists", e7);
        }
    }

    public abstract AbstractComponentCallbacksC0708p a(ClassLoader classLoader, String str);
}
