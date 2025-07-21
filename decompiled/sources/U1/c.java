package U1;

import Z0.x;
import c1.C1111E;
import c1.C1143y;
import c1.C1144z;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends N1.c {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f5169a = new C1144z();

    /* renamed from: b, reason: collision with root package name */
    public final C1143y f5170b = new C1143y();

    /* renamed from: c, reason: collision with root package name */
    public C1111E f5171c;

    @Override // N1.c
    public x b(N1.b bVar, ByteBuffer byteBuffer) {
        C1111E c1111e = this.f5171c;
        if (c1111e == null || bVar.f3574j != c1111e.f()) {
            C1111E c1111e2 = new C1111E(bVar.f14007f);
            this.f5171c = c1111e2;
            c1111e2.a(bVar.f14007f - bVar.f3574j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f5169a.R(array, limit);
        this.f5170b.o(array, limit);
        this.f5170b.r(39);
        long h6 = (this.f5170b.h(1) << 32) | this.f5170b.h(32);
        this.f5170b.r(20);
        int h7 = this.f5170b.h(12);
        int h8 = this.f5170b.h(8);
        this.f5169a.U(14);
        x.b a6 = h8 != 0 ? h8 != 255 ? h8 != 4 ? h8 != 5 ? h8 != 6 ? null : g.a(this.f5169a, h6, this.f5171c) : d.a(this.f5169a, h6, this.f5171c) : f.a(this.f5169a) : a.a(this.f5169a, h7, h6) : new e();
        return a6 == null ? new x(new x.b[0]) : new x(a6);
    }
}
