package e0;

import I.T0;
import e0.AbstractC1218a;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1220c extends AbstractC1218a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13711b;

    /* renamed from: c, reason: collision with root package name */
    public final T0 f13712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13713d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13714e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13715f;

    /* renamed from: e0.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC1218a.AbstractC0192a {

        /* renamed from: a, reason: collision with root package name */
        public String f13716a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13717b;

        /* renamed from: c, reason: collision with root package name */
        public T0 f13718c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f13719d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f13720e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f13721f;

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a a() {
            String str = "";
            if (this.f13716a == null) {
                str = " mimeType";
            }
            if (this.f13717b == null) {
                str = str + " profile";
            }
            if (this.f13718c == null) {
                str = str + " inputTimebase";
            }
            if (this.f13719d == null) {
                str = str + " bitrate";
            }
            if (this.f13720e == null) {
                str = str + " sampleRate";
            }
            if (this.f13721f == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C1220c(this.f13716a, this.f13717b.intValue(), this.f13718c, this.f13719d.intValue(), this.f13720e.intValue(), this.f13721f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a.AbstractC0192a c(int i6) {
            this.f13719d = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a.AbstractC0192a d(int i6) {
            this.f13721f = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a.AbstractC0192a e(T0 t02) {
            if (t02 == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f13718c = t02;
            return this;
        }

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a.AbstractC0192a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f13716a = str;
            return this;
        }

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a.AbstractC0192a g(int i6) {
            this.f13717b = Integer.valueOf(i6);
            return this;
        }

        @Override // e0.AbstractC1218a.AbstractC0192a
        public AbstractC1218a.AbstractC0192a h(int i6) {
            this.f13720e = Integer.valueOf(i6);
            return this;
        }
    }

    @Override // e0.AbstractC1218a, e0.InterfaceC1231n
    public T0 b() {
        return this.f13712c;
    }

    @Override // e0.AbstractC1218a, e0.InterfaceC1231n
    public String c() {
        return this.f13710a;
    }

    @Override // e0.AbstractC1218a
    public int e() {
        return this.f13713d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1218a) {
            AbstractC1218a abstractC1218a = (AbstractC1218a) obj;
            if (this.f13710a.equals(abstractC1218a.c()) && this.f13711b == abstractC1218a.g() && this.f13712c.equals(abstractC1218a.b()) && this.f13713d == abstractC1218a.e() && this.f13714e == abstractC1218a.h() && this.f13715f == abstractC1218a.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // e0.AbstractC1218a
    public int f() {
        return this.f13715f;
    }

    @Override // e0.AbstractC1218a
    public int g() {
        return this.f13711b;
    }

    @Override // e0.AbstractC1218a
    public int h() {
        return this.f13714e;
    }

    public int hashCode() {
        return ((((((((((this.f13710a.hashCode() ^ 1000003) * 1000003) ^ this.f13711b) * 1000003) ^ this.f13712c.hashCode()) * 1000003) ^ this.f13713d) * 1000003) ^ this.f13714e) * 1000003) ^ this.f13715f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f13710a + ", profile=" + this.f13711b + ", inputTimebase=" + this.f13712c + ", bitrate=" + this.f13713d + ", sampleRate=" + this.f13714e + ", channelCount=" + this.f13715f + "}";
    }

    public C1220c(String str, int i6, T0 t02, int i7, int i8, int i9) {
        this.f13710a = str;
        this.f13711b = i6;
        this.f13712c = t02;
        this.f13713d = i7;
        this.f13714e = i8;
        this.f13715f = i9;
    }
}
