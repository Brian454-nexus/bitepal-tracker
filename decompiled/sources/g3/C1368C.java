package g3;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g3.C, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1368C {

    /* renamed from: e, reason: collision with root package name */
    public static final String f14858e = W2.k.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final W2.s f14859a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14860b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f14861c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f14862d = new Object();

    /* renamed from: g3.C$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(f3.m mVar);
    }

    /* renamed from: g3.C$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final C1368C f14863a;

        /* renamed from: b, reason: collision with root package name */
        public final f3.m f14864b;

        public b(C1368C c1368c, f3.m mVar) {
            this.f14863a = c1368c;
            this.f14864b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f14863a.f14862d) {
                try {
                    if (((b) this.f14863a.f14860b.remove(this.f14864b)) != null) {
                        a aVar = (a) this.f14863a.f14861c.remove(this.f14864b);
                        if (aVar != null) {
                            aVar.a(this.f14864b);
                        }
                    } else {
                        W2.k.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f14864b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C1368C(W2.s sVar) {
        this.f14859a = sVar;
    }

    public void a(f3.m mVar, long j6, a aVar) {
        synchronized (this.f14862d) {
            W2.k.e().a(f14858e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f14860b.put(mVar, bVar);
            this.f14861c.put(mVar, aVar);
            this.f14859a.a(j6, bVar);
        }
    }

    public void b(f3.m mVar) {
        synchronized (this.f14862d) {
            try {
                if (((b) this.f14860b.remove(mVar)) != null) {
                    W2.k.e().a(f14858e, "Stopping timer for " + mVar);
                    this.f14861c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
