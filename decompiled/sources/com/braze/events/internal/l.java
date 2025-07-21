package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f12286a;

    public l(List geofencesList) {
        Intrinsics.checkNotNullParameter(geofencesList, "geofencesList");
        this.f12286a = geofencesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f12286a, ((l) obj).f12286a);
    }

    public final int hashCode() {
        return this.f12286a.hashCode();
    }

    public final String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.f12286a + ')';
    }
}
