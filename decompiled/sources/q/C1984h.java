package q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import i.AbstractC1476i;
import k.AbstractC1653a;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1984h {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f18542a;

    /* renamed from: b, reason: collision with root package name */
    public P f18543b;

    /* renamed from: c, reason: collision with root package name */
    public P f18544c;

    /* renamed from: d, reason: collision with root package name */
    public P f18545d;

    public C1984h(ImageView imageView) {
        this.f18542a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f18545d == null) {
            this.f18545d = new P();
        }
        P p6 = this.f18545d;
        p6.a();
        ColorStateList a6 = C0.d.a(this.f18542a);
        if (a6 != null) {
            p6.f18504d = true;
            p6.f18501a = a6;
        }
        PorterDuff.Mode b6 = C0.d.b(this.f18542a);
        if (b6 != null) {
            p6.f18503c = true;
            p6.f18502b = b6;
        }
        if (!p6.f18504d && !p6.f18503c) {
            return false;
        }
        C1981e.g(drawable, p6, this.f18542a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable = this.f18542a.getDrawable();
        if (drawable != null) {
            y.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            P p6 = this.f18544c;
            if (p6 != null) {
                C1981e.g(drawable, p6, this.f18542a.getDrawableState());
                return;
            }
            P p7 = this.f18543b;
            if (p7 != null) {
                C1981e.g(drawable, p7, this.f18542a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        P p6 = this.f18544c;
        if (p6 != null) {
            return p6.f18501a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        P p6 = this.f18544c;
        if (p6 != null) {
            return p6.f18502b;
        }
        return null;
    }

    public boolean e() {
        return !(this.f18542a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i6) {
        int l6;
        S r6 = S.r(this.f18542a.getContext(), attributeSet, AbstractC1476i.f15485H, i6, 0);
        try {
            Drawable drawable = this.f18542a.getDrawable();
            if (drawable == null && (l6 = r6.l(AbstractC1476i.f15489I, -1)) != -1 && (drawable = AbstractC1653a.b(this.f18542a.getContext(), l6)) != null) {
                this.f18542a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                y.b(drawable);
            }
            int i7 = AbstractC1476i.f15493J;
            if (r6.o(i7)) {
                C0.d.c(this.f18542a, r6.c(i7));
            }
            int i8 = AbstractC1476i.f15497K;
            if (r6.o(i8)) {
                C0.d.d(this.f18542a, y.d(r6.i(i8, -1), null));
            }
            r6.s();
        } catch (Throwable th) {
            r6.s();
            throw th;
        }
    }

    public void g(int i6) {
        if (i6 != 0) {
            Drawable b6 = AbstractC1653a.b(this.f18542a.getContext(), i6);
            if (b6 != null) {
                y.b(b6);
            }
            this.f18542a.setImageDrawable(b6);
        } else {
            this.f18542a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f18544c == null) {
            this.f18544c = new P();
        }
        P p6 = this.f18544c;
        p6.f18501a = colorStateList;
        p6.f18504d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f18544c == null) {
            this.f18544c = new P();
        }
        P p6 = this.f18544c;
        p6.f18502b = mode;
        p6.f18503c = true;
        b();
    }

    public final boolean j() {
        return this.f18543b != null;
    }
}
