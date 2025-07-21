package androidx.media3.exoplayer.smoothstreaming;

import A1.e;
import A1.f;
import A1.k;
import A1.m;
import Y1.h;
import Y1.t;
import Z0.q;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.b;
import b2.C1084h;
import b2.s;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import g1.C1343l0;
import g1.N0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import v1.C2161a;
import w1.C2217b;
import x1.AbstractC2258b;
import x1.AbstractC2261e;
import x1.C2260d;
import x1.C2263g;
import x1.C2266j;
import x1.InterfaceC2262f;
import x1.n;
import z1.AbstractC2442B;
import z1.x;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements androidx.media3.exoplayer.smoothstreaming.b {

    /* renamed from: a, reason: collision with root package name */
    public final m f9454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9455b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2262f[] f9456c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1248f f9457d;

    /* renamed from: e, reason: collision with root package name */
    public x f9458e;

    /* renamed from: f, reason: collision with root package name */
    public C2161a f9459f;

    /* renamed from: g, reason: collision with root package name */
    public int f9460g;

    /* renamed from: h, reason: collision with root package name */
    public IOException f9461h;

    /* renamed from: i, reason: collision with root package name */
    public long f9462i = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.smoothstreaming.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0142a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1248f.a f9463a;

        /* renamed from: b, reason: collision with root package name */
        public s.a f9464b = new C1084h();

        /* renamed from: c, reason: collision with root package name */
        public boolean f9465c;

        public C0142a(InterfaceC1248f.a aVar) {
            this.f9463a = aVar;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public q c(q qVar) {
            String str;
            if (!this.f9465c || !this.f9464b.b(qVar)) {
                return qVar;
            }
            q.b S5 = qVar.a().o0("application/x-media3-cues").S(this.f9464b.d(qVar));
            StringBuilder sb = new StringBuilder();
            sb.append(qVar.f6990n);
            if (qVar.f6986j != null) {
                str = " " + qVar.f6986j;
            } else {
                str = "";
            }
            sb.append(str);
            return S5.O(sb.toString()).s0(LongCompanionObject.MAX_VALUE).K();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public androidx.media3.exoplayer.smoothstreaming.b d(m mVar, C2161a c2161a, int i6, x xVar, InterfaceC1266x interfaceC1266x, e eVar) {
            InterfaceC1248f a6 = this.f9463a.a();
            if (interfaceC1266x != null) {
                a6.l(interfaceC1266x);
            }
            return new a(mVar, c2161a, i6, xVar, a6, eVar, this.f9464b, this.f9465c);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0142a b(boolean z6) {
            this.f9465c = z6;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0142a a(s.a aVar) {
            this.f9464b = aVar;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC2258b {

        /* renamed from: e, reason: collision with root package name */
        public final C2161a.b f9466e;

        /* renamed from: f, reason: collision with root package name */
        public final int f9467f;

        public b(C2161a.b bVar, int i6, int i7) {
            super(i7, bVar.f19317k - 1);
            this.f9466e = bVar;
            this.f9467f = i6;
        }

        @Override // x1.n
        public long a() {
            c();
            return this.f9466e.e((int) d());
        }

        @Override // x1.n
        public long b() {
            return a() + this.f9466e.c((int) d());
        }
    }

    public a(m mVar, C2161a c2161a, int i6, x xVar, InterfaceC1248f interfaceC1248f, e eVar, s.a aVar, boolean z6) {
        this.f9454a = mVar;
        this.f9459f = c2161a;
        this.f9455b = i6;
        this.f9458e = xVar;
        this.f9457d = interfaceC1248f;
        C2161a.b bVar = c2161a.f19301f[i6];
        this.f9456c = new InterfaceC2262f[xVar.length()];
        for (int i7 = 0; i7 < this.f9456c.length; i7++) {
            int k6 = xVar.k(i7);
            q qVar = bVar.f19316j[k6];
            t[] tVarArr = qVar.f6994r != null ? ((C2161a.C0255a) AbstractC1119a.e(c2161a.f19300e)).f19306c : null;
            int i8 = bVar.f19307a;
            this.f9456c[i7] = new C2260d(new h(aVar, !z6 ? 35 : 3, null, new Y1.s(k6, i8, bVar.f19309c, -9223372036854775807L, c2161a.f19302g, qVar, 0, tVarArr, i8 == 2 ? 4 : 0, null, null), w.w(), null), bVar.f19307a, qVar);
        }
    }

    public static x1.m k(q qVar, InterfaceC1248f interfaceC1248f, Uri uri, int i6, long j6, long j7, long j8, int i7, Object obj, InterfaceC2262f interfaceC2262f, f.a aVar) {
        return new C2266j(interfaceC1248f, new C1252j.b().i(uri).a(), qVar, i7, obj, j6, j7, j8, -9223372036854775807L, i6, 1, j6, interfaceC2262f);
    }

    @Override // x1.InterfaceC2265i
    public void a() {
        IOException iOException = this.f9461h;
        if (iOException != null) {
            throw iOException;
        }
        this.f9454a.a();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void b(x xVar) {
        this.f9458e = xVar;
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void c(C2161a c2161a) {
        C2161a.b[] bVarArr = this.f9459f.f19301f;
        int i6 = this.f9455b;
        C2161a.b bVar = bVarArr[i6];
        int i7 = bVar.f19317k;
        C2161a.b bVar2 = c2161a.f19301f[i6];
        if (i7 == 0 || bVar2.f19317k == 0) {
            this.f9460g += i7;
        } else {
            int i8 = i7 - 1;
            long e6 = bVar.e(i8) + bVar.c(i8);
            long e7 = bVar2.e(0);
            if (e6 <= e7) {
                this.f9460g += i7;
            } else {
                this.f9460g += bVar.d(e7);
            }
        }
        this.f9459f = c2161a;
    }

    @Override // x1.InterfaceC2265i
    public final void d(C1343l0 c1343l0, long j6, List list, C2263g c2263g) {
        List list2;
        int g6;
        if (this.f9461h != null) {
            return;
        }
        C2161a.b bVar = this.f9459f.f19301f[this.f9455b];
        if (bVar.f19317k == 0) {
            c2263g.f20440b = !r4.f19299d;
            return;
        }
        if (list.isEmpty()) {
            g6 = bVar.d(j6);
            list2 = list;
        } else {
            list2 = list;
            g6 = (int) (((x1.m) list2.get(list.size() - 1)).g() - this.f9460g);
            if (g6 < 0) {
                this.f9461h = new C2217b();
                return;
            }
        }
        if (g6 >= bVar.f19317k) {
            c2263g.f20440b = !this.f9459f.f19299d;
            return;
        }
        long j7 = c1343l0.f14722a;
        long j8 = j6 - j7;
        long l6 = l(j7);
        int length = this.f9458e.length();
        n[] nVarArr = new n[length];
        for (int i6 = 0; i6 < length; i6++) {
            nVarArr[i6] = new b(bVar, this.f9458e.k(i6), g6);
        }
        this.f9458e.a(j7, j8, l6, list2, nVarArr);
        long e6 = bVar.e(g6);
        long c6 = e6 + bVar.c(g6);
        long j9 = list.isEmpty() ? j6 : -9223372036854775807L;
        int i7 = g6 + this.f9460g;
        int f6 = this.f9458e.f();
        InterfaceC2262f interfaceC2262f = this.f9456c[f6];
        Uri a6 = bVar.a(this.f9458e.k(f6), g6);
        this.f9462i = SystemClock.elapsedRealtime();
        c2263g.f20439a = k(this.f9458e.n(), this.f9457d, a6, i7, e6, c6, j9, this.f9458e.o(), this.f9458e.r(), interfaceC2262f, null);
    }

    @Override // x1.InterfaceC2265i
    public boolean e(long j6, AbstractC2261e abstractC2261e, List list) {
        if (this.f9461h != null) {
            return false;
        }
        return this.f9458e.d(j6, abstractC2261e, list);
    }

    @Override // x1.InterfaceC2265i
    public int f(long j6, List list) {
        return (this.f9461h != null || this.f9458e.length() < 2) ? list.size() : this.f9458e.l(j6, list);
    }

    @Override // x1.InterfaceC2265i
    public long g(long j6, N0 n02) {
        C2161a.b bVar = this.f9459f.f19301f[this.f9455b];
        int d6 = bVar.d(j6);
        long e6 = bVar.e(d6);
        return n02.a(j6, e6, (e6 >= j6 || d6 >= bVar.f19317k + (-1)) ? e6 : bVar.e(d6 + 1));
    }

    @Override // x1.InterfaceC2265i
    public boolean h(AbstractC2261e abstractC2261e, boolean z6, k.c cVar, k kVar) {
        k.b c6 = kVar.c(AbstractC2442B.c(this.f9458e), cVar);
        if (!z6 || c6 == null || c6.f131a != 2) {
            return false;
        }
        x xVar = this.f9458e;
        return xVar.p(xVar.c(abstractC2261e.f20433d), c6.f132b);
    }

    @Override // x1.InterfaceC2265i
    public void i(AbstractC2261e abstractC2261e) {
    }

    public final long l(long j6) {
        C2161a c2161a = this.f9459f;
        if (!c2161a.f19299d) {
            return -9223372036854775807L;
        }
        C2161a.b bVar = c2161a.f19301f[this.f9455b];
        int i6 = bVar.f19317k - 1;
        return (bVar.e(i6) + bVar.c(i6)) - j6;
    }

    @Override // x1.InterfaceC2265i
    public void release() {
        for (InterfaceC2262f interfaceC2262f : this.f9456c) {
            interfaceC2262f.release();
        }
    }
}
