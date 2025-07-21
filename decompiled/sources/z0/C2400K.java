package z0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import q0.C1999b;

/* renamed from: z0.K, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2400K {

    /* renamed from: b, reason: collision with root package name */
    public static final C2400K f21404b;

    /* renamed from: a, reason: collision with root package name */
    public final k f21405a;

    /* renamed from: z0.K$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final e f21406a;

        public a() {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                this.f21406a = new d();
            } else if (i6 >= 29) {
                this.f21406a = new c();
            } else {
                this.f21406a = new b();
            }
        }

        public C2400K a() {
            return this.f21406a.b();
        }

        public a b(int i6, C1999b c1999b) {
            this.f21406a.c(i6, c1999b);
            return this;
        }
    }

    /* renamed from: z0.K$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public static Field f21407e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f21408f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor f21409g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f21410h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f21411c = h();

        /* renamed from: d, reason: collision with root package name */
        public C1999b f21412d;

        private static WindowInsets h() {
            if (!f21408f) {
                try {
                    f21407e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
                }
                f21408f = true;
            }
            Field field = f21407e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
                }
            }
            if (!f21410h) {
                try {
                    f21409g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
                }
                f21410h = true;
            }
            Constructor constructor = f21409g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
                }
            }
            return null;
        }

        @Override // z0.C2400K.e
        @NonNull
        public C2400K b() {
            a();
            C2400K n6 = C2400K.n(this.f21411c);
            n6.i(this.f21415b);
            n6.l(this.f21412d);
            return n6;
        }

        @Override // z0.C2400K.e
        public void f(@NonNull C1999b c1999b) {
            WindowInsets windowInsets = this.f21411c;
            if (windowInsets != null) {
                this.f21411c = windowInsets.replaceSystemWindowInsets(c1999b.f18609a, c1999b.f18610b, c1999b.f18611c, c1999b.f18612d);
            }
        }
    }

    /* renamed from: z0.K$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends e {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f21413c = AbstractC2406Q.a();

        @Override // z0.C2400K.e
        @NonNull
        public C2400K b() {
            WindowInsets build;
            a();
            build = this.f21413c.build();
            C2400K n6 = C2400K.n(build);
            n6.i(this.f21415b);
            return n6;
        }

        @Override // z0.C2400K.e
        public void d(@NonNull C1999b c1999b) {
            this.f21413c.setMandatorySystemGestureInsets(c1999b.e());
        }

        @Override // z0.C2400K.e
        public void e(@NonNull C1999b c1999b) {
            this.f21413c.setSystemGestureInsets(c1999b.e());
        }

        @Override // z0.C2400K.e
        public void f(@NonNull C1999b c1999b) {
            this.f21413c.setSystemWindowInsets(c1999b.e());
        }

        @Override // z0.C2400K.e
        public void g(@NonNull C1999b c1999b) {
            this.f21413c.setTappableElementInsets(c1999b.e());
        }
    }

    /* renamed from: z0.K$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends c {
        @Override // z0.C2400K.e
        public void c(int i6, @NonNull C1999b c1999b) {
            this.f21413c.setInsets(m.a(i6), c1999b.e());
        }
    }

    /* renamed from: z0.K$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final C2400K f21414a;

        /* renamed from: b, reason: collision with root package name */
        public C1999b[] f21415b;

        public e() {
            this(new C2400K((C2400K) null));
        }

        public final void a() {
            C1999b[] c1999bArr = this.f21415b;
            if (c1999bArr != null) {
                C1999b c1999b = c1999bArr[l.d(1)];
                C1999b c1999b2 = this.f21415b[l.d(2)];
                if (c1999b2 == null) {
                    c1999b2 = this.f21414a.f(2);
                }
                if (c1999b == null) {
                    c1999b = this.f21414a.f(1);
                }
                f(C1999b.a(c1999b, c1999b2));
                C1999b c1999b3 = this.f21415b[l.d(16)];
                if (c1999b3 != null) {
                    e(c1999b3);
                }
                C1999b c1999b4 = this.f21415b[l.d(32)];
                if (c1999b4 != null) {
                    d(c1999b4);
                }
                C1999b c1999b5 = this.f21415b[l.d(64)];
                if (c1999b5 != null) {
                    g(c1999b5);
                }
            }
        }

        @NonNull
        public abstract C2400K b();

        public void c(int i6, @NonNull C1999b c1999b) {
            if (this.f21415b == null) {
                this.f21415b = new C1999b[9];
            }
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    this.f21415b[l.d(i7)] = c1999b;
                }
            }
        }

        public void d(@NonNull C1999b c1999b) {
        }

        public void e(@NonNull C1999b c1999b) {
        }

        public abstract void f(@NonNull C1999b c1999b);

        public void g(@NonNull C1999b c1999b) {
        }

        public e(@NonNull C2400K c2400k) {
            this.f21414a = c2400k;
        }
    }

    /* renamed from: z0.K$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h extends g {
        public h(@NonNull C2400K c2400k, @NonNull WindowInsets windowInsets) {
            super(c2400k, windowInsets);
        }

        @Override // z0.C2400K.k
        @NonNull
        public C2400K a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f21421c.consumeDisplayCutout();
            return C2400K.n(consumeDisplayCutout);
        }

        @Override // z0.C2400K.f, z0.C2400K.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f21421c, hVar.f21421c) && Objects.equals(this.f21425g, hVar.f21425g);
        }

        @Override // z0.C2400K.k
        public C2422h f() {
            DisplayCutout displayCutout;
            displayCutout = this.f21421c.getDisplayCutout();
            return C2422h.e(displayCutout);
        }

        @Override // z0.C2400K.k
        public int hashCode() {
            return this.f21421c.hashCode();
        }

        public h(@NonNull C2400K c2400k, @NonNull h hVar) {
            super(c2400k, hVar);
        }
    }

    /* renamed from: z0.K$j */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class j extends i {

        /* renamed from: q, reason: collision with root package name */
        public static final C2400K f21430q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f21430q = C2400K.n(windowInsets);
        }

        public j(@NonNull C2400K c2400k, @NonNull WindowInsets windowInsets) {
            super(c2400k, windowInsets);
        }

        @Override // z0.C2400K.f, z0.C2400K.k
        public final void d(@NonNull View view) {
        }

        @Override // z0.C2400K.f, z0.C2400K.k
        @NonNull
        public C1999b g(int i6) {
            Insets insets;
            insets = this.f21421c.getInsets(m.a(i6));
            return C1999b.d(insets);
        }

        public j(@NonNull C2400K c2400k, @NonNull j jVar) {
            super(c2400k, jVar);
        }
    }

    /* renamed from: z0.K$k */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class k {

        /* renamed from: b, reason: collision with root package name */
        public static final C2400K f21431b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        public final C2400K f21432a;

        public k(@NonNull C2400K c2400k) {
            this.f21432a = c2400k;
        }

        @NonNull
        public C2400K a() {
            return this.f21432a;
        }

        @NonNull
        public C2400K b() {
            return this.f21432a;
        }

        @NonNull
        public C2400K c() {
            return this.f21432a;
        }

        public void d(@NonNull View view) {
        }

        public void e(@NonNull C2400K c2400k) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return n() == kVar.n() && m() == kVar.m() && y0.b.a(k(), kVar.k()) && y0.b.a(i(), kVar.i()) && y0.b.a(f(), kVar.f());
        }

        public C2422h f() {
            return null;
        }

        @NonNull
        public C1999b g(int i6) {
            return C1999b.f18608e;
        }

        @NonNull
        public C1999b h() {
            return k();
        }

        public int hashCode() {
            return y0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), f());
        }

        @NonNull
        public C1999b i() {
            return C1999b.f18608e;
        }

        @NonNull
        public C1999b j() {
            return k();
        }

        @NonNull
        public C1999b k() {
            return C1999b.f18608e;
        }

        @NonNull
        public C1999b l() {
            return k();
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(C1999b[] c1999bArr) {
        }

        public void p(@NonNull C1999b c1999b) {
        }

        public void q(C2400K c2400k) {
        }

        public void r(C1999b c1999b) {
        }
    }

    /* renamed from: z0.K$l */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class l {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i6) {
            if (i6 == 1) {
                return 0;
            }
            if (i6 == 2) {
                return 1;
            }
            if (i6 == 4) {
                return 2;
            }
            if (i6 == 8) {
                return 3;
            }
            if (i6 == 16) {
                return 4;
            }
            if (i6 == 32) {
                return 5;
            }
            if (i6 == 64) {
                return 6;
            }
            if (i6 == 128) {
                return 7;
            }
            if (i6 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i6);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* renamed from: z0.K$m */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class m {
        public static int a(int i6) {
            int statusBars;
            int i7 = 0;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i6 & i8) != 0) {
                    if (i8 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i8 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i8 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i8 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i8 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i8 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i8 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i8 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i7 |= statusBars;
                }
            }
            return i7;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f21404b = j.f21430q;
        } else {
            f21404b = k.f21431b;
        }
    }

    public C2400K(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            this.f21405a = new j(this, windowInsets);
            return;
        }
        if (i6 >= 29) {
            this.f21405a = new i(this, windowInsets);
        } else if (i6 >= 28) {
            this.f21405a = new h(this, windowInsets);
        } else {
            this.f21405a = new g(this, windowInsets);
        }
    }

    public static C2400K n(WindowInsets windowInsets) {
        return o(windowInsets, null);
    }

    public static C2400K o(WindowInsets windowInsets, View view) {
        C2400K c2400k = new C2400K((WindowInsets) y0.g.f(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c2400k.k(AbstractC2393D.s(view));
            c2400k.d(view.getRootView());
        }
        return c2400k;
    }

    public C2400K a() {
        return this.f21405a.a();
    }

    public C2400K b() {
        return this.f21405a.b();
    }

    public C2400K c() {
        return this.f21405a.c();
    }

    public void d(View view) {
        this.f21405a.d(view);
    }

    public C2422h e() {
        return this.f21405a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2400K) {
            return y0.b.a(this.f21405a, ((C2400K) obj).f21405a);
        }
        return false;
    }

    public C1999b f(int i6) {
        return this.f21405a.g(i6);
    }

    public C1999b g() {
        return this.f21405a.i();
    }

    public boolean h() {
        return this.f21405a.m();
    }

    public int hashCode() {
        k kVar = this.f21405a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public void i(C1999b[] c1999bArr) {
        this.f21405a.o(c1999bArr);
    }

    public void j(C1999b c1999b) {
        this.f21405a.p(c1999b);
    }

    public void k(C2400K c2400k) {
        this.f21405a.q(c2400k);
    }

    public void l(C1999b c1999b) {
        this.f21405a.r(c1999b);
    }

    public WindowInsets m() {
        k kVar = this.f21405a;
        if (kVar instanceof f) {
            return ((f) kVar).f21421c;
        }
        return null;
    }

    /* renamed from: z0.K$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g extends f {

        /* renamed from: m, reason: collision with root package name */
        public C1999b f21426m;

        public g(@NonNull C2400K c2400k, @NonNull WindowInsets windowInsets) {
            super(c2400k, windowInsets);
            this.f21426m = null;
        }

        @Override // z0.C2400K.k
        @NonNull
        public C2400K b() {
            return C2400K.n(this.f21421c.consumeStableInsets());
        }

        @Override // z0.C2400K.k
        @NonNull
        public C2400K c() {
            return C2400K.n(this.f21421c.consumeSystemWindowInsets());
        }

        @Override // z0.C2400K.k
        @NonNull
        public final C1999b i() {
            if (this.f21426m == null) {
                this.f21426m = C1999b.b(this.f21421c.getStableInsetLeft(), this.f21421c.getStableInsetTop(), this.f21421c.getStableInsetRight(), this.f21421c.getStableInsetBottom());
            }
            return this.f21426m;
        }

        @Override // z0.C2400K.k
        public boolean m() {
            return this.f21421c.isConsumed();
        }

        @Override // z0.C2400K.k
        public void r(C1999b c1999b) {
            this.f21426m = c1999b;
        }

        public g(@NonNull C2400K c2400k, @NonNull g gVar) {
            super(c2400k, gVar);
            this.f21426m = null;
            this.f21426m = gVar.f21426m;
        }
    }

    /* renamed from: z0.K$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f extends k {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f21416h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f21417i;

        /* renamed from: j, reason: collision with root package name */
        public static Class f21418j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f21419k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f21420l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f21421c;

        /* renamed from: d, reason: collision with root package name */
        public C1999b[] f21422d;

        /* renamed from: e, reason: collision with root package name */
        public C1999b f21423e;

        /* renamed from: f, reason: collision with root package name */
        public C2400K f21424f;

        /* renamed from: g, reason: collision with root package name */
        public C1999b f21425g;

        public f(@NonNull C2400K c2400k, @NonNull WindowInsets windowInsets) {
            super(c2400k);
            this.f21423e = null;
            this.f21421c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private C1999b s(int i6, boolean z6) {
            C1999b c1999b = C1999b.f18608e;
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    c1999b = C1999b.a(c1999b, t(i7, z6));
                }
            }
            return c1999b;
        }

        private C1999b u() {
            C2400K c2400k = this.f21424f;
            return c2400k != null ? c2400k.g() : C1999b.f18608e;
        }

        private C1999b v(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f21416h) {
                w();
            }
            Method method = f21417i;
            if (method != null && f21418j != null && f21419k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f21419k.get(f21420l.get(invoke));
                    if (rect != null) {
                        return C1999b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void w() {
            try {
                f21417i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f21418j = cls;
                f21419k = cls.getDeclaredField("mVisibleInsets");
                f21420l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f21419k.setAccessible(true);
                f21420l.setAccessible(true);
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
            f21416h = true;
        }

        @Override // z0.C2400K.k
        public void d(@NonNull View view) {
            C1999b v6 = v(view);
            if (v6 == null) {
                v6 = C1999b.f18608e;
            }
            p(v6);
        }

        @Override // z0.C2400K.k
        public void e(@NonNull C2400K c2400k) {
            c2400k.k(this.f21424f);
            c2400k.j(this.f21425g);
        }

        @Override // z0.C2400K.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f21425g, ((f) obj).f21425g);
            }
            return false;
        }

        @Override // z0.C2400K.k
        @NonNull
        public C1999b g(int i6) {
            return s(i6, false);
        }

        @Override // z0.C2400K.k
        @NonNull
        public final C1999b k() {
            if (this.f21423e == null) {
                this.f21423e = C1999b.b(this.f21421c.getSystemWindowInsetLeft(), this.f21421c.getSystemWindowInsetTop(), this.f21421c.getSystemWindowInsetRight(), this.f21421c.getSystemWindowInsetBottom());
            }
            return this.f21423e;
        }

        @Override // z0.C2400K.k
        public boolean n() {
            return this.f21421c.isRound();
        }

        @Override // z0.C2400K.k
        public void o(C1999b[] c1999bArr) {
            this.f21422d = c1999bArr;
        }

        @Override // z0.C2400K.k
        public void p(@NonNull C1999b c1999b) {
            this.f21425g = c1999b;
        }

        @Override // z0.C2400K.k
        public void q(C2400K c2400k) {
            this.f21424f = c2400k;
        }

        @NonNull
        public C1999b t(int i6, boolean z6) {
            C1999b g6;
            int i7;
            if (i6 == 1) {
                return z6 ? C1999b.b(0, Math.max(u().f18610b, k().f18610b), 0, 0) : C1999b.b(0, k().f18610b, 0, 0);
            }
            if (i6 == 2) {
                if (z6) {
                    C1999b u6 = u();
                    C1999b i8 = i();
                    return C1999b.b(Math.max(u6.f18609a, i8.f18609a), 0, Math.max(u6.f18611c, i8.f18611c), Math.max(u6.f18612d, i8.f18612d));
                }
                C1999b k6 = k();
                C2400K c2400k = this.f21424f;
                g6 = c2400k != null ? c2400k.g() : null;
                int i9 = k6.f18612d;
                if (g6 != null) {
                    i9 = Math.min(i9, g6.f18612d);
                }
                return C1999b.b(k6.f18609a, 0, k6.f18611c, i9);
            }
            if (i6 != 8) {
                if (i6 == 16) {
                    return j();
                }
                if (i6 == 32) {
                    return h();
                }
                if (i6 == 64) {
                    return l();
                }
                if (i6 != 128) {
                    return C1999b.f18608e;
                }
                C2400K c2400k2 = this.f21424f;
                C2422h e6 = c2400k2 != null ? c2400k2.e() : f();
                return e6 != null ? C1999b.b(e6.b(), e6.d(), e6.c(), e6.a()) : C1999b.f18608e;
            }
            C1999b[] c1999bArr = this.f21422d;
            g6 = c1999bArr != null ? c1999bArr[l.d(8)] : null;
            if (g6 != null) {
                return g6;
            }
            C1999b k7 = k();
            C1999b u7 = u();
            int i10 = k7.f18612d;
            if (i10 > u7.f18612d) {
                return C1999b.b(0, 0, 0, i10);
            }
            C1999b c1999b = this.f21425g;
            return (c1999b == null || c1999b.equals(C1999b.f18608e) || (i7 = this.f21425g.f18612d) <= u7.f18612d) ? C1999b.f18608e : C1999b.b(0, 0, 0, i7);
        }

        public f(@NonNull C2400K c2400k, @NonNull f fVar) {
            this(c2400k, new WindowInsets(fVar.f21421c));
        }
    }

    /* renamed from: z0.K$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i extends h {

        /* renamed from: n, reason: collision with root package name */
        public C1999b f21427n;

        /* renamed from: o, reason: collision with root package name */
        public C1999b f21428o;

        /* renamed from: p, reason: collision with root package name */
        public C1999b f21429p;

        public i(@NonNull C2400K c2400k, @NonNull WindowInsets windowInsets) {
            super(c2400k, windowInsets);
            this.f21427n = null;
            this.f21428o = null;
            this.f21429p = null;
        }

        @Override // z0.C2400K.k
        @NonNull
        public C1999b h() {
            Insets mandatorySystemGestureInsets;
            if (this.f21428o == null) {
                mandatorySystemGestureInsets = this.f21421c.getMandatorySystemGestureInsets();
                this.f21428o = C1999b.d(mandatorySystemGestureInsets);
            }
            return this.f21428o;
        }

        @Override // z0.C2400K.k
        @NonNull
        public C1999b j() {
            Insets systemGestureInsets;
            if (this.f21427n == null) {
                systemGestureInsets = this.f21421c.getSystemGestureInsets();
                this.f21427n = C1999b.d(systemGestureInsets);
            }
            return this.f21427n;
        }

        @Override // z0.C2400K.k
        @NonNull
        public C1999b l() {
            Insets tappableElementInsets;
            if (this.f21429p == null) {
                tappableElementInsets = this.f21421c.getTappableElementInsets();
                this.f21429p = C1999b.d(tappableElementInsets);
            }
            return this.f21429p;
        }

        @Override // z0.C2400K.g, z0.C2400K.k
        public void r(C1999b c1999b) {
        }

        public i(@NonNull C2400K c2400k, @NonNull i iVar) {
            super(c2400k, iVar);
            this.f21427n = null;
            this.f21428o = null;
            this.f21429p = null;
        }
    }

    public C2400K(C2400K c2400k) {
        if (c2400k != null) {
            k kVar = c2400k.f21405a;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30 && (kVar instanceof j)) {
                this.f21405a = new j(this, (j) kVar);
            } else if (i6 >= 29 && (kVar instanceof i)) {
                this.f21405a = new i(this, (i) kVar);
            } else if (i6 >= 28 && (kVar instanceof h)) {
                this.f21405a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f21405a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f21405a = new f(this, (f) kVar);
            } else {
                this.f21405a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f21405a = new k(this);
    }
}
