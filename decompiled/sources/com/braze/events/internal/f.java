package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.n f12277a;

    public f(com.braze.requests.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12277a = request;
        request.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f12277a, ((f) obj).f12277a);
    }

    public final int hashCode() {
        return this.f12277a.hashCode();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.f12277a + ')';
    }
}
