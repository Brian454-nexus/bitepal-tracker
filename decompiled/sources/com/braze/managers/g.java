package com.braze.managers;

import android.graphics.Rect;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import ga.L;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {
    public static final String a(String str) {
        return com.braze.b.a("Banner is shown ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    public static void b() {
        if (h.f12411m != null) {
            return;
        }
        h.f12411m = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new f(null), 2, null);
    }

    public static final String c(d dVar) {
        return "Resetting impression for " + dVar.f12403a;
    }

    public static void a(final String placementId, final View view, boolean z6) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        ReentrantLock reentrantLock = h.f12412n;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.f12409k, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.B0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.g.a(placementId, view);
                }
            }, 7, (Object) null);
            Iterator it = h.f12413o.iterator();
            while (it.hasNext()) {
                final d dVar = (d) it.next();
                if (Intrinsics.areEqual(dVar.f12404b.get(), view)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.f12409k, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.C0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.g.a(com.braze.managers.d.this, placementId);
                        }
                    }, 6, (Object) null);
                    it.remove();
                }
            }
            h.f12413o.add(new d(placementId, new WeakReference(view), z6));
            b();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(List list) {
        return "Setting banner placement list to " + list;
    }

    public static final String b(d dVar) {
        return com.braze.c.a(new StringBuilder("Banner is not shown "), dVar.f12403a, " because view is null");
    }

    public static void a() {
        ReentrantLock reentrantLock = h.f12412n;
        reentrantLock.lock();
        try {
            Iterator it = h.f12413o.iterator();
            while (it.hasNext()) {
                final d dVar = (d) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.f12409k, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.G0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.g.c(com.braze.managers.d.this);
                    }
                }, 6, (Object) null);
                dVar.f12405c = false;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean a(final d dVar) {
        View view = (View) dVar.f12404b.get();
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.E0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.g.b(com.braze.managers.d.this);
                }
            }, 7, (Object) null);
            return true;
        }
        final String str = dVar.f12403a;
        if (view.isShown()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() != 0 && rect.height() != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.F0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.g.a(str);
                    }
                }, 7, (Object) null);
                ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new e(view, str, dVar, null), 3, (Object) null);
            }
        }
        return false;
    }

    public final void a(final List placementIds) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.D0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.g.b(placementIds);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = h.f12414p;
        reentrantLock.lock();
        try {
            ArrayList arrayList = h.f12415q;
            arrayList.clear();
            arrayList.addAll(placementIds);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(String str, View view) {
        return "Adding monitor for " + str + " for BannerView " + view;
    }

    public static final String a(d dVar, String str) {
        return "Removing banner from monitor list " + dVar.f12403a + " because view is now used by " + str;
    }
}
