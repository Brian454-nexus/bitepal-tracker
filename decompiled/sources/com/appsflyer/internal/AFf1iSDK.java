package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nResolveDdlTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,278:1\n1#2:279\n1#2:290\n1603#3,9:280\n1855#3:289\n1856#3:291\n1612#3:292\n1855#3,2:296\n3792#4:293\n4307#4,2:294\n*S KotlinDebug\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n*L\n104#1:290\n104#1:280,9\n104#1:289\n104#1:291\n104#1:292\n202#1:296,2\n197#1:293\n197#1:294,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1iSDK extends AFf1oSDK<DdlResponse> {

    @NotNull
    private final CountDownLatch AFInAppEventParameterName;

    @NotNull
    private final List<AFj1sSDK> AFInAppEventType;
    private int AFKeystoreWrapper;

    @NotNull
    private final AFc1qSDK component3;

    @NotNull
    private final AFd1qSDK copy;

    @NotNull
    private final AFh1oSDK copydefault;

    @NotNull
    private final AFd1tSDK equals;

    @NotNull
    private final AFc1kSDK hashCode;

    @NotNull
    private final AFj1uSDK toString;
    private int valueOf;
    private int values;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1cSDK.values().length];
            try {
                iArr[AFe1cSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1cSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
            int[] iArr2 = new int[AFj1sSDK.AFa1zSDK.values().length];
            try {
                iArr2[AFj1sSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1sSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getCurrencyIso4217Code = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1iSDK(@NotNull AFc1qSDK aFc1qSDK, @NotNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.component3 = aFc1qSDK;
        this.AFInAppEventParameterName = new CountDownLatch(1);
        this.AFInAppEventType = new ArrayList();
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.copy = mediationNetwork;
        AFd1tSDK e6 = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e6, "");
        this.equals = e6;
        AFc1kSDK d6 = aFd1kSDK.d();
        Intrinsics.checkNotNullExpressionValue(d6, "");
        this.hashCode = d6;
        AFh1oSDK component3 = aFd1kSDK.component3();
        Intrinsics.checkNotNullExpressionValue(component3, "");
        this.copydefault = component3;
        AFj1uSDK equals = aFd1kSDK.equals();
        Intrinsics.checkNotNullExpressionValue(equals, "");
        this.toString = equals;
        AFj1sSDK[] currencyIso4217Code = equals.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        ArrayList<AFj1sSDK> arrayList = new ArrayList();
        for (AFj1sSDK aFj1sSDK : currencyIso4217Code) {
            if (aFj1sSDK != null && aFj1sSDK.component2 != AFj1sSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFj1sSDK);
            }
        }
        this.valueOf = arrayList.size();
        for (final AFj1sSDK aFj1sSDK2 : arrayList) {
            AFj1sSDK.AFa1zSDK aFa1zSDK = aFj1sSDK2.component2;
            int i6 = aFa1zSDK == null ? -1 : AFa1uSDK.getCurrencyIso4217Code[aFa1zSDK.ordinal()];
            if (i6 == 1) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, aFj1sSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1sSDK2, "");
                getMediationNetwork(aFj1sSDK2);
            } else if (i6 == 2) {
                aFj1sSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.s
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1iSDK.getRevenue(AFj1sSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean copy() {
        Object obj = this.component3.getMonetizationNetwork().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.valueOf && !this.component3.getMonetizationNetwork().containsKey("referrers");
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1tSDK aFb1tSDK) {
        String str;
        if (aFb1tSDK == null || (str = aFb1tSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1tSDK.AFAdRevenueData;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(new Pair[]{TuplesKt.to("type", "unhashed"), TuplesKt.to(com.amazon.a.a.o.b.f11195Y, str)});
        }
        return null;
    }

    private static boolean getMonetizationNetwork(AFj1sSDK aFj1sSDK) {
        Object obj = aFj1sSDK.getMediationNetwork.get("click_ts");
        Long l6 = obj instanceof Long ? (Long) obj : null;
        if (l6 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l6.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1sSDK aFj1sSDK, AFf1iSDK aFf1iSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, aFj1sSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1iSDK.getMediationNetwork((AFj1sSDK) observable);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    @NotNull
    public final AFe1cSDK AFAdRevenueData() {
        AFe1cSDK aFe1cSDK = AFe1cSDK.FAILURE;
        try {
            AFe1cSDK AFAdRevenueData = super.AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
            try {
                AFh1oSDK aFh1oSDK = this.copydefault;
                int i6 = this.AFKeystoreWrapper;
                if (i6 <= 0 || i6 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i6))));
                } else {
                    int i7 = i6 - 1;
                    aFh1oSDK.component2[i7] = System.currentTimeMillis();
                    long j6 = aFh1oSDK.component1[i7];
                    if (j6 != 0) {
                        long[] jArr = aFh1oSDK.component4;
                        jArr[i7] = aFh1oSDK.component2[i7] - j6;
                        aFh1oSDK.getRevenue.put("net", jArr);
                        aFh1oSDK.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(aFh1oSDK.getRevenue).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i7);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i8 = AFa1uSDK.AFAdRevenueData[AFAdRevenueData.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        return AFAdRevenueData;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK = AFh1vSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
                    AFh1uSDK.d$default(aFLogger, aFh1vSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copydefault.getRevenue(deepLinkResult, this.hashCode.component3);
                    this.hashCode.getMonetizationNetwork(deepLinkResult);
                    return AFAdRevenueData;
                }
                ResponseNetwork responseNetwork2 = ((AFf1oSDK) this).component4;
                Intrinsics.checkNotNull(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                DdlResponse ddlResponse = (DdlResponse) body;
                DeepLink deepLink = ddlResponse.deepLink;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.copydefault.getRevenue(deepLinkResult2, this.hashCode.component3);
                    this.hashCode.getMonetizationNetwork(deepLinkResult2);
                    return AFAdRevenueData;
                }
                if (this.AFKeystoreWrapper > 1 || !ddlResponse.getSecondPing() || !copy()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.copydefault.getRevenue(deepLinkResult3, this.hashCode.component3);
                    this.hashCode.getMonetizationNetwork(deepLinkResult3);
                    return AFAdRevenueData;
                }
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFInAppEventParameterName.await();
                AFh1oSDK aFh1oSDK2 = this.copydefault;
                long currentTimeMillis = System.currentTimeMillis();
                long j7 = aFh1oSDK2.component2[0];
                if (j7 != 0) {
                    aFh1oSDK2.getRevenue.put("rfr_wait", Long.valueOf(currentTimeMillis - j7));
                    aFh1oSDK2.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(aFh1oSDK2.getRevenue).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.values != this.valueOf) {
                    return AFAdRevenueData();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.copydefault.getRevenue(deepLinkResult4, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult4);
                return AFe1cSDK.SUCCESS;
            } catch (Exception e6) {
                e = e6;
                aFe1cSDK = AFAdRevenueData;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.hashCode.component3 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.copydefault.getRevenue(deepLinkResult5, this.hashCode.component3);
                    this.hashCode.getMonetizationNetwork(deepLinkResult5);
                    return AFe1cSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.copydefault.getRevenue(deepLinkResult6, this.hashCode.component3);
                    this.hashCode.getMonetizationNetwork(deepLinkResult6);
                    return aFe1cSDK;
                }
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.copydefault.getRevenue(deepLinkResult7, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult7);
                return aFe1cSDK;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    private final void getMediationNetwork(AFj1sSDK aFj1sSDK) {
        if (getMonetizationNetwork(aFj1sSDK)) {
            this.AFInAppEventType.add(aFj1sSDK);
            this.AFInAppEventParameterName.countDown();
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Added non-organic " + aFj1sSDK.getClass().getSimpleName(), false, 4, null);
            return;
        }
        int i6 = this.values + 1;
        this.values = i6;
        if (i6 == this.valueOf) {
            this.AFInAppEventParameterName.countDown();
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return this.hashCode.component3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1oSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1tSDK<com.appsflyer.internal.DdlResponse> getMediationNetwork(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.getMediationNetwork(java.lang.String):com.appsflyer.internal.AFe1tSDK");
    }
}
