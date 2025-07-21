package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1uSDK extends AFf1oSDK<String> {

    @NonNull
    private final String component3;
    private final AFd1qSDK copy;
    private final AFk1wSDK copydefault;

    public AFf1uSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull String str, AFk1wSDK aFk1wSDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.component3 = str;
        this.copydefault = aFk1wSDK;
        this.copy = aFd1kSDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        AFe1kSDK<Result> aFe1kSDK = ((AFf1oSDK) this).component4;
        if (aFe1kSDK != 0) {
            int statusCode = aFe1kSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.component3);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.component3);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.component3);
            AFLogger.afInfoLog(sb3.toString(), false);
            String revenue = aFe1kSDK.getRevenue("Location");
            AFk1wSDK aFk1wSDK = this.copydefault;
            if (aFk1wSDK == null || revenue == null) {
                return;
            }
            aFk1wSDK.getMediationNetwork = revenue;
            Context context = aFk1wSDK.getRevenue.get();
            if (context != null) {
                try {
                    if (aFk1wSDK.getMediationNetwork != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1wSDK.getMediationNetwork)).setFlags(268435456));
                    }
                } catch (Exception e6) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e6)), e6);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<String> getMediationNetwork(@NonNull String str) {
        String obj;
        AFe1qSDK aFe1qSDK = ((AFf1oSDK) this).component2;
        String monetizationNetwork = this.copy.getMonetizationNetwork();
        if (AFc1sSDK.getRevenue(monetizationNetwork)) {
            obj = this.component3;
        } else {
            obj = Uri.parse(this.component3).buildUpon().appendQueryParameter("advertising_id", monetizationNetwork).build().toString();
        }
        return aFe1qSDK.getMonetizationNetwork(obj);
    }
}
