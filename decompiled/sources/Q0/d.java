package Q0;

import P0.AbstractComponentCallbacksC0708p;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f4433b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractComponentCallbacksC0708p fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f4433b = viewGroup;
    }
}
