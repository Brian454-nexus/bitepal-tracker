package k2;

import E1.AbstractC0304f;
import E1.O;
import Z0.q;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.List;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final List f16498a;

    /* renamed from: b, reason: collision with root package name */
    public final O[] f16499b;

    public M(List list) {
        this.f16498a = list;
        this.f16499b = new O[list.size()];
    }

    public void a(long j6, C1144z c1144z) {
        if (c1144z.a() < 9) {
            return;
        }
        int p6 = c1144z.p();
        int p7 = c1144z.p();
        int G6 = c1144z.G();
        if (p6 == 434 && p7 == 1195456820 && G6 == 3) {
            AbstractC0304f.b(j6, c1144z, this.f16499b);
        }
    }

    public void b(E1.r rVar, K.d dVar) {
        for (int i6 = 0; i6 < this.f16499b.length; i6++) {
            dVar.a();
            O a6 = rVar.a(dVar.c(), 3);
            Z0.q qVar = (Z0.q) this.f16498a.get(i6);
            String str = qVar.f6990n;
            AbstractC1119a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            a6.e(new q.b().a0(dVar.b()).o0(str).q0(qVar.f6981e).e0(qVar.f6980d).L(qVar.f6971G).b0(qVar.f6993q).K());
            this.f16499b[i6] = a6;
        }
    }
}
