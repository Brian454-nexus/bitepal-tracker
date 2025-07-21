package c3;

import W2.l;
import android.os.Build;
import b3.C1086b;
import d3.AbstractC1189h;
import f3.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends AbstractC1148c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC1189h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // c3.AbstractC1148c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        l d6 = workSpec.f14126j.d();
        if (d6 != l.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && d6 == l.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // c3.AbstractC1148c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C1086b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return !value.a() || value.b();
    }
}
