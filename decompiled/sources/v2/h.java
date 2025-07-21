package v2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h extends AbstractC2162A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void i(A2.k kVar, Object obj);

    public final int j(Object obj) {
        A2.k b6 = b();
        try {
            i(b6, obj);
            return b6.p();
        } finally {
            h(b6);
        }
    }
}
