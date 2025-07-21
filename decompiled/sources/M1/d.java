package M1;

import E1.InterfaceC0315q;
import E1.z;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    public final long f3395b;

    public d(InterfaceC0315q interfaceC0315q, long j6) {
        super(interfaceC0315q);
        AbstractC1119a.a(interfaceC0315q.getPosition() >= j6);
        this.f3395b = j6;
    }

    @Override // E1.z, E1.InterfaceC0315q
    public long a() {
        return super.a() - this.f3395b;
    }

    @Override // E1.z, E1.InterfaceC0315q
    public long getPosition() {
        return super.getPosition() - this.f3395b;
    }

    @Override // E1.z, E1.InterfaceC0315q
    public long h() {
        return super.h() - this.f3395b;
    }
}
