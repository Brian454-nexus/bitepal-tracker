package k5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i extends k5.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f16847f;

    /* renamed from: g, reason: collision with root package name */
    public static int f16848g = com.bumptech.glide.h.f13193a;

    /* renamed from: a, reason: collision with root package name */
    public final View f16849a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16850b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnAttachStateChangeListener f16851c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16852d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16853e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static Integer f16854e;

        /* renamed from: a, reason: collision with root package name */
        public final View f16855a;

        /* renamed from: b, reason: collision with root package name */
        public final List f16856b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f16857c;

        /* renamed from: d, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0211a f16858d;

        /* renamed from: k5.i$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC0211a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f16859a;

            public ViewTreeObserverOnPreDrawListenerC0211a(a aVar) {
                this.f16859a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f16859a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f16855a = view;
        }

        public static int c(Context context) {
            if (f16854e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f16854e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f16854e.intValue();
        }

        public void a() {
            if (this.f16856b.isEmpty()) {
                return;
            }
            int g6 = g();
            int f6 = f();
            if (i(g6, f6)) {
                j(g6, f6);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f16855a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f16858d);
            }
            this.f16858d = null;
            this.f16856b.clear();
        }

        public void d(g gVar) {
            int g6 = g();
            int f6 = f();
            if (i(g6, f6)) {
                gVar.f(g6, f6);
                return;
            }
            if (!this.f16856b.contains(gVar)) {
                this.f16856b.add(gVar);
            }
            if (this.f16858d == null) {
                ViewTreeObserver viewTreeObserver = this.f16855a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0211a viewTreeObserverOnPreDrawListenerC0211a = new ViewTreeObserverOnPreDrawListenerC0211a(this);
                this.f16858d = viewTreeObserverOnPreDrawListenerC0211a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0211a);
            }
        }

        public final int e(int i6, int i7, int i8) {
            int i9 = i7 - i8;
            if (i9 > 0) {
                return i9;
            }
            if (this.f16857c && this.f16855a.isLayoutRequested()) {
                return 0;
            }
            int i10 = i6 - i8;
            if (i10 > 0) {
                return i10;
            }
            if (this.f16855a.isLayoutRequested() || i7 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f16855a.getContext());
        }

        public final int f() {
            int paddingTop = this.f16855a.getPaddingTop() + this.f16855a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f16855a.getLayoutParams();
            return e(this.f16855a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f16855a.getPaddingLeft() + this.f16855a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f16855a.getLayoutParams();
            return e(this.f16855a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i6) {
            return i6 > 0 || i6 == Integer.MIN_VALUE;
        }

        public final boolean i(int i6, int i7) {
            return h(i6) && h(i7);
        }

        public final void j(int i6, int i7) {
            Iterator it = new ArrayList(this.f16856b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f(i6, i7);
            }
        }

        public void k(g gVar) {
            this.f16856b.remove(gVar);
        }
    }

    public i(View view) {
        this.f16849a = (View) k.d(view);
        this.f16850b = new a(view);
    }

    public final Object b() {
        return this.f16849a.getTag(f16848g);
    }

    public final void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f16851c;
        if (onAttachStateChangeListener == null || this.f16853e) {
            return;
        }
        this.f16849a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f16853e = true;
    }

    @Override // k5.h
    public void e(g gVar) {
        this.f16850b.k(gVar);
    }

    public final void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f16851c;
        if (onAttachStateChangeListener == null || !this.f16853e) {
            return;
        }
        this.f16849a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f16853e = false;
    }

    @Override // k5.h
    public void i(j5.d dVar) {
        o(dVar);
    }

    @Override // k5.a, k5.h
    public void k(Drawable drawable) {
        super.k(drawable);
        c();
    }

    @Override // k5.h
    public j5.d l() {
        Object b6 = b();
        if (b6 == null) {
            return null;
        }
        if (b6 instanceof j5.d) {
            return (j5.d) b6;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // k5.a, k5.h
    public void m(Drawable drawable) {
        super.m(drawable);
        this.f16850b.b();
        if (this.f16852d) {
            return;
        }
        g();
    }

    @Override // k5.h
    public void n(g gVar) {
        this.f16850b.d(gVar);
    }

    public final void o(Object obj) {
        f16847f = true;
        this.f16849a.setTag(f16848g, obj);
    }

    public String toString() {
        return "Target for: " + this.f16849a;
    }
}
