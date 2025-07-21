package B0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import v0.C2159a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f269a = new String[0];

    /* renamed from: B0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0007a {
        public static void a(EditorInfo editorInfo, boolean z6) {
            editorInfo.setStylusHandwritingEnabled(z6);
        }
    }

    public static void a(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void b(EditorInfo editorInfo, boolean z6) {
        if (C2159a.b()) {
            C0007a.a(editorInfo, z6);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z6);
    }
}
