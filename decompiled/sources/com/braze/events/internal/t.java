package com.braze.events.internal;

import com.braze.managers.o0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f12297a;

    public t(o0 debugConfig) {
        Intrinsics.checkNotNullParameter(debugConfig, "debugConfig");
        this.f12297a = debugConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.areEqual(this.f12297a, ((t) obj).f12297a);
    }

    public final int hashCode() {
        return this.f12297a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.f12297a + ')';
    }
}
