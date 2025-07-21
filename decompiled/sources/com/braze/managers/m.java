package com.braze.managers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import ga.u0;
import ga.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m implements c0 {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f12450v = {"android.os.deadsystemexception"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f12451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12452b;

    /* renamed from: c, reason: collision with root package name */
    public final r f12453c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.events.d f12454d;

    /* renamed from: e, reason: collision with root package name */
    public final BrazeConfigurationProvider f12455e;

    /* renamed from: f, reason: collision with root package name */
    public final com.braze.storage.e0 f12456f;

    /* renamed from: g, reason: collision with root package name */
    public final z f12457g;

    /* renamed from: h, reason: collision with root package name */
    public final n f12458h;

    /* renamed from: i, reason: collision with root package name */
    public final com.braze.storage.a0 f12459i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f12460j;

    /* renamed from: k, reason: collision with root package name */
    public final i0 f12461k;

    /* renamed from: l, reason: collision with root package name */
    public final com.braze.storage.y f12462l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f12463m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f12464n;

    /* renamed from: o, reason: collision with root package name */
    public final ReentrantLock f12465o;

    /* renamed from: p, reason: collision with root package name */
    public ga.u0 f12466p;

    /* renamed from: q, reason: collision with root package name */
    public final com.braze.storage.t f12467q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f12468r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f12469s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f12470t;

    /* renamed from: u, reason: collision with root package name */
    public Class f12471u;

    public m(Context context, String str, String apiKey, r sessionManager, com.braze.events.d internalEventPublisher, BrazeConfigurationProvider configurationProvider, com.braze.storage.e0 serverConfigStorageProvider, z eventStorageManager, n messagingSessionManager, com.braze.storage.a0 sdkEnablementProvider, k0 pushMaxManager, i0 pushDeliveryManager, com.braze.storage.y pushIdentifierStorageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(messagingSessionManager, "messagingSessionManager");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(pushMaxManager, "pushMaxManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(pushIdentifierStorageProvider, "pushIdentifierStorageProvider");
        this.f12451a = context;
        this.f12452b = str;
        this.f12453c = sessionManager;
        this.f12454d = internalEventPublisher;
        this.f12455e = configurationProvider;
        this.f12456f = serverConfigStorageProvider;
        this.f12457g = eventStorageManager;
        this.f12458h = messagingSessionManager;
        this.f12459i = sdkEnablementProvider;
        this.f12460j = pushMaxManager;
        this.f12461k = pushDeliveryManager;
        this.f12462l = pushIdentifierStorageProvider;
        this.f12463m = new AtomicInteger(0);
        this.f12464n = new AtomicInteger(0);
        this.f12465o = new ReentrantLock();
        this.f12466p = y0.b((ga.u0) null, 1, (Object) null);
        this.f12467q = new com.braze.storage.t(context, str, apiKey);
        this.f12468r = "";
        this.f12469s = new AtomicBoolean(false);
        this.f12470t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.a();
            }
        }, 6, (Object) null);
        internalEventPublisher.c(com.braze.events.internal.s.class, new IEventSubscriber() { // from class: Z3.b2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.m mVar = com.braze.managers.m.this;
                android.support.v4.media.session.b.a(obj);
                com.braze.managers.m.a(mVar, (com.braze.events.internal.s) null);
            }
        });
        internalEventPublisher.c(com.braze.events.internal.u.class, new IEventSubscriber() { // from class: Z3.c2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.m.a(com.braze.managers.m.this, (com.braze.events.internal.u) obj);
            }
        });
        internalEventPublisher.c(com.braze.events.internal.v.class, new IEventSubscriber() { // from class: Z3.e2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.m.a(com.braze.managers.m.this, (com.braze.events.internal.v) obj);
            }
        });
    }

    public static final String A() {
        return "Requesting DUST mite";
    }

    public static final String B() {
        return "Posting geofence request for location.";
    }

    public static final String D() {
        return "Sending Push Max data";
    }

    public static final String E() {
        return "Posting SDK Debugger Logs request.";
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final String b(String str) {
        return com.braze.j.a("Logging push delivery event for campaign id: ", str);
    }

    public static final String c(m mVar) {
        return "Completed the openSession call. Starting or continuing session " + mVar.f12453c.g();
    }

    public static final String d(Activity activity) {
        return "Opened session with activity: " + activity.getLocalClassName();
    }

    public static final String e(com.braze.models.i iVar) {
        return "Not adding session id to event: " + JsonUtils.getPrettyPrintedString(((com.braze.models.outgoing.event.b) iVar).getKey());
    }

    public static final String g() {
        return "SDK is disabled. Not force closing session.";
    }

    public static final String h() {
        return "BrazeManager got SdkDebuggerInitializationRequestedEvent";
    }

    public static final String i() {
        return "Braze SDK Debugger logs being sent";
    }

    public static final String j() {
        return "Failed to log error.";
    }

    public static final String k() {
        return "Publishing an internal push body clicked event for any awaiting triggers.";
    }

    public static final String l() {
        return "Adding push click to dispatcher pending list";
    }

    public static final String m() {
        return "Session in background, data syncing event on delay";
    }

    public static final String n() {
        return "Logging push max campaign";
    }

    public static final String p() {
        return "SDK is disabled. Not opening session.";
    }

    public static final String q() {
        return "Failed to get local class name for activity when opening session";
    }

    public static final String r() {
        return "SDK is disabled. Not opening session.";
    }

    public static final String s() {
        return "Flushing Push Delivery Events now";
    }

    public static final String t() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }

    public static final String v() {
        return "Posting banners refresh request.";
    }

    public static final String x() {
        return "Posting feature flags refresh request.";
    }

    public static final String y() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    public final void C() {
        long j6;
        ArrayList arrayList;
        if (this.f12456f.K()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.x2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.D();
                }
            }, 7, (Object) null);
            com.braze.storage.e0 e0Var = this.f12456f;
            String baseUrlForRequests = this.f12455e.getBaseUrlForRequests();
            String str = this.f12452b;
            k0 k0Var = this.f12460j;
            long j7 = k0Var.f12445c.getLong("lastUpdateTime", -1L) - k0Var.f12443a.u();
            SharedPreferences pushMaxPrefs = k0Var.f12444b;
            Intrinsics.checkNotNullExpressionValue(pushMaxPrefs, "pushMaxPrefs");
            ArrayList arrayList2 = new ArrayList();
            Map<String, ?> all = pushMaxPrefs.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (true) {
                j6 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String key = it.next().getKey();
                Intrinsics.checkNotNull(key);
                arrayList2.add(new j0(key, pushMaxPrefs.getLong(key, 0L)));
            }
            List list = CollectionsKt.toList(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                long j8 = j6;
                if (((j0) obj).f12438b > j7) {
                    arrayList3.add(obj);
                }
                j6 = j8;
            }
            long j9 = j6;
            List list2 = CollectionsKt.toList(arrayList3);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((j0) it2.next()).f12437a);
            }
            long j10 = this.f12460j.f12445c.getLong("lastUpdateTime", -1L);
            com.braze.storage.y yVar = this.f12462l;
            long v6 = this.f12456f.v();
            if (v6 <= j9) {
                arrayList = CollectionsKt.emptyList();
            } else {
                long nowInSeconds = DateTimeUtils.nowInSeconds() - v6;
                ArrayList arrayList5 = new ArrayList();
                Map<String, ?> all2 = yVar.f12975a.getAll();
                Intrinsics.checkNotNullExpressionValue(all2, "getAll(...)");
                for (Map.Entry<String, ?> entry : all2.entrySet()) {
                    Long l6 = (Long) entry.getValue();
                    if (l6 != null && l6.longValue() >= nowInSeconds) {
                        String key2 = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key2, "<get-key>(...)");
                        arrayList5.add(key2);
                    }
                }
                arrayList = arrayList5;
            }
            a(new com.braze.requests.r(e0Var, baseUrlForRequests, str, arrayList4, j10, arrayList));
        }
    }

    public final void f() {
        if (this.f12459i.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.i2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.g();
                }
            }, 6, (Object) null);
        } else {
            this.f12471u = null;
            this.f12453c.k();
        }
    }

    public final void o() {
        com.braze.models.l lVar;
        if (this.f12459i.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.j2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.r();
                }
            }, 6, (Object) null);
            return;
        }
        r rVar = this.f12453c;
        ReentrantLock reentrantLock = rVar.f12502h;
        reentrantLock.lock();
        try {
            if (rVar.f() && (lVar = rVar.f12506l) != null) {
                rVar.f12496b.a(lVar);
            }
            u0.a.b(rVar.f12505k, (CancellationException) null, 1, (Object) null);
            rVar.a();
            rVar.f12497c.b(com.braze.events.internal.a0.f12258a, com.braze.events.internal.a0.class);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.k2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.c(com.braze.managers.m.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void w() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.x();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.i(this.f12456f, this.f12455e.getBaseUrlForRequests(), this.f12452b));
    }

    public final void z() {
        if (this.f12456f.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.v2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.A();
                }
            }, 6, (Object) null);
            a(new com.braze.requests.g(this.f12456f, this.f12455e.getBaseUrlForRequests(), this.f12452b));
        }
    }

    public static final void a(m mVar, com.braze.events.internal.s it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw null;
    }

    public static final String d(com.braze.models.i iVar) {
        return "Not processing event after validation failed: " + iVar;
    }

    public static final String g(com.braze.models.i iVar) {
        return "Attempting to log event: " + JsonUtils.getPrettyPrintedString(((com.braze.models.outgoing.event.b) iVar).getKey());
    }

    public final void b(boolean z6) {
        this.f12469s.set(z6);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.b(com.braze.managers.m.this);
            }
        }, 6, (Object) null);
    }

    public final void c(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f12459i.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.f2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.p();
                }
            }, 6, (Object) null);
            return;
        }
        o();
        this.f12471u = activity.getClass();
        this.f12458h.b();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.g2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.d(activity);
                }
            }, 6, (Object) null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.h2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.q();
                }
            }, 4, (Object) null);
        }
    }

    public static final void a(m mVar, com.braze.events.internal.u it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.m2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.h();
            }
        }, 6, (Object) null);
        mVar.d();
    }

    public final void d() {
        if (this.f12456f.L()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.r2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.e();
                }
            }, 6, (Object) null);
            a(new com.braze.requests.v(this.f12456f, this.f12455e.getBaseUrlForRequests(), this.f12452b));
        }
    }

    public static final String b(m mVar) {
        return "Updated shouldRequestTriggersInNextRequest to: " + mVar.f12469s;
    }

    public static final String e() {
        return "Requesting SDK Debugger Handshake";
    }

    public static final void a(m mVar, com.braze.events.internal.v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f12980D, (Throwable) null, true, new Function0() { // from class: Z3.n2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.i();
            }
        }, 2, (Object) null);
        mVar.b(it.f12298a);
    }

    public static final String b(Activity activity) {
        return "Closed session with activity: " + activity.getLocalClassName();
    }

    public static final String b(com.braze.models.i iVar) {
        return "BrazeManager logEvent called for: " + JsonUtils.getPrettyPrintedString(((com.braze.models.outgoing.event.b) iVar).getKey());
    }

    public static final String f(com.braze.models.i iVar) {
        return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString(((com.braze.models.outgoing.event.b) iVar).getKey());
    }

    public final void a(boolean z6) {
        this.f12470t.set(z6);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.a(com.braze.managers.m.this);
            }
        }, 6, (Object) null);
    }

    public static final String b() {
        return "SDK is disabled. Not adding request to dispatch.";
    }

    public static final String a(m mVar) {
        return "Updated shouldRequestFeedInNextRequest to: " + mVar.f12470t;
    }

    public static final String c() {
        return "SDK is disabled. Not closing session.";
    }

    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12980D, (Throwable) null, true, new Function0() { // from class: Z3.t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.E();
            }
        }, 2, (Object) null);
        a(new com.braze.requests.w(this.f12456f, this.f12455e.getBaseUrlForRequests(), this.f12452b, arrayList));
    }

    public static final String c(com.braze.models.i iVar) {
        return "SDK is disabled. Not logging event: " + iVar;
    }

    public final void a(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f12459i.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.Y1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.c();
                }
            }, 6, (Object) null);
        } else if (this.f12471u == null || Intrinsics.areEqual(activity.getClass(), this.f12471u)) {
            this.f12458h.e();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.Z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.b(activity);
                }
            }, 6, (Object) null);
            this.f12453c.n();
        }
    }

    public final void c(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.n();
            }
        }, 7, (Object) null);
        this.f12460j.a(campaignId);
    }

    public static final String b(Throwable th) {
        return "Not logging duplicate error: " + th;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(final com.braze.models.i r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.m.a(com.braze.models.i):boolean");
    }

    public static final String b(long j6) {
        return "Scheduling Push Delivery Events Flush in " + j6 + " ms";
    }

    public final void a(com.braze.models.outgoing.j respondWithBuilder) {
        Intrinsics.checkNotNullParameter(respondWithBuilder, "respondWithBuilder");
        Pair a6 = this.f12456f.a();
        if (a6 != null) {
            com.braze.models.outgoing.i outboundConfigParams = new com.braze.models.outgoing.i(((Number) a6.getFirst()).longValue(), ((Boolean) a6.getSecond()).booleanValue());
            Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
            respondWithBuilder.f12636d = outboundConfigParams;
        }
        if (this.f12469s.get()) {
            respondWithBuilder.f12635c = Boolean.TRUE;
        }
        respondWithBuilder.f12633a = this.f12452b;
        a(new com.braze.requests.f(this.f12456f, this.f12455e.getBaseUrlForRequests(), new com.braze.models.outgoing.k(respondWithBuilder.f12633a, respondWithBuilder.f12634b, respondWithBuilder.f12635c, respondWithBuilder.f12636d)));
        this.f12469s.set(false);
    }

    public final void a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.S1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.B();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.j(this.f12456f, this.f12455e.getBaseUrlForRequests(), location));
    }

    public final void a(ArrayList ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.v();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.a(ids, this.f12456f, this.f12455e.getBaseUrlForRequests(), this.f12452b));
    }

    public final void a(com.braze.requests.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f12459i.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.W1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.b();
                }
            }, 6, (Object) null);
            return;
        }
        request.f12741b = this.f12452b;
        com.braze.events.d dVar = this.f12454d;
        Intrinsics.checkNotNullParameter(request, "request");
        dVar.b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f12268d, null, null, request, 6), com.braze.events.internal.dispatchmanager.c.class);
    }

    public final void a(long j6, long j7, int i6) {
        if (!this.f12456f.D()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.X1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.y();
                }
            }, 6, (Object) null);
        } else {
            a(new com.braze.requests.e(this.f12456f, this.f12455e.getBaseUrlForRequests(), j6, j7, this.f12452b, i6));
        }
    }

    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.f12465o;
        reentrantLock.lock();
        try {
            this.f12463m.getAndIncrement();
            if (Intrinsics.areEqual(this.f12468r, th.getMessage()) && this.f12464n.get() > 3 && this.f12463m.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            if (Intrinsics.areEqual(this.f12468r, th.getMessage())) {
                this.f12464n.getAndIncrement();
            } else {
                this.f12464n.set(0);
            }
            if (this.f12463m.get() >= 25) {
                this.f12463m.set(0);
            }
            this.f12468r = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(final Throwable throwable, boolean z6) {
        com.braze.models.i a6;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            if (a(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.y2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.m.b(throwable);
                    }
                }, 6, (Object) null);
                return;
            }
            String th = throwable.toString();
            String str = f12450v[0];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = th.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.contains$default(lowerCase, str, false, 2, (Object) null) || (a6 = com.braze.models.outgoing.event.b.f12605g.a(throwable, this.f12453c.g(), z6)) == null) {
                return;
            }
            a(a6);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.A2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.m.j();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final long j6) {
        Object systemService = this.f12451a.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.f12451a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction("com.braze.FLUSH_PUSH_DELIVERY");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f12451a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j6 <= 0) {
            alarmManager.cancel(broadcast);
            i0 i0Var = this.f12461k;
            i0Var.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = i0Var.f12434a;
            reentrantLock.lock();
            try {
                Iterator it = i0Var.f12435b.iterator();
                while (it.hasNext()) {
                    com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(aVar);
                    }
                }
                i0Var.f12435b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.T1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.m.s();
                        }
                    }, 7, (Object) null);
                    a(new com.braze.requests.q(this.f12456f, this.f12455e.getBaseUrlForRequests(), this.f12452b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.U1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.m.t();
                        }
                    }, 7, (Object) null);
                    return;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.V1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.b(j6);
            }
        }, 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j6, broadcast);
    }

    public final void a(final String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.p2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.m.b(campaignId);
            }
        }, 7, (Object) null);
        this.f12461k.a(campaignId);
    }
}
