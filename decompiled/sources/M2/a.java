package M2;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f3403a;

    /* renamed from: M2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0059a extends Lambda implements Function0 {
        public C0059a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Class invoke() {
            Class<?> loadClass = a.this.f3403a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return loadClass;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z6 = false;
            Method getWindowExtensionsMethod = a.this.d().getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class c6 = a.this.c();
            V2.a aVar = V2.a.f5304a;
            Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            if (aVar.b(getWindowExtensionsMethod, c6) && aVar.d(getWindowExtensionsMethod)) {
                z6 = true;
            }
            return Boolean.valueOf(z6);
        }
    }

    public a(ClassLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f3403a = loader;
    }

    public final Class c() {
        Class<?> loadClass = this.f3403a.loadClass("androidx.window.extensions.WindowExtensions");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    public final Class d() {
        Class<?> loadClass = this.f3403a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }

    public final boolean e() {
        return V2.a.f5304a.a(new C0059a());
    }

    public final boolean f() {
        return e() && V2.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
