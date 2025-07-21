package h1;

import Z0.AbstractC0835g;
import Z0.C;
import Z0.C0841m;
import Z0.G;
import Z0.J;
import Z0.u;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1138t;
import e1.C1257o;
import e1.C1259q;
import e1.C1260r;
import e1.C1261s;
import e1.C1267y;
import g1.C1330f;
import g1.C1342l;
import h1.InterfaceC1402b;
import h1.u1;
import i1.InterfaceC1507y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import l1.C1738h;
import l1.InterfaceC1743m;
import p1.u;
import w1.C2210B;
import w1.C2239y;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t1 implements InterfaceC1402b, u1.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f15172A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15173a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f15174b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f15175c;

    /* renamed from: i, reason: collision with root package name */
    public String f15181i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f15182j;

    /* renamed from: k, reason: collision with root package name */
    public int f15183k;

    /* renamed from: n, reason: collision with root package name */
    public Z0.A f15186n;

    /* renamed from: o, reason: collision with root package name */
    public b f15187o;

    /* renamed from: p, reason: collision with root package name */
    public b f15188p;

    /* renamed from: q, reason: collision with root package name */
    public b f15189q;

    /* renamed from: r, reason: collision with root package name */
    public Z0.q f15190r;

    /* renamed from: s, reason: collision with root package name */
    public Z0.q f15191s;

    /* renamed from: t, reason: collision with root package name */
    public Z0.q f15192t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15193u;

    /* renamed from: v, reason: collision with root package name */
    public int f15194v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15195w;

    /* renamed from: x, reason: collision with root package name */
    public int f15196x;

    /* renamed from: y, reason: collision with root package name */
    public int f15197y;

    /* renamed from: z, reason: collision with root package name */
    public int f15198z;

    /* renamed from: e, reason: collision with root package name */
    public final G.c f15177e = new G.c();

    /* renamed from: f, reason: collision with root package name */
    public final G.b f15178f = new G.b();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15180h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f15179g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f15176d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f15184l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f15185m = 0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15199a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15200b;

        public a(int i6, int i7) {
            this.f15199a = i6;
            this.f15200b = i7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.q f15201a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15202b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15203c;

        public b(Z0.q qVar, int i6, String str) {
            this.f15201a = qVar;
            this.f15202b = i6;
            this.f15203c = str;
        }
    }

    public t1(Context context, PlaybackSession playbackSession) {
        this.f15173a = context.getApplicationContext();
        this.f15175c = playbackSession;
        C1434r0 c1434r0 = new C1434r0();
        this.f15174b = c1434r0;
        c1434r0.e(this);
    }

    public static a A0(Z0.A a6, Context context, boolean z6) {
        int i6;
        boolean z7;
        if (a6.f6614a == 1001) {
            return new a(20, 0);
        }
        if (a6 instanceof C1342l) {
            C1342l c1342l = (C1342l) a6;
            z7 = c1342l.f14715j == 1;
            i6 = c1342l.f14719n;
        } else {
            i6 = 0;
            z7 = false;
        }
        Throwable th = (Throwable) AbstractC1119a.e(a6.getCause());
        if (!(th instanceof IOException)) {
            if (z7 && (i6 == 0 || i6 == 1)) {
                return new a(35, 0);
            }
            if (z7 && i6 == 3) {
                return new a(15, 0);
            }
            if (z7 && i6 == 2) {
                return new a(23, 0);
            }
            if (th instanceof u.d) {
                return new a(13, AbstractC1117K.Z(((u.d) th).f18277d));
            }
            if (th instanceof p1.m) {
                return new a(14, ((p1.m) th).f18193c);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof InterfaceC1507y.c) {
                return new a(17, ((InterfaceC1507y.c) th).f15985a);
            }
            if (th instanceof InterfaceC1507y.f) {
                return new a(18, ((InterfaceC1507y.f) th).f15990a);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(x0(errorCode), errorCode);
        }
        if (th instanceof C1261s) {
            return new a(5, ((C1261s) th).f13888d);
        }
        if ((th instanceof C1260r) || (th instanceof Z0.z)) {
            return new a(z6 ? 10 : 11, 0);
        }
        boolean z8 = th instanceof C1259q;
        if (z8 || (th instanceof C1267y.a)) {
            if (C1138t.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z8 && ((C1259q) th).f13886c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (a6.f6614a == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof InterfaceC1743m.a)) {
            if (!(th instanceof C1257o.b) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) AbstractC1119a.e(th.getCause())).getCause();
            return (AbstractC1117K.f10560a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) AbstractC1119a.e(th.getCause());
        int i7 = AbstractC1117K.f10560a;
        if (i7 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i7 < 23 || !(th2 instanceof MediaDrmResetException)) ? th2 instanceof NotProvisionedException ? new a(24, 0) : th2 instanceof DeniedByServerException ? new a(29, 0) : th2 instanceof l1.N ? new a(23, 0) : th2 instanceof C1738h.e ? new a(28, 0) : new a(30, 0) : new a(27, 0);
        }
        int Z5 = AbstractC1117K.Z(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(x0(Z5), Z5);
    }

    public static Pair B0(String str) {
        String[] d12 = AbstractC1117K.d1(str, "-");
        return Pair.create(d12[0], d12.length >= 2 ? d12[1] : null);
    }

    public static int D0(Context context) {
        switch (C1138t.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int E0(Z0.u uVar) {
        u.h hVar = uVar.f7064b;
        if (hVar == null) {
            return 0;
        }
        int v02 = AbstractC1117K.v0(hVar.f7156a, hVar.f7157b);
        if (v02 == 0) {
            return 3;
        }
        if (v02 != 1) {
            return v02 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int F0(int i6) {
        if (i6 == 1) {
            return 2;
        }
        if (i6 != 2) {
            return i6 != 3 ? 1 : 4;
        }
        return 3;
    }

    public static t1 v0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a6 = o1.a(context.getSystemService("media_metrics"));
        if (a6 == null) {
            return null;
        }
        createPlaybackSession = a6.createPlaybackSession();
        return new t1(context, createPlaybackSession);
    }

    public static int x0(int i6) {
        switch (AbstractC1117K.Y(i6)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static C0841m y0(z6.w wVar) {
        C0841m c0841m;
        z6.g0 l6 = wVar.l();
        while (l6.hasNext()) {
            J.a aVar = (J.a) l6.next();
            for (int i6 = 0; i6 < aVar.f6813a; i6++) {
                if (aVar.d(i6) && (c0841m = aVar.a(i6).f6994r) != null) {
                    return c0841m;
                }
            }
        }
        return null;
    }

    public static int z0(C0841m c0841m) {
        for (int i6 = 0; i6 < c0841m.f6922d; i6++) {
            UUID uuid = c0841m.f(i6).f6924b;
            if (uuid.equals(AbstractC0835g.f6882d)) {
                return 3;
            }
            if (uuid.equals(AbstractC0835g.f6883e)) {
                return 2;
            }
            if (uuid.equals(AbstractC0835g.f6881c)) {
                return 6;
            }
        }
        return 1;
    }

    @Override // h1.InterfaceC1402b
    public void A(InterfaceC1402b.a aVar, C1330f c1330f) {
        this.f15196x += c1330f.f14559g;
        this.f15197y += c1330f.f14557e;
    }

    public LogSessionId C0() {
        LogSessionId sessionId;
        sessionId = this.f15175c.getSessionId();
        return sessionId;
    }

    @Override // h1.InterfaceC1402b
    public void D(Z0.C c6, InterfaceC1402b.C0203b c0203b) {
        if (c0203b.d() == 0) {
            return;
        }
        G0(c0203b);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        M0(c6, c0203b);
        I0(elapsedRealtime);
        K0(c6, c0203b, elapsedRealtime);
        H0(elapsedRealtime);
        J0(c6, c0203b, elapsedRealtime);
        if (c0203b.a(1028)) {
            this.f15174b.f(c0203b.c(1028));
        }
    }

    public final void G0(InterfaceC1402b.C0203b c0203b) {
        for (int i6 = 0; i6 < c0203b.d(); i6++) {
            int b6 = c0203b.b(i6);
            InterfaceC1402b.a c6 = c0203b.c(b6);
            if (b6 == 0) {
                this.f15174b.g(c6);
            } else if (b6 == 11) {
                this.f15174b.b(c6, this.f15183k);
            } else {
                this.f15174b.c(c6);
            }
        }
    }

    public final void H0(long j6) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int D02 = D0(this.f15173a);
        if (D02 != this.f15185m) {
            this.f15185m = D02;
            PlaybackSession playbackSession = this.f15175c;
            networkType = D0.a().setNetworkType(D02);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j6 - this.f15176d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    @Override // h1.u1.a
    public void I(InterfaceC1402b.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC2212D.b bVar = aVar.f15062d;
        if (bVar == null || !bVar.b()) {
            w0();
            this.f15181i = str;
            playerName = O0.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.4.1");
            this.f15182j = playerVersion;
            O0(aVar.f15060b, aVar.f15062d);
        }
    }

    public final void I0(long j6) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        Z0.A a6 = this.f15186n;
        if (a6 == null) {
            return;
        }
        a A02 = A0(a6, this.f15173a, this.f15194v == 4);
        PlaybackSession playbackSession = this.f15175c;
        timeSinceCreatedMillis = Z0.a().setTimeSinceCreatedMillis(j6 - this.f15176d);
        errorCode = timeSinceCreatedMillis.setErrorCode(A02.f15199a);
        subErrorCode = errorCode.setSubErrorCode(A02.f15200b);
        exception = subErrorCode.setException(a6);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.f15172A = true;
        this.f15186n = null;
    }

    @Override // h1.InterfaceC1402b
    public void J(InterfaceC1402b.a aVar, Z0.A a6) {
        this.f15186n = a6;
    }

    public final void J0(Z0.C c6, InterfaceC1402b.C0203b c0203b, long j6) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (c6.D() != 2) {
            this.f15193u = false;
        }
        if (c6.y() == null) {
            this.f15195w = false;
        } else if (c0203b.a(10)) {
            this.f15195w = true;
        }
        int R02 = R0(c6);
        if (this.f15184l != R02) {
            this.f15184l = R02;
            this.f15172A = true;
            PlaybackSession playbackSession = this.f15175c;
            state = k1.a().setState(this.f15184l);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j6 - this.f15176d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    public final void K0(Z0.C c6, InterfaceC1402b.C0203b c0203b, long j6) {
        if (c0203b.a(2)) {
            Z0.J E6 = c6.E();
            boolean b6 = E6.b(2);
            boolean b7 = E6.b(1);
            boolean b8 = E6.b(3);
            if (b6 || b7 || b8) {
                if (!b6) {
                    P0(j6, null, 0);
                }
                if (!b7) {
                    L0(j6, null, 0);
                }
                if (!b8) {
                    N0(j6, null, 0);
                }
            }
        }
        if (u0(this.f15187o)) {
            b bVar = this.f15187o;
            Z0.q qVar = bVar.f15201a;
            if (qVar.f6997u != -1) {
                P0(j6, qVar, bVar.f15202b);
                this.f15187o = null;
            }
        }
        if (u0(this.f15188p)) {
            b bVar2 = this.f15188p;
            L0(j6, bVar2.f15201a, bVar2.f15202b);
            this.f15188p = null;
        }
        if (u0(this.f15189q)) {
            b bVar3 = this.f15189q;
            N0(j6, bVar3.f15201a, bVar3.f15202b);
            this.f15189q = null;
        }
    }

    @Override // h1.u1.a
    public void L(InterfaceC1402b.a aVar, String str) {
    }

    public final void L0(long j6, Z0.q qVar, int i6) {
        if (AbstractC1117K.c(this.f15191s, qVar)) {
            return;
        }
        if (this.f15191s == null && i6 == 0) {
            i6 = 1;
        }
        this.f15191s = qVar;
        Q0(0, j6, qVar, i6);
    }

    @Override // h1.InterfaceC1402b
    public void M(InterfaceC1402b.a aVar, Z0.N n6) {
        b bVar = this.f15187o;
        if (bVar != null) {
            Z0.q qVar = bVar.f15201a;
            if (qVar.f6997u == -1) {
                this.f15187o = new b(qVar.a().v0(n6.f6824a).Y(n6.f6825b).K(), bVar.f15202b, bVar.f15203c);
            }
        }
    }

    public final void M0(Z0.C c6, InterfaceC1402b.C0203b c0203b) {
        C0841m y02;
        if (c0203b.a(0)) {
            InterfaceC1402b.a c7 = c0203b.c(0);
            if (this.f15182j != null) {
                O0(c7.f15060b, c7.f15062d);
            }
        }
        if (c0203b.a(2) && this.f15182j != null && (y02 = y0(c6.E().a())) != null) {
            L0.a(AbstractC1117K.i(this.f15182j)).setDrmType(z0(y02));
        }
        if (c0203b.a(1011)) {
            this.f15198z++;
        }
    }

    public final void N0(long j6, Z0.q qVar, int i6) {
        if (AbstractC1117K.c(this.f15192t, qVar)) {
            return;
        }
        if (this.f15192t == null && i6 == 0) {
            i6 = 1;
        }
        this.f15192t = qVar;
        Q0(2, j6, qVar, i6);
    }

    public final void O0(Z0.G g6, InterfaceC2212D.b bVar) {
        int b6;
        PlaybackMetrics.Builder builder = this.f15182j;
        if (bVar == null || (b6 = g6.b(bVar.f19753a)) == -1) {
            return;
        }
        g6.f(b6, this.f15178f);
        g6.n(this.f15178f.f6663c, this.f15177e);
        builder.setStreamType(E0(this.f15177e.f6686c));
        G.c cVar = this.f15177e;
        if (cVar.f6696m != -9223372036854775807L && !cVar.f6694k && !cVar.f6692i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f15177e.d());
        }
        builder.setPlaybackType(this.f15177e.f() ? 2 : 1);
        this.f15172A = true;
    }

    public final void P0(long j6, Z0.q qVar, int i6) {
        if (AbstractC1117K.c(this.f15190r, qVar)) {
            return;
        }
        if (this.f15190r == null && i6 == 0) {
            i6 = 1;
        }
        this.f15190r = qVar;
        Q0(1, j6, qVar, i6);
    }

    public final void Q0(int i6, long j6, Z0.q qVar, int i7) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = AbstractC1436s0.a(i6).setTimeSinceCreatedMillis(j6 - this.f15176d);
        if (qVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(F0(i7));
            String str = qVar.f6989m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = qVar.f6990n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = qVar.f6986j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i8 = qVar.f6985i;
            if (i8 != -1) {
                timeSinceCreatedMillis.setBitrate(i8);
            }
            int i9 = qVar.f6996t;
            if (i9 != -1) {
                timeSinceCreatedMillis.setWidth(i9);
            }
            int i10 = qVar.f6997u;
            if (i10 != -1) {
                timeSinceCreatedMillis.setHeight(i10);
            }
            int i11 = qVar.f6966B;
            if (i11 != -1) {
                timeSinceCreatedMillis.setChannelCount(i11);
            }
            int i12 = qVar.f6967C;
            if (i12 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i12);
            }
            String str4 = qVar.f6980d;
            if (str4 != null) {
                Pair B02 = B0(str4);
                timeSinceCreatedMillis.setLanguage((String) B02.first);
                Object obj = B02.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f6 = qVar.f6998v;
            if (f6 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f6);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f15172A = true;
        PlaybackSession playbackSession = this.f15175c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final int R0(Z0.C c6) {
        int D6 = c6.D();
        if (this.f15193u) {
            return 5;
        }
        if (this.f15195w) {
            return 13;
        }
        if (D6 == 4) {
            return 11;
        }
        if (D6 == 2) {
            int i6 = this.f15184l;
            if (i6 == 0 || i6 == 2 || i6 == 12) {
                return 2;
            }
            if (c6.n()) {
                return c6.K() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (D6 == 3) {
            if (c6.n()) {
                return c6.K() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (D6 != 1 || this.f15184l == 0) {
            return this.f15184l;
        }
        return 12;
    }

    @Override // h1.InterfaceC1402b
    public void e0(InterfaceC1402b.a aVar, C.e eVar, C.e eVar2, int i6) {
        if (i6 == 1) {
            this.f15193u = true;
        }
        this.f15183k = i6;
    }

    @Override // h1.u1.a
    public void l(InterfaceC1402b.a aVar, String str, boolean z6) {
        InterfaceC2212D.b bVar = aVar.f15062d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f15181i)) {
            w0();
        }
        this.f15179g.remove(str);
        this.f15180h.remove(str);
    }

    @Override // h1.InterfaceC1402b
    public void l0(InterfaceC1402b.a aVar, C2239y c2239y, C2210B c2210b, IOException iOException, boolean z6) {
        this.f15194v = c2210b.f19745a;
    }

    @Override // h1.u1.a
    public void o(InterfaceC1402b.a aVar, String str, String str2) {
    }

    public final boolean u0(b bVar) {
        return bVar != null && bVar.f15203c.equals(this.f15174b.a());
    }

    @Override // h1.InterfaceC1402b
    public void v(InterfaceC1402b.a aVar, int i6, long j6, long j7) {
        InterfaceC2212D.b bVar = aVar.f15062d;
        if (bVar != null) {
            String d6 = this.f15174b.d(aVar.f15060b, (InterfaceC2212D.b) AbstractC1119a.e(bVar));
            Long l6 = (Long) this.f15180h.get(d6);
            Long l7 = (Long) this.f15179g.get(d6);
            this.f15180h.put(d6, Long.valueOf((l6 == null ? 0L : l6.longValue()) + j6));
            this.f15179g.put(d6, Long.valueOf((l7 != null ? l7.longValue() : 0L) + i6));
        }
    }

    @Override // h1.InterfaceC1402b
    public void w(InterfaceC1402b.a aVar, C2210B c2210b) {
        if (aVar.f15062d == null) {
            return;
        }
        b bVar = new b((Z0.q) AbstractC1119a.e(c2210b.f19747c), c2210b.f19748d, this.f15174b.d(aVar.f15060b, (InterfaceC2212D.b) AbstractC1119a.e(aVar.f15062d)));
        int i6 = c2210b.f19746b;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f15188p = bVar;
                return;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    return;
                }
                this.f15189q = bVar;
                return;
            }
        }
        this.f15187o = bVar;
    }

    public final void w0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f15182j;
        if (builder != null && this.f15172A) {
            builder.setAudioUnderrunCount(this.f15198z);
            this.f15182j.setVideoFramesDropped(this.f15196x);
            this.f15182j.setVideoFramesPlayed(this.f15197y);
            Long l6 = (Long) this.f15179g.get(this.f15181i);
            this.f15182j.setNetworkTransferDurationMillis(l6 == null ? 0L : l6.longValue());
            Long l7 = (Long) this.f15180h.get(this.f15181i);
            this.f15182j.setNetworkBytesRead(l7 == null ? 0L : l7.longValue());
            this.f15182j.setStreamSource((l7 == null || l7.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f15175c;
            build = this.f15182j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f15182j = null;
        this.f15181i = null;
        this.f15198z = 0;
        this.f15196x = 0;
        this.f15197y = 0;
        this.f15190r = null;
        this.f15191s = null;
        this.f15192t = null;
        this.f15172A = false;
    }
}
