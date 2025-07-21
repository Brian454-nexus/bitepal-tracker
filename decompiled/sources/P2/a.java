package P2;

import Q2.f;
import android.app.Activity;
import ja.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    public final f f4302b;

    /* renamed from: c, reason: collision with root package name */
    public final O2.a f4303c;

    public a(f fVar, O2.a aVar) {
        this.f4302b = fVar;
        this.f4303c = aVar;
    }

    @Override // Q2.f
    public e a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.f4302b.a(activity);
    }

    public final void b(Activity activity, Executor executor, InterfaceC2343a consumer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f4303c.a(executor, consumer, this.f4302b.a(activity));
    }

    public final void c(InterfaceC2343a consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f4303c.b(consumer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f tracker) {
        this(tracker, new O2.a());
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }
}
