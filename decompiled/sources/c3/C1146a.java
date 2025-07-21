package c3;

import d3.AbstractC1189h;
import f3.u;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1146a extends AbstractC1148c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146a(AbstractC1189h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // c3.AbstractC1148c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f14126j.g();
    }

    @Override // c3.AbstractC1148c
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return i(((Boolean) obj).booleanValue());
    }

    public boolean i(boolean z6) {
        return !z6;
    }
}
