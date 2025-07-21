package s1;

import android.net.Uri;
import c1.AbstractC1113G;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f18840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18841b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f18842c;

    public v(long j6, int i6, Uri uri) {
        this.f18840a = j6;
        this.f18841b = i6;
        this.f18842c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {Exception -> 0x005c, blocks: (B:7:0x002e, B:19:0x007b, B:24:0x0082, B:25:0x0087, B:28:0x0088, B:29:0x008d, B:31:0x0052, B:34:0x005e, B:37:0x0069), top: B:6:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z6.w a(java.lang.String r20, android.net.Uri r21) {
        /*
            z6.w$a r0 = new z6.w$a
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r20
            java.lang.String[] r1 = c1.AbstractC1117K.d1(r2, r1)
            int r2 = r1.length
            r4 = 0
        Lf:
            if (r4 >= r2) goto Ld1
            r5 = r1[r4]
            java.lang.String r6 = ";"
            java.lang.String[] r6 = c1.AbstractC1117K.d1(r5, r6)
            int r7 = r6.length
            r15 = r4
            r20 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 0
            r14 = -1
        L25:
            if (r12 >= r7) goto L9f
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r6[r12]
            java.lang.String r9 = "="
            java.lang.String[] r9 = c1.AbstractC1117K.e1(r8, r9)     // Catch: java.lang.Exception -> L5c
            r11 = r9[r20]     // Catch: java.lang.Exception -> L5c
            r10 = 1
            r9 = r9[r10]     // Catch: java.lang.Exception -> L5c
            int r10 = r11.hashCode()     // Catch: java.lang.Exception -> L5c
            r18 = r1
            r1 = 113759(0x1bc5f, float:1.5941E-40)
            r19 = r2
            r2 = 2
            if (r10 == r1) goto L69
            r1 = 116079(0x1c56f, float:1.62661E-40)
            if (r10 == r1) goto L5e
            r1 = 1524180539(0x5ad9263b, float:3.05610524E16)
            if (r10 == r1) goto L52
            goto L73
        L52:
            java.lang.String r1 = "rtptime"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L73
            r1 = r2
            goto L74
        L5c:
            r0 = move-exception
            goto L9a
        L5e:
            java.lang.String r1 = "url"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L73
            r1 = r20
            goto L74
        L69:
            java.lang.String r1 = "seq"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L73
            r1 = 1
            goto L74
        L73:
            r1 = -1
        L74:
            if (r1 == 0) goto L8d
            r10 = 1
            if (r1 == r10) goto L88
            if (r1 != r2) goto L82
            long r3 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Exception -> L5c
        L7f:
            r1 = r21
            goto L93
        L82:
            r0 = 0
            Z0.z r0 = Z0.z.c(r11, r0)     // Catch: java.lang.Exception -> L5c
            throw r0     // Catch: java.lang.Exception -> L5c
        L88:
            int r14 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L5c
            goto L7f
        L8d:
            r1 = r21
            android.net.Uri r13 = b(r9, r1)     // Catch: java.lang.Exception -> L5c
        L93:
            int r12 = r12 + 1
            r1 = r18
            r2 = r19
            goto L25
        L9a:
            Z0.z r0 = Z0.z.c(r8, r0)
            throw r0
        L9f:
            r18 = r1
            r19 = r2
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r21
            if (r13 == 0) goto Lba
            java.lang.String r2 = r13.getScheme()
            if (r2 == 0) goto Lba
            r2 = -1
            if (r14 != r2) goto Lbc
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 == 0) goto Lba
            goto Lbc
        Lba:
            r0 = 0
            goto Lcc
        Lbc:
            s1.v r2 = new s1.v
            r2.<init>(r3, r14, r13)
            r0.h(r2)
            int r4 = r15 + 1
            r1 = r18
            r2 = r19
            goto Lf
        Lcc:
            Z0.z r0 = Z0.z.c(r5, r0)
            throw r0
        Ld1:
            z6.w r0 = r0.k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.v.a(java.lang.String, android.net.Uri):z6.w");
    }

    public static Uri b(String str, Uri uri) {
        AbstractC1119a.a(((String) AbstractC1119a.e(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        if (((String) AbstractC1119a.e(parse2.getHost())).equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return AbstractC1113G.f(uri2, str);
        }
        return AbstractC1113G.f(uri2 + "/", str);
    }
}
