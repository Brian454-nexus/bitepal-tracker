package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSendAdRevenueTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendAdRevenueTask.kt\ncom/appsflyer/internal/components/queue/tasks/SendAdRevenueTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,77:1\n215#2,2:78\n*S KotlinDebug\n*F\n+ 1 SendAdRevenueTask.kt\ncom/appsflyer/internal/components/queue/tasks/SendAdRevenueTask\n*L\n66#1:78,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1gSDK extends AFf1eSDK {

    @NotNull
    private final AFh1nSDK copy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1gSDK(@NotNull AFh1nSDK aFh1nSDK, @NotNull AFd1kSDK aFd1kSDK) {
        super(aFh1nSDK, aFd1kSDK);
        Intrinsics.checkNotNullParameter(aFh1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.copy = aFh1nSDK;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getCurrencyIso4217Code(@NotNull AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        super.getCurrencyIso4217Code(aFa1oSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copy.toString;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copy.copy;
        if (map != null && !map.isEmpty()) {
            List listOf = CollectionsKt.listOf(new String[]{AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT});
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listOf.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(com.amazon.a.a.h.a.f10906a, "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("ad_network", linkedHashMap3);
    }
}
