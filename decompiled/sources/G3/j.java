package G3;

import ga.G;
import ga.J;
import ga.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements H3.i {

    /* renamed from: a, reason: collision with root package name */
    public final G3.h f1827a;

    /* renamed from: b, reason: collision with root package name */
    public final D3.b f1828b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.b f1829c;

    /* renamed from: d, reason: collision with root package name */
    public final J f1830d;

    /* renamed from: e, reason: collision with root package name */
    public final G f1831e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2355a f1832f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1833j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1835l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f1835l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f1835l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1833j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.i(this.f1835l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1836j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f1838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Continuation continuation) {
            super(2, continuation);
            this.f1838l = obj;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f1838l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1836j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.l((String) this.f1838l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1839j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1841l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f1842m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f1843n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List list, List list2, Continuation continuation) {
            super(2, continuation);
            this.f1841l = str;
            this.f1842m = list;
            this.f1843n = list2;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f1841l, this.f1842m, this.f1843n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1839j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC2355a interfaceC2355a = j.this.f1832f;
            if (interfaceC2355a != null) {
                interfaceC2355a.b("--> remove file: " + CollectionsKt.takeLast(StringsKt.split$default(this.f1841l, new String[]{"-"}, false, 0, 6, (Object) null), 2) + ", dropped events: " + this.f1842m.size() + ", retry events: " + this.f1843n.size());
            }
            j.this.f1827a.i(this.f1841l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1844j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f1846l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, Continuation continuation) {
            super(2, continuation);
            this.f1846l = obj;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f1846l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1844j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            G3.h hVar = j.this.f1827a;
            Object obj2 = this.f1846l;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            hVar.l((String) obj2);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1847j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1849l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.f1849l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f1849l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1847j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.i(this.f1849l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1850j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1852l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ JSONArray f1853m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, JSONArray jSONArray, Continuation continuation) {
            super(2, continuation);
            this.f1852l = str;
            this.f1853m = jSONArray;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f1852l, this.f1853m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1850j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.g(this.f1852l, this.f1853m);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1854j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1856l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation continuation) {
            super(2, continuation);
            this.f1856l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f1856l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1854j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.i(this.f1856l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1857j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f1859l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, Continuation continuation) {
            super(2, continuation);
            this.f1859l = obj;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f1859l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1857j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            G3.h hVar = j.this.f1827a;
            Object obj2 = this.f1859l;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            hVar.l((String) obj2);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1860j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f1862l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, Continuation continuation) {
            super(2, continuation);
            this.f1862l = obj;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f1862l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1860j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            G3.h hVar = j.this.f1827a;
            Object obj2 = this.f1862l;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            hVar.l((String) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: G3.j$j, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0037j extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1863j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0037j(String str, Continuation continuation) {
            super(2, continuation);
            this.f1865l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new C0037j(this.f1865l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1863j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.i(this.f1865l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1866j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MatchResult f1868l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MatchResult matchResult, Continuation continuation) {
            super(2, continuation);
            this.f1868l = matchResult;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f1868l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1866j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.this.f1827a.e((String) this.f1868l.getGroupValues().get(1));
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class l extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1869j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1871l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C3.a f1872m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f1873n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f1874o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, C3.a aVar, int i6, String str2, Continuation continuation) {
            super(2, continuation);
            this.f1871l = str;
            this.f1872m = aVar;
            this.f1873n = i6;
            this.f1874o = str2;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.f1871l, this.f1872m, this.f1873n, this.f1874o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1869j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function3 h6 = j.this.f1827a.h(this.f1871l);
            if (h6 != null) {
                C3.a aVar = this.f1872m;
                int i6 = this.f1873n;
                String str = this.f1874o;
                j jVar = j.this;
                String str2 = this.f1871l;
                h6.invoke(aVar, Boxing.boxInt(i6), str);
                jVar.f1827a.e(str2);
            }
            return Unit.INSTANCE;
        }
    }

    public j(G3.h storage, D3.b eventPipeline, B3.b configuration, J scope, G storageDispatcher, InterfaceC2355a interfaceC2355a) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        this.f1827a = storage;
        this.f1828b = eventPipeline;
        this.f1829c = configuration;
        this.f1830d = scope;
        this.f1831e = storageDispatcher;
        this.f1832f = interfaceC2355a;
    }

    @Override // H3.i
    public void a(H3.k timeoutResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(timeoutResponse, "timeoutResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        InterfaceC2355a interfaceC2355a = this.f1832f;
        if (interfaceC2355a != null) {
            interfaceC2355a.b("Handle response, status: " + timeoutResponse.a());
        }
        ga.i.d(this.f1830d, this.f1831e, (L) null, new h(events, null), 2, (Object) null);
    }

    @Override // H3.i
    public boolean b(H3.c badRequestResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(badRequestResponse, "badRequestResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        InterfaceC2355a interfaceC2355a = this.f1832f;
        if (interfaceC2355a != null) {
            interfaceC2355a.b("Handle response, status: " + badRequestResponse.a() + ", error: " + badRequestResponse.b());
        }
        String str = (String) events;
        List h6 = p.h(j(eventsString, str));
        if (badRequestResponse.e()) {
            l(h6, H3.g.f2213c.c(), badRequestResponse.b());
            ga.i.d(this.f1830d, this.f1831e, (L) null, new a(str, null), 2, (Object) null);
            return false;
        }
        Set c6 = badRequestResponse.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        for (Object obj : h6) {
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
        if (arrayList.isEmpty()) {
            ga.i.d(this.f1830d, this.f1831e, (L) null, new b(events, null), 2, (Object) null);
            return true;
        }
        l(arrayList, H3.g.f2213c.c(), badRequestResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f1828b.s((C3.a) it.next());
        }
        ga.i.d(this.f1830d, this.f1831e, (L) null, new c(str, arrayList, arrayList2, null), 2, (Object) null);
        return false;
    }

    @Override // H3.i
    public void d(H3.l tooManyRequestsResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(tooManyRequestsResponse, "tooManyRequestsResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        InterfaceC2355a interfaceC2355a = this.f1832f;
        if (interfaceC2355a != null) {
            interfaceC2355a.b("Handle response, status: " + tooManyRequestsResponse.a() + ", error: " + tooManyRequestsResponse.b());
        }
        ga.i.d(this.f1830d, this.f1831e, (L) null, new i(events, null), 2, (Object) null);
    }

    @Override // H3.i
    public void e(H3.j successResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(successResponse, "successResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        String str = (String) events;
        InterfaceC2355a interfaceC2355a = this.f1832f;
        if (interfaceC2355a != null) {
            interfaceC2355a.b("Handle response, status: " + successResponse.a());
        }
        l(p.h(j(eventsString, str)), H3.g.f2212b.c(), "Event sent success.");
        ga.i.d(this.f1830d, this.f1831e, (L) null, new g(str, null), 2, (Object) null);
    }

    @Override // H3.i
    public void f(H3.d failedResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(failedResponse, "failedResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        InterfaceC2355a interfaceC2355a = this.f1832f;
        if (interfaceC2355a != null) {
            interfaceC2355a.b("Handle response, status: " + failedResponse.a() + ", error: " + failedResponse.b());
        }
        ga.i.d(this.f1830d, this.f1831e, (L) null, new d(events, null), 2, (Object) null);
    }

    @Override // H3.i
    public void g(H3.h payloadTooLargeResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(payloadTooLargeResponse, "payloadTooLargeResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        InterfaceC2355a interfaceC2355a = this.f1832f;
        if (interfaceC2355a != null) {
            interfaceC2355a.b("Handle response, status: " + payloadTooLargeResponse.a() + ", error: " + payloadTooLargeResponse.b());
        }
        String str = (String) events;
        JSONArray j6 = j(eventsString, str);
        if (j6.length() != 1) {
            ga.i.d(this.f1830d, this.f1831e, (L) null, new f(str, j6, null), 2, (Object) null);
        } else {
            l(p.h(j6), H3.g.f2215e.c(), payloadTooLargeResponse.b());
            ga.i.d(this.f1830d, this.f1831e, (L) null, new e(str, null), 2, (Object) null);
        }
    }

    public final JSONArray j(String str, String str2) {
        try {
            return new JSONArray(str);
        } catch (JSONException e6) {
            ga.i.d(this.f1830d, this.f1831e, (L) null, new C0037j(str2, null), 2, (Object) null);
            k(str);
            throw e6;
        }
    }

    public final void k(String str) {
        Iterator it = Regex.findAll$default(new Regex("\"insert_id\":\"(.{36})\","), str, 0, 2, (Object) null).iterator();
        while (it.hasNext()) {
            ga.i.d(this.f1830d, this.f1831e, (L) null, new k((MatchResult) it.next(), null), 2, (Object) null);
        }
    }

    public final void l(List list, int i6, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3.a aVar = (C3.a) it.next();
            Function3 c6 = this.f1829c.c();
            if (c6 != null) {
                c6.invoke(aVar, Integer.valueOf(i6), str);
            }
            String u6 = aVar.u();
            if (u6 != null) {
                ga.i.d(this.f1830d, this.f1831e, (L) null, new l(u6, aVar, i6, str, null), 2, (Object) null);
            }
        }
    }
}
