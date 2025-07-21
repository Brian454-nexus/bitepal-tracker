package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.b f12295a;

    public q(com.braze.requests.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12295a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f12295a, ((q) obj).f12295a);
    }

    public final int hashCode() {
        return this.f12295a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.f12295a + ')';
    }
}
