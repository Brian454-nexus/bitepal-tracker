package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.i f12285a;

    public k(com.braze.requests.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12285a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f12285a, ((k) obj).f12285a);
    }

    public final int hashCode() {
        return this.f12285a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.f12285a + ')';
    }
}
