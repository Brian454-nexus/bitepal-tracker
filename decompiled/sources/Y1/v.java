package Y1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s f6513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6514b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f6515c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f6516d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6517e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f6518f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f6519g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6520h;

    public v(s sVar, long[] jArr, int[] iArr, int i6, long[] jArr2, int[] iArr2, long j6) {
        AbstractC1119a.a(iArr.length == jArr2.length);
        AbstractC1119a.a(jArr.length == jArr2.length);
        AbstractC1119a.a(iArr2.length == jArr2.length);
        this.f6513a = sVar;
        this.f6515c = jArr;
        this.f6516d = iArr;
        this.f6517e = i6;
        this.f6518f = jArr2;
        this.f6519g = iArr2;
        this.f6520h = j6;
        this.f6514b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j6) {
        for (int h6 = AbstractC1117K.h(this.f6518f, j6, true, false); h6 >= 0; h6--) {
            if ((this.f6519g[h6] & 1) != 0) {
                return h6;
            }
        }
        return -1;
    }

    public int b(long j6) {
        for (int d6 = AbstractC1117K.d(this.f6518f, j6, true, false); d6 < this.f6518f.length; d6++) {
            if ((this.f6519g[d6] & 1) != 0) {
                return d6;
            }
        }
        return -1;
    }
}
