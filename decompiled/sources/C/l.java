package C;

import B.C0285b;
import F.l0;
import I.G0;
import android.graphics.PointF;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f396a;

    public l(G0 g02) {
        this.f396a = g02;
    }

    public PointF a(l0 l0Var, int i6) {
        return (i6 == 1 && this.f396a.a(C0285b.class)) ? new PointF(1.0f - l0Var.c(), l0Var.d()) : new PointF(l0Var.c(), l0Var.d());
    }
}
