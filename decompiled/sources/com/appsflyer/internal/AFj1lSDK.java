package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1sSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1lSDK extends AFi1cSDK {
    public AFj1lSDK(AFd1qSDK aFd1qSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1qSDK, runnable);
    }

    private boolean getMediationNetwork() {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.REFERRER;
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.miui.referrer.api.GetAppsReferrerClient");
            sb.append(" not found");
            aFLogger.v(aFh1vSDK, sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        if (getMediationNetwork()) {
            this.component1 = System.currentTimeMillis();
            this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1sSDK.AnonymousClass1());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1lSDK.1
                public final void onGetAppsReferrerSetupFinished(int i6) {
                    AFj1lSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1lSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.xiaomi.mipicks"));
                    if (i6 == -1) {
                        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1lSDK.this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
                    } else if (i6 == 0) {
                        AFj1lSDK aFj1lSDK = AFj1lSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFj1lSDK.getMediationNetwork.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1vSDK aFh1vSDK = AFh1vSDK.REFERRER;
                            aFLogger.d(aFh1vSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1lSDK.getMediationNetwork.put("referrer", installReferrer2);
                                }
                                aFj1lSDK.getMediationNetwork.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1lSDK.getMediationNetwork.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFj1lSDK.getMediationNetwork.put("xiaomi_custom", hashMap);
                            } else {
                                aFLogger.w(aFh1vSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFh1vSDK aFh1vSDK2 = AFh1vSDK.REFERRER;
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            aFLogger2.w(aFh1vSDK2, sb.toString());
                        }
                    } else if (i6 == 1) {
                        AFj1lSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i6 == 2) {
                        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1lSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i6 == 3) {
                        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1lSDK.this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
                    } else if (i6 != 4) {
                        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1lSDK.this.getMediationNetwork.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1lSDK.this.getRevenue();
                    build.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
