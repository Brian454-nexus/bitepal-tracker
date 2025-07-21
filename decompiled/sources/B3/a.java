package B3;

import J3.k;
import J3.m;
import ga.G;
import ga.J;
import ga.L;
import ga.Q;
import ga.i;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final B3.b f315a;

    /* renamed from: b, reason: collision with root package name */
    public final e f316b;

    /* renamed from: c, reason: collision with root package name */
    public final J f317c;

    /* renamed from: d, reason: collision with root package name */
    public final G f318d;

    /* renamed from: e, reason: collision with root package name */
    public final G f319e;

    /* renamed from: f, reason: collision with root package name */
    public final G f320f;

    /* renamed from: g, reason: collision with root package name */
    public final D3.g f321g;

    /* renamed from: h, reason: collision with root package name */
    public f f322h;

    /* renamed from: i, reason: collision with root package name */
    public f f323i;

    /* renamed from: j, reason: collision with root package name */
    public k f324j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2355a f325k;

    /* renamed from: l, reason: collision with root package name */
    public J3.g f326l;

    /* renamed from: m, reason: collision with root package name */
    public final Q f327m;

    /* renamed from: n, reason: collision with root package name */
    public final G3.c f328n;

    /* renamed from: B3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0012a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f329j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f331l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0012a(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f331l = aVar;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new C0012a(this.f331l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f329j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                aVar.f322h = g.a(aVar.m().v(), this.f331l, null, 2, null);
                a aVar2 = a.this;
                aVar2.f323i = aVar2.m().i().b(this.f331l, "amplitude-identify-intercept");
                J3.f g6 = a.this.g();
                a aVar3 = a.this;
                aVar3.f324j = aVar3.m().j().a(g6);
                a aVar4 = this.f331l;
                this.f329j = 1;
                if (aVar4.f(g6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(true);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f332j;

        /* renamed from: B3.a$b$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0013a extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0013a f334a = new C0013a();

            public C0013a() {
                super(1);
            }

            public final void a(D3.f it) {
                Intrinsics.checkNotNullParameter(it, "it");
                D3.c cVar = it instanceof D3.c ? (D3.c) it : null;
                if (cVar != null) {
                    cVar.flush();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((D3.f) obj);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f332j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Q z6 = a.this.z();
                this.f332j = 1;
                if (z6.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            a.this.x().b(C0013a.f334a);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f335j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.f337l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f337l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f335j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Q z6 = a.this.z();
                this.f335j = 1;
                if (z6.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            a.this.C(this.f337l);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f338j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f340l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation continuation) {
            super(2, continuation);
            this.f340l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f340l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f338j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Q z6 = a.this.z();
                this.f338j = 1;
                obj = z6.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                a.this.p().c().a().a(this.f340l).commit();
            }
            return Unit.INSTANCE;
        }
    }

    public a(B3.b configuration, e store, J amplitudeScope, G amplitudeDispatcher, G networkIODispatcher, G storageIODispatcher) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        Intrinsics.checkNotNullParameter(amplitudeDispatcher, "amplitudeDispatcher");
        Intrinsics.checkNotNullParameter(networkIODispatcher, "networkIODispatcher");
        Intrinsics.checkNotNullParameter(storageIODispatcher, "storageIODispatcher");
        this.f315a = configuration;
        this.f316b = store;
        this.f317c = amplitudeScope;
        this.f318d = amplitudeDispatcher;
        this.f319e = networkIODispatcher;
        this.f320f = storageIODispatcher;
        this.f328n = new G3.c();
        if (!configuration.y()) {
            throw new IllegalArgumentException("invalid configuration");
        }
        this.f321g = i();
        this.f325k = configuration.m().a(this);
        Q e6 = e();
        this.f327m = e6;
        e6.start();
    }

    public static /* synthetic */ a G(a aVar, C3.a aVar2, C3.b bVar, Function3 function3, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i6 & 2) != 0) {
            bVar = null;
        }
        if ((i6 & 4) != 0) {
            function3 = null;
        }
        return aVar.E(aVar2, bVar, function3);
    }

    public static /* synthetic */ a H(a aVar, String str, Map map, C3.b bVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i6 & 2) != 0) {
            map = null;
        }
        if ((i6 & 4) != 0) {
            bVar = null;
        }
        return aVar.F(str, map, bVar);
    }

    public final void A(C3.a aVar) {
        if (this.f315a.p()) {
            this.f325k.d("Skip event for opt out config.");
            return;
        }
        if (aVar.M() == null) {
            aVar.B0(Long.valueOf(System.currentTimeMillis()));
        }
        this.f325k.b("Logged event with type: " + aVar.F0());
        this.f321g.f(aVar);
    }

    public final a B(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        i.d(this.f317c, this.f318d, (L) null, new c(deviceId, null), 2, (Object) null);
        return this;
    }

    public final void C(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        p().c().a().b(deviceId).commit();
    }

    public final a D(String str) {
        i.d(this.f317c, this.f318d, (L) null, new d(str, null), 2, (Object) null);
        return this;
    }

    public final a E(C3.a event, C3.b bVar, Function3 function3) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (bVar != null) {
            event.K0(bVar);
        }
        if (function3 != null) {
            event.U(function3);
        }
        A(event);
        return this;
    }

    public final a F(String eventType, Map map, C3.b bVar) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C3.a aVar = new C3.a();
        aVar.M0(eventType);
        aVar.L0(map != null ? MapsKt.toMutableMap(map) : null);
        if (bVar != null) {
            aVar.K0(bVar);
        }
        A(aVar);
        return this;
    }

    public final a d(D3.f plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        if (plugin instanceof D3.e) {
            this.f316b.a((D3.e) plugin, this);
            return this;
        }
        this.f321g.a(plugin);
        return this;
    }

    public Q e() {
        return i.a(this.f317c, this.f318d, L.b, new C0012a(this, null));
    }

    public abstract Object f(J3.f fVar, Continuation continuation);

    public abstract J3.f g();

    public final void h(J3.f identityConfiguration) {
        Intrinsics.checkNotNullParameter(identityConfiguration, "identityConfiguration");
        this.f326l = J3.g.f2890c.a(identityConfiguration);
        G3.a aVar = new G3.a(this.f316b);
        p().c().e(aVar);
        if (p().c().isInitialized()) {
            aVar.c(p().c().c(), m.f2904a);
        }
    }

    public abstract D3.g i();

    public final void j() {
        i.d(this.f317c, this.f318d, (L) null, new b(null), 2, (Object) null);
    }

    public final G k() {
        return this.f318d;
    }

    public final J l() {
        return this.f317c;
    }

    public final B3.b m() {
        return this.f315a;
    }

    public final String n() {
        if (this.f326l != null) {
            return p().c().c().a();
        }
        return null;
    }

    public final G3.c o() {
        return this.f328n;
    }

    public final J3.g p() {
        J3.g gVar = this.f326l;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("idContainer");
        return null;
    }

    public final f q() {
        f fVar = this.f323i;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptStorage");
        return null;
    }

    public final k r() {
        k kVar = this.f324j;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identityStorage");
        return null;
    }

    public final InterfaceC2355a s() {
        return this.f325k;
    }

    public final G t() {
        return this.f319e;
    }

    public final f u() {
        f fVar = this.f322h;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storage");
        return null;
    }

    public final G v() {
        return this.f320f;
    }

    public final e w() {
        return this.f316b;
    }

    public final D3.g x() {
        return this.f321g;
    }

    public final String y() {
        if (this.f326l != null) {
            return p().c().c().b();
        }
        return null;
    }

    public final Q z() {
        return this.f327m;
    }
}
