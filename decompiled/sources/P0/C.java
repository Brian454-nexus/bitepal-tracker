package P0;

import P0.I;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final I f3922a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3923b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final I.k f3924a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3925b;

        public a(I.k callback, boolean z6) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f3924a = callback;
            this.f3925b = z6;
        }

        public final I.k a() {
            return this.f3924a;
        }

        public final boolean b() {
            return this.f3925b;
        }
    }

    public C(I fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f3922a = fragmentManager;
        this.f3923b = new CopyOnWriteArrayList();
    }

    public final void a(AbstractComponentCallbacksC0708p f6, Bundle bundle, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().a(f6, bundle, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().a(this.f3922a, f6, bundle);
            }
        }
    }

    public final void b(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        Context f7 = this.f3922a.v0().f();
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().b(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().b(this.f3922a, f6, f7);
            }
        }
    }

    public final void c(AbstractComponentCallbacksC0708p f6, Bundle bundle, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().c(f6, bundle, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().c(this.f3922a, f6, bundle);
            }
        }
    }

    public final void d(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().d(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().d(this.f3922a, f6);
            }
        }
    }

    public final void e(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().e(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().e(this.f3922a, f6);
            }
        }
    }

    public final void f(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().f(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().f(this.f3922a, f6);
            }
        }
    }

    public final void g(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        Context f7 = this.f3922a.v0().f();
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().g(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().g(this.f3922a, f6, f7);
            }
        }
    }

    public final void h(AbstractComponentCallbacksC0708p f6, Bundle bundle, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().h(f6, bundle, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().h(this.f3922a, f6, bundle);
            }
        }
    }

    public final void i(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().i(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().i(this.f3922a, f6);
            }
        }
    }

    public final void j(AbstractComponentCallbacksC0708p f6, Bundle outState, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().j(f6, outState, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().j(this.f3922a, f6, outState);
            }
        }
    }

    public final void k(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().k(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().k(this.f3922a, f6);
            }
        }
    }

    public final void l(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().l(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().l(this.f3922a, f6);
            }
        }
    }

    public final void m(AbstractComponentCallbacksC0708p f6, View v6, Bundle bundle, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        Intrinsics.checkNotNullParameter(v6, "v");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().m(f6, v6, bundle, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().m(this.f3922a, f6, v6, bundle);
            }
        }
    }

    public final void n(AbstractComponentCallbacksC0708p f6, boolean z6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        AbstractComponentCallbacksC0708p y02 = this.f3922a.y0();
        if (y02 != null) {
            I parentFragmentManager = y02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.x0().n(f6, true);
        }
        Iterator it = this.f3923b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z6 || aVar.b()) {
                aVar.a().n(this.f3922a, f6);
            }
        }
    }

    public final void o(I.k cb, boolean z6) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.f3923b.add(new a(cb, z6));
    }

    public final void p(I.k cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        synchronized (this.f3923b) {
            try {
                int size = this.f3923b.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    if (((a) this.f3923b.get(i6)).a() == cb) {
                        this.f3923b.remove(i6);
                        break;
                    }
                    i6++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
