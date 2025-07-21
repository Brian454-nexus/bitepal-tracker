package F;

import android.view.Display;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class B extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1229b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1230c;

    /* renamed from: d, reason: collision with root package name */
    public final Display f1231d;

    /* renamed from: e, reason: collision with root package name */
    public final r f1232e;

    public B(Display display, r rVar, float f6, float f7) {
        this.f1229b = f6;
        this.f1230c = f7;
        this.f1231d = display;
        this.f1232e = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // F.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.PointF a(float r8, float r9) {
        /*
            r7 = this;
            float r0 = r7.f1229b
            float r1 = r7.f1230c
            F.r r2 = r7.f1232e
            int r2 = r2.g()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            int r3 = r7.e(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1c
            goto L22
        L1c:
            r6 = r9
            r9 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r6
        L22:
            if (r3 == r5) goto L30
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L2e
            if (r3 == r4) goto L2b
            goto L32
        L2b:
            float r9 = r1 - r9
            goto L32
        L2e:
            float r9 = r1 - r9
        L30:
            float r8 = r0 - r8
        L32:
            if (r2 == 0) goto L36
            float r9 = r1 - r9
        L36:
            float r9 = r9 / r1
            float r8 = r8 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r9, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.B.a(float, float):android.graphics.PointF");
    }

    public final int e(boolean z6) {
        try {
            int j6 = this.f1232e.j(this.f1231d.getRotation());
            return z6 ? (360 - j6) % 360 : j6;
        } catch (Exception unused) {
            return 0;
        }
    }
}
