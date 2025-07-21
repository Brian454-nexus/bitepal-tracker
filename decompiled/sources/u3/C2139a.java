package u3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import w3.C2248f;
import y3.InterfaceC2355a;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2139a {

    /* renamed from: a, reason: collision with root package name */
    public final C2248f f19157a;

    /* renamed from: b, reason: collision with root package name */
    public final C2248f f19158b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2355a f19159c;

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0250a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19160j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f19161k;

        /* renamed from: m, reason: collision with root package name */
        public int f19163m;

        public C0250a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19161k = obj;
            this.f19163m |= IntCompanionObject.MIN_VALUE;
            return C2139a.this.d(this);
        }
    }

    /* renamed from: u3.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19164j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19165k;

        /* renamed from: l, reason: collision with root package name */
        public Object f19166l;

        /* renamed from: m, reason: collision with root package name */
        public Object f19167m;

        /* renamed from: n, reason: collision with root package name */
        public Object f19168n;

        /* renamed from: o, reason: collision with root package name */
        public Object f19169o;

        /* renamed from: p, reason: collision with root package name */
        public int f19170p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f19171q;

        /* renamed from: s, reason: collision with root package name */
        public int f19173s;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19171q = obj;
            this.f19173s |= IntCompanionObject.MIN_VALUE;
            return C2139a.this.e(this);
        }
    }

    /* renamed from: u3.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19174j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19175k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f19176l;

        /* renamed from: n, reason: collision with root package name */
        public int f19178n;

        public c(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19176l = obj;
            this.f19178n |= IntCompanionObject.MIN_VALUE;
            return C2139a.this.f(null, this);
        }
    }

    /* renamed from: u3.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f19179j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f19180k;

        /* renamed from: m, reason: collision with root package name */
        public int f19182m;

        public d(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19180k = obj;
            this.f19182m |= IntCompanionObject.MIN_VALUE;
            return C2139a.this.g(this);
        }
    }

    public C2139a(C2248f source, C2248f destination, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f19157a = source;
        this.f19158b = destination;
        this.f19159c = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.g(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof u3.C2139a.C0250a
            if (r0 == 0) goto L13
            r0 = r6
            u3.a$a r0 = (u3.C2139a.C0250a) r0
            int r1 = r0.f19163m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19163m = r1
            goto L18
        L13:
            u3.a$a r0 = new u3.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19161k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19163m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f19160j
            u3.a r2 = (u3.C2139a) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4b
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f19160j = r5
            r0.f19163m = r4
            java.lang.Object r6 = r5.e(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f19160j = r6
            r0.f19163m = r3
            java.lang.Object r6 = r2.g(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2139a.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(4:(1:(1:(1:(4:13|14|15|16)(2:18|19))(11:20|21|22|23|24|(7:27|28|29|30|32|(1:34)(2:36|37)|25)|42|43|44|(2:46|(1:48)(9:49|50|51|24|(1:25)|42|43|44|(1:52)(0)))(0)|35))(13:58|59|60|61|50|51|24|(1:25)|42|43|44|(0)(0)|35))(3:66|67|68)|65|15|16)(5:77|78|79|(1:81)(0)|35)|69|(2:71|72)(5:73|74|44|(0)(0)|35)))|86|6|7|(0)(0)|69|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b6, code lost:
    
        if (r4.c(r0) == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x003b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:14:0x0036, B:25:0x010c, B:27:0x0112, B:40:0x013c, B:43:0x016a, B:44:0x00ce, B:46:0x00d5, B:51:0x00f8, B:52:0x019d), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:14:0x0036, B:25:0x010c, B:27:0x0112, B:40:0x013c, B:43:0x016a, B:44:0x00ce, B:46:0x00d5, B:51:0x00f8, B:52:0x019d), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:14:0x0036, B:25:0x010c, B:27:0x0112, B:40:0x013c, B:43:0x016a, B:44:0x00ce, B:46:0x00d5, B:51:0x00f8, B:52:0x019d), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf A[Catch: Exception -> 0x0098, TryCatch #4 {Exception -> 0x0098, blocks: (B:68:0x0094, B:69:0x00ae, B:71:0x00bf, B:73:0x00c7), top: B:67:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7 A[Catch: Exception -> 0x0098, TRY_LEAVE, TryCatch #4 {Exception -> 0x0098, blocks: (B:68:0x0094, B:69:0x00ae, B:71:0x00bf, B:73:0x00c7), top: B:67:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f8 -> B:24:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2139a.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(3:18|19|20))(4:34|35|36|(2:38|39)(3:40|(2:43|44)|42))|22|23))|52|6|7|(0)(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (r10.n(r9, r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r2.j(r9, r10, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0037, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(B3.f.a r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2139a.f(B3.f$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
    
        if (r2.f(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (r2.f(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r2.f(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r2.f(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r2.f(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r2.f(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2139a.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
