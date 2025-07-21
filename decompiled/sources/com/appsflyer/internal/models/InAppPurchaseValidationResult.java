package com.appsflyer.internal.models;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.amazon.device.simplesignin.a.a.a;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1b;
import com.appsflyer.internal.models.ProductPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;", "", "", "p0", "Lcom/appsflyer/internal/models/ProductPurchase;", "p1", "Lcom/appsflyer/internal/models/ValidationFailureData;", "p2", "<init>", "(ZLcom/appsflyer/internal/models/ProductPurchase;Lcom/appsflyer/internal/models/ValidationFailureData;)V", "component1", "()Z", "component2", "()Lcom/appsflyer/internal/models/ProductPurchase;", "component3", "()Lcom/appsflyer/internal/models/ValidationFailureData;", "copy", "(ZLcom/appsflyer/internal/models/ProductPurchase;Lcom/appsflyer/internal/models/ValidationFailureData;)Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "failureData", "Lcom/appsflyer/internal/models/ValidationFailureData;", "getFailureData", "productPurchase", "Lcom/appsflyer/internal/models/ProductPurchase;", "getProductPurchase", a.f11730s, "Z", "getSuccess", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class InAppPurchaseValidationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ValidationFailureData failureData;

    @Nullable
    private final ProductPurchase productPurchase;
    private final boolean success;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/InAppPurchaseValidationResult$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<InAppPurchaseValidationResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getPackageName = 0;
        private static int hashCode = 1;
        private static char[] InAppPurchaseEvent = {35046, 35061, 35047, 35045, 35052, 35044, 35048, 35051, 35060, 35063, 35067, 35056, 35065, 35058, 35057};
        private static int toJsonMap = -2120185768;
        private static boolean getQuantity = true;
        private static boolean getOneTimePurchaseOfferDetails = true;

        private Companion() {
        }

        private static void a(int[] iArr, String str, int i6, String str2, Object[] objArr) {
            int i7 = $10 + 47;
            $11 = i7 % 128;
            byte[] bArr = str2;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1b aFPurchaseConnectorA1b = new AFPurchaseConnectorA1b();
            char[] cArr3 = InAppPurchaseEvent;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                $10 = ($11 + 17) % 128;
                for (int i8 = 0; i8 < length; i8++) {
                    cArr4[i8] = (char) (cArr3[i8] ^ (-4643703481320830850L));
                }
                cArr3 = cArr4;
            }
            int i9 = (int) ((-4643703481320830850L) ^ toJsonMap);
            if (getOneTimePurchaseOfferDetails) {
                $11 = ($10 + 11) % 128;
                int length2 = bArr2.length;
                aFPurchaseConnectorA1b.getPackageName = length2;
                char[] cArr5 = new char[length2];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i10 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i11 = aFPurchaseConnectorA1b.getPackageName;
                    if (i10 >= i11) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i10] = (char) (cArr3[bArr2[(i11 - 1) - i10] + i6] - i9);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i10 + 1;
                    }
                }
            } else if (getQuantity) {
                int length3 = cArr2.length;
                aFPurchaseConnectorA1b.getPackageName = length3;
                char[] cArr6 = new char[length3];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i12 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i13 = aFPurchaseConnectorA1b.getPackageName;
                    if (i12 >= i13) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[i12] = (char) (cArr3[cArr2[(i13 - 1) - i12] - i6] - i9);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i12 + 1;
                    }
                }
            } else {
                int length4 = iArr.length;
                aFPurchaseConnectorA1b.getPackageName = length4;
                char[] cArr7 = new char[length4];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                $10 = ($11 + 85) % 128;
                while (true) {
                    int i14 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i15 = aFPurchaseConnectorA1b.getPackageName;
                    if (i14 >= i15) {
                        objArr[0] = new String(cArr7);
                        return;
                    } else {
                        cArr7[i14] = (char) (cArr3[iArr[(i15 - 1) - i14] - i6] - i9);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i14 + 1;
                    }
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ InAppPurchaseValidationResult fromJson(JSONObject jSONObject) {
            hashCode = (getPackageName + 83) % 128;
            InAppPurchaseValidationResult fromJson = fromJson(jSONObject);
            getPackageName = (hashCode + 15) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @JvmStatic
        @NotNull
        public final InAppPurchaseValidationResult fromJson(@NotNull JSONObject p02) {
            ProductPurchase productPurchase;
            ValidationFailureData.Companion companion;
            Object obj;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            ValidationFailureData validationFailureData = null;
            a(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            boolean optBoolean = p02.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(null, null, AndroidCharacter.getMirror('0') + 'O', "\u0082\u0083\u008d\u008c\u008a\u0081\u0084\u0087\u008b\u0086\u008a\u0084\u0089\u0088\u0081\u0087", objArr2);
            if (p02.has(((String) objArr2[0]).intern())) {
                ProductPurchase.Companion companion2 = ProductPurchase.INSTANCE;
                Object[] objArr3 = new Object[1];
                a(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, "\u0082\u0083\u008d\u008c\u008a\u0081\u0084\u0087\u008b\u0086\u008a\u0084\u0089\u0088\u0081\u0087", objArr3);
                JSONObject jSONObject = p02.getJSONObject(((String) objArr3[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                productPurchase = companion2.fromJson(jSONObject);
            } else {
                getPackageName = (hashCode + 105) % 128;
                productPurchase = null;
            }
            Object[] objArr4 = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u008d\u0086\u008d\u0089\u008b\u0082\u0081\u0084\u0085\u008f\u008d\u008e", objArr4);
            if (p02.has(((String) objArr4[0]).intern())) {
                int i6 = getPackageName + 123;
                hashCode = i6 % 128;
                if (i6 % 2 == 0) {
                    companion = ValidationFailureData.INSTANCE;
                    Object[] objArr5 = new Object[1];
                    a(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29193, "\u008d\u0086\u008d\u0089\u008b\u0082\u0081\u0084\u0085\u008f\u008d\u008e", objArr5);
                    obj = objArr5[0];
                } else {
                    companion = ValidationFailureData.INSTANCE;
                    Object[] objArr6 = new Object[1];
                    a(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u008d\u0086\u008d\u0089\u008b\u0082\u0081\u0084\u0085\u008f\u008d\u008e", objArr6);
                    obj = objArr6[0];
                }
                JSONObject jSONObject2 = p02.getJSONObject(((String) obj).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                validationFailureData = companion.fromJson(jSONObject2);
            }
            return new InAppPurchaseValidationResult(optBoolean, productPurchase, validationFailureData);
        }
    }

    public InAppPurchaseValidationResult(boolean z6, @Nullable ProductPurchase productPurchase, @Nullable ValidationFailureData validationFailureData) {
        this.success = z6;
        this.productPurchase = productPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ InAppPurchaseValidationResult copy$default(InAppPurchaseValidationResult inAppPurchaseValidationResult, boolean z6, ProductPurchase productPurchase, ValidationFailureData validationFailureData, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = inAppPurchaseValidationResult.success;
        }
        if ((i6 & 2) != 0) {
            productPurchase = inAppPurchaseValidationResult.productPurchase;
        }
        if ((i6 & 4) != 0) {
            validationFailureData = inAppPurchaseValidationResult.failureData;
        }
        return inAppPurchaseValidationResult.copy(z6, productPurchase, validationFailureData);
    }

    @JvmStatic
    @NotNull
    public static InAppPurchaseValidationResult fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ProductPurchase getProductPurchase() {
        return this.productPurchase;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @NotNull
    public final InAppPurchaseValidationResult copy(boolean p02, @Nullable ProductPurchase p12, @Nullable ValidationFailureData p22) {
        return new InAppPurchaseValidationResult(p02, p12, p22);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof InAppPurchaseValidationResult)) {
            return false;
        }
        InAppPurchaseValidationResult inAppPurchaseValidationResult = (InAppPurchaseValidationResult) p02;
        return this.success == inAppPurchaseValidationResult.success && Intrinsics.areEqual(this.productPurchase, inAppPurchaseValidationResult.productPurchase) && Intrinsics.areEqual(this.failureData, inAppPurchaseValidationResult.failureData);
    }

    @JvmName(name = "getFailureData")
    @Nullable
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @JvmName(name = "getProductPurchase")
    @Nullable
    public final ProductPurchase getProductPurchase() {
        return this.productPurchase;
    }

    @JvmName(name = "getSuccess")
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z6 = this.success;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        ProductPurchase productPurchase = this.productPurchase;
        int hashCode = (i6 + (productPurchase == null ? 0 : productPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return hashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "InAppPurchaseValidationResult(success=" + this.success + ", productPurchase=" + this.productPurchase + ", failureData=" + this.failureData + ")";
    }
}
