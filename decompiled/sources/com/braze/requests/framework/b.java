package com.braze.requests.framework;

import com.braze.requests.m;
import com.braze.requests.n;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f12773j = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* renamed from: a, reason: collision with root package name */
    public final m f12774a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.dispatch.h f12775b;

    /* renamed from: c, reason: collision with root package name */
    public long f12776c;

    /* renamed from: d, reason: collision with root package name */
    public long f12777d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12778e;

    /* renamed from: f, reason: collision with root package name */
    public long f12779f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12780g;

    /* renamed from: h, reason: collision with root package name */
    public final com.braze.requests.util.b f12781h;

    /* renamed from: i, reason: collision with root package name */
    public com.braze.requests.util.d f12782i;

    public b(m destination, com.braze.dispatch.h dispatchDataProvider) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f12774a = destination;
        this.f12775b = dispatchDataProvider;
        this.f12778e = new ArrayList();
        int ordinal = destination.ordinal();
        this.f12780g = ordinal != 0 ? ordinal != 2 ? 0L : 75L : 25L;
        this.f12781h = new com.braze.requests.util.b(dispatchDataProvider.f12162a.f12548m.j(), dispatchDataProvider.f12162a.f12548m.k(), dispatchDataProvider.f12162a.f12548m.l());
    }

    public static final String d(b bVar, long j6) {
        return "New state after request success\n" + bVar.d(j6);
    }

    public abstract void a(long j6);

    public final void a(final long j6, n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.a(this.f12775b.f12162a.f12547l);
        this.f12778e.add(new h(request, j6 + this.f12780g, j6));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.b.a(com.braze.requests.framework.b.this, j6);
            }
        }, 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.braze.requests.util.d b() {
        /*
            r8 = this;
            com.braze.dispatch.h r0 = r8.f12775b
            com.braze.managers.u0 r0 = r0.f12162a
            com.braze.storage.e0 r0 = r0.f12548m
            java.util.concurrent.locks.ReentrantLock r1 = r0.f12910c
            r1.lock()
            com.braze.models.response.m r2 = r0.f12912e     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            java.util.Map r2 = r2.f12684E     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L1a
            goto L16
        L14:
            r0 = move-exception
            goto L83
        L16:
            java.util.LinkedHashMap r2 = r0.w()     // Catch: java.lang.Throwable -> L14
        L1a:
            r1.unlock()
            com.braze.requests.m r0 = r8.f12774a
            java.lang.Object r0 = r2.get(r0)
            com.braze.models.response.j r0 = (com.braze.models.response.j) r0
            if (r0 != 0) goto L2b
            r0 = 0
            r8.f12782i = r0
            return r0
        L2b:
            com.braze.requests.util.d r1 = r8.f12782i
            int r2 = r0.f12677b
            int r0 = r0.f12676a
            if (r1 != 0) goto L7d
            com.braze.requests.util.d r1 = new com.braze.requests.util.d
            com.braze.dispatch.h r3 = r8.f12775b
            com.braze.requests.m r4 = r8.f12774a
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "dispatchDataProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "filePrefix"
            java.lang.String r6 = "com.braze.endpointqueue.tokenbucket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = "specificName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            com.braze.managers.u0 r3 = r3.f12162a
            android.content.Context r5 = r3.f12536a
            java.lang.String r6 = r3.f12542g
            java.lang.String r3 = r3.f12543h
            java.lang.String r3 = com.braze.support.StringUtils.getCacheFileSuffix(r5, r6, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "com.braze.endpointqueue.tokenbucket."
            r6.<init>(r7)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4 = 0
            android.content.SharedPreferences r3 = r5.getSharedPreferences(r3, r4)
            java.lang.String r4 = "getSharedPreferences(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r1.<init>(r0, r2, r3)
            goto L80
        L7d:
            r1.a(r0, r2)
        L80:
            r8.f12782i = r1
            return r1
        L83:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.requests.framework.b.b():com.braze.requests.util.d");
    }

    public boolean c() {
        return false;
    }

    public final void c(long j6) {
        ArrayList arrayList = this.f12778e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((h) next).f12808d.a()) {
                arrayList2.add(next);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new a());
        if (sortedWith.size() >= 2) {
            int size = sortedWith.size();
            for (int i6 = 1; i6 < size; i6++) {
                final h hVar = (h) sortedWith.get(i6);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12773j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.requests.framework.b.a(com.braze.requests.framework.h.this);
                    }
                }, 6, (Object) null);
                hVar.a(j6, i.f12816d);
            }
        }
    }

    public final String d(final long j6) {
        String str;
        String joinToString$default = CollectionsKt.joinToString$default(this.f12778e, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: l4.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.braze.requests.framework.b.b(j6, (com.braze.requests.framework.h) obj);
            }
        }, 30, (Object) null);
        StringBuilder sb = new StringBuilder("\n            |EndpointQueue: ");
        sb.append(this.f12774a);
        sb.append("\n            |   lastFailureAt = ");
        sb.append(this.f12776c - j6);
        sb.append("\n            |   lastSuccessAt = ");
        sb.append(this.f12777d - j6);
        sb.append("\n            |   failureBackoffUntil = ");
        sb.append(this.f12779f - j6);
        sb.append("\n            |   pendingWaitDuration = ");
        sb.append(this.f12780g);
        sb.append("\n            |   endpointRateLimiter = ");
        com.braze.requests.util.d dVar = this.f12782i;
        if (dVar == null || (str = dVar.toString()) == null) {
            str = "unset";
        }
        sb.append(str);
        sb.append("\n            |   requestInfoQueue: \n            |");
        sb.append(joinToString$default);
        sb.append("\n        ");
        return StringsKt.trimMargin$default(sb.toString(), (String) null, 1, (Object) null);
    }

    public com.braze.requests.util.b a() {
        return this.f12781h;
    }

    public static final String a(b bVar, long j6) {
        return "Added request now to queue " + bVar.d(j6);
    }

    public static final String a(h hVar, long j6, int i6) {
        return "Set retry count for " + hVar.a(j6) + " to " + i6;
    }

    public static final String a(h hVar, long j6) {
        return "Marking request as framework complete \n" + hVar.a(j6);
    }

    public final void a(final long j6, final h requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        final com.braze.requests.util.d b6 = b();
        if (b6 == null) {
            return;
        }
        b6.a();
        com.braze.requests.util.d b7 = b();
        if (b7 != null && b7.a(j6) < 1.0d) {
            final long b8 = b6.b();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.b.a(com.braze.requests.framework.h.this, j6, b8, b6);
                }
            }, 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: l4.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.b.b(com.braze.requests.framework.b.this, j6);
            }
        }, 7, (Object) null);
    }

    public static final String c(b bVar, long j6) {
        return "New state after request error " + bVar.d(j6);
    }

    public static final String a(h hVar, long j6, long j7, com.braze.requests.util.d dVar) {
        return "Delaying next request after '" + hVar.a(j6) + "' until next token is available in " + j7 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j6 + j7, null, null, 3, null) + "'\n" + dVar;
    }

    public static final String a(h hVar) {
        return "About to batch request " + hVar;
    }

    public void a(final long j6, h requestInfo, com.braze.models.response.a apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        com.braze.models.response.g gVar = apiResponse instanceof com.braze.models.response.g ? (com.braze.models.response.g) apiResponse : null;
        com.braze.models.response.d dVar = gVar != null ? gVar.f12656d : null;
        Long l6 = apiResponse.f12644b;
        long longValue = l6 != null ? l6.longValue() : 0L;
        this.f12776c = j6;
        if (!(dVar instanceof com.braze.models.response.h)) {
            com.braze.requests.util.b a6 = a();
            this.f12779f = longValue + j6 + a6.a(a6.f12867b);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12773j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.b.c(com.braze.requests.framework.b.this, j6);
            }
        }, 6, (Object) null);
    }

    public final void b(final long j6) {
        a(j6);
        ArrayList arrayList = this.f12778e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((h) next).f12808d == i.f12816d) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                final int i6 = ((h) it2.next()).f12812h;
                while (it2.hasNext()) {
                    int i7 = ((h) it2.next()).f12812h;
                    if (i6 < i7) {
                        i6 = i7;
                    }
                }
                ArrayList arrayList3 = this.f12778e;
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (((h) next2).f12808d.a()) {
                        arrayList4.add(next2);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    final h hVar = (h) it4.next();
                    hVar.f12812h = i6;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.requests.framework.b.a(com.braze.requests.framework.h.this, j6, i6);
                        }
                    }, 3, (Object) null);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.f12778e;
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            i iVar = ((h) next3).f12808d;
            if (iVar == i.f12816d || iVar == i.f12817e) {
                arrayList7.add(next3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.f12778e;
        ArrayList arrayList9 = new ArrayList();
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Object next4 = it6.next();
            h hVar2 = (h) next4;
            if (hVar2.f12812h >= 15 && hVar2.f12808d.a()) {
                arrayList9.add(next4);
            }
        }
        arrayList5.addAll(arrayList9);
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            final h hVar3 = (h) it7.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12773j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.framework.b.a(com.braze.requests.framework.h.this, j6);
                }
            }, 6, (Object) null);
            hVar3.f12805a.a((com.braze.events.e) this.f12775b.f12162a.f12547l);
        }
        this.f12778e.removeAll(arrayList5);
    }

    public void a(final long j6, h requestInfo, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        a().f12871f = 0;
        this.f12777d = j6;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12773j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: l4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.b.d(com.braze.requests.framework.b.this, j6);
            }
        }, 6, (Object) null);
    }

    public static final String b(b bVar, long j6) {
        return bVar.d(j6);
    }

    public static final CharSequence b(long j6, h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a(j6);
    }
}
