package n3;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1825e {

    /* renamed from: a, reason: collision with root package name */
    public final String f17750a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17751b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f17752c;

    public C1825e(String str, String str2, Map userProperties) {
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        this.f17750a = str;
        this.f17751b = str2;
        this.f17752c = userProperties;
    }

    public final String a() {
        return this.f17751b;
    }

    public final String b() {
        return this.f17750a;
    }

    public final Map c() {
        return this.f17752c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1825e)) {
            return false;
        }
        C1825e c1825e = (C1825e) obj;
        return Intrinsics.areEqual(this.f17750a, c1825e.f17750a) && Intrinsics.areEqual(this.f17751b, c1825e.f17751b) && Intrinsics.areEqual(this.f17752c, c1825e.f17752c);
    }

    public int hashCode() {
        String str = this.f17750a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17751b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f17752c.hashCode();
    }

    public String toString() {
        return "Identity(userId=" + ((Object) this.f17750a) + ", deviceId=" + ((Object) this.f17751b) + ", userProperties=" + this.f17752c + ')';
    }

    public /* synthetic */ C1825e(String str, String str2, Map map, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
