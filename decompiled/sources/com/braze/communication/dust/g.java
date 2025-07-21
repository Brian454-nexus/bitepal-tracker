package com.braze.communication.dust;

import com.braze.j;
import com.braze.managers.x;
import ga.J;
import java.net.HttpURLConnection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f12099a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f12100b;

    /* renamed from: c, reason: collision with root package name */
    public int f12101c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f12103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f12104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, x xVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f12103e = hVar;
        this.f12104f = xVar;
        this.f12105g = str;
    }

    public static final String a(String str) {
        return j.a("Starting DUST stream to ", str);
    }

    public static final String b() {
        return "Caught unexpected exception listening to DUST stream";
    }

    public static final String c() {
        return "Stream connection job cancelled";
    }

    public static final String d() {
        return "Closing stream connection data";
    }

    public static final String e() {
        return "Stream job finished";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f12103e, this.f12104f, this.f12105g, continuation);
        gVar.f12102d = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fe, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0158, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(com.braze.support.BrazeLogger.INSTANCE, com.braze.communication.dust.h.f12106b, (com.braze.support.BrazeLogger.Priority) null, (java.lang.Throwable) null, false, new R3.i(), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x016c, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0155, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0153, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:8:0x0018, B:9:0x00da, B:19:0x0111, B:21:0x0117, B:24:0x012a, B:33:0x0089, B:35:0x00b6, B:37:0x00cc, B:39:0x00d2, B:60:0x0062), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012a A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #3 {all -> 0x0104, blocks: (B:8:0x0018, B:9:0x00da, B:19:0x0111, B:21:0x0117, B:24:0x012a, B:33:0x0089, B:35:0x00b6, B:37:0x00cc, B:39:0x00d2, B:60:0x0062), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.net.HttpURLConnection, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef) {
        return "DUST stream response code " + ((HttpURLConnection) objectRef.element).getResponseCode();
    }

    public static final String a() {
        return "Stream job coroutine no longer active";
    }
}
