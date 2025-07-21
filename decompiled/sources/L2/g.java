package L2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f3161a = new j(g.d().getWebkitToCompatConverter());
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f3162a = g.a();
    }

    public static h a() {
        try {
            return new i((WebViewProviderFactoryBoundaryInterface) Ga.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new c();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static j c() {
        return a.f3161a;
    }

    public static h d() {
        return b.f3162a;
    }

    public static ClassLoader e() {
        ClassLoader webViewClassLoader;
        if (Build.VERSION.SDK_INT < 28) {
            return f().getClass().getClassLoader();
        }
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
