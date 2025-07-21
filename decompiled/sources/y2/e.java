package y2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1057i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21218d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f21219a;

    /* renamed from: b, reason: collision with root package name */
    public final d f21220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21221c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new e(owner, null);
        }

        public a() {
        }
    }

    public /* synthetic */ e(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f21218d.a(fVar);
    }

    public final d b() {
        return this.f21220b;
    }

    public final void c() {
        AbstractC1057i lifecycle = this.f21219a.getLifecycle();
        if (lifecycle.b() != AbstractC1057i.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C2354b(this.f21219a));
        this.f21220b.e(lifecycle);
        this.f21221c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f21221c) {
            c();
        }
        AbstractC1057i lifecycle = this.f21219a.getLifecycle();
        if (!lifecycle.b().b(AbstractC1057i.b.STARTED)) {
            this.f21220b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f21220b.g(outBundle);
    }

    public e(f fVar) {
        this.f21219a = fVar;
        this.f21220b = new d();
    }
}
