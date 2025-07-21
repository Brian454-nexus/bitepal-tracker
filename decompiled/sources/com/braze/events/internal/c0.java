package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.f f12261a;

    public c0(com.braze.requests.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12261a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.areEqual(this.f12261a, ((c0) obj).f12261a);
    }

    public final int hashCode() {
        return this.f12261a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f12261a + ')';
    }
}
