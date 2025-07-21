package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.n f12302a;

    public z(com.braze.models.n sealedSession) {
        Intrinsics.checkNotNullParameter(sealedSession, "sealedSession");
        this.f12302a = sealedSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f12302a, ((z) obj).f12302a);
    }

    public final int hashCode() {
        return this.f12302a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f12302a + ')';
    }
}
