package N2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3598b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3599c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3600d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3601e;

    public i(Object value, String tag, j verificationMode, g logger) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f3598b = value;
        this.f3599c = tag;
        this.f3600d = verificationMode;
        this.f3601e = logger;
    }

    @Override // N2.h
    public Object a() {
        return this.f3598b;
    }

    @Override // N2.h
    public h c(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return ((Boolean) condition.invoke(this.f3598b)).booleanValue() ? this : new f(this.f3598b, this.f3599c, message, this.f3601e, this.f3600d);
    }
}
