package I0;

import I0.A;
import I0.p;
import ga.J;
import ga.L;
import ga.u0;
import ja.D;
import ja.E;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements I0.h {

    /* renamed from: l, reason: collision with root package name */
    public static final a f2602l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final I0.w f2603a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.d f2604b;

    /* renamed from: c, reason: collision with root package name */
    public final J f2605c;

    /* renamed from: d, reason: collision with root package name */
    public final ja.x f2606d;

    /* renamed from: e, reason: collision with root package name */
    public final ja.e f2607e;

    /* renamed from: f, reason: collision with root package name */
    public final ja.e f2608f;

    /* renamed from: g, reason: collision with root package name */
    public final I0.k f2609g;

    /* renamed from: h, reason: collision with root package name */
    public final b f2610h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f2611i;

    /* renamed from: j, reason: collision with root package name */
    public final Lazy f2612j;

    /* renamed from: k, reason: collision with root package name */
    public final I0.t f2613k;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b extends I0.s {

        /* renamed from: c, reason: collision with root package name */
        public List f2614c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f2615d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j, reason: collision with root package name */
            public Object f2616j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f2617k;

            /* renamed from: m, reason: collision with root package name */
            public int f2619m;

            public a(Continuation continuation) {
                super(continuation);
            }

            public final Object invokeSuspend(Object obj) {
                this.f2617k = obj;
                this.f2619m |= IntCompanionObject.MIN_VALUE;
                return b.this.b(this);
            }
        }

        /* renamed from: I0.j$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0044b extends SuspendLambda implements Function1 {

            /* renamed from: j, reason: collision with root package name */
            public Object f2620j;

            /* renamed from: k, reason: collision with root package name */
            public Object f2621k;

            /* renamed from: l, reason: collision with root package name */
            public Object f2622l;

            /* renamed from: m, reason: collision with root package name */
            public Object f2623m;

            /* renamed from: n, reason: collision with root package name */
            public Object f2624n;

            /* renamed from: o, reason: collision with root package name */
            public int f2625o;

            /* renamed from: p, reason: collision with root package name */
            public int f2626p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ j f2627q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f2628r;

            /* renamed from: I0.j$b$b$a */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class a implements I0.m {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ pa.a f2629a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f2630b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Ref.ObjectRef f2631c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ j f2632d;

                /* renamed from: I0.j$b$b$a$a, reason: collision with other inner class name */
                /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
                public static final class C0045a extends ContinuationImpl {

                    /* renamed from: j, reason: collision with root package name */
                    public Object f2633j;

                    /* renamed from: k, reason: collision with root package name */
                    public Object f2634k;

                    /* renamed from: l, reason: collision with root package name */
                    public Object f2635l;

                    /* renamed from: m, reason: collision with root package name */
                    public Object f2636m;

                    /* renamed from: n, reason: collision with root package name */
                    public Object f2637n;

                    /* renamed from: o, reason: collision with root package name */
                    public /* synthetic */ Object f2638o;

                    /* renamed from: q, reason: collision with root package name */
                    public int f2640q;

                    public C0045a(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f2638o = obj;
                        this.f2640q |= IntCompanionObject.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(pa.a aVar, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, j jVar) {
                    this.f2629a = aVar;
                    this.f2630b = booleanRef;
                    this.f2631c = objectRef;
                    this.f2632d = jVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // I0.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object a(kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: I0.j.b.C0044b.a.a(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0044b(j jVar, b bVar, Continuation continuation) {
                super(1, continuation);
                this.f2627q = jVar;
                this.f2628r = bVar;
            }

            public final Continuation create(Continuation continuation) {
                return new C0044b(this.f2627q, this.f2628r, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
            /* JADX WARN: Type inference failed for: r13v5, types: [T, java.lang.Object] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: I0.j.b.C0044b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return create(continuation).invokeSuspend(Unit.INSTANCE);
            }
        }

        public b(j jVar, List initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f2615d = jVar;
            this.f2614c = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // I0.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(kotlin.coroutines.Continuation r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof I0.j.b.a
                if (r0 == 0) goto L13
                r0 = r7
                I0.j$b$a r0 = (I0.j.b.a) r0
                int r1 = r0.f2619m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2619m = r1
                goto L18
            L13:
                I0.j$b$a r0 = new I0.j$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f2617k
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f2619m
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f2616j
                I0.j$b r0 = (I0.j.b) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.f2616j
                I0.j$b r0 = (I0.j.b) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7d
            L40:
                kotlin.ResultKt.throwOnFailure(r7)
                java.util.List r7 = r6.f2614c
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                I0.j r7 = r6.f2615d
                I0.n r7 = I0.j.b(r7)
                I0.j$b$b r2 = new I0.j$b$b
                I0.j r4 = r6.f2615d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f2616j = r6
                r0.f2619m = r3
                java.lang.Object r7 = r7.c(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                I0.e r7 = (I0.e) r7
                goto L7f
            L6e:
                I0.j r7 = r6.f2615d
                r0.f2616j = r6
                r0.f2619m = r4
                r2 = 0
                java.lang.Object r7 = I0.j.n(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                I0.e r7 = (I0.e) r7
            L7f:
                I0.j r0 = r0.f2615d
                I0.k r0 = I0.j.c(r0)
                r0.c(r7)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.b.b(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0.n invoke() {
            return j.this.r().c();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f2642j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2643k;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f2645j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ u0 f2646k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u0 u0Var, Continuation continuation) {
                super(2, continuation);
                this.f2646k = u0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ja.f fVar, Continuation continuation) {
                return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f2646k, continuation);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f2645j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f2646k.start();
                return Unit.INSTANCE;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class b extends SuspendLambda implements Function3 {

            /* renamed from: j, reason: collision with root package name */
            public int f2647j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ u0 f2648k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(u0 u0Var, Continuation continuation) {
                super(3, continuation);
                this.f2648k = u0Var;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ja.f fVar, Throwable th, Continuation continuation) {
                return new b(this.f2648k, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f2647j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                u0.a.b(this.f2648k, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c implements ja.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ia.r f2649a;

            public c(ia.r rVar) {
                this.f2649a = rVar;
            }

            public final Object b(Object obj, Continuation continuation) {
                Object i6 = this.f2649a.i(obj, continuation);
                return i6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i6 : Unit.INSTANCE;
            }
        }

        /* renamed from: I0.j$d$d, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0046d extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f2650j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ j f2651k;

            /* renamed from: I0.j$d$d$a */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class a implements ja.f {

                /* renamed from: a, reason: collision with root package name */
                public static final a f2652a = new a();

                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object b(Unit unit, Continuation continuation) {
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0046d(j jVar, Continuation continuation) {
                super(2, continuation);
                this.f2651k = jVar;
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new C0046d(this.f2651k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f2650j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ja.x xVar = this.f2651k.f2606d;
                    a aVar = a.f2652a;
                    this.f2650j = 1;
                    if (xVar.a(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ia.r rVar, Continuation continuation) {
            return create(rVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f2643k = obj;
            return dVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2642j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                ia.r rVar = (ia.r) this.f2643k;
                u0 d6 = ga.i.d(rVar, (CoroutineContext) null, L.b, new C0046d(j.this, null), 1, (Object) null);
                ja.e x6 = ja.g.x(ja.g.z(j.this.f2607e, new a(d6, null)), new b(d6, null));
                c cVar = new c(rVar);
                this.f2642j = 1;
                if (x6.a(cVar, this) == coroutine_suspended) {
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

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends SuspendLambda implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public int f2653j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function1 f2654k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f2654k = function1;
        }

        public final Continuation create(Continuation continuation) {
            return new e(this.f2654k, continuation);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2653j;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f2654k;
            this.f2653j = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2655j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2656k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2657l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f2658m;

        /* renamed from: o, reason: collision with root package name */
        public int f2660o;

        public f(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2658m = obj;
            this.f2660o |= IntCompanionObject.MIN_VALUE;
            return j.this.s(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2661j;

        /* renamed from: k, reason: collision with root package name */
        public int f2662k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2663l;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f2665j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f2666k;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I0.v vVar, Continuation continuation) {
                return create(vVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f2666k = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f2665j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!(((I0.v) this.f2666k) instanceof I0.l));
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f2667j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f2668k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I0.v f2669l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(I0.v vVar, Continuation continuation) {
                super(2, continuation);
                this.f2669l = vVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I0.v vVar, Continuation continuation) {
                return create(vVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(this.f2669l, continuation);
                bVar.f2668k = obj;
                return bVar;
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f2667j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                I0.v vVar = (I0.v) this.f2668k;
                return Boxing.boxBoolean((vVar instanceof I0.e) && vVar.a() <= this.f2669l.a());
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c implements ja.e {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ja.e f2670a;

            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class a implements ja.f {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ja.f f2671a;

                /* renamed from: I0.j$g$c$a$a, reason: collision with other inner class name */
                /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
                public static final class C0047a extends ContinuationImpl {

                    /* renamed from: j, reason: collision with root package name */
                    public /* synthetic */ Object f2672j;

                    /* renamed from: k, reason: collision with root package name */
                    public int f2673k;

                    public C0047a(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f2672j = obj;
                        this.f2673k |= IntCompanionObject.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(ja.f fVar) {
                    this.f2671a = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof I0.j.g.c.a.C0047a
                        if (r0 == 0) goto L13
                        r0 = r6
                        I0.j$g$c$a$a r0 = (I0.j.g.c.a.C0047a) r0
                        int r1 = r0.f2673k
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f2673k = r1
                        goto L18
                    L13:
                        I0.j$g$c$a$a r0 = new I0.j$g$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f2672j
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f2673k
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        ja.f r6 = r4.f2671a
                        I0.v r5 = (I0.v) r5
                        boolean r2 = r5 instanceof I0.q
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof I0.e
                        if (r2 == 0) goto L52
                        I0.e r5 = (I0.e) r5
                        java.lang.Object r5 = r5.c()
                        r0.f2673k = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    L52:
                        boolean r6 = r5 instanceof I0.l
                        if (r6 == 0) goto L57
                        goto L59
                    L57:
                        boolean r3 = r5 instanceof I0.z
                    L59:
                        if (r3 == 0) goto L63
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L63:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L69:
                        I0.q r5 = (I0.q) r5
                        java.lang.Throwable r5 = r5.b()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: I0.j.g.c.a.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(ja.e eVar) {
                this.f2670a = eVar;
            }

            public Object a(ja.f fVar, Continuation continuation) {
                Object a6 = this.f2670a.a(new a(fVar), continuation);
                return a6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a6 : Unit.INSTANCE;
            }
        }

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ja.f fVar, Continuation continuation) {
            return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = new g(continuation);
            gVar.f2663l = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
        
            if (ja.g.m(r1, r3, r7) == r0) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f2662k
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.throwOnFailure(r8)
                goto La7
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f2661j
                I0.v r1 = (I0.v) r1
                java.lang.Object r3 = r7.f2663l
                ja.f r3 = (ja.f) r3
                kotlin.ResultKt.throwOnFailure(r8)
                goto L66
            L2a:
                java.lang.Object r1 = r7.f2663l
                ja.f r1 = (ja.f) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L4a
            L32:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.f2663l
                ja.f r8 = (ja.f) r8
                I0.j r1 = I0.j.this
                r7.f2663l = r8
                r7.f2662k = r4
                r4 = 0
                java.lang.Object r1 = I0.j.o(r1, r4, r7)
                if (r1 != r0) goto L47
                goto La6
            L47:
                r6 = r1
                r1 = r8
                r8 = r6
            L4a:
                I0.v r8 = (I0.v) r8
                boolean r4 = r8 instanceof I0.e
                if (r4 == 0) goto L69
                r4 = r8
                I0.e r4 = (I0.e) r4
                java.lang.Object r4 = r4.c()
                r7.f2663l = r1
                r7.f2661j = r8
                r7.f2662k = r3
                java.lang.Object r3 = r1.b(r4, r7)
                if (r3 != r0) goto L64
                goto La6
            L64:
                r3 = r1
                r1 = r8
            L66:
                r8 = r1
                r1 = r3
                goto L78
            L69:
                boolean r3 = r8 instanceof I0.z
                if (r3 != 0) goto Lb1
                boolean r3 = r8 instanceof I0.q
                if (r3 != 0) goto Laa
                boolean r3 = r8 instanceof I0.l
                if (r3 == 0) goto L78
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L78:
                I0.j r3 = I0.j.this
                I0.k r3 = I0.j.c(r3)
                ja.e r3 = r3.b()
                I0.j$g$a r4 = new I0.j$g$a
                r5 = 0
                r4.<init>(r5)
                ja.e r3 = ja.g.B(r3, r4)
                I0.j$g$b r4 = new I0.j$g$b
                r4.<init>(r8, r5)
                ja.e r8 = ja.g.k(r3, r4)
                I0.j$g$c r3 = new I0.j$g$c
                r3.<init>(r8)
                r7.f2663l = r5
                r7.f2661j = r5
                r7.f2662k = r2
                java.lang.Object r8 = ja.g.m(r1, r3, r7)
                if (r8 != r0) goto La7
            La6:
                return r0
            La7:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            Laa:
                I0.q r8 = (I0.q) r8
                java.lang.Throwable r8 = r8.b()
                throw r8
            Lb1:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2675j;

        /* renamed from: k, reason: collision with root package name */
        public int f2676k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2677l;

        /* renamed from: n, reason: collision with root package name */
        public int f2679n;

        public h(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2677l = obj;
            this.f2679n |= IntCompanionObject.MIN_VALUE;
            return j.this.t(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2680j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2681k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2682l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f2683m;

        /* renamed from: o, reason: collision with root package name */
        public int f2685o;

        public i(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2683m = obj;
            this.f2685o |= IntCompanionObject.MIN_VALUE;
            return j.this.u(false, this);
        }
    }

    /* renamed from: I0.j$j, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0048j extends SuspendLambda implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2686j;

        /* renamed from: k, reason: collision with root package name */
        public int f2687k;

        public C0048j(Continuation continuation) {
            super(1, continuation);
        }

        public final Continuation create(Continuation continuation) {
            return new C0048j(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            I0.v vVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2687k;
            try {
            } catch (Throwable th2) {
                I0.n q6 = j.this.q();
                this.f2686j = th2;
                this.f2687k = 2;
                Object a6 = q6.a(this);
                if (a6 != coroutine_suspended) {
                    th = th2;
                    obj = a6;
                }
            }
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = j.this;
                this.f2687k = 1;
                obj = jVar.w(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f2686j;
                    ResultKt.throwOnFailure(obj);
                    vVar = new I0.q(th, ((Number) obj).intValue());
                    return TuplesKt.to(vVar, Boxing.boxBoolean(true));
                }
                ResultKt.throwOnFailure(obj);
            }
            vVar = (I0.v) obj;
            return TuplesKt.to(vVar, Boxing.boxBoolean(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2689j;

        /* renamed from: k, reason: collision with root package name */
        public int f2690k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ boolean f2691l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f2693n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i6, Continuation continuation) {
            super(2, continuation);
            this.f2693n = i6;
        }

        public final Object a(boolean z6, Continuation continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = new k(this.f2693n, continuation);
            kVar.f2691l = ((Boolean) obj).booleanValue();
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i6;
            boolean z6;
            I0.v vVar;
            boolean z7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z8 = this.f2690k;
            try {
            } catch (Throwable th2) {
                if (z8 != 0) {
                    I0.n q6 = j.this.q();
                    this.f2689j = th2;
                    this.f2691l = z8;
                    this.f2690k = 2;
                    Object a6 = q6.a(this);
                    if (a6 != coroutine_suspended) {
                        z6 = z8;
                        th = th2;
                        obj = a6;
                    }
                } else {
                    boolean z9 = z8;
                    th = th2;
                    i6 = this.f2693n;
                    z6 = z9;
                }
            }
            if (z8 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z10 = this.f2691l;
                j jVar = j.this;
                this.f2691l = z10;
                this.f2690k = 1;
                obj = jVar.w(z10, this);
                z8 = z10;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (z8 != 1) {
                    if (z8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z6 = this.f2691l;
                    th = (Throwable) this.f2689j;
                    ResultKt.throwOnFailure(obj);
                    i6 = ((Number) obj).intValue();
                    I0.q qVar = new I0.q(th, i6);
                    z7 = z6;
                    vVar = qVar;
                    return TuplesKt.to(vVar, Boxing.boxBoolean(z7));
                }
                boolean z11 = this.f2691l;
                ResultKt.throwOnFailure(obj);
                z8 = z11;
            }
            vVar = (I0.v) obj;
            z7 = z8;
            return TuplesKt.to(vVar, Boxing.boxBoolean(z7));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class l extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2694j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2695k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2696l;

        /* renamed from: m, reason: collision with root package name */
        public Object f2697m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2698n;

        /* renamed from: o, reason: collision with root package name */
        public int f2699o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f2700p;

        /* renamed from: r, reason: collision with root package name */
        public int f2702r;

        public l(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2700p = obj;
            this.f2702r |= IntCompanionObject.MIN_VALUE;
            return j.this.w(false, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2703j;

        /* renamed from: k, reason: collision with root package name */
        public int f2704k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ boolean f2705l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f2707n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i6, Continuation continuation) {
            super(2, continuation);
            this.f2707n = i6;
        }

        public final Object a(boolean z6, Continuation continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            m mVar = new m(this.f2707n, continuation);
            mVar.f2705l = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        
            if (r6 == r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f2704k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f2703j
                kotlin.ResultKt.throwOnFailure(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f2705l
                kotlin.ResultKt.throwOnFailure(r6)
                goto L34
            L22:
                kotlin.ResultKt.throwOnFailure(r6)
                boolean r1 = r5.f2705l
                I0.j r6 = I0.j.this
                r5.f2705l = r1
                r5.f2704k = r3
                java.lang.Object r6 = I0.j.m(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                I0.j r1 = I0.j.this
                I0.n r1 = I0.j.b(r1)
                r5.f2703j = r6
                r5.f2704k = r2
                java.lang.Object r1 = r1.a(r5)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.f2707n
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                I0.e r1 = new I0.e
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class n extends SuspendLambda implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2708j;

        /* renamed from: k, reason: collision with root package name */
        public int f2709k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f2710l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f2711m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f2712n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, j jVar, Ref.IntRef intRef, Continuation continuation) {
            super(1, continuation);
            this.f2710l = objectRef;
            this.f2711m = jVar;
            this.f2712n = intRef;
        }

        public final Continuation create(Continuation continuation) {
            return new n(this.f2710l, this.f2711m, this.f2712n, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Object obj2;
            Ref.ObjectRef objectRef;
            T t6;
            Ref.IntRef intRef2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2709k;
            try {
            } catch (I0.c unused) {
                Ref.IntRef intRef3 = this.f2712n;
                j jVar = this.f2711m;
                Object obj4 = this.f2710l.element;
                this.f2708j = intRef3;
                this.f2709k = 3;
                Object z6 = jVar.z(obj4, true, this);
                if (z6 != coroutine_suspended) {
                    intRef = intRef3;
                    obj2 = z6;
                }
            }
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = this.f2710l;
                j jVar2 = this.f2711m;
                this.f2708j = objectRef;
                this.f2709k = 1;
                Object v6 = jVar2.v(this);
                t6 = v6;
                if (v6 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        intRef2 = (Ref.IntRef) this.f2708j;
                        ResultKt.throwOnFailure(obj);
                        obj3 = obj;
                        intRef2.element = ((Number) obj3).intValue();
                        return Unit.INSTANCE;
                    }
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (Ref.IntRef) this.f2708j;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    intRef.element = ((Number) obj2).intValue();
                    return Unit.INSTANCE;
                }
                objectRef = (Ref.ObjectRef) this.f2708j;
                ResultKt.throwOnFailure(obj);
                t6 = obj;
            }
            objectRef.element = t6;
            intRef2 = this.f2712n;
            I0.n q6 = this.f2711m.q();
            this.f2708j = intRef2;
            this.f2709k = 2;
            Object a6 = q6.a(this);
            obj3 = a6;
            if (a6 == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef2.element = ((Number) obj3).intValue();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f2713j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f2715l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z6, Continuation continuation) {
            super(2, continuation);
            this.f2715l = z6;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f2715l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        
            if (r5.t(r4) == r0) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f2713j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                kotlin.ResultKt.throwOnFailure(r5)
                I0.j r5 = I0.j.this
                I0.k r5 = I0.j.c(r5)
                I0.v r5 = r5.a()
                boolean r5 = r5 instanceof I0.l
                if (r5 == 0) goto L3c
                I0.j r5 = I0.j.this
                I0.k r5 = I0.j.c(r5)
                I0.v r5 = r5.a()
                return r5
            L3c:
                I0.j r5 = I0.j.this     // Catch: java.lang.Throwable -> L1e
                r4.f2713j = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = I0.j.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                I0.j r5 = I0.j.this
                boolean r1 = r4.f2715l
                r4.f2713j = r2
                java.lang.Object r5 = I0.j.l(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                I0.v r5 = (I0.v) r5
                return r5
            L57:
                I0.q r0 = new I0.q
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0.x invoke() {
            return j.this.f2603a.a();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class q extends SuspendLambda implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2717j;

        /* renamed from: k, reason: collision with root package name */
        public int f2718k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f2720m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function2 f2721n;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f2722j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Function2 f2723k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I0.e f2724l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function2 function2, I0.e eVar, Continuation continuation) {
                super(2, continuation);
                this.f2723k = function2;
                this.f2724l = eVar;
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f2723k, this.f2724l, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f2722j;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f2723k;
                Object c6 = this.f2724l.c();
                this.f2722j = 1;
                Object invoke = function2.invoke(c6, this);
                return invoke == coroutine_suspended ? coroutine_suspended : invoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
            super(1, continuation);
            this.f2720m = coroutineContext;
            this.f2721n = function2;
        }

        public final Continuation create(Continuation continuation) {
            return new q(this.f2720m, this.f2721n, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r9 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        
            if (r9 == r0) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f2718k
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f2717j
                kotlin.ResultKt.throwOnFailure(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f2717j
                I0.e r1 = (I0.e) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L51
            L27:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L39
            L2b:
                kotlin.ResultKt.throwOnFailure(r9)
                I0.j r9 = I0.j.this
                r8.f2718k = r4
                java.lang.Object r9 = I0.j.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                I0.e r1 = (I0.e) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f2720m
                I0.j$q$a r5 = new I0.j$q$a
                kotlin.jvm.functions.Function2 r6 = r8.f2721n
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f2717j = r1
                r8.f2718k = r3
                java.lang.Object r9 = ga.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
                if (r1 != 0) goto L6b
                I0.j r1 = I0.j.this
                r8.f2717j = r9
                r8.f2718k = r2
                java.lang.Object r1 = r1.z(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class r extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f2725j;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a implements ja.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f2727a;

            public a(j jVar) {
                this.f2727a = jVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(Unit unit, Continuation continuation) {
                Object u6;
                return ((this.f2727a.f2609g.a() instanceof I0.l) || (u6 = this.f2727a.u(true, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : u6;
            }
        }

        public r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ja.f fVar, Continuation continuation) {
            return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new r(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r5.a(r1, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r5.a(r4) == r0) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f2725j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L30
            L1e:
                kotlin.ResultKt.throwOnFailure(r5)
                I0.j r5 = I0.j.this
                I0.j$b r5 = I0.j.e(r5)
                r4.f2725j = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                I0.j r5 = I0.j.this
                I0.n r5 = I0.j.b(r5)
                ja.e r5 = r5.d()
                ja.e r5 = ja.g.i(r5)
                I0.j$r$a r1 = new I0.j$r$a
                I0.j r3 = I0.j.this
                r1.<init>(r3)
                r4.f2725j = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class s extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f2728j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2729k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Function2 f2731m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f2731m = function2;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            s sVar = new s(this.f2731m, continuation);
            sVar.f2729k = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2728j;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            J j6 = (J) this.f2729k;
            ga.w b6 = ga.y.b((u0) null, 1, (Object) null);
            j.this.f2613k.e(new p.a(this.f2731m, b6, j.this.f2609g.a(), j6.getCoroutineContext()));
            this.f2728j = 1;
            Object await = b6.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class t extends Lambda implements Function1 {
        public t() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                j.this.f2609g.c(new I0.l(th));
            }
            if (j.this.f2611i.isInitialized()) {
                j.this.r().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class u extends Lambda implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final u f2733a = new u();

        public u() {
            super(2);
        }

        public final void a(p.a msg, Throwable th) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            ga.w a6 = msg.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a6.R(th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p.a) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class v extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f2734j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2735k;

        public v(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p.a aVar, Continuation continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            v vVar = new v(continuation);
            vVar.f2735k = obj;
            return vVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2734j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                p.a aVar = (p.a) this.f2735k;
                j jVar = j.this;
                this.f2734j = 1;
                if (jVar.s(aVar, this) == coroutine_suspended) {
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

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class w extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2737j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2738k;

        /* renamed from: m, reason: collision with root package name */
        public int f2740m;

        public w(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2738k = obj;
            this.f2740m |= IntCompanionObject.MIN_VALUE;
            return j.this.z(null, false, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class x extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2741j;

        /* renamed from: k, reason: collision with root package name */
        public int f2742k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2743l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f2744m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ j f2745n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f2746o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f2747p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Ref.IntRef intRef, j jVar, Object obj, boolean z6, Continuation continuation) {
            super(2, continuation);
            this.f2744m = intRef;
            this.f2745n = jVar;
            this.f2746o = obj;
            this.f2747p = z6;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(B b6, Continuation continuation) {
            return create(b6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            x xVar = new x(this.f2744m, this.f2745n, this.f2746o, this.f2747p, continuation);
            xVar.f2743l = obj;
            return xVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r3.a(r7, r6) == r0) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f2742k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f2741j
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                java.lang.Object r3 = r6.f2743l
                I0.B r3 = (I0.B) r3
                kotlin.ResultKt.throwOnFailure(r7)
                goto L45
            L26:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.f2743l
                I0.B r7 = (I0.B) r7
                kotlin.jvm.internal.Ref$IntRef r1 = r6.f2744m
                I0.j r4 = r6.f2745n
                I0.n r4 = I0.j.b(r4)
                r6.f2743l = r7
                r6.f2741j = r1
                r6.f2742k = r3
                java.lang.Object r3 = r4.e(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.element = r7
                java.lang.Object r7 = r6.f2746o
                r1 = 0
                r6.f2743l = r1
                r6.f2741j = r1
                r6.f2742k = r2
                java.lang.Object r7 = r3.a(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f2747p
                if (r7 == 0) goto L7d
                I0.j r7 = r6.f2745n
                I0.k r7 = I0.j.c(r7)
                I0.e r0 = new I0.e
                java.lang.Object r1 = r6.f2746o
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.Ref$IntRef r3 = r6.f2744m
                int r3 = r3.element
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.j.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(I0.w storage, List initTasksList, I0.d corruptionHandler, J scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2603a = storage;
        this.f2604b = corruptionHandler;
        this.f2605c = scope;
        ja.e s6 = ja.g.s(new r(null));
        D.a aVar = D.a;
        Duration.Companion companion = Duration.Companion;
        this.f2606d = ja.g.A(s6, scope, E.a(aVar, companion.getZERO-UwyO8pc(), companion.getZERO-UwyO8pc()), 0);
        this.f2607e = ja.g.s(new g(null));
        this.f2608f = ja.g.f(new d(null));
        this.f2609g = new I0.k();
        this.f2610h = new b(this, initTasksList);
        this.f2611i = LazyKt.lazy(new p());
        this.f2612j = LazyKt.lazy(new c());
        this.f2613k = new I0.t(scope, new t(), u.f2733a, new v(null));
    }

    @Override // I0.h
    public Object a(Function2 function2, Continuation continuation) {
        A a6 = (A) continuation.getContext().get(A.a.C0041a.f2580a);
        if (a6 != null) {
            a6.a(this);
        }
        return ga.i.g(new A(a6, this), new s(function2, null), continuation);
    }

    @Override // I0.h
    public ja.e getData() {
        return this.f2608f;
    }

    public final Object p(boolean z6, Function1 function1, Continuation continuation) {
        return z6 ? function1.invoke(continuation) : q().c(new e(function1, null), continuation);
    }

    public final I0.n q() {
        return (I0.n) this.f2612j.getValue();
    }

    public final I0.x r() {
        return (I0.x) this.f2611i.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(5:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53)))|27)|24))|59|6|7|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(I0.p.a r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.j.s(I0.p$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof I0.j.h
            if (r0 == 0) goto L13
            r0 = r6
            I0.j$h r0 = (I0.j.h) r0
            int r1 = r0.f2679n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2679n = r1
            goto L18
        L13:
            I0.j$h r0 = new I0.j$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2677l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2679n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f2676k
            java.lang.Object r0 = r0.f2675j
            I0.j r0 = (I0.j) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f2675j
            I0.j r2 = (I0.j) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L57
        L44:
            kotlin.ResultKt.throwOnFailure(r6)
            I0.n r6 = r5.q()
            r0.f2675j = r5
            r0.f2679n = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            I0.j$b r4 = r2.f2610h     // Catch: java.lang.Throwable -> L6f
            r0.f2675j = r2     // Catch: java.lang.Throwable -> L6f
            r0.f2676k = r6     // Catch: java.lang.Throwable -> L6f
            r0.f2679n = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            I0.k r0 = r0.f2609g
            I0.q r2 = new I0.q
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.j.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.j.u(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object v(Continuation continuation) {
        return y.a(r(), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|83|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0067, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0068, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.j.w(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object x(boolean z6, Continuation continuation) {
        return ga.i.g(this.f2605c.getCoroutineContext(), new o(z6, null), continuation);
    }

    public final Object y(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        return q().c(new q(coroutineContext, function2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.Object r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof I0.j.w
            if (r0 == 0) goto L13
            r0 = r13
            I0.j$w r0 = (I0.j.w) r0
            int r1 = r0.f2740m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2740m = r1
            goto L18
        L13:
            I0.j$w r0 = new I0.j$w
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f2738k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2740m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f2737j
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            I0.x r13 = r10.r()
            I0.j$x r4 = new I0.j$x
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f2737j = r5
            r0.f2740m = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.element
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.j.z(java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
