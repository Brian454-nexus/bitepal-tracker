package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.n f12279a;

    public g(com.braze.requests.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12279a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f12279a, ((g) obj).f12279a);
    }

    public final int hashCode() {
        return this.f12279a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.f12279a + ')';
    }
}
