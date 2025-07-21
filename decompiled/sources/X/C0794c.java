package X;

import X.AbstractC0792a;
import android.util.Range;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0794c extends AbstractC0792a {

    /* renamed from: d, reason: collision with root package name */
    public final Range f5845d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5846e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5847f;

    /* renamed from: g, reason: collision with root package name */
    public final Range f5848g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5849h;

    /* renamed from: X.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC0792a.AbstractC0103a {

        /* renamed from: a, reason: collision with root package name */
        public Range f5850a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f5851b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f5852c;

        /* renamed from: d, reason: collision with root package name */
        public Range f5853d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f5854e;

        @Override // X.AbstractC0792a.AbstractC0103a
        public AbstractC0792a a() {
            String str = "";
            if (this.f5850a == null) {
                str = " bitrate";
            }
            if (this.f5851b == null) {
                str = str + " sourceFormat";
            }
            if (this.f5852c == null) {
                str = str + " source";
            }
            if (this.f5853d == null) {
                str = str + " sampleRate";
            }
            if (this.f5854e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C0794c(this.f5850a, this.f5851b.intValue(), this.f5852c.intValue(), this.f5853d, this.f5854e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X.AbstractC0792a.AbstractC0103a
        public AbstractC0792a.AbstractC0103a b(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f5850a = range;
            return this;
        }

        @Override // X.AbstractC0792a.AbstractC0103a
        public AbstractC0792a.AbstractC0103a c(int i6) {
            this.f5854e = Integer.valueOf(i6);
            return this;
        }

        @Override // X.AbstractC0792a.AbstractC0103a
        public AbstractC0792a.AbstractC0103a d(Range range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f5853d = range;
            return this;
        }

        @Override // X.AbstractC0792a.AbstractC0103a
        public AbstractC0792a.AbstractC0103a e(int i6) {
            this.f5852c = Integer.valueOf(i6);
            return this;
        }

        public AbstractC0792a.AbstractC0103a f(int i6) {
            this.f5851b = Integer.valueOf(i6);
            return this;
        }
    }

    @Override // X.AbstractC0792a
    public Range b() {
        return this.f5845d;
    }

    @Override // X.AbstractC0792a
    public int c() {
        return this.f5849h;
    }

    @Override // X.AbstractC0792a
    public Range d() {
        return this.f5848g;
    }

    @Override // X.AbstractC0792a
    public int e() {
        return this.f5847f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0792a) {
            AbstractC0792a abstractC0792a = (AbstractC0792a) obj;
            if (this.f5845d.equals(abstractC0792a.b()) && this.f5846e == abstractC0792a.f() && this.f5847f == abstractC0792a.e() && this.f5848g.equals(abstractC0792a.d()) && this.f5849h == abstractC0792a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC0792a
    public int f() {
        return this.f5846e;
    }

    public int hashCode() {
        return ((((((((this.f5845d.hashCode() ^ 1000003) * 1000003) ^ this.f5846e) * 1000003) ^ this.f5847f) * 1000003) ^ this.f5848g.hashCode()) * 1000003) ^ this.f5849h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f5845d + ", sourceFormat=" + this.f5846e + ", source=" + this.f5847f + ", sampleRate=" + this.f5848g + ", channelCount=" + this.f5849h + "}";
    }

    public C0794c(Range range, int i6, int i7, Range range2, int i8) {
        this.f5845d = range;
        this.f5846e = i6;
        this.f5847f = i7;
        this.f5848g = range2;
        this.f5849h = i8;
    }
}
