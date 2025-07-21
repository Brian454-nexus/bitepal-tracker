package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f12283a;

    public h0(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        this.f12283a = triggeredActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.areEqual(this.f12283a, ((h0) obj).f12283a);
    }

    public final int hashCode() {
        return this.f12283a.hashCode();
    }

    public final String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f12283a + ')';
    }
}
