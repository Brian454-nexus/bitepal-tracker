package i1;

import Z0.C0830b;
import Z0.C0833e;
import Z0.q;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.NotificationManagerCompat;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.AbstractC1136r;
import g1.C1332g;
import g1.C1337i0;
import g1.InterfaceC1345m0;
import g1.J0;
import g1.K0;
import i1.InterfaceC1506x;
import i1.InterfaceC1507y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import p1.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class W extends p1.u implements InterfaceC1345m0 {

    /* renamed from: P0, reason: collision with root package name */
    public final Context f15872P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final InterfaceC1506x.a f15873Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final InterfaceC1507y f15874R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f15875S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f15876T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f15877U0;

    /* renamed from: V0, reason: collision with root package name */
    public Z0.q f15878V0;

    /* renamed from: W0, reason: collision with root package name */
    public Z0.q f15879W0;

    /* renamed from: X0, reason: collision with root package name */
    public long f15880X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f15881Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f15882Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f15883a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f15884b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f15885c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f15886d1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static void a(InterfaceC1507y interfaceC1507y, Object obj) {
            interfaceC1507y.f((AudioDeviceInfo) obj);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements InterfaceC1507y.d {
        public c() {
        }

        @Override // i1.InterfaceC1507y.d
        public void a(long j6) {
            W.this.f15873Q0.v(j6);
        }

        @Override // i1.InterfaceC1507y.d
        public void b(InterfaceC1507y.a aVar) {
            W.this.f15873Q0.o(aVar);
        }

        @Override // i1.InterfaceC1507y.d
        public void c(boolean z6) {
            W.this.f15873Q0.w(z6);
        }

        @Override // i1.InterfaceC1507y.d
        public void d(Exception exc) {
            AbstractC1133o.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            W.this.f15873Q0.n(exc);
        }

        @Override // i1.InterfaceC1507y.d
        public void e(InterfaceC1507y.a aVar) {
            W.this.f15873Q0.p(aVar);
        }

        @Override // i1.InterfaceC1507y.d
        public void f() {
            W.this.f15883a1 = true;
        }

        @Override // i1.InterfaceC1507y.d
        public void g() {
            J0.a d12 = W.this.d1();
            if (d12 != null) {
                d12.a();
            }
        }

        @Override // i1.InterfaceC1507y.d
        public void h(int i6, long j6, long j7) {
            W.this.f15873Q0.x(i6, j6, j7);
        }

        @Override // i1.InterfaceC1507y.d
        public void i() {
            W.this.j0();
        }

        @Override // i1.InterfaceC1507y.d
        public void j() {
            W.this.o2();
        }

        @Override // i1.InterfaceC1507y.d
        public void k() {
            J0.a d12 = W.this.d1();
            if (d12 != null) {
                d12.b();
            }
        }
    }

    public W(Context context, k.b bVar, p1.x xVar, boolean z6, Handler handler, InterfaceC1506x interfaceC1506x, InterfaceC1507y interfaceC1507y) {
        super(1, bVar, xVar, z6, 44100.0f);
        this.f15872P0 = context.getApplicationContext();
        this.f15874R0 = interfaceC1507y;
        this.f15884b1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f15873Q0 = new InterfaceC1506x.a(handler, interfaceC1506x);
        this.f15886d1 = -9223372036854775807L;
        interfaceC1507y.A(new c());
    }

    public static boolean g2(String str) {
        if (AbstractC1117K.f10560a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(AbstractC1117K.f10562c)) {
            return false;
        }
        String str2 = AbstractC1117K.f10561b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    public static boolean h2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    public static boolean i2() {
        if (AbstractC1117K.f10560a != 23) {
            return false;
        }
        String str = AbstractC1117K.f10563d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int k2(p1.n nVar, Z0.q qVar) {
        int i6;
        if (!"OMX.google.raw.decoder".equals(nVar.f18194a) || (i6 = AbstractC1117K.f10560a) >= 24 || (i6 == 23 && AbstractC1117K.F0(this.f15872P0))) {
            return qVar.f6991o;
        }
        return -1;
    }

    public static List m2(p1.x xVar, Z0.q qVar, boolean z6, InterfaceC1507y interfaceC1507y) {
        p1.n x6;
        return qVar.f6990n == null ? z6.w.w() : (!interfaceC1507y.b(qVar) || (x6 = p1.G.x()) == null) ? p1.G.v(xVar, qVar, z6, false) : z6.w.y(x6);
    }

    @Override // g1.InterfaceC1345m0
    public long A() {
        if (f() == 2) {
            q2();
        }
        return this.f15880X0;
    }

    @Override // p1.u
    public boolean D1(long j6, long j7, p1.k kVar, ByteBuffer byteBuffer, int i6, int i7, int i8, long j8, boolean z6, boolean z7, Z0.q qVar) {
        AbstractC1119a.e(byteBuffer);
        this.f15886d1 = -9223372036854775807L;
        if (this.f15879W0 != null && (i7 & 2) != 0) {
            ((p1.k) AbstractC1119a.e(kVar)).j(i6, false);
            return true;
        }
        if (z6) {
            if (kVar != null) {
                kVar.j(i6, false);
            }
            this.f18228K0.f14558f += i8;
            this.f15874R0.t();
            return true;
        }
        try {
            if (!this.f15874R0.y(byteBuffer, j8, i8)) {
                this.f15886d1 = j8;
                return false;
            }
            if (kVar != null) {
                kVar.j(i6, false);
            }
            this.f18228K0.f14557e += i8;
            return true;
        } catch (InterfaceC1507y.c e6) {
            throw V(e6, this.f15878V0, e6.f15986b, (!k1() || X().f14378a == 0) ? 5001 : 5004);
        } catch (InterfaceC1507y.f e7) {
            throw V(e7, qVar, e7.f15991b, (!k1() || X().f14378a == 0) ? 5002 : 5003);
        }
    }

    @Override // g1.InterfaceC1345m0
    public boolean F() {
        boolean z6 = this.f15883a1;
        this.f15883a1 = false;
        return z6;
    }

    @Override // p1.u, g1.AbstractC1328e, g1.H0.b
    public void H(int i6, Object obj) {
        if (i6 == 2) {
            this.f15874R0.i(((Float) AbstractC1119a.e(obj)).floatValue());
            return;
        }
        if (i6 == 3) {
            this.f15874R0.w((C0830b) AbstractC1119a.e((C0830b) obj));
            return;
        }
        if (i6 == 6) {
            this.f15874R0.B((C0833e) AbstractC1119a.e((C0833e) obj));
            return;
        }
        if (i6 == 12) {
            if (AbstractC1117K.f10560a >= 23) {
                b.a(this.f15874R0, obj);
            }
        } else if (i6 == 16) {
            this.f15884b1 = ((Integer) AbstractC1119a.e(obj)).intValue();
            p2();
        } else if (i6 == 9) {
            this.f15874R0.C(((Boolean) AbstractC1119a.e(obj)).booleanValue());
        } else if (i6 != 10) {
            super.H(i6, obj);
        } else {
            this.f15874R0.m(((Integer) AbstractC1119a.e(obj)).intValue());
        }
    }

    @Override // p1.u
    public void I1() {
        try {
            this.f15874R0.h();
            if (Y0() != -9223372036854775807L) {
                this.f15886d1 = Y0();
            }
        } catch (InterfaceC1507y.f e6) {
            throw V(e6, e6.f15992c, e6.f15991b, k1() ? 5003 : 5002);
        }
    }

    @Override // g1.AbstractC1328e, g1.J0
    public InterfaceC1345m0 R() {
        return this;
    }

    @Override // p1.u
    public float U0(float f6, Z0.q qVar, Z0.q[] qVarArr) {
        int i6 = -1;
        for (Z0.q qVar2 : qVarArr) {
            int i7 = qVar2.f6967C;
            if (i7 != -1) {
                i6 = Math.max(i6, i7);
            }
        }
        if (i6 == -1) {
            return -1.0f;
        }
        return i6 * f6;
    }

    @Override // p1.u
    public boolean V1(Z0.q qVar) {
        if (X().f14378a != 0) {
            int j22 = j2(qVar);
            if ((j22 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if (X().f14378a == 2 || (j22 & 1024) != 0) {
                    return true;
                }
                if (qVar.f6969E == 0 && qVar.f6970F == 0) {
                    return true;
                }
            }
        }
        return this.f15874R0.b(qVar);
    }

    @Override // p1.u
    public List W0(p1.x xVar, Z0.q qVar, boolean z6) {
        return p1.G.w(m2(xVar, qVar, z6, this.f15874R0), qVar);
    }

    @Override // p1.u
    public int W1(p1.x xVar, Z0.q qVar) {
        int i6;
        boolean z6;
        if (!Z0.y.o(qVar.f6990n)) {
            return K0.E(0);
        }
        int i7 = AbstractC1117K.f10560a >= 21 ? 32 : 0;
        boolean z7 = true;
        boolean z8 = qVar.f6975K != 0;
        boolean X12 = p1.u.X1(qVar);
        int i8 = 8;
        if (!X12 || (z8 && p1.G.x() == null)) {
            i6 = 0;
        } else {
            int j22 = j2(qVar);
            if (this.f15874R0.b(qVar)) {
                return K0.x(4, 8, i7, j22);
            }
            i6 = j22;
        }
        if ((!"audio/raw".equals(qVar.f6990n) || this.f15874R0.b(qVar)) && this.f15874R0.b(AbstractC1117K.h0(2, qVar.f6966B, qVar.f6967C))) {
            List m22 = m2(xVar, qVar, false, this.f15874R0);
            if (m22.isEmpty()) {
                return K0.E(1);
            }
            if (!X12) {
                return K0.E(2);
            }
            p1.n nVar = (p1.n) m22.get(0);
            boolean m6 = nVar.m(qVar);
            if (!m6) {
                for (int i9 = 1; i9 < m22.size(); i9++) {
                    p1.n nVar2 = (p1.n) m22.get(i9);
                    if (nVar2.m(qVar)) {
                        z6 = false;
                        nVar = nVar2;
                        break;
                    }
                }
            }
            z6 = true;
            z7 = m6;
            int i10 = z7 ? 4 : 3;
            if (z7 && nVar.p(qVar)) {
                i8 = 16;
            }
            return K0.o(i10, i8, i7, nVar.f18201h ? 64 : 0, z6 ? 128 : 0, i6);
        }
        return K0.E(1);
    }

    @Override // p1.u
    public long X0(boolean z6, long j6, long j7) {
        long j8 = this.f15886d1;
        if (j8 == -9223372036854775807L) {
            return super.X0(z6, j6, j7);
        }
        long j9 = (((float) (j8 - j6)) / (g() != null ? g().f6620a : 1.0f)) / 2.0f;
        if (this.f15885c1) {
            j9 -= AbstractC1117K.J0(W().b()) - j7;
        }
        return Math.max(10000L, j9);
    }

    @Override // p1.u
    public k.a Z0(p1.n nVar, Z0.q qVar, MediaCrypto mediaCrypto, float f6) {
        this.f15875S0 = l2(nVar, qVar, c0());
        this.f15876T0 = g2(nVar.f18194a);
        this.f15877U0 = h2(nVar.f18194a);
        MediaFormat n22 = n2(qVar, nVar.f18196c, this.f15875S0, f6);
        this.f15879W0 = (!"audio/raw".equals(nVar.f18195b) || "audio/raw".equals(qVar.f6990n)) ? null : qVar;
        return k.a.a(nVar, n22, qVar, mediaCrypto);
    }

    @Override // p1.u, g1.J0
    public boolean c() {
        return this.f15874R0.k() || super.c();
    }

    @Override // p1.u, g1.J0
    public boolean d() {
        return super.d() && this.f15874R0.d();
    }

    @Override // g1.InterfaceC1345m0
    public void e(Z0.B b6) {
        this.f15874R0.e(b6);
    }

    @Override // p1.u, g1.AbstractC1328e
    public void e0() {
        this.f15882Z0 = true;
        this.f15878V0 = null;
        try {
            this.f15874R0.flush();
            try {
                super.e0();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.e0();
                throw th;
            } finally {
            }
        }
    }

    @Override // p1.u
    public void e1(f1.f fVar) {
        Z0.q qVar;
        if (AbstractC1117K.f10560a < 29 || (qVar = fVar.f14003b) == null || !Objects.equals(qVar.f6990n, "audio/opus") || !k1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(fVar.f14008g);
        int i6 = ((Z0.q) AbstractC1119a.e(fVar.f14003b)).f6969E;
        if (byteBuffer.remaining() == 8) {
            this.f15874R0.n(i6, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p1.u, g1.AbstractC1328e
    public void f0(boolean z6, boolean z7) {
        super.f0(z6, z7);
        this.f15873Q0.t(this.f18228K0);
        if (X().f14379b) {
            this.f15874R0.v();
        } else {
            this.f15874R0.q();
        }
        this.f15874R0.z(b0());
        this.f15874R0.s(W());
    }

    @Override // g1.InterfaceC1345m0
    public Z0.B g() {
        return this.f15874R0.g();
    }

    @Override // g1.J0, g1.K0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p1.u, g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        super.h0(j6, z6);
        this.f15874R0.flush();
        this.f15880X0 = j6;
        this.f15883a1 = false;
        this.f15881Y0 = true;
    }

    @Override // g1.AbstractC1328e
    public void i0() {
        this.f15874R0.release();
    }

    public final int j2(Z0.q qVar) {
        C1494k l6 = this.f15874R0.l(qVar);
        if (!l6.f15941a) {
            return 0;
        }
        int i6 = l6.f15942b ? 1536 : ConstantsKt.MINIMUM_BLOCK_SIZE;
        return l6.f15943c ? i6 | 2048 : i6;
    }

    @Override // p1.u, g1.AbstractC1328e
    public void k0() {
        this.f15883a1 = false;
        try {
            super.k0();
        } finally {
            if (this.f15882Z0) {
                this.f15882Z0 = false;
                this.f15874R0.a();
            }
        }
    }

    @Override // p1.u, g1.AbstractC1328e
    public void l0() {
        super.l0();
        this.f15874R0.j();
        this.f15885c1 = true;
    }

    public int l2(p1.n nVar, Z0.q qVar, Z0.q[] qVarArr) {
        int k22 = k2(nVar, qVar);
        if (qVarArr.length == 1) {
            return k22;
        }
        for (Z0.q qVar2 : qVarArr) {
            if (nVar.e(qVar, qVar2).f14569d != 0) {
                k22 = Math.max(k22, k2(nVar, qVar2));
            }
        }
        return k22;
    }

    @Override // p1.u, g1.AbstractC1328e
    public void m0() {
        q2();
        this.f15885c1 = false;
        this.f15874R0.c();
        super.m0();
    }

    public MediaFormat n2(Z0.q qVar, String str, int i6, float f6) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", qVar.f6966B);
        mediaFormat.setInteger("sample-rate", qVar.f6967C);
        AbstractC1136r.e(mediaFormat, qVar.f6993q);
        AbstractC1136r.d(mediaFormat, "max-input-size", i6);
        int i7 = AbstractC1117K.f10560a;
        if (i7 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f && !i2()) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (i7 <= 28 && "audio/ac4".equals(qVar.f6990n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i7 >= 24 && this.f15874R0.x(AbstractC1117K.h0(4, qVar.f6966B, qVar.f6967C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i7 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i7 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f15884b1));
        }
        return mediaFormat;
    }

    public void o2() {
        this.f15881Y0 = true;
    }

    public final void p2() {
        p1.k Q02 = Q0();
        if (Q02 != null && AbstractC1117K.f10560a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f15884b1));
            Q02.a(bundle);
        }
    }

    public final void q2() {
        long p6 = this.f15874R0.p(d());
        if (p6 != Long.MIN_VALUE) {
            if (!this.f15881Y0) {
                p6 = Math.max(this.f15880X0, p6);
            }
            this.f15880X0 = p6;
            this.f15881Y0 = false;
        }
    }

    @Override // p1.u
    public void s1(Exception exc) {
        AbstractC1133o.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f15873Q0.m(exc);
    }

    @Override // p1.u
    public void t1(String str, k.a aVar, long j6, long j7) {
        this.f15873Q0.q(str, j6, j7);
    }

    @Override // p1.u
    public void u1(String str) {
        this.f15873Q0.r(str);
    }

    @Override // p1.u
    public C1332g v0(p1.n nVar, Z0.q qVar, Z0.q qVar2) {
        C1332g e6 = nVar.e(qVar, qVar2);
        int i6 = e6.f14570e;
        if (l1(qVar2)) {
            i6 |= 32768;
        }
        if (k2(nVar, qVar2) > this.f15875S0) {
            i6 |= 64;
        }
        int i7 = i6;
        return new C1332g(nVar.f18194a, qVar, qVar2, i7 != 0 ? 0 : e6.f14569d, i7);
    }

    @Override // p1.u
    public C1332g v1(C1337i0 c1337i0) {
        Z0.q qVar = (Z0.q) AbstractC1119a.e(c1337i0.f14685b);
        this.f15878V0 = qVar;
        C1332g v12 = super.v1(c1337i0);
        this.f15873Q0.u(qVar, v12);
        return v12;
    }

    @Override // p1.u
    public void w1(Z0.q qVar, MediaFormat mediaFormat) {
        int i6;
        Z0.q qVar2 = this.f15879W0;
        int[] iArr = null;
        if (qVar2 != null) {
            qVar = qVar2;
        } else if (Q0() != null) {
            AbstractC1119a.e(mediaFormat);
            Z0.q K5 = new q.b().o0("audio/raw").i0("audio/raw".equals(qVar.f6990n) ? qVar.f6968D : (AbstractC1117K.f10560a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC1117K.g0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).V(qVar.f6969E).W(qVar.f6970F).h0(qVar.f6987k).T(qVar.f6988l).a0(qVar.f6977a).c0(qVar.f6978b).d0(qVar.f6979c).e0(qVar.f6980d).q0(qVar.f6981e).m0(qVar.f6982f).N(mediaFormat.getInteger("channel-count")).p0(mediaFormat.getInteger("sample-rate")).K();
            if (this.f15876T0 && K5.f6966B == 6 && (i6 = qVar.f6966B) < 6) {
                iArr = new int[i6];
                for (int i7 = 0; i7 < qVar.f6966B; i7++) {
                    iArr[i7] = i7;
                }
            } else if (this.f15877U0) {
                iArr = E1.S.a(K5.f6966B);
            }
            qVar = K5;
        }
        try {
            if (AbstractC1117K.f10560a >= 29) {
                if (!k1() || X().f14378a == 0) {
                    this.f15874R0.o(0);
                } else {
                    this.f15874R0.o(X().f14378a);
                }
            }
            this.f15874R0.u(qVar, 0, iArr);
        } catch (InterfaceC1507y.b e6) {
            throw U(e6, e6.f15984a, 5001);
        }
    }

    @Override // p1.u
    public void x1(long j6) {
        this.f15874R0.r(j6);
    }

    @Override // p1.u
    public void z1() {
        super.z1();
        this.f15874R0.t();
    }
}
