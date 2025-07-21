package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l {
    public static final i a(m generationalId, int i6) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new i(generationalId.b(), generationalId.a(), i6);
    }
}
