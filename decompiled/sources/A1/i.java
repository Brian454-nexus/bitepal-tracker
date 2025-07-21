package A1;

import A1.d;
import android.content.Context;
import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1138t;
import c1.InterfaceC1121c;
import e1.C1252j;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import java.util.HashMap;
import java.util.Map;
import z6.w;
import z6.y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements d, InterfaceC1266x {

    /* renamed from: p, reason: collision with root package name */
    public static final w f99p = w.B(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q, reason: collision with root package name */
    public static final w f100q = w.B(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r, reason: collision with root package name */
    public static final w f101r = w.B(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s, reason: collision with root package name */
    public static final w f102s = w.B(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t, reason: collision with root package name */
    public static final w f103t = w.B(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u, reason: collision with root package name */
    public static final w f104u = w.B(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v, reason: collision with root package name */
    public static i f105v;

    /* renamed from: a, reason: collision with root package name */
    public final y f106a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a.C0000a f107b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1121c f108c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109d;

    /* renamed from: e, reason: collision with root package name */
    public final q f110e;

    /* renamed from: f, reason: collision with root package name */
    public int f111f;

    /* renamed from: g, reason: collision with root package name */
    public long f112g;

    /* renamed from: h, reason: collision with root package name */
    public long f113h;

    /* renamed from: i, reason: collision with root package name */
    public long f114i;

    /* renamed from: j, reason: collision with root package name */
    public long f115j;

    /* renamed from: k, reason: collision with root package name */
    public long f116k;

    /* renamed from: l, reason: collision with root package name */
    public long f117l;

    /* renamed from: m, reason: collision with root package name */
    public int f118m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f119n;

    /* renamed from: o, reason: collision with root package name */
    public int f120o;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f121a;

        /* renamed from: b, reason: collision with root package name */
        public Map f122b;

        /* renamed from: c, reason: collision with root package name */
        public int f123c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1121c f124d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f125e;

        public b(Context context) {
            this.f121a = context == null ? null : context.getApplicationContext();
            this.f122b = b(AbstractC1117K.T(context));
            this.f123c = 2000;
            this.f124d = InterfaceC1121c.f10577a;
            this.f125e = true;
        }

        public static Map b(String str) {
            int[] l6 = i.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            w wVar = i.f99p;
            hashMap.put(2, (Long) wVar.get(l6[0]));
            hashMap.put(3, (Long) i.f100q.get(l6[1]));
            hashMap.put(4, (Long) i.f101r.get(l6[2]));
            hashMap.put(5, (Long) i.f102s.get(l6[3]));
            hashMap.put(10, (Long) i.f103t.get(l6[4]));
            hashMap.put(9, (Long) i.f104u.get(l6[5]));
            hashMap.put(7, (Long) wVar.get(l6[0]));
            return hashMap;
        }

        public i a() {
            return new i(this.f121a, this.f122b, this.f123c, this.f124d, this.f125e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x0cd7, code lost:
    
        if (r8.equals("AI") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.i.l(java.lang.String):int[]");
    }

    public static synchronized i n(Context context) {
        i iVar;
        synchronized (i.class) {
            try {
                if (f105v == null) {
                    f105v = new b(context).a();
                }
                iVar = f105v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static boolean o(C1252j c1252j, boolean z6) {
        return z6 && !c1252j.d(8);
    }

    @Override // e1.InterfaceC1266x
    public synchronized void a(InterfaceC1248f interfaceC1248f, C1252j c1252j, boolean z6) {
        try {
            if (o(c1252j, z6)) {
                if (this.f111f == 0) {
                    this.f112g = this.f108c.b();
                }
                this.f111f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e1.InterfaceC1266x
    public synchronized void c(InterfaceC1248f interfaceC1248f, C1252j c1252j, boolean z6, int i6) {
        if (o(c1252j, z6)) {
            this.f113h += i6;
        }
    }

    @Override // A1.d
    public InterfaceC1266x d() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10.f115j >= 524288) goto L22;
     */
    @Override // e1.InterfaceC1266x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void e(e1.InterfaceC1248f r11, e1.C1252j r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = o(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f111f     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            c1.AbstractC1119a.g(r11)     // Catch: java.lang.Throwable -> L72
            c1.c r11 = r10.f108c     // Catch: java.lang.Throwable -> L72
            long r0 = r11.b()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f112g     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f114i     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f114i = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f115j     // Catch: java.lang.Throwable -> L72
            long r6 = r10.f113h     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f115j = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            A1.q r13 = r10.f110e     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.c(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f114i     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.f115j     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            A1.q r11 = r10.f110e     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.f(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.f116k = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.f113h     // Catch: java.lang.Throwable -> L72
            long r8 = r10.f116k     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.p(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.f112g = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4.f113h = r0     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r11 = r4.f111f     // Catch: java.lang.Throwable -> L6f
            int r11 = r11 - r12
            r4.f111f = r11     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.i.e(e1.f, e1.j, boolean):void");
    }

    @Override // A1.d
    public synchronized long f() {
        return this.f116k;
    }

    @Override // e1.InterfaceC1266x
    public void g(InterfaceC1248f interfaceC1248f, C1252j c1252j, boolean z6) {
    }

    @Override // A1.d
    public void h(d.a aVar) {
        this.f107b.d(aVar);
    }

    @Override // A1.d
    public void i(Handler handler, d.a aVar) {
        AbstractC1119a.e(handler);
        AbstractC1119a.e(aVar);
        this.f107b.b(handler, aVar);
    }

    public final long m(int i6) {
        Long l6 = (Long) this.f106a.get(Integer.valueOf(i6));
        if (l6 == null) {
            l6 = (Long) this.f106a.get(0);
        }
        if (l6 == null) {
            l6 = 1000000L;
        }
        return l6.longValue();
    }

    public final void p(int i6, long j6, long j7) {
        if (i6 == 0 && j6 == 0 && j7 == this.f117l) {
            return;
        }
        this.f117l = j7;
        this.f107b.c(i6, j6, j7);
    }

    public final synchronized void q(int i6) {
        Throwable th;
        try {
            try {
                int i7 = this.f118m;
                if (i7 != 0) {
                    try {
                        if (!this.f109d) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.f119n) {
                    i6 = this.f120o;
                }
                if (i7 == i6) {
                    return;
                }
                this.f118m = i6;
                if (i6 == 1 || i6 == 0 || i6 == 8) {
                    return;
                }
                this.f116k = m(i6);
                long b6 = this.f108c.b();
                p(this.f111f > 0 ? (int) (b6 - this.f112g) : 0, this.f113h, this.f116k);
                this.f112g = b6;
                this.f113h = 0L;
                this.f115j = 0L;
                this.f114i = 0L;
                this.f110e.g();
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public i(Context context, Map map, int i6, InterfaceC1121c interfaceC1121c, boolean z6) {
        this.f106a = y.c(map);
        this.f107b = new d.a.C0000a();
        this.f110e = new q(i6);
        this.f108c = interfaceC1121c;
        this.f109d = z6;
        if (context != null) {
            C1138t d6 = C1138t.d(context);
            int f6 = d6.f();
            this.f118m = f6;
            this.f116k = m(f6);
            d6.h(new C1138t.c() { // from class: A1.h
                @Override // c1.C1138t.c
                public final void a(int i7) {
                    i.this.q(i7);
                }
            });
            return;
        }
        this.f118m = 0;
        this.f116k = m(0);
    }
}
