package g1;

import E1.C0310l;
import Z0.C0830b;
import android.content.Context;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.InterfaceC1121c;
import g1.C1334h;
import g1.InterfaceC1344m;
import h1.C1431p0;
import w1.InterfaceC2212D;
import z1.AbstractC2443C;

/* renamed from: g1.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1344m extends Z0.C {

    /* renamed from: g1.m$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        default void D(boolean z6) {
        }

        void F(boolean z6);
    }

    /* renamed from: g1.m$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public long f14728A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f14729B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f14730C;

        /* renamed from: D, reason: collision with root package name */
        public Looper f14731D;

        /* renamed from: E, reason: collision with root package name */
        public boolean f14732E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f14733F;

        /* renamed from: G, reason: collision with root package name */
        public String f14734G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f14735H;

        /* renamed from: a, reason: collision with root package name */
        public final Context f14736a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1121c f14737b;

        /* renamed from: c, reason: collision with root package name */
        public long f14738c;

        /* renamed from: d, reason: collision with root package name */
        public y6.u f14739d;

        /* renamed from: e, reason: collision with root package name */
        public y6.u f14740e;

        /* renamed from: f, reason: collision with root package name */
        public y6.u f14741f;

        /* renamed from: g, reason: collision with root package name */
        public y6.u f14742g;

        /* renamed from: h, reason: collision with root package name */
        public y6.u f14743h;

        /* renamed from: i, reason: collision with root package name */
        public y6.g f14744i;

        /* renamed from: j, reason: collision with root package name */
        public Looper f14745j;

        /* renamed from: k, reason: collision with root package name */
        public int f14746k;

        /* renamed from: l, reason: collision with root package name */
        public C0830b f14747l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f14748m;

        /* renamed from: n, reason: collision with root package name */
        public int f14749n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f14750o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f14751p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f14752q;

        /* renamed from: r, reason: collision with root package name */
        public int f14753r;

        /* renamed from: s, reason: collision with root package name */
        public int f14754s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f14755t;

        /* renamed from: u, reason: collision with root package name */
        public N0 f14756u;

        /* renamed from: v, reason: collision with root package name */
        public long f14757v;

        /* renamed from: w, reason: collision with root package name */
        public long f14758w;

        /* renamed from: x, reason: collision with root package name */
        public long f14759x;

        /* renamed from: y, reason: collision with root package name */
        public InterfaceC1339j0 f14760y;

        /* renamed from: z, reason: collision with root package name */
        public long f14761z;

        public b(final Context context) {
            this(context, new y6.u() { // from class: g1.o
                public final Object get() {
                    return InterfaceC1344m.b.a(context);
                }
            }, new y6.u() { // from class: g1.p
                public final Object get() {
                    return InterfaceC1344m.b.b(context);
                }
            });
        }

        public static /* synthetic */ M0 a(Context context) {
            return new C1340k(context);
        }

        public static /* synthetic */ InterfaceC2212D.a b(Context context) {
            return new w1.r(context, new C0310l());
        }

        public static /* synthetic */ InterfaceC2212D.a c(InterfaceC2212D.a aVar) {
            return aVar;
        }

        public static /* synthetic */ AbstractC2443C e(Context context) {
            return new z1.n(context);
        }

        public InterfaceC1344m f() {
            AbstractC1119a.g(!this.f14732E);
            this.f14732E = true;
            return new S(this, null);
        }

        public b g(final InterfaceC2212D.a aVar) {
            AbstractC1119a.g(!this.f14732E);
            AbstractC1119a.e(aVar);
            this.f14740e = new y6.u() { // from class: g1.n
                public final Object get() {
                    return InterfaceC1344m.b.c(InterfaceC2212D.a.this);
                }
            };
            return this;
        }

        public b(final Context context, y6.u uVar, y6.u uVar2) {
            this(context, uVar, uVar2, new y6.u() { // from class: g1.q
                public final Object get() {
                    return InterfaceC1344m.b.e(context);
                }
            }, new y6.u() { // from class: g1.r
                public final Object get() {
                    return new C1336i();
                }
            }, new y6.u() { // from class: g1.s
                public final Object get() {
                    A1.d n6;
                    n6 = A1.i.n(context);
                    return n6;
                }
            }, new y6.g() { // from class: g1.t
                public final Object apply(Object obj) {
                    return new C1431p0((InterfaceC1121c) obj);
                }
            });
        }

        public b(Context context, y6.u uVar, y6.u uVar2, y6.u uVar3, y6.u uVar4, y6.u uVar5, y6.g gVar) {
            this.f14736a = (Context) AbstractC1119a.e(context);
            this.f14739d = uVar;
            this.f14740e = uVar2;
            this.f14741f = uVar3;
            this.f14742g = uVar4;
            this.f14743h = uVar5;
            this.f14744i = gVar;
            this.f14745j = AbstractC1117K.W();
            this.f14747l = C0830b.f6858g;
            this.f14749n = 0;
            this.f14753r = 1;
            this.f14754s = 0;
            this.f14755t = true;
            this.f14756u = N0.f14389g;
            this.f14757v = 5000L;
            this.f14758w = 15000L;
            this.f14759x = 3000L;
            this.f14760y = new C1334h.b().a();
            this.f14737b = InterfaceC1121c.f10577a;
            this.f14761z = 500L;
            this.f14728A = 2000L;
            this.f14730C = true;
            this.f14734G = "";
            this.f14746k = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        }
    }

    /* renamed from: g1.m$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f14762b = new c(-9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f14763a;

        public c(long j6) {
            this.f14763a = j6;
        }
    }

    Z0.q a();

    void release();
}
