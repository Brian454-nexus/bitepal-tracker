package E5;

import A5.c;
import F5.AbstractC0364k;
import F5.InterfaceC0356c;
import F5.InterfaceC0357d;
import G5.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import y5.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1198a;

    /* renamed from: b, reason: collision with root package name */
    public final y5.e f1199b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0357d f1200c;

    /* renamed from: d, reason: collision with root package name */
    public final x f1201d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1202e;

    /* renamed from: f, reason: collision with root package name */
    public final G5.b f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final H5.a f1204g;

    /* renamed from: h, reason: collision with root package name */
    public final H5.a f1205h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0356c f1206i;

    public r(Context context, y5.e eVar, InterfaceC0357d interfaceC0357d, x xVar, Executor executor, G5.b bVar, H5.a aVar, H5.a aVar2, InterfaceC0356c interfaceC0356c) {
        this.f1198a = context;
        this.f1199b = eVar;
        this.f1200c = interfaceC0357d;
        this.f1201d = xVar;
        this.f1202e = executor;
        this.f1203f = bVar;
        this.f1204g = aVar;
        this.f1205h = aVar2;
        this.f1206i = interfaceC0356c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, x5.p pVar, long j6) {
        rVar.f1200c.h0(iterable);
        rVar.f1200c.s(pVar, rVar.f1204g.a() + j6);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f1206i.c();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f1200c.l(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, x5.p pVar, int i6) {
        rVar.f1201d.b(pVar, i6 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, x5.p pVar, long j6) {
        rVar.f1200c.s(pVar, rVar.f1204g.a() + j6);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f1206i.I(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final x5.p pVar, final int i6, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                G5.b bVar = rVar.f1203f;
                final InterfaceC0357d interfaceC0357d = rVar.f1200c;
                Objects.requireNonNull(interfaceC0357d);
                bVar.a(new b.a() { // from class: E5.i
                    @Override // G5.b.a
                    public final Object a() {
                        return Integer.valueOf(InterfaceC0357d.this.i());
                    }
                });
                if (rVar.k()) {
                    rVar.l(pVar, i6);
                } else {
                    rVar.f1203f.a(new b.a() { // from class: E5.j
                        @Override // G5.b.a
                        public final Object a() {
                            return r.f(r.this, pVar, i6);
                        }
                    });
                }
                runnable.run();
            } catch (G5.a unused) {
                rVar.f1201d.b(pVar, i6 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public x5.i j(y5.m mVar) {
        G5.b bVar = this.f1203f;
        final InterfaceC0356c interfaceC0356c = this.f1206i;
        Objects.requireNonNull(interfaceC0356c);
        return mVar.a(x5.i.a().i(this.f1204g.a()).o(this.f1205h.a()).n("GDT_CLIENT_METRICS").h(new x5.h(u5.c.b("proto"), ((A5.a) bVar.a(new b.a() { // from class: E5.h
            @Override // G5.b.a
            public final Object a() {
                return InterfaceC0356c.this.D();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f1198a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public y5.g l(final x5.p pVar, int i6) {
        y5.g b6;
        y5.m mVar = this.f1199b.get(pVar.b());
        y5.g e6 = y5.g.e(0L);
        final long j6 = 0;
        while (((Boolean) this.f1203f.a(new b.a() { // from class: E5.k
            @Override // G5.b.a
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r.this.f1200c.c0(pVar));
                return valueOf;
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f1203f.a(new b.a() { // from class: E5.l
                @Override // G5.b.a
                public final Object a() {
                    Iterable y6;
                    y6 = r.this.f1200c.y(pVar);
                    return y6;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return e6;
            }
            if (mVar == null) {
                B5.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                b6 = y5.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0364k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(mVar));
                }
                b6 = mVar.b(y5.f.a().b(arrayList).c(pVar.c()).a());
            }
            e6 = b6;
            if (e6.c() == g.a.TRANSIENT_ERROR) {
                final x5.p pVar2 = pVar;
                this.f1203f.a(new b.a() { // from class: E5.m
                    @Override // G5.b.a
                    public final Object a() {
                        return r.b(r.this, iterable, pVar2, j6);
                    }
                });
                this.f1201d.a(pVar2, i6 + 1, true);
                return e6;
            }
            x5.p pVar3 = pVar;
            this.f1203f.a(new b.a() { // from class: E5.n
                @Override // G5.b.a
                public final Object a() {
                    return r.e(r.this, iterable);
                }
            });
            if (e6.c() == g.a.OK) {
                long max = Math.max(j6, e6.b());
                if (pVar3.e()) {
                    this.f1203f.a(new b.a() { // from class: E5.o
                        @Override // G5.b.a
                        public final Object a() {
                            return r.c(r.this);
                        }
                    });
                }
                j6 = max;
            } else if (e6.c() == g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String n6 = ((AbstractC0364k) it2.next()).b().n();
                    if (hashMap.containsKey(n6)) {
                        hashMap.put(n6, Integer.valueOf(((Integer) hashMap.get(n6)).intValue() + 1));
                    } else {
                        hashMap.put(n6, 1);
                    }
                }
                this.f1203f.a(new b.a() { // from class: E5.p
                    @Override // G5.b.a
                    public final Object a() {
                        return r.h(r.this, hashMap);
                    }
                });
            }
            pVar = pVar3;
        }
        final x5.p pVar4 = pVar;
        this.f1203f.a(new b.a() { // from class: E5.q
            @Override // G5.b.a
            public final Object a() {
                return r.g(r.this, pVar4, j6);
            }
        });
        return e6;
    }

    public void m(final x5.p pVar, final int i6, final Runnable runnable) {
        this.f1202e.execute(new Runnable() { // from class: E5.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(r.this, pVar, i6, runnable);
            }
        });
    }
}
