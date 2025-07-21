package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.d f12278a;

    public f0(com.braze.triggers.events.d triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f12278a = triggerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.areEqual(this.f12278a, ((f0) obj).f12278a);
    }

    public final int hashCode() {
        return this.f12278a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f12278a + ')';
    }
}
