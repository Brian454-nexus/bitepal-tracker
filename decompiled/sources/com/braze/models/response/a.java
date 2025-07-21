package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.communication.d f12643a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f12644b;

    public a(com.braze.requests.n request, com.braze.communication.d connectionResult) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f12643a = connectionResult;
        String str = (String) connectionResult.f12074b.get("retry-after");
        this.f12644b = str != null ? com.braze.support.l.a(str) : null;
    }
}
