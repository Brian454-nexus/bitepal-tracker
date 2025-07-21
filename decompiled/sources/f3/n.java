package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f14102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14103b;

    public n(String name, String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f14102a = name;
        this.f14103b = workSpecId;
    }

    public final String a() {
        return this.f14102a;
    }

    public final String b() {
        return this.f14103b;
    }
}
