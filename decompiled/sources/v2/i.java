package v2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i extends AbstractC2162A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void i(A2.k kVar, Object obj);

    public final void j(Object obj) {
        A2.k b6 = b();
        try {
            i(b6, obj);
            b6.l0();
        } finally {
            h(b6);
        }
    }
}
