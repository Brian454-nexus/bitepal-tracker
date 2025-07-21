package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1aSDK {
    public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    public Map<String, Object> getRevenue = new HashMap();

    public final void getRevenue(Map<String, Object> map) {
        if (!this.getCurrencyIso4217Code.isEmpty()) {
            map.put("partner_data", this.getCurrencyIso4217Code);
        }
        if (this.getRevenue.isEmpty()) {
            return;
        }
        AFb1rSDK.getCurrencyIso4217Code(map).put("partner_data", this.getRevenue);
        this.getRevenue = new HashMap();
    }
}
