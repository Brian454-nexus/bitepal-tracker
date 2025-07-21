package I0;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends v {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Throwable finalException) {
        super(IntCompanionObject.MAX_VALUE, null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f2749b = finalException;
    }

    public final Throwable b() {
        return this.f2749b;
    }
}
