package v2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2165c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f19367m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public A2.h f19368a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19369b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f19370c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19371d;

    /* renamed from: e, reason: collision with root package name */
    public long f19372e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f19373f;

    /* renamed from: g, reason: collision with root package name */
    public int f19374g;

    /* renamed from: h, reason: collision with root package name */
    public long f19375h;

    /* renamed from: i, reason: collision with root package name */
    public A2.g f19376i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19377j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f19378k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f19379l;

    /* renamed from: v2.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C2165c(long j6, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f19369b = new Handler(Looper.getMainLooper());
        this.f19371d = new Object();
        this.f19372e = autoCloseTimeUnit.toMillis(j6);
        this.f19373f = autoCloseExecutor;
        this.f19375h = SystemClock.uptimeMillis();
        this.f19378k = new Runnable() { // from class: v2.a
            @Override // java.lang.Runnable
            public final void run() {
                C2165c.f(C2165c.this);
            }
        };
        this.f19379l = new Runnable() { // from class: v2.b
            @Override // java.lang.Runnable
            public final void run() {
                C2165c.c(C2165c.this);
            }
        };
    }

    public static final void c(C2165c this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f19371d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f19375h < this$0.f19372e) {
                    return;
                }
                if (this$0.f19374g != 0) {
                    return;
                }
                Runnable runnable = this$0.f19370c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                A2.g gVar = this$0.f19376i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f19376i = null;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(C2165c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f19373f.execute(this$0.f19379l);
    }

    public final void d() {
        synchronized (this.f19371d) {
            try {
                this.f19377j = true;
                A2.g gVar = this.f19376i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f19376i = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f19371d) {
            try {
                int i6 = this.f19374g;
                if (i6 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i7 = i6 - 1;
                this.f19374g = i7;
                if (i7 == 0) {
                    if (this.f19376i == null) {
                        return;
                    } else {
                        this.f19369b.postDelayed(this.f19378k, this.f19372e);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final A2.g h() {
        return this.f19376i;
    }

    public final A2.h i() {
        A2.h hVar = this.f19368a;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final A2.g j() {
        synchronized (this.f19371d) {
            this.f19369b.removeCallbacks(this.f19378k);
            this.f19374g++;
            if (this.f19377j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            A2.g gVar = this.f19376i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            A2.g J6 = i().J();
            this.f19376i = J6;
            return J6;
        }
    }

    public final void k(A2.h delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        n(delegateOpenHelper);
    }

    public final boolean l() {
        return !this.f19377j;
    }

    public final void m(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f19370c = onAutoClose;
    }

    public final void n(A2.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f19368a = hVar;
    }
}
