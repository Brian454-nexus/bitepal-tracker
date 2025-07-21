package f1;

import c1.AbstractC1119a;
import java.util.ArrayDeque;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f14016a;

    /* renamed from: e, reason: collision with root package name */
    public final f[] f14020e;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f14021f;

    /* renamed from: g, reason: collision with root package name */
    public int f14022g;

    /* renamed from: h, reason: collision with root package name */
    public int f14023h;

    /* renamed from: i, reason: collision with root package name */
    public f f14024i;

    /* renamed from: j, reason: collision with root package name */
    public e f14025j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14026k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14027l;

    /* renamed from: m, reason: collision with root package name */
    public int f14028m;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14017b = new Object();

    /* renamed from: n, reason: collision with root package name */
    public long f14029n = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f14018c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f14019d = new ArrayDeque();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.v();
        }
    }

    public h(f[] fVarArr, g[] gVarArr) {
        this.f14020e = fVarArr;
        this.f14022g = fVarArr.length;
        for (int i6 = 0; i6 < this.f14022g; i6++) {
            this.f14020e[i6] = i();
        }
        this.f14021f = gVarArr;
        this.f14023h = gVarArr.length;
        for (int i7 = 0; i7 < this.f14023h; i7++) {
            this.f14021f[i7] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f14016a = aVar;
        aVar.start();
    }

    @Override // f1.d
    public final void b(long j6) {
        boolean z6;
        synchronized (this.f14017b) {
            try {
                if (this.f14022g != this.f14020e.length && !this.f14026k) {
                    z6 = false;
                    AbstractC1119a.g(z6);
                    this.f14029n = j6;
                }
                z6 = true;
                AbstractC1119a.g(z6);
                this.f14029n = j6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f1.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void f(f fVar) {
        synchronized (this.f14017b) {
            r();
            AbstractC1119a.a(fVar == this.f14024i);
            this.f14018c.addLast(fVar);
            q();
            this.f14024i = null;
        }
    }

    @Override // f1.d
    public final void flush() {
        synchronized (this.f14017b) {
            try {
                this.f14026k = true;
                this.f14028m = 0;
                f fVar = this.f14024i;
                if (fVar != null) {
                    s(fVar);
                    this.f14024i = null;
                }
                while (!this.f14018c.isEmpty()) {
                    s((f) this.f14018c.removeFirst());
                }
                while (!this.f14019d.isEmpty()) {
                    ((g) this.f14019d.removeFirst()).n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        return !this.f14018c.isEmpty() && this.f14023h > 0;
    }

    public abstract f i();

    public abstract g j();

    public abstract e k(Throwable th);

    public abstract e l(f fVar, g gVar, boolean z6);

    public final boolean m() {
        e k6;
        synchronized (this.f14017b) {
            while (!this.f14027l && !h()) {
                try {
                    this.f14017b.wait();
                } finally {
                }
            }
            if (this.f14027l) {
                return false;
            }
            f fVar = (f) this.f14018c.removeFirst();
            g[] gVarArr = this.f14021f;
            int i6 = this.f14023h - 1;
            this.f14023h = i6;
            g gVar = gVarArr[i6];
            boolean z6 = this.f14026k;
            this.f14026k = false;
            if (fVar.i()) {
                gVar.e(4);
            } else {
                gVar.f14013b = fVar.f14007f;
                if (fVar.j()) {
                    gVar.e(134217728);
                }
                if (!p(fVar.f14007f)) {
                    gVar.f14015d = true;
                }
                try {
                    k6 = l(fVar, gVar, z6);
                } catch (OutOfMemoryError e6) {
                    k6 = k(e6);
                } catch (RuntimeException e7) {
                    k6 = k(e7);
                }
                if (k6 != null) {
                    synchronized (this.f14017b) {
                        this.f14025j = k6;
                    }
                    return false;
                }
            }
            synchronized (this.f14017b) {
                try {
                    if (this.f14026k) {
                        gVar.n();
                    } else if (gVar.f14015d) {
                        this.f14028m++;
                        gVar.n();
                    } else {
                        gVar.f14014c = this.f14028m;
                        this.f14028m = 0;
                        this.f14019d.addLast(gVar);
                    }
                    s(fVar);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // f1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f d() {
        f fVar;
        synchronized (this.f14017b) {
            r();
            AbstractC1119a.g(this.f14024i == null);
            int i6 = this.f14022g;
            if (i6 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.f14020e;
                int i7 = i6 - 1;
                this.f14022g = i7;
                fVar = fVarArr[i7];
            }
            this.f14024i = fVar;
        }
        return fVar;
    }

    @Override // f1.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final g a() {
        synchronized (this.f14017b) {
            try {
                r();
                if (this.f14019d.isEmpty()) {
                    return null;
                }
                return (g) this.f14019d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(long j6) {
        boolean z6;
        synchronized (this.f14017b) {
            long j7 = this.f14029n;
            z6 = j7 == -9223372036854775807L || j6 >= j7;
        }
        return z6;
    }

    public final void q() {
        if (h()) {
            this.f14017b.notify();
        }
    }

    public final void r() {
        e eVar = this.f14025j;
        if (eVar != null) {
            throw eVar;
        }
    }

    @Override // f1.d
    public void release() {
        synchronized (this.f14017b) {
            this.f14027l = true;
            this.f14017b.notify();
        }
        try {
            this.f14016a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(f fVar) {
        fVar.f();
        f[] fVarArr = this.f14020e;
        int i6 = this.f14022g;
        this.f14022g = i6 + 1;
        fVarArr[i6] = fVar;
    }

    public void t(g gVar) {
        synchronized (this.f14017b) {
            u(gVar);
            q();
        }
    }

    public final void u(g gVar) {
        gVar.f();
        g[] gVarArr = this.f14021f;
        int i6 = this.f14023h;
        this.f14023h = i6 + 1;
        gVarArr[i6] = gVar;
    }

    public final void v() {
        do {
            try {
            } catch (InterruptedException e6) {
                throw new IllegalStateException(e6);
            }
        } while (m());
    }

    public final void w(int i6) {
        AbstractC1119a.g(this.f14022g == this.f14020e.length);
        for (f fVar : this.f14020e) {
            fVar.o(i6);
        }
    }
}
