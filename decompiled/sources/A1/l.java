package A1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c1.AbstractC1112F;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final c f137d = h(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f138e = h(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f139f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f140g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f141a;

    /* renamed from: b, reason: collision with root package name */
    public d f142b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f143c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void j(e eVar, long j6, long j7);

        c q(e eVar, long j6, long j7, IOException iOException, int i6);

        void u(e eVar, long j6, long j7, boolean z6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f144a;

        /* renamed from: b, reason: collision with root package name */
        public final long f145b;

        public boolean c() {
            int i6 = this.f144a;
            return i6 == 0 || i6 == 1;
        }

        public c(int i6, long j6) {
            this.f144a = i6;
            this.f145b = j6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f146a;

        /* renamed from: b, reason: collision with root package name */
        public final e f147b;

        /* renamed from: c, reason: collision with root package name */
        public final long f148c;

        /* renamed from: d, reason: collision with root package name */
        public b f149d;

        /* renamed from: e, reason: collision with root package name */
        public IOException f150e;

        /* renamed from: f, reason: collision with root package name */
        public int f151f;

        /* renamed from: g, reason: collision with root package name */
        public Thread f152g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f153h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f154i;

        public d(Looper looper, e eVar, b bVar, int i6, long j6) {
            super(looper);
            this.f147b = eVar;
            this.f149d = bVar;
            this.f146a = i6;
            this.f148c = j6;
        }

        public void a(boolean z6) {
            this.f154i = z6;
            this.f150e = null;
            if (hasMessages(1)) {
                this.f153h = true;
                removeMessages(1);
                if (!z6) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f153h = true;
                        this.f147b.c();
                        Thread thread = this.f152g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z6) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC1119a.e(this.f149d)).u(this.f147b, elapsedRealtime, elapsedRealtime - this.f148c, true);
                this.f149d = null;
            }
        }

        public final void b() {
            this.f150e = null;
            l.this.f141a.execute((Runnable) AbstractC1119a.e(l.this.f142b));
        }

        public final void c() {
            l.this.f142b = null;
        }

        public final long d() {
            return Math.min((this.f151f - 1) * 1000, 5000);
        }

        public void e(int i6) {
            IOException iOException = this.f150e;
            if (iOException != null && this.f151f > i6) {
                throw iOException;
            }
        }

        public void f(long j6) {
            AbstractC1119a.g(l.this.f142b == null);
            l.this.f142b = this;
            if (j6 > 0) {
                sendEmptyMessageDelayed(1, j6);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f154i) {
                return;
            }
            int i6 = message.what;
            if (i6 == 1) {
                b();
                return;
            }
            if (i6 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = elapsedRealtime - this.f148c;
            b bVar = (b) AbstractC1119a.e(this.f149d);
            if (this.f153h) {
                bVar.u(this.f147b, elapsedRealtime, j6, false);
                return;
            }
            int i7 = message.what;
            if (i7 == 2) {
                try {
                    bVar.j(this.f147b, elapsedRealtime, j6);
                    return;
                } catch (RuntimeException e6) {
                    AbstractC1133o.d("LoadTask", "Unexpected exception handling load completed", e6);
                    l.this.f143c = new h(e6);
                    return;
                }
            }
            if (i7 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f150e = iOException;
            int i8 = this.f151f + 1;
            this.f151f = i8;
            c q6 = bVar.q(this.f147b, elapsedRealtime, j6, iOException, i8);
            if (q6.f144a == 3) {
                l.this.f143c = this.f150e;
            } else if (q6.f144a != 2) {
                if (q6.f144a == 1) {
                    this.f151f = 1;
                }
                f(q6.f145b != -9223372036854775807L ? q6.f145b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            try {
                synchronized (this) {
                    z6 = this.f153h;
                    this.f152g = Thread.currentThread();
                }
                if (!z6) {
                    AbstractC1112F.a("load:" + this.f147b.getClass().getSimpleName());
                    try {
                        this.f147b.a();
                        AbstractC1112F.b();
                    } catch (Throwable th) {
                        AbstractC1112F.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f152g = null;
                    Thread.interrupted();
                }
                if (this.f154i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e6) {
                if (this.f154i) {
                    return;
                }
                obtainMessage(3, e6).sendToTarget();
            } catch (Error e7) {
                if (!this.f154i) {
                    AbstractC1133o.d("LoadTask", "Unexpected error loading stream", e7);
                    obtainMessage(4, e7).sendToTarget();
                }
                throw e7;
            } catch (Exception e8) {
                if (this.f154i) {
                    return;
                }
                AbstractC1133o.d("LoadTask", "Unexpected exception loading stream", e8);
                obtainMessage(3, new h(e8)).sendToTarget();
            } catch (OutOfMemoryError e9) {
                if (this.f154i) {
                    return;
                }
                AbstractC1133o.d("LoadTask", "OutOfMemory error loading stream", e9);
                obtainMessage(3, new h(e9)).sendToTarget();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        void a();

        void c();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        void i();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f f156a;

        public g(f fVar) {
            this.f156a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f156a.i();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected "
                r0.append(r1)
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = r4.getMessage()
                if (r1 == 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L33
            L31:
                java.lang.String r1 = ""
            L33:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.l.h.<init>(java.lang.Throwable):void");
        }
    }

    static {
        long j6 = -9223372036854775807L;
        f139f = new c(2, j6);
        f140g = new c(3, j6);
    }

    public l(String str) {
        this.f141a = AbstractC1117K.K0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z6, long j6) {
        return new c(z6 ? 1 : 0, j6);
    }

    @Override // A1.m
    public void a() {
        k(IntCompanionObject.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC1119a.i(this.f142b)).a(false);
    }

    public void g() {
        this.f143c = null;
    }

    public boolean i() {
        return this.f143c != null;
    }

    public boolean j() {
        return this.f142b != null;
    }

    public void k(int i6) {
        IOException iOException = this.f143c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f142b;
        if (dVar != null) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = dVar.f146a;
            }
            dVar.e(i6);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f142b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f141a.execute(new g(fVar));
        }
        this.f141a.shutdown();
    }

    public long n(e eVar, b bVar, int i6) {
        Looper looper = (Looper) AbstractC1119a.i(Looper.myLooper());
        this.f143c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i6, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
