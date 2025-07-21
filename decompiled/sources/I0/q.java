package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q extends v {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Throwable readException, int i6) {
        super(i6, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f2754b = readException;
    }

    public final Throwable b() {
        return this.f2754b;
    }
}
