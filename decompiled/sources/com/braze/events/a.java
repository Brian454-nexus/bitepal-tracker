package com.braze.events;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.events.internal.f0;
import com.braze.events.internal.g0;
import com.braze.events.internal.u;
import com.braze.events.internal.w;
import com.braze.events.internal.y;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.a0;
import com.braze.managers.h;
import com.braze.managers.i0;
import com.braze.managers.k;
import com.braze.managers.m;
import com.braze.managers.z;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.j;
import com.braze.models.outgoing.l;
import com.braze.requests.n;
import com.braze.requests.q;
import com.braze.storage.b0;
import com.braze.storage.e0;
import com.braze.storage.h0;
import com.braze.storage.p;
import com.braze.storage.r;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.triggers.events.i;
import com.braze.triggers.managers.f;
import com.braze.triggers.managers.g;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f12218A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f12219B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12220a;

    /* renamed from: b, reason: collision with root package name */
    public final k f12221b;

    /* renamed from: c, reason: collision with root package name */
    public final e f12222c;

    /* renamed from: d, reason: collision with root package name */
    public final m f12223d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f12224e;

    /* renamed from: f, reason: collision with root package name */
    public final r f12225f;

    /* renamed from: g, reason: collision with root package name */
    public final f f12226g;

    /* renamed from: h, reason: collision with root package name */
    public final g f12227h;

    /* renamed from: i, reason: collision with root package name */
    public final z f12228i;

    /* renamed from: j, reason: collision with root package name */
    public final BrazeGeofenceManager f12229j;

    /* renamed from: k, reason: collision with root package name */
    public final e f12230k;

    /* renamed from: l, reason: collision with root package name */
    public final BrazeConfigurationProvider f12231l;

    /* renamed from: m, reason: collision with root package name */
    public final p f12232m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f12233n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f12234o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f12235p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f12236q;

    /* renamed from: r, reason: collision with root package name */
    public final h f12237r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f12238s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f12239t;

    /* renamed from: u, reason: collision with root package name */
    public com.braze.events.internal.e0 f12240u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f12241v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f12242w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f12243x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f12244y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f12245z;

    public a(Context applicationContext, k locationManager, e internalEventPublisher, m brazeManager, h0 userCache, r deviceCache, f triggerManager, g triggerReEligibilityManager, z eventStorageManager, BrazeGeofenceManager geofenceManager, e externalEventPublisher, BrazeConfigurationProvider configurationProvider, p contentCardsStorageProvider, b0 sdkMetadataCache, e0 serverConfigStorageProvider, a0 featureFlagsManager, i0 pushDeliveryManager, h bannersManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(triggerManager, "triggerManager");
        Intrinsics.checkNotNullParameter(triggerReEligibilityManager, "triggerReEligibilityManager");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(geofenceManager, "geofenceManager");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(bannersManager, "bannersManager");
        this.f12220a = applicationContext;
        this.f12221b = locationManager;
        this.f12222c = internalEventPublisher;
        this.f12223d = brazeManager;
        this.f12224e = userCache;
        this.f12225f = deviceCache;
        this.f12226g = triggerManager;
        this.f12227h = triggerReEligibilityManager;
        this.f12228i = eventStorageManager;
        this.f12229j = geofenceManager;
        this.f12230k = externalEventPublisher;
        this.f12231l = configurationProvider;
        this.f12232m = contentCardsStorageProvider;
        this.f12233n = sdkMetadataCache;
        this.f12234o = serverConfigStorageProvider;
        this.f12235p = featureFlagsManager;
        this.f12236q = pushDeliveryManager;
        this.f12237r = bannersManager;
        this.f12238s = new AtomicBoolean(false);
        this.f12239t = new AtomicBoolean(false);
        this.f12241v = new AtomicBoolean(false);
        this.f12242w = new AtomicBoolean(false);
        this.f12243x = new AtomicBoolean(false);
        this.f12244y = new AtomicBoolean(false);
        this.f12245z = new AtomicBoolean(false);
        this.f12218A = new AtomicBoolean(false);
        this.f12219B = new AtomicBoolean(false);
    }

    public static final String J() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String K() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String M() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String Q() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String S() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String T() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String V() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String W() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final String Y() {
        return "Doing Debugger Handshake.";
    }

    public static final String Z() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final void a(a aVar, com.braze.events.internal.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar2, "<destruct>");
        ((d) aVar.f12230k).b(aVar.f12237r.a(aVar2.f12257a), BannersUpdatedEvent.class);
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Performing push delivery event flush";
    }

    public static final String c() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d0() {
        return "Requesting feed refresh in next sync";
    }

    public static final String e() {
        return "Session created event for new session received.";
    }

    public static final String e0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String f() {
        return "Session start event for new session received.";
    }

    public static final String g() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String h() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String m() {
        return "Failed to log the storage exception.";
    }

    public static final String n() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String u() {
        return "Failed to log error.";
    }

    public final IEventSubscriber A() {
        return new IEventSubscriber() { // from class: W3.i
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.y) obj);
            }
        };
    }

    public final IEventSubscriber B() {
        return new IEventSubscriber() { // from class: W3.W
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.z) obj);
            }
        };
    }

    public final IEventSubscriber C() {
        return new IEventSubscriber() { // from class: W3.d
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.a0) obj);
            }
        };
    }

    public final IEventSubscriber D() {
        return new IEventSubscriber() { // from class: W3.w
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.exceptions.b) obj);
            }
        };
    }

    public final IEventSubscriber E() {
        return new IEventSubscriber() { // from class: W3.h
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.e0) obj);
            }
        };
    }

    public final IEventSubscriber F() {
        return new IEventSubscriber() { // from class: W3.f
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.f0) obj);
            }
        };
    }

    public final IEventSubscriber G() {
        return new IEventSubscriber() { // from class: W3.Y
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.g0) obj);
            }
        };
    }

    public final IEventSubscriber H() {
        return new IEventSubscriber() { // from class: W3.X
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.h0) obj);
            }
        };
    }

    public final void I() {
        if (!this.f12218A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.K();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.J();
            }
        }, 7, (Object) null);
        h hVar = this.f12237r;
        com.braze.managers.g gVar = h.f12409k;
        hVar.a(false);
    }

    public final void L() {
        if (!this.f12242w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.N();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.M();
            }
        }, 7, (Object) null);
        m mVar = this.f12223d;
        p pVar = this.f12232m;
        mVar.a(pVar.f12939c, pVar.f12940d, 0);
    }

    public final void O() {
        if (!this.f12245z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.Q();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.P
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.P();
                }
            }, 7, (Object) null);
            this.f12223d.z();
        }
    }

    public final void R() {
        if (!this.f12243x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.T();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.S();
                }
            }, 7, (Object) null);
            this.f12235p.f12389d.w();
        }
    }

    public final void U() {
        if (!this.f12244y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.W();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.V();
                }
            }, 7, (Object) null);
            this.f12223d.C();
        }
    }

    public final void X() {
        if (!this.f12219B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.Z();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.S
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.Y();
            }
        }, 7, (Object) null);
        ((d) this.f12222c).b(new u(), u.class);
    }

    public final void a0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.b0();
            }
        }, 7, (Object) null);
        this.f12223d.a(0L);
    }

    public final void c0() {
        j jVar = new j();
        if (this.f12223d.f12470t.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.d0();
                }
            }, 7, (Object) null);
            jVar.f12634b = Boolean.TRUE;
            this.f12223d.a(false);
        }
        if (this.f12223d.f12469s.get()) {
            this.f12238s.set(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.e0();
                }
            }, 7, (Object) null);
            jVar.f12635c = Boolean.TRUE;
            this.f12223d.b(false);
        }
        Boolean bool = jVar.f12635c;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2) || Intrinsics.areEqual(jVar.f12634b, bool2)) {
            this.f12223d.a(jVar);
        }
    }

    public final IEventSubscriber o() {
        return new IEventSubscriber() { // from class: W3.l
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.a) obj);
            }
        };
    }

    public final IEventSubscriber p() {
        return new IEventSubscriber() { // from class: W3.T
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.d) obj);
            }
        };
    }

    public final IEventSubscriber q() {
        return new IEventSubscriber() { // from class: W3.V
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.e) obj);
            }
        };
    }

    public final IEventSubscriber r() {
        return new IEventSubscriber() { // from class: W3.H
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.f) obj);
            }
        };
    }

    public final IEventSubscriber s() {
        return new IEventSubscriber() { // from class: W3.b
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.g) obj);
            }
        };
    }

    public final IEventSubscriber t() {
        final Semaphore semaphore = null;
        return new IEventSubscriber() { // from class: W3.c
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, semaphore, (Throwable) obj);
            }
        };
    }

    public final IEventSubscriber v() {
        return new IEventSubscriber() { // from class: W3.Z
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.i) obj);
            }
        };
    }

    public final IEventSubscriber w() {
        return new IEventSubscriber() { // from class: W3.g
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.l) obj);
            }
        };
    }

    public final IEventSubscriber x() {
        return new IEventSubscriber() { // from class: W3.j
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.m) obj);
            }
        };
    }

    public final IEventSubscriber y() {
        return new IEventSubscriber() { // from class: W3.e
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.n) obj);
            }
        };
    }

    public final IEventSubscriber z() {
        return new IEventSubscriber() { // from class: W3.k
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(com.braze.events.a.this, (com.braze.events.internal.w) obj);
            }
        };
    }

    public static final void a(a aVar, com.braze.events.internal.f fVar) {
        com.braze.events.internal.e0 e0Var;
        Intrinsics.checkNotNullParameter(fVar, "<destruct>");
        n nVar = fVar.f12277a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) nVar).f12747h;
        if (hVar != null) {
            aVar.f12225f.a((Object) hVar, false);
        }
        if (nVar instanceof com.braze.requests.f) {
            com.braze.requests.f fVar2 = (com.braze.requests.f) nVar;
            if (fVar2.f12765j.b()) {
                if (aVar.f12238s.compareAndSet(true, false)) {
                    aVar.f12226g.a((i) new com.braze.triggers.events.e());
                }
                if (aVar.f12239t.compareAndSet(true, false) && (e0Var = aVar.f12240u) != null) {
                    aVar.f12226g.a((i) new com.braze.triggers.events.g(e0Var.f12275a, e0Var.f12276b));
                    aVar.f12240u = null;
                }
                aVar.f12223d.b(true);
            }
            l lVar = fVar2.f12767l;
            if (lVar != null) {
                aVar.f12224e.a((Object) lVar, false);
                if (lVar.f12641a.has("push_token")) {
                    aVar.f12224e.j();
                    aVar.f12225f.e();
                }
            }
            com.braze.models.b bVar = fVar2.f12768m;
            if (bVar != null) {
                for (com.braze.models.i iVar : bVar.f12572a) {
                    e eVar = aVar.f12222c;
                    List events = CollectionsKt.listOf(iVar);
                    Intrinsics.checkNotNullParameter(events, "events");
                    ((d) eVar).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f12266b, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
                }
            }
            if (fVar2.f12765j.f12640d != null) {
                aVar.f12234o.M();
            }
        }
        if (nVar instanceof q) {
            aVar.f12236q.b(((q) nVar).f12845j);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
        n nVar = gVar.f12279a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) nVar).f12747h;
        if (hVar != null) {
            aVar.f12225f.a((Object) hVar, true);
        }
        if (nVar instanceof com.braze.requests.f) {
            com.braze.requests.f fVar = (com.braze.requests.f) nVar;
            l lVar = fVar.f12767l;
            if (lVar != null) {
                aVar.f12224e.a((Object) lVar, true);
            }
            com.braze.models.b bVar = fVar.f12768m;
            if (bVar != null) {
                aVar.f12228i.a(bVar.f12572a);
            }
            if (fVar.f12765j.b()) {
                aVar.f12223d.b(false);
            }
            EnumSet enumSet = fVar.f12769n;
            if (enumSet != null) {
                aVar.f12233n.a(enumSet);
            }
            if (fVar.f12765j.f12640d != null) {
                aVar.f12234o.M();
            }
        }
        if (nVar instanceof q) {
            aVar.f12236q.a(((q) nVar).f12845j);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<destruct>");
        ((d) aVar.f12230k).b(aVar.f12235p.a(iVar.f12284a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(a aVar, com.braze.events.internal.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<destruct>");
        aVar.f12229j.registerGeofences(lVar.f12286a);
    }

    public static final void a(a aVar, com.braze.events.internal.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<destruct>");
        com.braze.triggers.events.b bVar = mVar.f12287a;
        final com.braze.triggers.actions.h hVar = mVar.f12288b;
        IInAppMessage iInAppMessage = mVar.f12289c;
        String str = mVar.f12290d;
        synchronized (aVar.f12227h) {
            try {
                if (aVar.f12227h.a((com.braze.triggers.actions.g) hVar)) {
                    ((d) aVar.f12230k).b(new InAppMessageEvent(bVar, hVar, iInAppMessage, str), InAppMessageEvent.class);
                    aVar.f12227h.a(hVar, DateTimeUtils.nowInSeconds());
                    aVar.f12226g.b(DateTimeUtils.nowInSeconds());
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.events.a.a(com.braze.triggers.actions.a.this);
                        }
                    }, 7, (Object) null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(a aVar, w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<destruct>");
        com.braze.models.response.m mVar = wVar.f12299a;
        aVar.f12229j.configureFromServerConfig(mVar);
        if (aVar.f12241v.get()) {
            if (mVar.f12696j) {
                aVar.L();
            }
            if (mVar.f12699m) {
                aVar.R();
            }
            if (mVar.f12701o) {
                aVar.U();
            }
            if (mVar.f12706t) {
                aVar.O();
            }
            if (mVar.f12685F) {
                aVar.I();
            }
            if (mVar.f12711y) {
                aVar.X();
            }
        }
    }

    public static final void a(a aVar, f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<destruct>");
        aVar.f12226g.a((i) f0Var.f12278a);
    }

    public static final void a(a aVar, g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<destruct>");
        aVar.f12226g.a(g0Var.f12280a, g0Var.f12281b);
    }

    public static final void a(a aVar, com.braze.events.internal.h0 h0Var) {
        com.braze.events.internal.e0 e0Var;
        Intrinsics.checkNotNullParameter(h0Var, "<destruct>");
        aVar.f12226g.a(h0Var.f12283a);
        if (aVar.f12238s.compareAndSet(true, false)) {
            aVar.f12226g.a((i) new com.braze.triggers.events.e());
        }
        if (!aVar.f12239t.compareAndSet(true, false) || (e0Var = aVar.f12240u) == null) {
            return;
        }
        aVar.f12226g.a((i) new com.braze.triggers.events.g(e0Var.f12275a, e0Var.f12276b));
        aVar.f12240u = null;
    }

    public static final void a(a aVar, com.braze.events.internal.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f12262a.f12696j || event.f12263b.f12696j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.a();
            }
        }, 7, (Object) null);
        aVar.f12232m.a();
    }

    public static final void a(a aVar, y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.e();
            }
        }, 7, (Object) null);
        aVar.f12242w.set(false);
        aVar.f12243x.set(false);
        aVar.f12244y.set(false);
        aVar.f12245z.set(false);
        aVar.f12219B.set(false);
        aVar.f12221b.g();
        com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(it.f12301a.f12598a);
        if (a6 != null) {
            ((com.braze.models.outgoing.event.b) a6).a(it.f12301a.f12598a);
        }
        if (a6 != null) {
            aVar.f12223d.a(a6);
        }
        aVar.f12223d.b(true);
        aVar.f12223d.a(true);
        aVar.f12224e.j();
        aVar.f12225f.e();
        aVar.a0();
        if (aVar.f12231l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.c();
                }
            }, 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(aVar.f12220a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.d();
                }
            }, 7, (Object) null);
        }
        aVar.f12235p.g();
        aVar.f12237r.j();
        aVar.c0();
    }

    public static final void a(a aVar, com.braze.events.internal.a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.f();
            }
        }, 7, (Object) null);
        aVar.f12241v.set(true);
        if (aVar.f12234o.D()) {
            aVar.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.g();
                }
            }, 7, (Object) null);
        }
        if (aVar.f12234o.G()) {
            aVar.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.h();
                }
            }, 7, (Object) null);
        }
        if (aVar.f12234o.K()) {
            aVar.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.i();
                }
            }, 7, (Object) null);
        }
        if (aVar.f12234o.E()) {
            aVar.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.j();
                }
            }, 7, (Object) null);
        }
        if (aVar.f12234o.d()) {
            aVar.I();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.k();
                }
            }, 7, (Object) null);
        }
        if (aVar.f12234o.L()) {
            aVar.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.l();
                }
            }, 7, (Object) null);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.f12223d.b(true);
        aVar.c0();
    }

    public static final void a(a aVar, com.braze.events.internal.z message) {
        Intrinsics.checkNotNullParameter(message, "message");
        aVar.getClass();
        com.braze.models.n nVar = message.f12302a;
        com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(nVar.c());
        if (a6 != null) {
            ((com.braze.models.outgoing.event.b) a6).a(nVar.f12598a);
            aVar.f12223d.a(a6);
        }
        Braze.INSTANCE.getInstance(aVar.f12220a).requestImmediateDataFlush();
        aVar.a0();
    }

    public static final void a(a aVar, com.braze.events.internal.e0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        aVar.f12239t.set(true);
        aVar.f12240u = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: W3.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.n();
            }
        }, 6, (Object) null);
        m mVar = aVar.f12223d;
        j jVar = new j();
        jVar.f12635c = Boolean.TRUE;
        mVar.a(jVar);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Could not publish in-app message with trigger action id: " + ((com.braze.triggers.actions.g) aVar).f13020a;
    }

    public static final void a(a aVar, com.braze.exceptions.b throwable) {
        Intrinsics.checkNotNullParameter(throwable, "storageException");
        try {
            m mVar = aVar.f12223d;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            mVar.a((Throwable) throwable, false);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: W3.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.m();
                }
            }, 4, (Object) null);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            m mVar = aVar.f12223d;
            p pVar = aVar.f12232m;
            mVar.a(pVar.f12939c, pVar.f12940d, 0);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: W3.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.a.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(final d eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.a.a(com.braze.events.e.this);
            }
        }, 7, (Object) null);
        eventMessenger.c(com.braze.events.internal.f.class, r());
        eventMessenger.c(com.braze.events.internal.g.class, s());
        eventMessenger.c(y.class, A());
        eventMessenger.c(com.braze.events.internal.a0.class, C());
        eventMessenger.c(com.braze.events.internal.z.class, B());
        eventMessenger.c(com.braze.events.internal.e0.class, E());
        eventMessenger.c(w.class, z());
        eventMessenger.c(Throwable.class, t());
        eventMessenger.c(com.braze.exceptions.b.class, D());
        eventMessenger.c(com.braze.events.internal.h0.class, H());
        eventMessenger.c(com.braze.events.internal.n.class, y());
        eventMessenger.c(com.braze.events.internal.l.class, w());
        eventMessenger.c(com.braze.events.internal.i.class, v());
        eventMessenger.c(com.braze.events.internal.a.class, o());
        eventMessenger.c(f0.class, F());
        eventMessenger.c(com.braze.events.internal.m.class, x());
        eventMessenger.c(g0.class, G());
        eventMessenger.c(com.braze.events.internal.e.class, q());
        eventMessenger.c(com.braze.events.internal.d.class, p());
    }

    public static final String a(e eVar) {
        return "Subscribing to events with " + eVar;
    }

    public static final void a(a aVar, Semaphore semaphore, Throwable throwable) {
        try {
            if (throwable != null) {
                try {
                    m mVar = aVar.f12223d;
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    mVar.a(throwable, true);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: W3.A
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.events.a.u();
                        }
                    }, 4, (Object) null);
                    if (semaphore == null) {
                        return;
                    }
                }
            }
            if (semaphore == null) {
                return;
            }
            semaphore.release();
        } finally {
        }
    }
}
