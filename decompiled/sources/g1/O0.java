package g1;

import c1.AbstractC1117K;
import c1.InterfaceC1121c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class O0 implements InterfaceC1345m0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1121c f14393a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14394b;

    /* renamed from: c, reason: collision with root package name */
    public long f14395c;

    /* renamed from: d, reason: collision with root package name */
    public long f14396d;

    /* renamed from: e, reason: collision with root package name */
    public Z0.B f14397e = Z0.B.f6617d;

    public O0(InterfaceC1121c interfaceC1121c) {
        this.f14393a = interfaceC1121c;
    }

    @Override // g1.InterfaceC1345m0
    public long A() {
        long j6 = this.f14395c;
        if (!this.f14394b) {
            return j6;
        }
        long b6 = this.f14393a.b() - this.f14396d;
        Z0.B b7 = this.f14397e;
        return j6 + (b7.f6620a == 1.0f ? AbstractC1117K.J0(b6) : b7.a(b6));
    }

    public void a(long j6) {
        this.f14395c = j6;
        if (this.f14394b) {
            this.f14396d = this.f14393a.b();
        }
    }

    public void b() {
        if (this.f14394b) {
            return;
        }
        this.f14396d = this.f14393a.b();
        this.f14394b = true;
    }

    public void c() {
        if (this.f14394b) {
            a(A());
            this.f14394b = false;
        }
    }

    @Override // g1.InterfaceC1345m0
    public void e(Z0.B b6) {
        if (this.f14394b) {
            a(A());
        }
        this.f14397e = b6;
    }

    @Override // g1.InterfaceC1345m0
    public Z0.B g() {
        return this.f14397e;
    }
}
