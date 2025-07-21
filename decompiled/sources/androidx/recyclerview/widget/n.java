package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class n extends RecyclerView.m {

    /* renamed from: g, reason: collision with root package name */
    public boolean f10100g = true;

    public abstract boolean A(RecyclerView.D d6);

    public final void B(RecyclerView.D d6) {
        J(d6);
        h(d6);
    }

    public final void C(RecyclerView.D d6) {
        K(d6);
    }

    public final void D(RecyclerView.D d6, boolean z6) {
        L(d6, z6);
        h(d6);
    }

    public final void E(RecyclerView.D d6, boolean z6) {
        M(d6, z6);
    }

    public final void F(RecyclerView.D d6) {
        N(d6);
        h(d6);
    }

    public final void G(RecyclerView.D d6) {
        O(d6);
    }

    public final void H(RecyclerView.D d6) {
        P(d6);
        h(d6);
    }

    public final void I(RecyclerView.D d6) {
        Q(d6);
    }

    public void J(RecyclerView.D d6) {
    }

    public void K(RecyclerView.D d6) {
    }

    public void L(RecyclerView.D d6, boolean z6) {
    }

    public void M(RecyclerView.D d6, boolean z6) {
    }

    public void N(RecyclerView.D d6) {
    }

    public void O(RecyclerView.D d6) {
    }

    public void P(RecyclerView.D d6) {
    }

    public void Q(RecyclerView.D d6) {
    }

    public void R(boolean z6) {
        this.f10100g = z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.D d6, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i6;
        int i7;
        return (cVar == null || ((i6 = cVar.f9779a) == (i7 = cVar2.f9779a) && cVar.f9780b == cVar2.f9780b)) ? x(d6) : z(d6, i6, cVar.f9780b, i7, cVar2.f9780b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.D d6, RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i6;
        int i7;
        int i8 = cVar.f9779a;
        int i9 = cVar.f9780b;
        if (d7.shouldIgnore()) {
            int i10 = cVar.f9779a;
            i7 = cVar.f9780b;
            i6 = i10;
        } else {
            i6 = cVar2.f9779a;
            i7 = cVar2.f9780b;
        }
        return y(d6, d7, i8, i9, i6, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.D d6, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i6 = cVar.f9779a;
        int i7 = cVar.f9780b;
        View view = d6.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f9779a;
        int top = cVar2 == null ? view.getTop() : cVar2.f9780b;
        if (d6.isRemoved() || (i6 == left && i7 == top)) {
            return A(d6);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(d6, i6, i7, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.D d6, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i6 = cVar.f9779a;
        int i7 = cVar2.f9779a;
        if (i6 != i7 || cVar.f9780b != cVar2.f9780b) {
            return z(d6, i6, cVar.f9780b, i7, cVar2.f9780b);
        }
        F(d6);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.D d6) {
        return !this.f10100g || d6.isInvalid();
    }

    public abstract boolean x(RecyclerView.D d6);

    public abstract boolean y(RecyclerView.D d6, RecyclerView.D d7, int i6, int i7, int i8, int i9);

    public abstract boolean z(RecyclerView.D d6, int i6, int i7, int i8, int i9);
}
