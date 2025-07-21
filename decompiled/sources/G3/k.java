package G3;

import ga.G;
import ga.J;
import ga.L;
import ga.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements H3.i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1875e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final D3.b f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.b f1877b;

    /* renamed from: c, reason: collision with root package name */
    public final J f1878c;

    /* renamed from: d, reason: collision with root package name */
    public final G f1879d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f1880j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1881k;

        /* renamed from: l, reason: collision with root package name */
        public Object f1882l;

        /* renamed from: m, reason: collision with root package name */
        public int f1883m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f1885o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, Continuation continuation) {
            super(2, continuation);
            this.f1885o = list;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f1885o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005a -> B:5:0x005d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f1883m
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f1882l
                C3.a r1 = (C3.a) r1
                java.lang.Object r3 = r7.f1881k
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.f1880j
                G3.k r4 = (G3.k) r4
                kotlin.ResultKt.throwOnFailure(r8)
                goto L5d
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                kotlin.ResultKt.throwOnFailure(r8)
                G3.k r8 = G3.k.this
                D3.b r8 = G3.k.h(r8)
                java.util.concurrent.atomic.AtomicInteger r8 = r8.q()
                r8.incrementAndGet()
                java.util.List r8 = r7.f1885o
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                G3.k r1 = G3.k.this
                java.util.Iterator r8 = r8.iterator()
                r3 = r8
                r4 = r1
            L3f:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L65
                java.lang.Object r8 = r3.next()
                r1 = r8
                C3.a r1 = (C3.a) r1
                r7.f1880j = r4
                r7.f1881k = r3
                r7.f1882l = r1
                r7.f1883m = r2
                r5 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r8 = ga.U.a(r5, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                D3.b r8 = G3.k.h(r4)
                r8.s(r1)
                goto L3f
            L65:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1886j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f1887k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f1888l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, k kVar, Continuation continuation) {
            super(2, continuation);
            this.f1887k = list;
            this.f1888l = kVar;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f1887k, this.f1888l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f1886j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f1886j = 1;
                if (U.a(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = this.f1887k;
            k kVar = this.f1888l;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.f1876a.s((C3.a) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1889j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f1890k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f1891l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, k kVar, Continuation continuation) {
            super(2, continuation);
            this.f1890k = list;
            this.f1891l = kVar;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f1890k, this.f1891l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f1889j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f1889j = 1;
                if (U.a(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = this.f1890k;
            k kVar = this.f1891l;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.f1876a.s((C3.a) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    public k(D3.b eventPipeline, B3.b configuration, J scope, G storageDispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        this.f1876a = eventPipeline;
        this.f1877b = configuration;
        this.f1878c = scope;
        this.f1879d = storageDispatcher;
    }

    private final void i(List list, int i6, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3.a aVar = (C3.a) it.next();
            Function3 c6 = this.f1877b.c();
            if (c6 != null) {
                c6.invoke(aVar, Integer.valueOf(i6), str);
            }
            Function3 f6 = aVar.f();
            if (f6 != null) {
                f6.invoke(aVar, Integer.valueOf(i6), str);
            }
        }
    }

    @Override // H3.i
    public void a(H3.k timeoutResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(timeoutResponse, "timeoutResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ga.i.d(this.f1878c, this.f1879d, (L) null, new c((List) events, this, null), 2, (Object) null);
    }

    @Override // H3.i
    public boolean b(H3.c badRequestResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(badRequestResponse, "badRequestResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        List list = (List) events;
        int i6 = 0;
        if (badRequestResponse.e()) {
            i(list, H3.g.f2213c.c(), badRequestResponse.b());
            return false;
        }
        Set c6 = badRequestResponse.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C3.a aVar = (C3.a) obj;
            if (c6.contains(Integer.valueOf(i6)) || badRequestResponse.d(aVar)) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
            i6 = i7;
        }
        i(arrayList, H3.g.f2213c.c(), badRequestResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f1876a.s((C3.a) it.next());
        }
        return arrayList.isEmpty();
    }

    @Override // H3.i
    public void d(H3.l tooManyRequestsResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(tooManyRequestsResponse, "tooManyRequestsResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        for (Object obj : (List) events) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C3.a aVar = (C3.a) obj;
            if (tooManyRequestsResponse.d(aVar)) {
                arrayList.add(aVar);
            } else if (tooManyRequestsResponse.c().contains(Integer.valueOf(i6))) {
                arrayList3.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
            i6 = i7;
        }
        i(arrayList, H3.g.f2216f.c(), tooManyRequestsResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f1876a.s((C3.a) it.next());
        }
        ga.i.d(this.f1878c, this.f1879d, (L) null, new d(arrayList3, this, null), 2, (Object) null);
    }

    @Override // H3.i
    public void e(H3.j successResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(successResponse, "successResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        i((List) events, H3.g.f2212b.c(), "Event sent success.");
    }

    @Override // H3.i
    public void f(H3.d failedResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(failedResponse, "failedResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3.a aVar : (List) events) {
            if (aVar.e() >= this.f1877b.e()) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        i(arrayList, H3.g.f2217g.c(), failedResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f1876a.s((C3.a) it.next());
        }
    }

    @Override // H3.i
    public void g(H3.h payloadTooLargeResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(payloadTooLargeResponse, "payloadTooLargeResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        List list = (List) events;
        if (list.size() == 1) {
            i(list, H3.g.f2215e.c(), payloadTooLargeResponse.b());
        } else {
            ga.i.d(this.f1878c, this.f1879d, (L) null, new b(list, null), 2, (Object) null);
        }
    }
}
