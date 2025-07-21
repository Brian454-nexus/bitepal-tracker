package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.m f12262a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.models.response.m f12263b;

    public d(com.braze.models.response.m oldConfig, com.braze.models.response.m newConfig) {
        Intrinsics.checkNotNullParameter(oldConfig, "oldConfig");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f12262a = oldConfig;
        this.f12263b = newConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f12262a, dVar.f12262a) && Intrinsics.areEqual(this.f12263b, dVar.f12263b);
    }

    public final int hashCode() {
        return this.f12263b.hashCode() + (this.f12262a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigChangeEvent(oldConfig=" + this.f12262a + ", newConfig=" + this.f12263b + ')';
    }
}
