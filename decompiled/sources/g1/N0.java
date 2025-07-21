package g1;

import c1.AbstractC1119a;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N0 {

    /* renamed from: c, reason: collision with root package name */
    public static final N0 f14385c;

    /* renamed from: d, reason: collision with root package name */
    public static final N0 f14386d;

    /* renamed from: e, reason: collision with root package name */
    public static final N0 f14387e;

    /* renamed from: f, reason: collision with root package name */
    public static final N0 f14388f;

    /* renamed from: g, reason: collision with root package name */
    public static final N0 f14389g;

    /* renamed from: a, reason: collision with root package name */
    public final long f14390a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14391b;

    static {
        N0 n02 = new N0(0L, 0L);
        f14385c = n02;
        f14386d = new N0(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        f14387e = new N0(LongCompanionObject.MAX_VALUE, 0L);
        f14388f = new N0(0L, LongCompanionObject.MAX_VALUE);
        f14389g = n02;
    }

    public N0(long j6, long j7) {
        AbstractC1119a.a(j6 >= 0);
        AbstractC1119a.a(j7 >= 0);
        this.f14390a = j6;
        this.f14391b = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(long r9, long r11, long r13) {
        /*
            r8 = this;
            long r2 = r8.f14390a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.f14391b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r9 = c1.AbstractC1117K.g1(r0, r2, r4)
            long r2 = r8.f14391b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = c1.AbstractC1117K.b(r0, r2, r4)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 > 0) goto L2d
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L2d
            r4 = r6
            goto L2e
        L2d:
            r4 = r5
        L2e:
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 > 0) goto L37
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L37
            r5 = r6
        L37:
            if (r4 == 0) goto L4c
            if (r5 == 0) goto L4c
            long r9 = r11 - r0
            long r9 = java.lang.Math.abs(r9)
            long r0 = r13 - r0
            long r0 = java.lang.Math.abs(r0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L51
            goto L4e
        L4c:
            if (r4 == 0) goto L4f
        L4e:
            return r11
        L4f:
            if (r5 == 0) goto L52
        L51:
            return r13
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.N0.a(long, long, long):long");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N0.class == obj.getClass()) {
            N0 n02 = (N0) obj;
            if (this.f14390a == n02.f14390a && this.f14391b == n02.f14391b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f14390a) * 31) + ((int) this.f14391b);
    }
}
