package com.appsflyer.internal.models;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\b\u0000\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ8\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/appsflyer/internal/models/OfferDetails;", "", "", "", "p0", "p1", "p2", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/models/OfferDetails;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "basePlanId", "Ljava/lang/String;", "getBasePlanId", "offerId", "getOfferId", "offerTags", "Ljava/util/List;", "getOfferTags", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class OfferDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String basePlanId;

    @Nullable
    private final String offerId;

    @Nullable
    private final List<String> offerTags;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/OfferDetails$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/OfferDetails;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/OfferDetails;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<OfferDetails> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 35330;
        private static int equals = 1;
        private static char getOneTimePurchaseOfferDetails = 2122;
        private static char getPackageName = 50124;
        private static int getQuantity = 0;
        private static char toJsonMap = 5133;

        private Companion() {
        }

        private static void a(String str, int i6, Object[] objArr) {
            char[] cArr;
            if (str != null) {
                int i7 = $10 + 89;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1f aFPurchaseConnectorA1f = new AFPurchaseConnectorA1f();
            char[] cArr3 = new char[cArr2.length];
            aFPurchaseConnectorA1f.getQuantity = 0;
            char[] cArr4 = new char[2];
            $11 = ($10 + 41) % 128;
            while (true) {
                int i8 = aFPurchaseConnectorA1f.getQuantity;
                if (i8 >= cArr2.length) {
                    objArr[0] = new String(cArr3, 0, i6);
                    return;
                }
                int i9 = $11 + 123;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[1] = cArr2[i8];
                    cArr4[1] = cArr2[i8 << 1];
                } else {
                    cArr4[0] = cArr2[i8];
                    cArr4[1] = cArr2[i8 + 1];
                }
                int i10 = 58224;
                for (int i11 = 0; i11 < 16; i11++) {
                    $11 = ($10 + 87) % 128;
                    char c6 = cArr4[1];
                    char c7 = cArr4[0];
                    char c8 = (char) (c6 - (((c7 + i10) ^ ((c7 << 4) + ((char) (getOneTimePurchaseOfferDetails ^ (-177179452616573881L))))) ^ ((c7 >>> 5) + ((char) (getPackageName ^ (-177179452616573881L))))));
                    cArr4[1] = c8;
                    cArr4[0] = (char) (c7 - (((c8 >>> 5) + ((char) (toJsonMap ^ (-177179452616573881L)))) ^ ((c8 + i10) ^ ((c8 << 4) + ((char) (InAppPurchaseEvent ^ (-177179452616573881L)))))));
                    i10 -= 40503;
                }
                int i12 = aFPurchaseConnectorA1f.getQuantity;
                cArr3[i12] = cArr4[0];
                cArr3[i12 + 1] = cArr4[1];
                aFPurchaseConnectorA1f.getQuantity = i12 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ OfferDetails fromJson(JSONObject jSONObject) {
            equals = (getQuantity + 67) % 128;
            OfferDetails fromJson = fromJson(jSONObject);
            int i6 = equals + 35;
            getQuantity = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 43 / 0;
            }
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final OfferDetails fromJson(@NotNull JSONObject p02) {
            List list;
            Object nullable;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("㯾쇟抩曭蔀ﾶ䒽襁䗝儙", 9 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            JSONArray optJSONArray = p02.optJSONArray(((String) objArr[0]).intern());
            if (optJSONArray != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                list = SubscriptionPurchaseKt.toList(optJSONArray);
            } else {
                list = null;
            }
            Object[] objArr2 = new Object[1];
            a("ﻷ蛅ⷔ憈ꇛ仁㳠ø惹\ud837", 10 - TextUtils.indexOf("", "", 0), objArr2);
            String optString = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr3 = new Object[1];
            a("㯾쇟抩曭\u193f\u20f3Ḝ⤩", 7 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            nullable = SubscriptionPurchaseKt.getNullable(p02, ((String) objArr3[0]).intern());
            return new OfferDetails(list, optString, (String) nullable);
        }
    }

    public OfferDetails(@Nullable List<String> list, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.offerTags = list;
        this.basePlanId = str;
        this.offerId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, List list, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = offerDetails.offerTags;
        }
        if ((i6 & 2) != 0) {
            str = offerDetails.basePlanId;
        }
        if ((i6 & 4) != 0) {
            str2 = offerDetails.offerId;
        }
        return offerDetails.copy(list, str, str2);
    }

    @Nullable
    public final List<String> component1() {
        return this.offerTags;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final OfferDetails copy(@Nullable List<String> p02, @NotNull String p12, @Nullable String p22) {
        Intrinsics.checkNotNullParameter(p12, "");
        return new OfferDetails(p02, p12, p22);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof OfferDetails)) {
            return false;
        }
        OfferDetails offerDetails = (OfferDetails) p02;
        return Intrinsics.areEqual(this.offerTags, offerDetails.offerTags) && Intrinsics.areEqual(this.basePlanId, offerDetails.basePlanId) && Intrinsics.areEqual(this.offerId, offerDetails.offerId);
    }

    @JvmName(name = "getBasePlanId")
    @NotNull
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @JvmName(name = "getOfferId")
    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @JvmName(name = "getOfferTags")
    @Nullable
    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final int hashCode() {
        List<String> list = this.offerTags;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "OfferDetails(offerTags=" + this.offerTags + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ")";
    }
}
