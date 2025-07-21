package Q0;

import P0.AbstractComponentCallbacksC0708p;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends g {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f4435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractComponentCallbacksC0708p fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f4435b = container;
    }
}
