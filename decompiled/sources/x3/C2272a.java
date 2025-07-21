package x3;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2272a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f20514a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20515b;

    public C2272a(WeakReference activity, b type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f20514a = activity;
        this.f20515b = type;
    }

    public final WeakReference a() {
        return this.f20514a;
    }

    public final b b() {
        return this.f20515b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2272a)) {
            return false;
        }
        C2272a c2272a = (C2272a) obj;
        return Intrinsics.areEqual(this.f20514a, c2272a.f20514a) && this.f20515b == c2272a.f20515b;
    }

    public int hashCode() {
        return (this.f20514a.hashCode() * 31) + this.f20515b.hashCode();
    }

    public String toString() {
        return "ActivityCallbackEvent(activity=" + this.f20514a + ", type=" + this.f20515b + ')';
    }
}
