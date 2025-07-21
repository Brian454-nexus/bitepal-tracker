package c1;

/* renamed from: c1.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1107A {

    /* renamed from: c, reason: collision with root package name */
    public static final C1107A f10543c = new C1107A(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1107A f10544d = new C1107A(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f10545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10546b;

    public C1107A(int i6, int i7) {
        AbstractC1119a.a((i6 == -1 || i6 >= 0) && (i7 == -1 || i7 >= 0));
        this.f10545a = i6;
        this.f10546b = i7;
    }

    public int a() {
        return this.f10546b;
    }

    public int b() {
        return this.f10545a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1107A) {
            C1107A c1107a = (C1107A) obj;
            if (this.f10545a == c1107a.f10545a && this.f10546b == c1107a.f10546b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = this.f10546b;
        int i7 = this.f10545a;
        return i6 ^ ((i7 >>> 16) | (i7 << 16));
    }

    public String toString() {
        return this.f10545a + "x" + this.f10546b;
    }
}
