package com.appsflyer.internal.models;

import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "", "", "p0", "Lcom/appsflyer/internal/models/Money;", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Lcom/appsflyer/internal/models/Money;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/appsflyer/internal/models/Money;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/appsflyer/internal/models/Money;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "expectedNewPriceChargeTime", "Ljava/lang/String;", "getExpectedNewPriceChargeTime", "newPrice", "Lcom/appsflyer/internal/models/Money;", "getNewPrice", "priceChangeMode", "getPriceChangeMode", "priceChangeState", "getPriceChangeState", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class SubscriptionItemPriceChangeDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String expectedNewPriceChargeTime;

    @Nullable
    private final Money newPrice;

    @NotNull
    private final String priceChangeMode;

    @NotNull
    private final String priceChangeState;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<SubscriptionItemPriceChangeDetails> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getQuantity = 0;
        private static int hashCode = 1;
        private static char[] getPackageName = {34824, 35063, 35071, 34826, 35067, 34827, 34849, 35062, 34847, 35069, 34820, 34858, 34823, 34828, 34822, 34843, 34816, 34817, 34848, 35070, 34842};
        private static int toJsonMap = -2120185745;
        private static boolean getOneTimePurchaseOfferDetails = true;
        private static boolean InAppPurchaseEvent = true;

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:23:0x0068). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int[] r11, java.lang.String r12, int r13, java.lang.String r14, java.lang.Object[] r15) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.models.SubscriptionItemPriceChangeDetails.Companion.a(int[], java.lang.String, int, java.lang.String, java.lang.Object[]):void");
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionItemPriceChangeDetails fromJson(JSONObject jSONObject) {
            hashCode = (getQuantity + 111) % 128;
            SubscriptionItemPriceChangeDetails fromJson = fromJson(jSONObject);
            hashCode = (getQuantity + 55) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscriptionItemPriceChangeDetails fromJson(@NotNull JSONObject p02) {
            Money money;
            getQuantity = (hashCode + 83) % 128;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0081\u0091\u008b\u0090\u0081\u008f\u008a\u008e\u008d\u008c\u0081\u0084\u008b\u008a\u0089\u0088\u0081\u0087\u0086\u0081\u0085\u0084\u0081\u0083\u0082\u0081", objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u0081\u0084\u008b\u008a\u0089\u0088\u0081\u0092", objArr2);
            JSONObject optJSONObject = p02.optJSONObject(((String) objArr2[0]).intern());
            if (optJSONObject != null) {
                hashCode = (getQuantity + 113) % 128;
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "");
                money = Money.INSTANCE.fromJson(optJSONObject);
            } else {
                getQuantity = (hashCode + 83) % 128;
                money = null;
            }
            Object[] objArr3 = new Object[1];
            a(null, null, 127 - View.MeasureSpec.getMode(0), "\u0081\u0086\u0094\u0093\u0081\u008f\u0092\u008e\u008d\u008c\u0081\u0084\u008b\u008a\u0083", objArr3);
            String optString2 = p02.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr4 = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0081\u0085\u008e\u0085\u0095\u0081\u008f\u0092\u008e\u008d\u008c\u0081\u0084\u008b\u008a\u0083", objArr4);
            String optString3 = p02.optString(((String) objArr4[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            return new SubscriptionItemPriceChangeDetails(optString, money, optString2, optString3);
        }
    }

    public SubscriptionItemPriceChangeDetails(@NotNull String str, @Nullable Money money, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.expectedNewPriceChargeTime = str;
        this.newPrice = money;
        this.priceChangeMode = str2;
        this.priceChangeState = str3;
    }

    public static /* synthetic */ SubscriptionItemPriceChangeDetails copy$default(SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, String str, Money money, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime;
        }
        if ((i6 & 2) != 0) {
            money = subscriptionItemPriceChangeDetails.newPrice;
        }
        if ((i6 & 4) != 0) {
            str2 = subscriptionItemPriceChangeDetails.priceChangeMode;
        }
        if ((i6 & 8) != 0) {
            str3 = subscriptionItemPriceChangeDetails.priceChangeState;
        }
        return subscriptionItemPriceChangeDetails.copy(str, money, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getExpectedNewPriceChargeTime() {
        return this.expectedNewPriceChargeTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Money getNewPrice() {
        return this.newPrice;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPriceChangeMode() {
        return this.priceChangeMode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPriceChangeState() {
        return this.priceChangeState;
    }

    @NotNull
    public final SubscriptionItemPriceChangeDetails copy(@NotNull String p02, @Nullable Money p12, @NotNull String p22, @NotNull String p32) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p22, "");
        Intrinsics.checkNotNullParameter(p32, "");
        return new SubscriptionItemPriceChangeDetails(p02, p12, p22, p32);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof SubscriptionItemPriceChangeDetails)) {
            return false;
        }
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = (SubscriptionItemPriceChangeDetails) p02;
        return Intrinsics.areEqual(this.expectedNewPriceChargeTime, subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime) && Intrinsics.areEqual(this.newPrice, subscriptionItemPriceChangeDetails.newPrice) && Intrinsics.areEqual(this.priceChangeMode, subscriptionItemPriceChangeDetails.priceChangeMode) && Intrinsics.areEqual(this.priceChangeState, subscriptionItemPriceChangeDetails.priceChangeState);
    }

    @JvmName(name = "getExpectedNewPriceChargeTime")
    @NotNull
    public final String getExpectedNewPriceChargeTime() {
        return this.expectedNewPriceChargeTime;
    }

    @JvmName(name = "getNewPrice")
    @Nullable
    public final Money getNewPrice() {
        return this.newPrice;
    }

    @JvmName(name = "getPriceChangeMode")
    @NotNull
    public final String getPriceChangeMode() {
        return this.priceChangeMode;
    }

    @JvmName(name = "getPriceChangeState")
    @NotNull
    public final String getPriceChangeState() {
        return this.priceChangeState;
    }

    public final int hashCode() {
        int hashCode = this.expectedNewPriceChargeTime.hashCode() * 31;
        Money money = this.newPrice;
        return ((((hashCode + (money == null ? 0 : money.hashCode())) * 31) + this.priceChangeMode.hashCode()) * 31) + this.priceChangeState.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscriptionItemPriceChangeDetails(expectedNewPriceChargeTime=" + this.expectedNewPriceChargeTime + ", newPrice=" + this.newPrice + ", priceChangeMode=" + this.priceChangeMode + ", priceChangeState=" + this.priceChangeState + ")";
    }
}
