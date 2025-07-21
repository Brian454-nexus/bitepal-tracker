package w1;

import c1.AbstractC1117K;
import c1.AbstractC1133o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f20068d = new l0(new Z0.H[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f20069e = AbstractC1117K.x0(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f20070a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.w f20071b;

    /* renamed from: c, reason: collision with root package name */
    public int f20072c;

    public l0(Z0.H... hArr) {
        this.f20071b = z6.w.t(hArr);
        this.f20070a = hArr.length;
        e();
    }

    public Z0.H b(int i6) {
        return (Z0.H) this.f20071b.get(i6);
    }

    public z6.w c() {
        return z6.w.s(z6.G.k(this.f20071b, new y6.g() { // from class: w1.k0
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((Z0.H) obj).f6704c);
                return valueOf;
            }
        }));
    }

    public int d(Z0.H h6) {
        int indexOf = this.f20071b.indexOf(h6);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final void e() {
        int i6 = 0;
        while (i6 < this.f20071b.size()) {
            int i7 = i6 + 1;
            for (int i8 = i7; i8 < this.f20071b.size(); i8++) {
                if (((Z0.H) this.f20071b.get(i6)).equals(this.f20071b.get(i8))) {
                    AbstractC1133o.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i6 = i7;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f20070a == l0Var.f20070a && this.f20071b.equals(l0Var.f20071b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f20072c == 0) {
            this.f20072c = this.f20071b.hashCode();
        }
        return this.f20072c;
    }
}
