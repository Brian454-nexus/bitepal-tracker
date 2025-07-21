package N2;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3588a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final String f3589b = Reflection.getOrCreateKotlinClass(e.class).getSimpleName();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f3580a.a() != j.LOG) {
                return 0;
            }
            Log.d(f3589b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f3580a.a() != j.LOG) {
                return 0;
            }
            Log.d(f3589b, "Stub Extension");
            return 0;
        }
    }
}
