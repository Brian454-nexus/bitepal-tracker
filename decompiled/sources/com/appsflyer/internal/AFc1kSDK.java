package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFf1lSDK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1kSDK {
    public final AFd1kSDK areAllFieldsValid;
    public String[] component1;
    public long component3;
    public Map<String, String> getCurrencyIso4217Code;
    public String getMediationNetwork;
    public DeepLinkListener getMonetizationNetwork;
    public Intent getRevenue;

    @NonNull
    public List<List<String>> AFAdRevenueData = new ArrayList();

    @NonNull
    public final List<String> component4 = new ArrayList();

    public AFc1kSDK(@NonNull AFd1kSDK aFd1kSDK) {
        this.areAllFieldsValid = aFd1kSDK;
    }

    private static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean p_(android.content.Intent r10, com.appsflyer.internal.AFc1oSDK r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1kSDK.p_(android.content.Intent, com.appsflyer.internal.AFc1oSDK):boolean");
    }

    private Uri q_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e6) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e6);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink monetizationNetwork = DeepLink.getMonetizationNetwork(map);
                    monetizationNetwork.getMediationNetwork.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(monetizationNetwork, null);
                } catch (JSONException e6) {
                    AFLogger.INSTANCE.e(AFh1vSDK.DDL, "Error occurred", e6, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getMonetizationNetwork(deepLinkResult);
                return;
            } catch (Throwable th) {
                getMonetizationNetwork(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void getMonetizationNetwork(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork != null) {
            AFLogger.INSTANCE.d(AFh1vSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getMonetizationNetwork(new DeepLinkResult(null, error));
        } else {
            getMediationNetwork(str);
        }
    }

    public final void n_(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1oSDK aFd1oSDK = (AFd1oSDK) this.areAllFieldsValid;
        if (context != null) {
            aFd1oSDK.getCurrencyIso4217Code.AFAdRevenueData = context.getApplicationContext();
        }
        if (!p_(intent, aFc1oSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.getRevenue().getMediationNetwork("ddl_sent")) {
            AFc1qSDK aFc1qSDK = new AFc1qSDK();
            AFe1aSDK copy = this.areAllFieldsValid.copy();
            copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(new AFf1iSDK(aFc1qSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.getRevenue().getRevenue("ddl_sent", true);
    }

    public final void o_(AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1kSDK aFf1kSDK = new AFf1kSDK(this, aFc1oSDK, uri, this.component4);
        AFe1aSDK copy = this.areAllFieldsValid.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1kSDK));
        this.getRevenue = null;
    }

    public final void r_(AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        if (!aFc1oSDK.getMonetizationNetwork("af_deeplink")) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                String substring = indexOf == -1 ? "" : obj.substring(indexOf);
                if (substring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (substring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                    } else {
                        arrayList.add(substring);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str);
                        }
                    }
                    obj = obj.replace(substring, sb.toString());
                }
            }
            String str2 = this.getMediationNetwork;
            if (str2 != null && this.getCurrencyIso4217Code != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1oSDK.getRevenue.put("appended_query_params", encodedQuery);
                AFc1hSDK aFc1hSDK = aFc1oSDK.getMonetizationNetwork;
                if (aFc1hSDK != null) {
                    aFc1hSDK.AFAdRevenueData(aFc1oSDK.getRevenue);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1oSDK.getRevenue.put("af_deeplink", obj);
            AFc1hSDK aFc1hSDK2 = aFc1oSDK.getMonetizationNetwork;
            if (aFc1hSDK2 != null) {
                aFc1hSDK2.AFAdRevenueData(aFc1oSDK.getRevenue);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFb1qSDK.d_(this.areAllFieldsValid.values().AFAdRevenueData, hashMap, uri);
        AFf1lSDK aFf1lSDK = new AFf1lSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1lSDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1oSDK.getRevenue.put("isBrandedDomain", bool);
            AFc1hSDK aFc1hSDK3 = aFc1oSDK.getMonetizationNetwork;
            if (aFc1hSDK3 != null) {
                aFc1hSDK3.AFAdRevenueData(aFc1oSDK.getRevenue);
            }
        }
        if (!aFf1lSDK.equals()) {
            this.areAllFieldsValid.d().AFAdRevenueData(hashMap);
            return;
        }
        aFf1lSDK.component3 = new AFf1lSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFc1kSDK.4
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1uSDK
            public final void getCurrencyIso4217Code(String str3) {
                AFc1kSDK.this.getMonetizationNetwork(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1uSDK
            public final void getRevenue(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFc1kSDK.this.AFAdRevenueData(hashMap);
            }
        };
        AFe1aSDK copy = this.areAllFieldsValid.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1lSDK));
    }

    public final void getMonetizationNetwork(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.DDL;
            StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            aFLogger.d(aFh1vSDK, sb.toString());
            try {
                this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFh1vSDK.DDL, "skipping, no callback registered");
    }
}
