package com.braze.dispatch;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.a0;
import com.braze.events.internal.b0;
import com.braze.events.internal.o;
import com.braze.support.BrazeLogger;
import ga.L;
import ga.i;
import ga.u0;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: m, reason: collision with root package name */
    public static final String f12148m = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* renamed from: a, reason: collision with root package name */
    public final Context f12149a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f12150b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12151c;

    /* renamed from: d, reason: collision with root package name */
    public final d f12152d;

    /* renamed from: e, reason: collision with root package name */
    public final b f12153e;

    /* renamed from: f, reason: collision with root package name */
    public com.braze.enums.g f12154f;

    /* renamed from: g, reason: collision with root package name */
    public long f12155g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f12156h;

    /* renamed from: i, reason: collision with root package name */
    public final ConnectivityManager f12157i;

    /* renamed from: j, reason: collision with root package name */
    public com.braze.enums.f f12158j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f12159k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12160l;

    public f(Context context, com.braze.events.d internalEventPublisher, a dataSyncConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.f12149a = context;
        this.f12150b = internalEventPublisher;
        this.f12151c = dataSyncConfigurationProvider;
        this.f12154f = com.braze.enums.g.f12213b;
        this.f12155g = -1L;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f12157i = (ConnectivityManager) systemService;
        this.f12158j = com.braze.enums.f.f12209c;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f12153e = new b(this);
        } else {
            this.f12152d = new d(this);
        }
        a(internalEventPublisher);
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final u0 a(final long j6) {
        if (this.f12155g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: U3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.a(j6, this);
                }
            }, 6, (Object) null);
            return i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new e(this, j6, null), 3, (Object) null);
        }
        Braze.INSTANCE.getInstance(this.f12149a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.dispatch.f.a(com.braze.dispatch.f.this);
            }
        }, 7, (Object) null);
        return null;
    }

    public final void b(final long j6) {
        u0 u0Var = this.f12159k;
        if (u0Var != null) {
            u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f12159k = null;
        if (this.f12155g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.c(j6);
                }
            }, 7, (Object) null);
            this.f12159k = a(j6);
        }
    }

    public final synchronized void c() {
        if (this.f12156h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.dispatch.f.e();
            }
        }, 7, (Object) null);
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f12157i;
            b bVar = this.f12153e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.registerDefaultNetworkCallback(bVar);
            a(this.f12157i.getNetworkCapabilities(this.f12157i.getActiveNetwork()));
        } else {
            this.f12149a.registerReceiver(this.f12152d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        b(this.f12155g);
        this.f12156h = true;
    }

    public final synchronized void f() {
        if (!this.f12156h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.g();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.dispatch.f.h();
            }
        }, 7, (Object) null);
        u0 u0Var = this.f12159k;
        if (u0Var != null) {
            u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f12159k = null;
        i();
        this.f12156h = false;
    }

    public final void i() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.f12149a.unregisterReceiver(this.f12152d);
                return;
            }
            ConnectivityManager connectivityManager = this.f12157i;
            b bVar = this.f12153e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.unregisterNetworkCallback(bVar);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: U3.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.j();
                }
            }, 4, (Object) null);
        }
    }

    public static final String d(f fVar) {
        return "Flush interval was too low (" + fVar.f12155g + "), moving to minimum of 1000 ms";
    }

    public static final String a(long j6, f fVar) {
        return "Kicking off the Sync Job. initialDelaysMs: " + j6 + ": currentIntervalMs " + fVar.f12155g + " ms";
    }

    public final void b() {
        long j6;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: U3.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.dispatch.f.c(com.braze.dispatch.f.this);
            }
        }, 6, (Object) null);
        final long j7 = this.f12155g;
        if (this.f12154f != com.braze.enums.g.f12213b && !this.f12160l) {
            int ordinal = this.f12158j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    a aVar = this.f12151c;
                    aVar.getClass();
                    com.braze.configuration.b bVar = com.braze.configuration.b.f12112b;
                    intValue = aVar.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (ordinal == 2) {
                    a aVar2 = this.f12151c;
                    aVar2.getClass();
                    com.braze.configuration.b bVar2 = com.braze.configuration.b.f12112b;
                    intValue = aVar2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else if (ordinal == 3) {
                    a aVar3 = this.f12151c;
                    aVar3.getClass();
                    com.braze.configuration.b bVar3 = com.braze.configuration.b.f12112b;
                    intValue = aVar3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                j6 = intValue * 1000;
            } else {
                j6 = -1;
            }
            this.f12155g = j6;
            if (j6 != -1 && j6 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: U3.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.dispatch.f.d(com.braze.dispatch.f.this);
                    }
                }, 6, (Object) null);
                this.f12155g = 1000L;
            }
        } else {
            this.f12155g = -1L;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: U3.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.dispatch.f.b(com.braze.dispatch.f.this);
            }
        }, 6, (Object) null);
        if (j7 != this.f12155g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.b(j7, this);
                }
            }, 7, (Object) null);
            b(this.f12155g);
        }
    }

    public static final String a(f fVar) {
        return "Data flush interval is " + fVar.f12155g + " ms. Not scheduling a proceeding data flush.";
    }

    public final void a(com.braze.events.d dVar, Exception exc) {
        try {
            dVar.b(exc, Throwable.class);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: U3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.f.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to log throwable.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        com.braze.enums.f fVar = this.f12158j;
        com.braze.enums.f a6 = com.braze.support.c.a(networkCapabilities);
        this.f12158j = a6;
        if (fVar != a6) {
            this.f12150b.b(new o(fVar, a6), o.class);
        }
        b();
    }

    public static final String c(long j6) {
        return "Posting new sync runnable with delay " + j6 + " ms";
    }

    public static final String c(f fVar) {
        return "recalculateDispatchState called with session state: " + fVar.f12154f + " lastNetworkLevel: " + fVar.f12158j;
    }

    public final void a(com.braze.events.d eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.c(a0.class, new IEventSubscriber() { // from class: U3.o
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.dispatch.f.a(com.braze.dispatch.f.this, (a0) obj);
            }
        });
        eventManager.c(b0.class, new IEventSubscriber() { // from class: U3.p
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.dispatch.f.a(com.braze.dispatch.f.this, (b0) obj);
            }
        });
    }

    public static final void a(f fVar, a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.f12154f = com.braze.enums.g.f12212a;
        fVar.b();
    }

    public static final void a(f fVar, b0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.f12154f = com.braze.enums.g.f12213b;
        fVar.b();
    }

    public static final String b(f fVar) {
        return "currentIntervalMs: " + fVar.f12155g;
    }

    public static final String b(long j6, f fVar) {
        return "Data flush interval has changed from " + j6 + " ms to " + fVar.f12155g + " ms after connectivity state change to: " + fVar.f12158j + " and session state: " + fVar.f12154f;
    }
}
