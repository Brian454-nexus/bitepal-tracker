package com.appsflyer.appsflyersdk;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.Store;
import com.appsflyer.internal.models.AutoRenewingPlan;
import com.appsflyer.internal.models.CancelSurveyResult;
import com.appsflyer.internal.models.CanceledStateContext;
import com.appsflyer.internal.models.DeferredItemReplacement;
import com.appsflyer.internal.models.DeveloperInitiatedCancellation;
import com.appsflyer.internal.models.ExternalAccountIdentifiers;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.Money;
import com.appsflyer.internal.models.OfferDetails;
import com.appsflyer.internal.models.PausedStateContext;
import com.appsflyer.internal.models.PrepaidPlan;
import com.appsflyer.internal.models.ProductPurchase;
import com.appsflyer.internal.models.ReplacementCancellation;
import com.appsflyer.internal.models.SubscribeWithGoogleInfo;
import com.appsflyer.internal.models.SubscriptionItemPriceChangeDetails;
import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.SubscriptionPurchaseLineItem;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import com.appsflyer.internal.models.SystemInitiatedCancellation;
import com.appsflyer.internal.models.TestPurchase;
import com.appsflyer.internal.models.UserInitiatedCancellation;
import com.appsflyer.internal.models.ValidationFailureData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u0015H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u0016H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u0017H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u0018H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u0019H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u001aH\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u001bH\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u001cH\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u001dH\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u001eH\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\u001fH\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020 H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020!H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020\"H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020#H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020$H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020%H\u0002J\u0018\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020&J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020'H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020(H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020)H\u0002J\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012*\u00020*H\u0002R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/appsflyer/appsflyersdk/ConnectorWrapper;", "Lcom/appsflyer/api/PurchaseClient;", "context", "Landroid/content/Context;", "logSubs", "", "logInApps", "sandbox", "subsListener", "Lcom/appsflyer/appsflyersdk/MappedValidationResultListener;", "inAppListener", "<init>", "(Landroid/content/Context;ZZZLcom/appsflyer/appsflyersdk/MappedValidationResultListener;Lcom/appsflyer/appsflyersdk/MappedValidationResultListener;)V", "connector", "startObservingTransactions", "", "stopObservingTransactions", "toJsonMap", "", "", "", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "Lcom/appsflyer/internal/models/CanceledStateContext;", "Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;", "Lcom/appsflyer/internal/models/ReplacementCancellation;", "Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "Lcom/appsflyer/internal/models/CancelSurveyResult;", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "Lcom/appsflyer/internal/models/OfferDetails;", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "Lcom/appsflyer/internal/models/Money;", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "Lcom/appsflyer/internal/models/PrepaidPlan;", "Lcom/appsflyer/internal/models/PausedStateContext;", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "Lcom/appsflyer/internal/models/TestPurchase;", "Lcom/appsflyer/internal/models/ProductPurchase;", "Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;", "Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "Lcom/appsflyer/internal/models/ValidationFailureData;", "appsflyer_sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectorWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectorWrapper.kt\ncom/appsflyer/appsflyersdk/ConnectorWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1557#2:252\n1628#2,3:253\n*S KotlinDebug\n*F\n+ 1 ConnectorWrapper.kt\ncom/appsflyer/appsflyersdk/ConnectorWrapper\n*L\n82#1:252\n82#1:253,3\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ConnectorWrapper implements PurchaseClient {

    @NotNull
    private final PurchaseClient connector;

    public ConnectorWrapper(@NotNull Context context, boolean z6, boolean z7, boolean z8, @NotNull final MappedValidationResultListener subsListener, @NotNull final MappedValidationResultListener inAppListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subsListener, "subsListener");
        Intrinsics.checkNotNullParameter(inAppListener, "inAppListener");
        this.connector = new PurchaseClient.Builder(context, Store.GOOGLE).setSandbox(z8).logSubscriptions(z6).autoLogInApps(z7).setSubscriptionValidationResultListener(new PurchaseClient.SubscriptionPurchaseValidationResultListener() { // from class: com.appsflyer.appsflyersdk.ConnectorWrapper$connector$1
            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public void onFailure(String result, Throwable error) {
                Intrinsics.checkNotNullParameter(result, "result");
                MappedValidationResultListener.this.onFailure(result, error);
            }

            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public /* bridge */ /* synthetic */ void onResponse(Map<String, ? extends SubscriptionValidationResult> map) {
                onResponse2((Map<String, SubscriptionValidationResult>) map);
            }

            /* renamed from: onResponse, reason: avoid collision after fix types in other method */
            public void onResponse2(Map<String, SubscriptionValidationResult> result) {
                LinkedHashMap linkedHashMap;
                Set<Map.Entry<String, SubscriptionValidationResult>> entrySet;
                Map jsonMap;
                MappedValidationResultListener mappedValidationResultListener = MappedValidationResultListener.this;
                if (result == null || (entrySet = result.entrySet()) == null) {
                    linkedHashMap = null;
                } else {
                    ConnectorWrapper connectorWrapper = this;
                    linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
                    Iterator<T> it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        jsonMap = connectorWrapper.toJsonMap((SubscriptionValidationResult) entry.getValue());
                        Pair pair = TuplesKt.to(str, jsonMap);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                }
                mappedValidationResultListener.onResponse(linkedHashMap);
            }
        }).setInAppValidationResultListener(new PurchaseClient.InAppPurchaseValidationResultListener() { // from class: com.appsflyer.appsflyersdk.ConnectorWrapper$connector$2
            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public void onFailure(String result, Throwable error) {
                Intrinsics.checkNotNullParameter(result, "result");
                MappedValidationResultListener.this.onFailure(result, error);
            }

            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public /* bridge */ /* synthetic */ void onResponse(Map<String, ? extends InAppPurchaseValidationResult> map) {
                onResponse2((Map<String, InAppPurchaseValidationResult>) map);
            }

            /* renamed from: onResponse, reason: avoid collision after fix types in other method */
            public void onResponse2(Map<String, InAppPurchaseValidationResult> result) {
                LinkedHashMap linkedHashMap;
                Set<Map.Entry<String, InAppPurchaseValidationResult>> entrySet;
                Map jsonMap;
                MappedValidationResultListener mappedValidationResultListener = MappedValidationResultListener.this;
                if (result == null || (entrySet = result.entrySet()) == null) {
                    linkedHashMap = null;
                } else {
                    ConnectorWrapper connectorWrapper = this;
                    linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
                    Iterator<T> it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        jsonMap = connectorWrapper.toJsonMap((InAppPurchaseValidationResult) entry.getValue());
                        Pair pair = TuplesKt.to(str, jsonMap);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                }
                mappedValidationResultListener.onResponse(linkedHashMap);
            }
        }).build();
    }

    private final Map<String, Object> toJsonMap(SubscriptionPurchase subscriptionPurchase) {
        Pair pair = TuplesKt.to("acknowledgementState", subscriptionPurchase.getAcknowledgementState());
        CanceledStateContext canceledStateContext = subscriptionPurchase.getCanceledStateContext();
        Pair pair2 = TuplesKt.to("canceledStateContext", canceledStateContext != null ? toJsonMap(canceledStateContext) : null);
        ExternalAccountIdentifiers externalAccountIdentifiers = subscriptionPurchase.getExternalAccountIdentifiers();
        Pair pair3 = TuplesKt.to("externalAccountIdentifiers", externalAccountIdentifiers != null ? toJsonMap(externalAccountIdentifiers) : null);
        Pair pair4 = TuplesKt.to("kind", subscriptionPurchase.getKind());
        Pair pair5 = TuplesKt.to("latestOrderId", subscriptionPurchase.getLatestOrderId());
        List<SubscriptionPurchaseLineItem> lineItems = subscriptionPurchase.getLineItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lineItems, 10));
        Iterator<T> it = lineItems.iterator();
        while (it.hasNext()) {
            arrayList.add(toJsonMap((SubscriptionPurchaseLineItem) it.next()));
        }
        Pair pair6 = TuplesKt.to("lineItems", arrayList);
        Pair pair7 = TuplesKt.to("linkedPurchaseToken", subscriptionPurchase.getLinkedPurchaseToken());
        PausedStateContext pausedStateContext = subscriptionPurchase.getPausedStateContext();
        Pair pair8 = TuplesKt.to("pausedStateContext", pausedStateContext != null ? toJsonMap(pausedStateContext) : null);
        Pair pair9 = TuplesKt.to("regionCode", subscriptionPurchase.getRegionCode());
        Pair pair10 = TuplesKt.to("startTime", subscriptionPurchase.getStartTime());
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = subscriptionPurchase.getSubscribeWithGoogleInfo();
        Pair pair11 = TuplesKt.to("subscribeWithGoogleInfo", subscribeWithGoogleInfo != null ? toJsonMap(subscribeWithGoogleInfo) : null);
        Pair pair12 = TuplesKt.to("subscriptionState", subscriptionPurchase.getSubscriptionState());
        TestPurchase testPurchase = subscriptionPurchase.getTestPurchase();
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, TuplesKt.to("testPurchase", testPurchase != null ? toJsonMap(testPurchase) : null)});
    }

    @Override // com.appsflyer.api.PurchaseClient
    public void startObservingTransactions() {
        this.connector.startObservingTransactions();
    }

    @Override // com.appsflyer.api.PurchaseClient
    public void stopObservingTransactions() {
        this.connector.stopObservingTransactions();
    }

    private final Map<String, Object> toJsonMap(CanceledStateContext canceledStateContext) {
        DeveloperInitiatedCancellation developerInitiatedCancellation = canceledStateContext.getDeveloperInitiatedCancellation();
        Pair pair = TuplesKt.to("developerInitiatedCancellation", developerInitiatedCancellation != null ? toJsonMap(developerInitiatedCancellation) : null);
        ReplacementCancellation replacementCancellation = canceledStateContext.getReplacementCancellation();
        Pair pair2 = TuplesKt.to("replacementCancellation", replacementCancellation != null ? toJsonMap(replacementCancellation) : null);
        SystemInitiatedCancellation systemInitiatedCancellation = canceledStateContext.getSystemInitiatedCancellation();
        Pair pair3 = TuplesKt.to("systemInitiatedCancellation", systemInitiatedCancellation != null ? toJsonMap(systemInitiatedCancellation) : null);
        UserInitiatedCancellation userInitiatedCancellation = canceledStateContext.getUserInitiatedCancellation();
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("userInitiatedCancellation", userInitiatedCancellation != null ? toJsonMap(userInitiatedCancellation) : null)});
    }

    private final Map<String, Object> toJsonMap(DeveloperInitiatedCancellation developerInitiatedCancellation) {
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> toJsonMap(ReplacementCancellation replacementCancellation) {
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> toJsonMap(SystemInitiatedCancellation systemInitiatedCancellation) {
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> toJsonMap(UserInitiatedCancellation userInitiatedCancellation) {
        CancelSurveyResult cancelSurveyResult = userInitiatedCancellation.getCancelSurveyResult();
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("cancelSurveyResult", cancelSurveyResult != null ? toJsonMap(cancelSurveyResult) : null), TuplesKt.to("cancelTime", userInitiatedCancellation.getCancelTime())});
    }

    private final Map<String, Object> toJsonMap(CancelSurveyResult cancelSurveyResult) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("reason", cancelSurveyResult.getReason()), TuplesKt.to("reasonUserInput", cancelSurveyResult.getReasonUserInput())});
    }

    private final Map<String, Object> toJsonMap(ExternalAccountIdentifiers externalAccountIdentifiers) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("externalAccountId", externalAccountIdentifiers.getExternalAccountId()), TuplesKt.to("obfuscatedExternalAccountId", externalAccountIdentifiers.getObfuscatedExternalAccountId()), TuplesKt.to("obfuscatedExternalProfileId", externalAccountIdentifiers.getObfuscatedExternalProfileId())});
    }

    private final Map<String, Object> toJsonMap(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem) {
        AutoRenewingPlan autoRenewingPlan = subscriptionPurchaseLineItem.getAutoRenewingPlan();
        Pair pair = TuplesKt.to("autoRenewingPlan", autoRenewingPlan != null ? toJsonMap(autoRenewingPlan) : null);
        DeferredItemReplacement deferredItemReplacement = subscriptionPurchaseLineItem.getDeferredItemReplacement();
        Pair pair2 = TuplesKt.to("deferredItemReplacement", deferredItemReplacement != null ? toJsonMap(deferredItemReplacement) : null);
        Pair pair3 = TuplesKt.to("expiryTime", subscriptionPurchaseLineItem.getExpiryTime());
        OfferDetails offerDetails = subscriptionPurchaseLineItem.getOfferDetails();
        Pair pair4 = TuplesKt.to("offerDetails", offerDetails != null ? toJsonMap(offerDetails) : null);
        PrepaidPlan prepaidPlan = subscriptionPurchaseLineItem.getPrepaidPlan();
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, TuplesKt.to("prepaidPlan", prepaidPlan != null ? toJsonMap(prepaidPlan) : null), TuplesKt.to("productId", subscriptionPurchaseLineItem.getProductId())});
    }

    private final Map<String, Object> toJsonMap(OfferDetails offerDetails) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("offerTags", offerDetails.getOfferTags()), TuplesKt.to("basePlanId", offerDetails.getBasePlanId()), TuplesKt.to("offerId", offerDetails.getOfferId())});
    }

    private final Map<String, Object> toJsonMap(AutoRenewingPlan autoRenewingPlan) {
        Pair pair = TuplesKt.to("autoRenewEnabled", autoRenewingPlan.getAutoRenewEnabled());
        SubscriptionItemPriceChangeDetails priceChangeDetails = autoRenewingPlan.getPriceChangeDetails();
        return MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("priceChangeDetails", priceChangeDetails != null ? toJsonMap(priceChangeDetails) : null)});
    }

    private final Map<String, Object> toJsonMap(SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        Pair pair = TuplesKt.to("expectedNewPriceChargeTime", subscriptionItemPriceChangeDetails.getExpectedNewPriceChargeTime());
        Money newPrice = subscriptionItemPriceChangeDetails.getNewPrice();
        return MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("newPrice", newPrice != null ? toJsonMap(newPrice) : null), TuplesKt.to("priceChangeMode", subscriptionItemPriceChangeDetails.getPriceChangeMode()), TuplesKt.to("priceChangeState", subscriptionItemPriceChangeDetails.getPriceChangeState())});
    }

    private final Map<String, Object> toJsonMap(Money money) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to(AppsFlyerProperties.CURRENCY_CODE, money.getCurrencyCode()), TuplesKt.to("nanos", Long.valueOf(money.getNanos())), TuplesKt.to("units", Long.valueOf(money.getUnits()))});
    }

    private final Map<String, Object> toJsonMap(DeferredItemReplacement deferredItemReplacement) {
        return MapsKt.mapOf(TuplesKt.to("productId", deferredItemReplacement.getProductId()));
    }

    private final Map<String, Object> toJsonMap(PrepaidPlan prepaidPlan) {
        return MapsKt.mapOf(TuplesKt.to("allowExtendAfterTime", prepaidPlan.getAllowExtendAfterTime()));
    }

    private final Map<String, Object> toJsonMap(PausedStateContext pausedStateContext) {
        return MapsKt.mapOf(TuplesKt.to("autoResumeTime", pausedStateContext.getAutoResumeTime()));
    }

    private final Map<String, Object> toJsonMap(SubscribeWithGoogleInfo subscribeWithGoogleInfo) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("emailAddress", subscribeWithGoogleInfo.getEmailAddress()), TuplesKt.to("familyName", subscribeWithGoogleInfo.getFamilyName()), TuplesKt.to("givenName", subscribeWithGoogleInfo.getGivenName()), TuplesKt.to("profileId", subscribeWithGoogleInfo.getProfileId()), TuplesKt.to("profileName", subscribeWithGoogleInfo.getProfileName())});
    }

    @NotNull
    public final Map<String, Object> toJsonMap(@NotNull TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(testPurchase, "<this>");
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> toJsonMap(ProductPurchase productPurchase) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("kind", productPurchase.getKind()), TuplesKt.to("purchaseTimeMillis", productPurchase.getPurchaseTimeMillis()), TuplesKt.to("purchaseState", Integer.valueOf(productPurchase.getPurchaseState())), TuplesKt.to("consumptionState", Integer.valueOf(productPurchase.getConsumptionState())), TuplesKt.to("developerPayload", productPurchase.getDeveloperPayload()), TuplesKt.to("orderId", productPurchase.getOrderId()), TuplesKt.to("purchaseType", Integer.valueOf(productPurchase.getPurchaseType())), TuplesKt.to("acknowledgementState", Integer.valueOf(productPurchase.getAcknowledgementState())), TuplesKt.to("purchaseToken", productPurchase.getPurchaseToken()), TuplesKt.to("productId", productPurchase.getProductId()), TuplesKt.to("quantity", Integer.valueOf(productPurchase.getQuantity())), TuplesKt.to("obfuscatedExternalAccountId", productPurchase.getObfuscatedExternalAccountId()), TuplesKt.to("obfuscatedExternalProfileId", productPurchase.getObfuscatedExternalProfileId()), TuplesKt.to("regionCode", productPurchase.getRegionCode())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> toJsonMap(InAppPurchaseValidationResult inAppPurchaseValidationResult) {
        Pair pair = TuplesKt.to(com.amazon.device.simplesignin.a.a.a.f11730s, Boolean.valueOf(inAppPurchaseValidationResult.getSuccess()));
        ProductPurchase productPurchase = inAppPurchaseValidationResult.getProductPurchase();
        Pair pair2 = TuplesKt.to("productPurchase", productPurchase != null ? toJsonMap(productPurchase) : null);
        ValidationFailureData failureData = inAppPurchaseValidationResult.getFailureData();
        return MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("failureData", failureData != null ? toJsonMap(failureData) : null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> toJsonMap(SubscriptionValidationResult subscriptionValidationResult) {
        Pair pair = TuplesKt.to(com.amazon.device.simplesignin.a.a.a.f11730s, Boolean.valueOf(subscriptionValidationResult.getSuccess()));
        SubscriptionPurchase subscriptionPurchase = subscriptionValidationResult.getSubscriptionPurchase();
        Pair pair2 = TuplesKt.to("subscriptionPurchase", subscriptionPurchase != null ? toJsonMap(subscriptionPurchase) : null);
        ValidationFailureData failureData = subscriptionValidationResult.getFailureData();
        return MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("failureData", failureData != null ? toJsonMap(failureData) : null)});
    }

    private final Map<String, Object> toJsonMap(ValidationFailureData validationFailureData) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("status", Integer.valueOf(validationFailureData.getStatus())), TuplesKt.to(com.amazon.a.a.o.b.f11199c, validationFailureData.getDescription())});
    }
}
