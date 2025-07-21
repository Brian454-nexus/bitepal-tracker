package P0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.C1208b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4108f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4109a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4110b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4111c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4112d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4113e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a(ViewGroup container, I fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            b0 A02 = fragmentManager.A0();
            Intrinsics.checkNotNullExpressionValue(A02, "fragmentManager.specialEffectsControllerFactory");
            return b(container, A02);
        }

        public final a0 b(ViewGroup container, b0 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            int i6 = O0.b.f3882b;
            Object tag = container.getTag(i6);
            if (tag instanceof a0) {
                return (a0) tag;
            }
            a0 a6 = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(a6, "factory.createController(container)");
            container.setTag(i6, a6);
            return a6;
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4114a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4115b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4116c;

        public final void a(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f4116c) {
                c(container);
            }
            this.f4116c = true;
        }

        public boolean b() {
            return this.f4114a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C1208b backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void f(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public final void g(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f4115b) {
                f(container);
            }
            this.f4115b = true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends d {

        /* renamed from: l, reason: collision with root package name */
        public final O f4117l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(P0.a0.d.b r3, P0.a0.d.a r4, P0.O r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                P0.p r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f4117l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P0.a0.c.<init>(P0.a0$d$b, P0.a0$d$a, P0.O):void");
        }

        @Override // P0.a0.d
        public void e() {
            super.e();
            i().mTransitioning = false;
            this.f4117l.m();
        }

        @Override // P0.a0.d
        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    AbstractComponentCallbacksC0708p k6 = this.f4117l.k();
                    Intrinsics.checkNotNullExpressionValue(k6, "fragmentStateManager.fragment");
                    View requireView = k6.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + k6);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC0708p k7 = this.f4117l.k();
            Intrinsics.checkNotNullExpressionValue(k7, "fragmentStateManager.fragment");
            View findFocus = k7.mView.findFocus();
            if (findFocus != null) {
                k7.setFocusedView(findFocus);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k7);
                }
            }
            View requireView2 = i().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.f4117l.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k7.getPostOnViewCreatedAlpha());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public b f4118a;

        /* renamed from: b, reason: collision with root package name */
        public a f4119b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractComponentCallbacksC0708p f4120c;

        /* renamed from: d, reason: collision with root package name */
        public final List f4121d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4122e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4123f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f4124g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f4125h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4126i;

        /* renamed from: j, reason: collision with root package name */
        public final List f4127j;

        /* renamed from: k, reason: collision with root package name */
        public final List f4128k;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: a, reason: collision with root package name */
            public static final a f4133a = new a(null);

            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i6) {
                    if (i6 == 0) {
                        return b.VISIBLE;
                    }
                    if (i6 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i6 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i6);
                }

                public a() {
                }
            }

            /* renamed from: P0.a0$d$b$b, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public /* synthetic */ class C0066b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f4139a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f4139a = iArr;
                }
            }

            public static final b c(int i6) {
                return f4133a.b(i6);
            }

            public final void b(View view, ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                int i6 = C0066b.f4139a[ordinal()];
                if (i6 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i6 == 2) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i6 == 3) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i6 != 4) {
                    return;
                }
                if (I.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4140a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4140a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, AbstractComponentCallbacksC0708p fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f4118a = finalState;
            this.f4119b = lifecycleImpact;
            this.f4120c = fragment;
            this.f4121d = new ArrayList();
            this.f4126i = true;
            ArrayList arrayList = new ArrayList();
            this.f4127j = arrayList;
            this.f4128k = arrayList;
        }

        public final void a(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f4121d.add(listener);
        }

        public final void b(b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f4127j.add(effect);
        }

        public final void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f4125h = false;
            if (this.f4122e) {
                return;
            }
            this.f4122e = true;
            if (this.f4127j.isEmpty()) {
                e();
                return;
            }
            Iterator it = CollectionsKt.toList(this.f4128k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public final void d(ViewGroup container, boolean z6) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f4122e) {
                return;
            }
            if (z6) {
                this.f4124g = true;
            }
            c(container);
        }

        public void e() {
            this.f4125h = false;
            if (this.f4123f) {
                return;
            }
            if (I.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4123f = true;
            Iterator it = this.f4121d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this.f4127j.remove(effect) && this.f4127j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.f4128k;
        }

        public final b h() {
            return this.f4118a;
        }

        public final AbstractComponentCallbacksC0708p i() {
            return this.f4120c;
        }

        public final a j() {
            return this.f4119b;
        }

        public final boolean k() {
            return this.f4126i;
        }

        public final boolean l() {
            return this.f4122e;
        }

        public final boolean m() {
            return this.f4123f;
        }

        public final boolean n() {
            return this.f4124g;
        }

        public final boolean o() {
            return this.f4125h;
        }

        public final void p(b finalState, a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i6 = c.f4140a[lifecycleImpact.ordinal()];
            if (i6 == 1) {
                if (this.f4118a == b.REMOVED) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4120c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4119b + " to ADDING.");
                    }
                    this.f4118a = b.VISIBLE;
                    this.f4119b = a.ADDING;
                    this.f4126i = true;
                    return;
                }
                return;
            }
            if (i6 == 2) {
                if (I.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4120c + " mFinalState = " + this.f4118a + " -> REMOVED. mLifecycleImpact  = " + this.f4119b + " to REMOVING.");
                }
                this.f4118a = b.REMOVED;
                this.f4119b = a.REMOVING;
                this.f4126i = true;
                return;
            }
            if (i6 == 3 && this.f4118a != b.REMOVED) {
                if (I.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4120c + " mFinalState = " + this.f4118a + " -> " + finalState + com.amazon.a.a.o.c.a.b.f11260a);
                }
                this.f4118a = finalState;
            }
        }

        public void q() {
            this.f4125h = true;
        }

        public final void r(boolean z6) {
            this.f4126i = z6;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f4118a + " lifecycleImpact = " + this.f4119b + " fragment = " + this.f4120c + '}';
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4141a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4141a = iArr;
        }
    }

    public a0(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f4109a = container;
        this.f4110b = new ArrayList();
        this.f4111c = new ArrayList();
    }

    public static final void h(a0 this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f4110b.contains(operation)) {
            d.b h6 = operation.h();
            View view = operation.i().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            h6.b(view, this$0.f4109a);
        }
    }

    public static final void i(a0 this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f4110b.remove(operation);
        this$0.f4111c.remove(operation);
    }

    public static final a0 u(ViewGroup viewGroup, I i6) {
        return f4108f.a(viewGroup, i6);
    }

    public static final a0 v(ViewGroup viewGroup, b0 b0Var) {
        return f4108f.b(viewGroup, b0Var);
    }

    public final void A() {
        for (d dVar : this.f4110b) {
            if (dVar.j() == d.a.ADDING) {
                View requireView = dVar.i().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                dVar.p(d.b.f4133a.b(requireView.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void B(boolean z6) {
        this.f4112d = z6;
    }

    public final void c(d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.k()) {
            d.b h6 = operation.h();
            View requireView = operation.i().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "operation.fragment.requireView()");
            h6.b(requireView, this.f4109a);
            operation.r(false);
        }
    }

    public abstract void d(List list, boolean z6);

    public void e(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).g());
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((b) list.get(i6)).d(this.f4109a);
        }
        int size2 = operations.size();
        for (int i7 = 0; i7 < size2; i7++) {
            c((d) operations.get(i7));
        }
        List list2 = CollectionsKt.toList(operations);
        int size3 = list2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            d dVar = (d) list2.get(i8);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        z(this.f4111c);
        e(this.f4111c);
    }

    public final void g(d.b bVar, d.a aVar, O o6) {
        synchronized (this.f4110b) {
            try {
                AbstractComponentCallbacksC0708p k6 = o6.k();
                Intrinsics.checkNotNullExpressionValue(k6, "fragmentStateManager.fragment");
                d o7 = o(k6);
                if (o7 == null) {
                    if (o6.k().mTransitioning) {
                        AbstractComponentCallbacksC0708p k7 = o6.k();
                        Intrinsics.checkNotNullExpressionValue(k7, "fragmentStateManager.fragment");
                        o7 = p(k7);
                    } else {
                        o7 = null;
                    }
                }
                if (o7 != null) {
                    o7.p(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, o6);
                this.f4110b.add(cVar);
                cVar.a(new Runnable() { // from class: P0.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.h(a0.this, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: P0.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.i(a0.this, cVar);
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b finalState, O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0032, B:17:0x0038, B:19:0x0044, B:20:0x0063, B:23:0x006e, B:28:0x01b7, B:32:0x0074, B:33:0x0085, B:35:0x008b, B:37:0x0097, B:38:0x00ad, B:41:0x00be, B:46:0x00c4, B:50:0x00d7, B:52:0x00ea, B:53:0x00f1, B:54:0x0105, B:56:0x010b, B:58:0x011d, B:60:0x0127, B:64:0x014b, B:71:0x0131, B:72:0x0135, B:74:0x013b, B:82:0x0157, B:84:0x015b, B:85:0x0167, B:87:0x016d, B:89:0x017d, B:92:0x0186, B:94:0x018a, B:95:0x01a8, B:97:0x01b0, B:99:0x0193, B:101:0x019d), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0032, B:17:0x0038, B:19:0x0044, B:20:0x0063, B:23:0x006e, B:28:0x01b7, B:32:0x0074, B:33:0x0085, B:35:0x008b, B:37:0x0097, B:38:0x00ad, B:41:0x00be, B:46:0x00c4, B:50:0x00d7, B:52:0x00ea, B:53:0x00f1, B:54:0x0105, B:56:0x010b, B:58:0x011d, B:60:0x0127, B:64:0x014b, B:71:0x0131, B:72:0x0135, B:74:0x013b, B:82:0x0157, B:84:0x015b, B:85:0x0167, B:87:0x016d, B:89:0x017d, B:92:0x0186, B:94:0x018a, B:95:0x01a8, B:97:0x01b0, B:99:0x0193, B:101:0x019d), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.a0.n():void");
    }

    public final d o(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        Object obj;
        Iterator it = this.f4110b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (Intrinsics.areEqual(dVar.i(), abstractComponentCallbacksC0708p) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        Object obj;
        Iterator it = this.f4111c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (Intrinsics.areEqual(dVar.i(), abstractComponentCallbacksC0708p) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f4109a.isAttachedToWindow();
        synchronized (this.f4110b) {
            try {
                A();
                z(this.f4110b);
                for (d dVar : CollectionsKt.toMutableList(this.f4111c)) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.f4109a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f4109a);
                }
                for (d dVar2 : CollectionsKt.toMutableList(this.f4110b)) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.f4109a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f4109a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.f4113e) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4113e = false;
            n();
        }
    }

    public final d.a s(O fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC0708p k6 = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(k6, "fragmentStateManager.fragment");
        d o6 = o(k6);
        d.a j6 = o6 != null ? o6.j() : null;
        d p6 = p(k6);
        d.a j7 = p6 != null ? p6.j() : null;
        int i6 = j6 == null ? -1 : e.f4141a[j6.ordinal()];
        return (i6 == -1 || i6 == 1) ? j7 : j6;
    }

    public final ViewGroup t() {
        return this.f4109a;
    }

    public final boolean w() {
        return !this.f4110b.isEmpty();
    }

    public final void x() {
        Object obj;
        synchronized (this.f4110b) {
            try {
                A();
                List list = this.f4110b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.f4133a;
                    View view = dVar.i().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    d.b a6 = aVar.a(view);
                    d.b h6 = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (h6 == bVar && a6 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                AbstractComponentCallbacksC0708p i6 = dVar2 != null ? dVar2.i() : null;
                this.f4113e = i6 != null ? i6.isPostponed() : false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(C1208b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.a());
        }
        List list = this.f4111c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).g());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((b) list2.get(i6)).e(backEvent, this.f4109a);
        }
    }

    public final void z(List list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((d) list.get(i6)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).g());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((b) list2.get(i7)).g(this.f4109a);
        }
    }
}
