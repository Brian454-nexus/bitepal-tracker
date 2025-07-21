package com.appsflyer.api;

import com.appsflyer.api.models.SubscriptionOfferDetails;
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
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018"}, d2 = {"Lcom/appsflyer/api/SubscriptionPurchaseEvent;", "Lcom/appsflyer/api/PurchaseEvent;", "", "", "p0", "p1", "Lcom/appsflyer/api/Store;", "p2", "", "p3", "", "Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "p4", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/api/Store;JLjava/util/Map;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toJsonMap", "()Ljava/util/Map;", "subscriptionOfferDetails", "Ljava/util/Map;", "getSubscriptionOfferDetails"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionPurchaseEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchaseEvent.kt\ncom/appsflyer/api/SubscriptionPurchaseEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1179#2,2:45\n1253#2,2:47\n1549#2:49\n1620#2,3:50\n1256#2:53\n*S KotlinDebug\n*F\n+ 1 SubscriptionPurchaseEvent.kt\ncom/appsflyer/api/SubscriptionPurchaseEvent\n*L\n20#1:45,2\n20#1:47,2\n20#1:49\n20#1:50,3\n20#1:53\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class SubscriptionPurchaseEvent extends PurchaseEvent {

    @NotNull
    private final Map<String, List<SubscriptionOfferDetails>> subscriptionOfferDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionPurchaseEvent(@NotNull List<String> list, @NotNull String str, @NotNull Store store, long j6, @NotNull Map<String, ? extends List<SubscriptionOfferDetails>> map) {
        super(list, str, store, "subs", j6);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.subscriptionOfferDetails = map;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!Intrinsics.areEqual(SubscriptionPurchaseEvent.class, p02 != null ? p02.getClass() : null) || !super.equals(p02)) {
            return false;
        }
        Intrinsics.checkNotNull(p02, "");
        return Intrinsics.areEqual(this.subscriptionOfferDetails, ((SubscriptionPurchaseEvent) p02).subscriptionOfferDetails);
    }

    @JvmName(name = "getSubscriptionOfferDetails")
    @NotNull
    public final Map<String, List<SubscriptionOfferDetails>> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final int hashCode() {
        return (super.hashCode() * 31) + this.subscriptionOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent
    @NotNull
    public final Map<String, Object> toJsonMap() {
        ArrayList arrayList;
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, List<SubscriptionOfferDetails>>> entrySet = this.subscriptionOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((SubscriptionOfferDetails) it2.next()).toJsonMap());
                }
            } else {
                arrayList = null;
            }
            Pair pair = TuplesKt.to(key, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put("subscription_offer_details", linkedHashMap);
        return jsonMap;
    }
}
