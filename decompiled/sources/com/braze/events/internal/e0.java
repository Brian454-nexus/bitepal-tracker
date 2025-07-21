package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12275a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.models.outgoing.event.push.b f12276b;

    public e0(String campaignId, com.braze.models.outgoing.event.push.b pushClickEvent) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pushClickEvent, "pushClickEvent");
        this.f12275a = campaignId;
        this.f12276b = pushClickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f12275a, e0Var.f12275a) && Intrinsics.areEqual(this.f12276b, e0Var.f12276b);
    }

    public final int hashCode() {
        return this.f12276b.f12610d.hashCode() + (this.f12275a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f12275a + ", pushClickEvent=" + this.f12276b + ')';
    }
}
