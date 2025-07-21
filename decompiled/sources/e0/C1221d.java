package e0;

import I.T0;
import android.util.Size;
import e0.m0;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1221d extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13725b;

    /* renamed from: c, reason: collision with root package name */
    public final T0 f13726c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f13727d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13728e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f13729f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13730g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13731h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13732i;

    /* renamed from: e0.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends m0.a {

        /* renamed from: a, reason: collision with root package name */
        public String f13733a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13734b;

        /* renamed from: c, reason: collision with root package name */
        public T0 f13735c;

        /* renamed from: d, reason: collision with root package name */
        public Size f13736d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f13737e;

        /* renamed from: f, reason: collision with root package name */
        public n0 f13738f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f13739g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f13740h;

        /* renamed from: i, reason: collision with root package name */
        public Integer f13741i;

        @Override // e0.m0.a
        public m0 a() {
            String str = "";
            if (this.f13733a == null) {
                str = " mimeType";
            }
            if (this.f13734b == null) {
                str = str + " profile";
            }
            if (this.f13735c == null) {
                str = str + " inputTimebase";
            }
            if (this.f13736d == null) {
                str = str + " resolution";
            }
            if (this.f13737e == null) {
                str = str + " colorFormat";
            }
            if (this.f13738f == null) {
                str = str + " dataSpace";
            }
            if (this.f13739g == null) {
                str = str + " frameRate";
            }
            if (this.f13740h == null) {
                str = str + " IFrameInterval";
            }
            if (this.f13741i == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C1221d(this.f13733a, this.f13734b.intValue(), this.f13735c, this.f13736d, this.f13737e.intValue(), this.f13738f, this.f13739g.intValue(), this.f13740h.intValue(), this.f13741i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e0.m0.a
        public m0.a b(int i6) {
            this.f13741i = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.m0.a
        public m0.a c(int i6) {
            this.f13737e = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.m0.a
        public m0.a d(n0 n0Var) {
            if (n0Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f13738f = n0Var;
            return this;
        }

        @Override // e0.m0.a
        public m0.a e(int i6) {
            this.f13739g = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.m0.a
        public m0.a f(int i6) {
            this.f13740h = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.m0.a
        public m0.a g(T0 t02) {
            if (t02 == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f13735c = t02;
            return this;
        }

        @Override // e0.m0.a
        public m0.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f13733a = str;
            return this;
        }

        @Override // e0.m0.a
        public m0.a i(int i6) {
            this.f13734b = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.m0.a
        public m0.a j(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f13736d = size;
            return this;
        }
    }

    @Override // e0.m0, e0.InterfaceC1231n
    public T0 b() {
        return this.f13726c;
    }

    @Override // e0.m0, e0.InterfaceC1231n
    public String c() {
        return this.f13724a;
    }

    @Override // e0.m0
    public int e() {
        return this.f13732i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f13724a.equals(m0Var.c()) && this.f13725b == m0Var.j() && this.f13726c.equals(m0Var.b()) && this.f13727d.equals(m0Var.k()) && this.f13728e == m0Var.f() && this.f13729f.equals(m0Var.g()) && this.f13730g == m0Var.h() && this.f13731h == m0Var.i() && this.f13732i == m0Var.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // e0.m0
    public int f() {
        return this.f13728e;
    }

    @Override // e0.m0
    public n0 g() {
        return this.f13729f;
    }

    @Override // e0.m0
    public int h() {
        return this.f13730g;
    }

    public int hashCode() {
        return ((((((((((((((((this.f13724a.hashCode() ^ 1000003) * 1000003) ^ this.f13725b) * 1000003) ^ this.f13726c.hashCode()) * 1000003) ^ this.f13727d.hashCode()) * 1000003) ^ this.f13728e) * 1000003) ^ this.f13729f.hashCode()) * 1000003) ^ this.f13730g) * 1000003) ^ this.f13731h) * 1000003) ^ this.f13732i;
    }

    @Override // e0.m0
    public int i() {
        return this.f13731h;
    }

    @Override // e0.m0
    public int j() {
        return this.f13725b;
    }

    @Override // e0.m0
    public Size k() {
        return this.f13727d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f13724a + ", profile=" + this.f13725b + ", inputTimebase=" + this.f13726c + ", resolution=" + this.f13727d + ", colorFormat=" + this.f13728e + ", dataSpace=" + this.f13729f + ", frameRate=" + this.f13730g + ", IFrameInterval=" + this.f13731h + ", bitrate=" + this.f13732i + "}";
    }

    public C1221d(String str, int i6, T0 t02, Size size, int i7, n0 n0Var, int i8, int i9, int i10) {
        this.f13724a = str;
        this.f13725b = i6;
        this.f13726c = t02;
        this.f13727d = size;
        this.f13728e = i7;
        this.f13729f = n0Var;
        this.f13730g = i8;
        this.f13731h = i9;
        this.f13732i = i10;
    }
}
