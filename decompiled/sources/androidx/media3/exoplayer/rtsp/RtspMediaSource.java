package androidx.media3.exoplayer.rtsp;

import Z0.G;
import Z0.u;
import Z0.v;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.a;
import androidx.media3.exoplayer.rtsp.f;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import java.io.IOException;
import javax.net.SocketFactory;
import l1.w;
import w1.AbstractC2216a;
import w1.AbstractC2237w;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import w1.L;
import w1.e0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class RtspMediaSource extends AbstractC2216a {

    /* renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0138a f9282h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9283i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f9284j;

    /* renamed from: k, reason: collision with root package name */
    public final SocketFactory f9285k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9286l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9288n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9289o;

    /* renamed from: q, reason: collision with root package name */
    public u f9291q;

    /* renamed from: m, reason: collision with root package name */
    public long f9287m = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9290p = true;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Factory implements L {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f9292h = 0;

        /* renamed from: c, reason: collision with root package name */
        public long f9293c = 8000;

        /* renamed from: d, reason: collision with root package name */
        public String f9294d = "AndroidXMedia3/1.4.1";

        /* renamed from: e, reason: collision with root package name */
        public SocketFactory f9295e = SocketFactory.getDefault();

        /* renamed from: f, reason: collision with root package name */
        public boolean f9296f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9297g;

        @Override // w1.InterfaceC2212D.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource d(u uVar) {
            AbstractC1119a.e(uVar.f7064b);
            return new RtspMediaSource(uVar, this.f9296f ? new k(this.f9293c) : new m(this.f9293c), this.f9294d, this.f9295e, this.f9297g);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory e(w wVar) {
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory c(A1.k kVar) {
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements f.d {
        public a() {
        }

        @Override // androidx.media3.exoplayer.rtsp.f.d
        public void a(s1.u uVar) {
            RtspMediaSource.this.f9287m = AbstractC1117K.J0(uVar.a());
            RtspMediaSource.this.f9288n = !uVar.c();
            RtspMediaSource.this.f9289o = uVar.c();
            RtspMediaSource.this.f9290p = false;
            RtspMediaSource.this.K();
        }

        @Override // androidx.media3.exoplayer.rtsp.f.d
        public void b() {
            RtspMediaSource.this.f9288n = false;
            RtspMediaSource.this.K();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC2237w {
        public b(G g6) {
            super(g6);
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            super.g(i6, bVar, z6);
            bVar.f6666f = true;
            return bVar;
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            super.o(i6, cVar, j6);
            cVar.f6694k = true;
            return cVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends IOException {
        public c(String str) {
            super(str);
        }

        public c(Throwable th) {
            super(th);
        }

        public c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends c {
        public d(String str) {
            super(str);
        }
    }

    static {
        v.a("media3.exoplayer.rtsp");
    }

    public RtspMediaSource(u uVar, a.InterfaceC0138a interfaceC0138a, String str, SocketFactory socketFactory, boolean z6) {
        this.f9291q = uVar;
        this.f9282h = interfaceC0138a;
        this.f9283i = str;
        this.f9284j = ((u.h) AbstractC1119a.e(uVar.f7064b)).f7156a;
        this.f9285k = socketFactory;
        this.f9286l = z6;
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        K();
    }

    @Override // w1.AbstractC2216a
    public void E() {
    }

    public final void K() {
        G e0Var = new e0(this.f9287m, this.f9288n, false, this.f9289o, null, g());
        if (this.f9290p) {
            e0Var = new b(e0Var);
        }
        D(e0Var);
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        return new f(bVar2, this.f9282h, this.f9284j, new a(), this.f9283i, this.f9285k, this.f9286l);
    }

    @Override // w1.InterfaceC2212D
    public synchronized u g() {
        return this.f9291q;
    }

    @Override // w1.InterfaceC2212D
    public void l() {
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((f) interfaceC2211C).W();
    }

    @Override // w1.InterfaceC2212D
    public synchronized void s(u uVar) {
        this.f9291q = uVar;
    }
}
