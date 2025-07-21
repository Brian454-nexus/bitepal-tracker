package X;

import X.y0;
import android.util.Range;

/* renamed from: X.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0805n extends y0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0814x f5943d;

    /* renamed from: e, reason: collision with root package name */
    public final Range f5944e;

    /* renamed from: f, reason: collision with root package name */
    public final Range f5945f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5946g;

    /* renamed from: X.n$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends y0.a {

        /* renamed from: a, reason: collision with root package name */
        public C0814x f5947a;

        /* renamed from: b, reason: collision with root package name */
        public Range f5948b;

        /* renamed from: c, reason: collision with root package name */
        public Range f5949c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f5950d;

        @Override // X.y0.a
        public y0 a() {
            String str = "";
            if (this.f5947a == null) {
                str = " qualitySelector";
            }
            if (this.f5948b == null) {
                str = str + " frameRate";
            }
            if (this.f5949c == null) {
                str = str + " bitrate";
            }
            if (this.f5950d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C0805n(this.f5947a, this.f5948b, this.f5949c, this.f5950d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X.y0.a
        public y0.a b(int i6) {
            this.f5950d = Integer.valueOf(i6);
            return this;
        }

        @Override // X.y0.a
        public y0.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f5949c = range;
            return this;
        }

        @Override // X.y0.a
        public y0.a d(Range range) {
            if (range == null) {
                throw new NullPointerException("Null frameRate");
            }
            this.f5948b = range;
            return this;
        }

        @Override // X.y0.a
        public y0.a e(C0814x c0814x) {
            if (c0814x == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f5947a = c0814x;
            return this;
        }

        public b() {
        }

        public b(y0 y0Var) {
            this.f5947a = y0Var.e();
            this.f5948b = y0Var.d();
            this.f5949c = y0Var.c();
            this.f5950d = Integer.valueOf(y0Var.b());
        }
    }

    @Override // X.y0
    public int b() {
        return this.f5946g;
    }

    @Override // X.y0
    public Range c() {
        return this.f5945f;
    }

    @Override // X.y0
    public Range d() {
        return this.f5944e;
    }

    @Override // X.y0
    public C0814x e() {
        return this.f5943d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f5943d.equals(y0Var.e()) && this.f5944e.equals(y0Var.d()) && this.f5945f.equals(y0Var.c()) && this.f5946g == y0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.y0
    public y0.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f5943d.hashCode() ^ 1000003) * 1000003) ^ this.f5944e.hashCode()) * 1000003) ^ this.f5945f.hashCode()) * 1000003) ^ this.f5946g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f5943d + ", frameRate=" + this.f5944e + ", bitrate=" + this.f5945f + ", aspectRatio=" + this.f5946g + "}";
    }

    public C0805n(C0814x c0814x, Range range, Range range2, int i6) {
        this.f5943d = c0814x;
        this.f5944e = range;
        this.f5945f = range2;
        this.f5946g = i6;
    }
}
