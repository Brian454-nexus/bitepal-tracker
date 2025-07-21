package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import ga.u0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final long f12564f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.e0 f12565a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f12566b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f12567c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.communication.dust.h f12568d;

    /* renamed from: e, reason: collision with root package name */
    public ga.u0 f12569e;

    public y(com.braze.storage.e0 serverConfigStorageProvider, com.braze.events.d internalPublisher, Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12565a = serverConfigStorageProvider;
        this.f12566b = internalPublisher;
        SharedPreferences a6 = c.a(context, str, str2, new StringBuilder("com.braze.managers.dust.metadata"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12567c = a6;
        this.f12568d = new com.braze.communication.dust.h();
        internalPublisher.c(com.braze.events.internal.a0.class, new IEventSubscriber() { // from class: Z3.D3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.y.a(com.braze.managers.y.this, (com.braze.events.internal.a0) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.b0.class, new IEventSubscriber() { // from class: Z3.I3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.y.a(com.braze.managers.y.this, (com.braze.events.internal.b0) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.o.class, new IEventSubscriber() { // from class: Z3.J3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.y.a(com.braze.managers.y.this, (com.braze.events.internal.o) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.h.class, new IEventSubscriber() { // from class: Z3.K3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.y.a(com.braze.managers.y.this, (com.braze.events.internal.h) obj);
            }
        });
    }

    public static final void a(y yVar, com.braze.events.internal.a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) yVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.M3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.c();
            }
        }, 7, (Object) null);
        ga.u0 u0Var = yVar.f12569e;
        if (u0Var != null) {
            u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
        }
        yVar.a(true);
    }

    public static final String b(String str) {
        return com.braze.j.a("setting mite value to ", str);
    }

    public static final String c() {
        return "Cancelling ending of DUST subscription on delay and resuming stream";
    }

    public static final String d() {
        return "Ending DUST subscription on delay";
    }

    public static final String e() {
        return "Received MITE value. Starting/resuming a new subscription";
    }

    public static final String b() {
        return "Ending DUST subscription";
    }

    public static final String b(com.braze.models.dust.e eVar) {
        return "Ingesting DUST message\n" + eVar;
    }

    public static final void a(y yVar, com.braze.events.internal.b0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) yVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.N3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.d();
            }
        }, 7, (Object) null);
        yVar.f12569e = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(f12564f), null, new v(yVar, null), 2, null);
    }

    public static final void a(y yVar, final com.braze.events.internal.o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) yVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.O3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.a(com.braze.events.internal.o.this);
            }
        }, 7, (Object) null);
        com.braze.enums.f fVar = it.f12293b;
        com.braze.enums.f fVar2 = com.braze.enums.f.f12207a;
        if (fVar == fVar2) {
            yVar.a();
        } else if (it.f12292a == fVar2) {
            yVar.a(true);
        }
    }

    public static final String a(com.braze.events.internal.o oVar) {
        return "Got network change event: " + oVar;
    }

    public static final void a(y yVar, com.braze.events.internal.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) yVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.P3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.e();
            }
        }, 7, (Object) null);
        String string = yVar.f12567c.getString("mite", null);
        yVar.a(it.f12282a);
        yVar.a(Intrinsics.areEqual(string, it.f12282a));
    }

    public final void a(final String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Q3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.b(str);
            }
        }, 7, (Object) null);
        this.f12567c.edit().putString("mite", str).apply();
    }

    public static final String a(String str, y yVar) {
        return "Cannot start a dust subscription with mite " + str + " and enabled " + yVar.f12565a.E();
    }

    public static final String a(boolean z6, String str, String str2) {
        return "Starting (resume = " + z6 + ") DUST subscription for mite: " + str + " to url: " + str2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.L3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.b();
            }
        }, 7, (Object) null);
        this.f12568d.b();
    }

    public final void a(final com.braze.models.dust.e eVar) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.G3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.b(com.braze.models.dust.e.this);
            }
        }, 7, (Object) null);
        final com.braze.models.dust.d a6 = eVar.a();
        if (w.f12563a[a6.ordinal()] == 1) {
            this.f12566b.b(new com.braze.events.internal.e(), com.braze.events.internal.e.class);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.H3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.y.a(com.braze.models.dust.d.this);
                }
            }, 6, (Object) null);
        }
    }

    public static final String a(com.braze.models.dust.d dVar) {
        return "Lacked logic to ingest message! Type: " + dVar;
    }

    public final void a(final boolean z6) {
        final String string = this.f12567c.getString("mite", null);
        if (string != null && this.f12565a.E()) {
            final String concat = "https://dust.k8s.test-001.d-usw-2.braze.com/sse?mite=".concat(string);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.E3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.y.a(z6, string, concat);
                }
            }, 7, (Object) null);
            this.f12568d.a(concat, new x(this), z6);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.F3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.y.a(string, this);
            }
        }, 7, (Object) null);
    }
}
