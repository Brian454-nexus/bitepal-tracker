package q2;

import D6.g;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import ga.J;
import ga.K;
import ga.L;
import ga.Y;
import ga.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.AbstractC2023a;
import r2.n;
import r2.o;
import r2.p;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2009a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18642a = new b(null);

    /* renamed from: q2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0237a extends AbstractC2009a {

        /* renamed from: b, reason: collision with root package name */
        public final n f18643b;

        /* renamed from: q2.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0238a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18644j;

            public C0238a(AbstractC2023a abstractC2023a, Continuation continuation) {
                super(2, continuation);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new C0238a(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f18644j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    n nVar = C0237a.this.f18643b;
                    this.f18644j = 1;
                    if (nVar.a(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: q2.a$a$b */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18646j;

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
                int i6 = this.f18646j;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                n nVar = C0237a.this.f18643b;
                this.f18646j = 1;
                Object b6 = nVar.b(this);
                return b6 == coroutine_suspended ? coroutine_suspended : b6;
            }
        }

        /* renamed from: q2.a$a$c */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18648j;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Uri f18650l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ InputEvent f18651m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, Continuation continuation) {
                super(2, continuation);
                this.f18650l = uri;
                this.f18651m = inputEvent;
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f18650l, this.f18651m, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f18648j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    n nVar = C0237a.this.f18643b;
                    Uri uri = this.f18650l;
                    InputEvent inputEvent = this.f18651m;
                    this.f18648j = 1;
                    if (nVar.c(uri, inputEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: q2.a$a$d */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class d extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18652j;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Uri f18654l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, Continuation continuation) {
                super(2, continuation);
                this.f18654l = uri;
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.f18654l, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f18652j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    n nVar = C0237a.this.f18643b;
                    Uri uri = this.f18654l;
                    this.f18652j = 1;
                    if (nVar.d(uri, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: q2.a$a$e */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18655j;

            public e(o oVar, Continuation continuation) {
                super(2, continuation);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new e(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f18655j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    n nVar = C0237a.this.f18643b;
                    this.f18655j = 1;
                    if (nVar.e(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: q2.a$a$f */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18657j;

            public f(p pVar, Continuation continuation) {
                super(2, continuation);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new f(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f18657j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    n nVar = C0237a.this.f18643b;
                    this.f18657j = 1;
                    if (nVar.f(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C0237a(n mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f18643b = mMeasurementManager;
        }

        @Override // q2.AbstractC2009a
        @NotNull
        public g b() {
            return p2.b.c(i.b(K.a(Y.a()), (CoroutineContext) null, (L) null, new b(null), 3, (Object) null), null, 1, null);
        }

        @Override // q2.AbstractC2009a
        @NotNull
        public g c(@NotNull Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return p2.b.c(i.b(K.a(Y.a()), (CoroutineContext) null, (L) null, new d(trigger, null), 3, (Object) null), null, 1, null);
        }

        @NotNull
        public g e(@NotNull AbstractC2023a deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return p2.b.c(i.b(K.a(Y.a()), (CoroutineContext) null, (L) null, new C0238a(deletionRequest, null), 3, (Object) null), null, 1, null);
        }

        @NotNull
        public g f(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return p2.b.c(i.b(K.a(Y.a()), (CoroutineContext) null, (L) null, new c(attributionSource, inputEvent, null), 3, (Object) null), null, 1, null);
        }

        @NotNull
        public g g(@NotNull o request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return p2.b.c(i.b(K.a(Y.a()), (CoroutineContext) null, (L) null, new e(request, null), 3, (Object) null), null, 1, null);
        }

        @NotNull
        public g h(@NotNull p request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return p2.b.c(i.b(K.a(Y.a()), (CoroutineContext) null, (L) null, new f(request, null), 3, (Object) null), null, 1, null);
        }
    }

    /* renamed from: q2.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC2009a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            n a6 = n.f18698a.a(context);
            if (a6 != null) {
                return new C0237a(a6);
            }
            return null;
        }

        public b() {
        }
    }

    public static final AbstractC2009a a(Context context) {
        return f18642a.a(context);
    }

    public abstract g b();

    public abstract g c(Uri uri);
}
