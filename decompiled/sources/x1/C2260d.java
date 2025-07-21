package x1;

import E1.C0305g;
import E1.C0311m;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import E1.r;
import Z0.InterfaceC0837i;
import Z0.q;
import Z0.y;
import a2.C1005a;
import android.util.SparseArray;
import b2.C1084h;
import b2.s;
import b2.t;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import h1.v1;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import x1.InterfaceC2262f;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2260d implements r, InterfaceC2262f {

    /* renamed from: j, reason: collision with root package name */
    public static final b f20410j = new b();

    /* renamed from: k, reason: collision with root package name */
    public static final I f20411k = new I();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0314p f20412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20413b;

    /* renamed from: c, reason: collision with root package name */
    public final q f20414c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f20415d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f20416e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2262f.b f20417f;

    /* renamed from: g, reason: collision with root package name */
    public long f20418g;

    /* renamed from: h, reason: collision with root package name */
    public J f20419h;

    /* renamed from: i, reason: collision with root package name */
    public q[] f20420i;

    /* renamed from: x1.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements O {

        /* renamed from: a, reason: collision with root package name */
        public final int f20421a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20422b;

        /* renamed from: c, reason: collision with root package name */
        public final q f20423c;

        /* renamed from: d, reason: collision with root package name */
        public final C0311m f20424d = new C0311m();

        /* renamed from: e, reason: collision with root package name */
        public q f20425e;

        /* renamed from: f, reason: collision with root package name */
        public O f20426f;

        /* renamed from: g, reason: collision with root package name */
        public long f20427g;

        public a(int i6, int i7, q qVar) {
            this.f20421a = i6;
            this.f20422b = i7;
            this.f20423c = qVar;
        }

        @Override // E1.O
        public void b(C1144z c1144z, int i6, int i7) {
            ((O) AbstractC1117K.i(this.f20426f)).a(c1144z, i6);
        }

        @Override // E1.O
        public int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7) {
            return ((O) AbstractC1117K.i(this.f20426f)).c(interfaceC0837i, i6, z6);
        }

        @Override // E1.O
        public void e(q qVar) {
            q qVar2 = this.f20423c;
            if (qVar2 != null) {
                qVar = qVar.h(qVar2);
            }
            this.f20425e = qVar;
            ((O) AbstractC1117K.i(this.f20426f)).e(this.f20425e);
        }

        @Override // E1.O
        public void f(long j6, int i6, int i7, int i8, O.a aVar) {
            long j7 = this.f20427g;
            if (j7 != -9223372036854775807L && j6 >= j7) {
                this.f20426f = this.f20424d;
            }
            ((O) AbstractC1117K.i(this.f20426f)).f(j6, i6, i7, i8, aVar);
        }

        public void g(InterfaceC2262f.b bVar, long j6) {
            if (bVar == null) {
                this.f20426f = this.f20424d;
                return;
            }
            this.f20427g = j6;
            O a6 = bVar.a(this.f20421a, this.f20422b);
            this.f20426f = a6;
            q qVar = this.f20425e;
            if (qVar != null) {
                a6.e(qVar);
            }
        }
    }

    /* renamed from: x1.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC2262f.a {

        /* renamed from: a, reason: collision with root package name */
        public s.a f20428a = new C1084h();

        /* renamed from: b, reason: collision with root package name */
        public boolean f20429b;

        @Override // x1.InterfaceC2262f.a
        public q c(q qVar) {
            String str;
            if (!this.f20429b || !this.f20428a.b(qVar)) {
                return qVar;
            }
            q.b S5 = qVar.a().o0("application/x-media3-cues").S(this.f20428a.d(qVar));
            StringBuilder sb = new StringBuilder();
            sb.append(qVar.f6990n);
            if (qVar.f6986j != null) {
                str = " " + qVar.f6986j;
            } else {
                str = "";
            }
            sb.append(str);
            return S5.O(sb.toString()).s0(LongCompanionObject.MAX_VALUE).K();
        }

        @Override // x1.InterfaceC2262f.a
        public InterfaceC2262f d(int i6, q qVar, boolean z6, List list, O o6, v1 v1Var) {
            InterfaceC0314p hVar;
            String str = qVar.f6989m;
            if (!y.r(str)) {
                if (y.q(str)) {
                    hVar = new W1.e(this.f20428a, this.f20429b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new M1.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new C1005a();
                } else {
                    int i7 = z6 ? 4 : 0;
                    if (!this.f20429b) {
                        i7 |= 32;
                    }
                    hVar = new Y1.h(this.f20428a, i7, null, null, list, o6);
                }
            } else {
                if (!this.f20429b) {
                    return null;
                }
                hVar = new b2.o(this.f20428a.c(qVar), qVar);
            }
            if (this.f20429b && !y.r(str) && !(hVar.d() instanceof Y1.h) && !(hVar.d() instanceof W1.e)) {
                hVar = new t(hVar, this.f20428a);
            }
            return new C2260d(hVar, i6, qVar);
        }

        @Override // x1.InterfaceC2262f.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b b(boolean z6) {
            this.f20429b = z6;
            return this;
        }

        @Override // x1.InterfaceC2262f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b a(s.a aVar) {
            this.f20428a = (s.a) AbstractC1119a.e(aVar);
            return this;
        }
    }

    public C2260d(InterfaceC0314p interfaceC0314p, int i6, q qVar) {
        this.f20412a = interfaceC0314p;
        this.f20413b = i6;
        this.f20414c = qVar;
    }

    @Override // E1.r
    public O a(int i6, int i7) {
        a aVar = (a) this.f20415d.get(i6);
        if (aVar == null) {
            AbstractC1119a.g(this.f20420i == null);
            aVar = new a(i6, i7, i7 == this.f20413b ? this.f20414c : null);
            aVar.g(this.f20417f, this.f20418g);
            this.f20415d.put(i6, aVar);
        }
        return aVar;
    }

    @Override // x1.InterfaceC2262f
    public boolean b(InterfaceC0315q interfaceC0315q) {
        int g6 = this.f20412a.g(interfaceC0315q, f20411k);
        AbstractC1119a.g(g6 != 1);
        return g6 == 0;
    }

    @Override // x1.InterfaceC2262f
    public q[] c() {
        return this.f20420i;
    }

    @Override // x1.InterfaceC2262f
    public void d(InterfaceC2262f.b bVar, long j6, long j7) {
        this.f20417f = bVar;
        this.f20418g = j7;
        if (!this.f20416e) {
            this.f20412a.c(this);
            if (j6 != -9223372036854775807L) {
                this.f20412a.a(0L, j6);
            }
            this.f20416e = true;
            return;
        }
        InterfaceC0314p interfaceC0314p = this.f20412a;
        if (j6 == -9223372036854775807L) {
            j6 = 0;
        }
        interfaceC0314p.a(0L, j6);
        for (int i6 = 0; i6 < this.f20415d.size(); i6++) {
            ((a) this.f20415d.valueAt(i6)).g(bVar, j7);
        }
    }

    @Override // x1.InterfaceC2262f
    public C0305g e() {
        J j6 = this.f20419h;
        if (j6 instanceof C0305g) {
            return (C0305g) j6;
        }
        return null;
    }

    @Override // E1.r
    public void k() {
        q[] qVarArr = new q[this.f20415d.size()];
        for (int i6 = 0; i6 < this.f20415d.size(); i6++) {
            qVarArr[i6] = (q) AbstractC1119a.i(((a) this.f20415d.valueAt(i6)).f20425e);
        }
        this.f20420i = qVarArr;
    }

    @Override // E1.r
    public void n(J j6) {
        this.f20419h = j6;
    }

    @Override // x1.InterfaceC2262f
    public void release() {
        this.f20412a.release();
    }
}
