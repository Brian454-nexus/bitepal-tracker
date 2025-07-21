package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0013J\u0013\u0010\u000e\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFj1jSDK;", "", "Lcom/appsflyer/internal/AFd1qSDK;", "p0", "Lcom/appsflyer/internal/AFj1bSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1qSDK;Lcom/appsflyer/internal/AFj1bSDK;)V", "", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCurrencyIso4217Code", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1gSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1gSDK;)Ljava/lang/String;", "", "getMonetizationNetwork", "(Ljava/lang/String;Z)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1qSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFj1bSDK;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventUrlResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n+ 2 StringExtensions.kt\ncom/appsflyer/StringExtensionsKt\n*L\n1#1,306:1\n39#2:307\n*S KotlinDebug\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n*L\n164#1:307\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1jSDK {

    @JvmField
    @NotNull
    public static final String areAllFieldsValid;

    @JvmField
    @NotNull
    public static final String component1;

    @JvmField
    @NotNull
    public static final String component2;

    @JvmField
    @NotNull
    public static String component3;

    @NotNull
    private static final String component4;

    @JvmField
    @NotNull
    public static final String getCurrencyIso4217Code;

    @JvmField
    @NotNull
    public static final String getMediationNetwork;

    @JvmField
    @NotNull
    public static final String getMonetizationNetwork;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final AFj1bSDK getMediationNetwork;

    @NotNull
    public final AFd1qSDK getRevenue;

    static {
        String str = AFb1rSDK.AFAdRevenueData;
        String str2 = str + "/androidevent?app_id=";
        component4 = str2;
        getMonetizationNetwork = "https://%sattr.%s/api/v" + str2;
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.15.2/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v" + str2;
        areAllFieldsValid = "https://%slaunches.%s/api/v" + str2;
        component1 = "https://%sinapps.%s/api/v" + str2;
        component2 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        component3 = "https://%svalidate.%s/api/v" + str + "/androidevent?buildnumber=6.15.2&app_id=";
    }

    @JvmOverloads
    private AFj1jSDK(@NotNull AFd1qSDK aFd1qSDK, @NotNull AFj1bSDK aFj1bSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFj1bSDK, "");
        this.getRevenue = aFd1qSDK;
        this.getMediationNetwork = aFj1bSDK;
    }

    @NotNull
    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public static String getMonetizationNetwork(String str, boolean z6) {
        return str + (!z6 ? "&buildnumber=6.15.2" : "");
    }

    @NotNull
    public final String getMediationNetwork(@NotNull AFh1gSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        if (p02 instanceof AFh1bSDK) {
            return this.getMediationNetwork.getMonetizationNetwork("https://%ssdk-services.%s/validate-android-signature");
        }
        if (p02 instanceof AFh1aSDK) {
            return this.getMediationNetwork.getMonetizationNetwork(component3) + this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        }
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final String getRevenue(@Nullable String p02, @Nullable String p12) {
        String packageName = this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String component42 = this.getRevenue.component4();
        if (component42 != null && !StringsKt.isBlank(component42)) {
            component42 = "-" + StringsKt.trim(component42).toString();
        }
        if (component42 == null) {
            component42 = "";
        }
        String obj = StringsKt.trim(component42).toString();
        Uri.Builder appendPath = Uri.parse(this.getMediationNetwork.getMonetizationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + obj);
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (p02 != null && p12 != null) {
            appendPath.appendQueryParameter("af_sig", AFb1jSDK.getMonetizationNetwork(p12 + p02, p02));
        } else {
            String str = p02 == null ? "devKey" : "timestamp";
            AFLogger.afErrorLog(str + " is null at attempt to generate ddl event url", new IllegalStateException(str + " is null"));
        }
        String obj2 = appendPath.appendQueryParameter("sdk_version", AFb1rSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public /* synthetic */ AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1bSDK aFj1bSDK, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1qSDK, (i6 & 2) != 0 ? new AFj1eSDK() : aFj1bSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AFj1jSDK(@NotNull AFd1qSDK aFd1qSDK) {
        this(aFd1qSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
    }

    public final String getMediationNetwork(String str) {
        return str + this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
    }

    public final String getRevenue(String str) {
        String str2;
        String component42 = this.getRevenue.component4();
        if (component42 != null) {
            str2 = "&channel=" + component42;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }
}
