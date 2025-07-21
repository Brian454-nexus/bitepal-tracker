package S2;

import Q2.j;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements R2.a {
    public static final void d(InterfaceC2343a callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new j(CollectionsKt.emptyList()));
    }

    @Override // R2.a
    public void a(Context context, Executor executor, final InterfaceC2343a callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executor.execute(new Runnable() { // from class: S2.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(InterfaceC2343a.this);
            }
        });
    }

    @Override // R2.a
    public void b(InterfaceC2343a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
