package x1;

import E1.C0307i;
import E1.O;
import Z0.q;
import Z0.y;
import c1.C1144z;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.C1265w;
import e1.InterfaceC1248f;
import x1.InterfaceC2262f;

/* renamed from: x1.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2266j extends AbstractC2257a {

    /* renamed from: o, reason: collision with root package name */
    public final int f20469o;

    /* renamed from: p, reason: collision with root package name */
    public final long f20470p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2262f f20471q;

    /* renamed from: r, reason: collision with root package name */
    public long f20472r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f20473s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20474t;

    public C2266j(InterfaceC1248f interfaceC1248f, C1252j c1252j, q qVar, int i6, Object obj, long j6, long j7, long j8, long j9, long j10, int i7, long j11, InterfaceC2262f interfaceC2262f) {
        super(interfaceC1248f, c1252j, qVar, i6, obj, j6, j7, j8, j9, j10);
        this.f20469o = i7;
        this.f20470p = j11;
        this.f20471q = interfaceC2262f;
    }

    @Override // A1.l.e
    public final void a() {
        C2259c j6 = j();
        if (this.f20472r == 0) {
            j6.c(this.f20470p);
            InterfaceC2262f interfaceC2262f = this.f20471q;
            InterfaceC2262f.b l6 = l(j6);
            long j7 = this.f20401k;
            long j8 = j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.f20470p;
            long j9 = this.f20402l;
            interfaceC2262f.d(l6, j8, j9 != -9223372036854775807L ? j9 - this.f20470p : -9223372036854775807L);
        }
        try {
            C1252j e6 = this.f20431b.e(this.f20472r);
            C1265w c1265w = this.f20438i;
            C0307i c0307i = new C0307i(c1265w, e6.f13826g, c1265w.r(e6));
            do {
                try {
                    if (this.f20473s) {
                        break;
                    }
                } finally {
                    this.f20472r = c0307i.getPosition() - this.f20431b.f13826g;
                }
            } while (this.f20471q.b(c0307i));
            m(j6);
            this.f20472r = c0307i.getPosition() - this.f20431b.f13826g;
            AbstractC1251i.a(this.f20438i);
            this.f20474t = !this.f20473s;
        } catch (Throwable th) {
            AbstractC1251i.a(this.f20438i);
            throw th;
        }
    }

    @Override // A1.l.e
    public final void c() {
        this.f20473s = true;
    }

    @Override // x1.m
    public long g() {
        return this.f20481j + this.f20469o;
    }

    @Override // x1.m
    public boolean h() {
        return this.f20474t;
    }

    public InterfaceC2262f.b l(C2259c c2259c) {
        return c2259c;
    }

    public final void m(C2259c c2259c) {
        if (y.p(this.f20433d.f6989m)) {
            q qVar = this.f20433d;
            int i6 = qVar.f6973I;
            if ((i6 <= 1 && qVar.f6974J <= 1) || i6 == -1 || qVar.f6974J == -1) {
                return;
            }
            O a6 = c2259c.a(0, 4);
            q qVar2 = this.f20433d;
            int i7 = qVar2.f6973I * qVar2.f6974J;
            long j6 = (this.f20437h - this.f20436g) / i7;
            for (int i8 = 1; i8 < i7; i8++) {
                a6.a(new C1144z(), 0);
                a6.f(i8 * j6, 0, 0, 0, null);
            }
        }
    }
}
