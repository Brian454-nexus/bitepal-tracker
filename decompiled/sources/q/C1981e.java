package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import i.AbstractC1468a;
import i.AbstractC1469b;
import i.AbstractC1471d;
import k.AbstractC1653a;
import q.C1975I;
import q0.AbstractC1998a;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1981e {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f18531b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1981e f18532c;

    /* renamed from: a, reason: collision with root package name */
    public C1975I f18533a;

    /* renamed from: q.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements C1975I.c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f18534a = {AbstractC1471d.f15377S, AbstractC1471d.f15375Q, AbstractC1471d.f15379a};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f18535b = {AbstractC1471d.f15393o, AbstractC1471d.f15360B, AbstractC1471d.f15398t, AbstractC1471d.f15394p, AbstractC1471d.f15395q, AbstractC1471d.f15397s, AbstractC1471d.f15396r};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f18536c = {AbstractC1471d.f15374P, AbstractC1471d.f15376R, AbstractC1471d.f15389k, AbstractC1471d.f15367I, AbstractC1471d.f15368J, AbstractC1471d.f15370L, AbstractC1471d.f15372N, AbstractC1471d.f15369K, AbstractC1471d.f15371M, AbstractC1471d.f15373O};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f18537d = {AbstractC1471d.f15401w, AbstractC1471d.f15387i, AbstractC1471d.f15400v};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f18538e = {AbstractC1471d.f15366H, AbstractC1471d.f15378T};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f18539f = {AbstractC1471d.f15381c, AbstractC1471d.f15385g, AbstractC1471d.f15382d, AbstractC1471d.f15386h};

        @Override // q.C1975I.c
        public Drawable a(C1975I c1975i, Context context, int i6) {
            if (i6 == AbstractC1471d.f15388j) {
                return new LayerDrawable(new Drawable[]{c1975i.i(context, AbstractC1471d.f15387i), c1975i.i(context, AbstractC1471d.f15389k)});
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
        @Override // q.C1975I.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = q.C1981e.a()
                int[] r1 = r6.f18534a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = i.AbstractC1468a.f15338l
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f18536c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = i.AbstractC1468a.f15336j
                goto L11
            L20:
                int[] r1 = r6.f18537d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = i.AbstractC1471d.f15399u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = i.AbstractC1471d.f15390l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L6b
                boolean r3 = q.y.a(r9)
                if (r3 == 0) goto L5a
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5a:
                int r7 = q.N.b(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = q.C1981e.d(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6a
                r9.setAlpha(r0)
            L6a:
                return r2
            L6b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: q.C1981e.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // q.C1975I.c
        public PorterDuff.Mode c(int i6) {
            if (i6 == AbstractC1471d.f15364F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // q.C1975I.c
        public ColorStateList d(Context context, int i6) {
            if (i6 == AbstractC1471d.f15391m) {
                return AbstractC1653a.a(context, AbstractC1469b.f15349c);
            }
            if (i6 == AbstractC1471d.f15365G) {
                return AbstractC1653a.a(context, AbstractC1469b.f15352f);
            }
            if (i6 == AbstractC1471d.f15364F) {
                return k(context);
            }
            if (i6 == AbstractC1471d.f15384f) {
                return j(context);
            }
            if (i6 == AbstractC1471d.f15380b) {
                return g(context);
            }
            if (i6 == AbstractC1471d.f15383e) {
                return i(context);
            }
            if (i6 == AbstractC1471d.f15362D || i6 == AbstractC1471d.f15363E) {
                return AbstractC1653a.a(context, AbstractC1469b.f15351e);
            }
            if (f(this.f18535b, i6)) {
                return N.d(context, AbstractC1468a.f15338l);
            }
            if (f(this.f18538e, i6)) {
                return AbstractC1653a.a(context, AbstractC1469b.f15348b);
            }
            if (f(this.f18539f, i6)) {
                return AbstractC1653a.a(context, AbstractC1469b.f15347a);
            }
            if (i6 == AbstractC1471d.f15359A) {
                return AbstractC1653a.a(context, AbstractC1469b.f15350d);
            }
            return null;
        }

        @Override // q.C1975I.c
        public boolean e(Context context, int i6, Drawable drawable) {
            if (i6 == AbstractC1471d.f15361C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i7 = AbstractC1468a.f15338l;
                l(findDrawableByLayerId, N.b(context, i7), C1981e.f18531b);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), N.b(context, i7), C1981e.f18531b);
                l(layerDrawable.findDrawableByLayerId(R.id.progress), N.b(context, AbstractC1468a.f15336j), C1981e.f18531b);
                return true;
            }
            if (i6 != AbstractC1471d.f15403y && i6 != AbstractC1471d.f15402x && i6 != AbstractC1471d.f15404z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            l(layerDrawable2.findDrawableByLayerId(R.id.background), N.a(context, AbstractC1468a.f15338l), C1981e.f18531b);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i8 = AbstractC1468a.f15336j;
            l(findDrawableByLayerId2, N.b(context, i8), C1981e.f18531b);
            l(layerDrawable2.findDrawableByLayerId(R.id.progress), N.b(context, i8), C1981e.f18531b);
            return true;
        }

        public final boolean f(int[] iArr, int i6) {
            for (int i7 : iArr) {
                if (i7 == i6) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i6) {
            int b6 = N.b(context, AbstractC1468a.f15337k);
            return new ColorStateList(new int[][]{N.f18488b, N.f18491e, N.f18489c, N.f18495i}, new int[]{N.a(context, AbstractC1468a.f15335i), AbstractC1998a.c(b6, i6), AbstractC1998a.c(b6, i6), i6});
        }

        public final ColorStateList i(Context context) {
            return h(context, N.b(context, AbstractC1468a.f15334h));
        }

        public final ColorStateList j(Context context) {
            return h(context, N.b(context, AbstractC1468a.f15335i));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i6 = AbstractC1468a.f15339m;
            ColorStateList d6 = N.d(context, i6);
            if (d6 == null || !d6.isStateful()) {
                iArr[0] = N.f18488b;
                iArr2[0] = N.a(context, i6);
                iArr[1] = N.f18492f;
                iArr2[1] = N.b(context, AbstractC1468a.f15336j);
                iArr[2] = N.f18495i;
                iArr2[2] = N.b(context, i6);
            } else {
                int[] iArr3 = N.f18488b;
                iArr[0] = iArr3;
                iArr2[0] = d6.getColorForState(iArr3, 0);
                iArr[1] = N.f18492f;
                iArr2[1] = N.b(context, AbstractC1468a.f15336j);
                iArr[2] = N.f18495i;
                iArr2[2] = d6.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final void l(Drawable drawable, int i6, PorterDuff.Mode mode) {
            if (y.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1981e.f18531b;
            }
            drawable.setColorFilter(C1981e.d(i6, mode));
        }
    }

    public static synchronized C1981e b() {
        C1981e c1981e;
        synchronized (C1981e.class) {
            try {
                if (f18532c == null) {
                    f();
                }
                c1981e = f18532c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1981e;
    }

    public static synchronized PorterDuffColorFilter d(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter k6;
        synchronized (C1981e.class) {
            k6 = C1975I.k(i6, mode);
        }
        return k6;
    }

    public static synchronized void f() {
        synchronized (C1981e.class) {
            if (f18532c == null) {
                C1981e c1981e = new C1981e();
                f18532c = c1981e;
                c1981e.f18533a = C1975I.g();
                f18532c.f18533a.s(new a());
            }
        }
    }

    public static void g(Drawable drawable, P p6, int[] iArr) {
        C1975I.u(drawable, p6, iArr);
    }

    public synchronized Drawable c(Context context, int i6) {
        return this.f18533a.i(context, i6);
    }

    public synchronized ColorStateList e(Context context, int i6) {
        return this.f18533a.l(context, i6);
    }
}
