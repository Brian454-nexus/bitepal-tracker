package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2w;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014BA\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0014JT\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\"\u0010\u0014R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010&\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010,\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010/\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "p0", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "p1", "", "p2", "Lcom/appsflyer/internal/models/OfferDetails;", "p3", "Lcom/appsflyer/internal/models/PrepaidPlan;", "p4", "p5", "<init>", "(Lcom/appsflyer/internal/models/AutoRenewingPlan;Lcom/appsflyer/internal/models/DeferredItemReplacement;Ljava/lang/String;Lcom/appsflyer/internal/models/OfferDetails;Lcom/appsflyer/internal/models/PrepaidPlan;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/internal/models/AutoRenewingPlan;", "component2", "()Lcom/appsflyer/internal/models/DeferredItemReplacement;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/appsflyer/internal/models/OfferDetails;", "component5", "()Lcom/appsflyer/internal/models/PrepaidPlan;", "component6", "copy", "(Lcom/appsflyer/internal/models/AutoRenewingPlan;Lcom/appsflyer/internal/models/DeferredItemReplacement;Ljava/lang/String;Lcom/appsflyer/internal/models/OfferDetails;Lcom/appsflyer/internal/models/PrepaidPlan;Ljava/lang/String;)Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "autoRenewingPlan", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "getAutoRenewingPlan", "deferredItemReplacement", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "getDeferredItemReplacement", "expiryTime", "Ljava/lang/String;", "getExpiryTime", "offerDetails", "Lcom/appsflyer/internal/models/OfferDetails;", "getOfferDetails", "prepaidPlan", "Lcom/appsflyer/internal/models/PrepaidPlan;", "getPrepaidPlan", "productId", "getProductId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class SubscriptionPurchaseLineItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AutoRenewingPlan autoRenewingPlan;

    @Nullable
    private final DeferredItemReplacement deferredItemReplacement;

    @NotNull
    private final String expiryTime;

    @Nullable
    private final OfferDetails offerDetails;

    @Nullable
    private final PrepaidPlan prepaidPlan;

    @NotNull
    private final String productId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<SubscriptionPurchaseLineItem> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = -861462659;
        private static int getQuantity;

        private Companion() {
        }

        private static void a(boolean z6, int i6, int i7, int i8, String str, Object[] objArr) {
            $11 = ($10 + 125) % 128;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA2w aFPurchaseConnectorA2w = new AFPurchaseConnectorA2w();
            char[] cArr3 = new char[i8];
            aFPurchaseConnectorA2w.toJsonMap = 0;
            while (true) {
                int i9 = aFPurchaseConnectorA2w.toJsonMap;
                if (i9 >= i8) {
                    break;
                }
                char c6 = cArr2[i9];
                aFPurchaseConnectorA2w.getOneTimePurchaseOfferDetails = c6;
                char c7 = (char) (c6 + i6);
                cArr3[i9] = c7;
                cArr3[i9] = (char) (c7 - ((int) (getPackageName ^ (-2543415058719367236L))));
                aFPurchaseConnectorA2w.toJsonMap = i9 + 1;
            }
            if (i7 > 0) {
                aFPurchaseConnectorA2w.InAppPurchaseEvent = i7;
                char[] cArr4 = new char[i8];
                System.arraycopy(cArr3, 0, cArr4, 0, i8);
                int i10 = aFPurchaseConnectorA2w.InAppPurchaseEvent;
                System.arraycopy(cArr4, 0, cArr3, i8 - i10, i10);
                int i11 = aFPurchaseConnectorA2w.InAppPurchaseEvent;
                System.arraycopy(cArr4, i11, cArr3, 0, i8 - i11);
            }
            if (z6) {
                char[] cArr5 = new char[i8];
                aFPurchaseConnectorA2w.toJsonMap = 0;
                $11 = ($10 + 43) % 128;
                while (true) {
                    int i12 = aFPurchaseConnectorA2w.toJsonMap;
                    if (i12 >= i8) {
                        break;
                    }
                    cArr5[i12] = cArr3[(i8 - i12) - 1];
                    aFPurchaseConnectorA2w.toJsonMap = i12 + 1;
                }
                cArr3 = cArr5;
            }
            objArr[0] = new String(cArr3);
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionPurchaseLineItem fromJson(JSONObject jSONObject) {
            int i6 = getQuantity + 73;
            getOneTimePurchaseOfferDetails = i6 % 128;
            int i7 = i6 % 2;
            SubscriptionPurchaseLineItem fromJson = fromJson(jSONObject);
            if (i7 == 0) {
                int i8 = 84 / 0;
            }
            int i9 = getQuantity + 55;
            getOneTimePurchaseOfferDetails = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 32 / 0;
            }
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscriptionPurchaseLineItem fromJson(@NotNull JSONObject p02) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 297, 12 - KeyEvent.keyCodeFromString(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, "￪�\u0006�\u000f\u0001\u0006\uffff￨\u0004\ufff9\u0006\ufff9\r\f\u0007", objArr);
            object = SubscriptionPurchaseKt.toObject(p02, ((String) objArr[0]).intern(), AutoRenewingPlan.INSTANCE);
            Object[] objArr2 = new Object[1];
            a(false, 295 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, View.resolveSize(0, 0) + 23, "\ufffb�\uffff\u0007\uffff\b\u000e\ufffe\uffff\u0000\uffff\f\f\uffff\ufffe￣\u000e\uffff\u0007￬\uffff\n\u0006", objArr2);
            object2 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr2[0]).intern(), DeferredItemReplacement.INSTANCE);
            Object[] objArr3 = new Object[1];
            a(false, 300 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0005\ufffe\u0007\u000e￩\ufffe\u0002\ufffa\ufffa\r", objArr3);
            String optString = p02.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr4 = new Object[1];
            a(false, (ViewConfiguration.getTouchSlop() >> 8) + 296, 2 - ExpandableListView.getPackedPositionType(0L), 12 - Color.red(0), "\u0005\f\b\uffff\uffff\ufffe\u000b\uffdd\ufffe\r\ufffa\u0002", objArr4);
            object3 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr4[0]).intern(), OfferDetails.INSTANCE);
            Object[] objArr5 = new Object[1];
            a(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 296, AndroidCharacter.getMirror('0') - '(', (Process.myTid() >> 22) + 11, "￩�\u0002\ufffa\t\ufffe\u000b\t\u0007\ufffa\u0005", objArr5);
            object4 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr5[0]).intern(), PrepaidPlan.INSTANCE);
            Object[] objArr6 = new Object[1];
            a(true, (ViewConfiguration.getScrollBarSize() >> 8) + 297, TextUtils.lastIndexOf("", '0') + 3, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, "\n\b￼￡\f\ufffb\r￼\u0007", objArr6);
            String optString2 = p02.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = new SubscriptionPurchaseLineItem((AutoRenewingPlan) object, (DeferredItemReplacement) object2, optString, (OfferDetails) object3, (PrepaidPlan) object4, optString2);
            int i6 = getOneTimePurchaseOfferDetails + 91;
            getQuantity = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 93 / 0;
            }
            return subscriptionPurchaseLineItem;
        }
    }

    public SubscriptionPurchaseLineItem(@Nullable AutoRenewingPlan autoRenewingPlan, @Nullable DeferredItemReplacement deferredItemReplacement, @NotNull String str, @Nullable OfferDetails offerDetails, @Nullable PrepaidPlan prepaidPlan, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.autoRenewingPlan = autoRenewingPlan;
        this.deferredItemReplacement = deferredItemReplacement;
        this.expiryTime = str;
        this.offerDetails = offerDetails;
        this.prepaidPlan = prepaidPlan;
        this.productId = str2;
    }

    public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            autoRenewingPlan = subscriptionPurchaseLineItem.autoRenewingPlan;
        }
        if ((i6 & 2) != 0) {
            deferredItemReplacement = subscriptionPurchaseLineItem.deferredItemReplacement;
        }
        if ((i6 & 4) != 0) {
            str = subscriptionPurchaseLineItem.expiryTime;
        }
        if ((i6 & 8) != 0) {
            offerDetails = subscriptionPurchaseLineItem.offerDetails;
        }
        if ((i6 & 16) != 0) {
            prepaidPlan = subscriptionPurchaseLineItem.prepaidPlan;
        }
        if ((i6 & 32) != 0) {
            str2 = subscriptionPurchaseLineItem.productId;
        }
        PrepaidPlan prepaidPlan2 = prepaidPlan;
        String str3 = str2;
        return subscriptionPurchaseLineItem.copy(autoRenewingPlan, deferredItemReplacement, str, offerDetails, prepaidPlan2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final SubscriptionPurchaseLineItem copy(@Nullable AutoRenewingPlan p02, @Nullable DeferredItemReplacement p12, @NotNull String p22, @Nullable OfferDetails p32, @Nullable PrepaidPlan p42, @NotNull String p52) {
        Intrinsics.checkNotNullParameter(p22, "");
        Intrinsics.checkNotNullParameter(p52, "");
        return new SubscriptionPurchaseLineItem(p02, p12, p22, p32, p42, p52);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof SubscriptionPurchaseLineItem)) {
            return false;
        }
        SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) p02;
        return Intrinsics.areEqual(this.autoRenewingPlan, subscriptionPurchaseLineItem.autoRenewingPlan) && Intrinsics.areEqual(this.deferredItemReplacement, subscriptionPurchaseLineItem.deferredItemReplacement) && Intrinsics.areEqual(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && Intrinsics.areEqual(this.offerDetails, subscriptionPurchaseLineItem.offerDetails) && Intrinsics.areEqual(this.prepaidPlan, subscriptionPurchaseLineItem.prepaidPlan) && Intrinsics.areEqual(this.productId, subscriptionPurchaseLineItem.productId);
    }

    @JvmName(name = "getAutoRenewingPlan")
    @Nullable
    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    @JvmName(name = "getDeferredItemReplacement")
    @Nullable
    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    @JvmName(name = "getExpiryTime")
    @NotNull
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @JvmName(name = "getOfferDetails")
    @Nullable
    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    @JvmName(name = "getPrepaidPlan")
    @Nullable
    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    @JvmName(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
        int hashCode = (autoRenewingPlan == null ? 0 : autoRenewingPlan.hashCode()) * 31;
        DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
        int hashCode2 = (((hashCode + (deferredItemReplacement == null ? 0 : deferredItemReplacement.hashCode())) * 31) + this.expiryTime.hashCode()) * 31;
        OfferDetails offerDetails = this.offerDetails;
        int hashCode3 = (hashCode2 + (offerDetails == null ? 0 : offerDetails.hashCode())) * 31;
        PrepaidPlan prepaidPlan = this.prepaidPlan;
        return ((hashCode3 + (prepaidPlan != null ? prepaidPlan.hashCode() : 0)) * 31) + this.productId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscriptionPurchaseLineItem(autoRenewingPlan=" + this.autoRenewingPlan + ", deferredItemReplacement=" + this.deferredItemReplacement + ", expiryTime=" + this.expiryTime + ", offerDetails=" + this.offerDetails + ", prepaidPlan=" + this.prepaidPlan + ", productId=" + this.productId + ")";
    }
}
