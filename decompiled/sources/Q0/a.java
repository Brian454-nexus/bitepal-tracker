package Q0;

import P0.AbstractComponentCallbacksC0708p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends g {

    /* renamed from: b, reason: collision with root package name */
    public final String f4414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractComponentCallbacksC0708p fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.f4414b = previousFragmentId;
    }
}
