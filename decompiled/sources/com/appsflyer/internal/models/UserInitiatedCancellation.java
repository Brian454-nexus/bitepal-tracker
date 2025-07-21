package com.appsflyer.internal.models;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1i;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "", "Lcom/appsflyer/internal/models/CancelSurveyResult;", "p0", "", "p1", "<init>", "(Lcom/appsflyer/internal/models/CancelSurveyResult;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/internal/models/CancelSurveyResult;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/appsflyer/internal/models/CancelSurveyResult;Ljava/lang/String;)Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "cancelSurveyResult", "Lcom/appsflyer/internal/models/CancelSurveyResult;", "getCancelSurveyResult", "cancelTime", "Ljava/lang/String;", "getCancelTime", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class UserInitiatedCancellation {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final CancelSurveyResult cancelSurveyResult;

    @NotNull
    private final String cancelTime;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/UserInitiatedCancellation$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/UserInitiatedCancellation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<UserInitiatedCancellation> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static long getOneTimePurchaseOfferDetails = 409721173320367058L;
        private static int getPackageName = 0;
        private static int getQuantity = -2135458862;
        private static char toJsonMap = 40031;

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(String str, String str2, int i6, char c6, String str3, Object[] objArr) {
            $10 = ($11 + 83) % 128;
            char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
            char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
            char[] cArr = str;
            if (str != null) {
                char[] charArray3 = str.toCharArray();
                $11 = ($10 + 75) % 128;
                cArr = charArray3;
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1i aFPurchaseConnectorA1i = new AFPurchaseConnectorA1i();
            int length = charArray2.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(charArray2, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c6);
            cArr4[2] = (char) (cArr4[2] + ((char) i6));
            int length3 = charArray.length;
            char[] cArr5 = new char[length3];
            aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = 0;
            while (true) {
                int i7 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                if (i7 >= length3) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $10 = ($11 + 59) % 128;
                int i8 = (i7 + 3) % 4;
                int i9 = cArr3[i7 % 4] * 32718;
                char c7 = cArr4[(i7 + 2) % 4];
                char c8 = (char) ((i9 + c7) % 65535);
                aFPurchaseConnectorA1i.InAppPurchaseEvent = c8;
                cArr4[i8] = (char) (((cArr3[i8] * 32718) + c7) / 65535);
                cArr3[i8] = c8;
                cArr5[i7] = (char) ((((charArray[i7] ^ c8) ^ (getOneTimePurchaseOfferDetails ^ 409721173320367058L)) ^ ((int) (getQuantity ^ 409721173320367058L))) ^ ((char) (toJsonMap ^ 409721173320367058L)));
                aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i7 + 1;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ UserInitiatedCancellation fromJson(JSONObject jSONObject) {
            int i6 = getPackageName + 99;
            InAppPurchaseEvent = i6 % 128;
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
        public final UserInitiatedCancellation fromJson(@NotNull JSONObject p02) {
            Object object;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", "㐞ᩔ叨즪", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43603), "Гꪇ\uf27f遣噋ꏅ漕홚\ue953芯滀觲未昔ன㋸\uf37b\uea98", objArr);
            object = SubscriptionPurchaseKt.toObject(p02, ((String) objArr[0]).intern(), CancelSurveyResult.INSTANCE);
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0000\u0000", "瀋뚃텣ꢺ", ViewConfiguration.getPressedStateDuration() >> 16, (char) Color.blue(0), "㈧渨\udcc0捹⋠鲊욢\ue3b0̈軧", objArr2);
            String optString = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            UserInitiatedCancellation userInitiatedCancellation = new UserInitiatedCancellation((CancelSurveyResult) object, optString);
            getPackageName = (InAppPurchaseEvent + 103) % 128;
            return userInitiatedCancellation;
        }
    }

    public UserInitiatedCancellation(@Nullable CancelSurveyResult cancelSurveyResult, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelSurveyResult = cancelSurveyResult;
        this.cancelTime = str;
    }

    public static /* synthetic */ UserInitiatedCancellation copy$default(UserInitiatedCancellation userInitiatedCancellation, CancelSurveyResult cancelSurveyResult, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            cancelSurveyResult = userInitiatedCancellation.cancelSurveyResult;
        }
        if ((i6 & 2) != 0) {
            str = userInitiatedCancellation.cancelTime;
        }
        return userInitiatedCancellation.copy(cancelSurveyResult, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CancelSurveyResult getCancelSurveyResult() {
        return this.cancelSurveyResult;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCancelTime() {
        return this.cancelTime;
    }

    @NotNull
    public final UserInitiatedCancellation copy(@Nullable CancelSurveyResult p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p12, "");
        return new UserInitiatedCancellation(p02, p12);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof UserInitiatedCancellation)) {
            return false;
        }
        UserInitiatedCancellation userInitiatedCancellation = (UserInitiatedCancellation) p02;
        return Intrinsics.areEqual(this.cancelSurveyResult, userInitiatedCancellation.cancelSurveyResult) && Intrinsics.areEqual(this.cancelTime, userInitiatedCancellation.cancelTime);
    }

    @JvmName(name = "getCancelSurveyResult")
    @Nullable
    public final CancelSurveyResult getCancelSurveyResult() {
        return this.cancelSurveyResult;
    }

    @JvmName(name = "getCancelTime")
    @NotNull
    public final String getCancelTime() {
        return this.cancelTime;
    }

    public final int hashCode() {
        CancelSurveyResult cancelSurveyResult = this.cancelSurveyResult;
        return ((cancelSurveyResult == null ? 0 : cancelSurveyResult.hashCode()) * 31) + this.cancelTime.hashCode();
    }

    @NotNull
    public final String toString() {
        return "UserInitiatedCancellation(cancelSurveyResult=" + this.cancelSurveyResult + ", cancelTime=" + this.cancelTime + ")";
    }
}
