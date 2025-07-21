package e1;

import java.io.IOException;

/* renamed from: e1.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1249g extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f13813a;

    public C1249g(int i6) {
        this.f13813a = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof e1.C1249g
            if (r0 == 0) goto L11
            r0 = r2
            e1.g r0 = (e1.C1249g) r0
            int r0 = r0.f13813a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1249g.a(java.io.IOException):boolean");
    }

    public C1249g(Throwable th, int i6) {
        super(th);
        this.f13813a = i6;
    }

    public C1249g(String str, int i6) {
        super(str);
        this.f13813a = i6;
    }

    public C1249g(String str, Throwable th, int i6) {
        super(str, th);
        this.f13813a = i6;
    }
}
