package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\r\u0010\t"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent;", "", "", "p0", "p1", "p2", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "isUserSubjectToGDPR", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/appsflyer/AppsFlyerConsent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getHasConsentForAdsPersonalization", "getHasConsentForDataUsage", "Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class AppsFlyerConsent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean hasConsentForAdsPersonalization;

    @Nullable
    private final Boolean hasConsentForDataUsage;
    private final boolean isUserSubjectToGDPR;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent$Companion;", "", "<init>", "()V", "", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "Lcom/appsflyer/AppsFlyerConsent;", "forGDPRUser", "(ZZ)Lcom/appsflyer/AppsFlyerConsent;", "forNonGDPRUser", "()Lcom/appsflyer/AppsFlyerConsent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final AppsFlyerConsent forGDPRUser(boolean hasConsentForDataUsage, boolean hasConsentForAdsPersonalization) {
            return new AppsFlyerConsent(true, Boolean.valueOf(hasConsentForDataUsage), Boolean.valueOf(hasConsentForAdsPersonalization), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AppsFlyerConsent(boolean z6, Boolean bool, Boolean bool2) {
        this.isUserSubjectToGDPR = z6;
        this.hasConsentForDataUsage = bool;
        this.hasConsentForAdsPersonalization = bool2;
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean z6, Boolean bool, Boolean bool2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i6 & 2) != 0) {
            bool = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i6 & 4) != 0) {
            bool2 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        return appsFlyerConsent.copy(z6, bool, bool2);
    }

    @JvmStatic
    @NotNull
    public static final AppsFlyerConsent forGDPRUser(boolean z6, boolean z7) {
        return INSTANCE.forGDPRUser(z6, z7);
    }

    @JvmStatic
    @NotNull
    public static final AppsFlyerConsent forNonGDPRUser() {
        return INSTANCE.forNonGDPRUser();
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @NotNull
    public final AppsFlyerConsent copy(boolean isUserSubjectToGDPR, @Nullable Boolean hasConsentForDataUsage, @Nullable Boolean hasConsentForAdsPersonalization) {
        return new AppsFlyerConsent(isUserSubjectToGDPR, hasConsentForDataUsage, hasConsentForAdsPersonalization);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) other;
        return this.isUserSubjectToGDPR == appsFlyerConsent.isUserSubjectToGDPR && Intrinsics.areEqual(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.areEqual(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization);
    }

    @JvmName(name = "getHasConsentForAdsPersonalization")
    @Nullable
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @JvmName(name = "getHasConsentForDataUsage")
    @Nullable
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z6 = this.isUserSubjectToGDPR;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        Boolean bool = this.hasConsentForDataUsage;
        int hashCode = (i6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasConsentForAdsPersonalization;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @JvmName(name = "isUserSubjectToGDPR")
    public final boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    @NotNull
    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.isUserSubjectToGDPR + ", hasConsentForDataUsage=" + this.hasConsentForDataUsage + ", hasConsentForAdsPersonalization=" + this.hasConsentForAdsPersonalization + ")";
    }

    public /* synthetic */ AppsFlyerConsent(boolean z6, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6, bool, bool2);
    }
}
