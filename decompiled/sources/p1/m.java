package p1;

import android.media.MediaCodec;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m extends f1.e {

    /* renamed from: a, reason: collision with root package name */
    public final n f18191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18193c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.lang.Throwable r4, p1.n r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f18194a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f18191a = r5
            int r5 = c1.AbstractC1117K.f10560a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = a(r4)
        L27:
            r3.f18192b = r1
            r0 = 23
            if (r5 < r0) goto L32
            int r4 = b(r4)
            goto L36
        L32:
            int r4 = c1.AbstractC1117K.Z(r1)
        L36:
            r3.f18193c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m.<init>(java.lang.Throwable, p1.n):void");
    }

    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    public static int b(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
