package q3;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ga.G0;
import ga.J;
import ga.Y;
import ga.i;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q3.C2012c;
import y3.InterfaceC2355a;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2010a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2010a f18659a = new C2010a();

    /* renamed from: q3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0239a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f18660j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ View f18661k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2355a f18662l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Pair f18663m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C2012c.a f18664n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f18665o;

        /* renamed from: q3.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0240a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f18666j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ View f18667k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Pair f18668l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C2012c.a f18669m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ List f18670n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2355a f18671o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0240a(View view, Pair pair, C2012c.a aVar, List list, InterfaceC2355a interfaceC2355a, Continuation continuation) {
                super(2, continuation);
                this.f18667k = view;
                this.f18668l = pair;
                this.f18669m = aVar;
                this.f18670n = list;
                this.f18671o = interfaceC2355a;
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new C0240a(this.f18667k, this.f18668l, this.f18669m, this.f18670n, this.f18671o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f18666j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return C2010a.f18659a.c(this.f18667k, this.f18668l, this.f18669m, this.f18670n, this.f18671o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0239a(View view, InterfaceC2355a interfaceC2355a, Pair pair, C2012c.a aVar, List list, Continuation continuation) {
            super(2, continuation);
            this.f18661k = view;
            this.f18662l = interfaceC2355a;
            this.f18663m = pair;
            this.f18664n = aVar;
            this.f18665o = list;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new C0239a(this.f18661k, this.f18662l, this.f18663m, this.f18664n, this.f18665o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Looper mainLooper;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f18660j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Handler handler = this.f18661k.getHandler();
                if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                    this.f18662l.a("Unable to get main looper");
                    return null;
                }
                if (Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread())) {
                    return C2010a.f18659a.c(this.f18661k, this.f18663m, this.f18664n, this.f18665o, this.f18662l);
                }
                G0 c6 = Y.c();
                C0240a c0240a = new C0240a(this.f18661k, this.f18663m, this.f18664n, this.f18665o, this.f18662l, null);
                this.f18660j = 1;
                obj = i.g(c6, c0240a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (C2012c) obj;
        }
    }

    public static final C2012c b(View view, Pair targetPosition, List viewTargetLocators, C2012c.a targetType, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return (C2012c) i.f((CoroutineContext) null, new C0239a(view, logger, targetPosition, targetType, viewTargetLocators, null), 1, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q3.C2012c c(android.view.View r6, kotlin.Pair r7, q3.C2012c.a r8, java.util.List r9, y3.InterfaceC2355a r10) {
        /*
            r5 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r0.add(r6)
            r6 = 0
        L9:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L78
            java.lang.Object r1 = r0.removeFirst()     // Catch: java.util.NoSuchElementException -> L72
            android.view.View r1 = (android.view.View) r1     // Catch: java.util.NoSuchElementException -> L72
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L23
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            kotlin.sequences.Sequence r2 = z0.AbstractC2398I.a(r2)
            kotlin.collections.CollectionsKt.addAll(r0, r2)
        L23:
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.ClassCastException -> L34
            boolean r3 = r2 instanceof java.util.Collection     // Catch: java.lang.ClassCastException -> L34
            if (r3 == 0) goto L36
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.ClassCastException -> L34
            boolean r3 = r3.isEmpty()     // Catch: java.lang.ClassCastException -> L34
            if (r3 != 0) goto L9
            goto L36
        L34:
            r1 = move-exception
            goto L5d
        L36:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassCastException -> L34
        L3a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassCastException -> L34
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassCastException -> L34
            t3.b r3 = (t3.InterfaceC2079b) r3     // Catch: java.lang.ClassCastException -> L34
            q3.c r3 = r3.a(r1, r7, r8)     // Catch: java.lang.ClassCastException -> L34
            if (r3 == 0) goto L53
            q3.c$a r6 = q3.C2012c.a.f18681a     // Catch: java.lang.ClassCastException -> L34
            if (r8 != r6) goto L52
            r6 = 1
            goto L57
        L52:
            return r3
        L53:
            r3 = 0
            r4 = r3
            r3 = r6
            r6 = r4
        L57:
            if (r6 == 0) goto L5b
            r6 = r3
            goto L9
        L5b:
            r6 = r3
            goto L3a
        L5d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while locating target in view hierarchy: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r10.a(r1)
            goto L9
        L72:
            java.lang.String r1 = "Unable to get view from queue"
            r10.a(r1)
            goto L9
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C2010a.c(android.view.View, kotlin.Pair, q3.c$a, java.util.List, y3.a):q3.c");
    }
}
