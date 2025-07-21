package W2;

import W2.w;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p extends w {

    /* renamed from: e, reason: collision with root package name */
    public static final b f5591e = new b(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends w.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass, long j6, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            h().k(repeatIntervalTimeUnit.toMillis(j6));
        }

        @Override // W2.w.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public p c() {
            if (d() && h().f14126j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (h().f14133q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new p(this);
        }

        @Override // W2.w.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }
}
