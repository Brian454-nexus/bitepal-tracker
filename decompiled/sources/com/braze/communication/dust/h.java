package com.braze.communication.dust;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.j;
import com.braze.managers.x;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import ga.L;
import ga.i;
import ga.u0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12106b = BrazeLogger.getBrazeLogTag((Class<?>) h.class);

    /* renamed from: a, reason: collision with root package name */
    public u0 f12107a;

    public static final String a(String str) {
        return com.braze.b.a("Received new line: '", str, '\'');
    }

    public static final String b(String str) {
        return j.a("Got un-actionable stream line:\n", str);
    }

    public static final String c(String str) {
        return j.a("Failed to parse data line:\n", str);
    }

    public static final String d(String str) {
        return j.a("Got call to startStream() for url ", str);
    }

    public static final String a(h hVar) {
        return "Got call to endStream(). Stream job: " + hVar.f12107a;
    }

    public static final String c(h hVar) {
        return "Not restarting stream since " + hVar.f12107a + " is still active.";
    }

    public static final String d(h hVar) {
        return "Started stream job " + hVar.f12107a;
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.communication.dust.h.a(com.braze.communication.dust.h.this);
            }
        }, 7, (Object) null);
        u0 u0Var = this.f12107a;
        if (u0Var != null) {
            u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f12107a = null;
    }

    public final void a(final String url, x ingestor, boolean z6) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(ingestor, "ingestor");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.communication.dust.h.d(url);
            }
        }, 7, (Object) null);
        if (z6 && this.f12107a != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.dust.h.c(com.braze.communication.dust.h.this);
                }
            }, 7, (Object) null);
            return;
        }
        i.f((CoroutineContext) null, new e(this, null), 1, (Object) null);
        this.f12107a = i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new g(this, ingestor, url, null), 3, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.communication.dust.h.d(com.braze.communication.dust.h.this);
            }
        }, 7, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(Ref.ObjectRef objectRef) {
        return "Recorded data type: " + ((String) objectRef.element);
    }

    public static final String b(h hVar) {
        return "Got call to endStreamAndJoin(). Stream job: " + hVar.f12107a;
    }

    public static final String b(String str, String str2) {
        return "Not handling event: '" + str + "' and data: '" + str2 + '\'';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ga.J r22, ia.s r23, com.braze.managers.x r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.h.a(ga.J, ia.s, com.braze.managers.x, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final String a() {
        return "Waiting to consume new line";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef) {
        return "Recorded event type: " + ((String) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        return "Handling full event on blank line. lastEventType: '" + ((String) objectRef.element) + "' \ndata: '" + ((String) objectRef2.element) + '\'';
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.braze.communication.dust.b
            if (r0 == 0) goto L13
            r0 = r14
            com.braze.communication.dust.b r0 = (com.braze.communication.dust.b) r0
            int r1 = r0.f12088d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12088d = r1
            goto L18
        L13:
            com.braze.communication.dust.b r0 = new com.braze.communication.dust.b
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f12086b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f12088d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.braze.communication.dust.h r0 = r0.f12085a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L71
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L36:
            com.braze.communication.dust.h r2 = r0.f12085a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L61
        L3c:
            kotlin.ResultKt.throwOnFailure(r14)
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = com.braze.communication.dust.h.f12106b
            R3.w r10 = new R3.w
            r10.<init>()
            r11 = 14
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            ga.u0 r14 = r13.f12107a
            if (r14 == 0) goto L70
            r0.f12085a = r13
            r0.f12088d = r4
            java.lang.Object r14 = ga.y0.d(r14, r0)
            if (r14 != r1) goto L60
            goto L6d
        L60:
            r2 = r13
        L61:
            r0.f12085a = r2
            r0.f12088d = r3
            r3 = 50
            java.lang.Object r14 = ga.U.a(r3, r0)
            if (r14 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r0 = r2
            goto L71
        L70:
            r0 = r13
        L71:
            r14 = 0
            r0.f12107a = r14
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.h.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void a(final String str, final String str2, Function1 function1) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str3 = f12106b;
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.communication.dust.h.a(str, str2);
            }
        }, 14, (Object) null);
        if (Intrinsics.areEqual(str, "msg")) {
            try {
                final JSONObject jSONObject = new JSONObject(str2);
                BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.communication.dust.h.a(jSONObject);
                    }
                }, 14, (Object) null);
                function1.invoke(com.braze.models.dust.c.f12579a.a(jSONObject));
                return;
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12106b, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: R3.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.communication.dust.h.c(str2);
                    }
                }, 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.communication.dust.h.b(str, str2);
            }
        }, 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return "Got event '" + str + "' and data: '" + str2 + '\'';
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsed dust message json to:\n" + JsonUtils.getPrettyPrintedString(jSONObject);
    }
}
