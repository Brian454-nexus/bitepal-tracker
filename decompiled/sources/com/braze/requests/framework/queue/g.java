package com.braze.requests.framework.queue;

import com.braze.requests.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends com.braze.requests.framework.b {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12820k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.braze.dispatch.h dispatchDataProvider) {
        super(m.f12840m, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f12820k = true;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j6) {
        c(j6);
    }

    @Override // com.braze.requests.framework.b
    public final boolean c() {
        return this.f12820k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j6, com.braze.requests.framework.h requestInfo, com.braze.models.response.a apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j6, requestInfo, apiResponse);
        requestInfo.a(j6, com.braze.requests.framework.i.f12817e);
    }
}
