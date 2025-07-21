package J3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2882b;

    public e(String str, String str2) {
        this.f2881a = str;
        this.f2882b = str2;
    }

    public final String a() {
        return this.f2882b;
    }

    public final String b() {
        return this.f2881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f2881a, eVar.f2881a) && Intrinsics.areEqual(this.f2882b, eVar.f2882b);
    }

    public int hashCode() {
        String str = this.f2881a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2882b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Identity(userId=" + this.f2881a + ", deviceId=" + this.f2882b + ')';
    }

    public /* synthetic */ e(String str, String str2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2);
    }
}
