package f3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1291a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14081b;

    public C1291a(String workSpecId, String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f14080a = workSpecId;
        this.f14081b = prerequisiteId;
    }

    public final String a() {
        return this.f14081b;
    }

    public final String b() {
        return this.f14080a;
    }
}
