package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.z;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements InterfaceC1061m {

    /* renamed from: i, reason: collision with root package name */
    public static final b f9093i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final x f9094j = new x();

    /* renamed from: a, reason: collision with root package name */
    public int f9095a;

    /* renamed from: b, reason: collision with root package name */
    public int f9096b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f9099e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9097c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9098d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C1062n f9100f = new C1062n(this);

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f9101g = new Runnable() { // from class: androidx.lifecycle.w
        @Override // java.lang.Runnable
        public final void run() {
            x.i(x.this);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public final z.a f9102h = new d();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9103a = new a();

        @JvmStatic
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1061m a() {
            return x.f9094j;
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            x.f9094j.h(context);
        }

        public b() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends AbstractC1053e {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends AbstractC1053e {
            final /* synthetic */ x this$0;

            public a(x xVar) {
                this.this$0 = xVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.AbstractC1053e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                z.f9107b.b(activity).e(x.this.f9102h);
            }
        }

        @Override // androidx.lifecycle.AbstractC1053e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            x.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(x.this));
        }

        @Override // androidx.lifecycle.AbstractC1053e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            x.this.g();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements z.a {
        public d() {
        }

        @Override // androidx.lifecycle.z.a
        public void a() {
            x.this.f();
        }

        @Override // androidx.lifecycle.z.a
        public void b() {
        }

        @Override // androidx.lifecycle.z.a
        public void c() {
            x.this.e();
        }
    }

    public static final void i(x this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final InterfaceC1061m l() {
        return f9093i.a();
    }

    public final void d() {
        int i6 = this.f9096b - 1;
        this.f9096b = i6;
        if (i6 == 0) {
            Handler handler = this.f9099e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.f9101g, 700L);
        }
    }

    public final void e() {
        int i6 = this.f9096b + 1;
        this.f9096b = i6;
        if (i6 == 1) {
            if (this.f9097c) {
                this.f9100f.h(AbstractC1057i.a.ON_RESUME);
                this.f9097c = false;
            } else {
                Handler handler = this.f9099e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f9101g);
            }
        }
    }

    public final void f() {
        int i6 = this.f9095a + 1;
        this.f9095a = i6;
        if (i6 == 1 && this.f9098d) {
            this.f9100f.h(AbstractC1057i.a.ON_START);
            this.f9098d = false;
        }
    }

    public final void g() {
        this.f9095a--;
        k();
    }

    @Override // androidx.lifecycle.InterfaceC1061m
    public AbstractC1057i getLifecycle() {
        return this.f9100f;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9099e = new Handler();
        this.f9100f.h(AbstractC1057i.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f9096b == 0) {
            this.f9097c = true;
            this.f9100f.h(AbstractC1057i.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f9095a == 0 && this.f9097c) {
            this.f9100f.h(AbstractC1057i.a.ON_STOP);
            this.f9098d = true;
        }
    }
}
