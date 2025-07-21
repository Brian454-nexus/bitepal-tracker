package com.appsflyer.internal.models;

import android.graphics.PointF;
import android.text.TextUtils;
import com.amazon.a.a.o.b;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/appsflyer/internal/models/ValidationFailureData;", "", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/appsflyer/internal/models/ValidationFailureData;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", b.f11199c, "Ljava/lang/String;", "getDescription", "status", "I", "getStatus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class ValidationFailureData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;
    private final int status;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/ValidationFailureData$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ValidationFailureData;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/ValidationFailureData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<ValidationFailureData> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] InAppPurchaseEvent = {987131286, -795503016, 1085795907, -394671689, 407361632, 940651397, -1374684004, -1080083704, -719311440, -958781164, 964790139, -1556834772, -1651995693, 1790979398, -1614282934, -369245761, -1675628797, 573531954};
        private static int getPackageName = 0;
        private static int toJsonMap = 1;

        private Companion() {
        }

        private static void a(int[] iArr, int i6, Object[] objArr) {
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = InAppPurchaseEvent;
            if (iArr2 != null) {
                int i7 = $11;
                $10 = (i7 + 71) % 128;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                $10 = (i7 + 79) % 128;
                for (int i8 = 0; i8 < length; i8++) {
                    iArr3[i8] = (int) (iArr2[i8] ^ (-6033101233399176549L));
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = InAppPurchaseEvent;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i9 = 0; i9 < length3; i9++) {
                    iArr6[i9] = (int) (iArr5[i9] ^ (-6033101233399176549L));
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i10 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i10 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i6);
                    return;
                }
                int i11 = iArr[i10];
                char c6 = (char) (i11 >> 16);
                cArr[0] = c6;
                char c7 = (char) i11;
                cArr[1] = c7;
                char c8 = (char) (iArr[i10 + 1] >> 16);
                cArr[2] = c8;
                char c9 = (char) iArr[i10 + 1];
                cArr[3] = c9;
                aFPurchaseConnectorA1c.getQuantity = (c6 << 16) + c7;
                aFPurchaseConnectorA1c.toJsonMap = (c8 << 16) + c9;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                $11 = ($10 + 55) % 128;
                for (int i12 = 0; i12 < 16; i12++) {
                    $10 = ($11 + 75) % 128;
                    int i13 = aFPurchaseConnectorA1c.getQuantity ^ iArr4[i12];
                    aFPurchaseConnectorA1c.getQuantity = i13;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i13) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i14 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i14;
                }
                int i15 = aFPurchaseConnectorA1c.getQuantity;
                int i16 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i16;
                aFPurchaseConnectorA1c.toJsonMap = i15;
                int i17 = i15 ^ iArr4[16];
                aFPurchaseConnectorA1c.toJsonMap = i17;
                int i18 = i16 ^ iArr4[17];
                aFPurchaseConnectorA1c.getQuantity = i18;
                cArr[0] = (char) (i18 >>> 16);
                cArr[1] = (char) i18;
                cArr[2] = (char) (i17 >>> 16);
                cArr[3] = (char) i17;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                int i19 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i19 * 2] = cArr[0];
                cArr2[(i19 * 2) + 1] = cArr[1];
                cArr2[(i19 * 2) + 2] = cArr[2];
                cArr2[(i19 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i19 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ ValidationFailureData fromJson(JSONObject jSONObject) {
            toJsonMap = (getPackageName + 115) % 128;
            ValidationFailureData fromJson = fromJson(jSONObject);
            toJsonMap = (getPackageName + 45) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @JvmStatic
        @NotNull
        public final ValidationFailureData fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(new int[]{-340659533, -459495648, -1920624047, -599543187}, 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            int optInt = p02.optInt(((String) objArr[0]).intern(), -1);
            Object[] objArr2 = new Object[1];
            a(new int[]{949337563, -1749529051, 1869596331, 1756777723, -1296466469, -491897845}, TextUtils.getCapsMode("", 0, 0) + 11, objArr2);
            String optString = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            ValidationFailureData validationFailureData = new ValidationFailureData(optInt, optString);
            int i6 = toJsonMap + 97;
            getPackageName = i6 % 128;
            if (i6 % 2 == 0) {
                return validationFailureData;
            }
            throw null;
        }
    }

    public ValidationFailureData(int i6, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = i6;
        this.description = str;
    }

    public static /* synthetic */ ValidationFailureData copy$default(ValidationFailureData validationFailureData, int i6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = validationFailureData.status;
        }
        if ((i7 & 2) != 0) {
            str = validationFailureData.description;
        }
        return validationFailureData.copy(i6, str);
    }

    @JvmStatic
    @NotNull
    public static ValidationFailureData fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ValidationFailureData copy(int p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p12, "");
        return new ValidationFailureData(p02, p12);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ValidationFailureData)) {
            return false;
        }
        ValidationFailureData validationFailureData = (ValidationFailureData) p02;
        return this.status == validationFailureData.status && Intrinsics.areEqual(this.description, validationFailureData.description);
    }

    @JvmName(name = "getDescription")
    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @JvmName(name = "getStatus")
    public final int getStatus() {
        return this.status;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.status) * 31) + this.description.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ValidationFailureData(status=" + this.status + ", description=" + this.description + ")";
    }
}
