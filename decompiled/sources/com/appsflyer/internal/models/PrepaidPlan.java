package com.appsflyer.internal.models;

import android.view.View;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1i;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/models/PrepaidPlan;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/appsflyer/internal/models/PrepaidPlan;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "allowExtendAfterTime", "Ljava/lang/String;", "getAllowExtendAfterTime", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class PrepaidPlan {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String allowExtendAfterTime;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/PrepaidPlan$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/PrepaidPlan;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/PrepaidPlan;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<PrepaidPlan> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long InAppPurchaseEvent = 7859613101306768189L;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = -2135458862;
        private static char getQuantity = 31698;
        private static int toJsonMap;

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(String str, String str2, int i6, char c6, String str3, Object[] objArr) {
            char[] cArr;
            char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
            if (str2 != null) {
                $10 = ($11 + 83) % 128;
                cArr = str2.toCharArray();
            } else {
                cArr = str2;
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str;
            if (str != null) {
                $11 = ($10 + 97) % 128;
                cArr3 = str.toCharArray();
            }
            char[] cArr4 = cArr3;
            AFPurchaseConnectorA1i aFPurchaseConnectorA1i = new AFPurchaseConnectorA1i();
            int length = cArr2.length;
            char[] cArr5 = new char[length];
            int length2 = cArr4.length;
            char[] cArr6 = new char[length2];
            System.arraycopy(cArr2, 0, cArr5, 0, length);
            System.arraycopy(cArr4, 0, cArr6, 0, length2);
            cArr5[0] = (char) (cArr5[0] ^ c6);
            cArr6[2] = (char) (cArr6[2] + ((char) i6));
            int length3 = charArray.length;
            char[] cArr7 = new char[length3];
            aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = 0;
            while (true) {
                int i7 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                if (i7 >= length3) {
                    break;
                }
                $11 = ($10 + 81) % 128;
                int i8 = (i7 + 3) % 4;
                int i9 = cArr5[i7 % 4] * 32718;
                char c7 = cArr6[(i7 + 2) % 4];
                char c8 = (char) ((i9 + c7) % 65535);
                aFPurchaseConnectorA1i.InAppPurchaseEvent = c8;
                cArr6[i8] = (char) (((cArr5[i8] * 32718) + c7) / 65535);
                cArr5[i8] = c8;
                cArr7[i7] = (char) ((((charArray[i7] ^ c8) ^ (InAppPurchaseEvent ^ 409721173320367058L)) ^ ((int) (getPackageName ^ 409721173320367058L))) ^ ((char) (getQuantity ^ 409721173320367058L)));
                aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i7 + 1;
            }
            String str4 = new String(cArr7);
            int i10 = $10 + 27;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ PrepaidPlan fromJson(JSONObject jSONObject) {
            int i6 = toJsonMap + 103;
            getOneTimePurchaseOfferDetails = i6 % 128;
            if (i6 % 2 == 0) {
                fromJson(jSONObject);
                throw null;
            }
            PrepaidPlan fromJson = fromJson(jSONObject);
            int i7 = toJsonMap + 5;
            getOneTimePurchaseOfferDetails = i7 % 128;
            if (i7 % 2 != 0) {
                return fromJson;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final PrepaidPlan fromJson(@NotNull JSONObject p02) {
            Object nullable;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("ჯ뿒歅梽", "⦢ﺳț죽", View.MeasureSpec.getMode(0), (char) View.MeasureSpec.getMode(0), "令됉㰓ⴗ₦臫隣튣頛\ue62fꨁ鳌뺨⋀䚓℃\u19cf\u218f醏䞁", objArr);
            nullable = SubscriptionPurchaseKt.getNullable(p02, ((String) objArr[0]).intern());
            PrepaidPlan prepaidPlan = new PrepaidPlan((String) nullable);
            toJsonMap = (getOneTimePurchaseOfferDetails + 93) % 128;
            return prepaidPlan;
        }
    }

    public PrepaidPlan(@Nullable String str) {
        this.allowExtendAfterTime = str;
    }

    public static /* synthetic */ PrepaidPlan copy$default(PrepaidPlan prepaidPlan, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = prepaidPlan.allowExtendAfterTime;
        }
        return prepaidPlan.copy(str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAllowExtendAfterTime() {
        return this.allowExtendAfterTime;
    }

    @NotNull
    public final PrepaidPlan copy(@Nullable String p02) {
        return new PrepaidPlan(p02);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        return (p02 instanceof PrepaidPlan) && Intrinsics.areEqual(this.allowExtendAfterTime, ((PrepaidPlan) p02).allowExtendAfterTime);
    }

    @JvmName(name = "getAllowExtendAfterTime")
    @Nullable
    public final String getAllowExtendAfterTime() {
        return this.allowExtendAfterTime;
    }

    public final int hashCode() {
        String str = this.allowExtendAfterTime;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PrepaidPlan(allowExtendAfterTime=" + this.allowExtendAfterTime + ")";
    }
}
