package com.braze.requests.framework.queue;

import com.braze.requests.m;
import com.braze.requests.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.braze.dispatch.h dispatchDataProvider) {
        super(m.f12831d, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j6) {
        c(j6);
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j6, com.braze.requests.framework.h requestInfo, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j6, requestInfo, apiResponse);
        Long l6 = apiResponse.f12644b;
        if (l6 != null) {
            requestInfo.f12806b = l6.longValue() + j6;
            requestInfo.a(j6, com.braze.requests.framework.i.f12814b);
            n nVar = requestInfo.f12805a;
            com.braze.requests.e eVar = nVar instanceof com.braze.requests.e ? (com.braze.requests.e) nVar : null;
            if (eVar != null) {
                eVar.f12763l = requestInfo.f12812h;
            }
        }
    }
}
