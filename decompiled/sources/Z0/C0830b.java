package Z0;

import android.media.AudioAttributes;
import c1.AbstractC1117K;

/* renamed from: Z0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0830b {

    /* renamed from: g, reason: collision with root package name */
    public static final C0830b f6858g = new e().a();

    /* renamed from: h, reason: collision with root package name */
    public static final String f6859h = AbstractC1117K.x0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f6860i = AbstractC1117K.x0(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f6861j = AbstractC1117K.x0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f6862k = AbstractC1117K.x0(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f6863l = AbstractC1117K.x0(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f6864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6868e;

    /* renamed from: f, reason: collision with root package name */
    public d f6869f;

    /* renamed from: Z0.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0115b {
        public static void a(AudioAttributes.Builder builder, int i6) {
            builder.setAllowedCapturePolicy(i6);
        }
    }

    /* renamed from: Z0.b$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public static void a(AudioAttributes.Builder builder, int i6) {
            builder.setSpatializationBehavior(i6);
        }
    }

    /* renamed from: Z0.b$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f6870a;

        public d(C0830b c0830b) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0830b.f6864a).setFlags(c0830b.f6865b).setUsage(c0830b.f6866c);
            int i6 = AbstractC1117K.f10560a;
            if (i6 >= 29) {
                C0115b.a(usage, c0830b.f6867d);
            }
            if (i6 >= 32) {
                c.a(usage, c0830b.f6868e);
            }
            this.f6870a = usage.build();
        }
    }

    /* renamed from: Z0.b$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f6871a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f6872b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f6873c = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f6874d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f6875e = 0;

        public C0830b a() {
            return new C0830b(this.f6871a, this.f6872b, this.f6873c, this.f6874d, this.f6875e);
        }

        public e b(int i6) {
            this.f6871a = i6;
            return this;
        }
    }

    public d a() {
        if (this.f6869f == null) {
            this.f6869f = new d();
        }
        return this.f6869f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0830b.class == obj.getClass()) {
            C0830b c0830b = (C0830b) obj;
            if (this.f6864a == c0830b.f6864a && this.f6865b == c0830b.f6865b && this.f6866c == c0830b.f6866c && this.f6867d == c0830b.f6867d && this.f6868e == c0830b.f6868e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f6864a) * 31) + this.f6865b) * 31) + this.f6866c) * 31) + this.f6867d) * 31) + this.f6868e;
    }

    public C0830b(int i6, int i7, int i8, int i9, int i10) {
        this.f6864a = i6;
        this.f6865b = i7;
        this.f6866c = i8;
        this.f6867d = i9;
        this.f6868e = i10;
    }
}
