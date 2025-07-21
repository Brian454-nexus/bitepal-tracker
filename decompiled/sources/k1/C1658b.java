package k1;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1658b {

    /* renamed from: a, reason: collision with root package name */
    public final String f16312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16313b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16315d;

    public C1658b(String str, String str2, int i6, int i7) {
        this.f16312a = str;
        this.f16313b = str2;
        this.f16314c = i6;
        this.f16315d = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1658b)) {
            return false;
        }
        C1658b c1658b = (C1658b) obj;
        return this.f16314c == c1658b.f16314c && this.f16315d == c1658b.f16315d && y6.k.a(this.f16312a, c1658b.f16312a) && y6.k.a(this.f16313b, c1658b.f16313b);
    }

    public int hashCode() {
        return y6.k.b(new Object[]{this.f16312a, this.f16313b, Integer.valueOf(this.f16314c), Integer.valueOf(this.f16315d)});
    }
}
