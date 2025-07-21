package o3;

import B3.f;
import ga.J;
import ga.L;
import ga.i;
import ia.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends D3.g {

    /* renamed from: c, reason: collision with root package name */
    public final Long f17944c;

    /* renamed from: d, reason: collision with root package name */
    public final ia.d f17945d = ia.g.b(IntCompanionObject.MAX_VALUE, (ia.a) null, (Function1) null, 6, (Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f17946e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17947f;

    /* renamed from: g, reason: collision with root package name */
    public long f17948g;

    /* renamed from: h, reason: collision with root package name */
    public long f17949h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f17950j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f17952l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j6, Continuation continuation) {
            super(2, continuation);
            this.f17952l = j6;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f17952l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r1.y((java.util.List) r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r7 == r0) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f17950j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L44
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L2e
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                o3.f r7 = o3.f.this
                long r4 = r6.f17952l
                r6.f17950j = r3
                java.lang.Object r7 = o3.f.s(r7, r4, r6)
                if (r7 != r0) goto L2e
                goto L43
            L2e:
                java.util.List r7 = (java.util.List) r7
                o3.f r1 = o3.f.this
                java.util.concurrent.atomic.AtomicBoolean r1 = o3.f.i(r1)
                r1.set(r3)
                o3.f r1 = o3.f.this
                r6.f17950j = r2
                java.lang.Object r7 = o3.f.l(r1, r7, r6)
                if (r7 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f17953j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f17955l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j6, Continuation continuation) {
            super(2, continuation);
            this.f17955l = j6;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f17955l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f17953j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = f.this;
                long j6 = this.f17955l;
                this.f17953j = 1;
                if (fVar.B(j6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            f.this.f17947f.set(false);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f17956j;

        /* renamed from: k, reason: collision with root package name */
        public Object f17957k;

        /* renamed from: l, reason: collision with root package name */
        public long f17958l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f17959m;

        /* renamed from: o, reason: collision with root package name */
        public int f17961o;

        public c(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17959m = obj;
            this.f17961o |= IntCompanionObject.MIN_VALUE;
            return f.this.z(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f17962j;

        /* renamed from: k, reason: collision with root package name */
        public int f17963k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B3.a f17964l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f17965m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(B3.a aVar, f fVar, Continuation continuation) {
            super(2, continuation);
            this.f17964l = aVar;
            this.f17965m = fVar;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f17964l, this.f17965m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
        
            if (r4.z(r11, r10) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (r11.await(r10) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00b8 -> B:7:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f17963k
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r10.f17962j
                ia.f r1 = (ia.f) r1
                kotlin.ResultKt.throwOnFailure(r11)
            L18:
                r11 = r1
                goto L92
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                java.lang.Object r1 = r10.f17962j
                ia.f r1 = (ia.f) r1
                kotlin.ResultKt.throwOnFailure(r11)
                goto La0
            L2c:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L43
            L30:
                kotlin.ResultKt.throwOnFailure(r11)
                B3.a r11 = r10.f17964l
                ga.Q r11 = r11.z()
                r10.f17963k = r4
                java.lang.Object r11 = r11.await(r10)
                if (r11 != r0) goto L43
                goto Lba
            L43:
                o3.f r11 = r10.f17965m
                java.lang.Long r11 = o3.f.j(r11)
                if (r11 != 0) goto L64
                o3.f r11 = r10.f17965m
                java.util.concurrent.atomic.AtomicLong r11 = o3.f.k(r11)
                o3.f r1 = r10.f17965m
                B3.a r4 = r10.f17964l
                B3.f r4 = r4.u()
                B3.f$a r5 = B3.f.a.f373c
                r6 = -1
                long r4 = o3.f.n(r1, r4, r5, r6)
                r11.set(r4)
            L64:
                o3.f r11 = r10.f17965m
                B3.a r1 = r10.f17964l
                B3.f r1 = r1.u()
                B3.f$a r4 = B3.f.a.f372b
                r5 = 0
                long r7 = o3.f.n(r11, r1, r4, r5)
                o3.f.p(r11, r7)
                o3.f r11 = r10.f17965m
                B3.a r1 = r10.f17964l
                B3.f r1 = r1.u()
                B3.f$a r4 = B3.f.a.f374d
                long r4 = o3.f.n(r11, r1, r4, r5)
                o3.f.q(r11, r4)
                o3.f r11 = r10.f17965m
                ia.d r11 = o3.f.h(r11)
                ia.f r11 = r11.iterator()
            L92:
                r10.f17962j = r11
                r10.f17963k = r3
                java.lang.Object r1 = r11.a(r10)
                if (r1 != r0) goto L9d
                goto Lba
            L9d:
                r9 = r1
                r1 = r11
                r11 = r9
            La0:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbb
                java.lang.Object r11 = r1.next()
                o3.e r11 = (o3.e) r11
                o3.f r4 = r10.f17965m
                r10.f17962j = r1
                r10.f17963k = r2
                java.lang.Object r11 = o3.f.m(r4, r11, r10)
                if (r11 != r0) goto L18
            Lba:
                return r0
            Lbb:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f17966j;

        /* renamed from: k, reason: collision with root package name */
        public Object f17967k;

        /* renamed from: l, reason: collision with root package name */
        public long f17968l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f17969m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f17970n;

        /* renamed from: p, reason: collision with root package name */
        public int f17972p;

        public e(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17970n = obj;
            this.f17972p |= IntCompanionObject.MIN_VALUE;
            return f.this.E(0L, this);
        }
    }

    /* renamed from: o3.f$f, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0230f extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f17973j;

        /* renamed from: l, reason: collision with root package name */
        public int f17975l;

        public C0230f(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17973j = obj;
            this.f17975l |= IntCompanionObject.MIN_VALUE;
            return f.this.F(0L, this);
        }
    }

    public f(Long l6) {
        this.f17944c = l6;
        this.f17946e = new AtomicLong(l6 != null ? l6.longValue() : -1L);
        this.f17947f = new AtomicBoolean(false);
    }

    public final long A(B3.f fVar, f.a aVar, long j6) {
        Long longOrNull;
        String f6 = fVar.f(aVar);
        return (f6 == null || (longOrNull = StringsKt.toLongOrNull(f6)) == null) ? j6 : longOrNull.longValue();
    }

    public final Object B(long j6, Continuation continuation) {
        if (!u()) {
            return Unit.INSTANCE;
        }
        this.f17949h = j6;
        Object j7 = e().u().j(f.a.f374d, String.valueOf(this.f17949h), continuation);
        return j7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j7 : Unit.INSTANCE;
    }

    public final Object C(long j6, Continuation continuation) {
        this.f17946e.set(j6);
        Object j7 = e().u().j(f.a.f373c, String.valueOf(t()), continuation);
        return j7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j7 : Unit.INSTANCE;
    }

    public final void D() {
        B3.a e6 = e();
        i.d(e6.l(), e6.v(), (L) null, new d(e6, this, null), 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(long r18, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.f.E(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (B(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o3.f.C0230f
            if (r0 == 0) goto L13
            r0 = r8
            o3.f$f r0 = (o3.f.C0230f) r0
            int r1 = r0.f17975l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17975l = r1
            goto L18
        L13:
            o3.f$f r0 = new o3.f$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17973j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17975l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L50
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r5.u()
            if (r8 == 0) goto L55
            boolean r8 = r5.v(r6)
            if (r8 == 0) goto L55
            r0.f17975l = r4
            java.lang.Object r6 = r5.B(r6, r0)
            if (r6 != r1) goto L50
            goto L5d
        L50:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            return r6
        L55:
            r0.f17975l = r3
            java.lang.Object r6 = r5.E(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.f.F(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G() {
        s.a.a(this.f17945d, (CancellationException) null, 1, (Object) null);
    }

    @Override // D3.g
    public void f(C3.a incomingEvent) {
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        if (incomingEvent.M() == null) {
            incomingEvent.B0(Long.valueOf(System.currentTimeMillis()));
        }
        this.f17945d.h(new o3.e(incomingEvent));
    }

    public final long t() {
        return this.f17946e.get();
    }

    public final boolean u() {
        return t() > -1;
    }

    public final boolean v(long j6) {
        B3.b m6 = e().m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        return j6 - this.f17949h < ((o3.c) m6).J();
    }

    public final void w(long j6) {
        i.d(e().l(), e().v(), (L) null, new a(j6, null), 2, (Object) null);
    }

    public final void x(long j6) {
        i.d(e().l(), e().v(), (L) null, new b(j6, null), 2, (Object) null);
    }

    public final Object y(List list, Continuation continuation) {
        Object j6;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        long j7 = this.f17948g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3.a aVar = (C3.a) it.next();
            Long p6 = aVar.p();
            if (p6 == null) {
                long j8 = this.f17948g + 1;
                this.f17948g = j8;
                p6 = Boxing.boxLong(j8);
            }
            aVar.e0(p6);
            super.f(aVar);
        }
        return (this.f17948g <= j7 || (j6 = e().u().j(f.a.f372b, String.valueOf(this.f17948g), continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        if (r2.y((java.util.List) r10, r0) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0105, code lost:
    
        if (r2.y(r9, r0) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r2.B(r3, r0) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (B(r2, r0) == r1) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(o3.e r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.f.z(o3.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
