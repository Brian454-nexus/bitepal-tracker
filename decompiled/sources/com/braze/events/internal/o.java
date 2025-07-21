package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.enums.f f12292a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.enums.f f12293b;

    public o(com.braze.enums.f oldNetworkLevel, com.braze.enums.f newNetworkLevel) {
        Intrinsics.checkNotNullParameter(oldNetworkLevel, "oldNetworkLevel");
        Intrinsics.checkNotNullParameter(newNetworkLevel, "newNetworkLevel");
        this.f12292a = oldNetworkLevel;
        this.f12293b = newNetworkLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f12292a == oVar.f12292a && this.f12293b == oVar.f12293b;
    }

    public final int hashCode() {
        return this.f12293b.hashCode() + (this.f12292a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f12292a + ", newNetworkLevel=" + this.f12293b + ')';
    }
}
