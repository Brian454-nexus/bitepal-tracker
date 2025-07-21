package Q2;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import z0.C2400K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final N2.b f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final C2400K f4490b;

    public k(N2.b _bounds, C2400K _windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
        this.f4489a = _bounds;
        this.f4490b = _windowInsetsCompat;
    }

    public final Rect a() {
        return this.f4489a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f4489a, kVar.f4489a) && Intrinsics.areEqual(this.f4490b, kVar.f4490b);
    }

    public int hashCode() {
        return (this.f4489a.hashCode() * 31) + this.f4490b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f4489a + ", windowInsetsCompat=" + this.f4490b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ k(android.graphics.Rect r1, z0.C2400K r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L12
            z0.K$a r2 = new z0.K$a
            r2.<init>()
            z0.K r2 = r2.a()
            java.lang.String r3 = "Builder().build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.k.<init>(android.graphics.Rect, z0.K, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect bounds, C2400K insets) {
        this(new N2.b(bounds), insets);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
