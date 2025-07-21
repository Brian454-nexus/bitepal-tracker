package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1sSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFf1fSDK extends AFf1eSDK {

    @NonNull
    private final AppsFlyerProperties AFInAppEventParameterName;

    @NonNull
    private final AFh1oSDK AFInAppEventType;

    @NonNull
    private final AFj1uSDK copy;
    public Map<String, Object> copydefault;

    @NonNull
    private final AFd1rSDK hashCode;

    @NonNull
    private final AFc1hSDK valueOf;

    @NonNull
    private final AFf1aSDK values;

    /* renamed from: com.appsflyer.internal.AFf1fSDK$2, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1sSDK.AFa1zSDK.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AFj1sSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AFj1sSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1fSDK(@NonNull AFa1oSDK aFa1oSDK, @NonNull AFd1kSDK aFd1kSDK) {
        super(aFa1oSDK, aFd1kSDK);
        this.copy = aFd1kSDK.equals();
        this.hashCode = aFd1kSDK.getRevenue();
        this.AFInAppEventType = aFd1kSDK.component3();
        this.values = aFd1kSDK.component2();
        this.AFInAppEventParameterName = AppsFlyerProperties.getInstance();
        this.valueOf = aFd1kSDK.afInfoLog();
        this.getCurrencyIso4217Code.add(AFf1zSDK.RESOLVE_ESP);
        this.getCurrencyIso4217Code.add(AFf1zSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        super.getCurrencyIso4217Code(aFa1oSDK);
        int i6 = aFa1oSDK.component1;
        getMonetizationNetwork(i6);
        Map map = (Map) aFa1oSDK.getMonetizationNetwork().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1oSDK.getMonetizationNetwork().put("meta", map);
        }
        if (!aFa1oSDK.getMonetizationNetwork().containsKey("af_deeplink")) {
            aFa1oSDK.getRevenue(this.valueOf.getMonetizationNetwork());
        }
        AFi1ySDK AFAdRevenueData = this.values.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFAdRevenueData.AFAdRevenueData);
            String str = AFAdRevenueData.getMediationNetwork;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j6 = AFAdRevenueData.getRevenue;
            if (j6 > 0) {
                hashMap.put("latency", Long.valueOf(j6));
            }
            long j7 = AFAdRevenueData.getCurrencyIso4217Code;
            if (j7 > 0) {
                hashMap.put("delay", Long.valueOf(j7));
            }
            int i7 = AFAdRevenueData.getMonetizationNetwork;
            if (i7 > 0) {
                hashMap.put("res_code", Integer.valueOf(i7));
            }
            if (AFAdRevenueData.component2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFAdRevenueData.component2.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFAdRevenueData.component2.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFi1wSDK aFi1wSDK = AFAdRevenueData.component1;
            if (aFi1wSDK != null) {
                hashMap.put("sig", aFi1wSDK.toString());
            }
            String str2 = AFAdRevenueData.component4;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        ((AFf1eSDK) this).equals.AFAdRevenueData(aFa1oSDK.getMonetizationNetwork());
        if (i6 == 1) {
            if (this.AFInAppEventParameterName.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1oSDK.getMonetizationNetwork().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.AFInAppEventType.getRevenue);
            this.AFInAppEventType.AFAdRevenueData.AFAdRevenueData("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.AFInAppEventType.getCurrencyIso4217Code);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i6 == 2) {
            HashMap hashMap4 = new HashMap(this.AFInAppEventType.getCurrencyIso4217Code);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.AFInAppEventType.AFAdRevenueData.AFAdRevenueData("first_launch");
        }
        if (map.isEmpty()) {
            aFa1oSDK.getMonetizationNetwork().remove("meta");
        }
        if (i6 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1sSDK aFj1sSDK : this.copy.getCurrencyIso4217Code()) {
                boolean z6 = aFj1sSDK instanceof AFi1eSDK;
                int i8 = AnonymousClass2.getCurrencyIso4217Code[aFj1sSDK.component2.ordinal()];
                if (i8 == 1) {
                    if (z6) {
                        aFa1oSDK.getCurrencyIso4217Code("rfr", ((AFi1eSDK) aFj1sSDK).getRevenue);
                        this.hashCode.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1sSDK.getMediationNetwork);
                } else if (i8 == 2 && i6 == 2 && !z6) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1sSDK.getMonetizationNetwork);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFj1sSDK.component3);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1oSDK.getCurrencyIso4217Code("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFa1oSDK.getCurrencyIso4217Code("fb_ddl", obj);
            }
        }
        ((AFf1eSDK) this).equals.getCurrencyIso4217Code(aFa1oSDK);
    }

    public void getMonetizationNetwork(int i6) {
        this.AFInAppEventType.getRevenue(i6);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1oSDK aFh1oSDK = this.AFInAppEventType;
        int i6 = ((AFf1eSDK) this).component3.component1;
        long currentTimeMillis = System.currentTimeMillis();
        if (i6 == 1) {
            long j6 = aFh1oSDK.component3;
            if (j6 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1oSDK.getCurrencyIso4217Code.put("net", Long.valueOf(currentTimeMillis - j6));
            aFh1oSDK.AFAdRevenueData.AFAdRevenueData("first_launch", new JSONObject(aFh1oSDK.getCurrencyIso4217Code).toString());
        }
    }
}
