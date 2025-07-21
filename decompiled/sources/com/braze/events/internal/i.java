package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f12284a;

    public i(JSONArray featureFlagsData) {
        Intrinsics.checkNotNullParameter(featureFlagsData, "featureFlagsData");
        this.f12284a = featureFlagsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f12284a, ((i) obj).f12284a);
    }

    public final int hashCode() {
        return this.f12284a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f12284a + ')';
    }
}
