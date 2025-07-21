package com.braze.events;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.internal.g;
import com.braze.events.internal.q;
import com.braze.events.internal.r;
import com.braze.events.internal.u;
import com.braze.events.internal.v;
import com.braze.requests.n;
import com.braze.storage.a0;
import com.braze.support.BrazeLogger;
import ga.L;
import ga.i;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements e {

    /* renamed from: i, reason: collision with root package name */
    public static final b f12248i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final a0 f12249a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12250b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12251c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f12252d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f12253e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f12254f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f12255g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12256h;

    public d(a0 sdkEnablementProvider, boolean z6) {
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.f12249a = sdkEnablementProvider;
        this.f12250b = new ConcurrentHashMap();
        this.f12251c = new ConcurrentHashMap();
        this.f12252d = new ConcurrentHashMap();
        this.f12253e = new ReentrantLock();
        this.f12254f = new ReentrantLock();
        this.f12255g = new ReentrantLock();
        this.f12256h = !z6;
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.d.b();
            }
        }, 7, (Object) null);
        this.f12256h = true;
        ReentrantLock reentrantLock = this.f12255g;
        reentrantLock.lock();
        try {
            for (Class cls : this.f12252d.keySet()) {
                Intrinsics.checkNotNull(cls);
                a(cls);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f12254f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f12251c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean add = copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            reentrantLock.unlock();
            return add;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f12253e;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f12250b;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f12254f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f12251c.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(final Object obj, final Class eventClass) {
        n nVar;
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        boolean z6 = (obj instanceof u) || (obj instanceof v) || ((obj instanceof com.braze.events.internal.dispatchmanager.c) && (nVar = ((com.braze.events.internal.dispatchmanager.c) obj).f12274d) != null && ((com.braze.requests.b) nVar).e().f12875d) || (((obj instanceof r) && ((r) obj).f12296a.e().f12875d) || (((obj instanceof q) && ((q) obj).f12295a.e().f12875d) || ((obj instanceof g) && ((com.braze.requests.b) ((g) obj).f12279a).e().f12875d)));
        if (this.f12249a.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z6, new Function0() { // from class: W3.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.d.c(eventClass, obj);
                }
            }, 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z6, new Function0() { // from class: W3.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.d.d(eventClass);
                }
            }, 3, (Object) null);
            return;
        }
        if (!this.f12256h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z6, new Function0() { // from class: W3.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.d.a(eventClass, obj);
                }
            }, 3, (Object) null);
            a(obj, eventClass);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z6, new Function0() { // from class: W3.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.events.d.b(eventClass, obj);
            }
        }, 3, (Object) null);
        b bVar = f12248i;
        HashSet a6 = b.a(this.f12250b, eventClass, this.f12253e);
        Iterator it = bVar.a(eventClass, a6).iterator();
        while (it.hasNext()) {
            i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new c((IEventSubscriber) it.next(), obj, null), 3, (Object) null);
        }
        b bVar2 = f12248i;
        HashSet a7 = b.a(this.f12251c, eventClass, this.f12254f);
        Iterator it2 = bVar2.a(eventClass, a7).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (a7.isEmpty() && a6.isEmpty()) {
            if (Intrinsics.areEqual(eventClass, NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.f12982I, (Throwable) null, z6, new Function0() { // from class: W3.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.events.d.a(eventClass, this);
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.f12982I, (Throwable) null, z6, new Function0() { // from class: W3.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.events.d.b(eventClass, this);
                    }
                }, 2, (Object) null);
                a(obj, eventClass);
            }
        }
    }

    public static final String c(Class cls, Object obj) {
        return "SDK is disabled. Not publishing event class: " + cls.getName() + " and message: " + obj;
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class ".concat(cls.getName());
    }

    public final boolean a(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f12253e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f12250b.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f12253e;
        reentrantLock.lock();
        try {
            this.f12250b.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f12254f;
            reentrantLock2.lock();
            try {
                this.f12251c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String c(Class cls) {
        return "Publishing cached event for class: " + cls;
    }

    public static final String a(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + ' ' + dVar;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.f12255g;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            if (this.f12252d.containsKey(cls)) {
                List list = (List) this.f12252d.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    this.f12252d.put(cls, CollectionsKt.mutableListOf(new Object[]{obj}));
                }
            } else {
                this.f12252d.put(cls, CollectionsKt.mutableListOf(new Object[]{obj}));
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(final Class cls) {
        if (!this.f12256h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: W3.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.d.b(cls);
                }
            }, 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.f12255g;
        reentrantLock.lock();
        try {
            if (this.f12252d.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: W3.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.events.d.c(cls);
                    }
                }, 6, (Object) null);
                Object remove = this.f12252d.remove(cls);
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlin.collections.List<T of com.braze.events.EventMessenger.attemptPublishFromCache>");
                Iterator it = ((List) remove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + dVar;
    }

    public static final String b(Class cls) {
        return "Not publishing cached event for class: " + cls + " because events are not allowed to send yet.";
    }
}
