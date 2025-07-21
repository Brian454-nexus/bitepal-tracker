package Q0;

import P0.AbstractComponentCallbacksC0708p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0708p f4434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractComponentCallbacksC0708p fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f4434a = fragment;
    }

    public final AbstractComponentCallbacksC0708p a() {
        return this.f4434a;
    }
}
