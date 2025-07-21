package com.braze.dispatch;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.requests.n;
import com.braze.storage.z;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {
    public final void a(BrazeConfigurationProvider configurationProvider, final z sdkAuthenticationCache, n brazeRequest, String deviceId) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        com.braze.requests.b bVar = (com.braze.requests.b) brazeRequest;
        bVar.f12744e = deviceId;
        bVar.f12745f = configurationProvider.getBrazeApiKey().f12604a;
        bVar.f12746g = "36.0.0";
        bVar.f12743d = Long.valueOf(DateTimeUtils.nowInSeconds());
        if (configurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: U3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.g.a(com.braze.storage.z.this);
                }
            }, 6, (Object) null);
            bVar.f12748i = sdkAuthenticationCache.f12979d.getString("auth_signature", null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: U3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.g.a();
                }
            }, 6, (Object) null);
        }
    }

    public static final String a(z zVar) {
        return "Adding SDK Auth token to request '" + zVar.f12979d.getString("auth_signature", null) + '\'';
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
