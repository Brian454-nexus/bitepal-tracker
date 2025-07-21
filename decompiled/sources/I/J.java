package I;

import F.AbstractC0335i0;
import F.InterfaceC0340l;
import G.a;
import I.E;
import I.J;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class J implements a.InterfaceC0033a {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f2256a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final Object f2257b;

    /* renamed from: c, reason: collision with root package name */
    public int f2258c;

    /* renamed from: d, reason: collision with root package name */
    public final G.a f2259d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f2260e;

    /* renamed from: f, reason: collision with root package name */
    public int f2261f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public E.a f2262a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f2263b;

        /* renamed from: c, reason: collision with root package name */
        public final b f2264c;

        /* renamed from: d, reason: collision with root package name */
        public final c f2265d;

        public a(E.a aVar, Executor executor, b bVar, c cVar) {
            this.f2262a = aVar;
            this.f2263b = executor;
            this.f2264c = bVar;
            this.f2265d = cVar;
        }

        public E.a a() {
            return this.f2262a;
        }

        public void b() {
            try {
                Executor executor = this.f2263b;
                final b bVar = this.f2264c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: I.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.d("CameraStateRegistry", "Unable to notify camera to configure.", e6);
            }
        }

        public void c() {
            try {
                Executor executor = this.f2263b;
                final c cVar = this.f2265d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: I.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.c.this.a();
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.d("CameraStateRegistry", "Unable to notify camera to open.", e6);
            }
        }

        public E.a d(E.a aVar) {
            E.a aVar2 = this.f2262a;
            this.f2262a = aVar;
            return aVar2;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a();
    }

    public J(G.a aVar, int i6) {
        Object obj = new Object();
        this.f2257b = obj;
        this.f2260e = new HashMap();
        this.f2258c = i6;
        synchronized (obj) {
            this.f2259d = aVar;
            this.f2261f = this.f2258c;
        }
    }

    public static boolean d(E.a aVar) {
        return aVar != null && aVar.b();
    }

    @Override // G.a.InterfaceC0033a
    public void a(int i6, int i7) {
        synchronized (this.f2257b) {
            boolean z6 = true;
            this.f2258c = i7 == 2 ? 2 : 1;
            boolean z7 = i6 != 2 && i7 == 2;
            if (i6 != 2 || i7 == 2) {
                z6 = false;
            }
            if (z7 || z6) {
                f();
            }
        }
    }

    public final a b(String str) {
        for (InterfaceC0340l interfaceC0340l : this.f2260e.keySet()) {
            if (str.equals(((D) interfaceC0340l.b()).d())) {
                return (a) this.f2260e.get(interfaceC0340l);
            }
        }
        return null;
    }

    public boolean c() {
        synchronized (this.f2257b) {
            try {
                Iterator it = this.f2260e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == E.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(F.InterfaceC0340l r7, I.E.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2257b
            monitor-enter(r0)
            int r1 = r6.f2261f     // Catch: java.lang.Throwable -> Le
            I.E$a r2 = I.E.a.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L11
            I.E$a r2 = r6.j(r7)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r7 = move-exception
            goto Lbf
        L11:
            I.E$a r2 = r6.k(r7, r8)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r8) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            G.a r2 = r6.f2259d     // Catch: java.lang.Throwable -> Le
            int r2 = r2.a()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            I.E$a r2 = I.E.a.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L3e
            F.r r2 = r7.b()     // Catch: java.lang.Throwable -> Le
            I.D r2 = (I.D) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.d()     // Catch: java.lang.Throwable -> Le
            G.a r3 = r6.f2259d     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.c(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            I.J$a r2 = r6.b(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r6.f2261f     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map r8 = r6.f2260e     // Catch: java.lang.Throwable -> Le
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            I.J$a r3 = (I.J.a) r3     // Catch: java.lang.Throwable -> Le
            I.E$a r3 = r3.a()     // Catch: java.lang.Throwable -> Le
            I.E$a r5 = I.E.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r3 != r5) goto L55
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Le
            F.l r3 = (F.InterfaceC0340l) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            I.J$a r1 = (I.J.a) r1     // Catch: java.lang.Throwable -> Le
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            I.E$a r1 = I.E.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r8 != r1) goto L97
            int r8 = r6.f2261f     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map r8 = r6.f2260e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Le
            I.J$a r8 = (I.J.a) r8     // Catch: java.lang.Throwable -> Le
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r9 != 0) goto L9e
            r4.remove(r7)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            I.J$a r8 = (I.J.a) r8
            r8.c()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.b()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I.J.e(F.l, I.E$a, boolean):void");
    }

    public final void f() {
        if (AbstractC0335i0.f("CameraStateRegistry")) {
            this.f2256a.setLength(0);
            this.f2256a.append("Recalculating open cameras:\n");
            this.f2256a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f2256a.append("-------------------------------------------------------------------\n");
        }
        int i6 = 0;
        for (Map.Entry entry : this.f2260e.entrySet()) {
            if (AbstractC0335i0.f("CameraStateRegistry")) {
                this.f2256a.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0340l) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : "UNKNOWN"));
            }
            if (d(((a) entry.getValue()).a())) {
                i6++;
            }
        }
        if (AbstractC0335i0.f("CameraStateRegistry")) {
            this.f2256a.append("-------------------------------------------------------------------\n");
            this.f2256a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i6), Integer.valueOf(this.f2258c)));
            AbstractC0335i0.a("CameraStateRegistry", this.f2256a.toString());
        }
        this.f2261f = Math.max(this.f2258c - i6, 0);
    }

    public void g(InterfaceC0340l interfaceC0340l, Executor executor, b bVar, c cVar) {
        synchronized (this.f2257b) {
            y0.g.i(!this.f2260e.containsKey(interfaceC0340l), "Camera is already registered: " + interfaceC0340l);
            this.f2260e.put(interfaceC0340l, new a(null, executor, bVar, cVar));
        }
    }

    public boolean h(InterfaceC0340l interfaceC0340l) {
        boolean z6;
        synchronized (this.f2257b) {
            try {
                a aVar = (a) y0.g.g((a) this.f2260e.get(interfaceC0340l), "Camera must first be registered with registerCamera()");
                z6 = false;
                if (AbstractC0335i0.f("CameraStateRegistry")) {
                    this.f2256a.setLength(0);
                    this.f2256a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC0340l, Integer.valueOf(this.f2261f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f2261f > 0 || d(aVar.a())) {
                    aVar.d(E.a.OPENING);
                    z6 = true;
                }
                if (AbstractC0335i0.f("CameraStateRegistry")) {
                    this.f2256a.append(String.format(Locale.US, " --> %s", z6 ? "SUCCESS" : "FAIL"));
                    AbstractC0335i0.a("CameraStateRegistry", this.f2256a.toString());
                }
                if (z6) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2257b
            monitor-enter(r0)
            G.a r1 = r5.f2259d     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.a()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r6 = move-exception
            goto L61
        L11:
            I.J$a r1 = r5.b(r6)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 == 0) goto L21
            I.J$a r6 = r5.b(r6)     // Catch: java.lang.Throwable -> Lf
            I.E$a r6 = r6.a()     // Catch: java.lang.Throwable -> Lf
            goto L22
        L21:
            r6 = r2
        L22:
            if (r7 == 0) goto L32
            I.J$a r1 = r5.b(r7)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L32
            I.J$a r7 = r5.b(r7)     // Catch: java.lang.Throwable -> Lf
            I.E$a r2 = r7.a()     // Catch: java.lang.Throwable -> Lf
        L32:
            I.E$a r7 = I.E.a.OPEN     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            if (r1 != 0) goto L46
            I.E$a r1 = I.E.a.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L44
            goto L46
        L44:
            r6 = r4
            goto L47
        L46:
            r6 = r3
        L47:
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L58
            I.E$a r7 = I.E.a.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L56
            goto L58
        L56:
            r7 = r4
            goto L59
        L58:
            r7 = r3
        L59:
            if (r6 == 0) goto L5e
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r4
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I.J.i(java.lang.String, java.lang.String):boolean");
    }

    public final E.a j(InterfaceC0340l interfaceC0340l) {
        a aVar = (a) this.f2260e.remove(interfaceC0340l);
        if (aVar == null) {
            return null;
        }
        f();
        return aVar.a();
    }

    public final E.a k(InterfaceC0340l interfaceC0340l, E.a aVar) {
        E.a d6 = ((a) y0.g.g((a) this.f2260e.get(interfaceC0340l), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        E.a aVar2 = E.a.OPENING;
        if (aVar == aVar2) {
            y0.g.i(d(aVar) || d6 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (d6 != aVar) {
            f();
        }
        return d6;
    }
}
