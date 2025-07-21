package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f10093a;

    /* renamed from: b, reason: collision with root package name */
    public int f10094b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10095c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends k {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.k
        public int d(View view) {
            return this.f10093a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10093a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10093a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int g(View view) {
            return this.f10093a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int h() {
            return this.f10093a.n0();
        }

        @Override // androidx.recyclerview.widget.k
        public int i() {
            return this.f10093a.n0() - this.f10093a.e0();
        }

        @Override // androidx.recyclerview.widget.k
        public int j() {
            return this.f10093a.e0();
        }

        @Override // androidx.recyclerview.widget.k
        public int k() {
            return this.f10093a.o0();
        }

        @Override // androidx.recyclerview.widget.k
        public int l() {
            return this.f10093a.X();
        }

        @Override // androidx.recyclerview.widget.k
        public int m() {
            return this.f10093a.d0();
        }

        @Override // androidx.recyclerview.widget.k
        public int n() {
            return (this.f10093a.n0() - this.f10093a.d0()) - this.f10093a.e0();
        }

        @Override // androidx.recyclerview.widget.k
        public int p(View view) {
            this.f10093a.m0(view, true, this.f10095c);
            return this.f10095c.right;
        }

        @Override // androidx.recyclerview.widget.k
        public int q(View view) {
            this.f10093a.m0(view, true, this.f10095c);
            return this.f10095c.left;
        }

        @Override // androidx.recyclerview.widget.k
        public void r(int i6) {
            this.f10093a.B0(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends k {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.k
        public int d(View view) {
            return this.f10093a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10093a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f10093a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int g(View view) {
            return this.f10093a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int h() {
            return this.f10093a.W();
        }

        @Override // androidx.recyclerview.widget.k
        public int i() {
            return this.f10093a.W() - this.f10093a.c0();
        }

        @Override // androidx.recyclerview.widget.k
        public int j() {
            return this.f10093a.c0();
        }

        @Override // androidx.recyclerview.widget.k
        public int k() {
            return this.f10093a.X();
        }

        @Override // androidx.recyclerview.widget.k
        public int l() {
            return this.f10093a.o0();
        }

        @Override // androidx.recyclerview.widget.k
        public int m() {
            return this.f10093a.f0();
        }

        @Override // androidx.recyclerview.widget.k
        public int n() {
            return (this.f10093a.W() - this.f10093a.f0()) - this.f10093a.c0();
        }

        @Override // androidx.recyclerview.widget.k
        public int p(View view) {
            this.f10093a.m0(view, true, this.f10095c);
            return this.f10095c.bottom;
        }

        @Override // androidx.recyclerview.widget.k
        public int q(View view) {
            this.f10093a.m0(view, true, this.f10095c);
            return this.f10095c.top;
        }

        @Override // androidx.recyclerview.widget.k
        public void r(int i6) {
            this.f10093a.C0(i6);
        }
    }

    public /* synthetic */ k(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static k a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static k b(RecyclerView.p pVar, int i6) {
        if (i6 == 0) {
            return a(pVar);
        }
        if (i6 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static k c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f10094b) {
            return 0;
        }
        return n() - this.f10094b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i6);

    public void s() {
        this.f10094b = n();
    }

    public k(RecyclerView.p pVar) {
        this.f10094b = IntCompanionObject.MIN_VALUE;
        this.f10095c = new Rect();
        this.f10093a = pVar;
    }
}
