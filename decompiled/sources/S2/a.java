package S2;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements R2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0080a f4691a = new C0080a(null);

    /* renamed from: S2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0080a {
        public /* synthetic */ C0080a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final R2.a a(WindowLayoutComponent component, N2.d adapter) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            int a6 = N2.e.f3588a.a();
            return a6 >= 2 ? new e(component) : a6 == 1 ? new d(component, adapter) : new c();
        }

        public C0080a() {
        }
    }
}
