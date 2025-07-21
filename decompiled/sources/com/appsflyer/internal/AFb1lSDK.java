package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1lSDK implements AFb1uSDK {
    private final AFd1nSDK getMonetizationNetwork;

    public AFb1lSDK(AFd1nSDK aFd1nSDK) {
        this.getMonetizationNetwork = aFd1nSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String AFAdRevenueData(com.appsflyer.internal.AFb1kSDK r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK.AFAdRevenueData(com.appsflyer.internal.AFb1kSDK):java.lang.String");
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final void getCurrencyIso4217Code() {
        try {
            File file = new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.i(aFh1vSDK, sb.toString());
                StringBuilder sb2 = new StringBuilder("Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                aFLogger.i(aFh1vSDK, sb2.toString());
                file2.delete();
            }
        } catch (Exception e6) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e6);
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    @NonNull
    public final List<AFb1kSDK> getMediationNetwork() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    aFLogger.i(aFh1vSDK, sb.toString());
                    arrayList.add(AFAdRevenueData(file2));
                }
            }
        } catch (Exception e6) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e6);
        }
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final void getMonetizationNetwork() {
        try {
            if (new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e6) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.appsflyer.internal.AFb1kSDK AFAdRevenueData(java.io.File r5) {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            long r3 = r5.length()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.read(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            com.appsflyer.internal.AFb1kSDK r4 = new com.appsflyer.internal.AFb1kSDK     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4.getRevenue = r5     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.close()     // Catch: java.io.IOException -> L2a
            return r4
        L2a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
            return r4
        L2f:
            r5 = move-exception
            r1 = r2
            goto L48
        L32:
            r5 = move-exception
            goto L38
        L34:
            r5 = move-exception
            goto L48
        L36:
            r5 = move-exception
            r2 = r1
        L38:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.io.IOException -> L43
            goto L47
        L43:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L47:
            return r1
        L48:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L52:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK.AFAdRevenueData(java.io.File):com.appsflyer.internal.AFb1kSDK");
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final boolean AFAdRevenueData(String str) {
        File file = new File(new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        aFLogger.i(aFh1vSDK, sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e6) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e6);
            return false;
        }
    }
}
