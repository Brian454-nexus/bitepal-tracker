package u3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import z3.C2459b;

/* renamed from: u3.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2145g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19202c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final B3.a f19203a;

    /* renamed from: b, reason: collision with root package name */
    public final C2141c f19204b;

    /* renamed from: u3.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: u3.g$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19205j;

        /* renamed from: k, reason: collision with root package name */
        public int f19206k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19207l;

        /* renamed from: n, reason: collision with root package name */
        public int f19209n;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19207l = obj;
            this.f19209n |= IntCompanionObject.MIN_VALUE;
            return C2145g.this.g(this);
        }
    }

    /* renamed from: u3.g$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19210j;

        /* renamed from: k, reason: collision with root package name */
        public long f19211k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19212l;

        /* renamed from: n, reason: collision with root package name */
        public int f19214n;

        public c(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19212l = obj;
            this.f19214n |= IntCompanionObject.MIN_VALUE;
            return C2145g.this.i(null, null, null, this);
        }
    }

    /* renamed from: u3.g$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19215j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19216k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19217l;

        /* renamed from: n, reason: collision with root package name */
        public int f19219n;

        public d(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19217l = obj;
            this.f19219n |= IntCompanionObject.MIN_VALUE;
            return C2145g.this.j(this);
        }
    }

    /* renamed from: u3.g$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public e(Object obj) {
            super(1, obj, C2141c.class, "removeEvent", "removeEvent(J)V", 0);
        }

        public final void a(long j6) {
            ((C2141c) this.receiver).o0(j6);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: u3.g$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19220j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19221k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19222l;

        /* renamed from: n, reason: collision with root package name */
        public int f19224n;

        public f(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19222l = obj;
            this.f19224n |= IntCompanionObject.MIN_VALUE;
            return C2145g.this.k(this);
        }
    }

    /* renamed from: u3.g$g, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class C0251g extends FunctionReferenceImpl implements Function1 {
        public C0251g(Object obj) {
            super(1, obj, C2141c.class, "removeIdentify", "removeIdentify(J)V", 0);
        }

        public final void a(long j6) {
            ((C2141c) this.receiver).q0(j6);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: u3.g$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19225j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19226k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19227l;

        /* renamed from: n, reason: collision with root package name */
        public int f19229n;

        public h(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19227l = obj;
            this.f19229n |= IntCompanionObject.MIN_VALUE;
            return C2145g.this.l(this);
        }
    }

    /* renamed from: u3.g$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class i extends FunctionReferenceImpl implements Function1 {
        public i(Object obj) {
            super(1, obj, C2141c.class, "removeInterceptedIdentify", "removeInterceptedIdentify(J)V", 0);
        }

        public final void a(long j6) {
            ((C2141c) this.receiver).r0(j6);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: u3.g$j */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class j extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19230j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19231k;

        /* renamed from: l, reason: collision with root package name */
        public Object f19232l;

        /* renamed from: m, reason: collision with root package name */
        public Object f19233m;

        /* renamed from: n, reason: collision with root package name */
        public Object f19234n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f19235o;

        /* renamed from: q, reason: collision with root package name */
        public int f19237q;

        public j(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19235o = obj;
            this.f19237q |= IntCompanionObject.MIN_VALUE;
            return C2145g.this.m(this);
        }
    }

    public C2145g(B3.a amplitude, C2141c databaseStorage) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(databaseStorage, "databaseStorage");
        this.f19203a = amplitude;
        this.f19204b = databaseStorage;
    }

    public final long f(JSONObject jSONObject) {
        long j6 = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j6);
        JSONObject optJSONObject = jSONObject.optJSONObject("library");
        if (optJSONObject != null) {
            jSONObject.put("library", optJSONObject.getString(com.amazon.a.a.h.a.f10906a) + '/' + optJSONObject.getString("version"));
        }
        Object opt = jSONObject.opt("timestamp");
        if (opt != null) {
            jSONObject.put(com.amazon.a.a.h.a.f10907b, opt);
        }
        Object opt2 = jSONObject.opt("uuid");
        if (opt2 != null) {
            jSONObject.put("insert_id", opt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (optJSONObject2 != null) {
            Object opt3 = optJSONObject2.opt("androidADID");
            if (opt3 != null) {
                Intrinsics.checkNotNull(opt3);
                jSONObject.put("adid", opt3);
            }
            Object opt4 = optJSONObject2.opt("android_app_set_id");
            if (opt4 != null) {
                Intrinsics.checkNotNull(opt4);
                jSONObject.put("android_app_set_id", opt4);
            }
            Object opt5 = optJSONObject2.opt("productId");
            if (opt5 != null) {
                Intrinsics.checkNotNull(opt5);
                jSONObject.put("productId", opt5);
            }
            Object opt6 = optJSONObject2.opt("quantity");
            if (opt6 != null) {
                Intrinsics.checkNotNull(opt6);
                jSONObject.put("quantity", opt6);
            }
            Object opt7 = optJSONObject2.opt(com.amazon.a.a.o.b.f11220x);
            if (opt7 != null) {
                Intrinsics.checkNotNull(opt7);
                jSONObject.put(com.amazon.a.a.o.b.f11220x, opt7);
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("location");
            if (optJSONObject3 != null) {
                Intrinsics.checkNotNull(optJSONObject3);
                Object opt8 = optJSONObject3.opt("lat");
                if (opt8 != null) {
                    Intrinsics.checkNotNull(opt8);
                    jSONObject.put("location_lat", opt8);
                }
                Object opt9 = optJSONObject3.opt("lng");
                if (opt9 != null) {
                    Intrinsics.checkNotNull(opt9);
                    jSONObject.put("location_lng", opt9);
                }
            }
        }
        Object opt10 = jSONObject.opt("$productId");
        if (opt10 != null) {
            jSONObject.put("productId", opt10);
        }
        Object opt11 = jSONObject.opt("$quantity");
        if (opt11 != null) {
            jSONObject.put("quantity", opt11);
        }
        Object opt12 = jSONObject.opt("$price");
        if (opt12 != null) {
            jSONObject.put(com.amazon.a.a.o.b.f11220x, opt12);
        }
        Object opt13 = jSONObject.opt("$revenueType");
        if (opt13 != null) {
            jSONObject.put("revenueType", opt13);
        }
        return j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
    
        if (r6.c(r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (r6.c(r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r2.k(r0) != r1) goto L38;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r6) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2145g.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h() {
        try {
            String I6 = this.f19204b.I("device_id");
            String I7 = this.f19204b.I("user_id");
            if (I6 == null && I7 == null) {
                return;
            }
            J3.e a6 = this.f19203a.r().a();
            if (a6.a() == null && I6 != null) {
                this.f19203a.r().b(I6);
            }
            if (a6.b() != null || I7 == null) {
                return;
            }
            this.f19203a.r().c(I7);
        } catch (Exception e6) {
            C2459b.f21719c.a().a("device/user id migration failed: " + e6.getMessage());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        z3.C2459b.f21719c.a().a("event migration failed: " + r7.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(org.json.JSONObject r7, B3.f r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof u3.C2145g.c
            if (r0 == 0) goto L13
            r0 = r10
            u3.g$c r0 = (u3.C2145g.c) r0
            int r1 = r0.f19214n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19214n = r1
            goto L18
        L13:
            u3.g$c r0 = new u3.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19212l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19214n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r7 = r0.f19211k
            java.lang.Object r9 = r0.f19210j
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L2f
            goto L52
        L2f:
            r7 = move-exception
            goto L5a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            long r4 = r6.f(r7)     // Catch: java.lang.Exception -> L2f
            C3.a r7 = G3.p.g(r7)     // Catch: java.lang.Exception -> L2f
            r0.f19210j = r9     // Catch: java.lang.Exception -> L2f
            r0.f19211k = r4     // Catch: java.lang.Exception -> L2f
            r0.f19214n = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r8.d(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r1) goto L51
            return r1
        L51:
            r7 = r4
        L52:
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)     // Catch: java.lang.Exception -> L2f
            r9.invoke(r7)     // Catch: java.lang.Exception -> L2f
            goto L78
        L5a:
            z3.b$a r8 = z3.C2459b.f21719c
            z3.b r8 = r8.a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "event migration failed: "
            r9.append(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.a(r7)
        L78:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2145g.i(org.json.JSONObject, B3.f, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|31|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        z3.C2459b.f21719c.a().a("events migration failed: " + r9.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:11:0x002d, B:13:0x004a, B:15:0x0050, B:28:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof u3.C2145g.d
            if (r0 == 0) goto L13
            r0 = r9
            u3.g$d r0 = (u3.C2145g.d) r0
            int r1 = r0.f19219n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19219n = r1
            goto L18
        L13:
            u3.g$d r0 = new u3.g$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19217l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19219n
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.f19216k
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f19215j
            u3.g r4 = (u3.C2145g) r4
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L31
            goto L4a
        L31:
            r9 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            u3.c r9 = r8.f19204b     // Catch: java.lang.Exception -> L31
            java.util.List r9 = r9.Y()     // Catch: java.lang.Exception -> L31
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L31
            r4 = r8
            r2 = r9
        L4a:
            boolean r9 = r2.hasNext()     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Exception -> L31
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Exception -> L31
            B3.a r5 = r4.f19203a     // Catch: java.lang.Exception -> L31
            B3.f r5 = r5.u()     // Catch: java.lang.Exception -> L31
            u3.g$e r6 = new u3.g$e     // Catch: java.lang.Exception -> L31
            u3.c r7 = r4.f19204b     // Catch: java.lang.Exception -> L31
            r6.<init>(r7)     // Catch: java.lang.Exception -> L31
            r0.f19215j = r4     // Catch: java.lang.Exception -> L31
            r0.f19216k = r2     // Catch: java.lang.Exception -> L31
            r0.f19219n = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = r4.i(r9, r5, r6, r0)     // Catch: java.lang.Exception -> L31
            if (r9 != r1) goto L4a
            return r1
        L70:
            z3.b$a r0 = z3.C2459b.f21719c
            z3.b r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "events migration failed: "
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.a(r9)
        L8e:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2145g.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|31|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        z3.C2459b.f21719c.a().a("identifies migration failed: " + r9.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:11:0x002d, B:13:0x004a, B:15:0x0050, B:28:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof u3.C2145g.f
            if (r0 == 0) goto L13
            r0 = r9
            u3.g$f r0 = (u3.C2145g.f) r0
            int r1 = r0.f19224n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19224n = r1
            goto L18
        L13:
            u3.g$f r0 = new u3.g$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19222l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19224n
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.f19221k
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f19220j
            u3.g r4 = (u3.C2145g) r4
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L31
            goto L4a
        L31:
            r9 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            u3.c r9 = r8.f19204b     // Catch: java.lang.Exception -> L31
            java.util.List r9 = r9.f0()     // Catch: java.lang.Exception -> L31
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L31
            r4 = r8
            r2 = r9
        L4a:
            boolean r9 = r2.hasNext()     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Exception -> L31
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Exception -> L31
            B3.a r5 = r4.f19203a     // Catch: java.lang.Exception -> L31
            B3.f r5 = r5.u()     // Catch: java.lang.Exception -> L31
            u3.g$g r6 = new u3.g$g     // Catch: java.lang.Exception -> L31
            u3.c r7 = r4.f19204b     // Catch: java.lang.Exception -> L31
            r6.<init>(r7)     // Catch: java.lang.Exception -> L31
            r0.f19220j = r4     // Catch: java.lang.Exception -> L31
            r0.f19221k = r2     // Catch: java.lang.Exception -> L31
            r0.f19224n = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = r4.i(r9, r5, r6, r0)     // Catch: java.lang.Exception -> L31
            if (r9 != r1) goto L4a
            return r1
        L70:
            z3.b$a r0 = z3.C2459b.f21719c
            z3.b r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "identifies migration failed: "
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.a(r9)
        L8e:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2145g.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|31|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        z3.C2459b.f21719c.a().a("intercepted identifies migration failed: " + r9.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:11:0x002d, B:13:0x004a, B:15:0x0050, B:28:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof u3.C2145g.h
            if (r0 == 0) goto L13
            r0 = r9
            u3.g$h r0 = (u3.C2145g.h) r0
            int r1 = r0.f19229n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19229n = r1
            goto L18
        L13:
            u3.g$h r0 = new u3.g$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19227l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19229n
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.f19226k
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f19225j
            u3.g r4 = (u3.C2145g) r4
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L31
            goto L4a
        L31:
            r9 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            u3.c r9 = r8.f19204b     // Catch: java.lang.Exception -> L31
            java.util.List r9 = r9.k0()     // Catch: java.lang.Exception -> L31
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L31
            r4 = r8
            r2 = r9
        L4a:
            boolean r9 = r2.hasNext()     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Exception -> L31
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Exception -> L31
            B3.a r5 = r4.f19203a     // Catch: java.lang.Exception -> L31
            B3.f r5 = r5.q()     // Catch: java.lang.Exception -> L31
            u3.g$i r6 = new u3.g$i     // Catch: java.lang.Exception -> L31
            u3.c r7 = r4.f19204b     // Catch: java.lang.Exception -> L31
            r6.<init>(r7)     // Catch: java.lang.Exception -> L31
            r0.f19225j = r4     // Catch: java.lang.Exception -> L31
            r0.f19226k = r2     // Catch: java.lang.Exception -> L31
            r0.f19229n = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = r4.i(r9, r5, r6, r0)     // Catch: java.lang.Exception -> L31
            if (r9 != r1) goto L4a
            return r1
        L70:
            z3.b$a r0 = z3.C2459b.f21719c
            z3.b r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "intercepted identifies migration failed: "
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.a(r9)
        L8e:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2145g.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(6:21|22|23|(3:26|(2:29|14)|28)|15|16))(2:30|31))(9:40|41|(1:43)(1:60)|44|(1:46)(1:59)|47|(1:49)(1:58)|50|(6:57|33|(2:36|(2:38|28)(2:39|23))|(3:26|(0)|28)|15|16)(2:53|(2:55|28)(1:56)))|32|33|(2:36|(0)(0))|(0)|15|16))|63|6|7|(0)(0)|32|33|(0)|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        z3.C2459b.f21719c.a().a("session data migration failed: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2145g.m(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
