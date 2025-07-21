package I0;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2584a = new a(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: I0.g$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0042a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f2585j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f2586k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ List f2587l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0042a(List list, Continuation continuation) {
                super(2, continuation);
                this.f2587l = list;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m mVar, Continuation continuation) {
                return create(mVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                C0042a c0042a = new C0042a(this.f2587l, continuation);
                c0042a.f2586k = obj;
                return c0042a;
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f2585j;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    m mVar = (m) this.f2586k;
                    a aVar = g.f2584a;
                    List list = this.f2587l;
                    this.f2585j = 1;
                    if (aVar.c(list, mVar, this) == coroutine_suspended) {
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
        public static final class b extends ContinuationImpl {

            /* renamed from: j, reason: collision with root package name */
            public Object f2588j;

            /* renamed from: k, reason: collision with root package name */
            public Object f2589k;

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f2590l;

            /* renamed from: n, reason: collision with root package name */
            public int f2592n;

            public b(Continuation continuation) {
                super(continuation);
            }

            public final Object invokeSuspend(Object obj) {
                this.f2590l = obj;
                this.f2592n |= IntCompanionObject.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public Object f2593j;

            /* renamed from: k, reason: collision with root package name */
            public Object f2594k;

            /* renamed from: l, reason: collision with root package name */
            public Object f2595l;

            /* renamed from: m, reason: collision with root package name */
            public int f2596m;

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f2597n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ List f2598o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ List f2599p;

            /* renamed from: I0.g$a$c$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class C0043a extends SuspendLambda implements Function1 {

                /* renamed from: j, reason: collision with root package name */
                public int f2600j;

                public C0043a(f fVar, Continuation continuation) {
                    super(1, continuation);
                }

                public final Continuation create(Continuation continuation) {
                    return new C0043a(null, continuation);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i6 = this.f2600j;
                    if (i6 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f2600j = 1;
                        throw null;
                    }
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation continuation) {
                    return create(continuation).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, Continuation continuation) {
                super(2, continuation);
                this.f2598o = list;
                this.f2599p = list2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, Continuation continuation) {
                return create(obj, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Continuation create(Object obj, Continuation continuation) {
                c cVar = new c(this.f2598o, this.f2599p, continuation);
                cVar.f2597n = obj;
                return cVar;
            }

            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f2596m;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    obj = this.f2597n;
                    List list2 = this.f2598o;
                    list = this.f2599p;
                    it = list2.iterator();
                } else if (i6 == 1) {
                    Object obj2 = this.f2595l;
                    android.support.v4.media.session.b.a(this.f2594k);
                    Iterator it2 = (Iterator) this.f2593j;
                    List list3 = (List) this.f2597n;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0043a(null, null));
                        this.f2597n = list3;
                        this.f2593j = it2;
                        this.f2594k = null;
                        this.f2595l = null;
                        this.f2596m = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f2593j;
                    list = (List) this.f2597n;
                    ResultKt.throwOnFailure(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                android.support.v4.media.session.b.a(it.next());
                this.f2597n = list;
                this.f2593j = it;
                this.f2594k = null;
                this.f2595l = obj;
                this.f2596m = 1;
                throw null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0042a(migrations, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(java.util.List r7, I0.m r8, kotlin.coroutines.Continuation r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof I0.g.a.b
                if (r0 == 0) goto L13
                r0 = r9
                I0.g$a$b r0 = (I0.g.a.b) r0
                int r1 = r0.f2592n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2592n = r1
                goto L18
            L13:
                I0.g$a$b r0 = new I0.g$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f2590l
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f2592n
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f2589k
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f2588j
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f2588j
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.throwOnFailure(r9)
                goto L60
            L46:
                kotlin.ResultKt.throwOnFailure(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                I0.g$a$c r2 = new I0.g$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f2588j = r9
                r0.f2592n = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L83
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r0.f2588j = r8     // Catch: java.lang.Throwable -> L34
                r0.f2589k = r7     // Catch: java.lang.Throwable -> L34
                r0.f2592n = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
            L83:
                return r1
            L84:
                T r2 = r8.element
                if (r2 != 0) goto L8b
                r8.element = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.ExceptionsKt.addSuppressed(r2, r9)
                goto L6b
            L94:
                T r7 = r8.element
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.g.a.c(java.util.List, I0.m, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public a() {
        }
    }
}
