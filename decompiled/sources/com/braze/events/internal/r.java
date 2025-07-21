package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.b f12296a;

    public r(com.braze.requests.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12296a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f12296a, ((r) obj).f12296a);
    }

    public final int hashCode() {
        return this.f12296a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.f12296a + ')';
    }
}
