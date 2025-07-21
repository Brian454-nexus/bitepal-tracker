package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f14100a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14101b;

    public m(String workSpecId, int i6) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f14100a = workSpecId;
        this.f14101b = i6;
    }

    public final int a() {
        return this.f14101b;
    }

    public final String b() {
        return this.f14100a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f14100a, mVar.f14100a) && this.f14101b == mVar.f14101b;
    }

    public int hashCode() {
        return (this.f14100a.hashCode() * 31) + Integer.hashCode(this.f14101b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f14100a + ", generation=" + this.f14101b + ')';
    }
}
