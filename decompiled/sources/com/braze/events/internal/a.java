package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12257a;

    public a(JSONObject bannersData) {
        Intrinsics.checkNotNullParameter(bannersData, "bannersData");
        this.f12257a = bannersData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f12257a, ((a) obj).f12257a);
    }

    public final int hashCode() {
        return this.f12257a.hashCode();
    }

    public final String toString() {
        return "BannersReceivedEvent(bannersData=" + this.f12257a + ')';
    }
}
