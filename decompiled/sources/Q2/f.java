package Q2;

import S2.a;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4472a = a.f4473a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f4474b = false;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4473a = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f4475c = Reflection.getOrCreateKotlinClass(f.class).getSimpleName();

        /* renamed from: d, reason: collision with root package name */
        public static final Lazy f4476d = LazyKt.lazy(C0074a.f4478a);

        /* renamed from: e, reason: collision with root package name */
        public static g f4477e = b.f4448a;

        /* renamed from: Q2.f$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0074a extends Lambda implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0074a f4478a = new C0074a();

            public C0074a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R2.a invoke() {
                WindowLayoutComponent g6;
                try {
                    ClassLoader loader = f.class.getClassLoader();
                    e eVar = loader != null ? new e(loader, new N2.d(loader)) : null;
                    if (eVar == null || (g6 = eVar.g()) == null) {
                        return null;
                    }
                    a.C0080a c0080a = S2.a.f4691a;
                    Intrinsics.checkNotNullExpressionValue(loader, "loader");
                    return c0080a.a(g6, new N2.d(loader));
                } catch (Throwable unused) {
                    if (a.f4474b) {
                        Log.d(a.f4475c, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        }

        public final R2.a c() {
            return (R2.a) f4476d.getValue();
        }

        public final f d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            R2.a c6 = c();
            if (c6 == null) {
                c6 = androidx.window.layout.adapter.sidecar.b.f10192c.a(context);
            }
            return f4477e.a(new i(o.f4495b, c6));
        }
    }

    ja.e a(Activity activity);
}
