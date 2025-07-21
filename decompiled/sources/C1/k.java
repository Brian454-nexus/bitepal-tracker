package C1;

import C1.B;
import C1.C;
import C1.C0298d;
import C1.n;
import Z0.N;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import c1.AbstractC1112F;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.AbstractC1136r;
import c1.C1107A;
import g1.C1330f;
import g1.C1332g;
import g1.C1337i0;
import g1.C1342l;
import g1.K0;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import p1.G;
import p1.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k extends p1.u implements n.b {

    /* renamed from: w1, reason: collision with root package name */
    public static final int[] f532w1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: x1, reason: collision with root package name */
    public static boolean f533x1;

    /* renamed from: y1, reason: collision with root package name */
    public static boolean f534y1;

    /* renamed from: P0, reason: collision with root package name */
    public final Context f535P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final D f536Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final boolean f537R0;

    /* renamed from: S0, reason: collision with root package name */
    public final B.a f538S0;

    /* renamed from: T0, reason: collision with root package name */
    public final int f539T0;

    /* renamed from: U0, reason: collision with root package name */
    public final boolean f540U0;

    /* renamed from: V0, reason: collision with root package name */
    public final n f541V0;

    /* renamed from: W0, reason: collision with root package name */
    public final n.a f542W0;

    /* renamed from: X0, reason: collision with root package name */
    public c f543X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f544Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f545Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C f546a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f547b1;

    /* renamed from: c1, reason: collision with root package name */
    public List f548c1;

    /* renamed from: d1, reason: collision with root package name */
    public Surface f549d1;

    /* renamed from: e1, reason: collision with root package name */
    public l f550e1;

    /* renamed from: f1, reason: collision with root package name */
    public C1107A f551f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f552g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f553h1;

    /* renamed from: i1, reason: collision with root package name */
    public long f554i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f555j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f556k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f557l1;

    /* renamed from: m1, reason: collision with root package name */
    public long f558m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f559n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f560o1;

    /* renamed from: p1, reason: collision with root package name */
    public N f561p1;

    /* renamed from: q1, reason: collision with root package name */
    public N f562q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f563r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f564s1;

    /* renamed from: t1, reason: collision with root package name */
    public int f565t1;

    /* renamed from: u1, reason: collision with root package name */
    public d f566u1;

    /* renamed from: v1, reason: collision with root package name */
    public m f567v1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements C.a {
        public a() {
        }

        @Override // C1.C.a
        public void a(C c6, N n6) {
        }

        @Override // C1.C.a
        public void b(C c6) {
            AbstractC1119a.i(k.this.f549d1);
            k.this.F2();
        }

        @Override // C1.C.a
        public void c(C c6) {
            k.this.Y2(0, 1);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i6 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i6 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f569a;

        /* renamed from: b, reason: collision with root package name */
        public final int f570b;

        /* renamed from: c, reason: collision with root package name */
        public final int f571c;

        public c(int i6, int i7, int i8) {
            this.f569a = i6;
            this.f570b = i7;
            this.f571c = i8;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d implements k.d, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f572a;

        public d(p1.k kVar) {
            Handler B6 = AbstractC1117K.B(this);
            this.f572a = B6;
            kVar.n(this, B6);
        }

        @Override // p1.k.d
        public void a(p1.k kVar, long j6, long j7) {
            if (AbstractC1117K.f10560a >= 30) {
                b(j6);
            } else {
                this.f572a.sendMessageAtFrontOfQueue(Message.obtain(this.f572a, 0, (int) (j6 >> 32), (int) j6));
            }
        }

        public final void b(long j6) {
            k kVar = k.this;
            if (this != kVar.f566u1 || kVar.Q0() == null) {
                return;
            }
            if (j6 == LongCompanionObject.MAX_VALUE) {
                k.this.H2();
                return;
            }
            try {
                k.this.G2(j6);
            } catch (C1342l e6) {
                k.this.Q1(e6);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(AbstractC1117K.i1(message.arg1, message.arg2));
            return true;
        }
    }

    public k(Context context, k.b bVar, p1.x xVar, long j6, boolean z6, Handler handler, B b6, int i6) {
        this(context, bVar, xVar, j6, z6, handler, b6, i6, 30.0f);
    }

    public static void N2(p1.k kVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        kVar.a(bundle);
    }

    private void X2() {
        p1.k Q02 = Q0();
        if (Q02 != null && AbstractC1117K.f10560a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f563r1));
            Q02.a(bundle);
        }
    }

    public static boolean g2() {
        return AbstractC1117K.f10560a >= 21;
    }

    public static void i2(MediaFormat mediaFormat, int i6) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i6);
    }

    public static boolean j2() {
        return "NVIDIA".equals(AbstractC1117K.f10562c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x073c, code lost:
    
        if (r11.equals("A10-70L") == false) goto L89;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x089a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l2() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.k.l2():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r8.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n2(p1.n r10, Z0.q r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.k.n2(p1.n, Z0.q):int");
    }

    public static Point o2(p1.n nVar, Z0.q qVar) {
        int i6 = qVar.f6997u;
        int i7 = qVar.f6996t;
        boolean z6 = i6 > i7;
        int i8 = z6 ? i6 : i7;
        if (z6) {
            i6 = i7;
        }
        float f6 = i6 / i8;
        for (int i9 : f532w1) {
            int i10 = (int) (i9 * f6);
            if (i9 <= i8 || i10 <= i6) {
                break;
            }
            if (AbstractC1117K.f10560a >= 21) {
                int i11 = z6 ? i10 : i9;
                if (!z6) {
                    i9 = i10;
                }
                Point b6 = nVar.b(i11, i9);
                float f7 = qVar.f6998v;
                if (b6 != null && nVar.u(b6.x, b6.y, f7)) {
                    return b6;
                }
            } else {
                try {
                    int k6 = AbstractC1117K.k(i9, 16) * 16;
                    int k7 = AbstractC1117K.k(i10, 16) * 16;
                    if (k6 * k7 <= G.L()) {
                        int i12 = z6 ? k7 : k6;
                        if (!z6) {
                            k6 = k7;
                        }
                        return new Point(i12, k6);
                    }
                } catch (G.c unused) {
                }
            }
        }
        return null;
    }

    public static List q2(Context context, p1.x xVar, Z0.q qVar, boolean z6, boolean z7) {
        String str = qVar.f6990n;
        if (str == null) {
            return z6.w.w();
        }
        if (AbstractC1117K.f10560a >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            List n6 = G.n(xVar, qVar, z6, z7);
            if (!n6.isEmpty()) {
                return n6;
            }
        }
        return G.v(xVar, qVar, z6, z7);
    }

    public static int r2(p1.n nVar, Z0.q qVar) {
        if (qVar.f6991o == -1) {
            return n2(nVar, qVar);
        }
        int size = qVar.f6993q.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += ((byte[]) qVar.f6993q.get(i7)).length;
        }
        return qVar.f6991o + i6;
    }

    public static int s2(int i6, int i7) {
        return (i6 * 3) / (i7 * 2);
    }

    @Override // p1.u
    public void A1(f1.f fVar) {
        boolean z6 = this.f564s1;
        if (!z6) {
            this.f557l1++;
        }
        if (AbstractC1117K.f10560a >= 23 || !z6) {
            return;
        }
        G2(fVar.f14007f);
    }

    public final void A2() {
        Surface surface = this.f549d1;
        if (surface == null || !this.f552g1) {
            return;
        }
        this.f538S0.q(surface);
    }

    @Override // p1.u, g1.J0
    public void B(float f6, float f7) {
        super.B(f6, f7);
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.q(f6);
        } else {
            this.f541V0.r(f6);
        }
    }

    @Override // p1.u
    public void B1(Z0.q qVar) {
        C c6 = this.f546a1;
        if (c6 == null || c6.isInitialized()) {
            return;
        }
        try {
            this.f546a1.o(qVar);
        } catch (C.b e6) {
            throw U(e6, qVar, 7000);
        }
    }

    public final void B2() {
        N n6 = this.f562q1;
        if (n6 != null) {
            this.f538S0.t(n6);
        }
    }

    @Override // C1.n.b
    public boolean C(long j6, long j7, boolean z6) {
        return S2(j6, j7, z6);
    }

    public final void C2(MediaFormat mediaFormat) {
        C c6 = this.f546a1;
        if (c6 == null || c6.x()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // p1.u
    public boolean D1(long j6, long j7, p1.k kVar, ByteBuffer byteBuffer, int i6, int i7, int i8, long j8, boolean z6, boolean z7, Z0.q qVar) {
        AbstractC1119a.e(kVar);
        long a12 = j8 - a1();
        int c6 = this.f541V0.c(j8, j6, j7, b1(), z7, this.f542W0);
        if (c6 == 4) {
            return false;
        }
        if (z6 && !z7) {
            W2(kVar, i6, a12);
            return true;
        }
        if (this.f549d1 == this.f550e1 && this.f546a1 == null) {
            if (this.f542W0.f() >= 30000) {
                return false;
            }
            W2(kVar, i6, a12);
            Z2(this.f542W0.f());
            return true;
        }
        C c7 = this.f546a1;
        if (c7 != null) {
            try {
                c7.i(j6, j7);
                long s6 = this.f546a1.s(j8 + m2(), z7);
                if (s6 == -9223372036854775807L) {
                    return false;
                }
                L2(kVar, i6, a12, s6);
                return true;
            } catch (C.b e6) {
                throw U(e6, e6.f465a, 7001);
            }
        }
        if (c6 == 0) {
            long c8 = W().c();
            E2(a12, c8, qVar);
            L2(kVar, i6, a12, c8);
            Z2(this.f542W0.f());
            return true;
        }
        if (c6 == 1) {
            return z2((p1.k) AbstractC1119a.i(kVar), i6, a12, qVar);
        }
        if (c6 == 2) {
            k2(kVar, i6, a12);
            Z2(this.f542W0.f());
            return true;
        }
        if (c6 != 3) {
            if (c6 == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(c6));
        }
        W2(kVar, i6, a12);
        Z2(this.f542W0.f());
        return true;
    }

    public final void D2() {
        int i6;
        p1.k Q02;
        if (!this.f564s1 || (i6 = AbstractC1117K.f10560a) < 23 || (Q02 = Q0()) == null) {
            return;
        }
        this.f566u1 = new d(Q02);
        if (i6 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            Q02.a(bundle);
        }
    }

    @Override // p1.u
    public p1.m E0(Throwable th, p1.n nVar) {
        return new j(th, nVar, this.f549d1);
    }

    public final void E2(long j6, long j7, Z0.q qVar) {
        m mVar = this.f567v1;
        if (mVar != null) {
            mVar.g(j6, j7, qVar, V0());
        }
    }

    public final void F2() {
        this.f538S0.q(this.f549d1);
        this.f552g1 = true;
    }

    public void G2(long j6) {
        a2(j6);
        y2(this.f561p1);
        this.f18228K0.f14557e++;
        w2();
        y1(j6);
    }

    @Override // p1.u, g1.AbstractC1328e, g1.H0.b
    public void H(int i6, Object obj) {
        if (i6 == 1) {
            O2(obj);
            return;
        }
        if (i6 == 7) {
            m mVar = (m) AbstractC1119a.e(obj);
            this.f567v1 = mVar;
            C c6 = this.f546a1;
            if (c6 != null) {
                c6.y(mVar);
                return;
            }
            return;
        }
        if (i6 == 10) {
            int intValue = ((Integer) AbstractC1119a.e(obj)).intValue();
            if (this.f565t1 != intValue) {
                this.f565t1 = intValue;
                if (this.f564s1) {
                    H1();
                    return;
                }
                return;
            }
            return;
        }
        if (i6 == 16) {
            this.f563r1 = ((Integer) AbstractC1119a.e(obj)).intValue();
            X2();
            return;
        }
        if (i6 == 4) {
            this.f553h1 = ((Integer) AbstractC1119a.e(obj)).intValue();
            p1.k Q02 = Q0();
            if (Q02 != null) {
                Q02.k(this.f553h1);
                return;
            }
            return;
        }
        if (i6 == 5) {
            this.f541V0.n(((Integer) AbstractC1119a.e(obj)).intValue());
            return;
        }
        if (i6 == 13) {
            Q2((List) AbstractC1119a.e(obj));
            return;
        }
        if (i6 != 14) {
            super.H(i6, obj);
            return;
        }
        C1107A c1107a = (C1107A) AbstractC1119a.e(obj);
        if (c1107a.b() == 0 || c1107a.a() == 0) {
            return;
        }
        this.f551f1 = c1107a;
        C c7 = this.f546a1;
        if (c7 != null) {
            c7.l((Surface) AbstractC1119a.i(this.f549d1), c1107a);
        }
    }

    public final void H2() {
        P1();
    }

    public void I2() {
    }

    @Override // p1.u
    public void J1() {
        super.J1();
        this.f557l1 = 0;
    }

    public final void J2() {
        Surface surface = this.f549d1;
        l lVar = this.f550e1;
        if (surface == lVar) {
            this.f549d1 = null;
        }
        if (lVar != null) {
            lVar.release();
            this.f550e1 = null;
        }
    }

    public void K2(p1.k kVar, int i6, long j6) {
        AbstractC1112F.a("releaseOutputBuffer");
        kVar.j(i6, true);
        AbstractC1112F.b();
        this.f18228K0.f14557e++;
        this.f556k1 = 0;
        if (this.f546a1 == null) {
            y2(this.f561p1);
            w2();
        }
    }

    public final void L2(p1.k kVar, int i6, long j6, long j7) {
        if (AbstractC1117K.f10560a >= 21) {
            M2(kVar, i6, j6, j7);
        } else {
            K2(kVar, i6, j6);
        }
    }

    public void M2(p1.k kVar, int i6, long j6, long j7) {
        AbstractC1112F.a("releaseOutputBuffer");
        kVar.f(i6, j7);
        AbstractC1112F.b();
        this.f18228K0.f14557e++;
        this.f556k1 = 0;
        if (this.f546a1 == null) {
            y2(this.f561p1);
            w2();
        }
    }

    @Override // C1.n.b
    public boolean N(long j6, long j7) {
        return T2(j6, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [C1.k, p1.u, g1.e] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.Surface] */
    public final void O2(Object obj) {
        l lVar = obj instanceof Surface ? (Surface) obj : null;
        if (lVar == null) {
            l lVar2 = this.f550e1;
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                p1.n S02 = S0();
                if (S02 != null && V2(S02)) {
                    lVar = l.d(this.f535P0, S02.f18200g);
                    this.f550e1 = lVar;
                }
            }
        }
        if (this.f549d1 == lVar) {
            if (lVar == null || lVar == this.f550e1) {
                return;
            }
            B2();
            A2();
            return;
        }
        this.f549d1 = lVar;
        if (this.f546a1 == null) {
            this.f541V0.q(lVar);
        }
        this.f552g1 = false;
        int f6 = f();
        p1.k Q02 = Q0();
        if (Q02 != null && this.f546a1 == null) {
            if (AbstractC1117K.f10560a < 23 || lVar == null || this.f544Y0) {
                H1();
                q1();
            } else {
                P2(Q02, lVar);
            }
        }
        if (lVar == null || lVar == this.f550e1) {
            this.f562q1 = null;
            C c6 = this.f546a1;
            if (c6 != null) {
                c6.r();
            }
        } else {
            B2();
            if (f6 == 2) {
                this.f541V0.e(true);
            }
        }
        D2();
    }

    public void P2(p1.k kVar, Surface surface) {
        kVar.m(surface);
    }

    public void Q2(List list) {
        this.f548c1 = list;
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.v(list);
        }
    }

    @Override // p1.u
    public int R0(f1.f fVar) {
        return (AbstractC1117K.f10560a < 34 || !this.f564s1 || fVar.f14007f >= a0()) ? 0 : 32;
    }

    public boolean R2(long j6, long j7, boolean z6) {
        return j6 < -500000 && !z6;
    }

    public boolean S2(long j6, long j7, boolean z6) {
        return j6 < -30000 && !z6;
    }

    @Override // p1.u
    public boolean T0() {
        return this.f564s1 && AbstractC1117K.f10560a < 23;
    }

    @Override // p1.u
    public boolean T1(p1.n nVar) {
        return this.f549d1 != null || V2(nVar);
    }

    public boolean T2(long j6, long j7) {
        return j6 < -30000 && j7 > 100000;
    }

    @Override // p1.u
    public float U0(float f6, Z0.q qVar, Z0.q[] qVarArr) {
        float f7 = -1.0f;
        for (Z0.q qVar2 : qVarArr) {
            float f8 = qVar2.f6998v;
            if (f8 != -1.0f) {
                f7 = Math.max(f7, f8);
            }
        }
        if (f7 == -1.0f) {
            return -1.0f;
        }
        return f7 * f6;
    }

    public boolean U2() {
        return true;
    }

    public final boolean V2(p1.n nVar) {
        if (AbstractC1117K.f10560a < 23 || this.f564s1 || h2(nVar.f18194a)) {
            return false;
        }
        return !nVar.f18200g || l.c(this.f535P0);
    }

    @Override // p1.u
    public List W0(p1.x xVar, Z0.q qVar, boolean z6) {
        return G.w(q2(this.f535P0, xVar, qVar, z6, this.f564s1), qVar);
    }

    @Override // p1.u
    public int W1(p1.x xVar, Z0.q qVar) {
        boolean z6;
        int i6 = 0;
        if (!Z0.y.s(qVar.f6990n)) {
            return K0.E(0);
        }
        boolean z7 = qVar.f6994r != null;
        List q22 = q2(this.f535P0, xVar, qVar, z7, false);
        if (z7 && q22.isEmpty()) {
            q22 = q2(this.f535P0, xVar, qVar, false, false);
        }
        if (q22.isEmpty()) {
            return K0.E(1);
        }
        if (!p1.u.X1(qVar)) {
            return K0.E(2);
        }
        p1.n nVar = (p1.n) q22.get(0);
        boolean m6 = nVar.m(qVar);
        if (!m6) {
            for (int i7 = 1; i7 < q22.size(); i7++) {
                p1.n nVar2 = (p1.n) q22.get(i7);
                if (nVar2.m(qVar)) {
                    z6 = false;
                    m6 = true;
                    nVar = nVar2;
                    break;
                }
            }
        }
        z6 = true;
        int i8 = m6 ? 4 : 3;
        int i9 = nVar.p(qVar) ? 16 : 8;
        int i10 = nVar.f18201h ? 64 : 0;
        int i11 = z6 ? 128 : 0;
        if (AbstractC1117K.f10560a >= 26 && "video/dolby-vision".equals(qVar.f6990n) && !b.a(this.f535P0)) {
            i11 = 256;
        }
        if (m6) {
            List q23 = q2(this.f535P0, xVar, qVar, z7, true);
            if (!q23.isEmpty()) {
                p1.n nVar3 = (p1.n) G.w(q23, qVar).get(0);
                if (nVar3.m(qVar) && nVar3.p(qVar)) {
                    i6 = 32;
                }
            }
        }
        return K0.v(i8, i9, i6, i10, i11);
    }

    public void W2(p1.k kVar, int i6, long j6) {
        AbstractC1112F.a("skipVideoBuffer");
        kVar.j(i6, false);
        AbstractC1112F.b();
        this.f18228K0.f14558f++;
    }

    public void Y2(int i6, int i7) {
        C1330f c1330f = this.f18228K0;
        c1330f.f14560h += i6;
        int i8 = i6 + i7;
        c1330f.f14559g += i8;
        this.f555j1 += i8;
        int i9 = this.f556k1 + i8;
        this.f556k1 = i9;
        c1330f.f14561i = Math.max(i9, c1330f.f14561i);
        int i10 = this.f539T0;
        if (i10 <= 0 || this.f555j1 < i10) {
            return;
        }
        v2();
    }

    @Override // p1.u
    public k.a Z0(p1.n nVar, Z0.q qVar, MediaCrypto mediaCrypto, float f6) {
        l lVar = this.f550e1;
        if (lVar != null && lVar.f576a != nVar.f18200g) {
            J2();
        }
        String str = nVar.f18196c;
        c p22 = p2(nVar, qVar, c0());
        this.f543X0 = p22;
        MediaFormat t22 = t2(qVar, str, p22, f6, this.f540U0, this.f564s1 ? this.f565t1 : 0);
        if (this.f549d1 == null) {
            if (!V2(nVar)) {
                throw new IllegalStateException();
            }
            if (this.f550e1 == null) {
                this.f550e1 = l.d(this.f535P0, nVar.f18200g);
            }
            this.f549d1 = this.f550e1;
        }
        C2(t22);
        C c6 = this.f546a1;
        return k.a.b(nVar, t22, qVar, c6 != null ? c6.j() : this.f549d1, mediaCrypto);
    }

    public void Z2(long j6) {
        this.f18228K0.a(j6);
        this.f558m1 += j6;
        this.f559n1++;
    }

    @Override // p1.u, g1.J0
    public boolean c() {
        l lVar;
        C c6;
        boolean z6 = super.c() && ((c6 = this.f546a1) == null || c6.c());
        if (z6 && (((lVar = this.f550e1) != null && this.f549d1 == lVar) || Q0() == null || this.f564s1)) {
            return true;
        }
        return this.f541V0.d(z6);
    }

    @Override // p1.u, g1.J0
    public boolean d() {
        if (!super.d()) {
            return false;
        }
        C c6 = this.f546a1;
        return c6 == null || c6.d();
    }

    @Override // p1.u, g1.AbstractC1328e
    public void e0() {
        this.f562q1 = null;
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.p();
        } else {
            this.f541V0.g();
        }
        D2();
        this.f552g1 = false;
        this.f566u1 = null;
        try {
            super.e0();
        } finally {
            this.f538S0.m(this.f18228K0);
            this.f538S0.t(N.f6819e);
        }
    }

    @Override // p1.u
    public void e1(f1.f fVar) {
        if (this.f545Z0) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(fVar.f14008g);
            if (byteBuffer.remaining() >= 7) {
                byte b6 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s7 = byteBuffer.getShort();
                byte b7 = byteBuffer.get();
                byte b8 = byteBuffer.get();
                byteBuffer.position(0);
                if (b6 == -75 && s6 == 60 && s7 == 1 && b7 == 4) {
                    if (b8 == 0 || b8 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        N2((p1.k) AbstractC1119a.e(Q0()), bArr);
                    }
                }
            }
        }
    }

    @Override // p1.u, g1.AbstractC1328e
    public void f0(boolean z6, boolean z7) {
        super.f0(z6, z7);
        boolean z8 = X().f14379b;
        AbstractC1119a.g((z8 && this.f565t1 == 0) ? false : true);
        if (this.f564s1 != z8) {
            this.f564s1 = z8;
            H1();
        }
        this.f538S0.o(this.f18228K0);
        if (!this.f547b1) {
            if ((this.f548c1 != null || !this.f537R0) && this.f546a1 == null) {
                D d6 = this.f536Q0;
                if (d6 == null) {
                    d6 = new C0298d.b(this.f535P0, this.f541V0).f(W()).e();
                }
                this.f546a1 = d6.b();
            }
            this.f547b1 = true;
        }
        C c6 = this.f546a1;
        if (c6 == null) {
            this.f541V0.o(W());
            this.f541V0.h(z7);
            return;
        }
        c6.n(new a(), D6.h.a());
        m mVar = this.f567v1;
        if (mVar != null) {
            this.f546a1.y(mVar);
        }
        if (this.f549d1 != null && !this.f551f1.equals(C1107A.f10543c)) {
            this.f546a1.l(this.f549d1, this.f551f1);
        }
        this.f546a1.q(c1());
        List list = this.f548c1;
        if (list != null) {
            this.f546a1.v(list);
        }
        this.f546a1.z(z7);
    }

    @Override // g1.AbstractC1328e
    public void g0() {
        super.g0();
    }

    @Override // g1.J0, g1.K0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // g1.J0
    public void h() {
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.h();
        } else {
            this.f541V0.a();
        }
    }

    @Override // p1.u, g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.t(true);
            this.f546a1.w(a1(), m2());
        }
        super.h0(j6, z6);
        if (this.f546a1 == null) {
            this.f541V0.m();
        }
        if (z6) {
            this.f541V0.e(false);
        }
        D2();
        this.f556k1 = 0;
    }

    public boolean h2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!f533x1) {
                    f534y1 = l2();
                    f533x1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f534y1;
    }

    @Override // p1.u, g1.J0
    public void i(long j6, long j7) {
        super.i(j6, j7);
        C c6 = this.f546a1;
        if (c6 != null) {
            try {
                c6.i(j6, j7);
            } catch (C.b e6) {
                throw U(e6, e6.f465a, 7001);
            }
        }
    }

    @Override // g1.AbstractC1328e
    public void i0() {
        super.i0();
        C c6 = this.f546a1;
        if (c6 == null || !this.f537R0) {
            return;
        }
        c6.release();
    }

    @Override // p1.u, g1.AbstractC1328e
    public void k0() {
        try {
            super.k0();
        } finally {
            this.f547b1 = false;
            if (this.f550e1 != null) {
                J2();
            }
        }
    }

    public void k2(p1.k kVar, int i6, long j6) {
        AbstractC1112F.a("dropVideoBuffer");
        kVar.j(i6, false);
        AbstractC1112F.b();
        Y2(0, 1);
    }

    @Override // p1.u, g1.AbstractC1328e
    public void l0() {
        super.l0();
        this.f555j1 = 0;
        this.f554i1 = W().b();
        this.f558m1 = 0L;
        this.f559n1 = 0;
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.k();
        } else {
            this.f541V0.k();
        }
    }

    @Override // C1.n.b
    public boolean m(long j6, long j7, long j8, boolean z6, boolean z7) {
        return R2(j6, j8, z6) && u2(j7, z7);
    }

    @Override // p1.u, g1.AbstractC1328e
    public void m0() {
        v2();
        x2();
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.u();
        } else {
            this.f541V0.l();
        }
        super.m0();
    }

    public long m2() {
        return 0L;
    }

    public c p2(p1.n nVar, Z0.q qVar, Z0.q[] qVarArr) {
        int n22;
        int i6 = qVar.f6996t;
        int i7 = qVar.f6997u;
        int r22 = r2(nVar, qVar);
        if (qVarArr.length == 1) {
            if (r22 != -1 && (n22 = n2(nVar, qVar)) != -1) {
                r22 = Math.min((int) (r22 * 1.5f), n22);
            }
            return new c(i6, i7, r22);
        }
        int length = qVarArr.length;
        boolean z6 = false;
        for (int i8 = 0; i8 < length; i8++) {
            Z0.q qVar2 = qVarArr[i8];
            if (qVar.f6965A != null && qVar2.f6965A == null) {
                qVar2 = qVar2.a().P(qVar.f6965A).K();
            }
            if (nVar.e(qVar, qVar2).f14569d != 0) {
                int i9 = qVar2.f6996t;
                z6 |= i9 == -1 || qVar2.f6997u == -1;
                i6 = Math.max(i6, i9);
                i7 = Math.max(i7, qVar2.f6997u);
                r22 = Math.max(r22, r2(nVar, qVar2));
            }
        }
        if (z6) {
            AbstractC1133o.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
            Point o22 = o2(nVar, qVar);
            if (o22 != null) {
                i6 = Math.max(i6, o22.x);
                i7 = Math.max(i7, o22.y);
                r22 = Math.max(r22, n2(nVar, qVar.a().v0(i6).Y(i7).K()));
                AbstractC1133o.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + "x" + i7);
            }
        }
        return new c(i6, i7, r22);
    }

    @Override // p1.u
    public void s1(Exception exc) {
        AbstractC1133o.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f538S0.s(exc);
    }

    @Override // p1.u
    public void t1(String str, k.a aVar, long j6, long j7) {
        this.f538S0.k(str, j6, j7);
        this.f544Y0 = h2(str);
        this.f545Z0 = ((p1.n) AbstractC1119a.e(S0())).n();
        D2();
    }

    public MediaFormat t2(Z0.q qVar, String str, c cVar, float f6, boolean z6, int i6) {
        Pair r6;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", qVar.f6996t);
        mediaFormat.setInteger("height", qVar.f6997u);
        AbstractC1136r.e(mediaFormat, qVar.f6993q);
        AbstractC1136r.c(mediaFormat, "frame-rate", qVar.f6998v);
        AbstractC1136r.d(mediaFormat, "rotation-degrees", qVar.f6999w);
        AbstractC1136r.b(mediaFormat, qVar.f6965A);
        if ("video/dolby-vision".equals(qVar.f6990n) && (r6 = G.r(qVar)) != null) {
            AbstractC1136r.d(mediaFormat, "profile", ((Integer) r6.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f569a);
        mediaFormat.setInteger("max-height", cVar.f570b);
        AbstractC1136r.d(mediaFormat, "max-input-size", cVar.f571c);
        int i7 = AbstractC1117K.f10560a;
        if (i7 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (z6) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i6 != 0) {
            i2(mediaFormat, i6);
        }
        if (i7 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f563r1));
        }
        return mediaFormat;
    }

    @Override // p1.u
    public void u1(String str) {
        this.f538S0.l(str);
    }

    public boolean u2(long j6, boolean z6) {
        int r02 = r0(j6);
        if (r02 == 0) {
            return false;
        }
        if (z6) {
            C1330f c1330f = this.f18228K0;
            c1330f.f14556d += r02;
            c1330f.f14558f += this.f557l1;
        } else {
            this.f18228K0.f14562j++;
            Y2(r02, this.f557l1);
        }
        N0();
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.t(false);
        }
        return true;
    }

    @Override // p1.u
    public C1332g v0(p1.n nVar, Z0.q qVar, Z0.q qVar2) {
        C1332g e6 = nVar.e(qVar, qVar2);
        int i6 = e6.f14570e;
        c cVar = (c) AbstractC1119a.e(this.f543X0);
        if (qVar2.f6996t > cVar.f569a || qVar2.f6997u > cVar.f570b) {
            i6 |= 256;
        }
        if (r2(nVar, qVar2) > cVar.f571c) {
            i6 |= 64;
        }
        int i7 = i6;
        return new C1332g(nVar.f18194a, qVar, qVar2, i7 != 0 ? 0 : e6.f14569d, i7);
    }

    @Override // p1.u
    public C1332g v1(C1337i0 c1337i0) {
        C1332g v12 = super.v1(c1337i0);
        this.f538S0.p((Z0.q) AbstractC1119a.e(c1337i0.f14685b), v12);
        return v12;
    }

    public final void v2() {
        if (this.f555j1 > 0) {
            long b6 = W().b();
            this.f538S0.n(this.f555j1, b6 - this.f554i1);
            this.f555j1 = 0;
            this.f554i1 = b6;
        }
    }

    @Override // p1.u
    public void w1(Z0.q qVar, MediaFormat mediaFormat) {
        int integer;
        int i6;
        p1.k Q02 = Q0();
        if (Q02 != null) {
            Q02.k(this.f553h1);
        }
        int i7 = 0;
        if (this.f564s1) {
            i6 = qVar.f6996t;
            integer = qVar.f6997u;
        } else {
            AbstractC1119a.e(mediaFormat);
            boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i6 = integer2;
        }
        float f6 = qVar.f7000x;
        if (g2()) {
            int i8 = qVar.f6999w;
            if (i8 == 90 || i8 == 270) {
                f6 = 1.0f / f6;
                int i9 = integer;
                integer = i6;
                i6 = i9;
            }
        } else if (this.f546a1 == null) {
            i7 = qVar.f6999w;
        }
        this.f561p1 = new N(i6, integer, i7, f6);
        if (this.f546a1 == null) {
            this.f541V0.p(qVar.f6998v);
        } else {
            I2();
            this.f546a1.m(1, qVar.a().v0(i6).Y(integer).n0(i7).k0(f6).K());
        }
    }

    public final void w2() {
        if (!this.f541V0.i() || this.f549d1 == null) {
            return;
        }
        F2();
    }

    public final void x2() {
        int i6 = this.f559n1;
        if (i6 != 0) {
            this.f538S0.r(this.f558m1, i6);
            this.f558m1 = 0L;
            this.f559n1 = 0;
        }
    }

    @Override // p1.u
    public void y1(long j6) {
        super.y1(j6);
        if (this.f564s1) {
            return;
        }
        this.f557l1--;
    }

    public final void y2(N n6) {
        if (n6.equals(N.f6819e) || n6.equals(this.f562q1)) {
            return;
        }
        this.f562q1 = n6;
        this.f538S0.t(n6);
    }

    @Override // p1.u
    public void z1() {
        super.z1();
        C c6 = this.f546a1;
        if (c6 != null) {
            c6.w(a1(), m2());
        } else {
            this.f541V0.j();
        }
        D2();
    }

    public final boolean z2(p1.k kVar, int i6, long j6, Z0.q qVar) {
        long g6 = this.f542W0.g();
        long f6 = this.f542W0.f();
        if (AbstractC1117K.f10560a >= 21) {
            if (U2() && g6 == this.f560o1) {
                W2(kVar, i6, j6);
            } else {
                E2(j6, g6, qVar);
                M2(kVar, i6, j6, g6);
                g6 = g6;
            }
            Z2(f6);
            this.f560o1 = g6;
            return true;
        }
        if (f6 >= 30000) {
            return false;
        }
        if (f6 > 11000) {
            try {
                Thread.sleep((f6 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        E2(j6, g6, qVar);
        K2(kVar, i6, j6);
        Z2(f6);
        return true;
    }

    public k(Context context, k.b bVar, p1.x xVar, long j6, boolean z6, Handler handler, B b6, int i6, float f6) {
        this(context, bVar, xVar, j6, z6, handler, b6, i6, f6, null);
    }

    public k(Context context, k.b bVar, p1.x xVar, long j6, boolean z6, Handler handler, B b6, int i6, float f6, D d6) {
        super(2, bVar, xVar, z6, f6);
        Context applicationContext = context.getApplicationContext();
        this.f535P0 = applicationContext;
        this.f539T0 = i6;
        this.f536Q0 = d6;
        this.f538S0 = new B.a(handler, b6);
        this.f537R0 = d6 == null;
        if (d6 == null) {
            this.f541V0 = new n(applicationContext, this, j6);
        } else {
            this.f541V0 = d6.a();
        }
        this.f542W0 = new n.a();
        this.f540U0 = j2();
        this.f551f1 = C1107A.f10543c;
        this.f553h1 = 1;
        this.f561p1 = N.f6819e;
        this.f565t1 = 0;
        this.f562q1 = null;
        this.f563r1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
    }
}
