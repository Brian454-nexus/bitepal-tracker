package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.AbstractC1890d;

/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2004g extends k {

    /* renamed from: b, reason: collision with root package name */
    public static Class f18616b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f18617c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f18618d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f18619e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f18620f = false;

    public static boolean h(Object obj, String str, int i6, boolean z6) {
        j();
        try {
            return ((Boolean) f18618d.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static Typeface i(Object obj) {
        j();
        try {
            Object newInstance = Array.newInstance((Class<?>) f18616b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f18619e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f18620f) {
            return;
        }
        f18620f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f18617c = constructor;
        f18616b = cls;
        f18618d = method2;
        f18619e = method;
    }

    private static Object k() {
        j();
        try {
            return f18617c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // q0.k
    public Typeface a(Context context, AbstractC1890d.c cVar, Resources resources, int i6) {
        Object k6 = k();
        for (AbstractC1890d.C0232d c0232d : cVar.a()) {
            File d6 = l.d(context);
            if (d6 == null) {
                return null;
            }
            try {
                if (!l.b(d6, resources, c0232d.b())) {
                    return null;
                }
                if (!h(k6, d6.getPath(), c0232d.e(), c0232d.f())) {
                    return null;
                }
                d6.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                d6.delete();
            }
        }
        return i(k6);
    }
}
