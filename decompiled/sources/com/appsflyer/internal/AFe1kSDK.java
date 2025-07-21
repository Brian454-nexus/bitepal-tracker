package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFe1kSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFe1nSDK AFAdRevenueData;

    @NonNull
    private final Body getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NonNull
    final Map<String, List<String>> getMonetizationNetwork;
    final boolean getRevenue;

    public AFe1kSDK(@NonNull Body body, int i6, boolean z6, Map<String, List<String>> map, @NonNull AFe1nSDK aFe1nSDK) {
        this.getCurrencyIso4217Code = body;
        this.getMediationNetwork = i6;
        this.getRevenue = z6;
        this.getMonetizationNetwork = new HashMap(map);
        this.AFAdRevenueData = aFe1nSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        if (this.getMediationNetwork == aFe1kSDK.getMediationNetwork && this.getRevenue == aFe1kSDK.getRevenue && this.getCurrencyIso4217Code.equals(aFe1kSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork.equals(aFe1kSDK.getMonetizationNetwork)) {
            return this.AFAdRevenueData.equals(aFe1kSDK.AFAdRevenueData);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getMonetizationNetwork.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getMonetizationNetwork.get(str2);
            }
        }
        return null;
    }

    public final String getRevenue(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        return sb.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    public int hashCode() {
        return (((((((this.getCurrencyIso4217Code.hashCode() * 31) + this.getMediationNetwork) * 31) + (this.getRevenue ? 1 : 0)) * 31) + this.getMonetizationNetwork.hashCode()) * 31) + this.AFAdRevenueData.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getRevenue;
    }
}
