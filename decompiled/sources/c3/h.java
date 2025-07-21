package c3;

import d3.AbstractC1189h;
import f3.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends AbstractC1148c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC1189h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // c3.AbstractC1148c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f14126j.i();
    }

    @Override // c3.AbstractC1148c
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return i(((Boolean) obj).booleanValue());
    }

    public boolean i(boolean z6) {
        return !z6;
    }
}
