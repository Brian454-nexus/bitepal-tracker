package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f12282a;

    public h(String mite) {
        Intrinsics.checkNotNullParameter(mite, "mite");
        this.f12282a = mite;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f12282a, ((h) obj).f12282a);
    }

    public final int hashCode() {
        return this.f12282a.hashCode();
    }

    public final String toString() {
        return "DustMiteReceivedEvent(mite=" + this.f12282a + ')';
    }
}
