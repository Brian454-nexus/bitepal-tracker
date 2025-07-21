package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFc1pSDK;", "", "", "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/deeplink/DeepLink;", "getMediationNetwork", "getMonetizationNetwork", "Z", "()Z", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.appsflyer.internal.AFc1pSDK, reason: from toString */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class DdlResponse {

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    @Nullable
    public final DeepLink deepLink;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata and from toString */
    private final boolean secondPing;

    public DdlResponse(boolean z6, @Nullable DeepLink deepLink) {
        this.secondPing = z6;
        this.deepLink = deepLink;
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof DdlResponse)) {
            return false;
        }
        DdlResponse ddlResponse = (DdlResponse) p02;
        return this.secondPing == ddlResponse.secondPing && Intrinsics.areEqual(this.deepLink, ddlResponse.deepLink);
    }

    @JvmName(name = "getCurrencyIso4217Code")
    /* renamed from: getCurrencyIso4217Code, reason: from getter */
    public final boolean getSecondPing() {
        return this.secondPing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z6 = this.secondPing;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        DeepLink deepLink = this.deepLink;
        return i6 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.secondPing + ", deepLink=" + this.deepLink + ")";
    }

    public /* synthetic */ DdlResponse(boolean z6, DeepLink deepLink, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? true : z6, (i6 & 2) != 0 ? null : deepLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DdlResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
