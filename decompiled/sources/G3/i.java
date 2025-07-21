package G3;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.RangesKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1817e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f1818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1819b;

    /* renamed from: c, reason: collision with root package name */
    public final double f1820c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicInteger f1821d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1822j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1823k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f1824l;

        /* renamed from: n, reason: collision with root package name */
        public int f1826n;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1824l = obj;
            this.f1826n |= IntCompanionObject.MIN_VALUE;
            return i.this.a(null, this);
        }
    }

    public i(int i6, int i7, double d6) {
        this.f1818a = i6;
        this.f1819b = i7;
        this.f1820c = d6;
        this.f1821d = new AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof G3.i.b
            if (r0 == 0) goto L13
            r0 = r8
            G3.i$b r0 = (G3.i.b) r0
            int r1 = r0.f1826n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1826n = r1
            goto L18
        L13:
            G3.i$b r0 = new G3.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1824l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1826n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f1823k
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r0 = r0.f1822j
            G3.i r0 = (G3.i) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5f
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r6.b()
            if (r8 != 0) goto L4d
            r8 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            r7.invoke(r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4d:
            long r4 = r6.c()
            r0.f1822j = r6
            r0.f1823k = r7
            r0.f1826n = r3
            java.lang.Object r8 = ga.U.a(r4, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r0 = r6
        L5f:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r7.invoke(r8)
            java.util.concurrent.atomic.AtomicInteger r7 = r0.f1821d
            r7.incrementAndGet()
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.i.a(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b() {
        return this.f1821d.get() < this.f1818a;
    }

    public final long c() {
        return (long) (this.f1819b * Math.pow(this.f1820c, this.f1821d.get()));
    }

    public final long d() {
        return RangesKt.coerceAtMost(60000, this.f1819b * ((int) Math.pow(this.f1820c, this.f1818a + 1)));
    }

    public final int e() {
        return this.f1818a;
    }

    public final void f() {
        this.f1821d.set(0);
    }

    public /* synthetic */ i(int i6, int i7, double d6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 5 : i6, (i8 & 2) != 0 ? 1000 : i7, (i8 & 4) != 0 ? 2.0d : d6);
    }
}
