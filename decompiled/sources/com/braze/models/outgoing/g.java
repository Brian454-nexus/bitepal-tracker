package com.braze.models.outgoing;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {
    public final void a(BrazeConfigurationProvider configurationProvider, JSONObject deviceExport, final DeviceKey exportKey, Object obj) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(deviceExport, "deviceExport");
        Intrinsics.checkNotNullParameter(exportKey, "exportKey");
        if (configurationProvider.isDeviceObjectAllowlistEnabled() && !configurationProvider.getDeviceObjectAllowlist().contains(exportKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: e4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.outgoing.g.a(DeviceKey.this);
                }
            }, 6, (Object) null);
        } else {
            deviceExport.putOpt(exportKey.getKey(), obj);
        }
    }

    public static final String a(DeviceKey deviceKey) {
        return "Not adding device key <" + deviceKey + "> to export due to allowlist restrictions.";
    }
}
