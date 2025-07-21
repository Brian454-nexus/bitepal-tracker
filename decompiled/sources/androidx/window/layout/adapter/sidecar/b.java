package androidx.window.layout.adapter.sidecar;

import N2.k;
import Q2.j;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements R2.a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile b f10193d;

    /* renamed from: a, reason: collision with root package name */
    public androidx.window.layout.adapter.sidecar.a f10195a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10196b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final a f10192c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f10194e = new ReentrantLock();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b.f10193d == null) {
                ReentrantLock reentrantLock = b.f10194e;
                reentrantLock.lock();
                try {
                    if (b.f10193d == null) {
                        b.f10193d = new b(b.f10192c.b(context));
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.f10193d;
            Intrinsics.checkNotNull(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (c(SidecarCompat.f10180f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.n()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(k kVar) {
            return kVar != null && kVar.compareTo(k.f3606f.a()) >= 0;
        }

        public a() {
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0151b implements a.InterfaceC0150a {
        public C0151b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0150a
        public void a(Activity activity, j newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Iterator it = b.this.g().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (Intrinsics.areEqual(cVar.d(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f10198a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f10199b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2343a f10200c;

        /* renamed from: d, reason: collision with root package name */
        public j f10201d;

        public c(Activity activity, Executor executor, InterfaceC2343a callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f10198a = activity;
            this.f10199b = executor;
            this.f10200c = callback;
        }

        public static final void c(c this$0, j newLayoutInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
            this$0.f10200c.accept(newLayoutInfo);
        }

        public final void b(final j newLayoutInfo) {
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
            this.f10201d = newLayoutInfo;
            this.f10199b.execute(new Runnable() { // from class: T2.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(b.c.this, newLayoutInfo);
                }
            });
        }

        public final Activity d() {
            return this.f10198a;
        }

        public final InterfaceC2343a e() {
            return this.f10200c;
        }

        public final j f() {
            return this.f10201d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f10195a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f10195a;
        if (aVar2 != null) {
            aVar2.a(new C0151b());
        }
    }

    @Override // R2.a
    public void a(Context context, Executor executor, InterfaceC2343a callback) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f10194e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar = this.f10195a;
                if (aVar == null) {
                    callback.accept(new j(CollectionsKt.emptyList()));
                    return;
                }
                boolean h6 = h(activity);
                c cVar = new c(activity, executor, callback);
                this.f10196b.add(cVar);
                if (h6) {
                    Iterator it = this.f10196b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (Intrinsics.areEqual(activity, ((c) obj).d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) obj;
                    r1 = cVar2 != null ? cVar2.f() : null;
                    if (r1 != null) {
                        cVar.b(r1);
                    }
                } else {
                    aVar.b(activity);
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                r1 = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (r1 == null) {
            callback.accept(new j(CollectionsKt.emptyList()));
        }
    }

    @Override // R2.a
    public void b(InterfaceC2343a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f10194e) {
            try {
                if (this.f10195a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f10196b.iterator();
                while (it.hasNext()) {
                    c callbackWrapper = (c) it.next();
                    if (callbackWrapper.e() == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f10196b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).d());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10196b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.f10195a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f10196b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10196b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
