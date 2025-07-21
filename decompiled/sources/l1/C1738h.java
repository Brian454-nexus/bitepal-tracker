package l1;

import Z0.AbstractC0835g;
import Z0.C0841m;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import h1.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l1.C1737g;
import l1.C1738h;
import l1.InterfaceC1730A;
import l1.InterfaceC1743m;
import l1.t;
import l1.u;
import z6.a0;
import z6.g0;

/* renamed from: l1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1738h implements u {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f16958b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1730A.c f16959c;

    /* renamed from: d, reason: collision with root package name */
    public final L f16960d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f16961e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16962f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f16963g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16964h;

    /* renamed from: i, reason: collision with root package name */
    public final g f16965i;

    /* renamed from: j, reason: collision with root package name */
    public final A1.k f16966j;

    /* renamed from: k, reason: collision with root package name */
    public final C0215h f16967k;

    /* renamed from: l, reason: collision with root package name */
    public final long f16968l;

    /* renamed from: m, reason: collision with root package name */
    public final List f16969m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f16970n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f16971o;

    /* renamed from: p, reason: collision with root package name */
    public int f16972p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1730A f16973q;

    /* renamed from: r, reason: collision with root package name */
    public C1737g f16974r;

    /* renamed from: s, reason: collision with root package name */
    public C1737g f16975s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f16976t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f16977u;

    /* renamed from: v, reason: collision with root package name */
    public int f16978v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f16979w;

    /* renamed from: x, reason: collision with root package name */
    public v1 f16980x;

    /* renamed from: y, reason: collision with root package name */
    public volatile d f16981y;

    /* renamed from: l1.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public boolean f16985d;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f16982a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public UUID f16983b = AbstractC0835g.f6882d;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1730A.c f16984c = I.f16910d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f16986e = new int[0];

        /* renamed from: f, reason: collision with root package name */
        public boolean f16987f = true;

        /* renamed from: g, reason: collision with root package name */
        public A1.k f16988g = new A1.j();

        /* renamed from: h, reason: collision with root package name */
        public long f16989h = 300000;

        public C1738h a(L l6) {
            return new C1738h(this.f16983b, this.f16984c, l6, this.f16982a, this.f16985d, this.f16986e, this.f16987f, this.f16988g, this.f16989h);
        }

        public b b(A1.k kVar) {
            this.f16988g = (A1.k) AbstractC1119a.e(kVar);
            return this;
        }

        public b c(boolean z6) {
            this.f16985d = z6;
            return this;
        }

        public b d(boolean z6) {
            this.f16987f = z6;
            return this;
        }

        public b e(int... iArr) {
            for (int i6 : iArr) {
                boolean z6 = true;
                if (i6 != 2 && i6 != 1) {
                    z6 = false;
                }
                AbstractC1119a.a(z6);
            }
            this.f16986e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, InterfaceC1730A.c cVar) {
            this.f16983b = (UUID) AbstractC1119a.e(uuid);
            this.f16984c = (InterfaceC1730A.c) AbstractC1119a.e(cVar);
            return this;
        }
    }

    /* renamed from: l1.h$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements InterfaceC1730A.b {
        public c() {
        }

        @Override // l1.InterfaceC1730A.b
        public void a(InterfaceC1730A interfaceC1730A, byte[] bArr, int i6, int i7, byte[] bArr2) {
            ((d) AbstractC1119a.e(C1738h.this.f16981y)).obtainMessage(i6, bArr).sendToTarget();
        }
    }

    /* renamed from: l1.h$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C1737g c1737g : C1738h.this.f16969m) {
                if (c1737g.v(bArr)) {
                    c1737g.B(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: l1.h$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: l1.h$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements u.b {

        /* renamed from: b, reason: collision with root package name */
        public final t.a f16992b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1743m f16993c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16994d;

        public f(t.a aVar) {
            this.f16992b = aVar;
        }

        public static /* synthetic */ void b(f fVar, Z0.q qVar) {
            if (C1738h.this.f16972p == 0 || fVar.f16994d) {
                return;
            }
            C1738h c1738h = C1738h.this;
            fVar.f16993c = c1738h.t((Looper) AbstractC1119a.e(c1738h.f16976t), fVar.f16992b, qVar, false);
            C1738h.this.f16970n.add(fVar);
        }

        public static /* synthetic */ void c(f fVar) {
            if (fVar.f16994d) {
                return;
            }
            InterfaceC1743m interfaceC1743m = fVar.f16993c;
            if (interfaceC1743m != null) {
                interfaceC1743m.g(fVar.f16992b);
            }
            C1738h.this.f16970n.remove(fVar);
            fVar.f16994d = true;
        }

        public void d(final Z0.q qVar) {
            ((Handler) AbstractC1119a.e(C1738h.this.f16977u)).post(new Runnable() { // from class: l1.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1738h.f.b(C1738h.f.this, qVar);
                }
            });
        }

        @Override // l1.u.b
        public void release() {
            AbstractC1117K.S0((Handler) AbstractC1119a.e(C1738h.this.f16977u), new Runnable() { // from class: l1.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1738h.f.c(C1738h.f.this);
                }
            });
        }
    }

    /* renamed from: l1.h$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g implements C1737g.a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f16996a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public C1737g f16997b;

        public g() {
        }

        @Override // l1.C1737g.a
        public void a(Exception exc, boolean z6) {
            this.f16997b = null;
            z6.w s6 = z6.w.s(this.f16996a);
            this.f16996a.clear();
            g0 l6 = s6.l();
            while (l6.hasNext()) {
                ((C1737g) l6.next()).D(exc, z6);
            }
        }

        @Override // l1.C1737g.a
        public void b() {
            this.f16997b = null;
            z6.w s6 = z6.w.s(this.f16996a);
            this.f16996a.clear();
            g0 l6 = s6.l();
            while (l6.hasNext()) {
                ((C1737g) l6.next()).C();
            }
        }

        @Override // l1.C1737g.a
        public void c(C1737g c1737g) {
            this.f16996a.add(c1737g);
            if (this.f16997b != null) {
                return;
            }
            this.f16997b = c1737g;
            c1737g.H();
        }

        public void d(C1737g c1737g) {
            this.f16996a.remove(c1737g);
            if (this.f16997b == c1737g) {
                this.f16997b = null;
                if (this.f16996a.isEmpty()) {
                    return;
                }
                C1737g c1737g2 = (C1737g) this.f16996a.iterator().next();
                this.f16997b = c1737g2;
                c1737g2.H();
            }
        }
    }

    /* renamed from: l1.h$h, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0215h implements C1737g.b {
        public C0215h() {
        }

        @Override // l1.C1737g.b
        public void a(C1737g c1737g, int i6) {
            if (C1738h.this.f16968l != -9223372036854775807L) {
                C1738h.this.f16971o.remove(c1737g);
                ((Handler) AbstractC1119a.e(C1738h.this.f16977u)).removeCallbacksAndMessages(c1737g);
            }
        }

        @Override // l1.C1737g.b
        public void b(final C1737g c1737g, int i6) {
            if (i6 == 1 && C1738h.this.f16972p > 0 && C1738h.this.f16968l != -9223372036854775807L) {
                C1738h.this.f16971o.add(c1737g);
                ((Handler) AbstractC1119a.e(C1738h.this.f16977u)).postAtTime(new Runnable() { // from class: l1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1737g.this.g(null);
                    }
                }, c1737g, SystemClock.uptimeMillis() + C1738h.this.f16968l);
            } else if (i6 == 0) {
                C1738h.this.f16969m.remove(c1737g);
                if (C1738h.this.f16974r == c1737g) {
                    C1738h.this.f16974r = null;
                }
                if (C1738h.this.f16975s == c1737g) {
                    C1738h.this.f16975s = null;
                }
                C1738h.this.f16965i.d(c1737g);
                if (C1738h.this.f16968l != -9223372036854775807L) {
                    ((Handler) AbstractC1119a.e(C1738h.this.f16977u)).removeCallbacksAndMessages(c1737g);
                    C1738h.this.f16971o.remove(c1737g);
                }
            }
            C1738h.this.C();
        }
    }

    public static boolean u(InterfaceC1743m interfaceC1743m) {
        if (interfaceC1743m.f() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC1743m.a) AbstractC1119a.e(interfaceC1743m.i())).getCause();
        return (cause instanceof ResourceBusyException) || x.c(cause);
    }

    public static List y(C0841m c0841m, UUID uuid, boolean z6) {
        ArrayList arrayList = new ArrayList(c0841m.f6922d);
        for (int i6 = 0; i6 < c0841m.f6922d; i6++) {
            C0841m.b f6 = c0841m.f(i6);
            if ((f6.e(uuid) || (AbstractC0835g.f6881c.equals(uuid) && f6.e(AbstractC0835g.f6880b))) && (f6.f6927e != null || z6)) {
                arrayList.add(f6);
            }
        }
        return arrayList;
    }

    public final InterfaceC1743m A(int i6, boolean z6) {
        InterfaceC1730A interfaceC1730A = (InterfaceC1730A) AbstractC1119a.e(this.f16973q);
        if ((interfaceC1730A.l() == 2 && B.f16904d) || AbstractC1117K.H0(this.f16963g, i6) == -1 || interfaceC1730A.l() == 1) {
            return null;
        }
        C1737g c1737g = this.f16974r;
        if (c1737g == null) {
            C1737g x6 = x(z6.w.w(), true, null, z6);
            this.f16969m.add(x6);
            this.f16974r = x6;
        } else {
            c1737g.c(null);
        }
        return this.f16974r;
    }

    public final void B(Looper looper) {
        if (this.f16981y == null) {
            this.f16981y = new d(looper);
        }
    }

    public final void C() {
        if (this.f16973q != null && this.f16972p == 0 && this.f16969m.isEmpty() && this.f16970n.isEmpty()) {
            ((InterfaceC1730A) AbstractC1119a.e(this.f16973q)).release();
            this.f16973q = null;
        }
    }

    public final void D() {
        g0 l6 = z6.A.s(this.f16971o).l();
        while (l6.hasNext()) {
            ((InterfaceC1743m) l6.next()).g(null);
        }
    }

    public final void E() {
        g0 l6 = z6.A.s(this.f16970n).l();
        while (l6.hasNext()) {
            ((f) l6.next()).release();
        }
    }

    public void F(int i6, byte[] bArr) {
        AbstractC1119a.g(this.f16969m.isEmpty());
        if (i6 == 1 || i6 == 3) {
            AbstractC1119a.e(bArr);
        }
        this.f16978v = i6;
        this.f16979w = bArr;
    }

    public final void G(InterfaceC1743m interfaceC1743m, t.a aVar) {
        interfaceC1743m.g(aVar);
        if (this.f16968l != -9223372036854775807L) {
            interfaceC1743m.g(null);
        }
    }

    public final void H(boolean z6) {
        if (z6 && this.f16976t == null) {
            AbstractC1133o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC1119a.e(this.f16976t)).getThread()) {
            AbstractC1133o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f16976t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // l1.u
    public void a(Looper looper, v1 v1Var) {
        z(looper);
        this.f16980x = v1Var;
    }

    @Override // l1.u
    public InterfaceC1743m b(t.a aVar, Z0.q qVar) {
        H(false);
        AbstractC1119a.g(this.f16972p > 0);
        AbstractC1119a.i(this.f16976t);
        return t(this.f16976t, aVar, qVar, true);
    }

    @Override // l1.u
    public int c(Z0.q qVar) {
        H(false);
        int l6 = ((InterfaceC1730A) AbstractC1119a.e(this.f16973q)).l();
        C0841m c0841m = qVar.f6994r;
        if (c0841m == null) {
            if (AbstractC1117K.H0(this.f16963g, Z0.y.k(qVar.f6990n)) == -1) {
                return 0;
            }
        } else if (!v(c0841m)) {
            return 1;
        }
        return l6;
    }

    @Override // l1.u
    public u.b d(t.a aVar, Z0.q qVar) {
        AbstractC1119a.g(this.f16972p > 0);
        AbstractC1119a.i(this.f16976t);
        f fVar = new f(aVar);
        fVar.d(qVar);
        return fVar;
    }

    @Override // l1.u
    public final void h() {
        H(true);
        int i6 = this.f16972p;
        this.f16972p = i6 + 1;
        if (i6 != 0) {
            return;
        }
        if (this.f16973q == null) {
            InterfaceC1730A a6 = this.f16959c.a(this.f16958b);
            this.f16973q = a6;
            a6.m(new c());
        } else if (this.f16968l != -9223372036854775807L) {
            for (int i7 = 0; i7 < this.f16969m.size(); i7++) {
                ((C1737g) this.f16969m.get(i7)).c(null);
            }
        }
    }

    @Override // l1.u
    public final void release() {
        H(true);
        int i6 = this.f16972p - 1;
        this.f16972p = i6;
        if (i6 != 0) {
            return;
        }
        if (this.f16968l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f16969m);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((C1737g) arrayList.get(i7)).g(null);
            }
        }
        E();
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1743m t(Looper looper, t.a aVar, Z0.q qVar, boolean z6) {
        List list;
        B(looper);
        C0841m c0841m = qVar.f6994r;
        if (c0841m == null) {
            return A(Z0.y.k(qVar.f6990n), z6);
        }
        C1737g c1737g = null;
        Object[] objArr = 0;
        if (this.f16979w == null) {
            list = y((C0841m) AbstractC1119a.e(c0841m), this.f16958b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f16958b);
                AbstractC1133o.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new InterfaceC1743m.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f16962f) {
            Iterator it = this.f16969m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1737g c1737g2 = (C1737g) it.next();
                if (AbstractC1117K.c(c1737g2.f16925a, list)) {
                    c1737g = c1737g2;
                    break;
                }
            }
        } else {
            c1737g = this.f16975s;
        }
        if (c1737g != null) {
            c1737g.c(aVar);
            return c1737g;
        }
        C1737g x6 = x(list, false, aVar, z6);
        if (!this.f16962f) {
            this.f16975s = x6;
        }
        this.f16969m.add(x6);
        return x6;
    }

    public final boolean v(C0841m c0841m) {
        if (this.f16979w != null) {
            return true;
        }
        if (y(c0841m, this.f16958b, true).isEmpty()) {
            if (c0841m.f6922d != 1 || !c0841m.f(0).e(AbstractC0835g.f6880b)) {
                return false;
            }
            AbstractC1133o.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f16958b);
        }
        String str = c0841m.f6921c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? AbstractC1117K.f10560a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final C1737g w(List list, boolean z6, t.a aVar) {
        AbstractC1119a.e(this.f16973q);
        C1737g c1737g = new C1737g(this.f16958b, this.f16973q, this.f16965i, this.f16967k, list, this.f16978v, this.f16964h | z6, z6, this.f16979w, this.f16961e, this.f16960d, (Looper) AbstractC1119a.e(this.f16976t), this.f16966j, (v1) AbstractC1119a.e(this.f16980x));
        c1737g.c(aVar);
        if (this.f16968l != -9223372036854775807L) {
            c1737g.c(null);
        }
        return c1737g;
    }

    public final C1737g x(List list, boolean z6, t.a aVar, boolean z7) {
        C1737g w6 = w(list, z6, aVar);
        if (u(w6) && !this.f16971o.isEmpty()) {
            D();
            G(w6, aVar);
            w6 = w(list, z6, aVar);
        }
        if (!u(w6) || !z7 || this.f16970n.isEmpty()) {
            return w6;
        }
        E();
        if (!this.f16971o.isEmpty()) {
            D();
        }
        G(w6, aVar);
        return w(list, z6, aVar);
    }

    public final synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f16976t;
            if (looper2 == null) {
                this.f16976t = looper;
                this.f16977u = new Handler(looper);
            } else {
                AbstractC1119a.g(looper2 == looper);
                AbstractC1119a.e(this.f16977u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1738h(UUID uuid, InterfaceC1730A.c cVar, L l6, HashMap hashMap, boolean z6, int[] iArr, boolean z7, A1.k kVar, long j6) {
        AbstractC1119a.e(uuid);
        AbstractC1119a.b(!AbstractC0835g.f6880b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f16958b = uuid;
        this.f16959c = cVar;
        this.f16960d = l6;
        this.f16961e = hashMap;
        this.f16962f = z6;
        this.f16963g = iArr;
        this.f16964h = z7;
        this.f16966j = kVar;
        this.f16965i = new g();
        this.f16967k = new C0215h();
        this.f16978v = 0;
        this.f16969m = new ArrayList();
        this.f16970n = a0.h();
        this.f16971o = a0.h();
        this.f16968l = j6;
    }
}
