package x1;

import Z0.q;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.InterfaceC1248f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m extends AbstractC2261e {

    /* renamed from: j, reason: collision with root package name */
    public final long f20481j;

    public m(InterfaceC1248f interfaceC1248f, C1252j c1252j, q qVar, int i6, Object obj, long j6, long j7, long j8) {
        super(interfaceC1248f, c1252j, 1, qVar, i6, obj, j6, j7);
        AbstractC1119a.e(qVar);
        this.f20481j = j8;
    }

    public long g() {
        long j6 = this.f20481j;
        if (j6 != -1) {
            return j6 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
