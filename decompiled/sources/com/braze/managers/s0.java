package com.braze.managers;

import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import ga.L;
import ga.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s0 {

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f12509k = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.e0 f12510a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f12511b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f12512c;

    /* renamed from: d, reason: collision with root package name */
    public long f12513d;

    /* renamed from: e, reason: collision with root package name */
    public int f12514e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12515f;

    /* renamed from: g, reason: collision with root package name */
    public int f12516g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f12517h;

    /* renamed from: i, reason: collision with root package name */
    public ga.u0 f12518i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f12519j;

    public s0(com.braze.storage.e0 serverConfigStorageProvider, com.braze.events.d internalPublisher, Context context) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12510a = serverConfigStorageProvider;
        this.f12511b = internalPublisher;
        this.f12512c = new o0();
        this.f12513d = DateTimeUtils.nowInSeconds();
        this.f12515f = new ArrayList();
        this.f12517h = new ReentrantLock();
        this.f12519j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        internalPublisher.c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: Z3.e3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.s0.a(com.braze.managers.s0.this, (com.braze.events.internal.q) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.t.class, new IEventSubscriber() { // from class: Z3.g3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.s0.a(com.braze.managers.s0.this, (com.braze.events.internal.t) obj);
            }
        });
    }

    public static final void a(s0 s0Var, com.braze.events.internal.q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f12295a instanceof com.braze.requests.w) {
            s0Var.f12519j.decrementAndGet();
            ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new m0(s0Var, null), 3, (Object) null);
        }
    }

    public static final String b() {
        return "Shutting down SDK Debugger due to being past expiration time";
    }

    public static final String d() {
        return "Initializing SDK Debugger";
    }

    public static final String e() {
        return "SDK Debugger transitioned from disabled to enabled. Initializing SDK Debugger.";
    }

    public static final String f() {
        return "SDK Debugger transitioned from enabled to disabled. Shutting down SDK Debugger.";
    }

    public static final String h() {
        return "Debugging session has expired. Disabling SDK Debugger.";
    }

    public static final String j() {
        return "Shutting down SDK Debugger";
    }

    public final void c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.i3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.s0.d();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new q0(this));
        this.f12511b.b(new com.braze.events.internal.u(), com.braze.events.internal.u.class);
    }

    public final boolean g() {
        s0 s0Var;
        this.f12512c.f12481a = this.f12510a.L();
        o0 o0Var = this.f12512c;
        if (o0Var.f12481a) {
            o0Var.f12483c = this.f12510a.y();
            this.f12512c.f12484d = this.f12510a.A();
            this.f12512c.f12485e = this.f12510a.B();
            this.f12512c.f12486f = this.f12510a.C();
            this.f12512c.f12482b = Long.valueOf(this.f12510a.z());
        }
        Long l6 = this.f12512c.f12482b;
        if (l6 != null) {
            if (DateTimeUtils.nowInSeconds() > l6.longValue()) {
                s0Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) s0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.h3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.s0.h();
                    }
                }, 7, (Object) null);
                s0Var.f12512c = new o0();
                return s0Var.f12512c.f12481a;
            }
        }
        s0Var = this;
        return s0Var.f12512c.f12481a;
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.f3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.s0.j();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.f12512c = new o0();
        ReentrantLock reentrantLock = this.f12517h;
        reentrantLock.lock();
        try {
            this.f12515f.clear();
            this.f12516g = 0;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void a(s0 s0Var, final com.braze.events.internal.t newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        final o0 o0Var = s0Var.f12512c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) s0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.j3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.s0.a(com.braze.events.internal.t.this, o0Var);
            }
        }, 7, (Object) null);
        if (newConfig.f12297a.f12482b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) s0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.k3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.s0.a(com.braze.managers.o0.this);
                }
            }, 7, (Object) null);
            newConfig.f12297a.f12482b = o0Var.f12482b;
        }
        o0 o0Var2 = newConfig.f12297a;
        if (o0Var2.f12483c == null) {
            o0Var2.f12483c = o0Var.f12483c;
        }
        s0Var.f12512c = o0Var2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) s0Var, priority, (Throwable) null, false, new Function0() { // from class: Z3.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.s0.a(com.braze.events.internal.t.this);
            }
        }, 6, (Object) null);
        s0Var.f12510a.a(newConfig.f12297a);
        boolean z6 = o0Var.f12481a;
        if (!z6 && s0Var.f12512c.f12481a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) s0Var, priority, (Throwable) null, false, new Function0() { // from class: Z3.m3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.s0.e();
                }
            }, 6, (Object) null);
            s0Var.c();
        } else {
            if (!z6 || s0Var.f12512c.f12481a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) s0Var, priority, (Throwable) null, false, new Function0() { // from class: Z3.n3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.s0.f();
                }
            }, 6, (Object) null);
            s0Var.i();
        }
    }

    public static final String a(com.braze.events.internal.t tVar, o0 o0Var) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + tVar.f12297a + ".\nOld config " + o0Var;
    }

    public static final String a(o0 o0Var) {
        return "updating expiration time to " + o0Var.f12482b;
    }

    public static final String a(com.braze.events.internal.t tVar) {
        return "Updating SDK Debugger config with " + tVar.f12297a;
    }

    public final void a(String str) {
        com.braze.models.m mVar = new com.braze.models.m(str);
        ReentrantLock reentrantLock = this.f12517h;
        reentrantLock.lock();
        try {
            this.f12515f.add(mVar);
            int length = this.f12516g + mVar.f12596a.length();
            this.f12516g = length;
            if (length > 1048576) {
                while (this.f12516g > 838860) {
                    this.f12516g -= ((com.braze.models.m) this.f12515f.remove(0)).f12596a.length();
                    this.f12514e++;
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Unit a() {
        Long l6;
        o0 o0Var = this.f12512c;
        if (o0Var.f12481a && o0Var.f12483c != null && (l6 = o0Var.f12482b) != null && l6.longValue() != 0 && this.f12519j.get() <= 0) {
            Long l7 = this.f12512c.f12482b;
            if (l7 != null) {
                if (DateTimeUtils.nowInSeconds() > l7.longValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.s0.b();
                        }
                    }, 7, (Object) null);
                    i();
                    return Unit.INSTANCE;
                }
            }
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            long j6 = this.f12513d;
            o0 o0Var2 = this.f12512c;
            long j7 = j6 + o0Var2.f12485e;
            if (nowInSeconds <= j7 && this.f12516g <= o0Var2.f12484d) {
                if (this.f12518i == null) {
                    this.f12518i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Boxing.boxLong(TimeUnit.SECONDS.toMillis(j7 - DateTimeUtils.nowInSeconds())), null, new p0(this, null), 2, null);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                ReentrantLock reentrantLock = this.f12517h;
                reentrantLock.lock();
                try {
                    Iterator it = this.f12515f.iterator();
                    int i6 = 0;
                    int i7 = 0;
                    while (it.hasNext()) {
                        com.braze.models.m mVar = (com.braze.models.m) it.next();
                        if (this.f12514e != 0) {
                            String str = "Removed " + this.f12514e + " logs due to buffer overflow";
                            arrayList.add(new com.braze.models.m(str));
                            this.f12514e = 0;
                            i7 += str.length();
                        }
                        int length = mVar.f12596a.length() + i7;
                        if (length <= this.f12512c.f12486f) {
                            arrayList.add(mVar);
                            i7 = length;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        this.f12515f.remove((com.braze.models.m) it2.next());
                    }
                    Iterator it3 = this.f12515f.iterator();
                    while (it3.hasNext()) {
                        i6 += ((com.braze.models.m) it3.next()).f12596a.length();
                    }
                    this.f12516g = i6;
                    this.f12513d = DateTimeUtils.nowInSeconds();
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    ga.u0 u0Var = this.f12518i;
                    if (u0Var != null) {
                        u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
                    }
                    this.f12518i = null;
                    if (!arrayList.isEmpty()) {
                        this.f12519j.incrementAndGet();
                        this.f12511b.b(new com.braze.events.internal.v(arrayList), com.braze.events.internal.v.class);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
