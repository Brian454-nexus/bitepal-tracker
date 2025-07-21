package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFi1oSDK {
    @NotNull
    Map<String, Object> getMediationNetwork();

    void getRevenue(@NotNull PluginInfo pluginInfo);
}
