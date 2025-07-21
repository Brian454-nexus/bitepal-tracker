package v2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: v2.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2162A {

    /* renamed from: a, reason: collision with root package name */
    public final u f19355a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19356b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f19357c;

    /* renamed from: v2.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A2.k invoke() {
            return AbstractC2162A.this.d();
        }
    }

    public AbstractC2162A(u database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f19355a = database;
        this.f19356b = new AtomicBoolean(false);
        this.f19357c = LazyKt.lazy(new a());
    }

    public A2.k b() {
        c();
        return g(this.f19356b.compareAndSet(false, true));
    }

    public void c() {
        this.f19355a.c();
    }

    public final A2.k d() {
        return this.f19355a.f(e());
    }

    public abstract String e();

    public final A2.k f() {
        return (A2.k) this.f19357c.getValue();
    }

    public final A2.k g(boolean z6) {
        return z6 ? f() : d();
    }

    public void h(A2.k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == f()) {
            this.f19356b.set(false);
        }
    }
}
