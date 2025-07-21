package N2;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3575a = new a();

    @Override // N2.g
    public void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(tag, message);
    }
}
