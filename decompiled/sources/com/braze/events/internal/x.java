package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.d f12300a;

    public x(com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        this.f12300a = responseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.f12300a, ((x) obj).f12300a);
    }

    public final int hashCode() {
        return this.f12300a.hashCode();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f12300a + ')';
    }
}
