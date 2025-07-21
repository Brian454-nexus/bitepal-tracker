package W2;

import W2.w;
import androidx.work.OverwritingInputMerger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m extends w {

    /* renamed from: e, reason: collision with root package name */
    public static final b f5584e = new b(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends w.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            h().f14120d = OverwritingInputMerger.class.getName();
        }

        @Override // W2.w.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public m c() {
            if (d() && h().f14126j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new m(this);
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

        public final m a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return (m) new a(workerClass).b();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final m e(Class cls) {
        return f5584e.a(cls);
    }
}
