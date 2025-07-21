package x1;

import E1.C0307i;
import Z0.q;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.C1265w;
import e1.InterfaceC1248f;
import x1.InterfaceC2262f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends AbstractC2261e {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2262f f20477j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2262f.b f20478k;

    /* renamed from: l, reason: collision with root package name */
    public long f20479l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f20480m;

    public l(InterfaceC1248f interfaceC1248f, C1252j c1252j, q qVar, int i6, Object obj, InterfaceC2262f interfaceC2262f) {
        super(interfaceC1248f, c1252j, 2, qVar, i6, obj, -9223372036854775807L, -9223372036854775807L);
        this.f20477j = interfaceC2262f;
    }

    @Override // A1.l.e
    public void a() {
        if (this.f20479l == 0) {
            this.f20477j.d(this.f20478k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1252j e6 = this.f20431b.e(this.f20479l);
            C1265w c1265w = this.f20438i;
            C0307i c0307i = new C0307i(c1265w, e6.f13826g, c1265w.r(e6));
            while (!this.f20480m && this.f20477j.b(c0307i)) {
                try {
                } finally {
                    this.f20479l = c0307i.getPosition() - this.f20431b.f13826g;
                }
            }
        } finally {
            AbstractC1251i.a(this.f20438i);
        }
    }

    @Override // A1.l.e
    public void c() {
        this.f20480m = true;
    }

    public void g(InterfaceC2262f.b bVar) {
        this.f20478k = bVar;
    }
}
