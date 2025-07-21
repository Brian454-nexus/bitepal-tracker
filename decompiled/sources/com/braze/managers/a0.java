package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f12386a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f12387b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.storage.e0 f12388c;

    /* renamed from: d, reason: collision with root package name */
    public final m f12389d;

    /* renamed from: e, reason: collision with root package name */
    public List f12390e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f12391f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferences f12392g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferences f12393h;

    /* renamed from: i, reason: collision with root package name */
    public final SharedPreferences f12394i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f12395j;

    public a0(Context context, String apiKey, String str, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, com.braze.storage.e0 serverConfigStorageProvider, m brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f12386a = internalEventPublisher;
        this.f12387b = externalEventPublisher;
        this.f12388c = serverConfigStorageProvider;
        this.f12389d = brazeManager;
        this.f12390e = CollectionsKt.emptyList();
        this.f12391f = new AtomicBoolean(false);
        SharedPreferences a6 = c.a(context, str, apiKey, new StringBuilder("com.braze.managers.featureflags.eligibility"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12392g = a6;
        SharedPreferences a7 = c.a(context, str, apiKey, new StringBuilder("com.braze.managers.featureflags.storage"), 0);
        Intrinsics.checkNotNullExpressionValue(a7, "getSharedPreferences(...)");
        this.f12393h = a7;
        SharedPreferences a8 = c.a(context, str, apiKey, new StringBuilder("com.braze.managers.featureflags.impressions"), 0);
        Intrinsics.checkNotNullExpressionValue(a8, "getSharedPreferences(...)");
        this.f12394i = a8;
        this.f12395j = new AtomicInteger(0);
        c();
        h();
    }

    public static final String a(String str) {
        return com.braze.a.a("Received null or blank serialized Feature Flag string for Feature Flag id ", str, " from shared preferences. Not parsing.");
    }

    public static final String b(String str) {
        return com.braze.j.a("Encountered unexpected exception while parsing stored feature flags: ", str);
    }

    public static final String d(String str) {
        return com.braze.a.a("Not logging a Feature Flag impression for Feature Flag with id ", str, ". The Feature Flag was not part of any matching campaign");
    }

    public static final String i() {
        return "Features flags have moved to disabled. Clearing feature flag data.";
    }

    public static final String j() {
        return "Added new Feature Flags to local storage.";
    }

    public final void c(final String id) {
        Set<String> keySet;
        Intrinsics.checkNotNullParameter(id, "id");
        final FeatureFlag featureFlag = (FeatureFlag) CollectionsKt.firstOrNull(e(id));
        if ((featureFlag != null ? featureFlag.getTrackingString() : null) != null) {
            String id2 = featureFlag.getId();
            Intrinsics.checkNotNullParameter(id2, "id");
            Map<String, ?> all = this.f12394i.getAll();
            if (!((all == null || (keySet = all.keySet()) == null) ? false : keySet.contains(id2))) {
                com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(featureFlag);
                if (a6 != null) {
                    this.f12389d.a(a6);
                }
                String id3 = featureFlag.getId();
                Intrinsics.checkNotNullParameter(id3, "id");
                this.f12394i.edit().putBoolean(id3, true).apply();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.a0.a(FeatureFlag.this);
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.d(id);
            }
        }, 6, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final ArrayList e(String str) {
        ?? r12;
        if (str != null) {
            List list = this.f12390e;
            r12 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), str)) {
                    r12.add(obj);
                }
            }
        } else {
            r12 = this.f12390e;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable) r12, 10));
        Iterator it = r12.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    public final void f() {
        if (this.f12395j.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.a0.a(com.braze.managers.a0.this);
                }
            }, 7, (Object) null);
            return;
        }
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        if (nowInSeconds - this.f12392g.getLong("last_refresh", 0L) >= this.f12388c.m()) {
            this.f12389d.w();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.a(com.braze.managers.a0.this, nowInSeconds);
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f12386a).b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
    }

    public final void g() {
        this.f12394i.edit().clear().apply();
    }

    public final void h() {
        ((com.braze.events.d) this.f12386a).c(com.braze.events.internal.r.class, new IEventSubscriber() { // from class: Z3.P
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.a0.a(com.braze.managers.a0.this, (com.braze.events.internal.r) obj);
            }
        });
        ((com.braze.events.d) this.f12386a).c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: Z3.Z
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.a0.a(com.braze.managers.a0.this, (com.braze.events.internal.q) obj);
            }
        });
        ((com.braze.events.d) this.f12386a).c(com.braze.events.internal.k.class, new IEventSubscriber() { // from class: Z3.a0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.a0.a(com.braze.managers.a0.this, (com.braze.events.internal.k) obj);
            }
        });
        ((com.braze.events.d) this.f12386a).c(com.braze.events.internal.j.class, new IEventSubscriber() { // from class: Z3.b0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.a0.a(com.braze.managers.a0.this, (com.braze.events.internal.j) obj);
            }
        });
        ((com.braze.events.d) this.f12386a).c(com.braze.events.internal.d.class, new IEventSubscriber() { // from class: Z3.c0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.a0.a(com.braze.managers.a0.this, (com.braze.events.internal.d) obj);
            }
        });
    }

    public final void k() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.S
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.a(nowInSeconds);
            }
        }, 6, (Object) null);
        this.f12392g.edit().putLong("last_refresh", nowInSeconds).apply();
    }

    public static final String b(FeatureFlag featureFlag) {
        return "Error storing Feature Flag: " + featureFlag + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final String d() {
        return "Did not find stored Feature Flags.";
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray featureFlagsJson) {
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsData");
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, featureFlagsJson.length())), new com.braze.support.g(featureFlagsJson)), new com.braze.support.h(featureFlagsJson)).iterator();
        while (it.hasNext()) {
            FeatureFlag a6 = com.braze.support.i.f12996a.a((JSONObject) it.next());
            if (a6 != null) {
                arrayList.add(a6);
            }
        }
        this.f12390e = arrayList;
        SharedPreferences.Editor edit = this.f12393h.edit();
        edit.clear();
        for (final FeatureFlag featureFlag : this.f12390e) {
            try {
                edit.putString(featureFlag.getId(), featureFlag.getKey().toString());
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.X
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.a0.b(FeatureFlag.this);
                    }
                }, 4, (Object) null);
            }
        }
        edit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.j();
            }
        }, 7, (Object) null);
        List list = this.f12390e;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public static final String e() {
        return "Failed to find stored Feature Flag keys.";
    }

    public final void c() {
        SharedPreferences sharedPreferences = this.f12393h;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> keySet = all.keySet();
            if (keySet.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.a0.e();
                    }
                }, 6, (Object) null);
                this.f12390e = CollectionsKt.emptyList();
                return;
            }
            for (final String str : keySet) {
                final String str2 = (String) all.get(str);
                if (str2 != null) {
                    try {
                    } catch (Exception e6) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.managers.a0.b(str2);
                            }
                        }, 4, (Object) null);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (!StringsKt.isBlank(str2)) {
                        FeatureFlag a6 = com.braze.support.i.f12996a.a(new JSONObject(str2));
                        if (a6 != null) {
                            arrayList.add(a6);
                        }
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: Z3.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.a0.a(str);
                    }
                }, 6, (Object) null);
            }
            this.f12390e = arrayList;
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.d();
            }
        }, 7, (Object) null);
        this.f12390e = CollectionsKt.emptyList();
    }

    public static final void a(a0 a0Var, com.braze.events.internal.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.f12262a.f12699m || it.f12263b.f12699m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.W
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.i();
            }
        }, 7, (Object) null);
        a0Var.a();
    }

    public static final void a(a0 a0Var, com.braze.events.internal.r it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f12296a instanceof com.braze.requests.i) {
            a0Var.f12395j.incrementAndGet();
        }
    }

    public static final void a(a0 a0Var, com.braze.events.internal.q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f12295a instanceof com.braze.requests.i) {
            a0Var.f12395j.decrementAndGet();
        }
    }

    public static final void a(a0 a0Var, com.braze.events.internal.k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a0Var.f12391f.set(true);
        a0Var.k();
    }

    public static final void a(a0 a0Var, com.braze.events.internal.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a0Var.f12391f.set(true);
        if (a0Var.f12391f.get()) {
            List list = a0Var.f12390e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) a0Var.f12387b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public static final String a(a0 a0Var) {
        return "Not refreshing Feature Flags since another " + a0Var.f12395j.get() + " request is currently in-flight.";
    }

    public static final String a(a0 a0Var, long j6) {
        return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((a0Var.f12392g.getLong("last_refresh", 0L) - j6) + a0Var.f12388c.m()) + " seconds remaining until next available flush.";
    }

    public static final String a(FeatureFlag featureFlag) {
        return "Not logging a Feature Flag impression for Feature Flag with id " + featureFlag.getId() + ". The Feature Flag already had an impression logged in the current session";
    }

    public static final String a(long j6) {
        return "Updating last Feature Flags refresh time: " + j6;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.a0.b();
            }
        }, 7, (Object) null);
        this.f12393h.edit().clear().apply();
        this.f12390e = CollectionsKt.emptyList();
        if (this.f12391f.get()) {
            List list = this.f12390e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) this.f12387b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
