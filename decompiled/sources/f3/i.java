package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f14090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14092c;

    public i(String workSpecId, int i6, int i7) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f14090a = workSpecId;
        this.f14091b = i6;
        this.f14092c = i7;
    }

    public final int a() {
        return this.f14091b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f14090a, iVar.f14090a) && this.f14091b == iVar.f14091b && this.f14092c == iVar.f14092c;
    }

    public int hashCode() {
        return (((this.f14090a.hashCode() * 31) + Integer.hashCode(this.f14091b)) * 31) + Integer.hashCode(this.f14092c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f14090a + ", generation=" + this.f14091b + ", systemId=" + this.f14092c + ')';
    }
}
