package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1tSDK extends AFj1sSDK {
    final ProviderInfo getCurrencyIso4217Code;
    private final AFd1kSDK getRevenue;

    public AFj1tSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getRevenue = aFd1kSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    public static ContentProviderClient D_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e6) {
            AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e6, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        this.getRevenue.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1tSDK.4
            /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 287
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1tSDK.AnonymousClass4.run():void");
            }
        });
    }
}
