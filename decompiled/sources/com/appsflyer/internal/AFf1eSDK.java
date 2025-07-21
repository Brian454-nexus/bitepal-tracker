package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFf1eSDK extends AFf1oSDK<String> {
    private static final AFf1zSDK[] AFInAppEventParameterName = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFd1nSDK AFKeystoreWrapper;
    public final AFa1oSDK component3;
    private final AFf1aSDK copy;
    private final AFe1iSDK copydefault;
    protected final AFg1kSDK equals;

    @NonNull
    private final AFd1qSDK hashCode;
    protected final AFd1rSDK toString;
    private final AFg1tSDK valueOf;

    public AFf1eSDK(@NonNull AFa1oSDK aFa1oSDK, @NonNull AFd1kSDK aFd1kSDK) {
        this(aFa1oSDK, aFd1kSDK, null);
    }

    @NonNull
    public static Map<String, Object> component1(AFa1oSDK aFa1oSDK) {
        Map<String, Object> map = (Map) aFa1oSDK.getMonetizationNetwork().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1oSDK.getMonetizationNetwork().put("meta", hashMap);
        return hashMap;
    }

    public void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    public void component2(AFa1oSDK aFa1oSDK) {
        this.equals.AFAdRevenueData(aFa1oSDK);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public boolean copydefault() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0059, B:8:0x0062, B:10:0x0068, B:11:0x0071, B:13:0x007b, B:17:0x0087, B:20:0x008f, B:21:0x009a, B:23:0x00a0, B:25:0x00b8, B:26:0x00bd, B:28:0x00d2, B:29:0x00d9, B:31:0x00dd, B:34:0x00e4, B:35:0x00eb, B:36:0x00bb, B:37:0x00ee, B:39:0x00f8, B:40:0x0103, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0059, B:8:0x0062, B:10:0x0068, B:11:0x0071, B:13:0x007b, B:17:0x0087, B:20:0x008f, B:21:0x009a, B:23:0x00a0, B:25:0x00b8, B:26:0x00bd, B:28:0x00d2, B:29:0x00d9, B:31:0x00dd, B:34:0x00e4, B:35:0x00eb, B:36:0x00bb, B:37:0x00ee, B:39:0x00f8, B:40:0x0103, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getCurrencyIso4217Code(com.appsflyer.internal.AFa1oSDK r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1eSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFa1oSDK):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    @Override // com.appsflyer.internal.AFf1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1tSDK<java.lang.String> getMediationNetwork(@androidx.annotation.NonNull java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1eSDK.getMediationNetwork(java.lang.String):com.appsflyer.internal.AFe1tSDK");
    }

    public void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK.getMonetizationNetwork());
    }

    public void getRevenue(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK);
    }

    public AFf1eSDK(@NonNull AFa1oSDK aFa1oSDK, @NonNull AFd1kSDK aFd1kSDK, String str) {
        super(aFa1oSDK.getCurrencyIso4217Code(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.component3 = aFa1oSDK;
        this.copydefault = aFd1kSDK.AFInAppEventType();
        this.toString = aFd1kSDK.getRevenue();
        this.copy = aFd1kSDK.component2();
        this.AFKeystoreWrapper = aFd1kSDK.values();
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.equals = aFd1kSDK.component1();
        this.valueOf = aFd1kSDK.v();
        for (AFf1zSDK aFf1zSDK : AFInAppEventParameterName) {
            if (this.getMonetizationNetwork == aFf1zSDK) {
                return;
            }
        }
        int i6 = this.component3.component1;
        AFf1zSDK aFf1zSDK2 = this.getMonetizationNetwork;
        if (i6 <= 0) {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.getRevenue.add(aFf1zSDK3);
                return;
            }
            return;
        }
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    public void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK.getMonetizationNetwork());
    }
}
