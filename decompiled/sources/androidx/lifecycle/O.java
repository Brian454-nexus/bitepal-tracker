package androidx.lifecycle;

import U0.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class O {
    public static final U0.a a(Q owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1055g ? ((InterfaceC1055g) owner).getDefaultViewModelCreationExtras() : a.C0088a.f5164b;
    }
}
