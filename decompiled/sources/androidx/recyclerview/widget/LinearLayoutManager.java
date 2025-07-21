package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements h.InterfaceC0149h {

    /* renamed from: A, reason: collision with root package name */
    public int f9614A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9615B;

    /* renamed from: C, reason: collision with root package name */
    public d f9616C;

    /* renamed from: D, reason: collision with root package name */
    public final a f9617D;

    /* renamed from: E, reason: collision with root package name */
    public final b f9618E;

    /* renamed from: F, reason: collision with root package name */
    public int f9619F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f9620G;

    /* renamed from: r, reason: collision with root package name */
    public int f9621r;

    /* renamed from: s, reason: collision with root package name */
    public c f9622s;

    /* renamed from: t, reason: collision with root package name */
    public k f9623t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9624u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9625v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9626w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9627x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9628y;

    /* renamed from: z, reason: collision with root package name */
    public int f9629z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public k f9630a;

        /* renamed from: b, reason: collision with root package name */
        public int f9631b;

        /* renamed from: c, reason: collision with root package name */
        public int f9632c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9633d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9634e;

        public a() {
            e();
        }

        public void a() {
            this.f9632c = this.f9633d ? this.f9630a.i() : this.f9630a.m();
        }

        public void b(View view, int i6) {
            if (this.f9633d) {
                this.f9632c = this.f9630a.d(view) + this.f9630a.o();
            } else {
                this.f9632c = this.f9630a.g(view);
            }
            this.f9631b = i6;
        }

        public void c(View view, int i6) {
            int o6 = this.f9630a.o();
            if (o6 >= 0) {
                b(view, i6);
                return;
            }
            this.f9631b = i6;
            if (this.f9633d) {
                int i7 = (this.f9630a.i() - o6) - this.f9630a.d(view);
                this.f9632c = this.f9630a.i() - i7;
                if (i7 > 0) {
                    int e6 = this.f9632c - this.f9630a.e(view);
                    int m6 = this.f9630a.m();
                    int min = e6 - (m6 + Math.min(this.f9630a.g(view) - m6, 0));
                    if (min < 0) {
                        this.f9632c += Math.min(i7, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g6 = this.f9630a.g(view);
            int m7 = g6 - this.f9630a.m();
            this.f9632c = g6;
            if (m7 > 0) {
                int i8 = (this.f9630a.i() - Math.min(0, (this.f9630a.i() - o6) - this.f9630a.d(view))) - (g6 + this.f9630a.e(view));
                if (i8 < 0) {
                    this.f9632c -= Math.min(m7, -i8);
                }
            }
        }

        public boolean d(View view, RecyclerView.A a6) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a6.b();
        }

        public void e() {
            this.f9631b = -1;
            this.f9632c = IntCompanionObject.MIN_VALUE;
            this.f9633d = false;
            this.f9634e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f9631b + ", mCoordinate=" + this.f9632c + ", mLayoutFromEnd=" + this.f9633d + ", mValid=" + this.f9634e + '}';
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f9635a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9636b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9637c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9638d;

        public void a() {
            this.f9635a = 0;
            this.f9636b = false;
            this.f9637c = false;
            this.f9638d = false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f9640b;

        /* renamed from: c, reason: collision with root package name */
        public int f9641c;

        /* renamed from: d, reason: collision with root package name */
        public int f9642d;

        /* renamed from: e, reason: collision with root package name */
        public int f9643e;

        /* renamed from: f, reason: collision with root package name */
        public int f9644f;

        /* renamed from: g, reason: collision with root package name */
        public int f9645g;

        /* renamed from: k, reason: collision with root package name */
        public int f9649k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f9651m;

        /* renamed from: a, reason: collision with root package name */
        public boolean f9639a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f9646h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f9647i = 0;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9648j = false;

        /* renamed from: l, reason: collision with root package name */
        public List f9650l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f6 = f(view);
            if (f6 == null) {
                this.f9642d = -1;
            } else {
                this.f9642d = ((RecyclerView.q) f6.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.A a6) {
            int i6 = this.f9642d;
            return i6 >= 0 && i6 < a6.b();
        }

        public View d(RecyclerView.w wVar) {
            if (this.f9650l != null) {
                return e();
            }
            View o6 = wVar.o(this.f9642d);
            this.f9642d += this.f9643e;
            return o6;
        }

        public final View e() {
            int size = this.f9650l.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = ((RecyclerView.D) this.f9650l.get(i6)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f9642d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a6;
            int size = this.f9650l.size();
            View view2 = null;
            int i6 = IntCompanionObject.MAX_VALUE;
            for (int i7 = 0; i7 < size; i7++) {
                View view3 = ((RecyclerView.D) this.f9650l.get(i7)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a6 = (qVar.a() - this.f9642d) * this.f9643e) >= 0 && a6 < i6) {
                    if (a6 == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i6 = a6;
                }
            }
            return view2;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f9652a;

        /* renamed from: b, reason: collision with root package name */
        public int f9653b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9654c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.f9652a >= 0;
        }

        public void c() {
            this.f9652a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f9652a);
            parcel.writeInt(this.f9653b);
            parcel.writeInt(this.f9654c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f9652a = parcel.readInt();
            this.f9653b = parcel.readInt();
            this.f9654c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f9652a = dVar.f9652a;
            this.f9653b = dVar.f9653b;
            this.f9654c = dVar.f9654c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public final boolean A2(RecyclerView.w wVar, RecyclerView.A a6, a aVar) {
        View d22;
        boolean z6 = false;
        if (J() == 0) {
            return false;
        }
        View V5 = V();
        if (V5 != null && aVar.d(V5, a6)) {
            aVar.c(V5, g0(V5));
            return true;
        }
        boolean z7 = this.f9624u;
        boolean z8 = this.f9627x;
        if (z7 != z8 || (d22 = d2(wVar, a6, aVar.f9633d, z8)) == null) {
            return false;
        }
        aVar.b(d22, g0(d22));
        if (!a6.e() && H1()) {
            int g6 = this.f9623t.g(d22);
            int d6 = this.f9623t.d(d22);
            int m6 = this.f9623t.m();
            int i6 = this.f9623t.i();
            boolean z9 = d6 <= m6 && g6 < m6;
            if (g6 >= i6 && d6 > i6) {
                z6 = true;
            }
            if (z9 || z6) {
                if (aVar.f9633d) {
                    m6 = i6;
                }
                aVar.f9632c = m6;
            }
        }
        return true;
    }

    public final boolean B2(RecyclerView.A a6, a aVar) {
        int i6;
        if (!a6.e() && (i6 = this.f9629z) != -1) {
            if (i6 >= 0 && i6 < a6.b()) {
                aVar.f9631b = this.f9629z;
                d dVar = this.f9616C;
                if (dVar != null && dVar.a()) {
                    boolean z6 = this.f9616C.f9654c;
                    aVar.f9633d = z6;
                    if (z6) {
                        aVar.f9632c = this.f9623t.i() - this.f9616C.f9653b;
                    } else {
                        aVar.f9632c = this.f9623t.m() + this.f9616C.f9653b;
                    }
                    return true;
                }
                if (this.f9614A != Integer.MIN_VALUE) {
                    boolean z7 = this.f9626w;
                    aVar.f9633d = z7;
                    if (z7) {
                        aVar.f9632c = this.f9623t.i() - this.f9614A;
                    } else {
                        aVar.f9632c = this.f9623t.m() + this.f9614A;
                    }
                    return true;
                }
                View C6 = C(this.f9629z);
                if (C6 == null) {
                    if (J() > 0) {
                        aVar.f9633d = (this.f9629z < g0(I(0))) == this.f9626w;
                    }
                    aVar.a();
                } else {
                    if (this.f9623t.e(C6) > this.f9623t.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f9623t.g(C6) - this.f9623t.m() < 0) {
                        aVar.f9632c = this.f9623t.m();
                        aVar.f9633d = false;
                        return true;
                    }
                    if (this.f9623t.i() - this.f9623t.d(C6) < 0) {
                        aVar.f9632c = this.f9623t.i();
                        aVar.f9633d = true;
                        return true;
                    }
                    aVar.f9632c = aVar.f9633d ? this.f9623t.d(C6) + this.f9623t.o() : this.f9623t.g(C6);
                }
                return true;
            }
            this.f9629z = -1;
            this.f9614A = IntCompanionObject.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View C(int i6) {
        int J6 = J();
        if (J6 == 0) {
            return null;
        }
        int g02 = i6 - g0(I(0));
        if (g02 >= 0 && g02 < J6) {
            View I6 = I(g02);
            if (g0(I6) == i6) {
                return I6;
            }
        }
        return super.C(i6);
    }

    public final void C2(RecyclerView.w wVar, RecyclerView.A a6, a aVar) {
        if (B2(a6, aVar) || A2(wVar, a6, aVar)) {
            return;
        }
        aVar.a();
        aVar.f9631b = this.f9627x ? a6.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    public final void D2(int i6, int i7, boolean z6, RecyclerView.A a6) {
        int m6;
        this.f9622s.f9651m = t2();
        this.f9622s.f9644f = i6;
        int[] iArr = this.f9620G;
        iArr[0] = 0;
        iArr[1] = 0;
        I1(a6, iArr);
        int max = Math.max(0, this.f9620G[0]);
        int max2 = Math.max(0, this.f9620G[1]);
        boolean z7 = i6 == 1;
        c cVar = this.f9622s;
        int i8 = z7 ? max2 : max;
        cVar.f9646h = i8;
        if (!z7) {
            max = max2;
        }
        cVar.f9647i = max;
        if (z7) {
            cVar.f9646h = i8 + this.f9623t.j();
            View g22 = g2();
            c cVar2 = this.f9622s;
            cVar2.f9643e = this.f9626w ? -1 : 1;
            int g02 = g0(g22);
            c cVar3 = this.f9622s;
            cVar2.f9642d = g02 + cVar3.f9643e;
            cVar3.f9640b = this.f9623t.d(g22);
            m6 = this.f9623t.d(g22) - this.f9623t.i();
        } else {
            View h22 = h2();
            this.f9622s.f9646h += this.f9623t.m();
            c cVar4 = this.f9622s;
            cVar4.f9643e = this.f9626w ? 1 : -1;
            int g03 = g0(h22);
            c cVar5 = this.f9622s;
            cVar4.f9642d = g03 + cVar5.f9643e;
            cVar5.f9640b = this.f9623t.g(h22);
            m6 = (-this.f9623t.g(h22)) + this.f9623t.m();
        }
        c cVar6 = this.f9622s;
        cVar6.f9641c = i7;
        if (z6) {
            cVar6.f9641c = i7 - m6;
        }
        cVar6.f9645g = m6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean E1() {
        return (X() == 1073741824 || o0() == 1073741824 || !p0()) ? false : true;
    }

    public final void E2(int i6, int i7) {
        this.f9622s.f9641c = this.f9623t.i() - i7;
        c cVar = this.f9622s;
        cVar.f9643e = this.f9626w ? -1 : 1;
        cVar.f9642d = i6;
        cVar.f9644f = 1;
        cVar.f9640b = i7;
        cVar.f9645g = IntCompanionObject.MIN_VALUE;
    }

    public final void F2(a aVar) {
        E2(aVar.f9631b, aVar.f9632c);
    }

    public final void G2(int i6, int i7) {
        this.f9622s.f9641c = i7 - this.f9623t.m();
        c cVar = this.f9622s;
        cVar.f9642d = i6;
        cVar.f9643e = this.f9626w ? 1 : -1;
        cVar.f9644f = -1;
        cVar.f9640b = i7;
        cVar.f9645g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.H0(recyclerView, wVar);
        if (this.f9615B) {
            i1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H1() {
        return this.f9616C == null && this.f9624u == this.f9627x;
    }

    public final void H2(a aVar) {
        G2(aVar.f9631b, aVar.f9632c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View I0(View view, int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        int N12;
        u2();
        if (J() == 0 || (N12 = N1(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        P1();
        D2(N12, (int) (this.f9623t.n() * 0.33333334f), false, a6);
        c cVar = this.f9622s;
        cVar.f9645g = IntCompanionObject.MIN_VALUE;
        cVar.f9639a = false;
        Q1(wVar, cVar, a6, true);
        View c22 = N12 == -1 ? c2() : b2();
        View h22 = N12 == -1 ? h2() : g2();
        if (!h22.hasFocusable()) {
            return c22;
        }
        if (c22 == null) {
            return null;
        }
        return h22;
    }

    public void I1(RecyclerView.A a6, int[] iArr) {
        int i6;
        int i22 = i2(a6);
        if (this.f9622s.f9644f == -1) {
            i6 = 0;
        } else {
            i6 = i22;
            i22 = 0;
        }
        iArr[0] = i22;
        iArr[1] = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(AccessibilityEvent accessibilityEvent) {
        super.J0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(V1());
            accessibilityEvent.setToIndex(Y1());
        }
    }

    public void J1(RecyclerView.A a6, c cVar, RecyclerView.p.c cVar2) {
        int i6 = cVar.f9642d;
        if (i6 < 0 || i6 >= a6.b()) {
            return;
        }
        cVar2.a(i6, Math.max(0, cVar.f9645g));
    }

    public final int K1(RecyclerView.A a6) {
        if (J() == 0) {
            return 0;
        }
        P1();
        return m.a(a6, this.f9623t, U1(!this.f9628y, true), T1(!this.f9628y, true), this, this.f9628y);
    }

    public final int L1(RecyclerView.A a6) {
        if (J() == 0) {
            return 0;
        }
        P1();
        return m.b(a6, this.f9623t, U1(!this.f9628y, true), T1(!this.f9628y, true), this, this.f9628y, this.f9626w);
    }

    public final int M1(RecyclerView.A a6) {
        if (J() == 0) {
            return 0;
        }
        P1();
        return m.c(a6, this.f9623t, U1(!this.f9628y, true), T1(!this.f9628y, true), this, this.f9628y);
    }

    public int N1(int i6) {
        if (i6 == 1) {
            return (this.f9621r != 1 && k2()) ? 1 : -1;
        }
        if (i6 == 2) {
            return (this.f9621r != 1 && k2()) ? -1 : 1;
        }
        if (i6 == 17) {
            if (this.f9621r == 0) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i6 == 33) {
            if (this.f9621r == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i6 == 66) {
            if (this.f9621r == 0) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i6 == 130 && this.f9621r == 1) {
            return 1;
        }
        return IntCompanionObject.MIN_VALUE;
    }

    public c O1() {
        return new c();
    }

    public void P1() {
        if (this.f9622s == null) {
            this.f9622s = O1();
        }
    }

    public int Q1(RecyclerView.w wVar, c cVar, RecyclerView.A a6, boolean z6) {
        int i6 = cVar.f9641c;
        int i7 = cVar.f9645g;
        if (i7 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                cVar.f9645g = i7 + i6;
            }
            p2(wVar, cVar);
        }
        int i8 = cVar.f9641c + cVar.f9646h;
        b bVar = this.f9618E;
        while (true) {
            if ((!cVar.f9651m && i8 <= 0) || !cVar.c(a6)) {
                break;
            }
            bVar.a();
            m2(wVar, a6, cVar, bVar);
            if (!bVar.f9636b) {
                cVar.f9640b += bVar.f9635a * cVar.f9644f;
                if (!bVar.f9637c || cVar.f9650l != null || !a6.e()) {
                    int i9 = cVar.f9641c;
                    int i10 = bVar.f9635a;
                    cVar.f9641c = i9 - i10;
                    i8 -= i10;
                }
                int i11 = cVar.f9645g;
                if (i11 != Integer.MIN_VALUE) {
                    int i12 = i11 + bVar.f9635a;
                    cVar.f9645g = i12;
                    int i13 = cVar.f9641c;
                    if (i13 < 0) {
                        cVar.f9645g = i12 + i13;
                    }
                    p2(wVar, cVar);
                }
                if (z6 && bVar.f9638d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - cVar.f9641c;
    }

    public int R1() {
        View a22 = a2(0, J(), true, false);
        if (a22 == null) {
            return -1;
        }
        return g0(a22);
    }

    public final View S1() {
        return Z1(0, J());
    }

    public View T1(boolean z6, boolean z7) {
        return this.f9626w ? a2(0, J(), z6, z7) : a2(J() - 1, -1, z6, z7);
    }

    public View U1(boolean z6, boolean z7) {
        return this.f9626w ? a2(J() - 1, -1, z6, z7) : a2(0, J(), z6, z7);
    }

    public int V1() {
        View a22 = a2(0, J(), false, true);
        if (a22 == null) {
            return -1;
        }
        return g0(a22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.A a6) {
        int i6;
        int i7;
        int i8;
        int i9;
        int e22;
        int i10;
        View C6;
        int g6;
        int i11;
        int i12 = -1;
        if (!(this.f9616C == null && this.f9629z == -1) && a6.b() == 0) {
            i1(wVar);
            return;
        }
        d dVar = this.f9616C;
        if (dVar != null && dVar.a()) {
            this.f9629z = this.f9616C.f9652a;
        }
        P1();
        this.f9622s.f9639a = false;
        u2();
        View V5 = V();
        a aVar = this.f9617D;
        if (!aVar.f9634e || this.f9629z != -1 || this.f9616C != null) {
            aVar.e();
            a aVar2 = this.f9617D;
            aVar2.f9633d = this.f9626w ^ this.f9627x;
            C2(wVar, a6, aVar2);
            this.f9617D.f9634e = true;
        } else if (V5 != null && (this.f9623t.g(V5) >= this.f9623t.i() || this.f9623t.d(V5) <= this.f9623t.m())) {
            this.f9617D.c(V5, g0(V5));
        }
        c cVar = this.f9622s;
        cVar.f9644f = cVar.f9649k >= 0 ? 1 : -1;
        int[] iArr = this.f9620G;
        iArr[0] = 0;
        iArr[1] = 0;
        I1(a6, iArr);
        int max = Math.max(0, this.f9620G[0]) + this.f9623t.m();
        int max2 = Math.max(0, this.f9620G[1]) + this.f9623t.j();
        if (a6.e() && (i10 = this.f9629z) != -1 && this.f9614A != Integer.MIN_VALUE && (C6 = C(i10)) != null) {
            if (this.f9626w) {
                i11 = this.f9623t.i() - this.f9623t.d(C6);
                g6 = this.f9614A;
            } else {
                g6 = this.f9623t.g(C6) - this.f9623t.m();
                i11 = this.f9614A;
            }
            int i13 = i11 - g6;
            if (i13 > 0) {
                max += i13;
            } else {
                max2 -= i13;
            }
        }
        a aVar3 = this.f9617D;
        if (!aVar3.f9633d ? !this.f9626w : this.f9626w) {
            i12 = 1;
        }
        o2(wVar, a6, aVar3, i12);
        w(wVar);
        this.f9622s.f9651m = t2();
        this.f9622s.f9648j = a6.e();
        this.f9622s.f9647i = 0;
        a aVar4 = this.f9617D;
        if (aVar4.f9633d) {
            H2(aVar4);
            c cVar2 = this.f9622s;
            cVar2.f9646h = max;
            Q1(wVar, cVar2, a6, false);
            c cVar3 = this.f9622s;
            i7 = cVar3.f9640b;
            int i14 = cVar3.f9642d;
            int i15 = cVar3.f9641c;
            if (i15 > 0) {
                max2 += i15;
            }
            F2(this.f9617D);
            c cVar4 = this.f9622s;
            cVar4.f9646h = max2;
            cVar4.f9642d += cVar4.f9643e;
            Q1(wVar, cVar4, a6, false);
            c cVar5 = this.f9622s;
            i6 = cVar5.f9640b;
            int i16 = cVar5.f9641c;
            if (i16 > 0) {
                G2(i14, i7);
                c cVar6 = this.f9622s;
                cVar6.f9646h = i16;
                Q1(wVar, cVar6, a6, false);
                i7 = this.f9622s.f9640b;
            }
        } else {
            F2(aVar4);
            c cVar7 = this.f9622s;
            cVar7.f9646h = max2;
            Q1(wVar, cVar7, a6, false);
            c cVar8 = this.f9622s;
            i6 = cVar8.f9640b;
            int i17 = cVar8.f9642d;
            int i18 = cVar8.f9641c;
            if (i18 > 0) {
                max += i18;
            }
            H2(this.f9617D);
            c cVar9 = this.f9622s;
            cVar9.f9646h = max;
            cVar9.f9642d += cVar9.f9643e;
            Q1(wVar, cVar9, a6, false);
            c cVar10 = this.f9622s;
            i7 = cVar10.f9640b;
            int i19 = cVar10.f9641c;
            if (i19 > 0) {
                E2(i17, i6);
                c cVar11 = this.f9622s;
                cVar11.f9646h = i19;
                Q1(wVar, cVar11, a6, false);
                i6 = this.f9622s.f9640b;
            }
        }
        if (J() > 0) {
            if (this.f9626w ^ this.f9627x) {
                int e23 = e2(i6, wVar, a6, true);
                i8 = i7 + e23;
                i9 = i6 + e23;
                e22 = f2(i8, wVar, a6, false);
            } else {
                int f22 = f2(i7, wVar, a6, true);
                i8 = i7 + f22;
                i9 = i6 + f22;
                e22 = e2(i9, wVar, a6, false);
            }
            i7 = i8 + e22;
            i6 = i9 + e22;
        }
        n2(wVar, a6, i7, i6);
        if (a6.e()) {
            this.f9617D.e();
        } else {
            this.f9623t.s();
        }
        this.f9624u = this.f9627x;
    }

    public int W1() {
        View a22 = a2(J() - 1, -1, true, false);
        if (a22 == null) {
            return -1;
        }
        return g0(a22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.A a6) {
        super.X0(a6);
        this.f9616C = null;
        this.f9629z = -1;
        this.f9614A = IntCompanionObject.MIN_VALUE;
        this.f9617D.e();
    }

    public final View X1() {
        return Z1(J() - 1, -1);
    }

    public int Y1() {
        View a22 = a2(J() - 1, -1, false, true);
        if (a22 == null) {
            return -1;
        }
        return g0(a22);
    }

    public View Z1(int i6, int i7) {
        int i8;
        int i9;
        P1();
        if (i7 <= i6 && i7 >= i6) {
            return I(i6);
        }
        if (this.f9623t.g(I(i6)) < this.f9623t.m()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return this.f9621r == 0 ? this.f9788e.a(i6, i7, i8, i9) : this.f9789f.a(i6, i7, i8, i9);
    }

    @Override // androidx.recyclerview.widget.h.InterfaceC0149h
    public void a(View view, View view2, int i6, int i7) {
        g("Cannot drop a view during a scroll or layout calculation");
        P1();
        u2();
        int g02 = g0(view);
        int g03 = g0(view2);
        char c6 = g02 < g03 ? (char) 1 : (char) 65535;
        if (this.f9626w) {
            if (c6 == 1) {
                w2(g03, this.f9623t.i() - (this.f9623t.g(view2) + this.f9623t.e(view)));
                return;
            } else {
                w2(g03, this.f9623t.i() - this.f9623t.d(view2));
                return;
            }
        }
        if (c6 == 65535) {
            w2(g03, this.f9623t.g(view2));
        } else {
            w2(g03, this.f9623t.d(view2) - this.f9623t.e(view));
        }
    }

    public View a2(int i6, int i7, boolean z6, boolean z7) {
        P1();
        int i8 = z6 ? 24579 : 320;
        int i9 = z7 ? 320 : 0;
        return this.f9621r == 0 ? this.f9788e.a(i6, i7, i8, i9) : this.f9789f.a(i6, i7, i8, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f9616C = dVar;
            if (this.f9629z != -1) {
                dVar.c();
            }
            r1();
        }
    }

    public final View b2() {
        return this.f9626w ? S1() : X1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable c1() {
        if (this.f9616C != null) {
            return new d(this.f9616C);
        }
        d dVar = new d();
        if (J() <= 0) {
            dVar.c();
            return dVar;
        }
        P1();
        boolean z6 = this.f9624u ^ this.f9626w;
        dVar.f9654c = z6;
        if (z6) {
            View g22 = g2();
            dVar.f9653b = this.f9623t.i() - this.f9623t.d(g22);
            dVar.f9652a = g0(g22);
            return dVar;
        }
        View h22 = h2();
        dVar.f9652a = g0(h22);
        dVar.f9653b = this.f9623t.g(h22) - this.f9623t.m();
        return dVar;
    }

    public final View c2() {
        return this.f9626w ? X1() : S1();
    }

    public View d2(RecyclerView.w wVar, RecyclerView.A a6, boolean z6, boolean z7) {
        int i6;
        int i7;
        int i8;
        P1();
        int J6 = J();
        if (z7) {
            i7 = J() - 1;
            i6 = -1;
            i8 = -1;
        } else {
            i6 = J6;
            i7 = 0;
            i8 = 1;
        }
        int b6 = a6.b();
        int m6 = this.f9623t.m();
        int i9 = this.f9623t.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i7 != i6) {
            View I6 = I(i7);
            int g02 = g0(I6);
            int g6 = this.f9623t.g(I6);
            int d6 = this.f9623t.d(I6);
            if (g02 >= 0 && g02 < b6) {
                if (!((RecyclerView.q) I6.getLayoutParams()).c()) {
                    boolean z8 = d6 <= m6 && g6 < m6;
                    boolean z9 = g6 >= i9 && d6 > i9;
                    if (!z8 && !z9) {
                        return I6;
                    }
                    if (z6) {
                        if (!z9) {
                            if (view != null) {
                            }
                            view = I6;
                        }
                        view2 = I6;
                    } else {
                        if (!z8) {
                            if (view != null) {
                            }
                            view = I6;
                        }
                        view2 = I6;
                    }
                } else if (view3 == null) {
                    view3 = I6;
                }
            }
            i7 += i8;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int e2(int i6, RecyclerView.w wVar, RecyclerView.A a6, boolean z6) {
        int i7;
        int i8 = this.f9623t.i() - i6;
        if (i8 <= 0) {
            return 0;
        }
        int i9 = -v2(-i8, wVar, a6);
        int i10 = i6 + i9;
        if (!z6 || (i7 = this.f9623t.i() - i10) <= 0) {
            return i9;
        }
        this.f9623t.r(i7);
        return i7 + i9;
    }

    public final int f2(int i6, RecyclerView.w wVar, RecyclerView.A a6, boolean z6) {
        int m6;
        int m7 = i6 - this.f9623t.m();
        if (m7 <= 0) {
            return 0;
        }
        int i7 = -v2(m7, wVar, a6);
        int i8 = i6 + i7;
        if (!z6 || (m6 = i8 - this.f9623t.m()) <= 0) {
            return i7;
        }
        this.f9623t.r(-m6);
        return i7 - m6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.f9616C == null) {
            super.g(str);
        }
    }

    public final View g2() {
        return I(this.f9626w ? 0 : J() - 1);
    }

    public final View h2() {
        return I(this.f9626w ? J() - 1 : 0);
    }

    public int i2(RecyclerView.A a6) {
        if (a6.d()) {
            return this.f9623t.n();
        }
        return 0;
    }

    public int j2() {
        return this.f9621r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f9621r == 0;
    }

    public boolean k2() {
        return Y() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f9621r == 1;
    }

    public boolean l2() {
        return this.f9628y;
    }

    public void m2(RecyclerView.w wVar, RecyclerView.A a6, c cVar, b bVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int d02;
        int f6;
        int i10;
        int i11;
        View d6 = cVar.d(wVar);
        if (d6 == null) {
            bVar.f9636b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d6.getLayoutParams();
        if (cVar.f9650l == null) {
            if (this.f9626w == (cVar.f9644f == -1)) {
                d(d6);
            } else {
                e(d6, 0);
            }
        } else {
            if (this.f9626w == (cVar.f9644f == -1)) {
                b(d6);
            } else {
                c(d6, 0);
            }
        }
        z0(d6, 0, 0);
        bVar.f9635a = this.f9623t.e(d6);
        if (this.f9621r == 1) {
            if (k2()) {
                f6 = n0() - e0();
                d02 = f6 - this.f9623t.f(d6);
            } else {
                d02 = d0();
                f6 = this.f9623t.f(d6) + d02;
            }
            if (cVar.f9644f == -1) {
                i11 = cVar.f9640b;
                i10 = i11 - bVar.f9635a;
            } else {
                i10 = cVar.f9640b;
                i11 = bVar.f9635a + i10;
            }
            int i12 = d02;
            i9 = i10;
            i8 = i12;
            i7 = i11;
            i6 = f6;
        } else {
            int f02 = f0();
            int f7 = this.f9623t.f(d6) + f02;
            if (cVar.f9644f == -1) {
                int i13 = cVar.f9640b;
                i8 = i13 - bVar.f9635a;
                i6 = i13;
                i7 = f7;
            } else {
                int i14 = cVar.f9640b;
                i6 = bVar.f9635a + i14;
                i7 = f7;
                i8 = i14;
            }
            i9 = f02;
        }
        y0(d6, i8, i9, i6, i7);
        if (qVar.c() || qVar.b()) {
            bVar.f9637c = true;
        }
        bVar.f9638d = d6.hasFocusable();
    }

    public final void n2(RecyclerView.w wVar, RecyclerView.A a6, int i6, int i7) {
        if (!a6.g() || J() == 0 || a6.e() || !H1()) {
            return;
        }
        List k6 = wVar.k();
        int size = k6.size();
        int g02 = g0(I(0));
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView.D d6 = (RecyclerView.D) k6.get(i10);
            if (!d6.isRemoved()) {
                if ((d6.getLayoutPosition() < g02) != this.f9626w) {
                    i8 += this.f9623t.e(d6.itemView);
                } else {
                    i9 += this.f9623t.e(d6.itemView);
                }
            }
        }
        this.f9622s.f9650l = k6;
        if (i8 > 0) {
            G2(g0(h2()), i6);
            c cVar = this.f9622s;
            cVar.f9646h = i8;
            cVar.f9641c = 0;
            cVar.a();
            Q1(wVar, this.f9622s, a6, false);
        }
        if (i9 > 0) {
            E2(g0(g2()), i7);
            c cVar2 = this.f9622s;
            cVar2.f9646h = i9;
            cVar2.f9641c = 0;
            cVar2.a();
            Q1(wVar, this.f9622s, a6, false);
        }
        this.f9622s.f9650l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i6, int i7, RecyclerView.A a6, RecyclerView.p.c cVar) {
        if (this.f9621r != 0) {
            i6 = i7;
        }
        if (J() == 0 || i6 == 0) {
            return;
        }
        P1();
        D2(i6 > 0 ? 1 : -1, Math.abs(i6), true, a6);
        J1(a6, this.f9622s, cVar);
    }

    public void o2(RecyclerView.w wVar, RecyclerView.A a6, a aVar, int i6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i6, RecyclerView.p.c cVar) {
        boolean z6;
        int i7;
        d dVar = this.f9616C;
        if (dVar == null || !dVar.a()) {
            u2();
            z6 = this.f9626w;
            i7 = this.f9629z;
            if (i7 == -1) {
                i7 = z6 ? i6 - 1 : 0;
            }
        } else {
            d dVar2 = this.f9616C;
            z6 = dVar2.f9654c;
            i7 = dVar2.f9652a;
        }
        int i8 = z6 ? -1 : 1;
        for (int i9 = 0; i9 < this.f9619F && i7 >= 0 && i7 < i6; i9++) {
            cVar.a(i7, 0);
            i7 += i8;
        }
    }

    public final void p2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f9639a || cVar.f9651m) {
            return;
        }
        int i6 = cVar.f9645g;
        int i7 = cVar.f9647i;
        if (cVar.f9644f == -1) {
            r2(wVar, i6, i7);
        } else {
            s2(wVar, i6, i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.A a6) {
        return K1(a6);
    }

    public final void q2(RecyclerView.w wVar, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        if (i7 <= i6) {
            while (i6 > i7) {
                l1(i6, wVar);
                i6--;
            }
        } else {
            for (int i8 = i7 - 1; i8 >= i6; i8--) {
                l1(i8, wVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.A a6) {
        return L1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r0() {
        return true;
    }

    public final void r2(RecyclerView.w wVar, int i6, int i7) {
        int J6 = J();
        if (i6 < 0) {
            return;
        }
        int h6 = (this.f9623t.h() - i6) + i7;
        if (this.f9626w) {
            for (int i8 = 0; i8 < J6; i8++) {
                View I6 = I(i8);
                if (this.f9623t.g(I6) < h6 || this.f9623t.q(I6) < h6) {
                    q2(wVar, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = J6 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View I7 = I(i10);
            if (this.f9623t.g(I7) < h6 || this.f9623t.q(I7) < h6) {
                q2(wVar, i9, i10);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.A a6) {
        return M1(a6);
    }

    public final void s2(RecyclerView.w wVar, int i6, int i7) {
        if (i6 < 0) {
            return;
        }
        int i8 = i6 - i7;
        int J6 = J();
        if (!this.f9626w) {
            for (int i9 = 0; i9 < J6; i9++) {
                View I6 = I(i9);
                if (this.f9623t.d(I6) > i8 || this.f9623t.p(I6) > i8) {
                    q2(wVar, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = J6 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View I7 = I(i11);
            if (this.f9623t.d(I7) > i8 || this.f9623t.p(I7) > i8) {
                q2(wVar, i10, i11);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.A a6) {
        return K1(a6);
    }

    public boolean t2() {
        return this.f9623t.k() == 0 && this.f9623t.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.A a6) {
        return L1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u1(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        if (this.f9621r == 1) {
            return 0;
        }
        return v2(i6, wVar, a6);
    }

    public final void u2() {
        if (this.f9621r == 1 || !k2()) {
            this.f9626w = this.f9625v;
        } else {
            this.f9626w = !this.f9625v;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.A a6) {
        return M1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void v1(int i6) {
        this.f9629z = i6;
        this.f9614A = IntCompanionObject.MIN_VALUE;
        d dVar = this.f9616C;
        if (dVar != null) {
            dVar.c();
        }
        r1();
    }

    public int v2(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        if (J() == 0 || i6 == 0) {
            return 0;
        }
        P1();
        this.f9622s.f9639a = true;
        int i7 = i6 > 0 ? 1 : -1;
        int abs = Math.abs(i6);
        D2(i7, abs, true, a6);
        c cVar = this.f9622s;
        int Q12 = cVar.f9645g + Q1(wVar, cVar, a6, false);
        if (Q12 < 0) {
            return 0;
        }
        if (abs > Q12) {
            i6 = i7 * Q12;
        }
        this.f9623t.r(-i6);
        this.f9622s.f9649k = i6;
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        if (this.f9621r == 0) {
            return 0;
        }
        return v2(i6, wVar, a6);
    }

    public void w2(int i6, int i7) {
        this.f9629z = i6;
        this.f9614A = i7;
        d dVar = this.f9616C;
        if (dVar != null) {
            dVar.c();
        }
        r1();
    }

    public void x2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i6);
        }
        g(null);
        if (i6 != this.f9621r || this.f9623t == null) {
            k b6 = k.b(this, i6);
            this.f9623t = b6;
            this.f9617D.f9630a = b6;
            this.f9621r = i6;
            r1();
        }
    }

    public void y2(boolean z6) {
        g(null);
        if (z6 == this.f9625v) {
            return;
        }
        this.f9625v = z6;
        r1();
    }

    public void z2(boolean z6) {
        g(null);
        if (this.f9627x == z6) {
            return;
        }
        this.f9627x = z6;
        r1();
    }

    public LinearLayoutManager(Context context, int i6, boolean z6) {
        this.f9621r = 1;
        this.f9625v = false;
        this.f9626w = false;
        this.f9627x = false;
        this.f9628y = true;
        this.f9629z = -1;
        this.f9614A = IntCompanionObject.MIN_VALUE;
        this.f9616C = null;
        this.f9617D = new a();
        this.f9618E = new b();
        this.f9619F = 2;
        this.f9620G = new int[2];
        x2(i6);
        y2(z6);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f9621r = 1;
        this.f9625v = false;
        this.f9626w = false;
        this.f9627x = false;
        this.f9628y = true;
        this.f9629z = -1;
        this.f9614A = IntCompanionObject.MIN_VALUE;
        this.f9616C = null;
        this.f9617D = new a();
        this.f9618E = new b();
        this.f9619F = 2;
        this.f9620G = new int[2];
        RecyclerView.p.d h02 = RecyclerView.p.h0(context, attributeSet, i6, i7);
        x2(h02.f9803a);
        y2(h02.f9805c);
        z2(h02.f9806d);
    }
}
