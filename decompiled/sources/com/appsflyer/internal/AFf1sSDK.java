package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1sSDK extends AFf1oSDK<String> {
    private final String component3;

    @NonNull
    private final UUID copy;

    @NonNull
    private final LinkGenerator copydefault;
    private final LinkGenerator.ResponseListener equals;
    private final String hashCode;
    private final Map<String, String> toString;

    public AFf1sSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.copy = uuid;
        this.component3 = str;
        this.toString = new HashMap(map);
        this.equals = responseListener;
        this.hashCode = str2;
        this.copydefault = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<String> getMediationNetwork(@NonNull String str) {
        return ((AFf1oSDK) this).component2.getCurrencyIso4217Code(this.component3, this.toString, this.hashCode, this.copy, str);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        ResponseNetwork responseNetwork;
        super.getRevenue();
        LinkGenerator.ResponseListener responseListener = this.equals;
        if (responseListener != null) {
            if (this.getMediationNetwork == AFe1cSDK.SUCCESS && (responseNetwork = ((AFf1oSDK) this).component4) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable component1 = component1();
            if (!(component1 instanceof ParsingException)) {
                responseListener.onResponse(this.copydefault.generateLink());
            } else if (((ParsingException) component1).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.copydefault.generateLink());
            }
        }
    }
}
