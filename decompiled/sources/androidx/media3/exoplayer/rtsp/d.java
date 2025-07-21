package androidx.media3.exoplayer.rtsp;

import Z0.z;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.rtsp.d;
import androidx.media3.exoplayer.rtsp.e;
import androidx.media3.exoplayer.rtsp.f;
import androidx.media3.exoplayer.rtsp.g;
import androidx.media3.exoplayer.rtsp.h;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import s1.C2041a;
import s1.C2047g;
import s1.C2050j;
import s1.C2054n;
import s1.q;
import s1.r;
import s1.s;
import s1.t;
import s1.u;
import s1.v;
import s1.x;
import z6.D;
import z6.w;
import z6.y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final f f9316a;

    /* renamed from: b, reason: collision with root package name */
    public final e f9317b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9318c;

    /* renamed from: d, reason: collision with root package name */
    public final SocketFactory f9319d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9320e;

    /* renamed from: i, reason: collision with root package name */
    public Uri f9324i;

    /* renamed from: k, reason: collision with root package name */
    public h.a f9326k;

    /* renamed from: l, reason: collision with root package name */
    public String f9327l;

    /* renamed from: n, reason: collision with root package name */
    public b f9329n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.media3.exoplayer.rtsp.c f9330o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9332q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9333r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9334s;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f9321f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f9322g = new SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final C0139d f9323h = new C0139d();

    /* renamed from: j, reason: collision with root package name */
    public g f9325j = new g(new c());

    /* renamed from: m, reason: collision with root package name */
    public long f9328m = 60000;

    /* renamed from: t, reason: collision with root package name */
    public long f9335t = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public int f9331p = -1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements Runnable, Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f9336a = AbstractC1117K.A();

        /* renamed from: b, reason: collision with root package name */
        public final long f9337b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9338c;

        public b(long j6) {
            this.f9337b = j6;
        }

        public void a() {
            if (this.f9338c) {
                return;
            }
            this.f9338c = true;
            this.f9336a.postDelayed(this, this.f9337b);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9338c = false;
            this.f9336a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f9323h.e(d.this.f9324i, d.this.f9327l);
            this.f9336a.postDelayed(this, this.f9337b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements g.d {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f9340a = AbstractC1117K.A();

        public c() {
        }

        @Override // androidx.media3.exoplayer.rtsp.g.d
        public void c(final List list) {
            this.f9340a.post(new Runnable() { // from class: s1.i
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.e(list);
                }
            });
        }

        public final void e(List list) {
            d.this.N0(list);
            if (h.e(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        public final void f(List list) {
            d.this.f9323h.d(Integer.parseInt((String) AbstractC1119a.e(h.k(list).f18831c.d("CSeq"))));
        }

        public final void g(List list) {
            w w6;
            t l6 = h.l(list);
            int parseInt = Integer.parseInt((String) AbstractC1119a.e(l6.f18834b.d("CSeq")));
            s sVar = (s) d.this.f9322g.get(parseInt);
            if (sVar == null) {
                return;
            }
            d.this.f9322g.remove(parseInt);
            int i6 = sVar.f18830b;
            try {
                try {
                    int i7 = l6.f18833a;
                    if (i7 == 200) {
                        switch (i6) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                h(new C2050j(l6.f18834b, i7, x.b(l6.f18835c)));
                                return;
                            case 4:
                                i(new q(i7, h.j(l6.f18834b.d("Public"))));
                                return;
                            case 5:
                                j();
                                return;
                            case 6:
                                String d6 = l6.f18834b.d("Range");
                                u d7 = d6 == null ? u.f18836c : u.d(d6);
                                try {
                                    String d8 = l6.f18834b.d("RTP-Info");
                                    w6 = d8 == null ? w.w() : v.a(d8, d.this.f9324i);
                                } catch (z unused) {
                                    w6 = w.w();
                                }
                                k(new r(l6.f18833a, d7, w6));
                                return;
                            case 10:
                                String d9 = l6.f18834b.d("Session");
                                String d10 = l6.f18834b.d("Transport");
                                if (d9 == null || d10 == null) {
                                    throw z.c("Missing mandatory session or transport header", null);
                                }
                                l(new i(l6.f18833a, h.m(d9), d10));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i7 == 401) {
                        if (d.this.f9326k == null || d.this.f9333r) {
                            d.this.K0(new RtspMediaSource.c(h.t(i6) + " " + l6.f18833a));
                            return;
                        }
                        w e6 = l6.f18834b.e("WWW-Authenticate");
                        if (e6.isEmpty()) {
                            throw z.c("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i8 = 0; i8 < e6.size(); i8++) {
                            d.this.f9330o = h.o((String) e6.get(i8));
                            if (d.this.f9330o.f9312a == 2) {
                                break;
                            }
                        }
                        d.this.f9323h.b();
                        d.this.f9333r = true;
                        return;
                    }
                    if (i7 == 461) {
                        String str = h.t(i6) + " " + l6.f18833a;
                        d.this.K0((i6 != 10 || ((String) AbstractC1119a.e(sVar.f18831c.d("Transport"))).contains("TCP")) ? new RtspMediaSource.c(str) : new RtspMediaSource.d(str));
                        return;
                    }
                    if (i7 != 301 && i7 != 302) {
                        d.this.K0(new RtspMediaSource.c(h.t(i6) + " " + l6.f18833a));
                        return;
                    }
                    if (d.this.f9331p != -1) {
                        d.this.f9331p = 0;
                    }
                    String d11 = l6.f18834b.d("Location");
                    if (d11 == null) {
                        d.this.f9316a.a("Redirection without new location.", null);
                        return;
                    }
                    Uri parse = Uri.parse(d11);
                    d.this.f9324i = h.p(parse);
                    d.this.f9326k = h.n(parse);
                    d.this.f9323h.c(d.this.f9324i, d.this.f9327l);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    d.this.K0(new RtspMediaSource.c(e));
                }
            } catch (z e8) {
                e = e8;
                d.this.K0(new RtspMediaSource.c(e));
            }
        }

        public final void h(C2050j c2050j) {
            u uVar = u.f18836c;
            String str = (String) c2050j.f18814c.f18843a.get("range");
            if (str != null) {
                try {
                    uVar = u.d(str);
                } catch (z e6) {
                    d.this.f9316a.a("SDP format error.", e6);
                    return;
                }
            }
            w I02 = d.I0(c2050j, d.this.f9324i);
            if (I02.isEmpty()) {
                d.this.f9316a.a("No playable track.", null);
            } else {
                d.this.f9316a.f(uVar, I02);
                d.this.f9332q = true;
            }
        }

        public final void i(q qVar) {
            if (d.this.f9329n != null) {
                return;
            }
            if (d.R0(qVar.f18825b)) {
                d.this.f9323h.c(d.this.f9324i, d.this.f9327l);
            } else {
                d.this.f9316a.a("DESCRIBE not supported.", null);
            }
        }

        public final void j() {
            AbstractC1119a.g(d.this.f9331p == 2);
            d.this.f9331p = 1;
            d.this.f9334s = false;
            if (d.this.f9335t != -9223372036854775807L) {
                d dVar = d.this;
                dVar.V0(AbstractC1117K.k1(dVar.f9335t));
            }
        }

        public final void k(r rVar) {
            boolean z6 = true;
            if (d.this.f9331p != 1 && d.this.f9331p != 2) {
                z6 = false;
            }
            AbstractC1119a.g(z6);
            d.this.f9331p = 2;
            if (d.this.f9329n == null) {
                d dVar = d.this;
                dVar.f9329n = new b(dVar.f9328m / 2);
                d.this.f9329n.a();
            }
            d.this.f9335t = -9223372036854775807L;
            d.this.f9317b.b(AbstractC1117K.J0(rVar.f18827b.f18838a), rVar.f18828c);
        }

        public final void l(i iVar) {
            AbstractC1119a.g(d.this.f9331p != -1);
            d.this.f9331p = 1;
            d.this.f9327l = iVar.f9417b.f9414a;
            d.this.f9328m = iVar.f9417b.f9415b;
            d.this.J0();
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0139d {

        /* renamed from: a, reason: collision with root package name */
        public int f9342a;

        /* renamed from: b, reason: collision with root package name */
        public s f9343b;

        public C0139d() {
        }

        public final s a(int i6, String str, Map map, Uri uri) {
            String str2 = d.this.f9318c;
            int i7 = this.f9342a;
            this.f9342a = i7 + 1;
            e.b bVar = new e.b(str2, str, i7);
            if (d.this.f9330o != null) {
                AbstractC1119a.i(d.this.f9326k);
                try {
                    bVar.b("Authorization", d.this.f9330o.a(d.this.f9326k, uri, i6));
                } catch (z e6) {
                    d.this.K0(new RtspMediaSource.c(e6));
                }
            }
            bVar.d(map);
            return new s(uri, i6, bVar.e(), "");
        }

        public void b() {
            AbstractC1119a.i(this.f9343b);
            z6.x b6 = this.f9343b.f18831c.b();
            HashMap hashMap = new HashMap();
            for (String str : b6.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) D.d(b6.get(str)));
                }
            }
            h(a(this.f9343b.f18830b, d.this.f9327l, hashMap, this.f9343b.f18829a));
        }

        public void c(Uri uri, String str) {
            h(a(2, str, y.j(), uri));
        }

        public void d(int i6) {
            i(new t(405, new e.b(d.this.f9318c, d.this.f9327l, i6).e()));
            this.f9342a = Math.max(this.f9342a, i6 + 1);
        }

        public void e(Uri uri, String str) {
            h(a(4, str, y.j(), uri));
        }

        public void f(Uri uri, String str) {
            AbstractC1119a.g(d.this.f9331p == 2);
            h(a(5, str, y.j(), uri));
            d.this.f9334s = true;
        }

        public void g(Uri uri, long j6, String str) {
            boolean z6 = true;
            if (d.this.f9331p != 1 && d.this.f9331p != 2) {
                z6 = false;
            }
            AbstractC1119a.g(z6);
            h(a(6, str, y.k("Range", u.b(j6)), uri));
        }

        public final void h(s sVar) {
            int parseInt = Integer.parseInt((String) AbstractC1119a.e(sVar.f18831c.d("CSeq")));
            AbstractC1119a.g(d.this.f9322g.get(parseInt) == null);
            d.this.f9322g.append(parseInt, sVar);
            List q6 = h.q(sVar);
            d.this.N0(q6);
            d.this.f9325j.R(q6);
            this.f9343b = sVar;
        }

        public final void i(t tVar) {
            List r6 = h.r(tVar);
            d.this.N0(r6);
            d.this.f9325j.R(r6);
        }

        public void j(Uri uri, String str, String str2) {
            d.this.f9331p = 0;
            h(a(10, str2, y.k("Transport", str), uri));
        }

        public void k(Uri uri, String str) {
            if (d.this.f9331p == -1 || d.this.f9331p == 0) {
                return;
            }
            d.this.f9331p = 0;
            h(a(12, str, y.j(), uri));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        void b(long j6, w wVar);

        void d();

        void e(RtspMediaSource.c cVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        void a(String str, Throwable th);

        void f(u uVar, w wVar);
    }

    public d(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z6) {
        this.f9316a = fVar;
        this.f9317b = eVar;
        this.f9318c = str;
        this.f9319d = socketFactory;
        this.f9320e = z6;
        this.f9324i = h.p(uri);
        this.f9326k = h.n(uri);
    }

    public static w I0(C2050j c2050j, Uri uri) {
        w.a aVar = new w.a();
        for (int i6 = 0; i6 < c2050j.f18814c.f18844b.size(); i6++) {
            C2041a c2041a = (C2041a) c2050j.f18814c.f18844b.get(i6);
            if (C2047g.c(c2041a)) {
                aVar.h(new C2054n(c2050j.f18812a, c2041a, uri));
            }
        }
        return aVar.k();
    }

    public static boolean R0(List list) {
        return list.isEmpty() || list.contains(2);
    }

    public final void J0() {
        f.e eVar = (f.e) this.f9321f.pollFirst();
        if (eVar == null) {
            this.f9317b.d();
        } else {
            this.f9323h.j(eVar.c(), eVar.d(), this.f9327l);
        }
    }

    public final void K0(Throwable th) {
        RtspMediaSource.c cVar = th instanceof RtspMediaSource.c ? (RtspMediaSource.c) th : new RtspMediaSource.c(th);
        if (this.f9332q) {
            this.f9317b.e(cVar);
        } else {
            this.f9316a.a(y6.t.e(th.getMessage()), th);
        }
    }

    public final Socket L0(Uri uri) {
        AbstractC1119a.a(uri.getHost() != null);
        return this.f9319d.createSocket((String) AbstractC1119a.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    public int M0() {
        return this.f9331p;
    }

    public final void N0(List list) {
        if (this.f9320e) {
            AbstractC1133o.b("RtspClient", y6.h.g("\n").d(list));
        }
    }

    public void O0(int i6, g.b bVar) {
        this.f9325j.P(i6, bVar);
    }

    public void P0() {
        try {
            close();
            g gVar = new g(new c());
            this.f9325j = gVar;
            gVar.I(L0(this.f9324i));
            this.f9327l = null;
            this.f9333r = false;
            this.f9330o = null;
        } catch (IOException e6) {
            this.f9317b.e(new RtspMediaSource.c(e6));
        }
    }

    public void Q0(long j6) {
        if (this.f9331p == 2 && !this.f9334s) {
            this.f9323h.f(this.f9324i, (String) AbstractC1119a.e(this.f9327l));
        }
        this.f9335t = j6;
    }

    public void S0(List list) {
        this.f9321f.addAll(list);
        J0();
    }

    public void T0() {
        this.f9331p = 1;
    }

    public void U0() {
        try {
            this.f9325j.I(L0(this.f9324i));
            this.f9323h.e(this.f9324i, this.f9327l);
        } catch (IOException e6) {
            AbstractC1117K.m(this.f9325j);
            throw e6;
        }
    }

    public void V0(long j6) {
        this.f9323h.g(this.f9324i, j6, (String) AbstractC1119a.e(this.f9327l));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f9329n;
        if (bVar != null) {
            bVar.close();
            this.f9329n = null;
            this.f9323h.k(this.f9324i, (String) AbstractC1119a.e(this.f9327l));
        }
        this.f9325j.close();
    }
}
