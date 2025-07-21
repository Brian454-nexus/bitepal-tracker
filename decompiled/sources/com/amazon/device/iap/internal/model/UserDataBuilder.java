package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.UserData;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class UserDataBuilder {
    private LWAConsentStatus lwaConsentStatus;
    private String marketplace;
    private String userId;

    public UserData build() {
        return new UserData(this);
    }

    public LWAConsentStatus getLWAConsentStatus() {
        return this.lwaConsentStatus;
    }

    public String getMarketplace() {
        return this.marketplace;
    }

    public String getUserId() {
        return this.userId;
    }

    public UserDataBuilder setLWAConsentStatus(String str) {
        this.lwaConsentStatus = LWAConsentStatus.getEnumForValue(str);
        return this;
    }

    public UserDataBuilder setMarketplace(String str) {
        this.marketplace = str;
        return this;
    }

    public UserDataBuilder setUserId(String str) {
        this.userId = str;
        return this;
    }
}
