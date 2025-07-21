package com.braze.requests;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f12824a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.managers.m f12825b;

    public h(com.braze.events.e internalEventPublisher, com.braze.managers.m brazeManager) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f12824a = internalEventPublisher;
        this.f12825b = brazeManager;
        new ArrayList();
    }

    @Override // com.braze.requests.p
    public final void a(com.braze.requests.framework.h requestInfo, com.braze.requests.framework.c requestDispatchCallback, boolean z6) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        final n nVar = requestInfo.f12805a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.G
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.h.a(com.braze.requests.n.this);
            }
        }, 7, (Object) null);
        com.braze.models.response.g gVar = new com.braze.models.response.g(nVar, new com.braze.communication.d(201, MapsKt.emptyMap(), 4), this.f12825b);
        com.braze.events.e eVar = this.f12824a;
        nVar.a(eVar, eVar, gVar);
        nVar.a(this.f12824a);
        requestDispatchCallback.a(gVar);
        ((com.braze.events.d) this.f12824a).b(new com.braze.events.internal.g(nVar), com.braze.events.internal.g.class);
    }

    public static final String a(n nVar) {
        return "Short circuiting execution of network request (" + nVar.hashCode() + ") and immediately marking it as succeeded.";
    }
}
