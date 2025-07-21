package G3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements J3.h {

    /* renamed from: a, reason: collision with root package name */
    public final B3.e f1768a;

    public a(B3.e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f1768a = state;
    }

    @Override // J3.h
    public void a(String str) {
        this.f1768a.d(str);
    }

    @Override // J3.h
    public void b(String str) {
        this.f1768a.e(str);
    }

    @Override // J3.h
    public void c(J3.e identity, J3.m updateType) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        if (updateType == J3.m.f2904a) {
            this.f1768a.e(identity.b());
            this.f1768a.d(identity.a());
        }
    }
}
