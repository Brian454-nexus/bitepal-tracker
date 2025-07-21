package z1;

import Z0.C0830b;
import Z0.G;
import Z0.H;
import Z0.I;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import g1.J0;
import g1.K0;
import g1.L0;
import i1.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import w1.InterfaceC2212D;
import w1.l0;
import z1.C2445a;
import z1.n;
import z1.x;
import z1.z;
import z6.Q;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n extends z implements K0.a {

    /* renamed from: k, reason: collision with root package name */
    public static final Q f21527k = Q.b(new Comparator() { // from class: z1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.t((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final Object f21528d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f21529e;

    /* renamed from: f, reason: collision with root package name */
    public final x.b f21530f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21531g;

    /* renamed from: h, reason: collision with root package name */
    public e f21532h;

    /* renamed from: i, reason: collision with root package name */
    public g f21533i;

    /* renamed from: j, reason: collision with root package name */
    public C0830b f21534j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends i implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final int f21535e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f21536f;

        /* renamed from: g, reason: collision with root package name */
        public final String f21537g;

        /* renamed from: h, reason: collision with root package name */
        public final e f21538h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f21539i;

        /* renamed from: j, reason: collision with root package name */
        public final int f21540j;

        /* renamed from: k, reason: collision with root package name */
        public final int f21541k;

        /* renamed from: l, reason: collision with root package name */
        public final int f21542l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f21543m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f21544n;

        /* renamed from: o, reason: collision with root package name */
        public final int f21545o;

        /* renamed from: p, reason: collision with root package name */
        public final int f21546p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f21547q;

        /* renamed from: r, reason: collision with root package name */
        public final int f21548r;

        /* renamed from: s, reason: collision with root package name */
        public final int f21549s;

        /* renamed from: t, reason: collision with root package name */
        public final int f21550t;

        /* renamed from: u, reason: collision with root package name */
        public final int f21551u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f21552v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f21553w;

        public b(int i6, H h6, int i7, e eVar, int i8, boolean z6, y6.p pVar, int i9) {
            super(i6, h6, i7);
            int i10;
            int i11;
            int i12;
            this.f21538h = eVar;
            int i13 = eVar.f21588s0 ? 24 : 16;
            this.f21543m = eVar.f21584o0 && (i9 & i13) != 0;
            this.f21537g = n.P(this.f21631d.f6980d);
            this.f21539i = K0.s(i8, false);
            int i14 = 0;
            while (true) {
                int size = eVar.f6755n.size();
                i10 = IntCompanionObject.MAX_VALUE;
                if (i14 >= size) {
                    i11 = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    i11 = n.E(this.f21631d, (String) eVar.f6755n.get(i14), false);
                    if (i11 > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f21541k = i14;
            this.f21540j = i11;
            this.f21542l = n.H(this.f21631d.f6982f, eVar.f6756o);
            Z0.q qVar = this.f21631d;
            int i15 = qVar.f6982f;
            this.f21544n = i15 == 0 || (i15 & 1) != 0;
            this.f21547q = (qVar.f6981e & 1) != 0;
            int i16 = qVar.f6966B;
            this.f21548r = i16;
            this.f21549s = qVar.f6967C;
            int i17 = qVar.f6985i;
            this.f21550t = i17;
            this.f21536f = (i17 == -1 || i17 <= eVar.f6758q) && (i16 == -1 || i16 <= eVar.f6757p) && pVar.apply(qVar);
            String[] n02 = AbstractC1117K.n0();
            int i18 = 0;
            while (true) {
                if (i18 >= n02.length) {
                    i12 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    i12 = n.E(this.f21631d, n02[i18], false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f21545o = i18;
            this.f21546p = i12;
            int i19 = 0;
            while (true) {
                if (i19 < eVar.f6759r.size()) {
                    String str = this.f21631d.f6990n;
                    if (str != null && str.equals(eVar.f6759r.get(i19))) {
                        i10 = i19;
                        break;
                    }
                    i19++;
                } else {
                    break;
                }
            }
            this.f21551u = i10;
            this.f21552v = K0.q(i8) == 128;
            this.f21553w = K0.w(i8) == 64;
            this.f21535e = f(i8, z6, i13);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static z6.w e(int i6, H h6, e eVar, int[] iArr, boolean z6, y6.p pVar, int i7) {
            w.a o6 = z6.w.o();
            for (int i8 = 0; i8 < h6.f6702a; i8++) {
                o6.h(new b(i6, h6, i8, eVar, iArr[i8], z6, pVar, i7));
            }
            return o6.k();
        }

        @Override // z1.n.i
        public int a() {
            return this.f21535e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            Q g6 = (this.f21536f && this.f21539i) ? n.f21527k : n.f21527k.g();
            z6.n f6 = z6.n.j().g(this.f21539i, bVar.f21539i).f(Integer.valueOf(this.f21541k), Integer.valueOf(bVar.f21541k), Q.d().g()).d(this.f21540j, bVar.f21540j).d(this.f21542l, bVar.f21542l).g(this.f21547q, bVar.f21547q).g(this.f21544n, bVar.f21544n).f(Integer.valueOf(this.f21545o), Integer.valueOf(bVar.f21545o), Q.d().g()).d(this.f21546p, bVar.f21546p).g(this.f21536f, bVar.f21536f).f(Integer.valueOf(this.f21551u), Integer.valueOf(bVar.f21551u), Q.d().g());
            if (this.f21538h.f6766y) {
                f6 = f6.f(Integer.valueOf(this.f21550t), Integer.valueOf(bVar.f21550t), n.f21527k.g());
            }
            z6.n f7 = f6.g(this.f21552v, bVar.f21552v).g(this.f21553w, bVar.f21553w).f(Integer.valueOf(this.f21548r), Integer.valueOf(bVar.f21548r), g6).f(Integer.valueOf(this.f21549s), Integer.valueOf(bVar.f21549s), g6);
            if (AbstractC1117K.c(this.f21537g, bVar.f21537g)) {
                f7 = f7.f(Integer.valueOf(this.f21550t), Integer.valueOf(bVar.f21550t), g6);
            }
            return f7.i();
        }

        public final int f(int i6, boolean z6, int i7) {
            if (!K0.s(i6, this.f21538h.f21590u0)) {
                return 0;
            }
            if (!this.f21536f && !this.f21538h.f21583n0) {
                return 0;
            }
            e eVar = this.f21538h;
            if (eVar.f6760s.f6772a == 2 && !n.Q(eVar, i6, this.f21631d)) {
                return 0;
            }
            if (!K0.s(i6, false) || !this.f21536f || this.f21631d.f6985i == -1) {
                return 1;
            }
            e eVar2 = this.f21538h;
            if (eVar2.f6767z || eVar2.f6766y) {
                return 1;
            }
            return ((!eVar2.f21592w0 && z6) || eVar2.f6760s.f6772a == 2 || (i6 & i7) == 0) ? 1 : 2;
        }

        @Override // z1.n.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i6;
            String str;
            int i7;
            if (!this.f21538h.f21586q0 && ((i7 = this.f21631d.f6966B) == -1 || i7 != bVar.f21631d.f6966B)) {
                return false;
            }
            if (!this.f21543m && ((str = this.f21631d.f6990n) == null || !TextUtils.equals(str, bVar.f21631d.f6990n))) {
                return false;
            }
            e eVar = this.f21538h;
            if (!eVar.f21585p0 && ((i6 = this.f21631d.f6967C) == -1 || i6 != bVar.f21631d.f6967C)) {
                return false;
            }
            if (eVar.f21587r0) {
                return true;
            }
            return this.f21552v == bVar.f21552v && this.f21553w == bVar.f21553w;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends i implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final int f21554e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21555f;

        public c(int i6, H h6, int i7, e eVar, int i8) {
            super(i6, h6, i7);
            this.f21554e = K0.s(i8, eVar.f21590u0) ? 1 : 0;
            this.f21555f = this.f21631d.d();
        }

        public static int c(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static z6.w e(int i6, H h6, e eVar, int[] iArr) {
            w.a o6 = z6.w.o();
            for (int i7 = 0; i7 < h6.f6702a; i7++) {
                o6.h(new c(i6, h6, i7, eVar, iArr[i7]));
            }
            return o6.k();
        }

        @Override // z1.n.i
        public int a() {
            return this.f21554e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f21555f, cVar.f21555f);
        }

        @Override // z1.n.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21556a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21557b;

        public d(Z0.q qVar, int i6) {
            this.f21556a = (qVar.f6981e & 1) != 0;
            this.f21557b = K0.s(i6, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return z6.n.j().g(this.f21557b, dVar.f21557b).g(this.f21556a, dVar.f21556a).i();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends I {

        /* renamed from: A0, reason: collision with root package name */
        public static final e f21558A0;

        /* renamed from: B0, reason: collision with root package name */
        public static final e f21559B0;

        /* renamed from: C0, reason: collision with root package name */
        public static final String f21560C0;

        /* renamed from: D0, reason: collision with root package name */
        public static final String f21561D0;

        /* renamed from: E0, reason: collision with root package name */
        public static final String f21562E0;

        /* renamed from: F0, reason: collision with root package name */
        public static final String f21563F0;

        /* renamed from: G0, reason: collision with root package name */
        public static final String f21564G0;

        /* renamed from: H0, reason: collision with root package name */
        public static final String f21565H0;

        /* renamed from: I0, reason: collision with root package name */
        public static final String f21566I0;

        /* renamed from: J0, reason: collision with root package name */
        public static final String f21567J0;

        /* renamed from: K0, reason: collision with root package name */
        public static final String f21568K0;

        /* renamed from: L0, reason: collision with root package name */
        public static final String f21569L0;

        /* renamed from: M0, reason: collision with root package name */
        public static final String f21570M0;

        /* renamed from: N0, reason: collision with root package name */
        public static final String f21571N0;

        /* renamed from: O0, reason: collision with root package name */
        public static final String f21572O0;

        /* renamed from: P0, reason: collision with root package name */
        public static final String f21573P0;

        /* renamed from: Q0, reason: collision with root package name */
        public static final String f21574Q0;

        /* renamed from: R0, reason: collision with root package name */
        public static final String f21575R0;

        /* renamed from: S0, reason: collision with root package name */
        public static final String f21576S0;

        /* renamed from: T0, reason: collision with root package name */
        public static final String f21577T0;

        /* renamed from: U0, reason: collision with root package name */
        public static final String f21578U0;

        /* renamed from: j0, reason: collision with root package name */
        public final boolean f21579j0;

        /* renamed from: k0, reason: collision with root package name */
        public final boolean f21580k0;

        /* renamed from: l0, reason: collision with root package name */
        public final boolean f21581l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f21582m0;

        /* renamed from: n0, reason: collision with root package name */
        public final boolean f21583n0;

        /* renamed from: o0, reason: collision with root package name */
        public final boolean f21584o0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f21585p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f21586q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f21587r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f21588s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f21589t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f21590u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f21591v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f21592w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f21593x0;

        /* renamed from: y0, reason: collision with root package name */
        public final SparseArray f21594y0;

        /* renamed from: z0, reason: collision with root package name */
        public final SparseBooleanArray f21595z0;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends I.c {

            /* renamed from: C, reason: collision with root package name */
            public boolean f21596C;

            /* renamed from: D, reason: collision with root package name */
            public boolean f21597D;

            /* renamed from: E, reason: collision with root package name */
            public boolean f21598E;

            /* renamed from: F, reason: collision with root package name */
            public boolean f21599F;

            /* renamed from: G, reason: collision with root package name */
            public boolean f21600G;

            /* renamed from: H, reason: collision with root package name */
            public boolean f21601H;

            /* renamed from: I, reason: collision with root package name */
            public boolean f21602I;

            /* renamed from: J, reason: collision with root package name */
            public boolean f21603J;

            /* renamed from: K, reason: collision with root package name */
            public boolean f21604K;

            /* renamed from: L, reason: collision with root package name */
            public boolean f21605L;

            /* renamed from: M, reason: collision with root package name */
            public boolean f21606M;

            /* renamed from: N, reason: collision with root package name */
            public boolean f21607N;

            /* renamed from: O, reason: collision with root package name */
            public boolean f21608O;

            /* renamed from: P, reason: collision with root package name */
            public boolean f21609P;

            /* renamed from: Q, reason: collision with root package name */
            public boolean f21610Q;

            /* renamed from: R, reason: collision with root package name */
            public final SparseArray f21611R;

            /* renamed from: S, reason: collision with root package name */
            public final SparseBooleanArray f21612S;

            public static SparseArray a0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    sparseArray2.put(sparseArray.keyAt(i6), new HashMap((Map) sparseArray.valueAt(i6)));
                }
                return sparseArray2;
            }

            @Override // Z0.I.c
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public e C() {
                return new e(this);
            }

            public final void b0() {
                this.f21596C = true;
                this.f21597D = false;
                this.f21598E = true;
                this.f21599F = false;
                this.f21600G = true;
                this.f21601H = false;
                this.f21602I = false;
                this.f21603J = false;
                this.f21604K = false;
                this.f21605L = true;
                this.f21606M = true;
                this.f21607N = true;
                this.f21608O = false;
                this.f21609P = true;
                this.f21610Q = false;
            }

            public a c0(I i6) {
                super.E(i6);
                return this;
            }

            @Override // Z0.I.c
            /* renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a F(Context context) {
                super.F(context);
                return this;
            }

            @Override // Z0.I.c
            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a G(int i6, int i7, boolean z6) {
                super.G(i6, i7, z6);
                return this;
            }

            @Override // Z0.I.c
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public a H(Context context, boolean z6) {
                super.H(context, z6);
                return this;
            }

            public a() {
                this.f21611R = new SparseArray();
                this.f21612S = new SparseBooleanArray();
                b0();
            }

            public a(Context context) {
                super(context);
                this.f21611R = new SparseArray();
                this.f21612S = new SparseBooleanArray();
                b0();
            }

            public a(e eVar) {
                super(eVar);
                this.f21596C = eVar.f21579j0;
                this.f21597D = eVar.f21580k0;
                this.f21598E = eVar.f21581l0;
                this.f21599F = eVar.f21582m0;
                this.f21600G = eVar.f21583n0;
                this.f21601H = eVar.f21584o0;
                this.f21602I = eVar.f21585p0;
                this.f21603J = eVar.f21586q0;
                this.f21604K = eVar.f21587r0;
                this.f21605L = eVar.f21588s0;
                this.f21606M = eVar.f21589t0;
                this.f21607N = eVar.f21590u0;
                this.f21608O = eVar.f21591v0;
                this.f21609P = eVar.f21592w0;
                this.f21610Q = eVar.f21593x0;
                this.f21611R = a0(eVar.f21594y0);
                this.f21612S = eVar.f21595z0.clone();
            }
        }

        static {
            e C6 = new a().C();
            f21558A0 = C6;
            f21559B0 = C6;
            f21560C0 = AbstractC1117K.x0(1000);
            f21561D0 = AbstractC1117K.x0(1001);
            f21562E0 = AbstractC1117K.x0(1002);
            f21563F0 = AbstractC1117K.x0(1003);
            f21564G0 = AbstractC1117K.x0(1004);
            f21565H0 = AbstractC1117K.x0(1005);
            f21566I0 = AbstractC1117K.x0(1006);
            f21567J0 = AbstractC1117K.x0(1007);
            f21568K0 = AbstractC1117K.x0(1008);
            f21569L0 = AbstractC1117K.x0(1009);
            f21570M0 = AbstractC1117K.x0(1010);
            f21571N0 = AbstractC1117K.x0(1011);
            f21572O0 = AbstractC1117K.x0(1012);
            f21573P0 = AbstractC1117K.x0(1013);
            f21574Q0 = AbstractC1117K.x0(1014);
            f21575R0 = AbstractC1117K.x0(1015);
            f21576S0 = AbstractC1117K.x0(1016);
            f21577T0 = AbstractC1117K.x0(1017);
            f21578U0 = AbstractC1117K.x0(1018);
        }

        public static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i6 = 0; i6 < size; i6++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i6)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i6 = 0; i6 < size; i6++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i6));
                if (indexOfKey < 0 || !e((Map) sparseArray.valueAt(i6), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                l0 l0Var = (l0) entry.getKey();
                if (!map2.containsKey(l0Var) || !AbstractC1117K.c(entry.getValue(), map2.get(l0Var))) {
                    return false;
                }
            }
            return true;
        }

        public static e g(Context context) {
            return new a(context).C();
        }

        @Override // Z0.I
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f21579j0 == eVar.f21579j0 && this.f21580k0 == eVar.f21580k0 && this.f21581l0 == eVar.f21581l0 && this.f21582m0 == eVar.f21582m0 && this.f21583n0 == eVar.f21583n0 && this.f21584o0 == eVar.f21584o0 && this.f21585p0 == eVar.f21585p0 && this.f21586q0 == eVar.f21586q0 && this.f21587r0 == eVar.f21587r0 && this.f21588s0 == eVar.f21588s0 && this.f21589t0 == eVar.f21589t0 && this.f21590u0 == eVar.f21590u0 && this.f21591v0 == eVar.f21591v0 && this.f21592w0 == eVar.f21592w0 && this.f21593x0 == eVar.f21593x0 && c(this.f21595z0, eVar.f21595z0) && d(this.f21594y0, eVar.f21594y0)) {
                    return true;
                }
            }
            return false;
        }

        public a f() {
            return new a();
        }

        public boolean h(int i6) {
            return this.f21595z0.get(i6);
        }

        @Override // Z0.I
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f21579j0 ? 1 : 0)) * 31) + (this.f21580k0 ? 1 : 0)) * 31) + (this.f21581l0 ? 1 : 0)) * 31) + (this.f21582m0 ? 1 : 0)) * 31) + (this.f21583n0 ? 1 : 0)) * 31) + (this.f21584o0 ? 1 : 0)) * 31) + (this.f21585p0 ? 1 : 0)) * 31) + (this.f21586q0 ? 1 : 0)) * 31) + (this.f21587r0 ? 1 : 0)) * 31) + (this.f21588s0 ? 1 : 0)) * 31) + (this.f21589t0 ? 1 : 0)) * 31) + (this.f21590u0 ? 1 : 0)) * 31) + (this.f21591v0 ? 1 : 0)) * 31) + (this.f21592w0 ? 1 : 0)) * 31) + (this.f21593x0 ? 1 : 0);
        }

        public f i(int i6, l0 l0Var) {
            Map map = (Map) this.f21594y0.get(i6);
            if (map != null) {
                android.support.v4.media.session.b.a(map.get(l0Var));
            }
            return null;
        }

        public boolean j(int i6, l0 l0Var) {
            Map map = (Map) this.f21594y0.get(i6);
            return map != null && map.containsKey(l0Var);
        }

        public e(a aVar) {
            super(aVar);
            this.f21579j0 = aVar.f21596C;
            this.f21580k0 = aVar.f21597D;
            this.f21581l0 = aVar.f21598E;
            this.f21582m0 = aVar.f21599F;
            this.f21583n0 = aVar.f21600G;
            this.f21584o0 = aVar.f21601H;
            this.f21585p0 = aVar.f21602I;
            this.f21586q0 = aVar.f21603J;
            this.f21587r0 = aVar.f21604K;
            this.f21588s0 = aVar.f21605L;
            this.f21589t0 = aVar.f21606M;
            this.f21590u0 = aVar.f21607N;
            this.f21591v0 = aVar.f21608O;
            this.f21592w0 = aVar.f21609P;
            this.f21593x0 = aVar.f21610Q;
            this.f21594y0 = aVar.f21611R;
            this.f21595z0 = aVar.f21612S;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f21613a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21614b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f21615c;

        /* renamed from: d, reason: collision with root package name */
        public Spatializer$OnSpatializerStateChangedListener f21616d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f21617a;

            public a(n nVar) {
                this.f21617a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
                this.f21617a.N();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
                this.f21617a.N();
            }
        }

        public g(Spatializer spatializer) {
            int immersiveAudioLevel;
            this.f21613a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f21614b = immersiveAudioLevel != 0;
        }

        public static g g(Context context) {
            Spatializer spatializer;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            spatializer = audioManager.getSpatializer();
            return new g(spatializer);
        }

        public boolean a(C0830b c0830b, Z0.q qVar) {
            boolean canBeSpatialized;
            int N5 = AbstractC1117K.N(("audio/eac3-joc".equals(qVar.f6990n) && qVar.f6966B == 16) ? 12 : qVar.f6966B);
            if (N5 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(N5);
            int i6 = qVar.f6967C;
            if (i6 != -1) {
                channelMask.setSampleRate(i6);
            }
            canBeSpatialized = this.f21613a.canBeSpatialized(c0830b.a().f6870a, channelMask.build());
            return canBeSpatialized;
        }

        public void b(n nVar, Looper looper) {
            if (this.f21616d == null && this.f21615c == null) {
                this.f21616d = new a(nVar);
                Handler handler = new Handler(looper);
                this.f21615c = handler;
                Spatializer spatializer = this.f21613a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new U(handler), this.f21616d);
            }
        }

        public boolean c() {
            boolean isAvailable;
            isAvailable = this.f21613a.isAvailable();
            return isAvailable;
        }

        public boolean d() {
            boolean isEnabled;
            isEnabled = this.f21613a.isEnabled();
            return isEnabled;
        }

        public boolean e() {
            return this.f21614b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f21616d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f21615c == null) {
                return;
            }
            this.f21613a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) AbstractC1117K.i(this.f21615c)).removeCallbacksAndMessages(null);
            this.f21615c = null;
            this.f21616d = null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends i implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final int f21619e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f21620f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21621g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f21622h;

        /* renamed from: i, reason: collision with root package name */
        public final int f21623i;

        /* renamed from: j, reason: collision with root package name */
        public final int f21624j;

        /* renamed from: k, reason: collision with root package name */
        public final int f21625k;

        /* renamed from: l, reason: collision with root package name */
        public final int f21626l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f21627m;

        public h(int i6, H h6, int i7, e eVar, int i8, String str) {
            super(i6, h6, i7);
            int i9;
            int i10 = 0;
            this.f21620f = K0.s(i8, false);
            int i11 = this.f21631d.f6981e & (~eVar.f6763v);
            this.f21621g = (i11 & 1) != 0;
            this.f21622h = (i11 & 2) != 0;
            z6.w y6 = eVar.f6761t.isEmpty() ? z6.w.y("") : eVar.f6761t;
            int i12 = 0;
            while (true) {
                if (i12 >= y6.size()) {
                    i12 = IntCompanionObject.MAX_VALUE;
                    i9 = 0;
                    break;
                } else {
                    i9 = n.E(this.f21631d, (String) y6.get(i12), eVar.f6764w);
                    if (i9 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f21623i = i12;
            this.f21624j = i9;
            int H6 = n.H(this.f21631d.f6982f, eVar.f6762u);
            this.f21625k = H6;
            this.f21627m = (this.f21631d.f6982f & 1088) != 0;
            int E6 = n.E(this.f21631d, str, n.P(str) == null);
            this.f21626l = E6;
            boolean z6 = i9 > 0 || (eVar.f6761t.isEmpty() && H6 > 0) || this.f21621g || (this.f21622h && E6 > 0);
            if (K0.s(i8, eVar.f21590u0) && z6) {
                i10 = 1;
            }
            this.f21619e = i10;
        }

        public static int c(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static z6.w e(int i6, H h6, e eVar, int[] iArr, String str) {
            w.a o6 = z6.w.o();
            for (int i7 = 0; i7 < h6.f6702a; i7++) {
                o6.h(new h(i6, h6, i7, eVar, iArr[i7], str));
            }
            return o6.k();
        }

        @Override // z1.n.i
        public int a() {
            return this.f21619e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            z6.n d6 = z6.n.j().g(this.f21620f, hVar.f21620f).f(Integer.valueOf(this.f21623i), Integer.valueOf(hVar.f21623i), Q.d().g()).d(this.f21624j, hVar.f21624j).d(this.f21625k, hVar.f21625k).g(this.f21621g, hVar.f21621g).f(Boolean.valueOf(this.f21622h), Boolean.valueOf(hVar.f21622h), this.f21624j == 0 ? Q.d() : Q.d().g()).d(this.f21626l, hVar.f21626l);
            if (this.f21625k == 0) {
                d6 = d6.h(this.f21627m, hVar.f21627m);
            }
            return d6.i();
        }

        @Override // z1.n.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        public final int f21628a;

        /* renamed from: b, reason: collision with root package name */
        public final H f21629b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21630c;

        /* renamed from: d, reason: collision with root package name */
        public final Z0.q f21631d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface a {
            List a(int i6, H h6, int[] iArr);
        }

        public i(int i6, H h6, int i7) {
            this.f21628a = i6;
            this.f21629b = h6;
            this.f21630c = i7;
            this.f21631d = h6.a(i7);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class j extends i {

        /* renamed from: e, reason: collision with root package name */
        public final boolean f21632e;

        /* renamed from: f, reason: collision with root package name */
        public final e f21633f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21634g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f21635h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f21636i;

        /* renamed from: j, reason: collision with root package name */
        public final int f21637j;

        /* renamed from: k, reason: collision with root package name */
        public final int f21638k;

        /* renamed from: l, reason: collision with root package name */
        public final int f21639l;

        /* renamed from: m, reason: collision with root package name */
        public final int f21640m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f21641n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f21642o;

        /* renamed from: p, reason: collision with root package name */
        public final int f21643p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f21644q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f21645r;

        /* renamed from: s, reason: collision with root package name */
        public final int f21646s;

        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(int r5, Z0.H r6, int r7, z1.n.e r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.n.j.<init>(int, Z0.H, int, z1.n$e, int, int, boolean):void");
        }

        public static int e(j jVar, j jVar2) {
            z6.n g6 = z6.n.j().g(jVar.f21635h, jVar2.f21635h).d(jVar.f21640m, jVar2.f21640m).g(jVar.f21641n, jVar2.f21641n).g(jVar.f21636i, jVar2.f21636i).g(jVar.f21632e, jVar2.f21632e).g(jVar.f21634g, jVar2.f21634g).f(Integer.valueOf(jVar.f21639l), Integer.valueOf(jVar2.f21639l), Q.d().g()).g(jVar.f21644q, jVar2.f21644q).g(jVar.f21645r, jVar2.f21645r);
            if (jVar.f21644q && jVar.f21645r) {
                g6 = g6.d(jVar.f21646s, jVar2.f21646s);
            }
            return g6.i();
        }

        public static int f(j jVar, j jVar2) {
            Q g6 = (jVar.f21632e && jVar.f21635h) ? n.f21527k : n.f21527k.g();
            z6.n j6 = z6.n.j();
            if (jVar.f21633f.f6766y) {
                j6 = j6.f(Integer.valueOf(jVar.f21637j), Integer.valueOf(jVar2.f21637j), n.f21527k.g());
            }
            return j6.f(Integer.valueOf(jVar.f21638k), Integer.valueOf(jVar2.f21638k), g6).f(Integer.valueOf(jVar.f21637j), Integer.valueOf(jVar2.f21637j), g6).i();
        }

        public static int g(List list, List list2) {
            return z6.n.j().f((j) Collections.max(list, new Comparator() { // from class: z1.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e6;
                    e6 = n.j.e((n.j) obj, (n.j) obj2);
                    return e6;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: z1.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e6;
                    e6 = n.j.e((n.j) obj, (n.j) obj2);
                    return e6;
                }
            }), new Comparator() { // from class: z1.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e6;
                    e6 = n.j.e((n.j) obj, (n.j) obj2);
                    return e6;
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: z1.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f6;
                    f6 = n.j.f((n.j) obj, (n.j) obj2);
                    return f6;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: z1.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f6;
                    f6 = n.j.f((n.j) obj, (n.j) obj2);
                    return f6;
                }
            }), new Comparator() { // from class: z1.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f6;
                    f6 = n.j.f((n.j) obj, (n.j) obj2);
                    return f6;
                }
            }).i();
        }

        public static z6.w h(int i6, H h6, e eVar, int[] iArr, int i7) {
            int F6 = n.F(h6, eVar.f6750i, eVar.f6751j, eVar.f6752k);
            w.a o6 = z6.w.o();
            for (int i8 = 0; i8 < h6.f6702a; i8++) {
                int d6 = h6.a(i8).d();
                o6.h(new j(i6, h6, i8, eVar, iArr[i8], i7, F6 == Integer.MAX_VALUE || (d6 != -1 && d6 <= F6)));
            }
            return o6.k();
        }

        @Override // z1.n.i
        public int a() {
            return this.f21643p;
        }

        public final int i(int i6, int i7) {
            if ((this.f21631d.f6982f & 16384) != 0 || !K0.s(i6, this.f21633f.f21590u0)) {
                return 0;
            }
            if (!this.f21632e && !this.f21633f.f21579j0) {
                return 0;
            }
            if (!K0.s(i6, false) || !this.f21634g || !this.f21632e || this.f21631d.f6985i == -1) {
                return 1;
            }
            e eVar = this.f21633f;
            return (eVar.f6767z || eVar.f6766y || (i6 & i7) == 0) ? 1 : 2;
        }

        @Override // z1.n.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f21642o && !AbstractC1117K.c(this.f21631d.f6990n, jVar.f21631d.f6990n)) {
                return false;
            }
            if (this.f21633f.f21582m0) {
                return true;
            }
            return this.f21644q == jVar.f21644q && this.f21645r == jVar.f21645r;
        }
    }

    public n(Context context) {
        this(context, new C2445a.b());
    }

    public static void B(z.a aVar, e eVar, x.a[] aVarArr) {
        int d6 = aVar.d();
        for (int i6 = 0; i6 < d6; i6++) {
            l0 f6 = aVar.f(i6);
            if (eVar.j(i6, f6)) {
                eVar.i(i6, f6);
                aVarArr[i6] = null;
            }
        }
    }

    public static void C(z.a aVar, I i6, x.a[] aVarArr) {
        int d6 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < d6; i7++) {
            D(aVar.f(i7), i6, hashMap);
        }
        D(aVar.h(), i6, hashMap);
        for (int i8 = 0; i8 < d6; i8++) {
            android.support.v4.media.session.b.a(hashMap.get(Integer.valueOf(aVar.e(i8))));
        }
    }

    public static void D(l0 l0Var, I i6, Map map) {
        for (int i7 = 0; i7 < l0Var.f20070a; i7++) {
            android.support.v4.media.session.b.a(i6.f6740A.get(l0Var.b(i7)));
        }
    }

    public static int E(Z0.q qVar, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(qVar.f6980d)) {
            return 4;
        }
        String P5 = P(str);
        String P6 = P(qVar.f6980d);
        if (P6 == null || P5 == null) {
            return (z6 && P6 == null) ? 1 : 0;
        }
        if (P6.startsWith(P5) || P5.startsWith(P6)) {
            return 3;
        }
        return AbstractC1117K.e1(P6, "-")[0].equals(AbstractC1117K.e1(P5, "-")[0]) ? 2 : 0;
    }

    public static int F(H h6, int i6, int i7, boolean z6) {
        int i8;
        int i9 = IntCompanionObject.MAX_VALUE;
        if (i6 != Integer.MAX_VALUE && i7 != Integer.MAX_VALUE) {
            for (int i10 = 0; i10 < h6.f6702a; i10++) {
                Z0.q a6 = h6.a(i10);
                int i11 = a6.f6996t;
                if (i11 > 0 && (i8 = a6.f6997u) > 0) {
                    Point G6 = G(z6, i6, i7, i11, i8);
                    int i12 = a6.f6996t;
                    int i13 = a6.f6997u;
                    int i14 = i12 * i13;
                    if (i12 >= ((int) (G6.x * 0.98f)) && i13 >= ((int) (G6.y * 0.98f)) && i14 < i9) {
                        i9 = i14;
                    }
                }
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point G(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = c1.AbstractC1117K.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = c1.AbstractC1117K.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.n.G(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int H(int i6, int i7) {
        return (i6 == 0 || i6 != i7) ? Integer.bitCount(i6 & i7) : IntCompanionObject.MAX_VALUE;
    }

    public static int I(String str) {
        if (str == null) {
            return 0;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean K(Z0.q qVar) {
        String str = qVar.f6990n;
        if (str == null) {
            return false;
        }
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c6 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static void L(e eVar, z.a aVar, int[][][] iArr, L0[] l0Arr, x[] xVarArr) {
        int i6 = -1;
        boolean z6 = false;
        int i7 = 0;
        for (int i8 = 0; i8 < aVar.d(); i8++) {
            int e6 = aVar.e(i8);
            x xVar = xVarArr[i8];
            if (e6 != 1 && xVar != null) {
                return;
            }
            if (e6 == 1 && xVar != null && xVar.length() == 1) {
                if (Q(eVar, iArr[i8][aVar.f(i8).d(xVar.e())][xVar.k(0)], xVar.n())) {
                    i7++;
                    i6 = i8;
                }
            }
        }
        if (i7 == 1) {
            int i9 = eVar.f6760s.f6773b ? 1 : 2;
            L0 l02 = l0Arr[i6];
            if (l02 != null && l02.f14379b) {
                z6 = true;
            }
            l0Arr[i6] = new L0(i9, z6);
        }
    }

    public static void M(z.a aVar, int[][][] iArr, L0[] l0Arr, x[] xVarArr) {
        boolean z6;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < aVar.d(); i8++) {
            int e6 = aVar.e(i8);
            x xVar = xVarArr[i8];
            if ((e6 == 1 || e6 == 2) && xVar != null && R(iArr[i8], aVar.f(i8), xVar)) {
                if (e6 == 1) {
                    if (i7 != -1) {
                        z6 = false;
                        break;
                    }
                    i7 = i8;
                } else {
                    if (i6 != -1) {
                        z6 = false;
                        break;
                    }
                    i6 = i8;
                }
            }
        }
        z6 = true;
        if (z6 && ((i7 == -1 || i6 == -1) ? false : true)) {
            L0 l02 = new L0(0, true);
            l0Arr[i7] = l02;
            l0Arr[i6] = l02;
        }
    }

    public static String P(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean Q(e eVar, int i6, Z0.q qVar) {
        if (K0.M(i6) == 0) {
            return false;
        }
        if (eVar.f6760s.f6774c && (K0.M(i6) & 2048) == 0) {
            return false;
        }
        if (eVar.f6760s.f6773b) {
            boolean z6 = (qVar.f6969E == 0 && qVar.f6970F == 0) ? false : true;
            boolean z7 = (K0.M(i6) & 1024) != 0;
            if (z6 && !z7) {
                return false;
            }
        }
        return true;
    }

    public static boolean R(int[][] iArr, l0 l0Var, x xVar) {
        if (xVar == null) {
            return false;
        }
        int d6 = l0Var.d(xVar.e());
        for (int i6 = 0; i6 < xVar.length(); i6++) {
            if (K0.y(iArr[d6][xVar.k(i6)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List r(final n nVar, e eVar, boolean z6, int[] iArr, int i6, H h6, int[] iArr2) {
        nVar.getClass();
        return b.e(i6, h6, eVar, iArr2, z6, new y6.p() { // from class: z1.m
            public final boolean apply(Object obj) {
                boolean J6;
                J6 = n.this.J((Z0.q) obj);
                return J6;
            }
        }, iArr[i6]);
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public final boolean J(Z0.q qVar) {
        boolean z6;
        g gVar;
        g gVar2;
        synchronized (this.f21528d) {
            try {
                if (this.f21532h.f21589t0) {
                    if (!this.f21531g) {
                        if (qVar.f6966B > 2) {
                            if (K(qVar)) {
                                if (AbstractC1117K.f10560a >= 32 && (gVar2 = this.f21533i) != null && gVar2.e()) {
                                }
                            }
                            if (AbstractC1117K.f10560a < 32 || (gVar = this.f21533i) == null || !gVar.e() || !this.f21533i.c() || !this.f21533i.d() || !this.f21533i.a(this.f21534j, qVar)) {
                                z6 = false;
                            }
                        }
                    }
                }
                z6 = true;
            } finally {
            }
        }
        return z6;
    }

    public final void N() {
        boolean z6;
        g gVar;
        synchronized (this.f21528d) {
            try {
                z6 = this.f21532h.f21589t0 && !this.f21531g && AbstractC1117K.f10560a >= 32 && (gVar = this.f21533i) != null && gVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            e();
        }
    }

    public final void O(J0 j02) {
        boolean z6;
        synchronized (this.f21528d) {
            z6 = this.f21532h.f21593x0;
        }
        if (z6) {
            f(j02);
        }
    }

    public x.a[] S(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int d6 = aVar.d();
        x.a[] aVarArr = new x.a[d6];
        Pair Y5 = Y(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair U5 = (eVar.f6765x || Y5 == null) ? U(aVar, iArr, eVar) : null;
        if (U5 != null) {
            aVarArr[((Integer) U5.second).intValue()] = (x.a) U5.first;
        } else if (Y5 != null) {
            aVarArr[((Integer) Y5.second).intValue()] = (x.a) Y5.first;
        }
        Pair T5 = T(aVar, iArr, iArr2, eVar);
        if (T5 != null) {
            aVarArr[((Integer) T5.second).intValue()] = (x.a) T5.first;
        }
        if (T5 != null) {
            Object obj = T5.first;
            str = ((x.a) obj).f21647a.a(((x.a) obj).f21648b[0]).f6980d;
        }
        Pair W5 = W(aVar, iArr, eVar, str);
        if (W5 != null) {
            aVarArr[((Integer) W5.second).intValue()] = (x.a) W5.first;
        }
        for (int i6 = 0; i6 < d6; i6++) {
            int e6 = aVar.e(i6);
            if (e6 != 2 && e6 != 1 && e6 != 3 && e6 != 4) {
                aVarArr[i6] = V(e6, aVar.f(i6), iArr[i6], eVar);
            }
        }
        return aVarArr;
    }

    public Pair T(z.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 < aVar.d()) {
                if (2 == aVar.e(i6) && aVar.f(i6).f20070a > 0) {
                    z6 = true;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        return X(1, aVar, iArr, new i.a() { // from class: z1.g
            @Override // z1.n.i.a
            public final List a(int i7, H h6, int[] iArr3) {
                return n.r(n.this, eVar, z6, iArr2, i7, h6, iArr3);
            }
        }, new Comparator() { // from class: z1.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.c((List) obj, (List) obj2);
            }
        });
    }

    public Pair U(z.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f6760s.f6772a == 2) {
            return null;
        }
        return X(4, aVar, iArr, new i.a() { // from class: z1.e
            @Override // z1.n.i.a
            public final List a(int i6, H h6, int[] iArr2) {
                List e6;
                e6 = n.c.e(i6, h6, n.e.this, iArr2);
                return e6;
            }
        }, new Comparator() { // from class: z1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.c((List) obj, (List) obj2);
            }
        });
    }

    public x.a V(int i6, l0 l0Var, int[][] iArr, e eVar) {
        if (eVar.f6760s.f6772a == 2) {
            return null;
        }
        int i7 = 0;
        H h6 = null;
        d dVar = null;
        for (int i8 = 0; i8 < l0Var.f20070a; i8++) {
            H b6 = l0Var.b(i8);
            int[] iArr2 = iArr[i8];
            for (int i9 = 0; i9 < b6.f6702a; i9++) {
                if (K0.s(iArr2[i9], eVar.f21590u0)) {
                    d dVar2 = new d(b6.a(i9), iArr2[i9]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        h6 = b6;
                        i7 = i9;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (h6 == null) {
            return null;
        }
        return new x.a(h6, i7);
    }

    public Pair W(z.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f6760s.f6772a == 2) {
            return null;
        }
        return X(3, aVar, iArr, new i.a() { // from class: z1.k
            @Override // z1.n.i.a
            public final List a(int i6, H h6, int[] iArr2) {
                List e6;
                e6 = n.h.e(i6, h6, n.e.this, iArr2, str);
                return e6;
            }
        }, new Comparator() { // from class: z1.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.c((List) obj, (List) obj2);
            }
        });
    }

    public final Pair X(int i6, z.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i7;
        z6.w wVar;
        z.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d6 = aVar3.d();
        int i8 = 0;
        while (i8 < d6) {
            if (i6 == aVar3.e(i8)) {
                l0 f6 = aVar3.f(i8);
                for (int i9 = 0; i9 < f6.f20070a; i9++) {
                    H b6 = f6.b(i9);
                    List a6 = aVar2.a(i8, b6, iArr[i8][i9]);
                    boolean[] zArr = new boolean[b6.f6702a];
                    int i10 = 0;
                    while (i10 < b6.f6702a) {
                        i iVar = (i) a6.get(i10);
                        int a7 = iVar.a();
                        if (zArr[i10] || a7 == 0) {
                            i7 = d6;
                        } else {
                            if (a7 == 1) {
                                wVar = z6.w.y(iVar);
                            } else {
                                z6.w arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i11 = i10 + 1;
                                while (i11 < b6.f6702a) {
                                    i iVar2 = (i) a6.get(i11);
                                    int i12 = d6;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i11] = true;
                                    }
                                    i11++;
                                    d6 = i12;
                                }
                                wVar = arrayList2;
                            }
                            i7 = d6;
                            arrayList.add(wVar);
                        }
                        i10++;
                        d6 = i7;
                    }
                }
            }
            i8++;
            aVar3 = aVar;
            d6 = d6;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((i) list.get(i13)).f21630c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new x.a(iVar3.f21629b, iArr2), Integer.valueOf(iVar3.f21628a));
    }

    public Pair Y(z.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        if (eVar.f6760s.f6772a == 2) {
            return null;
        }
        return X(2, aVar, iArr, new i.a() { // from class: z1.i
            @Override // z1.n.i.a
            public final List a(int i6, H h6, int[] iArr3) {
                List h7;
                h7 = n.j.h(i6, h6, n.e.this, iArr3, iArr2[i6]);
                return h7;
            }
        }, new Comparator() { // from class: z1.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // g1.K0.a
    public void a(J0 j02) {
        O(j02);
    }

    @Override // z1.AbstractC2443C
    public K0.a c() {
        return this;
    }

    @Override // z1.AbstractC2443C
    public boolean g() {
        return true;
    }

    @Override // z1.AbstractC2443C
    public void i() {
        g gVar;
        synchronized (this.f21528d) {
            try {
                if (AbstractC1117K.f10560a >= 32 && (gVar = this.f21533i) != null) {
                    gVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.i();
    }

    @Override // z1.AbstractC2443C
    public void k(C0830b c0830b) {
        boolean equals;
        synchronized (this.f21528d) {
            equals = this.f21534j.equals(c0830b);
            this.f21534j = c0830b;
        }
        if (equals) {
            return;
        }
        N();
    }

    @Override // z1.z
    public final Pair o(z.a aVar, int[][][] iArr, int[] iArr2, InterfaceC2212D.b bVar, G g6) {
        e eVar;
        g gVar;
        synchronized (this.f21528d) {
            try {
                eVar = this.f21532h;
                if (eVar.f21589t0 && AbstractC1117K.f10560a >= 32 && (gVar = this.f21533i) != null) {
                    gVar.b(this, (Looper) AbstractC1119a.i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int d6 = aVar.d();
        x.a[] S5 = S(aVar, iArr, iArr2, eVar);
        C(aVar, eVar, S5);
        B(aVar, eVar, S5);
        for (int i6 = 0; i6 < d6; i6++) {
            int e6 = aVar.e(i6);
            if (eVar.h(i6) || eVar.f6741B.contains(Integer.valueOf(e6))) {
                S5[i6] = null;
            }
        }
        x[] a6 = this.f21530f.a(S5, b(), bVar, g6);
        L0[] l0Arr = new L0[d6];
        for (int i7 = 0; i7 < d6; i7++) {
            l0Arr[i7] = (eVar.h(i7) || eVar.f6741B.contains(Integer.valueOf(aVar.e(i7))) || (aVar.e(i7) != -2 && a6[i7] == null)) ? null : L0.f14377c;
        }
        if (eVar.f21591v0) {
            M(aVar, iArr, l0Arr, a6);
        }
        if (eVar.f6760s.f6772a != 0) {
            L(eVar, aVar, iArr, l0Arr, a6);
        }
        return Pair.create(l0Arr, a6);
    }

    public n(Context context, x.b bVar) {
        this(context, e.g(context), bVar);
    }

    public n(Context context, I i6, x.b bVar) {
        this(i6, bVar, context);
    }

    public n(I i6, x.b bVar, Context context) {
        this.f21528d = new Object();
        this.f21529e = context != null ? context.getApplicationContext() : null;
        this.f21530f = bVar;
        if (i6 instanceof e) {
            this.f21532h = (e) i6;
        } else {
            this.f21532h = (context == null ? e.f21558A0 : e.g(context)).f().c0(i6).C();
        }
        this.f21534j = C0830b.f6858g;
        boolean z6 = context != null && AbstractC1117K.F0(context);
        this.f21531g = z6;
        if (!z6 && context != null && AbstractC1117K.f10560a >= 32) {
            this.f21533i = g.g(context);
        }
        if (this.f21532h.f21589t0 && context == null) {
            AbstractC1133o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
