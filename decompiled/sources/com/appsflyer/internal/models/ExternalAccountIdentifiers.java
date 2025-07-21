package com.appsflyer.internal.models;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1d;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "externalAccountId", "Ljava/lang/String;", "getExternalAccountId", "obfuscatedExternalAccountId", "getObfuscatedExternalAccountId", "obfuscatedExternalProfileId", "getObfuscatedExternalProfileId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class ExternalAccountIdentifiers {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String externalAccountId;

    @NotNull
    private final String obfuscatedExternalAccountId;

    @NotNull
    private final String obfuscatedExternalProfileId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/ExternalAccountIdentifiers$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<ExternalAccountIdentifiers> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 0;
        private static int getPackageName = 1;
        private static char[] getOneTimePurchaseOfferDetails = {8980, 17673, 61189, 4372, 47875, 56607, 18192, 59677, 4912, 46354, 57106, 16670, 60164, 3359, 46853, 55608, 17173, 8990, 17683, 61207, 4356, 47874, 56594, 18192, 59653, 4884, 46357, 57140, 16649, 60165, 3348, 46851, 55583, 17168, 58653, 3888, 45330, 56082, 32030, 59140, 2335, 45829, 54584, 32533, 17338, 9655, 36787, 29088, 56230, 48566, 10164, 35233, 29616, 54705, 49040, 8621, 35745, 28080, 55207, 47547, 9140, 34233, 28549, 53671, 48058, 7603, 34748, 27065, 54192, 46492, 8113};
        private static long getQuantity = -3076080037190023823L;

        private Companion() {
        }

        private static void a(int i6, char c6, int i7, Object[] objArr) {
            AFPurchaseConnectorA1d aFPurchaseConnectorA1d = new AFPurchaseConnectorA1d();
            long[] jArr = new long[i6];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i8 = aFPurchaseConnectorA1d.getQuantity;
                if (i8 >= i6) {
                    break;
                }
                $11 = ($10 + 1) % 128;
                jArr[i8] = (((char) (getOneTimePurchaseOfferDetails[i7 + i8] ^ 5120776544585851761L)) ^ (i8 * (5120776544585851761L ^ getQuantity))) ^ c6;
                aFPurchaseConnectorA1d.getQuantity = i8 + 1;
            }
            char[] cArr = new char[i6];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i9 = aFPurchaseConnectorA1d.getQuantity;
                if (i9 >= i6) {
                    break;
                }
                cArr[i9] = (char) jArr[i9];
                aFPurchaseConnectorA1d.getQuantity = i9 + 1;
            }
            String str = new String(cArr);
            int i10 = $10 + 61;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ ExternalAccountIdentifiers fromJson(JSONObject jSONObject) {
            InAppPurchaseEvent = (getPackageName + 53) % 128;
            ExternalAccountIdentifiers fromJson = fromJson(jSONObject);
            InAppPurchaseEvent = (getPackageName + 123) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final ExternalAccountIdentifiers fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(TextUtils.getOffsetAfter("", 0) + 17, (char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.getMaxKeyCode() >> 16, objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getMode(0) + 27, (char) TextUtils.getTrimmedLength(""), 16 - Process.getGidForName(""), objArr2);
            String optString2 = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr3 = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L) + 27, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 24740), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            String optString3 = p02.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            ExternalAccountIdentifiers externalAccountIdentifiers = new ExternalAccountIdentifiers(optString, optString2, optString3);
            InAppPurchaseEvent = (getPackageName + 13) % 128;
            return externalAccountIdentifiers;
        }
    }

    public ExternalAccountIdentifiers(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.externalAccountId = str;
        this.obfuscatedExternalAccountId = str2;
        this.obfuscatedExternalProfileId = str3;
    }

    public static /* synthetic */ ExternalAccountIdentifiers copy$default(ExternalAccountIdentifiers externalAccountIdentifiers, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = externalAccountIdentifiers.externalAccountId;
        }
        if ((i6 & 2) != 0) {
            str2 = externalAccountIdentifiers.obfuscatedExternalAccountId;
        }
        if ((i6 & 4) != 0) {
            str3 = externalAccountIdentifiers.obfuscatedExternalProfileId;
        }
        return externalAccountIdentifiers.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    public final ExternalAccountIdentifiers copy(@NotNull String p02, @NotNull String p12, @NotNull String p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p22, "");
        return new ExternalAccountIdentifiers(p02, p12, p22);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ExternalAccountIdentifiers)) {
            return false;
        }
        ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) p02;
        return Intrinsics.areEqual(this.externalAccountId, externalAccountIdentifiers.externalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalAccountId, externalAccountIdentifiers.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, externalAccountIdentifiers.obfuscatedExternalProfileId);
    }

    @JvmName(name = "getExternalAccountId")
    @NotNull
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    @JvmName(name = "getObfuscatedExternalAccountId")
    @NotNull
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @JvmName(name = "getObfuscatedExternalProfileId")
    @NotNull
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    public final int hashCode() {
        return (((this.externalAccountId.hashCode() * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ExternalAccountIdentifiers(externalAccountId=" + this.externalAccountId + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ")";
    }
}
