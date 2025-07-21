package a0;

import a0.AbstractC0976a;

/* renamed from: a0.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0996u extends AbstractC0976a {

    /* renamed from: b, reason: collision with root package name */
    public final int f7619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7620c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7621d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7622e;

    /* renamed from: a0.u$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC0976a.AbstractC0118a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f7623a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f7624b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f7625c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f7626d;

        @Override // a0.AbstractC0976a.AbstractC0118a
        public AbstractC0976a a() {
            String str = "";
            if (this.f7623a == null) {
                str = " audioSource";
            }
            if (this.f7624b == null) {
                str = str + " sampleRate";
            }
            if (this.f7625c == null) {
                str = str + " channelCount";
            }
            if (this.f7626d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C0996u(this.f7623a.intValue(), this.f7624b.intValue(), this.f7625c.intValue(), this.f7626d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a0.AbstractC0976a.AbstractC0118a
        public AbstractC0976a.AbstractC0118a c(int i6) {
            this.f7626d = Integer.valueOf(i6);
            return this;
        }

        @Override // a0.AbstractC0976a.AbstractC0118a
        public AbstractC0976a.AbstractC0118a d(int i6) {
            this.f7623a = Integer.valueOf(i6);
            return this;
        }

        @Override // a0.AbstractC0976a.AbstractC0118a
        public AbstractC0976a.AbstractC0118a e(int i6) {
            this.f7625c = Integer.valueOf(i6);
            return this;
        }

        @Override // a0.AbstractC0976a.AbstractC0118a
        public AbstractC0976a.AbstractC0118a f(int i6) {
            this.f7624b = Integer.valueOf(i6);
            return this;
        }
    }

    @Override // a0.AbstractC0976a
    public int b() {
        return this.f7622e;
    }

    @Override // a0.AbstractC0976a
    public int c() {
        return this.f7619b;
    }

    @Override // a0.AbstractC0976a
    public int e() {
        return this.f7621d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0976a) {
            AbstractC0976a abstractC0976a = (AbstractC0976a) obj;
            if (this.f7619b == abstractC0976a.c() && this.f7620c == abstractC0976a.f() && this.f7621d == abstractC0976a.e() && this.f7622e == abstractC0976a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // a0.AbstractC0976a
    public int f() {
        return this.f7620c;
    }

    public int hashCode() {
        return ((((((this.f7619b ^ 1000003) * 1000003) ^ this.f7620c) * 1000003) ^ this.f7621d) * 1000003) ^ this.f7622e;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f7619b + ", sampleRate=" + this.f7620c + ", channelCount=" + this.f7621d + ", audioFormat=" + this.f7622e + "}";
    }

    public C0996u(int i6, int i7, int i8, int i9) {
        this.f7619b = i6;
        this.f7620c = i7;
        this.f7621d = i8;
        this.f7622e = i9;
    }
}
