package f1;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1285a {

    /* renamed from: a, reason: collision with root package name */
    public int f13990a;

    public final void e(int i6) {
        this.f13990a = i6 | this.f13990a;
    }

    public void f() {
        this.f13990a = 0;
    }

    public final boolean g(int i6) {
        return (this.f13990a & i6) == i6;
    }

    public final boolean h() {
        return g(268435456);
    }

    public final boolean i() {
        return g(4);
    }

    public final boolean j() {
        return g(134217728);
    }

    public final boolean k() {
        return g(1);
    }

    public final boolean l() {
        return g(536870912);
    }

    public final void m(int i6) {
        this.f13990a = i6;
    }
}
