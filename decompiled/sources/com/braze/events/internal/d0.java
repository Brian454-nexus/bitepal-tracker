package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.f f12264a;

    public d0(com.braze.requests.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12264a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.areEqual(this.f12264a, ((d0) obj).f12264a);
    }

    public final int hashCode() {
        return this.f12264a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f12264a + ')';
    }
}
