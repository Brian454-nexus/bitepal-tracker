package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFf1vSDK extends AFf1oSDK<String> {

    @NotNull
    private final AFf1zSDK component3;

    @NotNull
    private final Map<String, Object> copy;

    @NotNull
    private final AFg1kSDK copydefault;

    @NotNull
    private final AFd1rSDK equals;

    @NotNull
    private final AFd1qSDK hashCode;

    @NotNull
    private final AFg1tSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(@NotNull AFf1zSDK aFf1zSDK, @NotNull AFf1zSDK[] aFf1zSDKArr, @NotNull AFd1kSDK aFd1kSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null);
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = aFf1zSDK;
        this.copy = map;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.hashCode = mediationNetwork;
        AFd1rSDK revenue = aFd1kSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.equals = revenue;
        AFg1kSDK component1 = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(component1, "");
        this.copydefault = component1;
        AFg1tSDK v6 = aFd1kSDK.v();
        Intrinsics.checkNotNullExpressionValue(v6, "");
        this.toString = v6;
    }

    @Nullable
    public abstract AFe1tSDK<String> AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2);

    @Nullable
    public String AFAdRevenueData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component4() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return true;
    }

    @Nullable
    public String getMediationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public void AFAdRevenueData(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.hashCode.getMonetizationNetwork.AFAdRevenueData.getPackageName());
        String AFAdRevenueData = AFd1qSDK.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            map.put("cuid", AFAdRevenueData);
        }
        Context context = this.hashCode.getMonetizationNetwork.AFAdRevenueData;
        map.put("app_version_name", AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
        if (component4()) {
            map.put("event_timestamp", Long.valueOf(this.copydefault.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AFe1tSDK<String> getMediationNetwork(@NotNull String str) {
        AFe1mSDK aFe1mSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.copy);
        String AFAdRevenueData = AFAdRevenueData(mutableMap);
        String mediationNetwork = getMediationNetwork(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        AFAdRevenueData(mutableMap2, AFAdRevenueData);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        if (monetizationNetwork != null && !StringsKt.isBlank(monetizationNetwork)) {
            linkedHashMap.put("advertising_id", monetizationNetwork);
        }
        AFb1tSDK currencyIso4217Code = AFb1vSDK.getCurrencyIso4217Code(this.hashCode.getMonetizationNetwork.AFAdRevenueData);
        String str2 = null;
        String str3 = currencyIso4217Code != null ? currencyIso4217Code.getRevenue : null;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1tSDK b_ = AFb1vSDK.b_(this.hashCode.getMonetizationNetwork.AFAdRevenueData.getContentResolver());
        String str4 = b_ != null ? b_.getRevenue : null;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.amazon.a.a.o.b.af);
        } else {
            String revenue = this.component1.getRevenue(this.equals);
            if (revenue != null && !StringsKt.isBlank(revenue)) {
                linkedHashMap.put("imei", revenue);
            }
        }
        AFd1qSDK aFd1qSDK = this.hashCode;
        String currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.15.2");
        if (mediationNetwork != null && !StringsKt.isBlank(mediationNetwork)) {
            linkedHashMap.put("sdk_connector_version", mediationNetwork);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.toString.AFAdRevenueData(mutableMap2, this.component3);
        AFe1tSDK<String> AFAdRevenueData2 = AFAdRevenueData(mutableMap2, str, AFAdRevenueData);
        if (AFAdRevenueData2 != null && (aFe1mSDK = AFAdRevenueData2.getRevenue) != null) {
            str2 = aFe1mSDK.getMediationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mutableMap2);
            AFb1bSDK.getCurrencyIso4217Code(toString() + ": preparing data: ", jSONObject);
            AFb1cSDK aFb1cSDK = ((AFf1oSDK) this).areAllFieldsValid;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFb1cSDK.getMediationNetwork(str2, jSONObject2);
        }
        return AFAdRevenueData2;
    }
}
