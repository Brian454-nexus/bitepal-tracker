package G2;

import android.os.Trace;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {
    public static void a(String str, int i6) {
        Trace.beginAsyncSection(str, i6);
    }

    public static void b(String str, int i6) {
        Trace.endAsyncSection(str, i6);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
