package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12437a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12438b;

    public j0(String id, long j6) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f12437a = id;
        this.f12438b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.areEqual(this.f12437a, j0Var.f12437a) && this.f12438b == j0Var.f12438b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12438b) + (this.f12437a.hashCode() * 31);
    }

    public final String toString() {
        return "CampaignData(id=" + this.f12437a + ", timestamp=" + this.f12438b + ')';
    }
}
