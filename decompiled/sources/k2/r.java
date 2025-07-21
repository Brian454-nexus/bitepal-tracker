package k2;

import E1.O;
import Z0.q;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r implements InterfaceC1679m {

    /* renamed from: b, reason: collision with root package name */
    public O f16721b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16722c;

    /* renamed from: e, reason: collision with root package name */
    public int f16724e;

    /* renamed from: f, reason: collision with root package name */
    public int f16725f;

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16720a = new C1144z(10);

    /* renamed from: d, reason: collision with root package name */
    public long f16723d = -9223372036854775807L;

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16721b);
        if (this.f16722c) {
            int a6 = c1144z.a();
            int i6 = this.f16725f;
            if (i6 < 10) {
                int min = Math.min(a6, 10 - i6);
                System.arraycopy(c1144z.e(), c1144z.f(), this.f16720a.e(), this.f16725f, min);
                if (this.f16725f + min == 10) {
                    this.f16720a.T(0);
                    if (73 != this.f16720a.G() || 68 != this.f16720a.G() || 51 != this.f16720a.G()) {
                        AbstractC1133o.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f16722c = false;
                        return;
                    } else {
                        this.f16720a.U(3);
                        this.f16724e = this.f16720a.F() + 10;
                    }
                }
            }
            int min2 = Math.min(a6, this.f16724e - this.f16725f);
            this.f16721b.a(c1144z, min2);
            this.f16725f += min2;
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16722c = false;
        this.f16723d = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
        int i6;
        AbstractC1119a.i(this.f16721b);
        if (this.f16722c && (i6 = this.f16724e) != 0 && this.f16725f == i6) {
            AbstractC1119a.g(this.f16723d != -9223372036854775807L);
            this.f16721b.f(this.f16723d, 1, this.f16724e, 0, null);
            this.f16722c = false;
        }
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f16722c = true;
        this.f16723d = j6;
        this.f16724e = 0;
        this.f16725f = 0;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        O a6 = rVar.a(dVar.c(), 5);
        this.f16721b = a6;
        a6.e(new q.b().a0(dVar.b()).o0("application/id3").K());
    }
}
