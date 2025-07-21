package H2;

import H2.AbstractC0411l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class N extends AbstractC0411l {

    /* renamed from: J, reason: collision with root package name */
    public static final String[] f2046J = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: I, reason: collision with root package name */
    public int f2047I = 3;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0412m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2049b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2050c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f2048a = viewGroup;
            this.f2049b = view;
            this.f2050c = view2;
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void a(AbstractC0411l abstractC0411l) {
            x.a(this.f2048a).d(this.f2049b);
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            this.f2050c.setTag(AbstractC0408i.f2124a, null);
            x.a(this.f2048a).d(this.f2049b);
            abstractC0411l.Q(this);
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void c(AbstractC0411l abstractC0411l) {
            if (this.f2049b.getParent() == null) {
                x.a(this.f2048a).c(this.f2049b);
            } else {
                N.this.g();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends AnimatorListenerAdapter implements AbstractC0411l.f {

        /* renamed from: a, reason: collision with root package name */
        public final View f2052a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2053b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f2054c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2055d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2056e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2057f = false;

        public b(View view, int i6, boolean z6) {
            this.f2052a = view;
            this.f2053b = i6;
            this.f2054c = (ViewGroup) view.getParent();
            this.f2055d = z6;
            g(true);
        }

        @Override // H2.AbstractC0411l.f
        public void a(AbstractC0411l abstractC0411l) {
            g(false);
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            f();
            abstractC0411l.Q(this);
        }

        @Override // H2.AbstractC0411l.f
        public void c(AbstractC0411l abstractC0411l) {
            g(true);
        }

        @Override // H2.AbstractC0411l.f
        public void d(AbstractC0411l abstractC0411l) {
        }

        @Override // H2.AbstractC0411l.f
        public void e(AbstractC0411l abstractC0411l) {
        }

        public final void f() {
            if (!this.f2057f) {
                A.h(this.f2052a, this.f2053b);
                ViewGroup viewGroup = this.f2054c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z6) {
            ViewGroup viewGroup;
            if (!this.f2055d || this.f2056e == z6 || (viewGroup = this.f2054c) == null) {
                return;
            }
            this.f2056e = z6;
            x.c(viewGroup, z6);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2057f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f2057f) {
                return;
            }
            A.h(this.f2052a, this.f2053b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f2057f) {
                return;
            }
            A.h(this.f2052a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2058a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2059b;

        /* renamed from: c, reason: collision with root package name */
        public int f2060c;

        /* renamed from: d, reason: collision with root package name */
        public int f2061d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f2062e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f2063f;
    }

    private void d0(s sVar) {
        sVar.f2187a.put("android:visibility:visibility", Integer.valueOf(sVar.f2188b.getVisibility()));
        sVar.f2187a.put("android:visibility:parent", sVar.f2188b.getParent());
        int[] iArr = new int[2];
        sVar.f2188b.getLocationOnScreen(iArr);
        sVar.f2187a.put("android:visibility:screenLocation", iArr);
    }

    @Override // H2.AbstractC0411l
    public String[] E() {
        return f2046J;
    }

    @Override // H2.AbstractC0411l
    public boolean G(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f2187a.containsKey("android:visibility:visibility") != sVar.f2187a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c e02 = e0(sVar, sVar2);
        return e02.f2058a && (e02.f2060c == 0 || e02.f2061d == 0);
    }

    public final c e0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f2058a = false;
        cVar.f2059b = false;
        if (sVar == null || !sVar.f2187a.containsKey("android:visibility:visibility")) {
            cVar.f2060c = -1;
            cVar.f2062e = null;
        } else {
            cVar.f2060c = ((Integer) sVar.f2187a.get("android:visibility:visibility")).intValue();
            cVar.f2062e = (ViewGroup) sVar.f2187a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f2187a.containsKey("android:visibility:visibility")) {
            cVar.f2061d = -1;
            cVar.f2063f = null;
        } else {
            cVar.f2061d = ((Integer) sVar2.f2187a.get("android:visibility:visibility")).intValue();
            cVar.f2063f = (ViewGroup) sVar2.f2187a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i6 = cVar.f2060c;
            int i7 = cVar.f2061d;
            if (i6 != i7 || cVar.f2062e != cVar.f2063f) {
                if (i6 != i7) {
                    if (i6 == 0) {
                        cVar.f2059b = false;
                        cVar.f2058a = true;
                        return cVar;
                    }
                    if (i7 == 0) {
                        cVar.f2059b = true;
                        cVar.f2058a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f2063f == null) {
                        cVar.f2059b = false;
                        cVar.f2058a = true;
                        return cVar;
                    }
                    if (cVar.f2062e == null) {
                        cVar.f2059b = true;
                        cVar.f2058a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (sVar == null && cVar.f2061d == 0) {
                cVar.f2059b = true;
                cVar.f2058a = true;
                return cVar;
            }
            if (sVar2 == null && cVar.f2060c == 0) {
                cVar.f2059b = false;
                cVar.f2058a = true;
            }
        }
        return cVar;
    }

    public Animator f0(ViewGroup viewGroup, s sVar, int i6, s sVar2, int i7) {
        if ((this.f2047I & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f2188b.getParent();
            if (e0(u(view, false), F(view, false)).f2058a) {
                return null;
            }
        }
        return g0(viewGroup, sVar2.f2188b, sVar, sVar2);
    }

    public abstract Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // H2.AbstractC0411l
    public void h(s sVar) {
        d0(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r10.f2156v != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator h0(android.view.ViewGroup r11, H2.s r12, int r13, H2.s r14, int r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.N.h0(android.view.ViewGroup, H2.s, int, H2.s, int):android.animation.Animator");
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void j0(int i6) {
        if ((i6 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2047I = i6;
    }

    @Override // H2.AbstractC0411l
    public void k(s sVar) {
        d0(sVar);
    }

    @Override // H2.AbstractC0411l
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        c e02 = e0(sVar, sVar2);
        if (!e02.f2058a) {
            return null;
        }
        if (e02.f2062e == null && e02.f2063f == null) {
            return null;
        }
        return e02.f2059b ? f0(viewGroup, sVar, e02.f2060c, sVar2, e02.f2061d) : h0(viewGroup, sVar, e02.f2060c, sVar2, e02.f2061d);
    }
}
