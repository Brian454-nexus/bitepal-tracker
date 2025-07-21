package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFf1sSDK;
import com.appsflyer.internal.AFj1fSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class LinkGenerator {
    String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private final Map<String, String> copy = new HashMap();
    private String copydefault;
    private String equals;
    private final String getCurrencyIso4217Code;
    String getMediationNetwork;
    private String getMonetizationNetwork;
    private String getRevenue;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.getCurrencyIso4217Code = str;
    }

    private Map<String, String> AFAdRevenueData() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.getCurrencyIso4217Code);
        String str = this.component4;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.getMonetizationNetwork;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component2;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getRevenue;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.areAllFieldsValid;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.component3;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.equals != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.equals);
            String str7 = this.component1;
            if (str7 != null) {
                this.component1 = str7.replaceFirst("^[/]", "");
                sb.append(this.equals.endsWith("/") ? "" : "/");
                sb.append(this.component1);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.copy.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1hSDK.AFAdRevenueData(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.copy.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.copy.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.getMediationNetwork;
        if (str != null && str.startsWith("http")) {
            sb.append(this.getMediationNetwork);
        } else {
            sb.append(String.format(AFj1fSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        }
        if (this.AFAdRevenueData != null) {
            sb.append('/');
            sb.append(this.AFAdRevenueData);
        }
        Map<String, String> AFAdRevenueData = AFAdRevenueData();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : AFAdRevenueData.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.copydefault;
    }

    public String getCampaign() {
        return this.getRevenue;
    }

    public String getChannel() {
        return this.getMonetizationNetwork;
    }

    public String getMediaSource() {
        return this.getCurrencyIso4217Code;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.copy);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.equals = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMediationNetwork = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.getMediationNetwork = String.format("https://%s/%s", str2, str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.copydefault = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getRevenue = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getMonetizationNetwork = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component4 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.copydefault;
        Map<String, String> AFAdRevenueData = AFAdRevenueData();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1rSDK.getRevenue().AFAdRevenueData(context);
        AFd1kSDK monetizationNetwork = AFb1rSDK.getRevenue().getMonetizationNetwork();
        AFf1sSDK aFf1sSDK = new AFf1sSDK(monetizationNetwork, UUID.randomUUID(), string, AFAdRevenueData, str, responseListener, this);
        AFe1aSDK copy = monetizationNetwork.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1sSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.2
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
