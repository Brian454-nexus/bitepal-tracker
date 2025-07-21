package I;

import I.O0;
import android.util.Range;
import android.util.Size;

/* renamed from: I.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0436k extends O0 {

    /* renamed from: b, reason: collision with root package name */
    public final Size f2473b;

    /* renamed from: c, reason: collision with root package name */
    public final F.C f2474c;

    /* renamed from: d, reason: collision with root package name */
    public final Range f2475d;

    /* renamed from: e, reason: collision with root package name */
    public final P f2476e;

    /* renamed from: I.k$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends O0.a {

        /* renamed from: a, reason: collision with root package name */
        public Size f2477a;

        /* renamed from: b, reason: collision with root package name */
        public F.C f2478b;

        /* renamed from: c, reason: collision with root package name */
        public Range f2479c;

        /* renamed from: d, reason: collision with root package name */
        public P f2480d;

        @Override // I.O0.a
        public O0 a() {
            String str = "";
            if (this.f2477a == null) {
                str = " resolution";
            }
            if (this.f2478b == null) {
                str = str + " dynamicRange";
            }
            if (this.f2479c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new C0436k(this.f2477a, this.f2478b, this.f2479c, this.f2480d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // I.O0.a
        public O0.a b(F.C c6) {
            if (c6 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2478b = c6;
            return this;
        }

        @Override // I.O0.a
        public O0.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f2479c = range;
            return this;
        }

        @Override // I.O0.a
        public O0.a d(P p6) {
            this.f2480d = p6;
            return this;
        }

        @Override // I.O0.a
        public O0.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f2477a = size;
            return this;
        }

        public b() {
        }

        public b(O0 o02) {
            this.f2477a = o02.e();
            this.f2478b = o02.b();
            this.f2479c = o02.c();
            this.f2480d = o02.d();
        }
    }

    @Override // I.O0
    public F.C b() {
        return this.f2474c;
    }

    @Override // I.O0
    public Range c() {
        return this.f2475d;
    }

    @Override // I.O0
    public P d() {
        return this.f2476e;
    }

    @Override // I.O0
    public Size e() {
        return this.f2473b;
    }

    public boolean equals(Object obj) {
        P p6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof O0) {
            O0 o02 = (O0) obj;
            if (this.f2473b.equals(o02.e()) && this.f2474c.equals(o02.b()) && this.f2475d.equals(o02.c()) && ((p6 = this.f2476e) != null ? p6.equals(o02.d()) : o02.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // I.O0
    public O0.a f() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (((((this.f2473b.hashCode() ^ 1000003) * 1000003) ^ this.f2474c.hashCode()) * 1000003) ^ this.f2475d.hashCode()) * 1000003;
        P p6 = this.f2476e;
        return hashCode ^ (p6 == null ? 0 : p6.hashCode());
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f2473b + ", dynamicRange=" + this.f2474c + ", expectedFrameRateRange=" + this.f2475d + ", implementationOptions=" + this.f2476e + "}";
    }

    public C0436k(Size size, F.C c6, Range range, P p6) {
        this.f2473b = size;
        this.f2474c = c6;
        this.f2475d = range;
        this.f2476e = p6;
    }
}
