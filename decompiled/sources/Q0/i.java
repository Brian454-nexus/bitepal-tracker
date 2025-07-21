package Q0;

import P0.AbstractComponentCallbacksC0708p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractComponentCallbacksC0708p f4436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AbstractComponentCallbacksC0708p fragment, AbstractComponentCallbacksC0708p expectedParentFragment, int i6) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i6 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.f4436b = expectedParentFragment;
        this.f4437c = i6;
    }
}
