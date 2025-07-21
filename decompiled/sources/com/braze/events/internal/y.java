package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.l f12301a;

    public y(com.braze.models.l session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f12301a = session;
        if (session.f12601d) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f12301a, ((y) obj).f12301a);
    }

    public final int hashCode() {
        return this.f12301a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.f12301a + ')';
    }
}
