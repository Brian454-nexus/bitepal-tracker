package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1zSDK extends AFi1cSDK {
    private final AFd1kSDK getCurrencyIso4217Code;
    private final AFj1wSDK getRevenue;

    public AFj1zSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFj1wSDK aFj1wSDK) {
        super("store", "huawei", aFd1kSDK.getMediationNetwork(), runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getRevenue = aFj1wSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00de, code lost:
    
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0104, code lost:
    
        if (0 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void getCurrencyIso4217Code(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1zSDK.getCurrencyIso4217Code(android.content.Context):void");
    }

    private boolean getRevenue(Context context) {
        if (!getMonetizationNetwork()) {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getRevenue.getCurrencyIso4217Code(context)) {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getRevenue.getRevenue(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.O
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1zSDK.this.getCurrencyIso4217Code(context);
                }
            });
        }
    }
}
