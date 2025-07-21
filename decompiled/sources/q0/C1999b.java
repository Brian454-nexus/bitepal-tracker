package q0;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1999b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1999b f18608e = new C1999b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18610b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18611c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18612d;

    /* renamed from: q0.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static Insets a(int i6, int i7, int i8, int i9) {
            return Insets.of(i6, i7, i8, i9);
        }
    }

    public C1999b(int i6, int i7, int i8, int i9) {
        this.f18609a = i6;
        this.f18610b = i7;
        this.f18611c = i8;
        this.f18612d = i9;
    }

    public static C1999b a(C1999b c1999b, C1999b c1999b2) {
        return b(Math.max(c1999b.f18609a, c1999b2.f18609a), Math.max(c1999b.f18610b, c1999b2.f18610b), Math.max(c1999b.f18611c, c1999b2.f18611c), Math.max(c1999b.f18612d, c1999b2.f18612d));
    }

    public static C1999b b(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f18608e : new C1999b(i6, i7, i8, i9);
    }

    public static C1999b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C1999b d(Insets insets) {
        int i6;
        int i7;
        int i8;
        int i9;
        i6 = insets.left;
        i7 = insets.top;
        i8 = insets.right;
        i9 = insets.bottom;
        return b(i6, i7, i8, i9);
    }

    public Insets e() {
        return a.a(this.f18609a, this.f18610b, this.f18611c, this.f18612d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1999b.class != obj.getClass()) {
            return false;
        }
        C1999b c1999b = (C1999b) obj;
        return this.f18612d == c1999b.f18612d && this.f18609a == c1999b.f18609a && this.f18611c == c1999b.f18611c && this.f18610b == c1999b.f18610b;
    }

    public int hashCode() {
        return (((((this.f18609a * 31) + this.f18610b) * 31) + this.f18611c) * 31) + this.f18612d;
    }

    public String toString() {
        return "Insets{left=" + this.f18609a + ", top=" + this.f18610b + ", right=" + this.f18611c + ", bottom=" + this.f18612d + '}';
    }
}
