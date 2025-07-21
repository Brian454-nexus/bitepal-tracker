package z0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: z0.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2433s {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f21464a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f21465b;

    /* renamed from: c, reason: collision with root package name */
    public final View f21466c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21467d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f21468e;

    public C2433s(View view) {
        this.f21466c = view;
    }

    public boolean a(float f6, float f7, boolean z6) {
        ViewParent h6;
        if (!l() || (h6 = h(0)) == null) {
            return false;
        }
        return AbstractC2399J.a(h6, this.f21466c, f6, f7, z6);
    }

    public boolean b(float f6, float f7) {
        ViewParent h6;
        if (!l() || (h6 = h(0)) == null) {
            return false;
        }
        return AbstractC2399J.b(h6, this.f21466c, f6, f7);
    }

    public boolean c(int i6, int i7, int[] iArr, int[] iArr2) {
        return d(i6, i7, iArr, iArr2, 0);
    }

    public boolean d(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        ViewParent h6;
        int i9;
        int i10;
        if (!l() || (h6 = h(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f21466c.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        AbstractC2399J.c(h6, this.f21466c, i6, i7, iArr3, i8);
        if (iArr2 != null) {
            this.f21466c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        g(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    public boolean f(int i6, int i7, int i8, int i9, int[] iArr) {
        return g(i6, i7, i8, i9, iArr, 0, null);
    }

    public final boolean g(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent h6;
        int i11;
        int i12;
        int[] iArr3;
        if (!l() || (h6 = h(i10)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f21466c.getLocationInWindow(iArr);
            i11 = iArr[0];
            i12 = iArr[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr2 == null) {
            int[] i13 = i();
            i13[0] = 0;
            i13[1] = 0;
            iArr3 = i13;
        } else {
            iArr3 = iArr2;
        }
        AbstractC2399J.d(h6, this.f21466c, i6, i7, i8, i9, i10, iArr3);
        if (iArr != null) {
            this.f21466c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        }
        return true;
    }

    public final ViewParent h(int i6) {
        if (i6 == 0) {
            return this.f21464a;
        }
        if (i6 != 1) {
            return null;
        }
        return this.f21465b;
    }

    public final int[] i() {
        if (this.f21468e == null) {
            this.f21468e = new int[2];
        }
        return this.f21468e;
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i6) {
        return h(i6) != null;
    }

    public boolean l() {
        return this.f21467d;
    }

    public void m(boolean z6) {
        if (this.f21467d) {
            AbstractC2393D.a0(this.f21466c);
        }
        this.f21467d = z6;
    }

    public final void n(int i6, ViewParent viewParent) {
        if (i6 == 0) {
            this.f21464a = viewParent;
        } else {
            if (i6 != 1) {
                return;
            }
            this.f21465b = viewParent;
        }
    }

    public boolean o(int i6) {
        return p(i6, 0);
    }

    public boolean p(int i6, int i7) {
        if (k(i7)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f21466c;
        for (ViewParent parent = this.f21466c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC2399J.f(parent, view, this.f21466c, i6, i7)) {
                n(i7, parent);
                AbstractC2399J.e(parent, view, this.f21466c, i6, i7);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i6) {
        ViewParent h6 = h(i6);
        if (h6 != null) {
            AbstractC2399J.g(h6, this.f21466c, i6);
            n(i6, null);
        }
    }
}
