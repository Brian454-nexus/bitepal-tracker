package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0014\u0010\u0017J%\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1qSDK;", "Lcom/appsflyer/internal/AFf1vSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1hSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1hSDK;)V", "", "", "", "AFAdRevenueData", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFe1tSDK;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFe1tSDK;", "(Ljava/util/Map;)Ljava/lang/String;", "", "getMediationNetwork", "(Ljava/lang/String;I)V", "getRevenue", "()V", "copydefault", "Ljava/util/Map;", "getCurrencyIso4217Code", "copy", "Lcom/appsflyer/internal/AFj1hSDK;", "equals", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "getMonetizationNetwork", "component3", "Lcom/appsflyer/AppsFlyerProperties;", "toString", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManualValidationTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1747#2,3:145\n*S KotlinDebug\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n*L\n98#1:145,3\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1qSDK extends AFf1vSDK {

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties getMediationNetwork;

    /* renamed from: copy, reason: from kotlin metadata */
    @NotNull
    private final AFj1hSDK getRevenue;

    /* renamed from: copydefault, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> getCurrencyIso4217Code;

    /* renamed from: equals, reason: from kotlin metadata */
    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback getMonetizationNetwork;

    /* renamed from: toString, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails AFAdRevenueData;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AFa1tSDK extends RuntimeException {
    }

    public /* synthetic */ AFf1qSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i6 & 32) != 0 ? new AFj1gSDK() : aFj1hSDK);
    }

    private final void getMediationNetwork(String p02, int p12) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMonetizationNetwork;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(new Pair[]{TuplesKt.to("error_code", Integer.valueOf(p12)), TuplesKt.to("error_message", p02)}));
        }
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> p02, @Nullable String p12) {
        Map<String, Object> emptyMap;
        Intrinsics.checkNotNullParameter(p02, "");
        super.AFAdRevenueData(p02, p12);
        List listOf = CollectionsKt.listOf(new String[]{this.AFAdRevenueData.getPurchaseToken(), this.AFAdRevenueData.getProductId(), this.AFAdRevenueData.getPrice(), this.AFAdRevenueData.getCurrency()});
        if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        p02.put("purchase_token", this.AFAdRevenueData.getPurchaseToken());
        p02.put("product_id", this.AFAdRevenueData.getProductId());
        p02.put("revenue", this.AFAdRevenueData.getPrice());
        p02.put(com.amazon.a.a.o.b.f11197a, this.AFAdRevenueData.getCurrency());
        p02.put("purchase_type", this.AFAdRevenueData.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p02.put("extra_event_values", this.getCurrencyIso4217Code);
        }
        String string = this.getMediationNetwork.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string != null && string.length() != 0) {
            emptyMap = AFj1dSDK.AFAdRevenueData(new JSONObject(string));
        } else {
            emptyMap = MapsKt.emptyMap();
        }
        p02.put("custom_data", emptyMap);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        Object obj;
        Unit unit;
        super.getRevenue();
        Throwable component1 = component1();
        if (component1 != null && !(component1 instanceof AFf1ySDK)) {
            if (component1 instanceof AFf1wSDK) {
                getMediationNetwork("No dev key", -1);
            } else if (component1 instanceof AFa1tSDK) {
                getMediationNetwork("One or more of provided arguments is empty", -1);
            } else {
                getMediationNetwork("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMonetizationNetwork;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(new Pair[]{TuplesKt.to("error_code", Integer.valueOf(responseNetwork.getStatusCode())), TuplesKt.to("error_message", responseNetwork.getBody())}));
                    return;
                }
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMonetizationNetwork;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1dSDK.AFAdRevenueData(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                obj = Result.constructor-impl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            Result.box-impl(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFf1qSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1hSDK aFj1hSDK) {
        super(AFf1zSDK.MANUAL_PURCHASE_VALIDATION, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, null, MapsKt.emptyMap());
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1hSDK, "");
        this.getMediationNetwork = appsFlyerProperties;
        this.AFAdRevenueData = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.getMonetizationNetwork = appsFlyerInAppPurchaseValidationCallback;
        this.getRevenue = aFj1hSDK;
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFf1qSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    @NotNull
    public final String AFAdRevenueData(@NotNull Map<String, Object> p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return this.getRevenue.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    @Nullable
    public final AFe1tSDK<String> AFAdRevenueData(@NotNull Map<String, Object> p02, @NotNull String p12, @Nullable String p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        return ((AFf1oSDK) this).component2.getMonetizationNetwork(p02, p12);
    }
}
