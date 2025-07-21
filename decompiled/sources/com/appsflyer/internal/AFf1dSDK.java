package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1dSDK extends AFf1oSDK<String> {
    private final AFh1hSDK component3;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFf1dSDK(@androidx.annotation.NonNull com.appsflyer.internal.AFh1hSDK r8, @androidx.annotation.NonNull com.appsflyer.internal.AFd1kSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFf1zSDK r0 = r8.equals
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L9
        L6:
            com.appsflyer.internal.AFf1zSDK r0 = com.appsflyer.internal.AFf1zSDK.CACHED_EVENT
            goto L4
        L9:
            com.appsflyer.internal.AFf1zSDK r0 = com.appsflyer.internal.AFf1zSDK.RC_CDN
            com.appsflyer.internal.AFf1zSDK[] r3 = new com.appsflyer.internal.AFf1zSDK[]{r0}
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.getMonetizationNetwork
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = getMediationNetwork(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.getMonetizationNetwork
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r1.component3 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1dSDK.<init>(com.appsflyer.internal.AFh1hSDK, com.appsflyer.internal.AFd1kSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<String> getMediationNetwork(@NonNull String str) {
        String encodeToString = Base64.encodeToString(this.component3.getMediationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(this.component3.component4, encodeToString);
        return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        ResponseNetwork responseNetwork;
        AFf1zSDK aFf1zSDK = this.component3.equals;
        if (aFf1zSDK == null) {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && (responseNetwork = ((AFf1oSDK) this).component4) != null && responseNetwork.getStatusCode() == 424) || super.getMediationNetwork();
    }

    private static String getMediationNetwork(AFh1hSDK aFh1hSDK) {
        try {
            return new URL(aFh1hSDK.component4).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
