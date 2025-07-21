package com.appsflyer.internal;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFe1nSDK {
    public final long getRevenue;

    public AFe1nSDK(long j6) {
        this.getRevenue = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFe1nSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j6 = this.getRevenue;
        return (int) (j6 ^ (j6 >>> 32));
    }
}
