package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1058j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1058j f9050a = new C1058j();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f9051b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC1053e {
        @Override // androidx.lifecycle.AbstractC1053e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            z.f9107b.c(activity);
        }
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f9051b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
