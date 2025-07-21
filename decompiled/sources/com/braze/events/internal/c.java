package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.a f12260a;

    public c(com.braze.requests.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12260a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f12260a, ((c) obj).f12260a);
    }

    public final int hashCode() {
        return this.f12260a.hashCode();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.f12260a + ')';
    }
}
