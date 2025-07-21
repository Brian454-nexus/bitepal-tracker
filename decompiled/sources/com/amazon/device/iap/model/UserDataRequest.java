package com.amazon.device.iap.model;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class UserDataRequest {
    private boolean fetchLWAConsentStatus;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class Builder {
        private boolean fetchLWAConsentStatus;

        public UserDataRequest build() {
            return new UserDataRequest(this);
        }

        public Builder setFetchLWAConsentStatus(boolean z6) {
            this.fetchLWAConsentStatus = z6;
            return this;
        }

        private Builder() {
        }
    }

    public UserDataRequest(Builder builder) {
        this.fetchLWAConsentStatus = builder.fetchLWAConsentStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getFetchLWAConsentStatus() {
        return this.fetchLWAConsentStatus;
    }
}
