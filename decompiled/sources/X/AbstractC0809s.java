package X;

import android.net.Uri;

/* renamed from: X.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0809s {
    public static AbstractC0809s b(Uri uri) {
        y0.g.g(uri, "OutputUri cannot be null.");
        return new C0799h(uri);
    }

    public abstract Uri a();
}
