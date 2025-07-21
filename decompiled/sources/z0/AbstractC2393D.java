package z0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import m0.AbstractC1791e;
import z0.C2415a;

/* renamed from: z0.D, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2393D {

    /* renamed from: a, reason: collision with root package name */
    public static Field f21382a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21383b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21384c = {AbstractC1791e.f17167b, AbstractC1791e.f17168c, AbstractC1791e.f17179n, AbstractC1791e.f17190y, AbstractC1791e.f17150B, AbstractC1791e.f17151C, AbstractC1791e.f17152D, AbstractC1791e.f17153E, AbstractC1791e.f17154F, AbstractC1791e.f17155G, AbstractC1791e.f17169d, AbstractC1791e.f17170e, AbstractC1791e.f17171f, AbstractC1791e.f17172g, AbstractC1791e.f17173h, AbstractC1791e.f17174i, AbstractC1791e.f17175j, AbstractC1791e.f17176k, AbstractC1791e.f17177l, AbstractC1791e.f17178m, AbstractC1791e.f17180o, AbstractC1791e.f17181p, AbstractC1791e.f17182q, AbstractC1791e.f17183r, AbstractC1791e.f17184s, AbstractC1791e.f17185t, AbstractC1791e.f17186u, AbstractC1791e.f17187v, AbstractC1791e.f17188w, AbstractC1791e.f17189x, AbstractC1791e.f17191z, AbstractC1791e.f17149A};

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC2438x f21385d = new InterfaceC2438x() { // from class: z0.C
    };

    /* renamed from: e, reason: collision with root package name */
    public static final e f21386e = new e();

    /* renamed from: z0.D$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends f {
        public a(int i6, Class cls, int i7) {
            super(i6, cls, i7);
        }

        @Override // z0.AbstractC2393D.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(View view) {
            return Boolean.valueOf(k.c(view));
        }
    }

    /* renamed from: z0.D$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends f {
        public b(int i6, Class cls, int i7, int i8) {
            super(i6, cls, i7, i8);
        }

        @Override // z0.AbstractC2393D.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return k.a(view);
        }
    }

    /* renamed from: z0.D$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends f {
        public c(int i6, Class cls, int i7, int i8) {
            super(i6, cls, i7, i8);
        }

        @Override // z0.AbstractC2393D.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return m.a(view);
        }
    }

    /* renamed from: z0.D$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends f {
        public d(int i6, Class cls, int i7) {
            super(i6, cls, i7);
        }

        @Override // z0.AbstractC2393D.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(View view) {
            return Boolean.valueOf(k.b(view));
        }
    }

    /* renamed from: z0.D$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakHashMap f21387a = new WeakHashMap();

        public final void a(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z6) {
                AbstractC2393D.D(view, z6 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z6));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f21387a.entrySet().iterator();
                while (it.hasNext()) {
                    a((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: z0.D$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f21388a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f21389b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21390c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21391d;

        public f(int i6, Class cls, int i7) {
            this(i6, cls, 0, i7);
        }

        public final boolean a() {
            return Build.VERSION.SDK_INT >= this.f21390c;
        }

        public abstract Object b(View view);

        public Object c(View view) {
            if (a()) {
                return b(view);
            }
            Object tag = view.getTag(this.f21388a);
            if (this.f21389b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public f(int i6, Class cls, int i7, int i8) {
            this.f21388a = i6;
            this.f21389b = cls;
            this.f21391d = i7;
            this.f21390c = i8;
        }
    }

    /* renamed from: z0.D$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: z0.D$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h {

        /* renamed from: z0.D$h$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public C2400K f21392a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f21393b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2437w f21394c;

            public a(View view, InterfaceC2437w interfaceC2437w) {
                this.f21393b = view;
                this.f21394c = interfaceC2437w;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C2400K o6 = C2400K.o(windowInsets, view);
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 30) {
                    h.a(windowInsets, this.f21393b);
                    if (o6.equals(this.f21392a)) {
                        return this.f21394c.a(view, o6).m();
                    }
                }
                this.f21392a = o6;
                C2400K a6 = this.f21394c.a(view, o6);
                if (i6 >= 30) {
                    return a6.m();
                }
                AbstractC2393D.K(view);
                return a6.m();
            }
        }

        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC1791e.f17165Q);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static ColorStateList b(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode c(View view) {
            return view.getBackgroundTintMode();
        }

        public static float d(View view) {
            return view.getElevation();
        }

        public static String e(View view) {
            return view.getTransitionName();
        }

        public static boolean f(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void g(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void h(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void i(View view, float f6) {
            view.setElevation(f6);
        }

        public static void j(@NonNull View view, InterfaceC2437w interfaceC2437w) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC1791e.f17160L, interfaceC2437w);
            }
            if (interfaceC2437w == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC1791e.f17165Q));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC2437w));
            }
        }

        public static void k(View view, String str) {
            view.setTransitionName(str);
        }

        public static void l(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: z0.D$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i {
        public static C2400K a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C2400K n6 = C2400K.n(rootWindowInsets);
            n6.k(n6);
            n6.d(view.getRootView());
            return n6;
        }
    }

    /* renamed from: z0.D$j */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class j {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i6) {
            view.setImportantForAutofill(i6);
        }
    }

    /* renamed from: z0.D$k */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class k {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    /* renamed from: z0.D$l */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i6, int i7) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i6, i7);
        }
    }

    /* renamed from: z0.D$m */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class m {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }
    }

    /* renamed from: z0.D$n */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class n {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList f21395d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap f21396a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f21397b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f21398c = null;

        public static n a(View view) {
            int i6 = AbstractC1791e.f17163O;
            n nVar = (n) view.getTag(i6);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n();
            view.setTag(i6, nVar2);
            return nVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c6 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c6 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c6));
                }
            }
            return c6 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f21396a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c6 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c6 != null) {
                            return c6;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.f21397b == null) {
                this.f21397b = new SparseArray();
            }
            return this.f21397b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC1791e.f17164P);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f21398c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f21398c = new WeakReference(keyEvent);
            SparseArray d6 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d6.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d6.valueAt(indexOfKey);
                d6.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d6.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap weakHashMap = this.f21396a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f21395d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f21396a == null) {
                        this.f21396a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f21395d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f21396a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f21396a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean A(View view) {
        return view.isLaidOut();
    }

    public static boolean B(View view) {
        return h.f(view);
    }

    public static boolean C(View view) {
        Boolean bool = (Boolean) M().c(view);
        return bool != null && bool.booleanValue();
    }

    public static void D(View view, int i6) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = h(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z6 ? 32 : 2048);
                obtain.setContentChangeTypes(i6);
                if (z6) {
                    obtain.getText().add(h(view));
                    V(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i6 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i6);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(h(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i6);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e6);
                }
            }
        }
    }

    public static void E(View view, int i6) {
        view.offsetTopAndBottom(i6);
    }

    public static C2400K F(View view, C2400K c2400k) {
        WindowInsets m6 = c2400k.m();
        if (m6 != null) {
            WindowInsets b6 = g.b(view, m6);
            if (!b6.equals(m6)) {
                return C2400K.o(b6, view);
            }
        }
        return c2400k;
    }

    public static f G() {
        return new b(AbstractC1791e.f17159K, CharSequence.class, 8, 28);
    }

    public static void H(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void I(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void J(View view, Runnable runnable, long j6) {
        view.postOnAnimationDelayed(runnable, j6);
    }

    public static void K(View view) {
        g.c(view);
    }

    public static void L(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i6, i7);
        }
    }

    public static f M() {
        return new a(AbstractC1791e.f17161M, Boolean.class, 28);
    }

    public static void N(View view, C2415a c2415a) {
        if (c2415a == null && (f(view) instanceof C2415a.C0278a)) {
            c2415a = new C2415a();
        }
        V(view);
        view.setAccessibilityDelegate(c2415a == null ? null : c2415a.d());
    }

    public static void O(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void P(View view, ColorStateList colorStateList) {
        h.g(view, colorStateList);
    }

    public static void Q(View view, PorterDuff.Mode mode) {
        h.h(view, mode);
    }

    public static void R(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void S(View view, float f6) {
        h.i(view, f6);
    }

    public static void T(View view, boolean z6) {
        view.setHasTransientState(z6);
    }

    public static void U(View view, int i6) {
        view.setImportantForAccessibility(i6);
    }

    public static void V(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void W(View view, int i6) {
        j.b(view, i6);
    }

    public static void X(View view, InterfaceC2437w interfaceC2437w) {
        h.j(view, interfaceC2437w);
    }

    public static void Y(View view, String str) {
        h.k(view, str);
    }

    public static f Z() {
        return new c(AbstractC1791e.f17162N, CharSequence.class, 64, 30);
    }

    public static f a() {
        return new d(AbstractC1791e.f17158J, Boolean.class, 28);
    }

    public static void a0(View view) {
        h.l(view);
    }

    public static C2400K b(View view, C2400K c2400k) {
        WindowInsets m6 = c2400k.m();
        if (m6 != null) {
            WindowInsets a6 = g.a(view, m6);
            if (!a6.equals(m6)) {
                return C2400K.o(a6, view);
            }
        }
        return c2400k;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return n.a(view).b(view, keyEvent);
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return n.a(view).f(keyEvent);
    }

    public static C2415a e(View view) {
        View.AccessibilityDelegate f6 = f(view);
        if (f6 == null) {
            return null;
        }
        return f6 instanceof C2415a.C0278a ? ((C2415a.C0278a) f6).f21436a : new C2415a(f6);
    }

    public static View.AccessibilityDelegate f(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : g(view);
    }

    public static View.AccessibilityDelegate g(View view) {
        if (f21383b) {
            return null;
        }
        if (f21382a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f21382a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f21383b = true;
                return null;
            }
        }
        try {
            Object obj = f21382a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f21383b = true;
            return null;
        }
    }

    public static CharSequence h(View view) {
        return (CharSequence) G().c(view);
    }

    public static ColorStateList i(View view) {
        return h.b(view);
    }

    public static PorterDuff.Mode j(View view) {
        return h.c(view);
    }

    public static Rect k(View view) {
        return view.getClipBounds();
    }

    public static Display l(View view) {
        return view.getDisplay();
    }

    public static float m(View view) {
        return h.d(view);
    }

    public static int n(View view) {
        return view.getImportantForAccessibility();
    }

    public static int o(View view) {
        return j.a(view);
    }

    public static int p(View view) {
        return view.getLayoutDirection();
    }

    public static int q(View view) {
        return view.getMinimumHeight();
    }

    public static int r(View view) {
        return view.getMinimumWidth();
    }

    public static C2400K s(View view) {
        return i.a(view);
    }

    public static CharSequence t(View view) {
        return (CharSequence) Z().c(view);
    }

    public static String u(View view) {
        return h.e(view);
    }

    public static int v(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean w(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean x(View view) {
        return view.hasTransientState();
    }

    public static boolean y(View view) {
        Boolean bool = (Boolean) a().c(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean z(View view) {
        return view.isAttachedToWindow();
    }
}
