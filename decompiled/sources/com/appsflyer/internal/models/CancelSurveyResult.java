package com.appsflyer.internal.models;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1k;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/CancelSurveyResult;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/models/CancelSurveyResult;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "reason", "Ljava/lang/String;", "getReason", "reasonUserInput", "getReasonUserInput", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class CancelSurveyResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String reason;

    @NotNull
    private final String reasonUserInput;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/CancelSurveyResult$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/CancelSurveyResult;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/CancelSurveyResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<CancelSurveyResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getQuantity = 1;
        private static int toJsonMap;
        private static char[] getPackageName = {50311, 50336, 50308, 50310, 50333, 50331, 50364, 50315, 50330, 50309, 50332, 50313, 50329, 50314, 50312, 50316};
        private static char InAppPurchaseEvent = 61815;

        private Companion() {
        }

        private static void a(byte b6, int i6, String str, Object[] objArr) {
            int i7;
            int i8 = $11;
            $10 = (i8 + 5) % 128;
            char[] cArr = str;
            if (str != null) {
                $10 = (i8 + 49) % 128;
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1k aFPurchaseConnectorA1k = new AFPurchaseConnectorA1k();
            char[] cArr3 = getPackageName;
            if (cArr3 != null) {
                $11 = ($10 + 25) % 128;
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = $10 + 41;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[i9] = (char) (cArr3[i9] ^ (-8783246495946182285L));
                    } else {
                        cArr4[i9] = (char) (cArr3[i9] ^ (-8783246495946182285L));
                    }
                }
                cArr3 = cArr4;
            }
            char c6 = (char) ((-8783246495946182285L) ^ InAppPurchaseEvent);
            char[] cArr5 = new char[i6];
            if (i6 % 2 != 0) {
                i7 = i6 - 1;
                cArr5[i7] = (char) (cArr2[i7] - b6);
            } else {
                i7 = i6;
            }
            if (i7 > 1) {
                $10 = ($11 + 19) % 128;
                aFPurchaseConnectorA1k.getQuantity = 0;
                while (true) {
                    int i11 = aFPurchaseConnectorA1k.getQuantity;
                    if (i11 >= i7) {
                        break;
                    }
                    char c7 = cArr2[i11];
                    aFPurchaseConnectorA1k.getPackageName = c7;
                    char c8 = cArr2[i11 + 1];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = c8;
                    if (c7 == c8) {
                        cArr5[i11] = (char) (c7 - b6);
                        cArr5[i11 + 1] = (char) (c8 - b6);
                    } else {
                        int i12 = c7 / c6;
                        aFPurchaseConnectorA1k.InAppPurchaseEvent = i12;
                        int i13 = c7 % c6;
                        aFPurchaseConnectorA1k.hashCode = i13;
                        int i14 = c8 / c6;
                        aFPurchaseConnectorA1k.toJsonMap = i14;
                        int i15 = c8 % c6;
                        aFPurchaseConnectorA1k.stopObservingTransactions = i15;
                        if (i13 == i15) {
                            int i16 = ((i12 + c6) - 1) % c6;
                            aFPurchaseConnectorA1k.InAppPurchaseEvent = i16;
                            int i17 = ((i14 + c6) - 1) % c6;
                            aFPurchaseConnectorA1k.toJsonMap = i17;
                            cArr5[i11] = cArr3[(i16 * c6) + i13];
                            cArr5[i11 + 1] = cArr3[(i17 * c6) + i15];
                        } else if (i12 == i14) {
                            int i18 = ((i13 + c6) - 1) % c6;
                            aFPurchaseConnectorA1k.hashCode = i18;
                            int i19 = ((i15 + c6) - 1) % c6;
                            aFPurchaseConnectorA1k.stopObservingTransactions = i19;
                            cArr5[i11] = cArr3[(i12 * c6) + i18];
                            cArr5[i11 + 1] = cArr3[(i14 * c6) + i19];
                        } else {
                            cArr5[i11] = cArr3[(i12 * c6) + i15];
                            cArr5[i11 + 1] = cArr3[(i14 * c6) + i13];
                        }
                    }
                    aFPurchaseConnectorA1k.getQuantity = i11 + 2;
                }
            }
            for (int i20 = 0; i20 < i6; i20++) {
                cArr5[i20] = (char) (cArr5[i20] ^ 13722);
            }
            objArr[0] = new String(cArr5);
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ CancelSurveyResult fromJson(JSONObject jSONObject) {
            int i6 = toJsonMap + 123;
            getQuantity = i6 % 128;
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
        public final CancelSurveyResult fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a((byte) (93 - View.resolveSize(0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, "\u0007\r\f\n\u0000\u0001", objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a((byte) (75 - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0') + 16, "\u0007\r\f\n\u0000\u0001\u0004\n\r\u0007\u0002\u0001\u000e\b㘺", objArr2);
            String optString2 = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            CancelSurveyResult cancelSurveyResult = new CancelSurveyResult(optString, optString2);
            int i6 = toJsonMap + 23;
            getQuantity = i6 % 128;
            if (i6 % 2 != 0) {
                return cancelSurveyResult;
            }
            throw null;
        }
    }

    public CancelSurveyResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.reason = str;
        this.reasonUserInput = str2;
    }

    public static /* synthetic */ CancelSurveyResult copy$default(CancelSurveyResult cancelSurveyResult, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = cancelSurveyResult.reason;
        }
        if ((i6 & 2) != 0) {
            str2 = cancelSurveyResult.reasonUserInput;
        }
        return cancelSurveyResult.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReasonUserInput() {
        return this.reasonUserInput;
    }

    @NotNull
    public final CancelSurveyResult copy(@NotNull String p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        return new CancelSurveyResult(p02, p12);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof CancelSurveyResult)) {
            return false;
        }
        CancelSurveyResult cancelSurveyResult = (CancelSurveyResult) p02;
        return Intrinsics.areEqual(this.reason, cancelSurveyResult.reason) && Intrinsics.areEqual(this.reasonUserInput, cancelSurveyResult.reasonUserInput);
    }

    @JvmName(name = "getReason")
    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @JvmName(name = "getReasonUserInput")
    @NotNull
    public final String getReasonUserInput() {
        return this.reasonUserInput;
    }

    public final int hashCode() {
        return (this.reason.hashCode() * 31) + this.reasonUserInput.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CancelSurveyResult(reason=" + this.reason + ", reasonUserInput=" + this.reasonUserInput + ")";
    }
}
