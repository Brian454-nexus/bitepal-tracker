package X2;

import X2.K;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import e3.InterfaceC1269a;
import i3.InterfaceC1511b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r implements InterfaceC0821e, InterfaceC1269a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f6183m = W2.k.i("Processor");

    /* renamed from: b, reason: collision with root package name */
    public Context f6185b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f6186c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1511b f6187d;

    /* renamed from: e, reason: collision with root package name */
    public WorkDatabase f6188e;

    /* renamed from: i, reason: collision with root package name */
    public List f6192i;

    /* renamed from: g, reason: collision with root package name */
    public Map f6190g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f6189f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Set f6193j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final List f6194k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f6184a = null;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6195l = new Object();

    /* renamed from: h, reason: collision with root package name */
    public Map f6191h = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC0821e f6196a;

        /* renamed from: b, reason: collision with root package name */
        public final f3.m f6197b;

        /* renamed from: c, reason: collision with root package name */
        public D6.g f6198c;

        public a(InterfaceC0821e interfaceC0821e, f3.m mVar, D6.g gVar) {
            this.f6196a = interfaceC0821e;
            this.f6197b = mVar;
            this.f6198c = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            try {
                z6 = ((Boolean) this.f6198c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z6 = true;
            }
            this.f6196a.b(this.f6197b, z6);
        }
    }

    public r(Context context, androidx.work.a aVar, InterfaceC1511b interfaceC1511b, WorkDatabase workDatabase, List list) {
        this.f6185b = context;
        this.f6186c = aVar;
        this.f6187d = interfaceC1511b;
        this.f6188e = workDatabase;
        this.f6192i = list;
    }

    public static /* synthetic */ f3.u f(r rVar, ArrayList arrayList, String str) {
        arrayList.addAll(rVar.f6188e.K().b(str));
        return rVar.f6188e.J().n(str);
    }

    public static boolean i(String str, K k6) {
        if (k6 == null) {
            W2.k.e().a(f6183m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        k6.g();
        W2.k.e().a(f6183m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // e3.InterfaceC1269a
    public void a(String str, W2.f fVar) {
        synchronized (this.f6195l) {
            try {
                W2.k.e().f(f6183m, "Moving WorkSpec (" + str + ") to the foreground");
                K k6 = (K) this.f6190g.remove(str);
                if (k6 != null) {
                    if (this.f6184a == null) {
                        PowerManager.WakeLock b6 = g3.w.b(this.f6185b, "ProcessorForegroundLck");
                        this.f6184a = b6;
                        b6.acquire();
                    }
                    this.f6189f.put(str, k6);
                    AbstractC1809a.startForegroundService(this.f6185b, androidx.work.impl.foreground.a.e(this.f6185b, k6.d(), fVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X2.InterfaceC0821e
    public void b(f3.m mVar, boolean z6) {
        synchronized (this.f6195l) {
            try {
                K k6 = (K) this.f6190g.get(mVar.b());
                if (k6 != null && mVar.equals(k6.d())) {
                    this.f6190g.remove(mVar.b());
                }
                W2.k.e().a(f6183m, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z6);
                Iterator it = this.f6194k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0821e) it.next()).b(mVar, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.InterfaceC1269a
    public void c(String str) {
        synchronized (this.f6195l) {
            this.f6189f.remove(str);
            q();
        }
    }

    @Override // e3.InterfaceC1269a
    public boolean d(String str) {
        boolean containsKey;
        synchronized (this.f6195l) {
            containsKey = this.f6189f.containsKey(str);
        }
        return containsKey;
    }

    public void g(InterfaceC0821e interfaceC0821e) {
        synchronized (this.f6195l) {
            this.f6194k.add(interfaceC0821e);
        }
    }

    public f3.u h(String str) {
        synchronized (this.f6195l) {
            try {
                K k6 = (K) this.f6189f.get(str);
                if (k6 == null) {
                    k6 = (K) this.f6190g.get(str);
                }
                if (k6 == null) {
                    return null;
                }
                return k6.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f6195l) {
            contains = this.f6193j.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z6;
        synchronized (this.f6195l) {
            try {
                z6 = this.f6190g.containsKey(str) || this.f6189f.containsKey(str);
            } finally {
            }
        }
        return z6;
    }

    public void l(InterfaceC0821e interfaceC0821e) {
        synchronized (this.f6195l) {
            this.f6194k.remove(interfaceC0821e);
        }
    }

    public final void m(final f3.m mVar, final boolean z6) {
        this.f6187d.a().execute(new Runnable() { // from class: X2.q
            @Override // java.lang.Runnable
            public final void run() {
                r.this.b(mVar, z6);
            }
        });
    }

    public boolean n(v vVar) {
        return o(vVar, null);
    }

    public boolean o(v vVar, WorkerParameters.a aVar) {
        Throwable th;
        f3.m a6 = vVar.a();
        final String b6 = a6.b();
        final ArrayList arrayList = new ArrayList();
        f3.u uVar = (f3.u) this.f6188e.z(new Callable() { // from class: X2.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.f(r.this, arrayList, b6);
            }
        });
        if (uVar == null) {
            W2.k.e().k(f6183m, "Didn't find WorkSpec for id " + a6);
            m(a6, false);
            return false;
        }
        synchronized (this.f6195l) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
                try {
                    if (k(b6)) {
                        Set set = (Set) this.f6191h.get(b6);
                        if (((v) set.iterator().next()).a().a() == a6.a()) {
                            set.add(vVar);
                            W2.k.e().a(f6183m, "Work " + a6 + " is already enqueued for processing");
                        } else {
                            m(a6, false);
                        }
                        return false;
                    }
                    if (uVar.f() != a6.a()) {
                        m(a6, false);
                        return false;
                    }
                    K b7 = new K.c(this.f6185b, this.f6186c, this.f6187d, this, this.f6188e, uVar, arrayList).d(this.f6192i).c(aVar).b();
                    D6.g c6 = b7.c();
                    c6.c(new a(this, vVar.a(), c6), this.f6187d.a());
                    this.f6190g.put(b6, b7);
                    HashSet hashSet = new HashSet();
                    hashSet.add(vVar);
                    this.f6191h.put(b6, hashSet);
                    this.f6187d.b().execute(b7);
                    W2.k.e().a(f6183m, getClass().getSimpleName() + ": processing " + a6);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public boolean p(String str) {
        K k6;
        boolean z6;
        synchronized (this.f6195l) {
            try {
                W2.k.e().a(f6183m, "Processor cancelling " + str);
                this.f6193j.add(str);
                k6 = (K) this.f6189f.remove(str);
                z6 = k6 != null;
                if (k6 == null) {
                    k6 = (K) this.f6190g.remove(str);
                }
                if (k6 != null) {
                    this.f6191h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean i6 = i(str, k6);
        if (z6) {
            q();
        }
        return i6;
    }

    public final void q() {
        synchronized (this.f6195l) {
            try {
                if (this.f6189f.isEmpty()) {
                    try {
                        this.f6185b.startService(androidx.work.impl.foreground.a.g(this.f6185b));
                    } catch (Throwable th) {
                        W2.k.e().d(f6183m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f6184a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f6184a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(v vVar) {
        K k6;
        String b6 = vVar.a().b();
        synchronized (this.f6195l) {
            try {
                W2.k.e().a(f6183m, "Processor stopping foreground work " + b6);
                k6 = (K) this.f6189f.remove(b6);
                if (k6 != null) {
                    this.f6191h.remove(b6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i(b6, k6);
    }

    public boolean s(v vVar) {
        String b6 = vVar.a().b();
        synchronized (this.f6195l) {
            try {
                K k6 = (K) this.f6190g.remove(b6);
                if (k6 == null) {
                    W2.k.e().a(f6183m, "WorkerWrapper could not be found for " + b6);
                    return false;
                }
                Set set = (Set) this.f6191h.get(b6);
                if (set != null && set.contains(vVar)) {
                    W2.k.e().a(f6183m, "Processor stopping background work " + b6);
                    this.f6191h.remove(b6);
                    return i(b6, k6);
                }
                return false;
            } finally {
            }
        }
    }
}
