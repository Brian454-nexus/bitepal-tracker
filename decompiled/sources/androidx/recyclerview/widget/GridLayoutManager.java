package androidx.recyclerview.widget;

import A0.s;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H, reason: collision with root package name */
    public boolean f9599H;

    /* renamed from: I, reason: collision with root package name */
    public int f9600I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f9601J;

    /* renamed from: K, reason: collision with root package name */
    public View[] f9602K;

    /* renamed from: L, reason: collision with root package name */
    public final SparseIntArray f9603L;

    /* renamed from: M, reason: collision with root package name */
    public final SparseIntArray f9604M;

    /* renamed from: N, reason: collision with root package name */
    public c f9605N;

    /* renamed from: O, reason: collision with root package name */
    public final Rect f9606O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f9607P;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i6, int i7) {
            return i6 % i7;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i6) {
            return 1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f9610a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f9611b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f9612c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9613d = false;

        public static int a(SparseIntArray sparseIntArray, int i6) {
            int size = sparseIntArray.size() - 1;
            int i7 = 0;
            while (i7 <= size) {
                int i8 = (i7 + size) >>> 1;
                if (sparseIntArray.keyAt(i8) < i6) {
                    i7 = i8 + 1;
                } else {
                    size = i8 - 1;
                }
            }
            int i9 = i7 - 1;
            if (i9 < 0 || i9 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i9);
        }

        public int b(int i6, int i7) {
            if (!this.f9613d) {
                return d(i6, i7);
            }
            int i8 = this.f9611b.get(i6, -1);
            if (i8 != -1) {
                return i8;
            }
            int d6 = d(i6, i7);
            this.f9611b.put(i6, d6);
            return d6;
        }

        public int c(int i6, int i7) {
            if (!this.f9612c) {
                return e(i6, i7);
            }
            int i8 = this.f9610a.get(i6, -1);
            if (i8 != -1) {
                return i8;
            }
            int e6 = e(i6, i7);
            this.f9610a.put(i6, e6);
            return e6;
        }

        public int d(int i6, int i7) {
            int i8;
            int i9;
            int i10;
            int a6;
            if (!this.f9613d || (a6 = a(this.f9611b, i6)) == -1) {
                i8 = 0;
                i9 = 0;
                i10 = 0;
            } else {
                i8 = this.f9611b.get(a6);
                i9 = a6 + 1;
                i10 = c(a6, i7) + f(a6);
                if (i10 == i7) {
                    i8++;
                    i10 = 0;
                }
            }
            int f6 = f(i6);
            while (i9 < i6) {
                int f7 = f(i9);
                i10 += f7;
                if (i10 == i7) {
                    i8++;
                    i10 = 0;
                } else if (i10 > i7) {
                    i8++;
                    i10 = f7;
                }
                i9++;
            }
            return i10 + f6 > i7 ? i8 + 1 : i8;
        }

        public abstract int e(int i6, int i7);

        public abstract int f(int i6);

        public void g() {
            this.f9611b.clear();
        }

        public void h() {
            this.f9610a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9599H = false;
        this.f9600I = -1;
        this.f9603L = new SparseIntArray();
        this.f9604M = new SparseIntArray();
        this.f9605N = new a();
        this.f9606O = new Rect();
        Y2(RecyclerView.p.h0(context, attributeSet, i6, i7).f9804b);
    }

    public static int[] L2(int[] iArr, int i6, int i7) {
        int i8;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i7) {
            iArr = new int[i6 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i7 / i6;
        int i11 = i7 % i6;
        int i12 = 0;
        for (int i13 = 1; i13 <= i6; i13++) {
            i9 += i11;
            if (i9 <= 0 || i6 - i9 >= i11) {
                i8 = i10;
            } else {
                i8 = i10 + 1;
                i9 -= i6;
            }
            i12 += i8;
            iArr[i13] = i12;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(Rect rect, int i6, int i7) {
        int n6;
        int n7;
        if (this.f9601J == null) {
            super.A1(rect, i6, i7);
        }
        int d02 = d0() + e0();
        int f02 = f0() + c0();
        if (this.f9621r == 1) {
            n7 = RecyclerView.p.n(i7, rect.height() + f02, a0());
            int[] iArr = this.f9601J;
            n6 = RecyclerView.p.n(i6, iArr[iArr.length - 1] + d02, b0());
        } else {
            n6 = RecyclerView.p.n(i6, rect.width() + d02, b0());
            int[] iArr2 = this.f9601J;
            n7 = RecyclerView.p.n(i7, iArr2[iArr2.length - 1] + f02, a0());
        }
        z1(n6, n7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.f9621r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean H1() {
        return this.f9616C == null && !this.f9599H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View I0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.A r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.I0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$A):android.view.View");
    }

    public final void I2(RecyclerView.w wVar, RecyclerView.A a6, int i6, boolean z6) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (z6) {
            i9 = 1;
            i8 = i6;
            i7 = 0;
        } else {
            i7 = i6 - 1;
            i8 = -1;
            i9 = -1;
        }
        while (i7 != i8) {
            View view = this.f9602K[i7];
            b bVar = (b) view.getLayoutParams();
            int U22 = U2(wVar, a6, g0(view));
            bVar.f9609f = U22;
            bVar.f9608e = i10;
            i10 += U22;
            i7 += i9;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void J1(RecyclerView.A a6, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i6 = this.f9600I;
        for (int i7 = 0; i7 < this.f9600I && cVar.c(a6) && i6 > 0; i7++) {
            int i8 = cVar.f9642d;
            cVar2.a(i8, Math.max(0, cVar.f9645g));
            i6 -= this.f9605N.f(i8);
            cVar.f9642d += cVar.f9643e;
        }
    }

    public final void J2() {
        int J6 = J();
        for (int i6 = 0; i6 < J6; i6++) {
            b bVar = (b) I(i6).getLayoutParams();
            int a6 = bVar.a();
            this.f9603L.put(a6, bVar.f());
            this.f9604M.put(a6, bVar.e());
        }
    }

    public final void K2(int i6) {
        this.f9601J = L2(this.f9601J, this.f9600I, i6);
    }

    public final void M2() {
        this.f9603L.clear();
        this.f9604M.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N(RecyclerView.w wVar, RecyclerView.A a6) {
        if (this.f9621r == 1) {
            return this.f9600I;
        }
        if (a6.b() < 1) {
            return 0;
        }
        return S2(wVar, a6, a6.b() - 1) + 1;
    }

    public final int N2(RecyclerView.A a6) {
        if (J() != 0 && a6.b() != 0) {
            P1();
            boolean l22 = l2();
            View U12 = U1(!l22, true);
            View T12 = T1(!l22, true);
            if (U12 != null && T12 != null) {
                int b6 = this.f9605N.b(g0(U12), this.f9600I);
                int b7 = this.f9605N.b(g0(T12), this.f9600I);
                int max = this.f9626w ? Math.max(0, ((this.f9605N.b(a6.b() - 1, this.f9600I) + 1) - Math.max(b6, b7)) - 1) : Math.max(0, Math.min(b6, b7));
                if (l22) {
                    return Math.round((max * (Math.abs(this.f9623t.d(T12) - this.f9623t.g(U12)) / ((this.f9605N.b(g0(T12), this.f9600I) - this.f9605N.b(g0(U12), this.f9600I)) + 1))) + (this.f9623t.m() - this.f9623t.g(U12)));
                }
                return max;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(RecyclerView.w wVar, RecyclerView.A a6, View view, s sVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.N0(view, sVar);
            return;
        }
        b bVar = (b) layoutParams;
        int S22 = S2(wVar, a6, bVar.a());
        if (this.f9621r == 0) {
            sVar.S(s.f.a(bVar.e(), bVar.f(), S22, 1, false, false));
        } else {
            sVar.S(s.f.a(S22, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final int O2(RecyclerView.A a6) {
        if (J() != 0 && a6.b() != 0) {
            P1();
            View U12 = U1(!l2(), true);
            View T12 = T1(!l2(), true);
            if (U12 != null && T12 != null) {
                if (!l2()) {
                    return this.f9605N.b(a6.b() - 1, this.f9600I) + 1;
                }
                int d6 = this.f9623t.d(T12) - this.f9623t.g(U12);
                int b6 = this.f9605N.b(g0(U12), this.f9600I);
                return (int) ((d6 / ((this.f9605N.b(g0(T12), this.f9600I) - b6) + 1)) * (this.f9605N.b(a6.b() - 1, this.f9600I) + 1));
            }
        }
        return 0;
    }

    public final void P2(RecyclerView.w wVar, RecyclerView.A a6, LinearLayoutManager.a aVar, int i6) {
        boolean z6 = i6 == 1;
        int T22 = T2(wVar, a6, aVar.f9631b);
        if (z6) {
            while (T22 > 0) {
                int i7 = aVar.f9631b;
                if (i7 <= 0) {
                    return;
                }
                int i8 = i7 - 1;
                aVar.f9631b = i8;
                T22 = T2(wVar, a6, i8);
            }
            return;
        }
        int b6 = a6.b() - 1;
        int i9 = aVar.f9631b;
        while (i9 < b6) {
            int i10 = i9 + 1;
            int T23 = T2(wVar, a6, i10);
            if (T23 <= T22) {
                break;
            }
            i9 = i10;
            T22 = T23;
        }
        aVar.f9631b = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, int i6, int i7) {
        this.f9605N.h();
        this.f9605N.g();
    }

    public final void Q2() {
        View[] viewArr = this.f9602K;
        if (viewArr == null || viewArr.length != this.f9600I) {
            this.f9602K = new View[this.f9600I];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView) {
        this.f9605N.h();
        this.f9605N.g();
    }

    public int R2(int i6, int i7) {
        if (this.f9621r != 1 || !k2()) {
            int[] iArr = this.f9601J;
            return iArr[i7 + i6] - iArr[i6];
        }
        int[] iArr2 = this.f9601J;
        int i8 = this.f9600I;
        return iArr2[i8 - i6] - iArr2[(i8 - i6) - i7];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView, int i6, int i7, int i8) {
        this.f9605N.h();
        this.f9605N.g();
    }

    public final int S2(RecyclerView.w wVar, RecyclerView.A a6, int i6) {
        if (!a6.e()) {
            return this.f9605N.b(i6, this.f9600I);
        }
        int f6 = wVar.f(i6);
        if (f6 != -1) {
            return this.f9605N.b(f6, this.f9600I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i6, int i7) {
        this.f9605N.h();
        this.f9605N.g();
    }

    public final int T2(RecyclerView.w wVar, RecyclerView.A a6, int i6) {
        if (!a6.e()) {
            return this.f9605N.c(i6, this.f9600I);
        }
        int i7 = this.f9604M.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        int f6 = wVar.f(i6);
        if (f6 != -1) {
            return this.f9605N.c(f6, this.f9600I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 0;
    }

    public final int U2(RecyclerView.w wVar, RecyclerView.A a6, int i6) {
        if (!a6.e()) {
            return this.f9605N.f(i6);
        }
        int i7 = this.f9603L.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        int f6 = wVar.f(i6);
        if (f6 != -1) {
            return this.f9605N.f(f6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i6, int i7, Object obj) {
        this.f9605N.h();
        this.f9605N.g();
    }

    public final void V2(float f6, int i6) {
        K2(Math.max(Math.round(f6 * this.f9600I), i6));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.A a6) {
        if (a6.e()) {
            J2();
        }
        super.W0(wVar, a6);
        M2();
    }

    public final void W2(View view, int i6, boolean z6) {
        int i7;
        int i8;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f9808b;
        int i9 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i10 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int R22 = R2(bVar.f9608e, bVar.f9609f);
        if (this.f9621r == 1) {
            i8 = RecyclerView.p.K(R22, i6, i10, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i7 = RecyclerView.p.K(this.f9623t.n(), X(), i9, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K5 = RecyclerView.p.K(R22, i6, i9, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K6 = RecyclerView.p.K(this.f9623t.n(), o0(), i10, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i7 = K5;
            i8 = K6;
        }
        X2(view, i8, i7, z6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.A a6) {
        super.X0(a6);
        this.f9599H = false;
    }

    public final void X2(View view, int i6, int i7, boolean z6) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z6 ? F1(view, i6, i7, qVar) : D1(view, i6, i7, qVar)) {
            view.measure(i6, i7);
        }
    }

    public void Y2(int i6) {
        if (i6 == this.f9600I) {
            return;
        }
        this.f9599H = true;
        if (i6 >= 1) {
            this.f9600I = i6;
            this.f9605N.h();
            r1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i6);
        }
    }

    public final void Z2() {
        int W5;
        int f02;
        if (j2() == 1) {
            W5 = n0() - e0();
            f02 = d0();
        } else {
            W5 = W() - c0();
            f02 = f0();
        }
        K2(W5 - f02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View d2(RecyclerView.w wVar, RecyclerView.A a6, boolean z6, boolean z7) {
        int i6;
        int i7;
        int J6 = J();
        int i8 = 1;
        if (z7) {
            i7 = J() - 1;
            i6 = -1;
            i8 = -1;
        } else {
            i6 = J6;
            i7 = 0;
        }
        int b6 = a6.b();
        P1();
        int m6 = this.f9623t.m();
        int i9 = this.f9623t.i();
        View view = null;
        View view2 = null;
        while (i7 != i6) {
            View I6 = I(i7);
            int g02 = g0(I6);
            if (g02 >= 0 && g02 < b6 && T2(wVar, a6, g02) == 0) {
                if (((RecyclerView.q) I6.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I6;
                    }
                } else {
                    if (this.f9623t.g(I6) < i9 && this.f9623t.d(I6) >= m6) {
                        return I6;
                    }
                    if (view == null) {
                        view = I6;
                    }
                }
            }
            i7 += i8;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int j0(RecyclerView.w wVar, RecyclerView.A a6) {
        if (this.f9621r == 0) {
            return this.f9600I;
        }
        if (a6.b() < 1) {
            return 0;
        }
        return S2(wVar, a6, a6.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f9636b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.A r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.m2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void o2(RecyclerView.w wVar, RecyclerView.A a6, LinearLayoutManager.a aVar, int i6) {
        super.o2(wVar, a6, aVar, i6);
        Z2();
        if (a6.b() > 0 && !a6.e()) {
            P2(wVar, a6, aVar, i6);
        }
        Q2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.A a6) {
        return this.f9607P ? N2(a6) : super.r(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.A a6) {
        return this.f9607P ? O2(a6) : super.s(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.A a6) {
        return this.f9607P ? N2(a6) : super.u(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u1(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        Z2();
        Q2();
        return super.u1(i6, wVar, a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.A a6) {
        return this.f9607P ? O2(a6) : super.v(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i6, RecyclerView.w wVar, RecyclerView.A a6) {
        Z2();
        Q2();
        return super.w1(i6, wVar, a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void z2(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.z2(false);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        public int f9608e;

        /* renamed from: f, reason: collision with root package name */
        public int f9609f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9608e = -1;
            this.f9609f = 0;
        }

        public int e() {
            return this.f9608e;
        }

        public int f() {
            return this.f9609f;
        }

        public b(int i6, int i7) {
            super(i6, i7);
            this.f9608e = -1;
            this.f9609f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9608e = -1;
            this.f9609f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9608e = -1;
            this.f9609f = 0;
        }
    }
}
