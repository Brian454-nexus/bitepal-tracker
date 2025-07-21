package I0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class p {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        public final Function2 f2750a;

        /* renamed from: b, reason: collision with root package name */
        public final ga.w f2751b;

        /* renamed from: c, reason: collision with root package name */
        public final v f2752c;

        /* renamed from: d, reason: collision with root package name */
        public final CoroutineContext f2753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, ga.w ack, v vVar, CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f2750a = transform;
            this.f2751b = ack;
            this.f2752c = vVar;
            this.f2753d = callerContext;
        }

        public final ga.w a() {
            return this.f2751b;
        }

        public final CoroutineContext b() {
            return this.f2753d;
        }

        public v c() {
            return this.f2752c;
        }

        public final Function2 d() {
            return this.f2750a;
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public p() {
    }
}
