package com.appsflyer.internal.models;

import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2x;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/models/DeferredItemReplacement;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/appsflyer/internal/models/DeferredItemReplacement;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "productId", "Ljava/lang/String;", "getProductId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class DeferredItemReplacement {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String productId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/DeferredItemReplacement$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/DeferredItemReplacement;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<DeferredItemReplacement> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1175623869;
        private static short[] getOneTimePurchaseOfferDetails = null;
        private static int getPackageName = 1598397555;
        private static int getQuantity = -354566758;
        private static int hashCode = 0;
        private static int stopObservingTransactions = 1;
        private static byte[] toJsonMap = {63, 113, 53, 10, 53, 17, 25, 38, -60};

        private Companion() {
        }

        private static void a(int i6, int i7, byte b6, short s6, int i8, Object[] objArr) {
            int i9;
            int length;
            byte[] bArr;
            AFPurchaseConnectorA2x aFPurchaseConnectorA2x = new AFPurchaseConnectorA2x();
            StringBuilder sb = new StringBuilder();
            int i10 = i7 + ((int) (InAppPurchaseEvent ^ (-4208132002516133692L)));
            boolean z6 = i10 == -1;
            if (z6) {
                $10 = ($11 + 91) % 128;
                byte[] bArr2 = toJsonMap;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr3[i11] = (byte) (bArr2[i11] ^ (-4208132002516133692L));
                    }
                    bArr2 = bArr3;
                }
                i10 = bArr2 != null ? (byte) (((byte) (toJsonMap[i8 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (InAppPurchaseEvent ^ (-4208132002516133692L)))) : (short) (((short) (getOneTimePurchaseOfferDetails[i8 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (InAppPurchaseEvent ^ (-4208132002516133692L))));
            }
            if (i10 > 0) {
                int i12 = ((i8 + i10) - 2) + ((int) (getQuantity ^ (-4208132002516133692L)));
                if (z6) {
                    i9 = 1;
                } else {
                    $10 = ($11 + 123) % 128;
                    i9 = 0;
                }
                aFPurchaseConnectorA2x.getPackageName = i12 + i9;
                char c6 = (char) (i6 + ((int) (getPackageName ^ (-4208132002516133692L))));
                aFPurchaseConnectorA2x.InAppPurchaseEvent = c6;
                sb.append(c6);
                aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                byte[] bArr4 = toJsonMap;
                if (bArr4 != null) {
                    int i13 = $11 + 35;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr4.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr4.length;
                        bArr = new byte[length];
                    }
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = $10 + 89;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            bArr[i14] = (byte) (bArr4[i14] | (-4208132002516133692L));
                            i14 %= 1;
                        } else {
                            bArr[i14] = (byte) (bArr4[i14] ^ (-4208132002516133692L));
                            i14++;
                        }
                    }
                    bArr4 = bArr;
                }
                boolean z7 = bArr4 != null;
                aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails = 1;
                while (aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails < i10) {
                    if (z7) {
                        byte[] bArr5 = toJsonMap;
                        aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = (char) (aFPurchaseConnectorA2x.getQuantity + (((byte) (((byte) (bArr5[r7] ^ (-4208132002516133692L))) + s6)) ^ b6));
                    } else {
                        short[] sArr = getOneTimePurchaseOfferDetails;
                        aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = (char) (aFPurchaseConnectorA2x.getQuantity + (((short) (((short) (sArr[r7] ^ (-4208132002516133692L))) + s6)) ^ b6));
                        $10 = ($11 + 19) % 128;
                    }
                    sb.append(aFPurchaseConnectorA2x.InAppPurchaseEvent);
                    aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                    aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails++;
                }
            }
            objArr[0] = sb.toString();
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ DeferredItemReplacement fromJson(JSONObject jSONObject) {
            int i6 = hashCode + 33;
            stopObservingTransactions = i6 % 128;
            if (i6 % 2 != 0) {
                return fromJson(jSONObject);
            }
            fromJson(jSONObject);
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final DeferredItemReplacement fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a((-425133128) - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0', 0, 0) - 111, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (short) (ExpandableListView.getPackedPositionGroup(0L) + 32), 1395710626 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            DeferredItemReplacement deferredItemReplacement = new DeferredItemReplacement(optString);
            int i6 = stopObservingTransactions + 83;
            hashCode = i6 % 128;
            if (i6 % 2 == 0) {
                return deferredItemReplacement;
            }
            throw null;
        }
    }

    public DeferredItemReplacement(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.productId = str;
    }

    public static /* synthetic */ DeferredItemReplacement copy$default(DeferredItemReplacement deferredItemReplacement, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = deferredItemReplacement.productId;
        }
        return deferredItemReplacement.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final DeferredItemReplacement copy(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return new DeferredItemReplacement(p02);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        return (p02 instanceof DeferredItemReplacement) && Intrinsics.areEqual(this.productId, ((DeferredItemReplacement) p02).productId);
    }

    @JvmName(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        return this.productId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DeferredItemReplacement(productId=" + this.productId + ")";
    }
}
