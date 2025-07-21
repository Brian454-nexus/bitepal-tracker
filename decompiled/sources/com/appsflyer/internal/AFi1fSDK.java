package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1fSDK implements AFi1oSDK {

    @NotNull
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.15.2", null, 4, null);

    @Override // com.appsflyer.internal.AFi1oSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), TuplesKt.to("version", this.getMonetizationNetwork.getVersion())});
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return mutableMapOf;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMonetizationNetwork = pluginInfo;
    }
}
