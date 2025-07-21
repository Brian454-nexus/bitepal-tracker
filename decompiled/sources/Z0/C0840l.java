package Z0;

import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* renamed from: Z0.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0840l {

    /* renamed from: e, reason: collision with root package name */
    public static final C0840l f6906e = new b(0).e();

    /* renamed from: f, reason: collision with root package name */
    public static final String f6907f = AbstractC1117K.x0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f6908g = AbstractC1117K.x0(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f6909h = AbstractC1117K.x0(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f6910i = AbstractC1117K.x0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f6911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6912b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6913c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6914d;

    /* renamed from: Z0.l$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6915a;

        /* renamed from: b, reason: collision with root package name */
        public int f6916b;

        /* renamed from: c, reason: collision with root package name */
        public int f6917c;

        /* renamed from: d, reason: collision with root package name */
        public String f6918d;

        public b(int i6) {
            this.f6915a = i6;
        }

        public C0840l e() {
            AbstractC1119a.a(this.f6916b <= this.f6917c);
            return new C0840l(this);
        }

        public b f(int i6) {
            this.f6917c = i6;
            return this;
        }

        public b g(int i6) {
            this.f6916b = i6;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840l)) {
            return false;
        }
        C0840l c0840l = (C0840l) obj;
        return this.f6911a == c0840l.f6911a && this.f6912b == c0840l.f6912b && this.f6913c == c0840l.f6913c && AbstractC1117K.c(this.f6914d, c0840l.f6914d);
    }

    public int hashCode() {
        int i6 = (((((527 + this.f6911a) * 31) + this.f6912b) * 31) + this.f6913c) * 31;
        String str = this.f6914d;
        return i6 + (str == null ? 0 : str.hashCode());
    }

    public C0840l(b bVar) {
        this.f6911a = bVar.f6915a;
        this.f6912b = bVar.f6916b;
        this.f6913c = bVar.f6917c;
        this.f6914d = bVar.f6918d;
    }
}
