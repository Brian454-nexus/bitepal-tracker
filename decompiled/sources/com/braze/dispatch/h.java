package com.braze.dispatch;

import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IEventSubscriber;
import com.braze.managers.d0;
import com.braze.managers.t;
import com.braze.managers.u;
import com.braze.managers.u0;
import com.braze.models.i;
import com.braze.models.o;
import com.braze.models.outgoing.l;
import com.braze.requests.n;
import com.braze.requests.q;
import com.braze.storage.h0;
import com.braze.storage.p;
import com.braze.storage.r;
import com.braze.support.BrazeLogger;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final g f12161d = new g();

    /* renamed from: a, reason: collision with root package name */
    public final u0 f12162a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12163b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12164c;

    public h(u0 udm) {
        Intrinsics.checkNotNullParameter(udm, "udm");
        this.f12162a = udm;
        this.f12163b = new ConcurrentHashMap();
        this.f12164c = new ConcurrentHashMap();
        udm.f12547l.c(com.braze.events.internal.dispatchmanager.c.class, new IEventSubscriber() { // from class: U3.u
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.dispatch.h.a(com.braze.dispatch.h.this, (com.braze.events.internal.dispatchmanager.c) obj);
            }
        });
    }

    public static final void a(h hVar, com.braze.events.internal.dispatchmanager.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<destruct>");
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f12271a;
        List<i> events = cVar.f12272b;
        o oVar = cVar.f12273c;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (i iVar : events) {
                hVar.f12164c.putIfAbsent(((com.braze.models.outgoing.event.b) iVar).f12610d, iVar);
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            hVar.a(oVar);
        } else {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (i iVar2 : events) {
                hVar.f12163b.putIfAbsent(((com.braze.models.outgoing.event.b) iVar2).f12610d, iVar2);
            }
        }
    }

    public static final String b() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(r4, (java.lang.Object) r12, com.braze.support.BrazeLogger.Priority.f12982I, (java.lang.Throwable) null, false, new U3.z(), 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.braze.models.b e() {
        /*
            r12 = this;
            monitor-enter(r12)
            j$.util.concurrent.ConcurrentHashMap r0 = r12.f12163b     // Catch: java.lang.Throwable -> L56
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L56
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L56
            r1.<init>()     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L56
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "next(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L56
            com.braze.models.i r3 = (com.braze.models.i) r3     // Catch: java.lang.Throwable -> L56
            r1.add(r3)     // Catch: java.lang.Throwable -> L56
            r0.remove(r3)     // Catch: java.lang.Throwable -> L56
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L56
            U3.y r9 = new U3.y     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L54
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L56
            r5 = 32
            if (r3 < r5) goto L59
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f12982I     // Catch: java.lang.Throwable -> L56
            U3.z r9 = new U3.z     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L54
            goto L5c
        L54:
            r0 = move-exception
            goto L63
        L56:
            r0 = move-exception
            r5 = r12
            goto L63
        L59:
            r5 = r12
            goto L15
        L5b:
            r5 = r12
        L5c:
            com.braze.models.b r0 = new com.braze.models.b     // Catch: java.lang.Throwable -> L54
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r12)
            return r0
        L63:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L54
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.dispatch.h.e():com.braze.models.b");
    }

    public final void a(com.braze.requests.f dataSyncRequest) {
        Intrinsics.checkNotNullParameter(dataSyncRequest, "dataSyncRequest");
        u0 u0Var = this.f12162a;
        dataSyncRequest.f12770o = ((t) u0Var.f12540e).f12523c;
        dataSyncRequest.f12766k = u0Var.f12537b.getSdkFlavor();
        dataSyncRequest.f12771p = ((t) this.f12162a.f12540e).c();
        u0 u0Var2 = this.f12162a;
        d0 d0Var = u0Var2.f12540e;
        r deviceCache = u0Var2.f12546k;
        String str = null;
        if (deviceCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            deviceCache = null;
        }
        t tVar = (t) d0Var;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        deviceCache.f12952e = tVar.b();
        com.braze.models.outgoing.h hVar = (com.braze.models.outgoing.h) deviceCache.a();
        dataSyncRequest.f12747h = hVar;
        if (hVar != null && hVar.f12630m) {
            if (this.f12162a.f12537b.getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: U3.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.dispatch.h.c();
                    }
                }, 6, (Object) null);
                h0 a6 = this.f12162a.a();
                NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                synchronized (a6) {
                    if (notificationSubscriptionType != null) {
                        try {
                            str = notificationSubscriptionType.getKey();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    a6.c("push_subscribe", str);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: U3.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.dispatch.h.b();
                    }
                }, 6, (Object) null);
            }
        }
        if (hVar != null && hVar.getKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
            this.f12162a.a().j();
        }
        dataSyncRequest.f12767l = (l) this.f12162a.a().a();
        com.braze.models.b e6 = e();
        dataSyncRequest.f12768m = e6;
        LinkedHashSet linkedHashSet = e6.f12572a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((com.braze.models.outgoing.event.b) ((i) it.next())).f12607a == com.braze.enums.e.f12169B) {
                u0 u0Var3 = this.f12162a;
                dataSyncRequest.f12769n = u0Var3.f12557v.b(u0Var3.f12537b.getSdkMetadata());
                return;
            }
        }
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder("Event dispatched: ");
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) iVar;
        sb.append(bVar.getKey());
        sb.append(" with uid: ");
        sb.append(bVar.f12610d);
        return sb.toString();
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(o oVar) {
        if (oVar != null) {
            ConcurrentHashMap concurrentHashMap = this.f12164c;
            if (!concurrentHashMap.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: U3.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.dispatch.h.d();
                    }
                }, 7, (Object) null);
                Collection values = concurrentHashMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    ((com.braze.models.outgoing.event.b) ((i) it.next())).a(oVar);
                }
                this.f12163b.putAll(concurrentHashMap);
                Set keySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    this.f12164c.remove((String) it2.next());
                }
            }
        }
    }

    public final n a(n brazeRequest) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        g gVar = f12161d;
        u0 u0Var = this.f12162a;
        gVar.a(u0Var.f12537b, u0Var.f12555t, brazeRequest, ((u) u0Var.f12538c).a());
        if (brazeRequest instanceof com.braze.requests.f) {
            a((com.braze.requests.f) brazeRequest);
            return brazeRequest;
        }
        if (brazeRequest instanceof q) {
            ((q) brazeRequest).f12747h = ((t) this.f12162a.f12540e).b();
            return brazeRequest;
        }
        if (brazeRequest instanceof com.braze.requests.e) {
            p pVar = this.f12162a.f12532C;
            com.braze.requests.e eVar = (com.braze.requests.e) brazeRequest;
            eVar.f12761j = pVar.f12939c;
            eVar.f12762k = pVar.f12940d;
        }
        return brazeRequest;
    }
}
