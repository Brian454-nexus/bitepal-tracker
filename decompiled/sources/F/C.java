package F;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    public static final C f1235c = new C(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C f1236d = new C(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final C f1237e = new C(2, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final C f1238f = new C(3, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final C f1239g = new C(4, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final C f1240h = new C(5, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final C f1241i = new C(6, 10);

    /* renamed from: j, reason: collision with root package name */
    public static final C f1242j = new C(6, 8);

    /* renamed from: a, reason: collision with root package name */
    public final int f1243a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1244b;

    public C(int i6, int i7) {
        this.f1243a = i6;
        this.f1244b = i7;
    }

    public static String c(int i6) {
        switch (i6) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f1244b;
    }

    public int b() {
        return this.f1243a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c6 = (C) obj;
            if (this.f1243a == c6.b() && this.f1244b == c6.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1243a ^ 1000003) * 1000003) ^ this.f1244b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f1243a) + ", bitDepth=" + this.f1244b + "}";
    }
}
