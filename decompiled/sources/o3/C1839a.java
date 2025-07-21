package o3;

import J3.l;
import android.app.Application;
import android.content.Context;
import ga.G;
import ga.J;
import ga.L;
import ga.Q;
import ga.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import w3.C2247e;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1839a extends B3.a {

    /* renamed from: q, reason: collision with root package name */
    public static final C0228a f17878q = new C0228a(null);

    /* renamed from: o, reason: collision with root package name */
    public v3.c f17879o;

    /* renamed from: p, reason: collision with root package name */
    public x3.c f17880p;

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0228a {
        public /* synthetic */ C0228a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0228a() {
        }
    }

    /* renamed from: o3.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f17881j;

        /* renamed from: k, reason: collision with root package name */
        public Object f17882k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f17883l;

        /* renamed from: n, reason: collision with root package name */
        public int f17885n;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17883l = obj;
            this.f17885n |= IntCompanionObject.MIN_VALUE;
            return C1839a.K(C1839a.this, null, this);
        }
    }

    /* renamed from: o3.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends v3.c {
        public c() {
        }

        @Override // v3.c
        public void i(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            C1839a.this.C(deviceId);
        }
    }

    /* renamed from: o3.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends Thread {
        public d() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            D3.g x6 = C1839a.this.x();
            Intrinsics.checkNotNull(x6, "null cannot be cast to non-null type com.amplitude.android.Timeline");
            ((f) x6).G();
        }
    }

    /* renamed from: o3.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f17888j;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f17888j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Q z6 = C1839a.this.z();
                this.f17888j = 1;
                if (z6.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            v3.c cVar = null;
            C1839a.this.p().c().a().b(null).commit();
            v3.c cVar2 = C1839a.this.f17879o;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidContextPlugin");
            } else {
                cVar = cVar2;
            }
            B3.b m6 = C1839a.this.m();
            Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            cVar.h((o3.c) m6);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C1839a(o3.c r8, B3.e r9, ga.J r10, ga.G r11, ga.G r12, ga.G r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto Le
            r10 = 1
            r15 = 0
            ga.z r10 = ga.Q0.b(r15, r10, r15)
            ga.J r10 = ga.K.a(r10)
        Le:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto L20
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newCachedThreadPool()
            java.lang.String r11 = "newCachedThreadPool(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            ga.k0 r11 = ga.m0.b(r10)
        L20:
            r4 = r11
            r10 = r14 & 16
            java.lang.String r11 = "newSingleThreadExecutor(...)"
            if (r10 == 0) goto L32
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            ga.k0 r12 = ga.m0.b(r10)
        L32:
            r5 = r12
            r10 = r14 & 32
            if (r10 == 0) goto L42
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            ga.k0 r13 = ga.m0.b(r10)
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C1839a.<init>(o3.c, B3.e, ga.J, ga.G, ga.G, ga.G, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object K(o3.C1839a r4, J3.f r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof o3.C1839a.b
            if (r0 == 0) goto L13
            r0 = r6
            o3.a$b r0 = (o3.C1839a.b) r0
            int r1 = r0.f17885n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17885n = r1
            goto L18
        L13:
            o3.a$b r0 = new o3.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17883l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17885n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f17882k
            r5 = r4
            J3.f r5 = (J3.f) r5
            java.lang.Object r4 = r0.f17881j
            o3.a r4 = (o3.C1839a) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4f
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            u3.f r6 = new u3.f
            r6.<init>(r4)
            r0.f17881j = r4
            r0.f17882k = r5
            r0.f17885n = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r4.h(r5)
            B3.b r5 = r4.m()
            java.lang.Boolean r5 = r5.o()
            v3.e$a r6 = v3.e.f19585d
            java.lang.Void r6 = r6.a()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 != 0) goto L6e
            v3.e r5 = new v3.e
            r5.<init>()
            r4.d(r5)
        L6e:
            o3.a$c r5 = new o3.a$c
            r5.<init>()
            r4.f17879o = r5
            r4.d(r5)
            F3.b r5 = new F3.b
            r5.<init>()
            r4.d(r5)
            v3.d r5 = new v3.d
            x3.c r6 = r4.f17880p
            if (r6 != 0) goto L8c
            java.lang.String r6 = "activityLifecycleCallbacks"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            r6 = 0
        L8c:
            r5.<init>(r6)
            r4.d(r5)
            v3.a r5 = new v3.a
            r5.<init>()
            r4.d(r5)
            v3.b r5 = new v3.b
            r5.<init>()
            r4.d(r5)
            F3.a r5 = new F3.a
            r5.<init>()
            r4.d(r5)
            D3.g r4 = r4.x()
            java.lang.String r5 = "null cannot be cast to non-null type com.amplitude.android.Timeline"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            o3.f r4 = (o3.f) r4
            r4.D()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C1839a.K(o3.a, J3.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B3.a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public f i() {
        f fVar = new f(m().u());
        fVar.g(this);
        return fVar;
    }

    public final void M() {
        Runtime.getRuntime().addShutdownHook(new d());
    }

    public C1839a N() {
        D(null);
        i.d(l(), k(), (L) null, new e(null), 2, (Object) null);
        return this;
    }

    @Override // B3.a
    public Q e() {
        this.f17880p = new x3.c();
        return super.e();
    }

    @Override // B3.a
    public Object f(J3.f fVar, Continuation continuation) {
        return K(this, fVar, continuation);
    }

    @Override // B3.a
    public J3.f g() {
        B3.b m6 = m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        String l6 = cVar.l();
        String b6 = cVar.b();
        l j6 = cVar.j();
        C2247e c2247e = C2247e.f20161a;
        return new J3.f(l6, b6, null, j6, c2247e.e(cVar), c2247e.f(), cVar.m().a(this), 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839a(o3.c configuration, B3.e state, J amplitudeScope, G amplitudeDispatcher, G networkIODispatcher, G storageIODispatcher) {
        super(configuration, state, amplitudeScope, amplitudeDispatcher, networkIODispatcher, storageIODispatcher);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        Intrinsics.checkNotNullParameter(amplitudeDispatcher, "amplitudeDispatcher");
        Intrinsics.checkNotNullParameter(networkIODispatcher, "networkIODispatcher");
        Intrinsics.checkNotNullParameter(storageIODispatcher, "storageIODispatcher");
        M();
        if (configuration.B().contains(EnumC1840b.f17891b)) {
            Context C6 = configuration.C();
            Intrinsics.checkNotNull(C6, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) C6;
            x3.c cVar = this.f17880p;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
                cVar = null;
            }
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1839a(o3.c configuration) {
        this(configuration, new B3.e(), null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }
}
