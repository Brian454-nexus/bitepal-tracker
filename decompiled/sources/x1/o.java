package x1;

import E1.C0307i;
import E1.O;
import Z0.q;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.InterfaceC1248f;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o extends AbstractC2257a {

    /* renamed from: o, reason: collision with root package name */
    public final int f20483o;

    /* renamed from: p, reason: collision with root package name */
    public final q f20484p;

    /* renamed from: q, reason: collision with root package name */
    public long f20485q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20486r;

    public o(InterfaceC1248f interfaceC1248f, C1252j c1252j, q qVar, int i6, Object obj, long j6, long j7, long j8, int i7, q qVar2) {
        super(interfaceC1248f, c1252j, qVar, i6, obj, j6, j7, -9223372036854775807L, -9223372036854775807L, j8);
        this.f20483o = i7;
        this.f20484p = qVar2;
    }

    @Override // A1.l.e
    public void a() {
        C2259c j6 = j();
        j6.c(0L);
        O a6 = j6.a(0, this.f20483o);
        a6.e(this.f20484p);
        try {
            long r6 = this.f20438i.r(this.f20431b.e(this.f20485q));
            if (r6 != -1) {
                r6 += this.f20485q;
            }
            C0307i c0307i = new C0307i(this.f20438i, this.f20485q, r6);
            for (int i6 = 0; i6 != -1; i6 = a6.c(c0307i, IntCompanionObject.MAX_VALUE, true)) {
                this.f20485q += i6;
            }
            a6.f(this.f20436g, 1, (int) this.f20485q, 0, null);
            AbstractC1251i.a(this.f20438i);
            this.f20486r = true;
        } catch (Throwable th) {
            AbstractC1251i.a(this.f20438i);
            throw th;
        }
    }

    @Override // A1.l.e
    public void c() {
    }

    @Override // x1.m
    public boolean h() {
        return this.f20486r;
    }
}
