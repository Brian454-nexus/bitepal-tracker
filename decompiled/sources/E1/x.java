package E1;

import E1.J;
import E1.y;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements J {

    /* renamed from: a, reason: collision with root package name */
    public final y f1083a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1084b;

    public x(y yVar, long j6) {
        this.f1083a = yVar;
        this.f1084b = j6;
    }

    public final K a(long j6, long j7) {
        return new K((j6 * 1000000) / this.f1083a.f1089e, this.f1084b + j7);
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        AbstractC1119a.i(this.f1083a.f1095k);
        y yVar = this.f1083a;
        y.a aVar = yVar.f1095k;
        long[] jArr = aVar.f1097a;
        long[] jArr2 = aVar.f1098b;
        int h6 = AbstractC1117K.h(jArr, yVar.i(j6), true, false);
        K a6 = a(h6 == -1 ? 0L : jArr[h6], h6 != -1 ? jArr2[h6] : 0L);
        if (a6.f916a == j6 || h6 == jArr.length - 1) {
            return new J.a(a6);
        }
        int i6 = h6 + 1;
        return new J.a(a6, a(jArr[i6], jArr2[i6]));
    }

    @Override // E1.J
    public long l() {
        return this.f1083a.f();
    }
}
