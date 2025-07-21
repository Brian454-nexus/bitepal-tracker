package androidx.media3.exoplayer.dash;

import E1.O;
import Z0.InterfaceC0837i;
import Z0.q;
import Z0.x;
import Z0.z;
import android.os.Handler;
import android.os.Message;
import c1.AbstractC1117K;
import c1.C1144z;
import g1.C1337i0;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k1.C1659c;
import w1.a0;
import x1.AbstractC2261e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final A1.b f9238a;

    /* renamed from: b, reason: collision with root package name */
    public final b f9239b;

    /* renamed from: f, reason: collision with root package name */
    public C1659c f9243f;

    /* renamed from: g, reason: collision with root package name */
    public long f9244g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9245h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9246i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9247j;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f9242e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f9241d = AbstractC1117K.B(this);

    /* renamed from: c, reason: collision with root package name */
    public final P1.b f9240c = new P1.b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f9248a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9249b;

        public a(long j6, long j7) {
            this.f9248a = j6;
            this.f9249b = j7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a();

        void b(long j6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements O {

        /* renamed from: a, reason: collision with root package name */
        public final a0 f9250a;

        /* renamed from: b, reason: collision with root package name */
        public final C1337i0 f9251b = new C1337i0();

        /* renamed from: c, reason: collision with root package name */
        public final N1.b f9252c = new N1.b();

        /* renamed from: d, reason: collision with root package name */
        public long f9253d = -9223372036854775807L;

        public c(A1.b bVar) {
            this.f9250a = a0.l(bVar);
        }

        @Override // E1.O
        public void b(C1144z c1144z, int i6, int i7) {
            this.f9250a.a(c1144z, i6);
        }

        @Override // E1.O
        public int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7) {
            return this.f9250a.c(interfaceC0837i, i6, z6);
        }

        @Override // E1.O
        public void e(q qVar) {
            this.f9250a.e(qVar);
        }

        @Override // E1.O
        public void f(long j6, int i6, int i7, int i8, O.a aVar) {
            this.f9250a.f(j6, i6, i7, i8, aVar);
            l();
        }

        public final N1.b g() {
            this.f9252c.f();
            if (this.f9250a.S(this.f9251b, this.f9252c, 0, false) != -4) {
                return null;
            }
            this.f9252c.p();
            return this.f9252c;
        }

        public boolean h(long j6) {
            return d.this.j(j6);
        }

        public void i(AbstractC2261e abstractC2261e) {
            long j6 = this.f9253d;
            if (j6 == -9223372036854775807L || abstractC2261e.f20437h > j6) {
                this.f9253d = abstractC2261e.f20437h;
            }
            d.this.m(abstractC2261e);
        }

        public boolean j(AbstractC2261e abstractC2261e) {
            long j6 = this.f9253d;
            return d.this.n(j6 != -9223372036854775807L && j6 < abstractC2261e.f20436g);
        }

        public final void k(long j6, long j7) {
            d.this.f9241d.sendMessage(d.this.f9241d.obtainMessage(1, new a(j6, j7)));
        }

        public final void l() {
            while (this.f9250a.L(false)) {
                N1.b g6 = g();
                if (g6 != null) {
                    long j6 = g6.f14007f;
                    x a6 = d.this.f9240c.a(g6);
                    if (a6 != null) {
                        P1.a aVar = (P1.a) a6.e(0);
                        if (d.h(aVar.f4294a, aVar.f4295b)) {
                            m(j6, aVar);
                        }
                    }
                }
            }
            this.f9250a.s();
        }

        public final void m(long j6, P1.a aVar) {
            long f6 = d.f(aVar);
            if (f6 == -9223372036854775807L) {
                return;
            }
            k(j6, f6);
        }

        public void n() {
            this.f9250a.T();
        }
    }

    public d(C1659c c1659c, b bVar, A1.b bVar2) {
        this.f9243f = c1659c;
        this.f9239b = bVar;
        this.f9238a = bVar2;
    }

    public static long f(P1.a aVar) {
        try {
            return AbstractC1117K.Q0(AbstractC1117K.I(aVar.f4298e));
        } catch (z unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    public final Map.Entry e(long j6) {
        return this.f9242e.ceilingEntry(Long.valueOf(j6));
    }

    public final void g(long j6, long j7) {
        Long l6 = (Long) this.f9242e.get(Long.valueOf(j7));
        if (l6 == null) {
            this.f9242e.put(Long.valueOf(j7), Long.valueOf(j6));
        } else if (l6.longValue() > j6) {
            this.f9242e.put(Long.valueOf(j7), Long.valueOf(j6));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9247j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f9248a, aVar.f9249b);
        return true;
    }

    public final void i() {
        if (this.f9245h) {
            this.f9246i = true;
            this.f9245h = false;
            this.f9239b.a();
        }
    }

    public boolean j(long j6) {
        C1659c c1659c = this.f9243f;
        boolean z6 = false;
        if (!c1659c.f16319d) {
            return false;
        }
        if (this.f9246i) {
            return true;
        }
        Map.Entry e6 = e(c1659c.f16323h);
        if (e6 != null && ((Long) e6.getValue()).longValue() < j6) {
            this.f9244g = ((Long) e6.getKey()).longValue();
            l();
            z6 = true;
        }
        if (z6) {
            i();
        }
        return z6;
    }

    public c k() {
        return new c(this.f9238a);
    }

    public final void l() {
        this.f9239b.b(this.f9244g);
    }

    public void m(AbstractC2261e abstractC2261e) {
        this.f9245h = true;
    }

    public boolean n(boolean z6) {
        if (!this.f9243f.f16319d) {
            return false;
        }
        if (this.f9246i) {
            return true;
        }
        if (!z6) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f9247j = true;
        this.f9241d.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator it = this.f9242e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f9243f.f16323h) {
                it.remove();
            }
        }
    }

    public void q(C1659c c1659c) {
        this.f9246i = false;
        this.f9244g = -9223372036854775807L;
        this.f9243f = c1659c;
        p();
    }
}
