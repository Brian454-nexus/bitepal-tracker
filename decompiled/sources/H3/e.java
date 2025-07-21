package H3;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final B3.b f2211a;

    public e(B3.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f2211a = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    @Override // H3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H3.b a(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "events"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            B3.b r0 = r11.f2211a
            java.lang.String r0 = r0.a()
            java.net.HttpURLConnection r1 = r11.c(r0)
            H3.a r2 = new H3.a
            java.lang.String r3 = r11.b()
            B3.b r0 = r11.f2211a
            java.lang.Integer r5 = r0.n()
            r9 = 16
            r10 = 0
            r7 = 0
            r4 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r9, r10)
            java.lang.String r12 = r2.a()
            java.nio.charset.Charset r13 = kotlin.text.Charsets.UTF_8
            byte[] r12 = r12.getBytes(r13)
            java.lang.String r0 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            java.io.OutputStream r0 = r1.getOutputStream()
            int r2 = r12.length
            r3 = 0
            r0.write(r12, r3, r2)
            java.io.OutputStream r12 = r1.getOutputStream()
            r12.close()
            int r12 = r1.getResponseCode()
            r2 = 0
            java.io.InputStream r3 = r11.d(r1)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            r0.<init>(r3, r13)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            r4 = 8192(0x2000, float:1.14794E-41)
            r13.<init>(r0, r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            java.lang.String r0 = kotlin.io.TextStreamsKt.readText(r13)     // Catch: java.lang.Throwable -> L73
            kotlin.io.CloseableKt.closeFinally(r13, r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            H3.b$a r13 = H3.b.f2203b     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            H3.b r12 = r13.a(r12, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            if (r3 == 0) goto L6b
            r3.close()
        L6b:
            r1.disconnect()
            return r12
        L6f:
            r0 = move-exception
            r12 = r0
            r2 = r3
            goto L90
        L73:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r13, r12)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
            throw r0     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f
        L7b:
            r0 = move-exception
            r12 = r0
            goto L90
        L7e:
            r3 = r2
        L7f:
            H3.b$a r12 = H3.b.f2203b     // Catch: java.lang.Throwable -> L6f
            r13 = 408(0x198, float:5.72E-43)
            H3.b r12 = r12.a(r13, r2)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L8c
            r3.close()
        L8c:
            r1.disconnect()
            return r12
        L90:
            if (r2 == 0) goto L95
            r2.close()
        L95:
            r1.disconnect()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.e.a(java.lang.String, java.lang.String):H3.b");
    }

    public final String b() {
        return this.f2211a.b();
    }

    public final HttpURLConnection c(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            return httpURLConnection;
        } catch (MalformedURLException e6) {
            throw new IOException("Attempted to use malformed url: " + str, e6);
        }
    }

    public final InputStream d(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNull(inputStream);
            return inputStream;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            Intrinsics.checkNotNull(errorStream);
            return errorStream;
        }
    }
}
