package W;

import O.e;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1060l;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5349a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f5350b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f5351c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f5352d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public G.a f5353e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a a(InterfaceC1061m interfaceC1061m, e.b bVar) {
            return new W.a(interfaceC1061m, bVar);
        }

        public abstract e.b b();

        public abstract InterfaceC1061m c();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements InterfaceC1060l {

        /* renamed from: a, reason: collision with root package name */
        public final c f5354a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1061m f5355b;

        public b(InterfaceC1061m interfaceC1061m, c cVar) {
            this.f5355b = interfaceC1061m;
            this.f5354a = cVar;
        }

        public InterfaceC1061m a() {
            return this.f5355b;
        }

        @v(AbstractC1057i.a.ON_DESTROY)
        public void onDestroy(InterfaceC1061m interfaceC1061m) {
            this.f5354a.m(interfaceC1061m);
        }

        @v(AbstractC1057i.a.ON_START)
        public void onStart(InterfaceC1061m interfaceC1061m) {
            this.f5354a.h(interfaceC1061m);
        }

        @v(AbstractC1057i.a.ON_STOP)
        public void onStop(InterfaceC1061m interfaceC1061m) {
            this.f5354a.i(interfaceC1061m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:4:0x0003, B:6:0x0022, B:10:0x0063, B:11:0x0074, B:13:0x0084, B:14:0x0087, B:19:0x008a, B:20:0x0093, B:21:0x002c, B:22:0x0030, B:24:0x0036, B:27:0x0050, B:33:0x005b, B:34:0x0062), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(W.b r5, F.J0 r6, java.util.List r7, java.util.Collection r8, G.a r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5349a
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r1 = r1 ^ 1
            y0.g.a(r1)     // Catch: java.lang.Throwable -> L2a
            r4.f5353e = r9     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.m r9 = r5.l()     // Catch: java.lang.Throwable -> L2a
            W.c$b r1 = r4.d(r9)     // Catch: java.lang.Throwable -> L2a
            java.util.Map r2 = r4.f5351c     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L2a
            G.a r2 = r4.f5353e     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            if (r2 == r3) goto L63
            goto L2c
        L2a:
            r5 = move-exception
            goto L94
        L2c:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            W.c$a r2 = (W.c.a) r2     // Catch: java.lang.Throwable -> L2a
            java.util.Map r3 = r4.f5350b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L2a
            W.b r2 = (W.b) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = y0.g.f(r2)     // Catch: java.lang.Throwable -> L2a
            W.b r2 = (W.b) r2     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.equals(r5)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L30
            java.util.List r2 = r2.p()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L5b
            goto L30
        L5b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2a
        L63:
            O.e r1 = r5.i()     // Catch: java.lang.Throwable -> L2a O.e.a -> L89
            r1.S(r6)     // Catch: java.lang.Throwable -> L2a O.e.a -> L89
            O.e r6 = r5.i()     // Catch: java.lang.Throwable -> L2a O.e.a -> L89
            r6.Q(r7)     // Catch: java.lang.Throwable -> L2a O.e.a -> L89
            r5.f(r8)     // Catch: java.lang.Throwable -> L2a O.e.a -> L89
            androidx.lifecycle.i r5 = r9.getLifecycle()     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.i$b r5 = r5.b()     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.i$b r6 = androidx.lifecycle.AbstractC1057i.b.STARTED     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L87
            r4.h(r9)     // Catch: java.lang.Throwable -> L2a
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L89:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L94:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: W.c.a(W.b, F.J0, java.util.List, java.util.Collection, G.a):void");
    }

    public W.b b(InterfaceC1061m interfaceC1061m, O.e eVar) {
        W.b bVar;
        synchronized (this.f5349a) {
            try {
                y0.g.b(this.f5350b.get(a.a(interfaceC1061m, eVar.y())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                if (interfaceC1061m.getLifecycle().b() == AbstractC1057i.b.DESTROYED) {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
                bVar = new W.b(interfaceC1061m, eVar);
                if (eVar.E().isEmpty()) {
                    bVar.r();
                }
                g(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public W.b c(InterfaceC1061m interfaceC1061m, e.b bVar) {
        W.b bVar2;
        synchronized (this.f5349a) {
            bVar2 = (W.b) this.f5350b.get(a.a(interfaceC1061m, bVar));
        }
        return bVar2;
    }

    public final b d(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                for (b bVar : this.f5351c.keySet()) {
                    if (interfaceC1061m.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection e() {
        Collection unmodifiableCollection;
        synchronized (this.f5349a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f5350b.values());
        }
        return unmodifiableCollection;
    }

    public final boolean f(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                b d6 = d(interfaceC1061m);
                if (d6 == null) {
                    return false;
                }
                Iterator it = ((Set) this.f5351c.get(d6)).iterator();
                while (it.hasNext()) {
                    if (!((W.b) y0.g.f((W.b) this.f5350b.get((a) it.next()))).p().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(W.b bVar) {
        synchronized (this.f5349a) {
            try {
                InterfaceC1061m l6 = bVar.l();
                a a6 = a.a(l6, bVar.i().y());
                b d6 = d(l6);
                Set hashSet = d6 != null ? (Set) this.f5351c.get(d6) : new HashSet();
                hashSet.add(a6);
                this.f5350b.put(a6, bVar);
                if (d6 == null) {
                    b bVar2 = new b(l6, this);
                    this.f5351c.put(bVar2, hashSet);
                    l6.getLifecycle().a(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                if (f(interfaceC1061m)) {
                    if (this.f5352d.isEmpty()) {
                        this.f5352d.push(interfaceC1061m);
                    } else {
                        G.a aVar = this.f5353e;
                        if (aVar == null || aVar.a() != 2) {
                            InterfaceC1061m interfaceC1061m2 = (InterfaceC1061m) this.f5352d.peek();
                            if (!interfaceC1061m.equals(interfaceC1061m2)) {
                                j(interfaceC1061m2);
                                this.f5352d.remove(interfaceC1061m);
                                this.f5352d.push(interfaceC1061m);
                            }
                        }
                    }
                    n(interfaceC1061m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                this.f5352d.remove(interfaceC1061m);
                j(interfaceC1061m);
                if (!this.f5352d.isEmpty()) {
                    n((InterfaceC1061m) this.f5352d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                b d6 = d(interfaceC1061m);
                if (d6 == null) {
                    return;
                }
                Iterator it = ((Set) this.f5351c.get(d6)).iterator();
                while (it.hasNext()) {
                    ((W.b) y0.g.f((W.b) this.f5350b.get((a) it.next()))).r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(Collection collection) {
        synchronized (this.f5349a) {
            try {
                Iterator it = this.f5350b.keySet().iterator();
                while (it.hasNext()) {
                    W.b bVar = (W.b) this.f5350b.get((a) it.next());
                    boolean isEmpty = bVar.p().isEmpty();
                    bVar.s(collection);
                    if (!isEmpty && bVar.p().isEmpty()) {
                        i(bVar.l());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l() {
        synchronized (this.f5349a) {
            try {
                Iterator it = this.f5350b.keySet().iterator();
                while (it.hasNext()) {
                    W.b bVar = (W.b) this.f5350b.get((a) it.next());
                    bVar.t();
                    i(bVar.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                b d6 = d(interfaceC1061m);
                if (d6 == null) {
                    return;
                }
                i(interfaceC1061m);
                Iterator it = ((Set) this.f5351c.get(d6)).iterator();
                while (it.hasNext()) {
                    this.f5350b.remove((a) it.next());
                }
                this.f5351c.remove(d6);
                d6.a().getLifecycle().c(d6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(InterfaceC1061m interfaceC1061m) {
        synchronized (this.f5349a) {
            try {
                Iterator it = ((Set) this.f5351c.get(d(interfaceC1061m))).iterator();
                while (it.hasNext()) {
                    W.b bVar = (W.b) this.f5350b.get((a) it.next());
                    if (!((W.b) y0.g.f(bVar)).p().isEmpty()) {
                        bVar.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
