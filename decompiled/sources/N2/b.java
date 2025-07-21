package N2;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3576a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3578c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3579d;

    public b(int i6, int i7, int i8, int i9) {
        this.f3576a = i6;
        this.f3577b = i7;
        this.f3578c = i8;
        this.f3579d = i9;
        if (i6 > i8) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i6 + ", right: " + i8).toString());
        }
        if (i7 <= i9) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i7 + ", bottom: " + i9).toString());
    }

    public final int a() {
        return this.f3579d - this.f3577b;
    }

    public final int b() {
        return this.f3576a;
    }

    public final int c() {
        return this.f3577b;
    }

    public final int d() {
        return this.f3578c - this.f3576a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f3576a == bVar.f3576a && this.f3577b == bVar.f3577b && this.f3578c == bVar.f3578c && this.f3579d == bVar.f3579d;
    }

    public final Rect f() {
        return new Rect(this.f3576a, this.f3577b, this.f3578c, this.f3579d);
    }

    public int hashCode() {
        return (((((this.f3576a * 31) + this.f3577b) * 31) + this.f3578c) * 31) + this.f3579d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f3576a + ',' + this.f3577b + ',' + this.f3578c + ',' + this.f3579d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}
