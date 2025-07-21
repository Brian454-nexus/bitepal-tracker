package com.braze.events.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12298a;

    public v(ArrayList logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f12298a = logs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.areEqual(this.f12298a, ((v) obj).f12298a);
    }

    public final int hashCode() {
        return this.f12298a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerSendLogEvent(logs=" + this.f12298a + ')';
    }
}
