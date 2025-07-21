package V;

import I.EnumC0446p;
import I.EnumC0451s;
import I.EnumC0453t;
import I.InterfaceC0455u;
import I.S0;
import I.r;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h implements InterfaceC0455u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0455u f5285a;

    /* renamed from: b, reason: collision with root package name */
    public final S0 f5286b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5287c;

    public h(S0 s02, InterfaceC0455u interfaceC0455u) {
        this(interfaceC0455u, s02, -1L);
    }

    @Override // I.InterfaceC0455u
    public S0 a() {
        return this.f5286b;
    }

    @Override // I.InterfaceC0455u
    public long c() {
        InterfaceC0455u interfaceC0455u = this.f5285a;
        if (interfaceC0455u != null) {
            return interfaceC0455u.c();
        }
        long j6 = this.f5287c;
        if (j6 != -1) {
            return j6;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // I.InterfaceC0455u
    public EnumC0451s d() {
        InterfaceC0455u interfaceC0455u = this.f5285a;
        return interfaceC0455u != null ? interfaceC0455u.d() : EnumC0451s.UNKNOWN;
    }

    @Override // I.InterfaceC0455u
    public EnumC0453t e() {
        InterfaceC0455u interfaceC0455u = this.f5285a;
        return interfaceC0455u != null ? interfaceC0455u.e() : EnumC0453t.UNKNOWN;
    }

    @Override // I.InterfaceC0455u
    public EnumC0446p f() {
        InterfaceC0455u interfaceC0455u = this.f5285a;
        return interfaceC0455u != null ? interfaceC0455u.f() : EnumC0446p.UNKNOWN;
    }

    @Override // I.InterfaceC0455u
    public r h() {
        InterfaceC0455u interfaceC0455u = this.f5285a;
        return interfaceC0455u != null ? interfaceC0455u.h() : r.UNKNOWN;
    }

    public h(S0 s02, long j6) {
        this(null, s02, j6);
    }

    public h(InterfaceC0455u interfaceC0455u, S0 s02, long j6) {
        this.f5285a = interfaceC0455u;
        this.f5286b = s02;
        this.f5287c = j6;
    }
}
