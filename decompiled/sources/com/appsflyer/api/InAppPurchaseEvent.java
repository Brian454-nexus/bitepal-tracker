package com.appsflyer.api;

import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
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
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017"}, d2 = {"Lcom/appsflyer/api/InAppPurchaseEvent;", "Lcom/appsflyer/api/PurchaseEvent;", "", "", "p0", "p1", "Lcom/appsflyer/api/Store;", "p2", "", "p3", "p4", "", "p5", "", "Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "p6", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/api/Store;JLjava/lang/String;ILjava/util/Map;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toJsonMap", "()Ljava/util/Map;", "oneTimePurchaseOfferDetails", "Ljava/util/Map;", "getOneTimePurchaseOfferDetails", "packageName", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "quantity", "I", "getQuantity"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppPurchaseEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppPurchaseEvent.kt\ncom/appsflyer/api/InAppPurchaseEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1179#2,2:58\n1253#2,4:60\n*S KotlinDebug\n*F\n+ 1 InAppPurchaseEvent.kt\ncom/appsflyer/api/InAppPurchaseEvent\n*L\n27#1:58,2\n27#1:60,4\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class InAppPurchaseEvent extends PurchaseEvent {

    @NotNull
    private final Map<String, OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetails;

    @NotNull
    private final String packageName;
    private final int quantity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseEvent(@NotNull List<String> list, @NotNull String str, @NotNull Store store, long j6, @NotNull String str2, int i6, @NotNull Map<String, OneTimePurchaseOfferDetails> map) {
        super(list, str, store, "inapp", j6);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.packageName = str2;
        this.quantity = i6;
        this.oneTimePurchaseOfferDetails = map;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!Intrinsics.areEqual(InAppPurchaseEvent.class, p02 != null ? p02.getClass() : null) || !super.equals(p02)) {
            return false;
        }
        Intrinsics.checkNotNull(p02, "");
        InAppPurchaseEvent inAppPurchaseEvent = (InAppPurchaseEvent) p02;
        return Intrinsics.areEqual(this.packageName, inAppPurchaseEvent.packageName) && this.quantity == inAppPurchaseEvent.quantity && Intrinsics.areEqual(this.oneTimePurchaseOfferDetails, inAppPurchaseEvent.oneTimePurchaseOfferDetails);
    }

    @JvmName(name = "getOneTimePurchaseOfferDetails")
    @NotNull
    public final Map<String, OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    @JvmName(name = "getPackageName")
    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @JvmName(name = "getQuantity")
    public final int getQuantity() {
        return this.quantity;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final int hashCode() {
        return (((((super.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.quantity) * 31) + this.oneTimePurchaseOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent
    @NotNull
    public final Map<String, Object> toJsonMap() {
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, OneTimePurchaseOfferDetails>> entrySet = this.oneTimePurchaseOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) entry.getValue();
            Pair pair = TuplesKt.to(key, oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.toJsonMap() : null);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put("package_name", this.packageName);
        jsonMap.put("one_time_purchase_offer_details", linkedHashMap);
        jsonMap.put("quantity", Integer.valueOf(this.quantity));
        return jsonMap;
    }
}
