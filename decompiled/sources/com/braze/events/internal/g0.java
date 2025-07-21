package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f12280a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.actions.a f12281b;

    public g0(com.braze.triggers.events.b originalTriggerEvent, com.braze.triggers.actions.a failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(originalTriggerEvent, "originalTriggerEvent");
        Intrinsics.checkNotNullParameter(failedTriggeredAction, "failedTriggeredAction");
        this.f12280a = originalTriggerEvent;
        this.f12281b = failedTriggeredAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f12280a, g0Var.f12280a) && Intrinsics.areEqual(this.f12281b, g0Var.f12281b);
    }

    public final int hashCode() {
        return this.f12281b.hashCode() + (this.f12280a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f12280a + ", failedTriggeredAction=" + this.f12281b + ')';
    }
}
