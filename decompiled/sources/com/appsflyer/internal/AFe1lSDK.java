package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1lSDK {
    private final int getCurrencyIso4217Code;

    public AFe1lSDK(int i6) {
        this.getCurrencyIso4217Code = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getMonetizationNetwork(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r1 = ""
            r2 = 0
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> Lc
            goto L28
        L8:
            r0 = move-exception
            r9 = r0
            r0 = r2
            goto L67
        Lc:
            r0 = move-exception
            r6 = r0
            java.io.InputStream r9 = r9.getErrorStream()     // Catch: java.lang.Throwable -> L8
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8
            com.appsflyer.internal.AFh1vSDK r4 = com.appsflyer.internal.AFh1vSDK.HTTP_CLIENT     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L22
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L8
            r5 = r0
            goto L23
        L22:
            r5 = r1
        L23:
            r7 = 0
            r8 = 0
            r3.e(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8
        L28:
            if (r9 != 0) goto L2b
            return r1
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L8
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L8
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L63
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r2 = 1
        L3f:
            java.lang.String r3 = r9.readLine()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L58
            if (r2 != 0) goto L53
            r2 = 10
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            goto L53
        L4d:
            r0 = move-exception
            r2 = r0
            r0 = r9
            r9 = r2
        L51:
            r2 = r1
            goto L67
        L53:
            r0.append(r3)     // Catch: java.lang.Throwable -> L4d
            r2 = 0
            goto L3f
        L58:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            r1.close()
            r9.close()
            return r0
        L63:
            r0 = move-exception
            r9 = r0
            r0 = r2
            goto L51
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            if (r0 == 0) goto L71
            r0.close()
        L71:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1lSDK.getMonetizationNetwork(java.net.HttpURLConnection):java.lang.String");
    }

    public final AFe1kSDK<String> getMediationNetwork(AFe1mSDK aFe1mSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                byte[] currencyIso4217Code = aFe1mSDK.getCurrencyIso4217Code();
                StringBuilder sb = new StringBuilder();
                sb.append(aFe1mSDK.getCurrencyIso4217Code);
                sb.append(":");
                sb.append(aFe1mSDK.getMediationNetwork);
                StringBuilder sb2 = new StringBuilder(sb.toString());
                byte[] currencyIso4217Code2 = aFe1mSDK.getCurrencyIso4217Code();
                if (aFe1mSDK.getRevenue() && currencyIso4217Code2 != null) {
                    String str = aFe1mSDK.AFAdRevenueData() ? "<encrypted>" : new String(currencyIso4217Code2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                }
                for (Map.Entry<String, String> entry : aFe1mSDK.getRevenue.entrySet()) {
                    sb2.append("\n ");
                    sb2.append(entry.getKey());
                    sb2.append(": ");
                    sb2.append(entry.getValue());
                }
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(aFe1mSDK.hashCode());
                sb3.append("] ");
                sb3.append((Object) sb2);
                AFLogger.INSTANCE.d(AFh1vSDK.HTTP_CLIENT, sb3.toString());
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFe1mSDK.getMediationNetwork).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(aFe1mSDK.getCurrencyIso4217Code);
                    if (aFe1mSDK.getMonetizationNetwork()) {
                        httpURLConnection2.setUseCaches(false);
                    }
                    if (!aFe1mSDK.component3()) {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                    }
                    try {
                        int i6 = this.getCurrencyIso4217Code;
                        int i7 = aFe1mSDK.component3;
                        if (i7 != -1) {
                            i6 = i7;
                        }
                        httpURLConnection2.setConnectTimeout(i6);
                        httpURLConnection2.setReadTimeout(i6);
                        httpURLConnection2.addRequestProperty("Content-Type", aFe1mSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                        for (Map.Entry<String, String> entry2 : aFe1mSDK.getRevenue.entrySet()) {
                            httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                        if (currencyIso4217Code != null) {
                            httpURLConnection2.setDoOutput(true);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(currencyIso4217Code.length);
                            httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(currencyIso4217Code);
                                    bufferedOutputStream2.close();
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    if (bufferedOutputStream != null) {
                                        bufferedOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        boolean z6 = httpURLConnection2.getResponseCode() / 100 == 2;
                        String str2 = "";
                        if (aFe1mSDK.getMediationNetwork()) {
                            str2 = getMonetizationNetwork(httpURLConnection2);
                        }
                        String str3 = str2;
                        AFe1nSDK aFe1nSDK = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb5 = new StringBuilder("response code:");
                        sb5.append(httpURLConnection2.getResponseCode());
                        sb5.append(" ");
                        sb5.append(httpURLConnection2.getResponseMessage());
                        sb5.append("\n body:");
                        sb5.append(str3);
                        sb5.append("\n took ");
                        sb5.append(aFe1nSDK.getRevenue);
                        sb5.append("ms");
                        String obj = sb5.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.HTTP_CLIENT;
                        StringBuilder sb6 = new StringBuilder("[");
                        sb6.append(aFe1mSDK.hashCode());
                        sb6.append("] ");
                        sb6.append(obj);
                        aFLogger.d(aFh1vSDK, sb6.toString());
                        HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                        hashMap.remove(null);
                        AFe1kSDK<String> aFe1kSDK = new AFe1kSDK<>(str3, httpURLConnection2.getResponseCode(), z6, hashMap, aFe1nSDK);
                        httpURLConnection2.disconnect();
                        return aFe1kSDK;
                    } catch (Exception e6) {
                        e = e6;
                        AFe1nSDK aFe1nSDK2 = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        getMediationNetwork(aFe1mSDK, e, aFe1nSDK2, false);
                        throw new HttpException(e, aFe1nSDK2);
                    } catch (Throwable th3) {
                        th = th3;
                        AFe1nSDK aFe1nSDK3 = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        getMediationNetwork(aFe1mSDK, th, aFe1nSDK3, true);
                        throw new HttpException(th, aFe1nSDK3);
                    }
                } catch (Exception e7) {
                    e = e7;
                } catch (Throwable th4) {
                    th = th4;
                }
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (Exception e8) {
            e = e8;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private static void getMediationNetwork(AFe1mSDK aFe1mSDK, Throwable th, AFe1nSDK aFe1nSDK, boolean z6) {
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(th);
        sb.append("\n took ");
        sb.append(aFe1nSDK.getRevenue);
        sb.append("ms");
        String obj = sb.toString();
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.HTTP_CLIENT;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(aFe1mSDK.hashCode());
        sb2.append("] ");
        sb2.append(obj);
        aFLogger.e(aFh1vSDK, sb2.toString(), th, false, false, z6);
    }
}
