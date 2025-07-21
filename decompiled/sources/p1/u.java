package p1;

import Z0.AbstractC0835g;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import c1.AbstractC1112F;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1110D;
import f1.InterfaceC1286b;
import f1.f;
import g1.AbstractC1328e;
import g1.C1330f;
import g1.C1332g;
import g1.C1337i0;
import g1.C1342l;
import g1.J0;
import h1.v1;
import i1.X;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import l1.InterfaceC1743m;
import p1.G;
import p1.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class u extends AbstractC1328e {

    /* renamed from: O0, reason: collision with root package name */
    public static final byte[] f18206O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public final ArrayDeque f18207A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f18208A0;

    /* renamed from: B, reason: collision with root package name */
    public final X f18209B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f18210B0;

    /* renamed from: C, reason: collision with root package name */
    public Z0.q f18211C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f18212C0;

    /* renamed from: D, reason: collision with root package name */
    public Z0.q f18213D;

    /* renamed from: D0, reason: collision with root package name */
    public long f18214D0;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC1743m f18215E;

    /* renamed from: E0, reason: collision with root package name */
    public long f18216E0;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC1743m f18217F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f18218F0;

    /* renamed from: G, reason: collision with root package name */
    public J0.a f18219G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f18220G0;

    /* renamed from: H, reason: collision with root package name */
    public MediaCrypto f18221H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f18222H0;

    /* renamed from: I, reason: collision with root package name */
    public long f18223I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f18224I0;

    /* renamed from: J, reason: collision with root package name */
    public float f18225J;

    /* renamed from: J0, reason: collision with root package name */
    public C1342l f18226J0;

    /* renamed from: K, reason: collision with root package name */
    public float f18227K;

    /* renamed from: K0, reason: collision with root package name */
    public C1330f f18228K0;

    /* renamed from: L, reason: collision with root package name */
    public k f18229L;

    /* renamed from: L0, reason: collision with root package name */
    public f f18230L0;

    /* renamed from: M, reason: collision with root package name */
    public Z0.q f18231M;

    /* renamed from: M0, reason: collision with root package name */
    public long f18232M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f18233N0;

    /* renamed from: V, reason: collision with root package name */
    public MediaFormat f18234V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f18235W;

    /* renamed from: X, reason: collision with root package name */
    public float f18236X;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayDeque f18237Y;

    /* renamed from: Z, reason: collision with root package name */
    public d f18238Z;

    /* renamed from: a0, reason: collision with root package name */
    public n f18239a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f18240b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f18241c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18242d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f18243e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f18244f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f18245g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f18246h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f18247i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f18248j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f18249k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f18250l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f18251m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f18252n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f18253o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f18254p0;

    /* renamed from: q0, reason: collision with root package name */
    public ByteBuffer f18255q0;

    /* renamed from: r, reason: collision with root package name */
    public final k.b f18256r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f18257r0;

    /* renamed from: s, reason: collision with root package name */
    public final x f18258s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f18259s0;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18260t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f18261t0;

    /* renamed from: u, reason: collision with root package name */
    public final float f18262u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f18263u0;

    /* renamed from: v, reason: collision with root package name */
    public final f1.f f18264v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f18265v0;

    /* renamed from: w, reason: collision with root package name */
    public final f1.f f18266w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f18267w0;

    /* renamed from: x, reason: collision with root package name */
    public final f1.f f18268x;

    /* renamed from: x0, reason: collision with root package name */
    public int f18269x0;

    /* renamed from: y, reason: collision with root package name */
    public final C1908i f18270y;

    /* renamed from: y0, reason: collision with root package name */
    public int f18271y0;

    /* renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f18272z;

    /* renamed from: z0, reason: collision with root package name */
    public int f18273z0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static boolean a(k kVar, e eVar) {
            return kVar.h(eVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public static void a(k.a aVar, v1 v1Var) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a6 = v1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a6.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f18186b;
            stringId = a6.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e implements k.c {
        public e() {
        }

        @Override // p1.k.c
        public void a() {
            if (u.this.f18219G != null) {
                u.this.f18219G.b();
            }
        }

        @Override // p1.k.c
        public void b() {
            if (u.this.f18219G != null) {
                u.this.f18219G.b();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {

        /* renamed from: e, reason: collision with root package name */
        public static final f f18280e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f18281a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18282b;

        /* renamed from: c, reason: collision with root package name */
        public final long f18283c;

        /* renamed from: d, reason: collision with root package name */
        public final C1110D f18284d = new C1110D();

        public f(long j6, long j7, long j8) {
            this.f18281a = j6;
            this.f18282b = j7;
            this.f18283c = j8;
        }
    }

    public u(int i6, k.b bVar, x xVar, boolean z6, float f6) {
        super(i6);
        this.f18256r = bVar;
        this.f18258s = (x) AbstractC1119a.e(xVar);
        this.f18260t = z6;
        this.f18262u = f6;
        this.f18264v = f1.f.r();
        this.f18266w = new f1.f(0);
        this.f18268x = new f1.f(2);
        C1908i c1908i = new C1908i();
        this.f18270y = c1908i;
        this.f18272z = new MediaCodec.BufferInfo();
        this.f18225J = 1.0f;
        this.f18227K = 1.0f;
        this.f18223I = -9223372036854775807L;
        this.f18207A = new ArrayDeque();
        this.f18230L0 = f.f18280e;
        c1908i.o(0);
        c1908i.f14005d.order(ByteOrder.nativeOrder());
        this.f18209B = new X();
        this.f18236X = -1.0f;
        this.f18240b0 = 0;
        this.f18269x0 = 0;
        this.f18253o0 = -1;
        this.f18254p0 = -1;
        this.f18252n0 = -9223372036854775807L;
        this.f18214D0 = -9223372036854775807L;
        this.f18216E0 = -9223372036854775807L;
        this.f18232M0 = -9223372036854775807L;
        this.f18271y0 = 0;
        this.f18273z0 = 0;
        this.f18228K0 = new C1330f();
    }

    public static boolean A0(String str) {
        return AbstractC1117K.f10560a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean B0(n nVar) {
        String str = nVar.f18194a;
        int i6 = AbstractC1117K.f10560a;
        if (i6 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i6 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(AbstractC1117K.f10562c) && "AFTS".equals(AbstractC1117K.f10563d) && nVar.f18200g;
        }
        return true;
    }

    public static boolean C0(String str) {
        if (AbstractC1117K.f10560a == 19 && AbstractC1117K.f10563d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    public static boolean D0(String str) {
        return AbstractC1117K.f10560a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static boolean X1(Z0.q qVar) {
        int i6 = qVar.f6975K;
        return i6 == 0 || i6 == 2;
    }

    public static boolean n1(IllegalStateException illegalStateException) {
        if (AbstractC1117K.f10560a >= 21 && o1(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean o1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean p1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean x0(String str, Z0.q qVar) {
        return AbstractC1117K.f10560a < 21 && qVar.f6993q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean y0(String str) {
        if (AbstractC1117K.f10560a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(AbstractC1117K.f10562c)) {
            return false;
        }
        String str2 = AbstractC1117K.f10561b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    public static boolean z0(String str) {
        int i6 = AbstractC1117K.f10560a;
        if (i6 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i6 != 19) {
            return false;
        }
        String str2 = AbstractC1117K.f10561b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    public void A1(f1.f fVar) {
    }

    @Override // g1.J0
    public void B(float f6, float f7) {
        this.f18225J = f6;
        this.f18227K = f7;
        Y1(this.f18231M);
    }

    public void B1(Z0.q qVar) {
    }

    public final void C1() {
        int i6 = this.f18273z0;
        if (i6 == 1) {
            M0();
            return;
        }
        if (i6 == 2) {
            M0();
            Z1();
        } else if (i6 == 3) {
            G1();
        } else {
            this.f18220G0 = true;
            I1();
        }
    }

    public abstract boolean D1(long j6, long j7, k kVar, ByteBuffer byteBuffer, int i6, int i7, int i8, long j8, boolean z6, boolean z7, Z0.q qVar);

    public m E0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    public final void E1() {
        this.f18212C0 = true;
        MediaFormat e6 = ((k) AbstractC1119a.e(this.f18229L)).e();
        if (this.f18240b0 != 0 && e6.getInteger("width") == 32 && e6.getInteger("height") == 32) {
            this.f18249k0 = true;
            return;
        }
        if (this.f18247i0) {
            e6.setInteger("channel-count", 1);
        }
        this.f18234V = e6;
        this.f18235W = true;
    }

    public final void F0() {
        this.f18265v0 = false;
        this.f18270y.f();
        this.f18268x.f();
        this.f18263u0 = false;
        this.f18261t0 = false;
        this.f18209B.d();
    }

    public final boolean F1(int i6) {
        C1337i0 Y5 = Y();
        this.f18264v.f();
        int p02 = p0(Y5, this.f18264v, i6 | 4);
        if (p02 == -5) {
            v1(Y5);
            return true;
        }
        if (p02 != -4 || !this.f18264v.i()) {
            return false;
        }
        this.f18218F0 = true;
        C1();
        return false;
    }

    @Override // g1.AbstractC1328e, g1.K0
    public final int G() {
        return 8;
    }

    public final boolean G0() {
        if (this.f18208A0) {
            this.f18271y0 = 1;
            if (this.f18242d0 || this.f18244f0) {
                this.f18273z0 = 3;
                return false;
            }
            this.f18273z0 = 1;
        }
        return true;
    }

    public final void G1() {
        H1();
        q1();
    }

    @Override // g1.AbstractC1328e, g1.H0.b
    public void H(int i6, Object obj) {
        if (i6 == 11) {
            this.f18219G = (J0.a) obj;
        } else {
            super.H(i6, obj);
        }
    }

    public final void H0() {
        if (!this.f18208A0) {
            G1();
        } else {
            this.f18271y0 = 1;
            this.f18273z0 = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H1() {
        try {
            k kVar = this.f18229L;
            if (kVar != null) {
                kVar.release();
                this.f18228K0.f14554b++;
                u1(((n) AbstractC1119a.e(this.f18239a0)).f18194a);
            }
            this.f18229L = null;
            try {
                MediaCrypto mediaCrypto = this.f18221H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f18229L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f18221H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean I0() {
        if (this.f18208A0) {
            this.f18271y0 = 1;
            if (this.f18242d0 || this.f18244f0) {
                this.f18273z0 = 3;
                return false;
            }
            this.f18273z0 = 2;
        } else {
            Z1();
        }
        return true;
    }

    public void I1() {
    }

    public final boolean J0(long j6, long j7) {
        boolean z6;
        boolean D12;
        int i6;
        k kVar = (k) AbstractC1119a.e(this.f18229L);
        if (!f1()) {
            if (this.f18245g0 && this.f18210B0) {
                try {
                    i6 = kVar.i(this.f18272z);
                } catch (IllegalStateException unused) {
                    C1();
                    if (this.f18220G0) {
                        H1();
                    }
                    return false;
                }
            } else {
                i6 = kVar.i(this.f18272z);
            }
            if (i6 < 0) {
                if (i6 == -2) {
                    E1();
                    return true;
                }
                if (this.f18250l0 && (this.f18218F0 || this.f18271y0 == 2)) {
                    C1();
                }
                return false;
            }
            if (this.f18249k0) {
                this.f18249k0 = false;
                kVar.j(i6, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f18272z;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                C1();
                return false;
            }
            this.f18254p0 = i6;
            ByteBuffer o6 = kVar.o(i6);
            this.f18255q0 = o6;
            if (o6 != null) {
                o6.position(this.f18272z.offset);
                ByteBuffer byteBuffer = this.f18255q0;
                MediaCodec.BufferInfo bufferInfo2 = this.f18272z;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f18246h0) {
                MediaCodec.BufferInfo bufferInfo3 = this.f18272z;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0 && this.f18214D0 != -9223372036854775807L) {
                    bufferInfo3.presentationTimeUs = this.f18216E0;
                }
            }
            this.f18257r0 = this.f18272z.presentationTimeUs < a0();
            long j8 = this.f18216E0;
            this.f18259s0 = j8 != -9223372036854775807L && j8 <= this.f18272z.presentationTimeUs;
            a2(this.f18272z.presentationTimeUs);
        }
        if (this.f18245g0 && this.f18210B0) {
            try {
                ByteBuffer byteBuffer2 = this.f18255q0;
                int i7 = this.f18254p0;
                MediaCodec.BufferInfo bufferInfo4 = this.f18272z;
                z6 = false;
                try {
                    D12 = D1(j6, j7, kVar, byteBuffer2, i7, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f18257r0, this.f18259s0, (Z0.q) AbstractC1119a.e(this.f18213D));
                } catch (IllegalStateException unused2) {
                    C1();
                    if (this.f18220G0) {
                        H1();
                    }
                    return z6;
                }
            } catch (IllegalStateException unused3) {
                z6 = false;
            }
        } else {
            z6 = false;
            ByteBuffer byteBuffer3 = this.f18255q0;
            int i8 = this.f18254p0;
            MediaCodec.BufferInfo bufferInfo5 = this.f18272z;
            D12 = D1(j6, j7, kVar, byteBuffer3, i8, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f18257r0, this.f18259s0, (Z0.q) AbstractC1119a.e(this.f18213D));
        }
        if (D12) {
            y1(this.f18272z.presentationTimeUs);
            boolean z7 = (this.f18272z.flags & 4) != 0 ? true : z6;
            M1();
            if (!z7) {
                return true;
            }
            C1();
        }
        return z6;
    }

    public void J1() {
        L1();
        M1();
        this.f18252n0 = -9223372036854775807L;
        this.f18210B0 = false;
        this.f18208A0 = false;
        this.f18248j0 = false;
        this.f18249k0 = false;
        this.f18257r0 = false;
        this.f18259s0 = false;
        this.f18214D0 = -9223372036854775807L;
        this.f18216E0 = -9223372036854775807L;
        this.f18232M0 = -9223372036854775807L;
        this.f18271y0 = 0;
        this.f18273z0 = 0;
        this.f18269x0 = this.f18267w0 ? 1 : 0;
    }

    public final boolean K0(n nVar, Z0.q qVar, InterfaceC1743m interfaceC1743m, InterfaceC1743m interfaceC1743m2) {
        InterfaceC1286b j6;
        InterfaceC1286b j7;
        if (interfaceC1743m == interfaceC1743m2) {
            return false;
        }
        if (interfaceC1743m2 != null && interfaceC1743m != null && (j6 = interfaceC1743m2.j()) != null && (j7 = interfaceC1743m.j()) != null && j6.getClass().equals(j7.getClass())) {
            if (!(j6 instanceof l1.B)) {
                return false;
            }
            if (!interfaceC1743m2.a().equals(interfaceC1743m.a()) || AbstractC1117K.f10560a < 23) {
                return true;
            }
            UUID uuid = AbstractC0835g.f6883e;
            if (!uuid.equals(interfaceC1743m.a()) && !uuid.equals(interfaceC1743m2.a())) {
                return !nVar.f18200g && interfaceC1743m2.h((String) AbstractC1119a.e(qVar.f6990n));
            }
        }
        return true;
    }

    public void K1() {
        J1();
        this.f18226J0 = null;
        this.f18237Y = null;
        this.f18239a0 = null;
        this.f18231M = null;
        this.f18234V = null;
        this.f18235W = false;
        this.f18212C0 = false;
        this.f18236X = -1.0f;
        this.f18240b0 = 0;
        this.f18241c0 = false;
        this.f18242d0 = false;
        this.f18243e0 = false;
        this.f18244f0 = false;
        this.f18245g0 = false;
        this.f18246h0 = false;
        this.f18247i0 = false;
        this.f18250l0 = false;
        this.f18251m0 = false;
        this.f18267w0 = false;
        this.f18269x0 = 0;
    }

    public final boolean L0() {
        int i6;
        if (this.f18229L == null || (i6 = this.f18271y0) == 2 || this.f18218F0) {
            return false;
        }
        if (i6 == 0 && U1()) {
            H0();
        }
        k kVar = (k) AbstractC1119a.e(this.f18229L);
        if (this.f18253o0 < 0) {
            int g6 = kVar.g();
            this.f18253o0 = g6;
            if (g6 < 0) {
                return false;
            }
            this.f18266w.f14005d = kVar.l(g6);
            this.f18266w.f();
        }
        if (this.f18271y0 == 1) {
            if (!this.f18250l0) {
                this.f18210B0 = true;
                kVar.c(this.f18253o0, 0, 0, 0L, 4);
                L1();
            }
            this.f18271y0 = 2;
            return false;
        }
        if (this.f18248j0) {
            this.f18248j0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(this.f18266w.f14005d);
            byte[] bArr = f18206O0;
            byteBuffer.put(bArr);
            kVar.c(this.f18253o0, 0, bArr.length, 0L, 0);
            L1();
            this.f18208A0 = true;
            return true;
        }
        if (this.f18269x0 == 1) {
            for (int i7 = 0; i7 < ((Z0.q) AbstractC1119a.e(this.f18231M)).f6993q.size(); i7++) {
                ((ByteBuffer) AbstractC1119a.e(this.f18266w.f14005d)).put((byte[]) this.f18231M.f6993q.get(i7));
            }
            this.f18269x0 = 2;
        }
        int position = ((ByteBuffer) AbstractC1119a.e(this.f18266w.f14005d)).position();
        C1337i0 Y5 = Y();
        try {
            int p02 = p0(Y5, this.f18266w, 0);
            if (p02 == -3) {
                if (p()) {
                    this.f18216E0 = this.f18214D0;
                }
                return false;
            }
            if (p02 == -5) {
                if (this.f18269x0 == 2) {
                    this.f18266w.f();
                    this.f18269x0 = 1;
                }
                v1(Y5);
                return true;
            }
            if (this.f18266w.i()) {
                this.f18216E0 = this.f18214D0;
                if (this.f18269x0 == 2) {
                    this.f18266w.f();
                    this.f18269x0 = 1;
                }
                this.f18218F0 = true;
                if (!this.f18208A0) {
                    C1();
                    return false;
                }
                try {
                    if (!this.f18250l0) {
                        this.f18210B0 = true;
                        kVar.c(this.f18253o0, 0, 0, 0L, 4);
                        L1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e6) {
                    throw U(e6, this.f18211C, AbstractC1117K.Y(e6.getErrorCode()));
                }
            }
            if (!this.f18208A0 && !this.f18266w.k()) {
                this.f18266w.f();
                if (this.f18269x0 == 2) {
                    this.f18269x0 = 1;
                }
                return true;
            }
            boolean q6 = this.f18266w.q();
            if (q6) {
                this.f18266w.f14004c.b(position);
            }
            if (this.f18241c0 && !q6) {
                d1.d.b((ByteBuffer) AbstractC1119a.e(this.f18266w.f14005d));
                if (((ByteBuffer) AbstractC1119a.e(this.f18266w.f14005d)).position() == 0) {
                    return true;
                }
                this.f18241c0 = false;
            }
            long j6 = this.f18266w.f14007f;
            if (this.f18222H0) {
                if (this.f18207A.isEmpty()) {
                    this.f18230L0.f18284d.a(j6, (Z0.q) AbstractC1119a.e(this.f18211C));
                } else {
                    ((f) this.f18207A.peekLast()).f18284d.a(j6, (Z0.q) AbstractC1119a.e(this.f18211C));
                }
                this.f18222H0 = false;
            }
            this.f18214D0 = Math.max(this.f18214D0, j6);
            if (p() || this.f18266w.l()) {
                this.f18216E0 = this.f18214D0;
            }
            this.f18266w.p();
            if (this.f18266w.h()) {
                e1(this.f18266w);
            }
            A1(this.f18266w);
            int R02 = R0(this.f18266w);
            try {
                if (q6) {
                    ((k) AbstractC1119a.e(kVar)).b(this.f18253o0, 0, this.f18266w.f14004c, j6, R02);
                } else {
                    ((k) AbstractC1119a.e(kVar)).c(this.f18253o0, 0, ((ByteBuffer) AbstractC1119a.e(this.f18266w.f14005d)).limit(), j6, R02);
                }
                L1();
                this.f18208A0 = true;
                this.f18269x0 = 0;
                this.f18228K0.f14555c++;
                return true;
            } catch (MediaCodec.CryptoException e7) {
                throw U(e7, this.f18211C, AbstractC1117K.Y(e7.getErrorCode()));
            }
        } catch (f.a e8) {
            s1(e8);
            F1(0);
            M0();
            return true;
        }
    }

    public final void L1() {
        this.f18253o0 = -1;
        this.f18266w.f14005d = null;
    }

    public final void M0() {
        try {
            ((k) AbstractC1119a.i(this.f18229L)).flush();
        } finally {
            J1();
        }
    }

    public final void M1() {
        this.f18254p0 = -1;
        this.f18255q0 = null;
    }

    public final boolean N0() {
        boolean O02 = O0();
        if (O02) {
            q1();
        }
        return O02;
    }

    public final void N1(InterfaceC1743m interfaceC1743m) {
        InterfaceC1743m.b(this.f18215E, interfaceC1743m);
        this.f18215E = interfaceC1743m;
    }

    public boolean O0() {
        if (this.f18229L == null) {
            return false;
        }
        int i6 = this.f18273z0;
        if (i6 == 3 || this.f18242d0 || ((this.f18243e0 && !this.f18212C0) || (this.f18244f0 && this.f18210B0))) {
            H1();
            return true;
        }
        if (i6 == 2) {
            int i7 = AbstractC1117K.f10560a;
            AbstractC1119a.g(i7 >= 23);
            if (i7 >= 23) {
                try {
                    Z1();
                } catch (C1342l e6) {
                    AbstractC1133o.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e6);
                    H1();
                    return true;
                }
            }
        }
        M0();
        return false;
    }

    public final void O1(f fVar) {
        this.f18230L0 = fVar;
        long j6 = fVar.f18283c;
        if (j6 != -9223372036854775807L) {
            this.f18233N0 = true;
            x1(j6);
        }
    }

    public final List P0(boolean z6) {
        Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f18211C);
        List W02 = W0(this.f18258s, qVar, z6);
        if (!W02.isEmpty() || !z6) {
            return W02;
        }
        List W03 = W0(this.f18258s, qVar, false);
        if (!W03.isEmpty()) {
            AbstractC1133o.h("MediaCodecRenderer", "Drm session requires secure decoder for " + qVar.f6990n + ", but no secure decoder available. Trying to proceed with " + W03 + ".");
        }
        return W03;
    }

    public final void P1() {
        this.f18224I0 = true;
    }

    public final k Q0() {
        return this.f18229L;
    }

    public final void Q1(C1342l c1342l) {
        this.f18226J0 = c1342l;
    }

    public int R0(f1.f fVar) {
        return 0;
    }

    public final void R1(InterfaceC1743m interfaceC1743m) {
        InterfaceC1743m.b(this.f18217F, interfaceC1743m);
        this.f18217F = interfaceC1743m;
    }

    public final n S0() {
        return this.f18239a0;
    }

    public final boolean S1(long j6) {
        return this.f18223I == -9223372036854775807L || W().b() - j6 < this.f18223I;
    }

    public boolean T0() {
        return false;
    }

    public boolean T1(n nVar) {
        return true;
    }

    public abstract float U0(float f6, Z0.q qVar, Z0.q[] qVarArr);

    public boolean U1() {
        return false;
    }

    public final MediaFormat V0() {
        return this.f18234V;
    }

    public boolean V1(Z0.q qVar) {
        return false;
    }

    public abstract List W0(x xVar, Z0.q qVar, boolean z6);

    public abstract int W1(x xVar, Z0.q qVar);

    public long X0(boolean z6, long j6, long j7) {
        return super.r(j6, j7);
    }

    public long Y0() {
        return this.f18216E0;
    }

    public final boolean Y1(Z0.q qVar) {
        if (AbstractC1117K.f10560a >= 23 && this.f18229L != null && this.f18273z0 != 3 && f() != 0) {
            float U02 = U0(this.f18227K, (Z0.q) AbstractC1119a.e(qVar), c0());
            float f6 = this.f18236X;
            if (f6 == U02) {
                return true;
            }
            if (U02 == -1.0f) {
                H0();
                return false;
            }
            if (f6 == -1.0f && U02 <= this.f18262u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", U02);
            ((k) AbstractC1119a.e(this.f18229L)).a(bundle);
            this.f18236X = U02;
        }
        return true;
    }

    public abstract k.a Z0(n nVar, Z0.q qVar, MediaCrypto mediaCrypto, float f6);

    public final void Z1() {
        InterfaceC1286b j6 = ((InterfaceC1743m) AbstractC1119a.e(this.f18217F)).j();
        if (j6 instanceof l1.B) {
            try {
                ((MediaCrypto) AbstractC1119a.e(this.f18221H)).setMediaDrmSession(((l1.B) j6).f16906b);
            } catch (MediaCryptoException e6) {
                throw U(e6, this.f18211C, 6006);
            }
        }
        N1(this.f18217F);
        this.f18271y0 = 0;
        this.f18273z0 = 0;
    }

    public final long a1() {
        return this.f18230L0.f18283c;
    }

    public final void a2(long j6) {
        Z0.q qVar = (Z0.q) this.f18230L0.f18284d.i(j6);
        if (qVar == null && this.f18233N0 && this.f18234V != null) {
            qVar = (Z0.q) this.f18230L0.f18284d.h();
        }
        if (qVar != null) {
            this.f18213D = qVar;
        } else if (!this.f18235W || this.f18213D == null) {
            return;
        }
        w1((Z0.q) AbstractC1119a.e(this.f18213D), this.f18234V);
        this.f18235W = false;
        this.f18233N0 = false;
    }

    @Override // g1.K0
    public final int b(Z0.q qVar) {
        try {
            return W1(this.f18258s, qVar);
        } catch (G.c e6) {
            throw U(e6, qVar, 4002);
        }
    }

    public final long b1() {
        return this.f18230L0.f18282b;
    }

    @Override // g1.J0
    public boolean c() {
        if (this.f18211C == null) {
            return false;
        }
        if (d0() || f1()) {
            return true;
        }
        return this.f18252n0 != -9223372036854775807L && W().b() < this.f18252n0;
    }

    public float c1() {
        return this.f18225J;
    }

    @Override // g1.J0
    public boolean d() {
        return this.f18220G0;
    }

    public final J0.a d1() {
        return this.f18219G;
    }

    @Override // g1.AbstractC1328e
    public void e0() {
        this.f18211C = null;
        O1(f.f18280e);
        this.f18207A.clear();
        O0();
    }

    public abstract void e1(f1.f fVar);

    @Override // g1.AbstractC1328e
    public void f0(boolean z6, boolean z7) {
        this.f18228K0 = new C1330f();
    }

    public final boolean f1() {
        return this.f18254p0 >= 0;
    }

    public final boolean g1() {
        if (!this.f18270y.y()) {
            return true;
        }
        long a02 = a0();
        return m1(a02, this.f18270y.w()) == m1(a02, this.f18268x.f14007f);
    }

    @Override // g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        this.f18218F0 = false;
        this.f18220G0 = false;
        this.f18224I0 = false;
        if (this.f18261t0) {
            this.f18270y.f();
            this.f18268x.f();
            this.f18263u0 = false;
            this.f18209B.d();
        } else {
            N0();
        }
        if (this.f18230L0.f18284d.k() > 0) {
            this.f18222H0 = true;
        }
        this.f18230L0.f18284d.c();
        this.f18207A.clear();
    }

    public final void h1(Z0.q qVar) {
        F0();
        String str = qVar.f6990n;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f18270y.z(32);
        } else {
            this.f18270y.z(1);
        }
        this.f18261t0 = true;
    }

    @Override // g1.J0
    public void i(long j6, long j7) {
        boolean z6 = false;
        if (this.f18224I0) {
            this.f18224I0 = false;
            C1();
        }
        C1342l c1342l = this.f18226J0;
        if (c1342l != null) {
            this.f18226J0 = null;
            throw c1342l;
        }
        try {
            if (this.f18220G0) {
                I1();
                return;
            }
            if (this.f18211C != null || F1(2)) {
                q1();
                if (this.f18261t0) {
                    AbstractC1112F.a("bypassRender");
                    do {
                    } while (u0(j6, j7));
                    AbstractC1112F.b();
                } else if (this.f18229L != null) {
                    long b6 = W().b();
                    AbstractC1112F.a("drainAndFeed");
                    while (J0(j6, j7) && S1(b6)) {
                    }
                    while (L0() && S1(b6)) {
                    }
                    AbstractC1112F.b();
                } else {
                    this.f18228K0.f14556d += r0(j6);
                    F1(1);
                }
                this.f18228K0.c();
            }
        } catch (IllegalStateException e6) {
            if (!n1(e6)) {
                throw e6;
            }
            s1(e6);
            if (AbstractC1117K.f10560a >= 21 && p1(e6)) {
                z6 = true;
            }
            if (z6) {
                H1();
            }
            m E02 = E0(e6, S0());
            throw V(E02, this.f18211C, z6, E02.f18193c == 1101 ? 4006 : 4003);
        }
    }

    public final void i1(n nVar, MediaCrypto mediaCrypto) {
        Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f18211C);
        String str = nVar.f18194a;
        int i6 = AbstractC1117K.f10560a;
        float U02 = i6 < 23 ? -1.0f : U0(this.f18227K, qVar, c0());
        float f6 = U02 > this.f18262u ? U02 : -1.0f;
        B1(qVar);
        long b6 = W().b();
        k.a Z02 = Z0(nVar, qVar, mediaCrypto, f6);
        if (i6 >= 31) {
            c.a(Z02, b0());
        }
        try {
            AbstractC1112F.a("createCodec:" + str);
            k a6 = this.f18256r.a(Z02);
            this.f18229L = a6;
            this.f18251m0 = i6 >= 21 && b.a(a6, new e());
            AbstractC1112F.b();
            long b7 = W().b();
            if (!nVar.m(qVar)) {
                AbstractC1133o.h("MediaCodecRenderer", AbstractC1117K.H("Format exceeds selected codec's capabilities [%s, %s]", Z0.q.g(qVar), str));
            }
            this.f18239a0 = nVar;
            this.f18236X = f6;
            this.f18231M = qVar;
            this.f18240b0 = w0(str);
            this.f18241c0 = x0(str, (Z0.q) AbstractC1119a.e(this.f18231M));
            this.f18242d0 = C0(str);
            this.f18243e0 = D0(str);
            this.f18244f0 = z0(str);
            this.f18245g0 = A0(str);
            this.f18246h0 = y0(str);
            this.f18247i0 = false;
            this.f18250l0 = B0(nVar) || T0();
            if (((k) AbstractC1119a.e(this.f18229L)).d()) {
                this.f18267w0 = true;
                this.f18269x0 = 1;
                this.f18248j0 = this.f18240b0 != 0;
            }
            if (f() == 2) {
                this.f18252n0 = W().b() + 1000;
            }
            this.f18228K0.f14553a++;
            t1(str, Z02, b7, b7 - b6);
        } catch (Throwable th) {
            AbstractC1112F.b();
            throw th;
        }
    }

    public final boolean j1() {
        AbstractC1119a.g(this.f18221H == null);
        InterfaceC1743m interfaceC1743m = this.f18215E;
        InterfaceC1286b j6 = interfaceC1743m.j();
        if (l1.B.f16904d && (j6 instanceof l1.B)) {
            int f6 = interfaceC1743m.f();
            if (f6 == 1) {
                InterfaceC1743m.a aVar = (InterfaceC1743m.a) AbstractC1119a.e(interfaceC1743m.i());
                throw U(aVar, this.f18211C, aVar.f17010a);
            }
            if (f6 != 4) {
                return false;
            }
        }
        if (j6 == null) {
            return interfaceC1743m.i() != null;
        }
        if (j6 instanceof l1.B) {
            l1.B b6 = (l1.B) j6;
            try {
                this.f18221H = new MediaCrypto(b6.f16905a, b6.f16906b);
            } catch (MediaCryptoException e6) {
                throw U(e6, this.f18211C, 6006);
            }
        }
        return true;
    }

    @Override // g1.AbstractC1328e
    public void k0() {
        try {
            F0();
            H1();
        } finally {
            R1(null);
        }
    }

    public final boolean k1() {
        return this.f18261t0;
    }

    @Override // g1.AbstractC1328e
    public void l0() {
    }

    public final boolean l1(Z0.q qVar) {
        return this.f18217F == null && V1(qVar);
    }

    @Override // g1.AbstractC1328e
    public void m0() {
    }

    public final boolean m1(long j6, long j7) {
        if (j7 >= j6) {
            return false;
        }
        Z0.q qVar = this.f18213D;
        return (qVar != null && Objects.equals(qVar.f6990n, "audio/opus") && E1.H.g(j6, j7)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // g1.AbstractC1328e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(Z0.q[] r13, long r14, long r16, w1.InterfaceC2212D.b r18) {
        /*
            r12 = this;
            p1.u$f r13 = r12.f18230L0
            long r0 = r13.f18283c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            p1.u$f r4 = new p1.u$f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.O1(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f18207A
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f18214D0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.f18232M0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            p1.u$f r5 = new p1.u$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.O1(r5)
            p1.u$f r13 = r12.f18230L0
            long r13 = r13.f18283c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.z1()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.f18207A
            p1.u$f r5 = new p1.u$f
            long r6 = r12.f18214D0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.u.n0(Z0.q[], long, long, w1.D$b):void");
    }

    public final void q1() {
        Z0.q qVar;
        if (this.f18229L != null || this.f18261t0 || (qVar = this.f18211C) == null) {
            return;
        }
        if (l1(qVar)) {
            h1(qVar);
            return;
        }
        N1(this.f18217F);
        if (this.f18215E == null || j1()) {
            try {
                InterfaceC1743m interfaceC1743m = this.f18215E;
                r1(this.f18221H, interfaceC1743m != null && interfaceC1743m.h((String) AbstractC1119a.i(qVar.f6990n)));
            } catch (d e6) {
                throw U(e6, qVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.f18221H;
        if (mediaCrypto == null || this.f18229L != null) {
            return;
        }
        mediaCrypto.release();
        this.f18221H = null;
    }

    @Override // g1.J0
    public final long r(long j6, long j7) {
        return X0(this.f18251m0, j6, j7);
    }

    public final void r1(MediaCrypto mediaCrypto, boolean z6) {
        Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f18211C);
        if (this.f18237Y == null) {
            try {
                List P02 = P0(z6);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f18237Y = arrayDeque;
                if (this.f18260t) {
                    arrayDeque.addAll(P02);
                } else if (!P02.isEmpty()) {
                    this.f18237Y.add((n) P02.get(0));
                }
                this.f18238Z = null;
            } catch (G.c e6) {
                throw new d(qVar, e6, z6, -49998);
            }
        }
        if (this.f18237Y.isEmpty()) {
            throw new d(qVar, (Throwable) null, z6, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) AbstractC1119a.e(this.f18237Y);
        while (this.f18229L == null) {
            n nVar = (n) AbstractC1119a.e((n) arrayDeque2.peekFirst());
            if (!T1(nVar)) {
                return;
            }
            try {
                i1(nVar, mediaCrypto);
            } catch (Exception e7) {
                AbstractC1133o.i("MediaCodecRenderer", "Failed to initialize decoder: " + nVar, e7);
                arrayDeque2.removeFirst();
                d dVar = new d(qVar, e7, z6, nVar);
                s1(dVar);
                if (this.f18238Z == null) {
                    this.f18238Z = dVar;
                } else {
                    this.f18238Z = this.f18238Z.c(dVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f18238Z;
                }
            }
        }
        this.f18237Y = null;
    }

    public abstract void s1(Exception exc);

    public final void t0() {
        AbstractC1119a.g(!this.f18218F0);
        C1337i0 Y5 = Y();
        this.f18268x.f();
        do {
            this.f18268x.f();
            int p02 = p0(Y5, this.f18268x, 0);
            if (p02 == -5) {
                v1(Y5);
                return;
            }
            if (p02 == -4) {
                if (!this.f18268x.i()) {
                    this.f18214D0 = Math.max(this.f18214D0, this.f18268x.f14007f);
                    if (p() || this.f18266w.l()) {
                        this.f18216E0 = this.f18214D0;
                    }
                    if (this.f18222H0) {
                        Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f18211C);
                        this.f18213D = qVar;
                        if (Objects.equals(qVar.f6990n, "audio/opus") && !this.f18213D.f6993q.isEmpty()) {
                            this.f18213D = ((Z0.q) AbstractC1119a.e(this.f18213D)).a().V(E1.H.f((byte[]) this.f18213D.f6993q.get(0))).K();
                        }
                        w1(this.f18213D, null);
                        this.f18222H0 = false;
                    }
                    this.f18268x.p();
                    Z0.q qVar2 = this.f18213D;
                    if (qVar2 != null && Objects.equals(qVar2.f6990n, "audio/opus")) {
                        if (this.f18268x.h()) {
                            f1.f fVar = this.f18268x;
                            fVar.f14003b = this.f18213D;
                            e1(fVar);
                        }
                        if (E1.H.g(a0(), this.f18268x.f14007f)) {
                            this.f18209B.a(this.f18268x, ((Z0.q) AbstractC1119a.e(this.f18213D)).f6993q);
                        }
                    }
                    if (!g1()) {
                        break;
                    }
                } else {
                    this.f18218F0 = true;
                    this.f18216E0 = this.f18214D0;
                    return;
                }
            } else {
                if (p02 != -3) {
                    throw new IllegalStateException();
                }
                if (p()) {
                    this.f18216E0 = this.f18214D0;
                    return;
                }
                return;
            }
        } while (this.f18270y.t(this.f18268x));
        this.f18263u0 = true;
    }

    public abstract void t1(String str, k.a aVar, long j6, long j7);

    public final boolean u0(long j6, long j7) {
        boolean z6;
        AbstractC1119a.g(!this.f18220G0);
        if (this.f18270y.y()) {
            C1908i c1908i = this.f18270y;
            z6 = false;
            if (!D1(j6, j7, null, c1908i.f14005d, this.f18254p0, 0, c1908i.x(), this.f18270y.v(), m1(a0(), this.f18270y.w()), this.f18270y.i(), (Z0.q) AbstractC1119a.e(this.f18213D))) {
                return false;
            }
            y1(this.f18270y.w());
            this.f18270y.f();
        } else {
            z6 = false;
        }
        if (this.f18218F0) {
            this.f18220G0 = true;
            return z6;
        }
        if (this.f18263u0) {
            AbstractC1119a.g(this.f18270y.t(this.f18268x));
            this.f18263u0 = z6;
        }
        if (this.f18265v0) {
            if (this.f18270y.y()) {
                return true;
            }
            F0();
            this.f18265v0 = z6;
            q1();
            if (!this.f18261t0) {
                return z6;
            }
        }
        t0();
        if (this.f18270y.y()) {
            this.f18270y.p();
        }
        if (this.f18270y.y() || this.f18218F0 || this.f18265v0) {
            return true;
        }
        return z6;
    }

    public abstract void u1(String str);

    public abstract C1332g v0(n nVar, Z0.q qVar, Z0.q qVar2);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (I0() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        if (I0() == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g1.C1332g v1(g1.C1337i0 r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.u.v1(g1.i0):g1.g");
    }

    public final int w0(String str) {
        int i6 = AbstractC1117K.f10560a;
        if (i6 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = AbstractC1117K.f10563d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i6 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = AbstractC1117K.f10561b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract void w1(Z0.q qVar, MediaFormat mediaFormat);

    public void x1(long j6) {
    }

    public void y1(long j6) {
        this.f18232M0 = j6;
        while (!this.f18207A.isEmpty() && j6 >= ((f) this.f18207A.peek()).f18281a) {
            O1((f) AbstractC1119a.e((f) this.f18207A.poll()));
            z1();
        }
    }

    public void z1() {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f18274a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18275b;

        /* renamed from: c, reason: collision with root package name */
        public final n f18276c;

        /* renamed from: d, reason: collision with root package name */
        public final String f18277d;

        /* renamed from: e, reason: collision with root package name */
        public final d f18278e;

        public d(Z0.q qVar, Throwable th, boolean z6, int i6) {
            this("Decoder init failed: [" + i6 + "], " + qVar, th, qVar.f6990n, z6, null, b(i6), null);
        }

        public static String b(int i6) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i6 < 0 ? "neg_" : "") + Math.abs(i6);
        }

        public static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final d c(d dVar) {
            return new d(getMessage(), getCause(), this.f18274a, this.f18275b, this.f18276c, this.f18277d, dVar);
        }

        public d(Z0.q qVar, Throwable th, boolean z6, n nVar) {
            this("Decoder init failed: " + nVar.f18194a + ", " + qVar, th, qVar.f6990n, z6, nVar, AbstractC1117K.f10560a >= 21 ? d(th) : null, null);
        }

        public d(String str, Throwable th, String str2, boolean z6, n nVar, String str3, d dVar) {
            super(str, th);
            this.f18274a = str2;
            this.f18275b = z6;
            this.f18276c = nVar;
            this.f18277d = str3;
            this.f18278e = dVar;
        }
    }
}
