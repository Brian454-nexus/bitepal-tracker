package z1;

import Z0.J;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.L0;

/* renamed from: z1.D, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2444D {

    /* renamed from: a, reason: collision with root package name */
    public final int f21479a;

    /* renamed from: b, reason: collision with root package name */
    public final L0[] f21480b;

    /* renamed from: c, reason: collision with root package name */
    public final x[] f21481c;

    /* renamed from: d, reason: collision with root package name */
    public final J f21482d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21483e;

    public C2444D(L0[] l0Arr, x[] xVarArr, J j6, Object obj) {
        AbstractC1119a.a(l0Arr.length == xVarArr.length);
        this.f21480b = l0Arr;
        this.f21481c = (x[]) xVarArr.clone();
        this.f21482d = j6;
        this.f21483e = obj;
        this.f21479a = l0Arr.length;
    }

    public boolean a(C2444D c2444d) {
        if (c2444d == null || c2444d.f21481c.length != this.f21481c.length) {
            return false;
        }
        for (int i6 = 0; i6 < this.f21481c.length; i6++) {
            if (!b(c2444d, i6)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(C2444D c2444d, int i6) {
        return c2444d != null && AbstractC1117K.c(this.f21480b[i6], c2444d.f21480b[i6]) && AbstractC1117K.c(this.f21481c[i6], c2444d.f21481c[i6]);
    }

    public boolean c(int i6) {
        return this.f21480b[i6] != null;
    }
}
