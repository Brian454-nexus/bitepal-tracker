package q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import i.AbstractC1476i;
import z0.AbstractC2393D;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1980d {

    /* renamed from: a, reason: collision with root package name */
    public final View f18525a;

    /* renamed from: d, reason: collision with root package name */
    public P f18528d;

    /* renamed from: e, reason: collision with root package name */
    public P f18529e;

    /* renamed from: f, reason: collision with root package name */
    public P f18530f;

    /* renamed from: c, reason: collision with root package name */
    public int f18527c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C1981e f18526b = C1981e.b();

    public C1980d(View view) {
        this.f18525a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f18530f == null) {
            this.f18530f = new P();
        }
        P p6 = this.f18530f;
        p6.a();
        ColorStateList i6 = AbstractC2393D.i(this.f18525a);
        if (i6 != null) {
            p6.f18504d = true;
            p6.f18501a = i6;
        }
        PorterDuff.Mode j6 = AbstractC2393D.j(this.f18525a);
        if (j6 != null) {
            p6.f18503c = true;
            p6.f18502b = j6;
        }
        if (!p6.f18504d && !p6.f18503c) {
            return false;
        }
        C1981e.g(drawable, p6, this.f18525a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f18525a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            P p6 = this.f18529e;
            if (p6 != null) {
                C1981e.g(background, p6, this.f18525a.getDrawableState());
                return;
            }
            P p7 = this.f18528d;
            if (p7 != null) {
                C1981e.g(background, p7, this.f18525a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        P p6 = this.f18529e;
        if (p6 != null) {
            return p6.f18501a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        P p6 = this.f18529e;
        if (p6 != null) {
            return p6.f18502b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i6) {
        S r6 = S.r(this.f18525a.getContext(), attributeSet, AbstractC1476i.f15575c3, i6, 0);
        try {
            int i7 = AbstractC1476i.f15580d3;
            if (r6.o(i7)) {
                this.f18527c = r6.l(i7, -1);
                ColorStateList e6 = this.f18526b.e(this.f18525a.getContext(), this.f18527c);
                if (e6 != null) {
                    h(e6);
                }
            }
            int i8 = AbstractC1476i.f15585e3;
            if (r6.o(i8)) {
                AbstractC2393D.P(this.f18525a, r6.c(i8));
            }
            int i9 = AbstractC1476i.f15590f3;
            if (r6.o(i9)) {
                AbstractC2393D.Q(this.f18525a, y.d(r6.i(i9, -1), null));
            }
            r6.s();
        } catch (Throwable th) {
            r6.s();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f18527c = -1;
        h(null);
        b();
    }

    public void g(int i6) {
        this.f18527c = i6;
        C1981e c1981e = this.f18526b;
        h(c1981e != null ? c1981e.e(this.f18525a.getContext(), i6) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f18528d == null) {
                this.f18528d = new P();
            }
            P p6 = this.f18528d;
            p6.f18501a = colorStateList;
            p6.f18504d = true;
        } else {
            this.f18528d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f18529e == null) {
            this.f18529e = new P();
        }
        P p6 = this.f18529e;
        p6.f18501a = colorStateList;
        p6.f18504d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f18529e == null) {
            this.f18529e = new P();
        }
        P p6 = this.f18529e;
        p6.f18502b = mode;
        p6.f18503c = true;
        b();
    }

    public final boolean k() {
        return this.f18528d != null;
    }
}
