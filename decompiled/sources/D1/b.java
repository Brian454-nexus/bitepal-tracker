package D1;

import Z0.q;
import c1.AbstractC1117K;
import c1.C1144z;
import f1.f;
import g1.AbstractC1328e;
import g1.K0;
import java.nio.ByteBuffer;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends AbstractC1328e {

    /* renamed from: r, reason: collision with root package name */
    public final f f747r;

    /* renamed from: s, reason: collision with root package name */
    public final C1144z f748s;

    /* renamed from: t, reason: collision with root package name */
    public long f749t;

    /* renamed from: u, reason: collision with root package name */
    public a f750u;

    /* renamed from: v, reason: collision with root package name */
    public long f751v;

    public b() {
        super(6);
        this.f747r = new f(1);
        this.f748s = new C1144z();
    }

    @Override // g1.AbstractC1328e, g1.H0.b
    public void H(int i6, Object obj) {
        if (i6 == 8) {
            this.f750u = (a) obj;
        } else {
            super.H(i6, obj);
        }
    }

    @Override // g1.K0
    public int b(q qVar) {
        return "application/x-camera-motion".equals(qVar.f6990n) ? K0.E(4) : K0.E(0);
    }

    @Override // g1.J0
    public boolean c() {
        return true;
    }

    @Override // g1.J0
    public boolean d() {
        return p();
    }

    @Override // g1.AbstractC1328e
    public void e0() {
        t0();
    }

    @Override // g1.J0, g1.K0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        this.f751v = Long.MIN_VALUE;
        t0();
    }

    @Override // g1.J0
    public void i(long j6, long j7) {
        while (!p() && this.f751v < 100000 + j6) {
            this.f747r.f();
            if (p0(Y(), this.f747r, 0) != -4 || this.f747r.i()) {
                return;
            }
            long j8 = this.f747r.f14007f;
            this.f751v = j8;
            boolean z6 = j8 < a0();
            if (this.f750u != null && !z6) {
                this.f747r.p();
                float[] s02 = s0((ByteBuffer) AbstractC1117K.i(this.f747r.f14005d));
                if (s02 != null) {
                    ((a) AbstractC1117K.i(this.f750u)).b(this.f751v - this.f749t, s02);
                }
            }
        }
    }

    @Override // g1.AbstractC1328e
    public void n0(q[] qVarArr, long j6, long j7, InterfaceC2212D.b bVar) {
        this.f749t = j7;
    }

    public final float[] s0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f748s.R(byteBuffer.array(), byteBuffer.limit());
        this.f748s.T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i6 = 0; i6 < 3; i6++) {
            fArr[i6] = Float.intBitsToFloat(this.f748s.t());
        }
        return fArr;
    }

    public final void t0() {
        a aVar = this.f750u;
        if (aVar != null) {
            aVar.e();
        }
    }
}
