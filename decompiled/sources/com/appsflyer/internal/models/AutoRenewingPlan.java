package com.appsflyer.internal.models;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1d;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/models/AutoRenewingPlan;", "", "", "p0", "Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "p1", "<init>", "(Ljava/lang/Boolean;Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "copy", "(Ljava/lang/Boolean;Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;)Lcom/appsflyer/internal/models/AutoRenewingPlan;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "autoRenewEnabled", "Ljava/lang/Boolean;", "getAutoRenewEnabled", "priceChangeDetails", "Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "getPriceChangeDetails", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class AutoRenewingPlan {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean autoRenewEnabled;

    @Nullable
    private final SubscriptionItemPriceChangeDetails priceChangeDetails;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/AutoRenewingPlan$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/AutoRenewingPlan;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<AutoRenewingPlan> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int getPackageName = 1;
        private static char[] InAppPurchaseEvent = {8976, 31969, 40143, 15537, 23735, 64621, 7233, 48215, 56366, 31801, 40429, 15815, 23983, 64956, 7570, 48510, 8961, 31974, 40146, 15549, 23680, 64587, 7239, 48211, 56375, 31771, 40422, 15842, 23976, 64932, 7574, 48499, 56653, 32055};
        private static long toJsonMap = -6458867719560463212L;

        private Companion() {
        }

        private static void a(int i6, char c6, int i7, Object[] objArr) {
            AFPurchaseConnectorA1d aFPurchaseConnectorA1d = new AFPurchaseConnectorA1d();
            long[] jArr = new long[i6];
            aFPurchaseConnectorA1d.getQuantity = 0;
            $11 = ($10 + 19) % 128;
            while (true) {
                int i8 = aFPurchaseConnectorA1d.getQuantity;
                if (i8 >= i6) {
                    break;
                }
                $11 = ($10 + 111) % 128;
                jArr[i8] = (((char) (InAppPurchaseEvent[i7 + i8] ^ 5120776544585851761L)) ^ (i8 * (5120776544585851761L ^ toJsonMap))) ^ c6;
                aFPurchaseConnectorA1d.getQuantity = i8 + 1;
            }
            char[] cArr = new char[i6];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i9 = aFPurchaseConnectorA1d.getQuantity;
                if (i9 >= i6) {
                    objArr[0] = new String(cArr);
                    return;
                } else {
                    cArr[i9] = (char) jArr[i9];
                    aFPurchaseConnectorA1d.getQuantity = i9 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ AutoRenewingPlan fromJson(JSONObject jSONObject) {
            getPackageName = (getOneTimePurchaseOfferDetails + 89) % 128;
            AutoRenewingPlan fromJson = fromJson(jSONObject);
            getOneTimePurchaseOfferDetails = (getPackageName + 99) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final AutoRenewingPlan fromJson(@NotNull JSONObject p02) {
            Object nullable;
            Object object;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
            nullable = SubscriptionPurchaseKt.getNullable(p02, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 19, (char) TextUtils.getCapsMode("", 0, 0), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            object = SubscriptionPurchaseKt.toObject(p02, ((String) objArr2[0]).intern(), SubscriptionItemPriceChangeDetails.INSTANCE);
            AutoRenewingPlan autoRenewingPlan = new AutoRenewingPlan((Boolean) nullable, (SubscriptionItemPriceChangeDetails) object);
            int i6 = getOneTimePurchaseOfferDetails + 57;
            getPackageName = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 33 / 0;
            }
            return autoRenewingPlan;
        }
    }

    public AutoRenewingPlan(@Nullable Boolean bool, @Nullable SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        this.autoRenewEnabled = bool;
        this.priceChangeDetails = subscriptionItemPriceChangeDetails;
    }

    public static /* synthetic */ AutoRenewingPlan copy$default(AutoRenewingPlan autoRenewingPlan, Boolean bool, SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bool = autoRenewingPlan.autoRenewEnabled;
        }
        if ((i6 & 2) != 0) {
            subscriptionItemPriceChangeDetails = autoRenewingPlan.priceChangeDetails;
        }
        return autoRenewingPlan.copy(bool, subscriptionItemPriceChangeDetails);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final SubscriptionItemPriceChangeDetails getPriceChangeDetails() {
        return this.priceChangeDetails;
    }

    @NotNull
    public final AutoRenewingPlan copy(@Nullable Boolean p02, @Nullable SubscriptionItemPriceChangeDetails p12) {
        return new AutoRenewingPlan(p02, p12);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AutoRenewingPlan)) {
            return false;
        }
        AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) p02;
        return Intrinsics.areEqual(this.autoRenewEnabled, autoRenewingPlan.autoRenewEnabled) && Intrinsics.areEqual(this.priceChangeDetails, autoRenewingPlan.priceChangeDetails);
    }

    @JvmName(name = "getAutoRenewEnabled")
    @Nullable
    public final Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    @JvmName(name = "getPriceChangeDetails")
    @Nullable
    public final SubscriptionItemPriceChangeDetails getPriceChangeDetails() {
        return this.priceChangeDetails;
    }

    public final int hashCode() {
        Boolean bool = this.autoRenewEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = this.priceChangeDetails;
        return hashCode + (subscriptionItemPriceChangeDetails != null ? subscriptionItemPriceChangeDetails.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AutoRenewingPlan(autoRenewEnabled=" + this.autoRenewEnabled + ", priceChangeDetails=" + this.priceChangeDetails + ")";
    }
}
