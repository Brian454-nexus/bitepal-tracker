package N2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3590b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3591c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3592d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3593e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3594f;

    /* renamed from: g, reason: collision with root package name */
    public final l f3595g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3596a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3596a = iArr;
        }
    }

    public f(Object value, String tag, String message, g logger, j verificationMode) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f3590b = value;
        this.f3591c = tag;
        this.f3592d = message;
        this.f3593e = logger;
        this.f3594f = verificationMode;
        l lVar = new l(b(value, message));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) ArraysKt.drop(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f3595g = lVar;
    }

    @Override // N2.h
    public Object a() {
        int i6 = a.f3596a[this.f3594f.ordinal()];
        if (i6 == 1) {
            throw this.f3595g;
        }
        if (i6 == 2) {
            this.f3593e.a(this.f3591c, b(this.f3590b, this.f3592d));
            return null;
        }
        if (i6 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // N2.h
    public h c(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
