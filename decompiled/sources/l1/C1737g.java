package l1;

import A1.k;
import Z0.AbstractC0835g;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1126h;
import c1.InterfaceC1125g;
import f1.InterfaceC1286b;
import h1.v1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.LongCompanionObject;
import l1.InterfaceC1730A;
import l1.InterfaceC1743m;
import l1.t;
import w1.C2210B;
import w1.C2239y;

/* renamed from: l1.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1737g implements InterfaceC1743m {

    /* renamed from: a, reason: collision with root package name */
    public final List f16925a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1730A f16926b;

    /* renamed from: c, reason: collision with root package name */
    public final a f16927c;

    /* renamed from: d, reason: collision with root package name */
    public final b f16928d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16929e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16930f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16931g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f16932h;

    /* renamed from: i, reason: collision with root package name */
    public final C1126h f16933i;

    /* renamed from: j, reason: collision with root package name */
    public final A1.k f16934j;

    /* renamed from: k, reason: collision with root package name */
    public final v1 f16935k;

    /* renamed from: l, reason: collision with root package name */
    public final L f16936l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f16937m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f16938n;

    /* renamed from: o, reason: collision with root package name */
    public final e f16939o;

    /* renamed from: p, reason: collision with root package name */
    public int f16940p;

    /* renamed from: q, reason: collision with root package name */
    public int f16941q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f16942r;

    /* renamed from: s, reason: collision with root package name */
    public c f16943s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1286b f16944t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1743m.a f16945u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f16946v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f16947w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1730A.a f16948x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1730A.d f16949y;

    /* renamed from: l1.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(Exception exc, boolean z6);

        void b();

        void c(C1737g c1737g);
    }

    /* renamed from: l1.g$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(C1737g c1737g, int i6);

        void b(C1737g c1737g, int i6);
    }

    /* renamed from: l1.g$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16950a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, M m6) {
            d dVar = (d) message.obj;
            if (!dVar.f16953b) {
                return false;
            }
            int i6 = dVar.f16956e + 1;
            dVar.f16956e = i6;
            if (i6 > C1737g.this.f16934j.d(3)) {
                return false;
            }
            long a6 = C1737g.this.f16934j.a(new k.c(new C2239y(dVar.f16952a, m6.f16918a, m6.f16919b, m6.f16920c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f16954c, m6.f16921d), new C2210B(3), m6.getCause() instanceof IOException ? (IOException) m6.getCause() : new f(m6.getCause()), dVar.f16956e));
            if (a6 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f16950a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a6);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i6, Object obj, boolean z6) {
            obtainMessage(i6, new d(C2239y.a(), z6, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f16950a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i6 = message.what;
                if (i6 == 1) {
                    th = C1737g.this.f16936l.a(C1737g.this.f16937m, (InterfaceC1730A.d) dVar.f16955d);
                } else {
                    if (i6 != 2) {
                        throw new RuntimeException();
                    }
                    th = C1737g.this.f16936l.b(C1737g.this.f16937m, (InterfaceC1730A.a) dVar.f16955d);
                }
            } catch (M e6) {
                boolean a6 = a(message, e6);
                th = e6;
                if (a6) {
                    return;
                }
            } catch (Exception e7) {
                AbstractC1133o.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e7);
                th = e7;
            }
            C1737g.this.f16934j.b(dVar.f16952a);
            synchronized (this) {
                try {
                    if (!this.f16950a) {
                        C1737g.this.f16939o.obtainMessage(message.what, Pair.create(dVar.f16955d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: l1.g$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f16952a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16953b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16954c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f16955d;

        /* renamed from: e, reason: collision with root package name */
        public int f16956e;

        public d(long j6, boolean z6, long j7, Object obj) {
            this.f16952a = j6;
            this.f16953b = z6;
            this.f16954c = j7;
            this.f16955d = obj;
        }
    }

    /* renamed from: l1.g$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i6 = message.what;
            if (i6 == 1) {
                C1737g.this.E(obj, obj2);
            } else {
                if (i6 != 2) {
                    return;
                }
                C1737g.this.y(obj, obj2);
            }
        }
    }

    /* renamed from: l1.g$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C1737g(UUID uuid, InterfaceC1730A interfaceC1730A, a aVar, b bVar, List list, int i6, boolean z6, boolean z7, byte[] bArr, HashMap hashMap, L l6, Looper looper, A1.k kVar, v1 v1Var) {
        if (i6 == 1 || i6 == 3) {
            AbstractC1119a.e(bArr);
        }
        this.f16937m = uuid;
        this.f16927c = aVar;
        this.f16928d = bVar;
        this.f16926b = interfaceC1730A;
        this.f16929e = i6;
        this.f16930f = z6;
        this.f16931g = z7;
        if (bArr != null) {
            this.f16947w = bArr;
            this.f16925a = null;
        } else {
            this.f16925a = Collections.unmodifiableList((List) AbstractC1119a.e(list));
        }
        this.f16932h = hashMap;
        this.f16936l = l6;
        this.f16933i = new C1126h();
        this.f16934j = kVar;
        this.f16935k = v1Var;
        this.f16940p = 2;
        this.f16938n = looper;
        this.f16939o = new e(looper);
    }

    public final void A() {
        if (this.f16929e == 0 && this.f16940p == 4) {
            AbstractC1117K.i(this.f16946v);
            t(false);
        }
    }

    public void B(int i6) {
        if (i6 != 2) {
            return;
        }
        A();
    }

    public void C() {
        if (F()) {
            t(true);
        }
    }

    public void D(Exception exc, boolean z6) {
        x(exc, z6 ? 1 : 3);
    }

    public final void E(Object obj, Object obj2) {
        if (obj == this.f16949y) {
            if (this.f16940p == 2 || w()) {
                this.f16949y = null;
                if (obj2 instanceof Exception) {
                    this.f16927c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f16926b.j((byte[]) obj2);
                    this.f16927c.b();
                } catch (Exception e6) {
                    this.f16927c.a(e6, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F() {
        /*
            r4 = this;
            boolean r0 = r4.w()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            l1.A r0 = r4.f16926b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.d()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f16946v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            l1.A r2 = r4.f16926b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            h1.v1 r3 = r4.f16935k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.e(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            l1.A r0 = r4.f16926b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f16946v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            f1.b r0 = r0.c(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f16944t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f16940p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            l1.b r2 = new l1.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.s(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f16946v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            c1.AbstractC1119a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = l1.x.b(r0)
            if (r2 == 0) goto L41
            l1.g$a r0 = r4.f16927c
            r0.c(r4)
            goto L4a
        L41:
            r4.x(r0, r1)
            goto L4a
        L45:
            l1.g$a r0 = r4.f16927c
            r0.c(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C1737g.F():boolean");
    }

    public final void G(byte[] bArr, int i6, boolean z6) {
        try {
            this.f16948x = this.f16926b.k(bArr, this.f16925a, i6, this.f16932h);
            ((c) AbstractC1117K.i(this.f16943s)).b(2, AbstractC1119a.e(this.f16948x), z6);
        } catch (Exception | NoSuchMethodError e6) {
            z(e6, true);
        }
    }

    public void H() {
        this.f16949y = this.f16926b.b();
        ((c) AbstractC1117K.i(this.f16943s)).b(1, AbstractC1119a.e(this.f16949y), true);
    }

    public final boolean I() {
        try {
            this.f16926b.g(this.f16946v, this.f16947w);
            return true;
        } catch (Exception | NoSuchMethodError e6) {
            x(e6, 1);
            return false;
        }
    }

    public final void J() {
        if (Thread.currentThread() != this.f16938n.getThread()) {
            AbstractC1133o.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f16938n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // l1.InterfaceC1743m
    public final UUID a() {
        J();
        return this.f16937m;
    }

    @Override // l1.InterfaceC1743m
    public void c(t.a aVar) {
        J();
        if (this.f16941q < 0) {
            AbstractC1133o.c("DefaultDrmSession", "Session reference count less than zero: " + this.f16941q);
            this.f16941q = 0;
        }
        if (aVar != null) {
            this.f16933i.a(aVar);
        }
        int i6 = this.f16941q + 1;
        this.f16941q = i6;
        if (i6 == 1) {
            AbstractC1119a.g(this.f16940p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16942r = handlerThread;
            handlerThread.start();
            this.f16943s = new c(this.f16942r.getLooper());
            if (F()) {
                t(true);
            }
        } else if (aVar != null && w() && this.f16933i.b(aVar) == 1) {
            aVar.k(this.f16940p);
        }
        this.f16928d.a(this, this.f16941q);
    }

    @Override // l1.InterfaceC1743m
    public boolean d() {
        J();
        return this.f16930f;
    }

    @Override // l1.InterfaceC1743m
    public Map e() {
        J();
        byte[] bArr = this.f16946v;
        if (bArr == null) {
            return null;
        }
        return this.f16926b.a(bArr);
    }

    @Override // l1.InterfaceC1743m
    public final int f() {
        J();
        return this.f16940p;
    }

    @Override // l1.InterfaceC1743m
    public void g(t.a aVar) {
        J();
        int i6 = this.f16941q;
        if (i6 <= 0) {
            AbstractC1133o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i7 = i6 - 1;
        this.f16941q = i7;
        if (i7 == 0) {
            this.f16940p = 0;
            ((e) AbstractC1117K.i(this.f16939o)).removeCallbacksAndMessages(null);
            ((c) AbstractC1117K.i(this.f16943s)).c();
            this.f16943s = null;
            ((HandlerThread) AbstractC1117K.i(this.f16942r)).quit();
            this.f16942r = null;
            this.f16944t = null;
            this.f16945u = null;
            this.f16948x = null;
            this.f16949y = null;
            byte[] bArr = this.f16946v;
            if (bArr != null) {
                this.f16926b.h(bArr);
                this.f16946v = null;
            }
        }
        if (aVar != null) {
            this.f16933i.c(aVar);
            if (this.f16933i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f16928d.b(this, this.f16941q);
    }

    @Override // l1.InterfaceC1743m
    public boolean h(String str) {
        J();
        return this.f16926b.f((byte[]) AbstractC1119a.i(this.f16946v), str);
    }

    @Override // l1.InterfaceC1743m
    public final InterfaceC1743m.a i() {
        J();
        if (this.f16940p == 1) {
            return this.f16945u;
        }
        return null;
    }

    @Override // l1.InterfaceC1743m
    public final InterfaceC1286b j() {
        J();
        return this.f16944t;
    }

    public final void s(InterfaceC1125g interfaceC1125g) {
        Iterator it = this.f16933i.j().iterator();
        while (it.hasNext()) {
            interfaceC1125g.accept((t.a) it.next());
        }
    }

    public final void t(boolean z6) {
        if (this.f16931g) {
            return;
        }
        byte[] bArr = (byte[]) AbstractC1117K.i(this.f16946v);
        int i6 = this.f16929e;
        if (i6 != 0 && i6 != 1) {
            if (i6 == 2) {
                if (this.f16947w == null || I()) {
                    G(bArr, 2, z6);
                    return;
                }
                return;
            }
            if (i6 != 3) {
                return;
            }
            AbstractC1119a.e(this.f16947w);
            AbstractC1119a.e(this.f16946v);
            G(this.f16947w, 3, z6);
            return;
        }
        if (this.f16947w == null) {
            G(bArr, 1, z6);
            return;
        }
        if (this.f16940p == 4 || I()) {
            long u6 = u();
            if (this.f16929e != 0 || u6 > 60) {
                if (u6 <= 0) {
                    x(new K(), 2);
                    return;
                } else {
                    this.f16940p = 4;
                    s(new InterfaceC1125g() { // from class: l1.f
                        @Override // c1.InterfaceC1125g
                        public final void accept(Object obj) {
                            ((t.a) obj).j();
                        }
                    });
                    return;
                }
            }
            AbstractC1133o.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + u6);
            G(bArr, 2, z6);
        }
    }

    public final long u() {
        if (!AbstractC0835g.f6882d.equals(this.f16937m)) {
            return LongCompanionObject.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC1119a.e(O.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean v(byte[] bArr) {
        J();
        return Arrays.equals(this.f16946v, bArr);
    }

    public final boolean w() {
        int i6 = this.f16940p;
        return i6 == 3 || i6 == 4;
    }

    public final void x(final Throwable th, int i6) {
        this.f16945u = new InterfaceC1743m.a(th, x.a(th, i6));
        AbstractC1133o.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            s(new InterfaceC1125g() { // from class: l1.e
                @Override // c1.InterfaceC1125g
                public final void accept(Object obj) {
                    ((t.a) obj).l((Exception) th);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!x.c(th) && !x.b(th)) {
                throw ((Error) th);
            }
        }
        if (this.f16940p != 4) {
            this.f16940p = 1;
        }
    }

    public final void y(Object obj, Object obj2) {
        if (obj == this.f16948x && w()) {
            this.f16948x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                z((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f16929e == 3) {
                    this.f16926b.i((byte[]) AbstractC1117K.i(this.f16947w), bArr);
                    s(new InterfaceC1125g() { // from class: l1.c
                        @Override // c1.InterfaceC1125g
                        public final void accept(Object obj3) {
                            ((t.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] i6 = this.f16926b.i(this.f16946v, bArr);
                int i7 = this.f16929e;
                if ((i7 == 2 || (i7 == 0 && this.f16947w != null)) && i6 != null && i6.length != 0) {
                    this.f16947w = i6;
                }
                this.f16940p = 4;
                s(new InterfaceC1125g() { // from class: l1.d
                    @Override // c1.InterfaceC1125g
                    public final void accept(Object obj3) {
                        ((t.a) obj3).h();
                    }
                });
            } catch (Exception e6) {
                e = e6;
                z(e, true);
            } catch (NoSuchMethodError e7) {
                e = e7;
                z(e, true);
            }
        }
    }

    public final void z(Throwable th, boolean z6) {
        if ((th instanceof NotProvisionedException) || x.b(th)) {
            this.f16927c.c(this);
        } else {
            x(th, z6 ? 1 : 2);
        }
    }
}
