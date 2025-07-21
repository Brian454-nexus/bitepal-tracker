package com.appsflyer.internal.models;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.amazon.device.simplesignin.a.a.a;
import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "", "", "p0", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "p1", "Lcom/appsflyer/internal/models/ValidationFailureData;", "p2", "<init>", "(ZLcom/appsflyer/internal/models/SubscriptionPurchase;Lcom/appsflyer/internal/models/ValidationFailureData;)V", "component1", "()Z", "component2", "()Lcom/appsflyer/internal/models/SubscriptionPurchase;", "component3", "()Lcom/appsflyer/internal/models/ValidationFailureData;", "copy", "(ZLcom/appsflyer/internal/models/SubscriptionPurchase;Lcom/appsflyer/internal/models/ValidationFailureData;)Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "failureData", "Lcom/appsflyer/internal/models/ValidationFailureData;", "getFailureData", "subscriptionPurchase", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "getSubscriptionPurchase", a.f11730s, "Z", "getSuccess", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class SubscriptionValidationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ValidationFailureData failureData;

    @Nullable
    private final SubscriptionPurchase subscriptionPurchase;
    private final boolean success;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionValidationResult$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/SubscriptionValidationResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<SubscriptionValidationResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static long getPackageName = -9203480607422290978L;
        private static int getQuantity;

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        
            r13 = r13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(java.lang.String r13, int r14, java.lang.Object[] r15) {
            /*
                if (r13 == 0) goto Le
                int r0 = com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$10
                int r0 = r0 + 95
                int r0 = r0 % 128
                com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$11 = r0
                char[] r13 = r13.toCharArray()
            Le:
                char[] r13 = (char[]) r13
                com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g r0 = new com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g
                r0.<init>()
                r0.getPackageName = r14
                int r14 = r13.length
                long[] r1 = new long[r14]
                r2 = 0
                r0.InAppPurchaseEvent = r2
            L1d:
                int r3 = r0.InAppPurchaseEvent
                int r4 = r13.length
                if (r3 >= r4) goto L59
                int r4 = com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$10
                int r4 = r4 + 65
                int r5 = r4 % 128
                com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$11 = r5
                int r4 = r4 % 2
                r5 = 5319290379872349608(0x49d1ea6aed71ada8, double:4.091221287231824E47)
                if (r4 != 0) goto L46
                char r4 = r13[r3]
                long r7 = (long) r4
                long r9 = (long) r3
                int r4 = r0.getPackageName
                long r11 = (long) r4
                long r9 = r9 * r11
                long r7 = r7 + r9
                long r9 = com.appsflyer.internal.models.SubscriptionValidationResult.Companion.getPackageName
                long r4 = r9 & r5
                long r4 = r4 ^ r7
                r1[r3] = r4
            L43:
                r0.InAppPurchaseEvent = r3
                goto L1d
            L46:
                char r4 = r13[r3]
                long r7 = (long) r4
                long r9 = (long) r3
                int r4 = r0.getPackageName
                long r11 = (long) r4
                long r9 = r9 * r11
                long r7 = r7 ^ r9
                long r9 = com.appsflyer.internal.models.SubscriptionValidationResult.Companion.getPackageName
                long r4 = r9 ^ r5
                long r4 = r4 ^ r7
                r1[r3] = r4
                int r3 = r3 + 1
                goto L43
            L59:
                char[] r14 = new char[r14]
                r0.InAppPurchaseEvent = r2
            L5d:
                int r3 = r0.InAppPurchaseEvent
                int r4 = r13.length
                if (r3 >= r4) goto L7b
                int r4 = com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$10
                int r5 = r4 + 25
                int r5 = r5 % 128
                com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$11 = r5
                r5 = r1[r3]
                int r5 = (int) r5
                char r5 = (char) r5
                r14[r3] = r5
                int r3 = r3 + 1
                r0.InAppPurchaseEvent = r3
                int r4 = r4 + 119
                int r4 = r4 % 128
                com.appsflyer.internal.models.SubscriptionValidationResult.Companion.$11 = r4
                goto L5d
            L7b:
                java.lang.String r13 = new java.lang.String
                r13.<init>(r14)
                r15[r2] = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.models.SubscriptionValidationResult.Companion.a(java.lang.String, int, java.lang.Object[]):void");
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ SubscriptionValidationResult fromJson(JSONObject jSONObject) {
            getQuantity = (InAppPurchaseEvent + 107) % 128;
            SubscriptionValidationResult fromJson = fromJson(jSONObject);
            int i6 = getQuantity + 119;
            InAppPurchaseEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return fromJson;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @JvmStatic
        @NotNull
        public final SubscriptionValidationResult fromJson(@NotNull JSONObject p02) {
            SubscriptionPurchase subscriptionPurchase;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("丄\ued12ࠇ꜀숞愇", TextUtils.indexOf((CharSequence) "", '0') + 41730, objArr);
            boolean optBoolean = p02.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("丅촘䠢읔䉹솃岽\udbbb囚헬儗\uec31歭\ue659敹\ue091羥𥉉秱\uf504瀏", 33563 - Drawable.resolveOpacity(0, 0), objArr2);
            boolean has = p02.has(((String) objArr2[0]).intern());
            ValidationFailureData validationFailureData = null;
            if (has) {
                SubscriptionPurchase.Companion companion = SubscriptionPurchase.INSTANCE;
                Object[] objArr3 = new Object[1];
                a("丅촘䠢읔䉹솃岽\udbbb囚헬儗\uec31歭\ue659敹\ue091羥𥉉秱\uf504瀏", 33563 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                JSONObject jSONObject = p02.getJSONObject(((String) objArr3[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                subscriptionPurchase = companion.fromJson(jSONObject);
            } else {
                subscriptionPurchase = null;
            }
            Object[] objArr4 = new Object[1];
            a("丐톴煙郳わ倫\uf3c1\u135c댊튬牜鈖", TextUtils.lastIndexOf("", '0', 0, 0) + 40868, objArr4);
            if (p02.has(((String) objArr4[0]).intern())) {
                ValidationFailureData.Companion companion2 = ValidationFailureData.INSTANCE;
                Object[] objArr5 = new Object[1];
                a("丐톴煙郳わ倫\uf3c1\u135c댊튬牜鈖", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40867, objArr5);
                JSONObject jSONObject2 = p02.getJSONObject(((String) objArr5[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                validationFailureData = companion2.fromJson(jSONObject2);
            } else {
                getQuantity = (InAppPurchaseEvent + 123) % 128;
            }
            SubscriptionValidationResult subscriptionValidationResult = new SubscriptionValidationResult(optBoolean, subscriptionPurchase, validationFailureData);
            int i6 = InAppPurchaseEvent + 69;
            getQuantity = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 7 / 0;
            }
            return subscriptionValidationResult;
        }
    }

    public SubscriptionValidationResult(boolean z6, @Nullable SubscriptionPurchase subscriptionPurchase, @Nullable ValidationFailureData validationFailureData) {
        this.success = z6;
        this.subscriptionPurchase = subscriptionPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ SubscriptionValidationResult copy$default(SubscriptionValidationResult subscriptionValidationResult, boolean z6, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = subscriptionValidationResult.success;
        }
        if ((i6 & 2) != 0) {
            subscriptionPurchase = subscriptionValidationResult.subscriptionPurchase;
        }
        if ((i6 & 4) != 0) {
            validationFailureData = subscriptionValidationResult.failureData;
        }
        return subscriptionValidationResult.copy(z6, subscriptionPurchase, validationFailureData);
    }

    @JvmStatic
    @NotNull
    public static SubscriptionValidationResult fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @NotNull
    public final SubscriptionValidationResult copy(boolean p02, @Nullable SubscriptionPurchase p12, @Nullable ValidationFailureData p22) {
        return new SubscriptionValidationResult(p02, p12, p22);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof SubscriptionValidationResult)) {
            return false;
        }
        SubscriptionValidationResult subscriptionValidationResult = (SubscriptionValidationResult) p02;
        return this.success == subscriptionValidationResult.success && Intrinsics.areEqual(this.subscriptionPurchase, subscriptionValidationResult.subscriptionPurchase) && Intrinsics.areEqual(this.failureData, subscriptionValidationResult.failureData);
    }

    @JvmName(name = "getFailureData")
    @Nullable
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @JvmName(name = "getSubscriptionPurchase")
    @Nullable
    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
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
        SubscriptionPurchase subscriptionPurchase = this.subscriptionPurchase;
        int hashCode = (i6 + (subscriptionPurchase == null ? 0 : subscriptionPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return hashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SubscriptionValidationResult(success=" + this.success + ", subscriptionPurchase=" + this.subscriptionPurchase + ", failureData=" + this.failureData + ")";
    }
}
