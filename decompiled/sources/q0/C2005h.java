package q0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p0.AbstractC1890d;
import w0.j;

/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2005h extends AbstractC2004g {

    /* renamed from: g, reason: collision with root package name */
    public final Class f18621g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f18622h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f18623i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f18624j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f18625k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f18626l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f18627m;

    public C2005h() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = u();
            constructor = v(cls);
            method = r(cls);
            method2 = s(cls);
            method3 = w(cls);
            method4 = q(cls);
            method5 = t(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e6.getClass().getName(), e6);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f18621g = cls;
        this.f18622h = constructor;
        this.f18623i = method;
        this.f18624j = method2;
        this.f18625k = method3;
        this.f18626l = method4;
        this.f18627m = method5;
    }

    @Override // q0.AbstractC2004g, q0.k
    public Typeface a(Context context, AbstractC1890d.c cVar, Resources resources, int i6) {
        if (!p()) {
            return super.a(context, cVar, resources, i6);
        }
        Object k6 = k();
        if (k6 == null) {
            return null;
        }
        AbstractC1890d.C0232d[] a6 = cVar.a();
        int length = a6.length;
        int i7 = 0;
        while (i7 < length) {
            AbstractC1890d.C0232d c0232d = a6[i7];
            Context context2 = context;
            if (!m(context2, k6, c0232d.a(), c0232d.c(), c0232d.e(), c0232d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0232d.d()))) {
                l(k6);
                return null;
            }
            i7++;
            context = context2;
        }
        if (o(k6)) {
            return i(k6);
        }
        return null;
    }

    @Override // q0.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i6) {
        Typeface i7;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (p()) {
            Map f6 = l.f(context, bVarArr, cancellationSignal);
            Object k6 = k();
            if (k6 == null) {
                return null;
            }
            int length = bVarArr.length;
            int i8 = 0;
            boolean z6 = false;
            while (i8 < length) {
                j.b bVar = bVarArr[i8];
                ByteBuffer byteBuffer = (ByteBuffer) f6.get(bVar.d());
                if (byteBuffer == null) {
                    obj = k6;
                } else {
                    boolean n6 = n(k6, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = k6;
                    if (!n6) {
                        l(obj);
                        return null;
                    }
                    z6 = true;
                }
                i8++;
                k6 = obj;
                z6 = z6;
            }
            Object obj2 = k6;
            if (!z6) {
                l(obj2);
                return null;
            }
            if (o(obj2) && (i7 = i(obj2)) != null) {
                return Typeface.create(i7, i6);
            }
            return null;
        }
        j.b g6 = g(bVarArr, i6);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g6.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g6.e()).setItalic(g6.f()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // q0.k
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i6) {
        return super.c(context, cancellationSignal, list, i6);
    }

    @Override // q0.k
    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        if (!p()) {
            return super.d(context, resources, i6, str, i7);
        }
        Object k6 = k();
        if (k6 == null) {
            return null;
        }
        if (!m(context, k6, str, 0, -1, -1, null)) {
            l(k6);
            return null;
        }
        if (o(k6)) {
            return i(k6);
        }
        return null;
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f18621g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18627m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object k() {
        try {
            return this.f18622h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void l(Object obj) {
        try {
            this.f18626l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m(Context context, Object obj, String str, int i6, int i7, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18623i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj, ByteBuffer byteBuffer, int i6, int i7, int i8) {
        try {
            return ((Boolean) this.f18624j.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i7), Integer.valueOf(i8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o(Object obj) {
        try {
            return ((Boolean) this.f18625k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p() {
        if (this.f18623i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f18623i != null;
    }

    public Method q(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method r(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method s(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method t(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class u() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor v(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    public Method w(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
