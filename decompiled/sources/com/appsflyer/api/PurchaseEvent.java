package com.appsflyer.api;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0014\b&\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/appsflyer/api/PurchaseEvent;", "Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1z;", "", "", "p0", "p1", "Lcom/appsflyer/api/Store;", "p2", "p3", "", "p4", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/api/Store;Ljava/lang/String;J)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toJsonMap", "()Ljava/util/Map;", "productIds", "Ljava/util/List;", "getProductIds", "()Ljava/util/List;", "productType", "Ljava/lang/String;", "getProductType", "()Ljava/lang/String;", "purchaseTime", "J", "getPurchaseTime", "()J", "purchaseToken", "getPurchaseToken", "store", "Lcom/appsflyer/api/Store;", "getStore", "()Lcom/appsflyer/api/Store;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class PurchaseEvent implements AFPurchaseConnectorA1z {

    @NotNull
    private final List<String> productIds;

    @NotNull
    private final String productType;
    private final long purchaseTime;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final Store store;

    public PurchaseEvent(@NotNull List<String> list, @NotNull String str, @NotNull Store store, @NotNull String str2, long j6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.productIds = list;
        this.purchaseToken = str;
        this.store = store;
        this.productType = str2;
        this.purchaseTime = j6;
    }

    public boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p02 != null ? p02.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p02, "");
        PurchaseEvent purchaseEvent = (PurchaseEvent) p02;
        return Intrinsics.areEqual(this.productIds, purchaseEvent.productIds) && Intrinsics.areEqual(this.purchaseToken, purchaseEvent.purchaseToken) && this.store == purchaseEvent.store && Intrinsics.areEqual(this.productType, purchaseEvent.productType);
    }

    @JvmName(name = "getProductIds")
    @NotNull
    public final List<String> getProductIds() {
        return this.productIds;
    }

    @JvmName(name = "getProductType")
    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @JvmName(name = "getPurchaseTime")
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @JvmName(name = "getPurchaseToken")
    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @JvmName(name = "getStore")
    @NotNull
    public final Store getStore() {
        return this.store;
    }

    public int hashCode() {
        return (((((this.productIds.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.store.hashCode()) * 31) + this.productType.hashCode();
    }

    @NotNull
    public Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("purchase_token", this.purchaseToken), TuplesKt.to("product_ids", this.productIds), TuplesKt.to("product_type", this.productType), TuplesKt.to("purchase_time", Long.valueOf(this.purchaseTime))});
    }
}
