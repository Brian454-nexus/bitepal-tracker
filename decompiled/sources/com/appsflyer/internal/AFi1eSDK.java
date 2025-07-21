package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFj1sSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFi1eSDK extends AFi1cSDK {

    @NonNull
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getRevenue;

    /* renamed from: com.appsflyer.internal.AFi1eSDK$1, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass1 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i6) {
            AFi1eSDK.this.AFAdRevenueData(installReferrerClient, context, i6);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i6) {
            ExecutorService executorService = AFi1eSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.z
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1eSDK.AnonymousClass1.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i6);
                }
            });
        }
    }

    public AFi1eSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFd1qSDK aFd1qSDK) {
        super("store", "google", aFd1qSDK, runnable);
        this.getRevenue = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    private boolean getCurrencyIso4217Code(@NonNull Context context) {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            if (AFb1qSDK.getRevenue(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e6) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e6);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.REFERRER;
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            aFLogger.v(aFh1vSDK, sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    public final void AFAdRevenueData(InstallReferrerClient installReferrerClient, Context context, int i6) {
        this.getRevenue.put("code", String.valueOf(i6));
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.android.vending")));
        this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.android.vending"));
        if (i6 == -1) {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
        } else if (i6 == 0) {
            this.getMediationNetwork.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.REFERRER;
                aFLogger.d(aFh1vSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getRevenue.put("val", installReferrer2);
                        this.getMediationNetwork.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getRevenue.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getRevenue.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getRevenue.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e6) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e6);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e7) {
                        AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "some method not exist", e7, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.getMediationNetwork.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFh1vSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getRevenue.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK2 = AFh1vSDK.REFERRER;
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                aFLogger2.w(aFh1vSDK2, sb.toString());
                this.getRevenue.put("err", th.getMessage());
                aFLogger2.e(aFh1vSDK2, "Failed to get install referrer", th, false, false);
            }
        } else if (i6 == 1) {
            this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer not supported");
        } else if (i6 == 2) {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i6 != 3) {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer collected locally");
        getRevenue();
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        if (getCurrencyIso4217Code(context)) {
            this.component1 = System.currentTimeMillis();
            this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1sSDK.AnonymousClass1());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass1(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }
}
