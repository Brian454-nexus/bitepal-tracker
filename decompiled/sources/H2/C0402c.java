package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import z0.AbstractC2393D;

/* renamed from: H2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0402c extends AbstractC0411l {

    /* renamed from: L, reason: collision with root package name */
    public static final String[] f2065L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: M, reason: collision with root package name */
    public static final Property f2066M = new b(PointF.class, "boundsOrigin");

    /* renamed from: V, reason: collision with root package name */
    public static final Property f2067V = new C0038c(PointF.class, "topLeft");

    /* renamed from: W, reason: collision with root package name */
    public static final Property f2068W = new d(PointF.class, "bottomRight");

    /* renamed from: X, reason: collision with root package name */
    public static final Property f2069X = new e(PointF.class, "bottomRight");

    /* renamed from: Y, reason: collision with root package name */
    public static final Property f2070Y = new f(PointF.class, "topLeft");

    /* renamed from: Z, reason: collision with root package name */
    public static final Property f2071Z = new g(PointF.class, "position");

    /* renamed from: a0, reason: collision with root package name */
    public static C0409j f2072a0 = new C0409j();

    /* renamed from: I, reason: collision with root package name */
    public int[] f2073I = new int[2];

    /* renamed from: J, reason: collision with root package name */
    public boolean f2074J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2075K = false;

    /* renamed from: H2.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2076a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f2077b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2078c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f2079d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f6) {
            this.f2076a = viewGroup;
            this.f2077b = bitmapDrawable;
            this.f2078c = view;
            this.f2079d = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            A.b(this.f2076a).b(this.f2077b);
            A.g(this.f2078c, this.f2079d);
        }
    }

    /* renamed from: H2.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends Property {

        /* renamed from: a, reason: collision with root package name */
        public Rect f2081a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f2081a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f2081a);
            Rect rect = this.f2081a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f2081a);
            this.f2081a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f2081a);
        }
    }

    /* renamed from: H2.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0038c extends Property {
        public C0038c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: H2.c$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: H2.c$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: H2.c$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: H2.c$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            A.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: H2.c$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f2082a;
        private k mViewBounds;

        public h(k kVar) {
            this.f2082a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: H2.c$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2084a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2085b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f2086c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2087d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2088e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f2089f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f2090g;

        public i(View view, Rect rect, int i6, int i7, int i8, int i9) {
            this.f2085b = view;
            this.f2086c = rect;
            this.f2087d = i6;
            this.f2088e = i7;
            this.f2089f = i8;
            this.f2090g = i9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2084a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2084a) {
                return;
            }
            AbstractC2393D.R(this.f2085b, this.f2086c);
            A.f(this.f2085b, this.f2087d, this.f2088e, this.f2089f, this.f2090g);
        }
    }

    /* renamed from: H2.c$j */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class j extends AbstractC0412m {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2092a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2093b;

        public j(ViewGroup viewGroup) {
            this.f2093b = viewGroup;
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void a(AbstractC0411l abstractC0411l) {
            x.c(this.f2093b, false);
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            if (!this.f2092a) {
                x.c(this.f2093b, false);
            }
            abstractC0411l.Q(this);
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void c(AbstractC0411l abstractC0411l) {
            x.c(this.f2093b, true);
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void e(AbstractC0411l abstractC0411l) {
            x.c(this.f2093b, false);
            this.f2092a = true;
        }
    }

    /* renamed from: H2.c$k */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public int f2095a;

        /* renamed from: b, reason: collision with root package name */
        public int f2096b;

        /* renamed from: c, reason: collision with root package name */
        public int f2097c;

        /* renamed from: d, reason: collision with root package name */
        public int f2098d;

        /* renamed from: e, reason: collision with root package name */
        public View f2099e;

        /* renamed from: f, reason: collision with root package name */
        public int f2100f;

        /* renamed from: g, reason: collision with root package name */
        public int f2101g;

        public k(View view) {
            this.f2099e = view;
        }

        public void a(PointF pointF) {
            this.f2097c = Math.round(pointF.x);
            this.f2098d = Math.round(pointF.y);
            int i6 = this.f2101g + 1;
            this.f2101g = i6;
            if (this.f2100f == i6) {
                b();
            }
        }

        public final void b() {
            A.f(this.f2099e, this.f2095a, this.f2096b, this.f2097c, this.f2098d);
            this.f2100f = 0;
            this.f2101g = 0;
        }

        public void c(PointF pointF) {
            this.f2095a = Math.round(pointF.x);
            this.f2096b = Math.round(pointF.y);
            int i6 = this.f2100f + 1;
            this.f2100f = i6;
            if (i6 == this.f2101g) {
                b();
            }
        }
    }

    @Override // H2.AbstractC0411l
    public String[] E() {
        return f2065L;
    }

    public final void d0(s sVar) {
        View view = sVar.f2188b;
        if (!AbstractC2393D.A(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f2187a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f2187a.put("android:changeBounds:parent", sVar.f2188b.getParent());
        if (this.f2075K) {
            sVar.f2188b.getLocationInWindow(this.f2073I);
            sVar.f2187a.put("android:changeBounds:windowX", Integer.valueOf(this.f2073I[0]));
            sVar.f2187a.put("android:changeBounds:windowY", Integer.valueOf(this.f2073I[1]));
        }
        if (this.f2074J) {
            sVar.f2187a.put("android:changeBounds:clip", AbstractC2393D.k(view));
        }
    }

    public final boolean e0(View view, View view2) {
        if (!this.f2075K) {
            return true;
        }
        s u6 = u(view, true);
        return u6 == null ? view == view2 : view2 == u6.f2188b;
    }

    @Override // H2.AbstractC0411l
    public void h(s sVar) {
        d0(sVar);
    }

    @Override // H2.AbstractC0411l
    public void k(s sVar) {
        d0(sVar);
    }

    @Override // H2.AbstractC0411l
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        Animator animator;
        int i6;
        int i7;
        Rect rect;
        View view;
        ObjectAnimator objectAnimator;
        Animator c6;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f2187a;
        Map map2 = sVar2.f2187a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f2188b;
        if (e0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f2187a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f2187a.get("android:changeBounds:bounds");
            int i8 = rect2.left;
            int i9 = rect3.left;
            int i10 = rect2.top;
            int i11 = rect3.top;
            int i12 = rect2.right;
            int i13 = rect3.right;
            int i14 = rect2.bottom;
            int i15 = rect3.bottom;
            animator = null;
            int i16 = i12 - i8;
            int i17 = i14 - i10;
            int i18 = i13 - i9;
            int i19 = i15 - i11;
            Rect rect4 = (Rect) sVar.f2187a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f2187a.get("android:changeBounds:clip");
            if ((i16 == 0 || i17 == 0) && (i18 == 0 || i19 == 0)) {
                i6 = 0;
            } else {
                i6 = (i8 == i9 && i10 == i11) ? 0 : 1;
                if (i12 != i13 || i14 != i15) {
                    i6++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i6++;
            }
            if (i6 > 0) {
                if (this.f2074J) {
                    A.f(view2, i8, i10, Math.max(i16, i18) + i8, Math.max(i17, i19) + i10);
                    ObjectAnimator a6 = (i8 == i9 && i10 == i11) ? null : AbstractC0405f.a(view2, f2071Z, w().a(i8, i10, i9, i11));
                    if (rect4 == null) {
                        i7 = 0;
                        rect = new Rect(0, 0, i16, i17);
                    } else {
                        i7 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i7, i7, i18, i19) : rect5;
                    if (rect.equals(rect6)) {
                        view = view2;
                        objectAnimator = null;
                    } else {
                        AbstractC2393D.R(view2, rect);
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view2, "clipBounds", f2072a0, rect, rect6);
                        view = view2;
                        ofObject.addListener(new i(view2, rect5, i9, i11, i13, i15));
                        objectAnimator = ofObject;
                    }
                    c6 = r.c(a6, objectAnimator);
                } else {
                    A.f(view2, i8, i10, i12, i14);
                    if (i6 != 2) {
                        c6 = (i8 == i9 && i10 == i11) ? AbstractC0405f.a(view2, f2069X, w().a(i12, i14, i13, i15)) : AbstractC0405f.a(view2, f2070Y, w().a(i8, i10, i9, i11));
                    } else if (i16 == i18 && i17 == i19) {
                        c6 = AbstractC0405f.a(view2, f2071Z, w().a(i8, i10, i9, i11));
                    } else {
                        k kVar = new k(view2);
                        ObjectAnimator a7 = AbstractC0405f.a(kVar, f2067V, w().a(i8, i10, i9, i11));
                        ObjectAnimator a8 = AbstractC0405f.a(kVar, f2068W, w().a(i12, i14, i13, i15));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a7, a8);
                        animatorSet.addListener(new h(kVar));
                        c6 = animatorSet;
                    }
                    view = view2;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    x.c(viewGroup4, true);
                    a(new j(viewGroup4));
                }
                return c6;
            }
        } else {
            animator = null;
            int intValue = ((Integer) sVar.f2187a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f2187a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f2187a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f2187a.get("android:changeBounds:windowY")).intValue();
            if (intValue != intValue3 || intValue2 != intValue4) {
                viewGroup.getLocationInWindow(this.f2073I);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c7 = A.c(view2);
                A.g(view2, 0.0f);
                A.b(viewGroup).a(bitmapDrawable);
                AbstractC0406g w6 = w();
                int[] iArr = this.f2073I;
                int i20 = iArr[0];
                int i21 = iArr[1];
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC0407h.a(f2066M, w6.a(intValue - i20, intValue2 - i21, intValue3 - i20, intValue4 - i21)));
                ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c7));
                return ofPropertyValuesHolder;
            }
        }
        return animator;
    }
}
