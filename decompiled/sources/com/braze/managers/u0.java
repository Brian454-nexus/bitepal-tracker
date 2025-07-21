package com.braze.managers;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u0 implements h0 {

    /* renamed from: A, reason: collision with root package name */
    public final h f12530A;

    /* renamed from: B, reason: collision with root package name */
    public final com.braze.storage.x f12531B;

    /* renamed from: C, reason: collision with root package name */
    public final com.braze.storage.p f12532C;

    /* renamed from: D, reason: collision with root package name */
    public final com.braze.requests.h f12533D;

    /* renamed from: E, reason: collision with root package name */
    public final com.braze.requests.framework.g f12534E;

    /* renamed from: F, reason: collision with root package name */
    public final com.braze.triggers.managers.f f12535F;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12536a;

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f12537b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f12538c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f12539d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f12540e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12541f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12542g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12543h;

    /* renamed from: i, reason: collision with root package name */
    public final com.braze.storage.a0 f12544i;

    /* renamed from: j, reason: collision with root package name */
    public final com.braze.storage.h0 f12545j;

    /* renamed from: k, reason: collision with root package name */
    public final com.braze.storage.r f12546k;

    /* renamed from: l, reason: collision with root package name */
    public final com.braze.events.d f12547l;

    /* renamed from: m, reason: collision with root package name */
    public final com.braze.storage.e0 f12548m;

    /* renamed from: n, reason: collision with root package name */
    public final y f12549n;

    /* renamed from: o, reason: collision with root package name */
    public final com.braze.events.a f12550o;

    /* renamed from: p, reason: collision with root package name */
    public final com.braze.dispatch.f f12551p;

    /* renamed from: q, reason: collision with root package name */
    public final r f12552q;

    /* renamed from: r, reason: collision with root package name */
    public final z f12553r;

    /* renamed from: s, reason: collision with root package name */
    public final k0 f12554s;

    /* renamed from: t, reason: collision with root package name */
    public final com.braze.storage.z f12555t;

    /* renamed from: u, reason: collision with root package name */
    public final com.braze.storage.y f12556u;

    /* renamed from: v, reason: collision with root package name */
    public final com.braze.storage.b0 f12557v;

    /* renamed from: w, reason: collision with root package name */
    public final m f12558w;

    /* renamed from: x, reason: collision with root package name */
    public final BrazeGeofenceManager f12559x;

    /* renamed from: y, reason: collision with root package name */
    public final k f12560y;

    /* renamed from: z, reason: collision with root package name */
    public final a0 f12561z;

    public u0(Context applicationContext, com.braze.configuration.e offlineUserStorageProvider, BrazeConfigurationProvider configurationProvider, com.braze.events.e externalEventPublisher, e0 deviceIdProvider, g0 registrationDataProvider, i0 pushDeliveryManager, boolean z6, boolean z7, d0 deviceDataProvider, boolean z8) {
        Context context;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(offlineUserStorageProvider, "offlineUserStorageProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
        this.f12536a = applicationContext;
        this.f12537b = configurationProvider;
        this.f12538c = deviceIdProvider;
        this.f12539d = pushDeliveryManager;
        this.f12540e = deviceDataProvider;
        this.f12541f = z8;
        String a6 = offlineUserStorageProvider.a();
        this.f12542g = a6;
        String str = configurationProvider.getBrazeApiKey().f12604a;
        this.f12543h = str;
        com.braze.storage.a0 a0Var = new com.braze.storage.a0(applicationContext);
        this.f12544i = a0Var;
        com.braze.requests.util.a aVar = new com.braze.requests.util.a(applicationContext);
        com.braze.events.d dVar = new com.braze.events.d(a0Var, true);
        this.f12547l = dVar;
        com.braze.storage.e0 e0Var = new com.braze.storage.e0(applicationContext, str, dVar);
        this.f12548m = e0Var;
        this.f12549n = new y(e0Var, dVar, applicationContext, a6, str);
        new s0(e0Var, dVar, applicationContext);
        com.braze.storage.s sVar = new com.braze.storage.s(new com.braze.storage.g0(applicationContext, a6, str), dVar);
        com.braze.dispatch.f fVar = new com.braze.dispatch.f(applicationContext, dVar, new com.braze.dispatch.a(applicationContext));
        this.f12551p = fVar;
        Object systemService = applicationContext.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        r rVar = new r(applicationContext, sVar, dVar, externalEventPublisher, (AlarmManager) systemService, configurationProvider.getSessionTimeoutSeconds(), configurationProvider.isSessionStartBasedTimeoutEnabled());
        this.f12552q = rVar;
        z zVar = new z(new com.braze.storage.v(new com.braze.storage.f0(applicationContext, a6, str), dVar));
        this.f12553r = zVar;
        k0 k0Var = new k0(applicationContext, str, a6, dVar, e0Var);
        this.f12554s = k0Var;
        this.f12555t = new com.braze.storage.z(applicationContext, a6, str);
        n nVar = new n(applicationContext, dVar, e0Var);
        com.braze.storage.y yVar = new com.braze.storage.y(applicationContext, str, a6);
        this.f12556u = yVar;
        com.braze.storage.b0 b0Var = new com.braze.storage.b0(applicationContext, a6, str);
        this.f12557v = b0Var;
        m mVar = new m(applicationContext, a6, str, rVar, dVar, configurationProvider, e0Var, zVar, nVar, a0Var, k0Var, pushDeliveryManager, yVar);
        this.f12558w = mVar;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(applicationContext, str, mVar, configurationProvider, e0Var, dVar);
        this.f12559x = brazeGeofenceManager;
        k kVar = new k(applicationContext, mVar, configurationProvider);
        this.f12560y = kVar;
        a0 a0Var2 = new a0(applicationContext, str, a6, dVar, externalEventPublisher, e0Var, mVar);
        this.f12561z = a0Var2;
        h hVar = new h(applicationContext, str, a6, dVar, externalEventPublisher, e0Var, mVar);
        this.f12530A = hVar;
        com.braze.storage.x xVar = new com.braze.storage.x(applicationContext, a6, mVar);
        this.f12531B = xVar;
        com.braze.storage.p pVar = new com.braze.storage.p(applicationContext, a6, str, mVar, "36.0.0");
        this.f12532C = pVar;
        int i6 = com.braze.communication.c.f12072a;
        com.braze.requests.u uVar = new com.braze.requests.u(new com.braze.communication.e(new com.braze.communication.b(com.braze.communication.c.f12072a)), dVar, externalEventPublisher, xVar, e0Var, pVar, mVar, aVar);
        this.f12533D = new com.braze.requests.h(dVar, mVar);
        com.braze.requests.framework.g gVar = new com.braze.requests.framework.g(new com.braze.dispatch.h(this), uVar, z6, z8);
        this.f12534E = gVar;
        com.braze.triggers.managers.f fVar2 = new com.braze.triggers.managers.f(applicationContext, mVar, dVar, externalEventPublisher, configurationProvider, a6, str, gVar);
        this.f12535F = fVar2;
        com.braze.storage.r rVar2 = null;
        if (Intrinsics.areEqual(a6, "")) {
            context = applicationContext;
            com.braze.storage.h0 h0Var = new com.braze.storage.h0(context, registrationDataProvider, a0Var, null, null);
            Intrinsics.checkNotNullParameter(h0Var, "<set-?>");
            this.f12545j = h0Var;
            com.braze.storage.r rVar3 = new com.braze.storage.r(context, null, null);
            Intrinsics.checkNotNullParameter(rVar3, "<set-?>");
            this.f12546k = rVar3;
        } else {
            context = applicationContext;
            com.braze.storage.h0 h0Var2 = new com.braze.storage.h0(context, registrationDataProvider, a0Var, a6, str);
            Intrinsics.checkNotNullParameter(h0Var2, "<set-?>");
            this.f12545j = h0Var2;
            com.braze.storage.r rVar4 = new com.braze.storage.r(context, a6, str);
            Intrinsics.checkNotNullParameter(rVar4, "<set-?>");
            this.f12546k = rVar4;
        }
        synchronized (fVar) {
            try {
                fVar.f12160l = z7;
                fVar.b();
                if (z7) {
                    fVar.f();
                } else {
                    fVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.braze.storage.h0 a7 = a();
        com.braze.storage.r rVar5 = this.f12546k;
        if (rVar5 != null) {
            rVar2 = rVar5;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
        }
        this.f12550o = new com.braze.events.a(context, kVar, dVar, mVar, a7, rVar2, fVar2, fVar2.f13096h, zVar, brazeGeofenceManager, externalEventPublisher, configurationProvider, pVar, b0Var, e0Var, a0Var2, pushDeliveryManager, hVar);
    }

    public final com.braze.storage.h0 a() {
        com.braze.storage.h0 h0Var = this.f12545j;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        return null;
    }
}
