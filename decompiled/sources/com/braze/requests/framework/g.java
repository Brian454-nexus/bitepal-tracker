package com.braze.requests.framework;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.o;
import com.braze.managers.u0;
import com.braze.models.outgoing.k;
import com.braze.requests.m;
import com.braze.requests.n;
import com.braze.requests.p;
import com.braze.requests.u;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import ga.L;
import ga.Q;
import ga.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static final String f12789n = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* renamed from: o, reason: collision with root package name */
    public static final long f12790o = TimeUnit.HOURS.toMillis(1);

    /* renamed from: p, reason: collision with root package name */
    public static final long f12791p = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.dispatch.h f12792a;

    /* renamed from: b, reason: collision with root package name */
    public final u f12793b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12794c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12795d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f12796e;

    /* renamed from: f, reason: collision with root package name */
    public Q f12797f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f12798g;

    /* renamed from: h, reason: collision with root package name */
    public String f12799h;

    /* renamed from: i, reason: collision with root package name */
    public long f12800i;

    /* renamed from: j, reason: collision with root package name */
    public long f12801j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f12802k;

    /* renamed from: l, reason: collision with root package name */
    public final com.braze.requests.util.d f12803l;

    /* renamed from: m, reason: collision with root package name */
    public com.braze.enums.f f12804m;

    public g(com.braze.dispatch.h dispatchDataProvider, u requestExecutor, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        this.f12792a = dispatchDataProvider;
        this.f12793b = requestExecutor;
        this.f12794c = z6;
        this.f12795d = z7;
        this.f12796e = new LinkedHashMap();
        this.f12798g = new ReentrantLock();
        this.f12800i = -1L;
        this.f12801j = -1L;
        this.f12802k = new AtomicInteger(0);
        int n6 = dispatchDataProvider.f12162a.f12548m.n();
        int o6 = dispatchDataProvider.f12162a.f12548m.o();
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter("com.braze.requestframework.tokenbucket", "filePrefix");
        Intrinsics.checkNotNullParameter("", "specificName");
        u0 u0Var = dispatchDataProvider.f12162a;
        Context context = u0Var.f12536a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.requestframework.tokenbucket." + StringUtils.getCacheFileSuffix(context, u0Var.f12542g, u0Var.f12543h), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12803l = new com.braze.requests.util.d(n6, o6, sharedPreferences);
        this.f12804m = com.braze.enums.f.f12209c;
        dispatchDataProvider.f12162a.f12547l.c(com.braze.events.internal.dispatchmanager.c.class, new IEventSubscriber() { // from class: l4.x
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.requests.framework.g.a(com.braze.requests.framework.g.this, (com.braze.events.internal.dispatchmanager.c) obj);
            }
        });
        dispatchDataProvider.f12162a.f12547l.c(o.class, new IEventSubscriber() { // from class: l4.y
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.requests.framework.g.a(com.braze.requests.framework.g.this, (com.braze.events.internal.o) obj);
            }
        });
    }

    public static final void a(g gVar, com.braze.events.internal.dispatchmanager.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<destruct>");
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f12271a;
        n nVar = cVar.f12274d;
        ReentrantLock reentrantLock = gVar.f12798g;
        reentrantLock.lock();
        try {
            if (bVar == com.braze.events.internal.dispatchmanager.b.f12268d && nVar != null) {
                gVar.a(nVar);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final String c() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String d() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String f() {
        return "Got call to shutdown request framework";
    }

    public static final String h() {
        return "Kicking off request framework.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12789n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.f();
            }
        }, 14, (Object) null);
        Q q6 = this.f12797f;
        if (q6 != null) {
            u0.a.b(q6, (CancellationException) null, 1, (Object) null);
        }
        com.braze.managers.u0 u0Var = this.f12792a.f12162a;
        com.braze.requests.f fVar = new com.braze.requests.f(u0Var.f12548m, u0Var.f12537b.getBaseUrlForRequests(), new k(null, null, null, null));
        this.f12792a.a((n) fVar);
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(nowInMillisecondsSystemClock, fVar, new h(fVar, nowInMillisecondsSystemClock, nowInMillisecondsSystemClock), new f(), false);
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.h();
            }
        }, 7, (Object) null);
        a();
    }

    public static final String b(long j6, h hVar) {
        return "Running at " + j6 + " for request " + hVar.a(j6);
    }

    public static final String b(g gVar, long j6) {
        return gVar.b(j6);
    }

    public final String b(final long j6) {
        LinkedHashMap linkedHashMap = this.f12796e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b) ((Map.Entry) it.next()).getValue());
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: l4.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.braze.requests.framework.g.b(j6, (com.braze.requests.framework.b) obj);
            }
        }, 30, (Object) null);
        StringBuilder sb = new StringBuilder("RequestFramework->\n            |mockAllNetworkRequests=");
        sb.append(this.f12794c);
        sb.append("\n            |lastSdkAuthFailedToken=");
        sb.append(this.f12799h);
        sb.append("\n            |lastSdkAuthFailureAt=");
        sb.append(this.f12800i - j6);
        sb.append("\n            |sdkAuthFailureBackoffUntil=");
        sb.append(this.f12801j - j6);
        sb.append("\n            |invalidApiKeyErrorCounter=");
        sb.append(this.f12802k.get());
        sb.append("\n            |globalRequestRateLimiter=");
        sb.append(this.f12803l);
        sb.append("\n            |lastNetworkLevel=");
        sb.append(this.f12804m);
        sb.append("\n            |currentSdkAuthToken=");
        sb.append(this.f12792a.f12162a.f12555t.f12979d.getString("auth_signature", null));
        sb.append("\n            |endpointQueues=\n            | \n            |");
        return StringsKt.trimMargin$default(com.braze.c.a(sb, joinToString$default, "\n            |  \n            |\n        "), (String) null, 1, (Object) null);
    }

    public final void a(long j6, b queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        if (j6 <= queue.f12779f) {
            return;
        }
        queue.b(j6);
        ArrayList arrayList = queue.f12778e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            h hVar = (h) next;
            if (hVar.f12808d.a() && j6 >= hVar.f12806b) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a(j6, queue, (h) it2.next());
        }
    }

    public static final void a(g gVar, final o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12789n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.a(com.braze.events.internal.o.this);
            }
        }, 14, (Object) null);
        gVar.f12804m = it.f12293b;
    }

    public static final String a(o oVar) {
        return "Got network change event: " + oVar;
    }

    public static void a(g gVar) {
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = gVar.f12798g;
        reentrantLock.lock();
        try {
            if ((!gVar.f12795d || gVar.f12804m != com.braze.enums.f.f12207a) && ((gVar.f12799h == null || nowInMillisecondsSystemClock >= gVar.f12801j || !Intrinsics.areEqual(gVar.f12792a.f12162a.f12555t.f12979d.getString("auth_signature", null), gVar.f12799h)) && gVar.a(nowInMillisecondsSystemClock))) {
                Iterator it = gVar.f12796e.entrySet().iterator();
                while (it.hasNext()) {
                    gVar.a(nowInMillisecondsSystemClock, (b) ((Map.Entry) it.next()).getValue());
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final CharSequence b(long j6, b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.d(j6);
    }

    public final void a() {
        Q q6 = this.f12797f;
        if (q6 == null || !q6.isActive()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: l4.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.g.b();
                }
            }, 6, (Object) null);
            Q b6 = ga.i.b(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, L.b, new d(this, null), 1, (Object) null);
            this.f12797f = b6;
            if (b6 != null) {
                b6.start();
            }
        }
    }

    public final void a(final long j6, b queue, final h requestInfo) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, queue.c(), new Function0() { // from class: l4.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.b(j6, requestInfo);
            }
        }, 3, (Object) null);
        if (!a(j6)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.g.c();
                }
            }, 7, (Object) null);
            return;
        }
        com.braze.requests.util.d b6 = queue.b();
        if (b6 == null || b6.a(j6) >= 1.0d) {
            n a6 = this.f12792a.a(requestInfo.f12805a);
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
            e eVar = new e(this, requestInfo, queue);
            requestInfo.a(j6, i.f12815c);
            com.braze.requests.util.d b7 = queue.b();
            requestInfo.f12810f = (b7 == null ? null : Integer.valueOf((int) b7.a(j6))) != null ? Integer.valueOf(RangesKt.coerceAtLeast(r0.intValue() - 1, 0)) : null;
            requestInfo.f12809e = RangesKt.coerceAtLeast(((int) this.f12803l.a(j6)) - 1, 0);
            if (a(j6, a6, requestInfo, eVar, false)) {
                return;
            }
            a(j6, requestInfo);
            queue.a(j6, requestInfo);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.d();
            }
        }, 7, (Object) null);
        com.braze.requests.util.d b8 = queue.b();
        requestInfo.f12806b = (b8 != null ? b8.b() : 0L) + j6;
    }

    public final boolean a(final long j6, n nVar, final h hVar, c cVar, boolean z6) {
        p pVar;
        final boolean z7 = nVar.a() || this.f12794c;
        if (z7) {
            pVar = this.f12792a.f12162a.f12533D;
        } else {
            pVar = this.f12793b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: l4.E
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.a(z7, hVar, j6);
            }
        }, 3, (Object) null);
        pVar.a(hVar, cVar, z6);
        return z7;
    }

    public static final String a(boolean z6, h hVar, long j6) {
        StringBuilder sb = new StringBuilder("Running on ");
        sb.append(z6 ? "no-op" : "network");
        sb.append(" executor for ");
        sb.append(hVar.a(j6));
        return sb.toString();
    }

    public final void a(n request) {
        b bVar;
        Intrinsics.checkNotNullParameter(request, "request");
        m c6 = request.c();
        if (!this.f12796e.containsKey(c6)) {
            int ordinal = c6.ordinal();
            if (ordinal == 0) {
                bVar = new com.braze.requests.framework.queue.a(this.f12792a);
            } else if (ordinal == 1) {
                bVar = new com.braze.requests.framework.queue.f(this.f12792a);
            } else if (ordinal == 2) {
                bVar = new com.braze.requests.framework.queue.c(this.f12792a);
            } else if (ordinal != 3) {
                switch (ordinal) {
                    case 9:
                        bVar = new com.braze.requests.framework.queue.g(this.f12792a);
                        break;
                    case 10:
                        bVar = new com.braze.requests.framework.queue.h(this.f12792a);
                        break;
                    case 11:
                        bVar = new com.braze.requests.framework.queue.e(this.f12792a);
                        break;
                    default:
                        bVar = new com.braze.requests.framework.queue.d(c6, this.f12792a);
                        break;
                }
            } else {
                bVar = new com.braze.requests.framework.queue.i(this.f12792a);
            }
            this.f12796e.put(c6, bVar);
        } else {
            bVar = (b) this.f12796e.get(c6);
        }
        if (bVar == null) {
            return;
        }
        final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        bVar.a(nowInMillisecondsSystemClock, request);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: l4.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.a(com.braze.requests.framework.g.this, nowInMillisecondsSystemClock);
            }
        }, 3, (Object) null);
        a();
    }

    public static final String a(g gVar, long j6) {
        return gVar.b(j6);
    }

    public final void a(final long j6, final h requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        this.f12803l.a();
        if (!a(j6)) {
            final long b6 = this.f12803l.b();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.g.a(com.braze.requests.framework.h.this, j6, b6, this);
                }
            }, 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: l4.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.b(com.braze.requests.framework.g.this, j6);
            }
        }, 3, (Object) null);
    }

    public static final String a(h hVar, long j6, long j7, g gVar) {
        return "Delaying next request after " + hVar.a(j6) + " until next token is available in " + j7 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j6 + j7, null, null, 3, null) + "'\n" + gVar.f12803l;
    }

    public final boolean a(long j6) {
        return !this.f12792a.f12162a.f12548m.J() || this.f12803l.a(j6) >= 1.0d;
    }
}
