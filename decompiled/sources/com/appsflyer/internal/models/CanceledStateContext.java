package com.appsflyer.internal.models;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2z;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B1\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010(\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/models/CanceledStateContext;", "", "Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;", "p0", "Lcom/appsflyer/internal/models/ReplacementCancellation;", "p1", "Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "p2", "Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "p3", "<init>", "(Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;Lcom/appsflyer/internal/models/ReplacementCancellation;Lcom/appsflyer/internal/models/SystemInitiatedCancellation;Lcom/appsflyer/internal/models/UserInitiatedCancellation;)V", "component1", "()Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;", "component2", "()Lcom/appsflyer/internal/models/ReplacementCancellation;", "component3", "()Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "component4", "()Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "copy", "(Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;Lcom/appsflyer/internal/models/ReplacementCancellation;Lcom/appsflyer/internal/models/SystemInitiatedCancellation;Lcom/appsflyer/internal/models/UserInitiatedCancellation;)Lcom/appsflyer/internal/models/CanceledStateContext;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "developerInitiatedCancellation", "Lcom/appsflyer/internal/models/DeveloperInitiatedCancellation;", "getDeveloperInitiatedCancellation", "replacementCancellation", "Lcom/appsflyer/internal/models/ReplacementCancellation;", "getReplacementCancellation", "systemInitiatedCancellation", "Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "getSystemInitiatedCancellation", "userInitiatedCancellation", "Lcom/appsflyer/internal/models/UserInitiatedCancellation;", "getUserInitiatedCancellation", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class CanceledStateContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final DeveloperInitiatedCancellation developerInitiatedCancellation;

    @Nullable
    private final ReplacementCancellation replacementCancellation;

    @Nullable
    private final SystemInitiatedCancellation systemInitiatedCancellation;

    @Nullable
    private final UserInitiatedCancellation userInitiatedCancellation;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/CanceledStateContext$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/CanceledStateContext;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/CanceledStateContext;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<CanceledStateContext> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = 0;
        private static long getQuantity = 6123178973585501029L;

        private Companion() {
        }

        private static void a(String str, int i6, Object[] objArr) {
            char[] cArr = str;
            if (str != null) {
                int i7 = $11 + 97;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 22 / 0;
                    cArr = str.toCharArray();
                } else {
                    cArr = str.toCharArray();
                }
            }
            AFPurchaseConnectorA2z aFPurchaseConnectorA2z = new AFPurchaseConnectorA2z();
            char[] oneTimePurchaseOfferDetails = AFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails(getQuantity ^ 7848782090230080433L, cArr, i6);
            aFPurchaseConnectorA2z.getPackageName = 4;
            while (true) {
                int i9 = aFPurchaseConnectorA2z.getPackageName;
                if (i9 >= oneTimePurchaseOfferDetails.length) {
                    break;
                }
                $11 = ($10 + 101) % 128;
                aFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails = i9 - 4;
                oneTimePurchaseOfferDetails[i9] = (char) ((oneTimePurchaseOfferDetails[i9] ^ oneTimePurchaseOfferDetails[i9 % 4]) ^ (r3 * (getQuantity ^ 7848782090230080433L)));
                aFPurchaseConnectorA2z.getPackageName = i9 + 1;
            }
            String str2 = new String(oneTimePurchaseOfferDetails, 4, oneTimePurchaseOfferDetails.length - 4);
            int i10 = $11 + 33;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ CanceledStateContext fromJson(JSONObject jSONObject) {
            int i6 = getOneTimePurchaseOfferDetails + 109;
            getPackageName = i6 % 128;
            int i7 = i6 % 2;
            CanceledStateContext fromJson = fromJson(jSONObject);
            if (i7 != 0) {
                int i8 = 78 / 0;
            }
            getOneTimePurchaseOfferDetails = (getPackageName + 39) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final CanceledStateContext fromJson(@NotNull JSONObject p02) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("氬\uda93汈捲ሢ뼨\uf2ac\ue531伐㛘ퟺ슁⫾햮뭔ṝ֨\ue83e颋笰\ue109賣緙壵\udcd2ꎔℯ둈뾠䙆ڎ鄝魳\u1af9", TextUtils.getOffsetAfter("", 0), objArr);
            object = SubscriptionPurchaseKt.toObject(p02, ((String) objArr[0]).intern(), DeveloperInitiatedCancellation.INSTANCE);
            Object[] objArr2 = new Object[1];
            a("‟\ue833\u206d䅲₂篕킪⇅̮Ѵ\uf5efٴ曚\ue729饎\uda8a䦎\uda99몉뿜괳빋忻鰝郦鄸̤", View.resolveSizeAndState(0, 0, 0), objArr2);
            object2 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr2[0]).intern(), ReplacementCancellation.INSTANCE);
            Object[] objArr3 = new Object[1];
            a("戟椫扬伪ꆆ旪\udef1㿢䄪蕢ﮛᡈⓖ昫霋쒗\u0b9b宊듖ꇅ\uef3e㽑冡舳틣ဣ൳溒놖\uf5f0⫌", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            object3 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr3[0]).intern(), SystemInitiatedCancellation.INSTANCE);
            Object[] objArr4 = new Object[1];
            a("\udc12发\udc67뗎魶遪␃쩤＋뾛ş\uedd2髛峄淲ㄓ떆慖丷周儱֠ꭊ瞺泣⫁\uf79f鬉ྜ", View.resolveSize(0, 0), objArr4);
            object4 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr4[0]).intern(), UserInitiatedCancellation.INSTANCE);
            CanceledStateContext canceledStateContext = new CanceledStateContext((DeveloperInitiatedCancellation) object, (ReplacementCancellation) object2, (SystemInitiatedCancellation) object3, (UserInitiatedCancellation) object4);
            getOneTimePurchaseOfferDetails = (getPackageName + 9) % 128;
            return canceledStateContext;
        }
    }

    public CanceledStateContext(@Nullable DeveloperInitiatedCancellation developerInitiatedCancellation, @Nullable ReplacementCancellation replacementCancellation, @Nullable SystemInitiatedCancellation systemInitiatedCancellation, @Nullable UserInitiatedCancellation userInitiatedCancellation) {
        this.developerInitiatedCancellation = developerInitiatedCancellation;
        this.replacementCancellation = replacementCancellation;
        this.systemInitiatedCancellation = systemInitiatedCancellation;
        this.userInitiatedCancellation = userInitiatedCancellation;
    }

    public static /* synthetic */ CanceledStateContext copy$default(CanceledStateContext canceledStateContext, DeveloperInitiatedCancellation developerInitiatedCancellation, ReplacementCancellation replacementCancellation, SystemInitiatedCancellation systemInitiatedCancellation, UserInitiatedCancellation userInitiatedCancellation, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            developerInitiatedCancellation = canceledStateContext.developerInitiatedCancellation;
        }
        if ((i6 & 2) != 0) {
            replacementCancellation = canceledStateContext.replacementCancellation;
        }
        if ((i6 & 4) != 0) {
            systemInitiatedCancellation = canceledStateContext.systemInitiatedCancellation;
        }
        if ((i6 & 8) != 0) {
            userInitiatedCancellation = canceledStateContext.userInitiatedCancellation;
        }
        return canceledStateContext.copy(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final DeveloperInitiatedCancellation getDeveloperInitiatedCancellation() {
        return this.developerInitiatedCancellation;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ReplacementCancellation getReplacementCancellation() {
        return this.replacementCancellation;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final SystemInitiatedCancellation getSystemInitiatedCancellation() {
        return this.systemInitiatedCancellation;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final UserInitiatedCancellation getUserInitiatedCancellation() {
        return this.userInitiatedCancellation;
    }

    @NotNull
    public final CanceledStateContext copy(@Nullable DeveloperInitiatedCancellation p02, @Nullable ReplacementCancellation p12, @Nullable SystemInitiatedCancellation p22, @Nullable UserInitiatedCancellation p32) {
        return new CanceledStateContext(p02, p12, p22, p32);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof CanceledStateContext)) {
            return false;
        }
        CanceledStateContext canceledStateContext = (CanceledStateContext) p02;
        return Intrinsics.areEqual(this.developerInitiatedCancellation, canceledStateContext.developerInitiatedCancellation) && Intrinsics.areEqual(this.replacementCancellation, canceledStateContext.replacementCancellation) && Intrinsics.areEqual(this.systemInitiatedCancellation, canceledStateContext.systemInitiatedCancellation) && Intrinsics.areEqual(this.userInitiatedCancellation, canceledStateContext.userInitiatedCancellation);
    }

    @JvmName(name = "getDeveloperInitiatedCancellation")
    @Nullable
    public final DeveloperInitiatedCancellation getDeveloperInitiatedCancellation() {
        return this.developerInitiatedCancellation;
    }

    @JvmName(name = "getReplacementCancellation")
    @Nullable
    public final ReplacementCancellation getReplacementCancellation() {
        return this.replacementCancellation;
    }

    @JvmName(name = "getSystemInitiatedCancellation")
    @Nullable
    public final SystemInitiatedCancellation getSystemInitiatedCancellation() {
        return this.systemInitiatedCancellation;
    }

    @JvmName(name = "getUserInitiatedCancellation")
    @Nullable
    public final UserInitiatedCancellation getUserInitiatedCancellation() {
        return this.userInitiatedCancellation;
    }

    public final int hashCode() {
        DeveloperInitiatedCancellation developerInitiatedCancellation = this.developerInitiatedCancellation;
        int hashCode = (developerInitiatedCancellation == null ? 0 : developerInitiatedCancellation.hashCode()) * 31;
        ReplacementCancellation replacementCancellation = this.replacementCancellation;
        int hashCode2 = (hashCode + (replacementCancellation == null ? 0 : replacementCancellation.hashCode())) * 31;
        SystemInitiatedCancellation systemInitiatedCancellation = this.systemInitiatedCancellation;
        int hashCode3 = (hashCode2 + (systemInitiatedCancellation == null ? 0 : systemInitiatedCancellation.hashCode())) * 31;
        UserInitiatedCancellation userInitiatedCancellation = this.userInitiatedCancellation;
        return hashCode3 + (userInitiatedCancellation != null ? userInitiatedCancellation.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CanceledStateContext(developerInitiatedCancellation=" + this.developerInitiatedCancellation + ", replacementCancellation=" + this.replacementCancellation + ", systemInitiatedCancellation=" + this.systemInitiatedCancellation + ", userInitiatedCancellation=" + this.userInitiatedCancellation + ")";
    }
}
