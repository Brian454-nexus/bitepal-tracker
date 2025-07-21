package v3;

import D3.f;
import ga.J;
import ga.L;
import ga.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x3.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19585d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Void f19586e = null;

    /* renamed from: a, reason: collision with root package name */
    public final f.a f19587a = f.a.f797a;

    /* renamed from: b, reason: collision with root package name */
    public B3.a f19588b;

    /* renamed from: c, reason: collision with root package name */
    public g f19589c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Void a() {
            return e.f19586e;
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f19590j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ B3.a f19591k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x3.f f19592l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B3.a aVar, x3.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f19591k = aVar;
            this.f19592l = fVar;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f19591k, this.f19592l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19590j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.f19591k.m().z(Boxing.boxBoolean(!this.f19592l.b()));
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B3.a f19593a;

        public c(B3.a aVar) {
            this.f19593a = aVar;
        }

        @Override // x3.g.a
        public void a() {
            this.f19593a.s().b("AndroidNetworkListener, onNetworkAvailable.");
            this.f19593a.m().z(Boolean.FALSE);
            this.f19593a.j();
        }

        @Override // x3.g.a
        public void b() {
            this.f19593a.s().b("AndroidNetworkListener, onNetworkUnavailable.");
            this.f19593a.m().z(Boolean.TRUE);
        }
    }

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        amplitude.s().b("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        B3.b m6 = amplitude.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        i.d(amplitude.l(), amplitude.v(), (L) null, new b(amplitude, new x3.f(((o3.c) m6).C(), amplitude.s()), null), 2, (Object) null);
        c cVar = new c(amplitude);
        B3.b m7 = amplitude.m();
        Intrinsics.checkNotNull(m7, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        g(new g(((o3.c) m7).C(), amplitude.s(), cVar));
        f().c();
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19588b = aVar;
    }

    public final g f() {
        g gVar = this.f19589c;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkListener");
        return null;
    }

    public final void g(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f19589c = gVar;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f19587a;
    }
}
