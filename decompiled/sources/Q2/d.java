package Q2;

import Q2.c;
import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4457d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final N2.b f4458a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4459b;

    /* renamed from: c, reason: collision with root package name */
    public final c.b f4460c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(N2.b bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.d() == 0 && bounds.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.b() != 0 && bounds.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4461b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final b f4462c = new b("FOLD");

        /* renamed from: d, reason: collision with root package name */
        public static final b f4463d = new b("HINGE");

        /* renamed from: a, reason: collision with root package name */
        public final String f4464a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                return b.f4462c;
            }

            public final b b() {
                return b.f4463d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f4464a = str;
        }

        public String toString() {
            return this.f4464a;
        }
    }

    public d(N2.b featureBounds, b type, c.b state) {
        Intrinsics.checkNotNullParameter(featureBounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f4458a = featureBounds;
        this.f4459b = type;
        this.f4460c = state;
        f4457d.a(featureBounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f4458a, dVar.f4458a) && Intrinsics.areEqual(this.f4459b, dVar.f4459b) && Intrinsics.areEqual(f(), dVar.f());
    }

    @Override // Q2.c
    public c.b f() {
        return this.f4460c;
    }

    @Override // Q2.c
    public c.a g() {
        return (this.f4458a.d() == 0 || this.f4458a.a() == 0) ? c.a.f4450c : c.a.f4451d;
    }

    @Override // Q2.a
    public Rect getBounds() {
        return this.f4458a.f();
    }

    public int hashCode() {
        return (((this.f4458a.hashCode() * 31) + this.f4459b.hashCode()) * 31) + f().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f4458a + ", type=" + this.f4459b + ", state=" + f() + " }";
    }
}
