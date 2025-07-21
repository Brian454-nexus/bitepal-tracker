package o3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C3.a f17943a;

    public e(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17943a = event;
    }

    public final C3.a a() {
        return this.f17943a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f17943a, ((e) obj).f17943a);
    }

    public int hashCode() {
        return this.f17943a.hashCode();
    }

    public String toString() {
        return "EventQueueMessage(event=" + this.f17943a + ')';
    }
}
