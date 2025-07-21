package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: m, reason: collision with root package name */
    public static ga.u0 f12411m;

    /* renamed from: a, reason: collision with root package name */
    public final String f12416a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f12417b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.storage.e0 f12418c;

    /* renamed from: d, reason: collision with root package name */
    public final m f12419d;

    /* renamed from: e, reason: collision with root package name */
    public List f12420e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f12421f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferences f12422g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferences f12423h;

    /* renamed from: i, reason: collision with root package name */
    public final SharedPreferences f12424i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f12425j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f12409k = new g();

    /* renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f12410l = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final ReentrantLock f12412n = new ReentrantLock();

    /* renamed from: o, reason: collision with root package name */
    public static final ArrayList f12413o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public static final ReentrantLock f12414p = new ReentrantLock();

    /* renamed from: q, reason: collision with root package name */
    public static final ArrayList f12415q = new ArrayList();

    public h(Context context, String apiKey, String str, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, com.braze.storage.e0 serverConfigStorageProvider, m brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f12416a = str;
        this.f12417b = externalEventPublisher;
        this.f12418c = serverConfigStorageProvider;
        this.f12419d = brazeManager;
        this.f12420e = CollectionsKt.emptyList();
        this.f12421f = new AtomicBoolean(false);
        SharedPreferences a6 = c.a(context, str, apiKey, new StringBuilder("com.braze.managers.banners.eligibility"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12422g = a6;
        SharedPreferences a7 = c.a(context, str, apiKey, new StringBuilder("com.braze.managers.banners.storage"), 0);
        Intrinsics.checkNotNullExpressionValue(a7, "getSharedPreferences(...)");
        this.f12423h = a7;
        SharedPreferences a8 = c.a(context, str, apiKey, new StringBuilder("com.braze.managers.banners.impressions"), 0);
        Intrinsics.checkNotNullExpressionValue(a8, "getSharedPreferences(...)");
        this.f12424i = a8;
        this.f12425j = new AtomicInteger(0);
        e();
        com.braze.events.d dVar = (com.braze.events.d) internalEventPublisher;
        dVar.c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: Z3.H0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h.a(com.braze.managers.h.this, (com.braze.events.internal.q) obj);
            }
        });
        dVar.c(com.braze.events.internal.c.class, new IEventSubscriber() { // from class: Z3.S0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h.a(com.braze.managers.h.this, (com.braze.events.internal.c) obj);
            }
        });
        dVar.c(com.braze.events.internal.b.class, new IEventSubscriber() { // from class: Z3.d1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h.a(com.braze.managers.h.this, (com.braze.events.internal.b) obj);
            }
        });
        dVar.d(BrazeUserChangeEvent.class, new IEventSubscriber() { // from class: Z3.j1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h.a(com.braze.managers.h.this, (BrazeUserChangeEvent) obj);
            }
        });
        dVar.c(com.braze.events.internal.d.class, new IEventSubscriber() { // from class: Z3.k1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h.a(com.braze.managers.h.this, (com.braze.events.internal.d) obj);
            }
        });
    }

    public static final void a(h hVar, com.braze.events.internal.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.f12262a.f12685F || it.f12263b.f12685F) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.W0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.d();
            }
        }, 7, (Object) null);
        hVar.a();
    }

    public static final String b(String str) {
        return com.braze.b.a("Returning test Banner with placement id ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    public static final String c(String str) {
        return com.braze.a.a("Banner with placement id ", str, " not found in cache. Returning null for this Banner.");
    }

    public static final String d(String str) {
        return com.braze.a.a("Received null or blank serialized Banner string for Banner id ", str, " from shared preferences. Not parsing.");
    }

    public static final String e(String str) {
        return com.braze.j.a("Encountered unexpected exception while parsing stored banner: ", str);
    }

    public static final String f(String str) {
        return com.braze.a.a("Not logging a Banner click for Banner with placement id ", str, ". The Banner was not present in cache.");
    }

    public static final String h(String str) {
        return com.braze.a.a("Not logging a Banner impression for Banner with placement id ", str, ". The Banner was not present in cache.");
    }

    public static final String i(String str) {
        return com.braze.b.a("Logging impression for Banner with placement id ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    public static final String k() {
        return "Resetting BannersManager for new session.";
    }

    public static final String l() {
        return "Added new Banners to local storage.";
    }

    public static final String n() {
        return "View is not an IBannerView. Cannot update banner data.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    public final boolean g(final String id) {
        Set<String> keySet;
        Banner banner;
        Intrinsics.checkNotNullParameter(id, "id");
        Banner banner2 = (Banner) f12410l.get(id);
        if (banner2 == null) {
            Iterator it = this.f12420e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    banner = 0;
                    break;
                }
                banner = it.next();
                if (Intrinsics.areEqual(id, ((Banner) banner).getPlacementId())) {
                    break;
                }
            }
            banner2 = banner;
        }
        final Banner banner3 = banner2;
        boolean z6 = false;
        if (banner3 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.g1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.h(id);
                }
            }, 6, (Object) null);
            return false;
        }
        String id2 = banner3.getTrackingId();
        Intrinsics.checkNotNullParameter(id2, "id");
        Map<String, ?> all = this.f12424i.getAll();
        if (all != null && (keySet = all.keySet()) != null) {
            z6 = keySet.contains(id2);
        }
        if (!z6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.i(id);
                }
            }, 7, (Object) null);
            com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(banner3.getTrackingId());
            if (a6 != null) {
                this.f12419d.a(a6);
            }
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f12424i.edit().putBoolean(id2, true).apply();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.b(Banner.this);
                }
            }, 6, (Object) null);
        }
        return true;
    }

    public final void j() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.k();
            }
        }, 6, (Object) null);
        this.f12424i.edit().clear().apply();
        this.f12421f.set(false);
        g.a();
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = f12412n;
        reentrantLock.lock();
        try {
            List<d> list = CollectionsKt.toList(f12413o);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            for (final d dVar : list) {
                try {
                    KeyEvent.Callback callback = (View) dVar.f12404b.get();
                    if (callback == null) {
                        arrayList.add(dVar);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.m1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.managers.h.a(com.braze.managers.d.this);
                            }
                        }, 7, (Object) null);
                    } else if (callback instanceof IBannerView) {
                        ((IBannerView) callback).initBanner(dVar.f12403a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.n1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.managers.h.n();
                            }
                        }, 6, (Object) null);
                        arrayList.add(dVar);
                    }
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.o1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.h.b(com.braze.managers.d.this);
                        }
                    }, 4, (Object) null);
                    arrayList.add(dVar);
                }
            }
            f12412n.lock();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f12413o.remove((d) it.next());
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void o() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.a(nowInSeconds);
            }
        }, 6, (Object) null);
        this.f12422g.edit().putLong("last_refresh", nowInSeconds).apply();
    }

    public static final String b(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Done updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final String c() {
        return "Refreshing Banners on forced internal refresh.";
    }

    public static final String d() {
        return "Banners have moved to disabled. Clearing banners data.";
    }

    public static final String f() {
        return "Did not find stored Banners.";
    }

    public static final String h() {
        return "Bypassing rate limit for Banner refresh.";
    }

    public static final String i() {
        return "Banners have already been sync'd. Only one sync per session is allowed.";
    }

    public final void e() {
        SharedPreferences sharedPreferences = this.f12423h;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> keySet = all.keySet();
            if (keySet.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.P0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.g();
                    }
                }, 6, (Object) null);
                this.f12420e = CollectionsKt.emptyList();
                return;
            }
            for (final String str : keySet) {
                final String str2 = (String) all.get(str);
                if (str2 != null) {
                    try {
                    } catch (Exception e6) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.R0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.managers.h.e(str2);
                            }
                        }, 4, (Object) null);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (!StringsKt.isBlank(str2)) {
                        Banner a6 = Banner.Companion.a(new JSONObject(str2));
                        if (a6 != null) {
                            arrayList.add(a6);
                        }
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.Q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.d(str);
                    }
                }, 6, (Object) null);
            }
            this.f12420e = arrayList;
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.T0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.f();
            }
        }, 7, (Object) null);
        this.f12420e = CollectionsKt.emptyList();
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String c(Banner banner) {
        return "Not storing expired Banner: " + banner + ". The Banner's expiration timestamp is in the past.";
    }

    public static final String d(Banner banner) {
        return "Error storing Banner: " + banner + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final String b(Banner banner) {
        return "Not logging a Banner impression for Banner " + banner + ". The Banner already had an impression logged in the current session";
    }

    public static final String b(String str, String str2) {
        return "Logging click for Banner with placement id " + str + " with buttonID of " + str2 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final String b(d dVar) {
        return com.braze.c.a(new StringBuilder("Error checking banner visibility for "), dVar.f12403a, ".Removing banner from visibility monitoring.");
    }

    public static final void a(h hVar, com.braze.events.internal.q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f12295a instanceof com.braze.requests.a) {
            hVar.f12425j.decrementAndGet();
        }
    }

    public static final void a(h hVar, com.braze.events.internal.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        hVar.f12421f.set(true);
        hVar.o();
    }

    public static final void a(h hVar, com.braze.events.internal.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((com.braze.events.d) hVar.f12417b).b(it, com.braze.events.internal.b.class);
    }

    public static final void a(h hVar, final BrazeUserChangeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.U0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.a(BrazeUserChangeEvent.this);
            }
        }, 7, (Object) null);
        hVar.m();
        BrazeLogger.brazelog$default(brazeLogger, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.V0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.b(BrazeUserChangeEvent.this);
            }
        }, 7, (Object) null);
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final String g() {
        return "Failed to find stored Banner keys.";
    }

    public final void a(boolean z6) {
        ReentrantLock reentrantLock = f12414p;
        reentrantLock.lock();
        try {
            List mutableList = CollectionsKt.toMutableList(f12415q);
            reentrantLock.unlock();
            if (mutableList.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.b();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.a1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.c();
                    }
                }, 7, (Object) null);
                a(mutableList, z6);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean a(final List ids, boolean z6) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(ids, "ids");
        if (this.f12425j.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.L0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.a(com.braze.managers.h.this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (z6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.M0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.h();
                }
            }, 7, (Object) null);
        } else if (this.f12421f.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.N0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.i();
                }
            }, 6, (Object) null);
            return false;
        }
        if (ids.size() > this.f12418c.p()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.O0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.a(com.braze.managers.h.this, ids);
                }
            }, 7, (Object) null);
        }
        this.f12425j.incrementAndGet();
        List<String> ids2 = CollectionsKt.take(ids, this.f12418c.p());
        Intrinsics.checkNotNullParameter(ids2, "ids");
        ArrayList arrayList = new ArrayList();
        for (String str2 : ids2) {
            Iterator it = this.f12420e.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Banner) obj).getPlacementId(), str2)) {
                    break;
                }
            }
            Banner banner = (Banner) obj;
            if (banner != null) {
                str = banner.getTrackingId();
            }
            arrayList.add(new Pair(str2, str));
        }
        this.f12419d.a(arrayList);
        return true;
    }

    public static final String a(h hVar) {
        return "Not refreshing Banners since another " + hVar.f12425j.get() + " request is currently in-flight.";
    }

    public static final String a(h hVar, List list) {
        return "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of " + hVar.f12418c.p() + " placements, but " + list.size() + " were requested. Truncating request to fit.\nPlacements that will be requested: " + CollectionsKt.take(list, hVar.f12418c.p()) + "\nTruncated placements not requested: " + list.subList(hVar.f12418c.p(), list.size());
    }

    public final Banner a(final String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        final Banner banner = (Banner) f12410l.get(id);
        if (banner != null) {
            if (banner.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.a(Banner.this);
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.I0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.b(id);
                    }
                }, 6, (Object) null);
                banner.setUserId(this.f12416a);
                return banner;
            }
        }
        Iterator it = this.f12420e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Banner) obj).getPlacementId(), id)) {
                break;
            }
        }
        final Banner banner2 = (Banner) obj;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.J0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.c(id);
                }
            }, 6, (Object) null);
            return null;
        }
        if (banner2.isExpired()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.K0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.a(id, banner2);
                }
            }, 6, (Object) null);
            return null;
        }
        banner2.setUserId(this.f12416a);
        return banner2;
    }

    public static final String a(Banner banner) {
        return "Found test banner, but it is expired. Attempting to find non-test banner. " + banner;
    }

    public static final String a(String str, Banner banner) {
        return "Banner with placement id " + str + " has expired. Returning null for this Banner " + banner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    public final void a(final String id, final String str) {
        Banner banner;
        Intrinsics.checkNotNullParameter(id, "id");
        Banner banner2 = (Banner) f12410l.get(id);
        if (banner2 == null) {
            Iterator it = this.f12420e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    banner = 0;
                    break;
                } else {
                    banner = it.next();
                    if (Intrinsics.areEqual(id, ((Banner) banner).getPlacementId())) {
                        break;
                    }
                }
            }
            banner2 = banner;
        }
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.X0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.h.f(id);
                }
            }, 6, (Object) null);
            return;
        }
        String trackingId = banner2.getTrackingId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.b(id, str);
            }
        }, 7, (Object) null);
        com.braze.models.i c6 = com.braze.models.outgoing.event.b.f12605g.c(trackingId, str);
        if (c6 != null) {
            this.f12419d.a(c6);
        }
    }

    public final BannersUpdatedEvent a(JSONObject bannersJson) {
        Intrinsics.checkNotNullParameter(bannersJson, "bannerData");
        Banner.Companion.getClass();
        Intrinsics.checkNotNullParameter(bannersJson, "bannersJson");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = bannersJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Banner a6 = Banner.Companion.a(bannersJson.optJSONObject(keys.next()));
            if (a6 != null) {
                arrayList.add(a6);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Banner) next).getIsTestSend()) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List<Banner> list = (List) pair.component1();
        List list2 = (List) pair.component2();
        for (Banner banner : list) {
            f12410l.put(banner.getPlacementId(), banner);
        }
        this.f12420e = list2;
        SharedPreferences.Editor edit = this.f12423h.edit();
        edit.clear();
        for (final Banner banner2 : this.f12420e) {
            if (banner2.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.b1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.h.c(Banner.this);
                    }
                }, 6, (Object) null);
            } else {
                try {
                    edit.putString(banner2.getPlacementId(), banner2.getKey().toString());
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.c1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.h.d(Banner.this);
                        }
                    }, 4, (Object) null);
                }
            }
        }
        edit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.h.l();
            }
        }, 7, (Object) null);
        m();
        List list3 = this.f12420e;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Banner) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new BannersUpdatedEvent(arrayList4);
    }

    public static final String a(long j6) {
        return "Updating last Banners refresh time: " + j6;
    }

    public static final String a(d dVar) {
        return com.braze.c.a(new StringBuilder("Banner "), dVar.f12403a, " removed because view is null");
    }

    public final void a() {
        this.f12420e = CollectionsKt.emptyList();
        this.f12423h.edit().clear().apply();
        m();
    }
}
