package Z0;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final J f6806b = new J(z6.w.w());

    /* renamed from: c, reason: collision with root package name */
    public static final String f6807c = AbstractC1117K.x0(0);

    /* renamed from: a, reason: collision with root package name */
    public final z6.w f6808a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final String f6809f = AbstractC1117K.x0(0);

        /* renamed from: g, reason: collision with root package name */
        public static final String f6810g = AbstractC1117K.x0(1);

        /* renamed from: h, reason: collision with root package name */
        public static final String f6811h = AbstractC1117K.x0(3);

        /* renamed from: i, reason: collision with root package name */
        public static final String f6812i = AbstractC1117K.x0(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f6813a;

        /* renamed from: b, reason: collision with root package name */
        public final H f6814b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6815c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f6816d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean[] f6817e;

        public a(H h6, boolean z6, int[] iArr, boolean[] zArr) {
            int i6 = h6.f6702a;
            this.f6813a = i6;
            boolean z7 = false;
            AbstractC1119a.a(i6 == iArr.length && i6 == zArr.length);
            this.f6814b = h6;
            if (z6 && i6 > 1) {
                z7 = true;
            }
            this.f6815c = z7;
            this.f6816d = (int[]) iArr.clone();
            this.f6817e = (boolean[]) zArr.clone();
        }

        public q a(int i6) {
            return this.f6814b.a(i6);
        }

        public int b() {
            return this.f6814b.f6704c;
        }

        public boolean c() {
            return C6.a.a(this.f6817e, true);
        }

        public boolean d(int i6) {
            return this.f6817e[i6];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f6815c == aVar.f6815c && this.f6814b.equals(aVar.f6814b) && Arrays.equals(this.f6816d, aVar.f6816d) && Arrays.equals(this.f6817e, aVar.f6817e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f6814b.hashCode() * 31) + (this.f6815c ? 1 : 0)) * 31) + Arrays.hashCode(this.f6816d)) * 31) + Arrays.hashCode(this.f6817e);
        }
    }

    public J(List list) {
        this.f6808a = z6.w.s(list);
    }

    public z6.w a() {
        return this.f6808a;
    }

    public boolean b(int i6) {
        for (int i7 = 0; i7 < this.f6808a.size(); i7++) {
            a aVar = (a) this.f6808a.get(i7);
            if (aVar.c() && aVar.b() == i6) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        return this.f6808a.equals(((J) obj).f6808a);
    }

    public int hashCode() {
        return this.f6808a.hashCode();
    }
}
