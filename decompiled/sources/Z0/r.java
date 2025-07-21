package Z0;

import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0836h f7039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7041c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7042d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7043e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public C0836h f7044a;

        /* renamed from: b, reason: collision with root package name */
        public int f7045b;

        /* renamed from: c, reason: collision with root package name */
        public int f7046c;

        /* renamed from: d, reason: collision with root package name */
        public float f7047d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public long f7048e;

        public b(C0836h c0836h, int i6, int i7) {
            this.f7044a = c0836h;
            this.f7045b = i6;
            this.f7046c = i7;
        }

        public r a() {
            return new r(this.f7044a, this.f7045b, this.f7046c, this.f7047d, this.f7048e);
        }

        public b b(float f6) {
            this.f7047d = f6;
            return this;
        }
    }

    public r(C0836h c0836h, int i6, int i7, float f6, long j6) {
        AbstractC1119a.b(i6 > 0, "width must be positive, but is: " + i6);
        AbstractC1119a.b(i7 > 0, "height must be positive, but is: " + i7);
        this.f7039a = c0836h;
        this.f7040b = i6;
        this.f7041c = i7;
        this.f7042d = f6;
        this.f7043e = j6;
    }
}
