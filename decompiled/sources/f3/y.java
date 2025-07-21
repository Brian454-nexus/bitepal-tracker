package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f14166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14167b;

    public y(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f14166a = tag;
        this.f14167b = workSpecId;
    }

    public final String a() {
        return this.f14166a;
    }

    public final String b() {
        return this.f14167b;
    }
}
