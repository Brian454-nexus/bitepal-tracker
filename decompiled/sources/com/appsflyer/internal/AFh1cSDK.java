package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1cSDK {

    @Nullable
    public AFi1uSDK getCurrencyIso4217Code;

    @Nullable
    public final AFh1dSDK getMediationNetwork;

    @Nullable
    public final AFi1xSDK getMonetizationNetwork;

    public AFh1cSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getCurrencyIso4217Code = AFAdRevenueData(jSONObject);
        this.getMediationNetwork = getRevenue(jSONObject);
        this.getMonetizationNetwork = getMonetizationNetwork(jSONObject);
    }

    private static AFi1uSDK AFAdRevenueData(JSONObject jSONObject) {
        Object obj;
        AFi1uSDK aFi1uSDK;
        List emptyList;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject revenue = getRevenue(jSONObject, "r_debugger");
            if (revenue != null) {
                long j6 = revenue.getLong("ttl");
                int i6 = revenue.getInt("counter");
                String optString = revenue.optString("app_ver", "");
                String optString2 = revenue.optString("sdk_ver", "");
                float optDouble = (float) revenue.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = revenue.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    emptyList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        String string = optJSONArray.getString(i7);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        emptyList.add(string);
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List list = emptyList;
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFi1uSDK = new AFi1uSDK(j6, optDouble, list, i6, optString, optString2);
            } else {
                aFi1uSDK = null;
            }
            obj = Result.constructor-impl(aFi1uSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return (AFi1uSDK) (Result.isFailure-impl(obj) ? null : obj);
    }

    private static AFi1xSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject revenue = getRevenue(jSONObject, "meta_data");
            obj = Result.constructor-impl(revenue != null ? new AFi1xSDK(revenue.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return (AFi1xSDK) (Result.isFailure-impl(obj) ? null : obj);
    }

    private static AFh1dSDK getRevenue(JSONObject jSONObject) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject revenue = getRevenue(jSONObject, "exc_mngr");
            obj = Result.constructor-impl(revenue != null ? new AFh1dSDK(revenue.getString("sdk_ver"), revenue.optInt("min", -1), revenue.optInt("expire", -1), revenue.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return (AFh1dSDK) (Result.isFailure-impl(obj) ? null : obj);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFh1cSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFh1cSDK.getMediationNetwork) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1cSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1cSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        AFh1dSDK aFh1dSDK = this.getMediationNetwork;
        int hashCode = (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0) * 31;
        AFi1xSDK aFi1xSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0)) * 31;
        AFi1uSDK aFi1uSDK = this.getCurrencyIso4217Code;
        return hashCode2 + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0);
    }

    private static JSONObject getRevenue(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
