package M0;

import M0.f;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {
    public static final f a() {
        return new c(null, true, 1, null);
    }

    public static final c b(f.b... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        c cVar = new c(null, false, 1, null);
        cVar.h((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return cVar;
    }
}
