package k2;

import E1.O;
import Z0.q;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.Collections;
import java.util.List;
import k2.K;

/* renamed from: k2.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1678l implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final List f16589a;

    /* renamed from: b, reason: collision with root package name */
    public final O[] f16590b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16591c;

    /* renamed from: d, reason: collision with root package name */
    public int f16592d;

    /* renamed from: e, reason: collision with root package name */
    public int f16593e;

    /* renamed from: f, reason: collision with root package name */
    public long f16594f = -9223372036854775807L;

    public C1678l(List list) {
        this.f16589a = list;
        this.f16590b = new O[list.size()];
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        if (this.f16591c) {
            if (this.f16592d != 2 || f(c1144z, 32)) {
                if (this.f16592d != 1 || f(c1144z, 0)) {
                    int f6 = c1144z.f();
                    int a6 = c1144z.a();
                    for (O o6 : this.f16590b) {
                        c1144z.T(f6);
                        o6.a(c1144z, a6);
                    }
                    this.f16593e += a6;
                }
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16591c = false;
        this.f16594f = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
        if (this.f16591c) {
            AbstractC1119a.g(this.f16594f != -9223372036854775807L);
            for (O o6 : this.f16590b) {
                o6.f(this.f16594f, 1, this.f16593e, 0, null);
            }
            this.f16591c = false;
        }
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f16591c = true;
        this.f16594f = j6;
        this.f16593e = 0;
        this.f16592d = 2;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        for (int i6 = 0; i6 < this.f16590b.length; i6++) {
            K.a aVar = (K.a) this.f16589a.get(i6);
            dVar.a();
            O a6 = rVar.a(dVar.c(), 3);
            a6.e(new q.b().a0(dVar.b()).o0("application/dvbsubs").b0(Collections.singletonList(aVar.f16487c)).e0(aVar.f16485a).K());
            this.f16590b[i6] = a6;
        }
    }

    public final boolean f(C1144z c1144z, int i6) {
        if (c1144z.a() == 0) {
            return false;
        }
        if (c1144z.G() != i6) {
            this.f16591c = false;
        }
        this.f16592d--;
        return this.f16591c;
    }
}
