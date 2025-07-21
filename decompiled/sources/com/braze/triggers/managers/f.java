package com.braze.triggers.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.c0;
import com.braze.managers.m;
import com.braze.requests.n;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.triggers.events.h;
import com.braze.triggers.events.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: p, reason: collision with root package name */
    public static final long f13087p = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: q, reason: collision with root package name */
    public static final String f13088q = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13089a;

    /* renamed from: b, reason: collision with root package name */
    public final m f13090b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f13091c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f13092d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13093e;

    /* renamed from: f, reason: collision with root package name */
    public final SharedPreferences f13094f;

    /* renamed from: g, reason: collision with root package name */
    public final b f13095g;

    /* renamed from: h, reason: collision with root package name */
    public final g f13096h;

    /* renamed from: i, reason: collision with root package name */
    public final Queue f13097i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f13098j;

    /* renamed from: k, reason: collision with root package name */
    public long f13099k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f13100l;

    /* renamed from: m, reason: collision with root package name */
    public final ReentrantLock f13101m;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f13102n;

    /* renamed from: o, reason: collision with root package name */
    public final com.braze.requests.framework.g f13103o;

    public f(Context context, m brazeManager, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, BrazeConfigurationProvider configurationProvider, String str, String apiKey, com.braze.requests.framework.g requestFramework) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(requestFramework, "requestFramework");
        this.f13101m = new ReentrantLock();
        this.f13102n = new ReentrantLock();
        this.f13089a = context.getApplicationContext();
        this.f13090b = brazeManager;
        this.f13091c = internalEventPublisher;
        Intrinsics.checkNotNullParameter(externalEventPublisher, "<set-?>");
        this.f13092d = externalEventPublisher;
        this.f13093e = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        this.f13094f = com.braze.managers.c.a(context, str, apiKey, new StringBuilder("com.appboy.storage.triggers.actions"), 0);
        this.f13095g = new b(context, apiKey);
        this.f13096h = new g(context, str, apiKey);
        this.f13098j = g();
        this.f13097i = new ArrayDeque();
        this.f13103o = requestFramework;
        k();
    }

    public static final String a(String str) {
        return com.braze.a.a("Received null or blank serialized triggered action string for action id ", str, " from shared preferences. Not parsing.");
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Trigger manager received reenqueue with action with id: <"), ((com.braze.triggers.actions.g) aVar).f13020a, ">.");
    }

    public static final String d(com.braze.triggers.actions.a aVar) {
        return "Registering triggered action id " + ((com.braze.triggers.actions.g) aVar).f13020a + ' ';
    }

    public static final String e() {
        return "Test triggered actions found, triggering test event.";
    }

    public static final String f() {
        return "No test triggered actions found.";
    }

    public static final String g(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Trigger manager received failed triggered action with id: <"), ((com.braze.triggers.actions.g) aVar).f13020a, ">. Will attempt to perform fallback triggered actions, if present.");
    }

    public static final String h() {
        return "Encountered unexpected exception while parsing stored triggered actions.";
    }

    public static final String i() {
        return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
    }

    public static final String j() {
        return "Triggered action has no fallback action to perform. Doing nothing.";
    }

    public static final String l() {
        return "Subscribing to trigger dispatch events.";
    }

    public static final String m() {
        return "Executing pending events after trigger dispatch completed.";
    }

    public final void b(final long j6) {
        this.f13099k = this.f13100l;
        this.f13100l = j6;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.a(j6);
            }
        }, 7, (Object) null);
    }

    public final void k() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: t4.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.l();
            }
        }, 12, (Object) null);
        ((com.braze.events.d) this.f13091c).c(c0.class, new IEventSubscriber() { // from class: t4.E
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.triggers.managers.f.a(com.braze.triggers.managers.f.this, (com.braze.events.internal.c0) obj);
            }
        });
    }

    public static final String a(long j6) {
        return "TriggerManager lastDisplayTimeSeconds updated to " + j6;
    }

    public static final String e(com.braze.triggers.events.b bVar) {
        return "Failed to match triggered action for incoming <" + bVar.a() + ">.";
    }

    public static final String f(com.braze.triggers.actions.a aVar) {
        return "Fallback trigger has expired. Trigger id: " + ((com.braze.triggers.actions.g) aVar).f13020a;
    }

    public static final String e(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Retrieving templated triggered action id "), ((com.braze.triggers.actions.g) aVar).f13020a, " from local storage.");
    }

    public final void a(final List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        h hVar = new h();
        ReentrantLock reentrantLock = this.f13101m;
        reentrantLock.lock();
        try {
            this.f13098j.clear();
            SharedPreferences.Editor clear = this.f13094f.edit().clear();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.b(triggeredActions);
                }
            }, 14, (Object) null);
            Iterator it = triggeredActions.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.d(com.braze.triggers.actions.a.this);
                    }
                }, 14, (Object) null);
                this.f13098j.put(((com.braze.triggers.actions.g) aVar).f13020a, aVar);
                clear.putString(((com.braze.triggers.actions.g) aVar).f13020a, String.valueOf(aVar.getKey()));
                if (((com.braze.triggers.actions.g) aVar).b(hVar)) {
                    z6 = true;
                }
            }
            clear.apply();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.f13096h.a(triggeredActions);
            this.f13095g.a(triggeredActions);
            if (z6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: t4.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.e();
                    }
                }, 12, (Object) null);
                a((i) hVar);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.f();
                    }
                }, 14, (Object) null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(List list) {
        return "Registering " + list.size() + " new triggered actions.";
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "No action found for " + bVar.a() + " event, publishing NoMatchingTriggerEvent";
    }

    public static final String d() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public final LinkedHashMap g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.f13094f.getAll();
        if (all != null && !all.isEmpty()) {
            try {
                for (final String str : CollectionsKt.toSet(all.keySet())) {
                    String string = this.f13094f.getString(str, null);
                    if (string != null && !StringsKt.isBlank(string)) {
                        final com.braze.triggers.actions.h b6 = com.braze.triggers.utils.c.f13111a.b(new JSONObject(string), this.f13090b);
                        if (b6 != null) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.Y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return com.braze.triggers.managers.f.e(com.braze.triggers.actions.a.this);
                                }
                            }, 14, (Object) null);
                            linkedHashMap.put(b6.f13020a, b6);
                        }
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: t4.Z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.triggers.managers.f.a(str);
                            }
                        }, 12, (Object) null);
                    }
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: t4.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.h();
                    }
                }, 8, (Object) null);
            }
        }
        return linkedHashMap;
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public final void b(final com.braze.triggers.actions.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.c(com.braze.triggers.actions.a.this);
            }
        }, 14, (Object) null);
        b(this.f13099k);
        this.f13099k = 0L;
        this.f13096h.d(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.braze.triggers.actions.a, T, java.lang.Object, com.braze.triggers.actions.g] */
    public final com.braze.triggers.actions.a d(final com.braze.triggers.events.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantLock reentrantLock = this.f13101m;
        reentrantLock.lock();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f13098j.values().iterator();
            int i6 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                final ?? r32 = (com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next());
                if (r32.b(event) && this.f13096h.a((com.braze.triggers.actions.g) r32) && c.a(event, r32, this.f13100l, this.f13093e)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.triggers.managers.f.a(com.braze.triggers.actions.a.this);
                        }
                    }, 14, (Object) null);
                    int i7 = r32.f13021b.f13047c;
                    if (i7 > i6) {
                        objectRef.element = r32;
                        i6 = i7;
                    }
                    arrayList.add(r32);
                }
            }
            Object obj = objectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.e(com.braze.triggers.events.b.this);
                    }
                }, 14, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) objectRef.element)).f13023d = new com.braze.triggers.utils.b(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.a(com.braze.triggers.events.b.this, objectRef);
                }
            }, 14, (Object) null);
            com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) objectRef.element;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(com.braze.triggers.events.b bVar) {
        return "New incoming <" + bVar.a() + ">. Searching for matching triggers.";
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f13102n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.c();
                }
            }, 14, (Object) null);
            while (!((ArrayDeque) this.f13097i).isEmpty()) {
                com.braze.triggers.events.b bVar = (com.braze.triggers.events.b) ((ArrayDeque) this.f13097i).poll();
                if (bVar != null) {
                    a(bVar);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(i triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.f13102n;
        reentrantLock.lock();
        try {
            ((ArrayDeque) this.f13097i).add(triggerEvent);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.d();
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(com.braze.triggers.events.b triggerEvent, final com.braze.triggers.actions.a failedAction) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = f13088q;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.g(com.braze.triggers.actions.a.this);
            }
        }, 14, (Object) null);
        com.braze.triggers.utils.b bVar = ((com.braze.triggers.actions.g) failedAction).f13023d;
        if (bVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.i();
                }
            }, 14, (Object) null);
            return;
        }
        final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) bVar.f13110a.poll();
        if (aVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.j();
                }
            }, 14, (Object) null);
            return;
        }
        com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) aVar;
        gVar.f13023d = bVar;
        Map remoteAssetToLocalAssetPaths = this.f13095g.a(aVar);
        Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        ((com.braze.triggers.actions.h) aVar).f13025f = new HashMap(remoteAssetToLocalAssetPaths);
        long j6 = ((i) triggerEvent).f13070b;
        long j7 = gVar.f13021b.f13049e;
        long millis = TimeUnit.SECONDS.toMillis(r0.f13048d);
        long j8 = j7 != -1 ? j7 + j6 : j6 + millis + f13087p;
        if (j8 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.V
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.f(com.braze.triggers.actions.a.this);
                }
            }, 14, (Object) null);
            a(triggerEvent, aVar);
        } else {
            final long max = Math.max(0L, (millis + j6) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.W
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.f.a(com.braze.triggers.actions.a.this, max);
                }
            }, 14, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(max), null, new e(aVar, this, triggerEvent, j8, null), 2, null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j6) {
        return "Performing fallback triggered action with id: <" + ((com.braze.triggers.actions.g) aVar).f13020a + "> with a delay: " + j6 + " ms";
    }

    public static final void a(f fVar, c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) fVar, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: t4.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.m();
            }
        }, 6, (Object) null);
        fVar.b();
    }

    public final void a(final com.braze.triggers.events.b event) {
        Intrinsics.checkNotNullParameter(event, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, f13088q, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.b(com.braze.triggers.events.b.this);
            }
        }, 14, (Object) null);
        com.braze.triggers.actions.a action = d(event);
        if (action != null) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(action, "action");
            Map remoteAssetToLocalAssetPaths = this.f13095g.a(action);
            Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
            ((com.braze.triggers.actions.h) action).f13025f = new HashMap(remoteAssetToLocalAssetPaths);
            int i6 = ((com.braze.triggers.actions.g) action).f13021b.f13049e;
            long j6 = i6 != -1 ? ((i) event).f13070b + i6 : -1L;
            long millis = TimeUnit.SECONDS.toMillis(r0.f13048d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new d(action, this, event, j6, millis, null), 2, null);
            return;
        }
        String a6 = event.a();
        int hashCode = a6.hashCode();
        if (hashCode != 3417674) {
            if (hashCode != 717572172) {
                if (hashCode != 1743324417 || !a6.equals("purchase")) {
                    return;
                }
            } else if (!a6.equals("custom_event")) {
                return;
            }
        } else if (!a6.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.f.c(com.braze.triggers.events.b.this);
            }
        }, 7, (Object) null);
        com.braze.events.e eVar = this.f13092d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("externalEventMessenger");
            eVar = null;
        }
        String a7 = event.a();
        Intrinsics.checkNotNullExpressionValue(a7, "getTriggerEventType(...)");
        ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(a7), NoMatchingTriggerEvent.class);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Found potential triggered action for incoming trigger event. Action id " + ((com.braze.triggers.actions.g) aVar).f13020a + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final String a(com.braze.triggers.events.b bVar, Ref.ObjectRef objectRef) {
        String str;
        StringBuilder sb = new StringBuilder("\n     Found best triggered action for incoming trigger event ");
        com.braze.models.i iVar = ((i) bVar).f13071c;
        if (iVar != null) {
            str = JsonUtils.getPrettyPrintedString(((com.braze.models.outgoing.event.b) iVar).getKey());
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(".\n     Matched Action id: ");
        sb.append(((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) objectRef.element)).f13020a);
        sb.append(".\n                ");
        return StringsKt.trimIndent(sb.toString());
    }

    public final boolean a() {
        com.braze.requests.framework.b bVar = (com.braze.requests.framework.b) this.f13103o.f12796e.get(com.braze.requests.m.f12833f);
        if (bVar == null || !(bVar instanceof com.braze.requests.framework.queue.c)) {
            return false;
        }
        ArrayList arrayList = ((com.braze.requests.framework.queue.c) bVar).f12778e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.braze.requests.framework.h hVar = (com.braze.requests.framework.h) it.next();
            n nVar = hVar.f12805a;
            if ((nVar instanceof com.braze.requests.f) && ((com.braze.requests.f) nVar).f12765j.b() && hVar.f12808d == com.braze.requests.framework.i.f12815c) {
                return true;
            }
        }
        return false;
    }
}
