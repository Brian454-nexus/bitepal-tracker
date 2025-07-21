package F;

import I.S0;
import L.i;
import android.graphics.Matrix;

/* renamed from: F.g0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0331g0 implements Z {
    public static Z d(S0 s02, long j6, int i6, Matrix matrix) {
        return new C0330g(s02, j6, i6, matrix);
    }

    @Override // F.Z
    public abstract S0 a();

    @Override // F.Z
    public void b(i.b bVar) {
        bVar.m(e());
    }

    @Override // F.Z
    public abstract long c();

    public abstract int e();

    public abstract Matrix f();
}
