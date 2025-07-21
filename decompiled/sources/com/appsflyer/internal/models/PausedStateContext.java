package com.appsflyer.internal.models;

import android.graphics.Color;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/models/PausedStateContext;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/appsflyer/internal/models/PausedStateContext;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "autoResumeTime", "Ljava/lang/String;", "getAutoResumeTime", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class PausedStateContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String autoResumeTime;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/PausedStateContext$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/PausedStateContext;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/PausedStateContext;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/PausedStateContext$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<PausedStateContext> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static int[] getOneTimePurchaseOfferDetails = {-1304909012, 714143344, 719802641, 1576161698, 1933478925, 1141267324, -677188655, 1131992209, 1786428511, 1255381593, -1146773330, -346518410, 790114477, 1685937482, 568483301, -2129505576, 1603859667, 1267649722};
        private static int getPackageName;

        private Companion() {
        }

        private static void a(int[] iArr, int i6, Object[] objArr) {
            long j6;
            int length;
            int[] iArr2;
            int i7;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char c6 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = getOneTimePurchaseOfferDetails;
            long j7 = -6033101233399176549L;
            if (iArr3 != null) {
                int i8 = $11 + 25;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i7 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i7 = 0;
                }
                while (i7 < length) {
                    iArr2[i7] = (int) (iArr3[i7] ^ (-6033101233399176549L));
                    i7++;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getOneTimePurchaseOfferDetails;
            if (iArr5 != null) {
                $11 = ($10 + 59) % 128;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $10 + 53;
                    char c7 = c6;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        j6 = j7;
                        iArr6[i9] = (int) (iArr5[i9] ^ j6);
                    } else {
                        j6 = j7;
                        iArr6[i9] = (int) (iArr5[i9] ^ j6);
                        i9++;
                    }
                    c6 = c7;
                    j7 = j6;
                }
                iArr5 = iArr6;
            }
            char c8 = c6;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i11 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i11 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i6);
                    return;
                }
                int i12 = iArr[i11];
                char c9 = (char) (i12 >> 16);
                cArr[0] = c9;
                char c10 = (char) i12;
                cArr[1] = c10;
                char c11 = (char) (iArr[i11 + 1] >> 16);
                cArr[c8] = c11;
                char c12 = (char) iArr[i11 + 1];
                cArr[3] = c12;
                aFPurchaseConnectorA1c.getQuantity = (c9 << 16) + c10;
                aFPurchaseConnectorA1c.toJsonMap = (c11 << 16) + c12;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                for (int i13 = 0; i13 < 16; i13++) {
                    int i14 = aFPurchaseConnectorA1c.getQuantity ^ iArr4[i13];
                    aFPurchaseConnectorA1c.getQuantity = i14;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i14) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i15 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i15;
                }
                int i16 = aFPurchaseConnectorA1c.getQuantity;
                int i17 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i17;
                aFPurchaseConnectorA1c.toJsonMap = i16;
                int i18 = i16 ^ iArr4[16];
                aFPurchaseConnectorA1c.toJsonMap = i18;
                int i19 = i17 ^ iArr4[17];
                aFPurchaseConnectorA1c.getQuantity = i19;
                cArr[0] = (char) (i19 >>> 16);
                cArr[1] = (char) i19;
                cArr[c8] = (char) (i18 >>> 16);
                cArr[3] = (char) i18;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                int i20 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i20 * 2] = cArr[0];
                cArr2[(i20 * 2) + 1] = cArr[1];
                cArr2[(i20 * 2) + 2] = cArr[c8];
                cArr2[(i20 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i20 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ PausedStateContext fromJson(JSONObject jSONObject) {
            int i6 = InAppPurchaseEvent + 107;
            getPackageName = i6 % 128;
            if (i6 % 2 == 0) {
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
        public final PausedStateContext fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(new int[]{-814223544, 922159691, -908370604, -1848497898, -405032872, 572579928, 963491659, 148804044}, 14 - Color.argb(0, 0, 0, 0), objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            PausedStateContext pausedStateContext = new PausedStateContext(optString);
            int i6 = InAppPurchaseEvent + 65;
            getPackageName = i6 % 128;
            if (i6 % 2 == 0) {
                return pausedStateContext;
            }
            throw null;
        }
    }

    public PausedStateContext(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.autoResumeTime = str;
    }

    public static /* synthetic */ PausedStateContext copy$default(PausedStateContext pausedStateContext, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = pausedStateContext.autoResumeTime;
        }
        return pausedStateContext.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAutoResumeTime() {
        return this.autoResumeTime;
    }

    @NotNull
    public final PausedStateContext copy(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return new PausedStateContext(p02);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        return (p02 instanceof PausedStateContext) && Intrinsics.areEqual(this.autoResumeTime, ((PausedStateContext) p02).autoResumeTime);
    }

    @JvmName(name = "getAutoResumeTime")
    @NotNull
    public final String getAutoResumeTime() {
        return this.autoResumeTime;
    }

    public final int hashCode() {
        return this.autoResumeTime.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PausedStateContext(autoResumeTime=" + this.autoResumeTime + ")";
    }
}
