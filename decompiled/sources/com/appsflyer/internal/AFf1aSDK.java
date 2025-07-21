package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1aSDK implements AFe1dSDK {
    private final AFd1qSDK AFAdRevenueData;
    private final AFg1sSDK areAllFieldsValid;
    private AFi1ySDK component1;
    private final AFe1qSDK component2;
    private AFf1bSDK component3;
    private final AFe1aSDK component4;
    public final AFg1vSDK getCurrencyIso4217Code;
    private final AFg1ySDK getMediationNetwork;
    private final Object getMonetizationNetwork = new Object();
    private final AFg1wSDK getRevenue;

    public AFf1aSDK(AFg1ySDK aFg1ySDK, AFd1qSDK aFd1qSDK, AFg1wSDK aFg1wSDK, AFg1vSDK aFg1vSDK, AFe1qSDK aFe1qSDK, AFg1sSDK aFg1sSDK, AFe1aSDK aFe1aSDK) {
        this.getMediationNetwork = aFg1ySDK;
        this.AFAdRevenueData = aFd1qSDK;
        this.getRevenue = aFg1wSDK;
        this.getCurrencyIso4217Code = aFg1vSDK;
        this.component2 = aFe1qSDK;
        this.areAllFieldsValid = aFg1sSDK;
        this.component4 = aFe1aSDK;
        aFe1aSDK.getRevenue.add(this);
    }

    private void getMonetizationNetwork(@NonNull AFf1bSDK aFf1bSDK, AFg1xSDK aFg1xSDK) {
        synchronized (this.getMonetizationNetwork) {
            this.component3 = aFf1bSDK;
        }
        if (aFg1xSDK != null) {
            aFg1xSDK.onRemoteConfigUpdateFinished(aFf1bSDK);
        }
    }

    public final void AFAdRevenueData(AFg1xSDK aFg1xSDK) {
        AFg1zSDK aFg1zSDK = new AFg1zSDK(this.getMediationNetwork, this.AFAdRevenueData, this.getRevenue, this.getCurrencyIso4217Code, this.component2, this.areAllFieldsValid, "v1", aFg1xSDK);
        AFe1aSDK aFe1aSDK = this.component4;
        aFe1aSDK.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFg1zSDK));
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void getCurrencyIso4217Code(AFe1eSDK<?> aFe1eSDK) {
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void getMediationNetwork(AFe1eSDK<?> aFe1eSDK) {
        if (aFe1eSDK instanceof AFg1zSDK) {
            AFg1zSDK aFg1zSDK = (AFg1zSDK) aFe1eSDK;
            synchronized (this.getMonetizationNetwork) {
                this.component1 = null;
            }
            getMonetizationNetwork(AFf1bSDK.FAILURE, aFg1zSDK.component2);
        }
    }

    public final AFi1ySDK AFAdRevenueData() {
        AFi1ySDK aFi1ySDK;
        synchronized (this.getMonetizationNetwork) {
            aFi1ySDK = this.component1;
            this.component1 = null;
        }
        return aFi1ySDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void getMonetizationNetwork(AFe1eSDK<?> aFe1eSDK, AFe1cSDK aFe1cSDK) {
        if (aFe1eSDK instanceof AFg1zSDK) {
            AFg1zSDK aFg1zSDK = (AFg1zSDK) aFe1eSDK;
            AFf1bSDK aFf1bSDK = aFg1zSDK.component3;
            if (aFf1bSDK == null) {
                AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1bSDK = AFf1bSDK.FAILURE;
            }
            if (aFf1bSDK != AFf1bSDK.USE_CACHED) {
                AFi1ySDK aFi1ySDK = aFg1zSDK.component1;
                synchronized (this.getMonetizationNetwork) {
                    this.component1 = aFi1ySDK;
                }
            }
            getMonetizationNetwork(aFf1bSDK, aFg1zSDK.component2);
        }
    }
}
