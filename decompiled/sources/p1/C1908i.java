package p1;

import c1.AbstractC1119a;
import java.nio.ByteBuffer;

/* renamed from: p1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1908i extends f1.f {

    /* renamed from: j, reason: collision with root package name */
    public long f18179j;

    /* renamed from: k, reason: collision with root package name */
    public int f18180k;

    /* renamed from: l, reason: collision with root package name */
    public int f18181l;

    public C1908i() {
        super(2);
        this.f18181l = 32;
    }

    @Override // f1.f, f1.AbstractC1285a
    public void f() {
        super.f();
        this.f18180k = 0;
    }

    public boolean t(f1.f fVar) {
        AbstractC1119a.a(!fVar.q());
        AbstractC1119a.a(!fVar.h());
        AbstractC1119a.a(!fVar.i());
        if (!u(fVar)) {
            return false;
        }
        int i6 = this.f18180k;
        this.f18180k = i6 + 1;
        if (i6 == 0) {
            this.f14007f = fVar.f14007f;
            if (fVar.k()) {
                m(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f14005d;
        if (byteBuffer != null) {
            o(byteBuffer.remaining());
            this.f14005d.put(byteBuffer);
        }
        this.f18179j = fVar.f14007f;
        return true;
    }

    public final boolean u(f1.f fVar) {
        ByteBuffer byteBuffer;
        if (!y()) {
            return true;
        }
        if (this.f18180k >= this.f18181l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f14005d;
        return byteBuffer2 == null || (byteBuffer = this.f14005d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long v() {
        return this.f14007f;
    }

    public long w() {
        return this.f18179j;
    }

    public int x() {
        return this.f18180k;
    }

    public boolean y() {
        return this.f18180k > 0;
    }

    public void z(int i6) {
        AbstractC1119a.a(i6 > 0);
        this.f18181l = i6;
    }
}
