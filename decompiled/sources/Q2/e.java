package Q2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f4465a;

    /* renamed from: b, reason: collision with root package name */
    public final N2.d f4466b;

    /* renamed from: c, reason: collision with root package name */
    public final M2.a f4467c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Class f6 = e.this.f();
            boolean z6 = false;
            Method getBoundsMethod = f6.getMethod("getBounds", new Class[0]);
            Method getTypeMethod = f6.getMethod("getType", new Class[0]);
            Method getStateMethod = f6.getMethod("getState", new Class[0]);
            V2.a aVar = V2.a.f5304a;
            Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
            if (aVar.c(getBoundsMethod, Reflection.getOrCreateKotlinClass(Rect.class)) && aVar.d(getBoundsMethod)) {
                Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (aVar.c(getTypeMethod, Reflection.getOrCreateKotlinClass(cls)) && aVar.d(getTypeMethod)) {
                    Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                    if (aVar.c(getStateMethod, Reflection.getOrCreateKotlinClass(cls)) && aVar.d(getStateMethod)) {
                        z6 = true;
                    }
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z6;
            Class b6 = e.this.f4466b.b();
            if (b6 == null) {
                return Boolean.FALSE;
            }
            Class h6 = e.this.h();
            Method addListenerMethod = h6.getMethod("addWindowLayoutInfoListener", Activity.class, b6);
            Method removeListenerMethod = h6.getMethod("removeWindowLayoutInfoListener", b6);
            V2.a aVar = V2.a.f5304a;
            Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
            if (aVar.d(addListenerMethod)) {
                Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                if (aVar.d(removeListenerMethod)) {
                    z6 = true;
                    return Boolean.valueOf(z6);
                }
            }
            z6 = false;
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z6;
            Class h6 = e.this.h();
            Method addListenerMethod = h6.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method removeListenerMethod = h6.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            V2.a aVar = V2.a.f5304a;
            Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
            if (aVar.d(addListenerMethod)) {
                Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                if (aVar.d(removeListenerMethod)) {
                    z6 = true;
                    return Boolean.valueOf(z6);
                }
            }
            z6 = false;
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z6 = false;
            Method getWindowLayoutComponentMethod = e.this.f4467c.c().getMethod("getWindowLayoutComponent", new Class[0]);
            Class h6 = e.this.h();
            V2.a aVar = V2.a.f5304a;
            Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (aVar.d(getWindowLayoutComponentMethod) && aVar.b(getWindowLayoutComponentMethod, h6)) {
                z6 = true;
            }
            return Boolean.valueOf(z6);
        }
    }

    public e(ClassLoader loader, N2.d consumerAdapter) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f4465a = loader;
        this.f4466b = consumerAdapter;
        this.f4467c = new M2.a(loader);
    }

    public final boolean e() {
        if (!n()) {
            return false;
        }
        int a6 = N2.e.f3588a.a();
        if (a6 == 1) {
            return i();
        }
        if (2 > a6 || a6 > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    public final Class f() {
        Class<?> loadClass = this.f4465a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class h() {
        Class<?> loadClass = this.f4465a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return V2.a.e("FoldingFeature class is not valid", new a());
    }

    public final boolean l() {
        return V2.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    public final boolean m() {
        return V2.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    public final boolean n() {
        return this.f4467c.f() && o() && k();
    }

    public final boolean o() {
        return V2.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }
}
