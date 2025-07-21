package com.braze.events.internal;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f12294a;

    public p(long j6) {
        this.f12294a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f12294a == ((p) obj).f12294a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12294a);
    }

    public final String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.f12294a + ')';
    }
}
