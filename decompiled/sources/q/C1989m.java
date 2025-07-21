package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import i.AbstractC1476i;
import java.lang.ref.WeakReference;
import p0.AbstractC1892f;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1989m {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f18552a;

    /* renamed from: b, reason: collision with root package name */
    public P f18553b;

    /* renamed from: c, reason: collision with root package name */
    public P f18554c;

    /* renamed from: d, reason: collision with root package name */
    public P f18555d;

    /* renamed from: e, reason: collision with root package name */
    public P f18556e;

    /* renamed from: f, reason: collision with root package name */
    public P f18557f;

    /* renamed from: g, reason: collision with root package name */
    public P f18558g;

    /* renamed from: h, reason: collision with root package name */
    public P f18559h;

    /* renamed from: i, reason: collision with root package name */
    public final C1993q f18560i;

    /* renamed from: j, reason: collision with root package name */
    public int f18561j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f18562k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f18563l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18564m;

    /* renamed from: q.m$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends AbstractC1892f.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f18565a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18566b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18567c;

        /* renamed from: q.m$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class RunnableC0235a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f18568a;

            /* renamed from: b, reason: collision with root package name */
            public final Typeface f18569b;

            public RunnableC0235a(WeakReference weakReference, Typeface typeface) {
                this.f18568a = weakReference;
                this.f18569b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1989m c1989m = (C1989m) this.f18568a.get();
                if (c1989m == null) {
                    return;
                }
                c1989m.B(this.f18569b);
            }
        }

        public a(C1989m c1989m, int i6, int i7) {
            this.f18565a = new WeakReference(c1989m);
            this.f18566b = i6;
            this.f18567c = i7;
        }

        @Override // p0.AbstractC1892f.e
        public void f(int i6) {
        }

        @Override // p0.AbstractC1892f.e
        public void g(Typeface typeface) {
            int i6;
            C1989m c1989m = (C1989m) this.f18565a.get();
            if (c1989m == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f18566b) != -1) {
                typeface = Typeface.create(typeface, i6, (this.f18567c & 2) != 0);
            }
            c1989m.q(new RunnableC0235a(this.f18565a, typeface));
        }
    }

    public C1989m(TextView textView) {
        this.f18552a = textView;
        this.f18560i = new C1993q(textView);
    }

    public static P d(Context context, C1981e c1981e, int i6) {
        ColorStateList e6 = c1981e.e(context, i6);
        if (e6 == null) {
            return null;
        }
        P p6 = new P();
        p6.f18504d = true;
        p6.f18501a = e6;
        return p6;
    }

    public final void A(int i6, float f6) {
        this.f18560i.u(i6, f6);
    }

    public void B(Typeface typeface) {
        if (this.f18564m) {
            this.f18552a.setTypeface(typeface);
            this.f18563l = typeface;
        }
    }

    public final void C(Context context, S s6) {
        String m6;
        Typeface create;
        Typeface create2;
        this.f18561j = s6.i(AbstractC1476i.f15634p2, this.f18561j);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int i7 = s6.i(AbstractC1476i.f15646s2, -1);
            this.f18562k = i7;
            if (i7 != -1) {
                this.f18561j &= 2;
            }
        }
        int i8 = AbstractC1476i.f15642r2;
        if (!s6.o(i8) && !s6.o(AbstractC1476i.f15650t2)) {
            int i9 = AbstractC1476i.f15630o2;
            if (s6.o(i9)) {
                this.f18564m = false;
                int i10 = s6.i(i9, 1);
                if (i10 == 1) {
                    this.f18563l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f18563l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f18563l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f18563l = null;
        int i11 = AbstractC1476i.f15650t2;
        if (s6.o(i11)) {
            i8 = i11;
        }
        int i12 = this.f18562k;
        int i13 = this.f18561j;
        if (!context.isRestricted()) {
            try {
                Typeface h6 = s6.h(i8, this.f18561j, new a(this, i12, i13));
                if (h6 != null) {
                    if (i6 < 28 || this.f18562k == -1) {
                        this.f18563l = h6;
                    } else {
                        create2 = Typeface.create(Typeface.create(h6, 0), this.f18562k, (this.f18561j & 2) != 0);
                        this.f18563l = create2;
                    }
                }
                this.f18564m = this.f18563l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f18563l != null || (m6 = s6.m(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f18562k == -1) {
            this.f18563l = Typeface.create(m6, this.f18561j);
        } else {
            create = Typeface.create(Typeface.create(m6, 0), this.f18562k, (this.f18561j & 2) != 0);
            this.f18563l = create;
        }
    }

    public final void a(Drawable drawable, P p6) {
        if (drawable == null || p6 == null) {
            return;
        }
        C1981e.g(drawable, p6, this.f18552a.getDrawableState());
    }

    public void b() {
        if (this.f18553b != null || this.f18554c != null || this.f18555d != null || this.f18556e != null) {
            Drawable[] compoundDrawables = this.f18552a.getCompoundDrawables();
            a(compoundDrawables[0], this.f18553b);
            a(compoundDrawables[1], this.f18554c);
            a(compoundDrawables[2], this.f18555d);
            a(compoundDrawables[3], this.f18556e);
        }
        if (this.f18557f == null && this.f18558g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f18552a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f18557f);
        a(compoundDrawablesRelative[2], this.f18558g);
    }

    public void c() {
        this.f18560i.a();
    }

    public int e() {
        return this.f18560i.g();
    }

    public int f() {
        return this.f18560i.h();
    }

    public int g() {
        return this.f18560i.i();
    }

    public int[] h() {
        return this.f18560i.j();
    }

    public int i() {
        return this.f18560i.k();
    }

    public ColorStateList j() {
        P p6 = this.f18559h;
        if (p6 != null) {
            return p6.f18501a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        P p6 = this.f18559h;
        if (p6 != null) {
            return p6.f18502b;
        }
        return null;
    }

    public boolean l() {
        return this.f18560i.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1989m.m(android.util.AttributeSet, int):void");
    }

    public void n(boolean z6, int i6, int i7, int i8, int i9) {
        if (C0.b.f452N) {
            return;
        }
        c();
    }

    public void o() {
        b();
    }

    public void p(Context context, int i6) {
        String m6;
        S p6 = S.p(context, i6, AbstractC1476i.f15622m2);
        int i7 = AbstractC1476i.f15658v2;
        if (p6.o(i7)) {
            r(p6.a(i7, false));
        }
        int i8 = AbstractC1476i.f15626n2;
        if (p6.o(i8) && p6.e(i8, -1) == 0) {
            this.f18552a.setTextSize(0, 0.0f);
        }
        C(context, p6);
        int i9 = AbstractC1476i.f15654u2;
        if (p6.o(i9) && (m6 = p6.m(i9)) != null) {
            this.f18552a.setFontVariationSettings(m6);
        }
        p6.s();
        Typeface typeface = this.f18563l;
        if (typeface != null) {
            this.f18552a.setTypeface(typeface, this.f18561j);
        }
    }

    public void q(Runnable runnable) {
        this.f18552a.post(runnable);
    }

    public void r(boolean z6) {
        this.f18552a.setAllCaps(z6);
    }

    public void s(int i6, int i7, int i8, int i9) {
        this.f18560i.q(i6, i7, i8, i9);
    }

    public void t(int[] iArr, int i6) {
        this.f18560i.r(iArr, i6);
    }

    public void u(int i6) {
        this.f18560i.s(i6);
    }

    public void v(ColorStateList colorStateList) {
        if (this.f18559h == null) {
            this.f18559h = new P();
        }
        P p6 = this.f18559h;
        p6.f18501a = colorStateList;
        p6.f18504d = colorStateList != null;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.f18559h == null) {
            this.f18559h = new P();
        }
        P p6 = this.f18559h;
        p6.f18502b = mode;
        p6.f18503c = mode != null;
        y();
    }

    public final void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f18552a.getCompoundDrawablesRelative();
            TextView textView = this.f18552a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f18552a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f18552a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f18552a.getCompoundDrawables();
        TextView textView3 = this.f18552a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void y() {
        P p6 = this.f18559h;
        this.f18553b = p6;
        this.f18554c = p6;
        this.f18555d = p6;
        this.f18556e = p6;
        this.f18557f = p6;
        this.f18558g = p6;
    }

    public void z(int i6, float f6) {
        if (C0.b.f452N || l()) {
            return;
        }
        A(i6, f6);
    }
}
