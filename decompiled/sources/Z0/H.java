package Z0;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class H {

    /* renamed from: f, reason: collision with root package name */
    public static final String f6700f = AbstractC1117K.x0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f6701g = AbstractC1117K.x0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f6702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6704c;

    /* renamed from: d, reason: collision with root package name */
    public final q[] f6705d;

    /* renamed from: e, reason: collision with root package name */
    public int f6706e;

    public H(q... qVarArr) {
        this("", qVarArr);
    }

    public static void c(String str, String str2, String str3, int i6) {
        AbstractC1133o.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i6 + ")"));
    }

    public static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int e(int i6) {
        return i6 | 16384;
    }

    public q a(int i6) {
        return this.f6705d[i6];
    }

    public int b(q qVar) {
        int i6 = 0;
        while (true) {
            q[] qVarArr = this.f6705d;
            if (i6 >= qVarArr.length) {
                return -1;
            }
            if (qVar == qVarArr[i6]) {
                return i6;
            }
            i6++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H.class == obj.getClass()) {
            H h6 = (H) obj;
            if (this.f6703b.equals(h6.f6703b) && Arrays.equals(this.f6705d, h6.f6705d)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        String d6 = d(this.f6705d[0].f6980d);
        int e6 = e(this.f6705d[0].f6982f);
        int i6 = 1;
        while (true) {
            q[] qVarArr = this.f6705d;
            if (i6 >= qVarArr.length) {
                return;
            }
            if (!d6.equals(d(qVarArr[i6].f6980d))) {
                q[] qVarArr2 = this.f6705d;
                c("languages", qVarArr2[0].f6980d, qVarArr2[i6].f6980d, i6);
                return;
            } else {
                if (e6 != e(this.f6705d[i6].f6982f)) {
                    c("role flags", Integer.toBinaryString(this.f6705d[0].f6982f), Integer.toBinaryString(this.f6705d[i6].f6982f), i6);
                    return;
                }
                i6++;
            }
        }
    }

    public int hashCode() {
        if (this.f6706e == 0) {
            this.f6706e = ((527 + this.f6703b.hashCode()) * 31) + Arrays.hashCode(this.f6705d);
        }
        return this.f6706e;
    }

    public H(String str, q... qVarArr) {
        AbstractC1119a.a(qVarArr.length > 0);
        this.f6703b = str;
        this.f6705d = qVarArr;
        this.f6702a = qVarArr.length;
        int k6 = y.k(qVarArr[0].f6990n);
        this.f6704c = k6 == -1 ? y.k(qVarArr[0].f6989m) : k6;
        f();
    }
}
