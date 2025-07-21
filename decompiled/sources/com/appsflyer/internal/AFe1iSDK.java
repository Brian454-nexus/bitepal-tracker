package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\f\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0011\u0010\r\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK;", "", "Lcom/appsflyer/internal/AFd1qSDK;", "p0", "Lcom/appsflyer/internal/AFd1rSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1qSDK;Lcom/appsflyer/internal/AFd1rSDK;)V", "", "component3", "Lkotlin/Lazy;", "getMonetizationNetwork", "getCurrencyIso4217Code", "AFAdRevenueData", "()Ljava/lang/String;", "getRevenue", "Lcom/appsflyer/internal/AFd1qSDK;", "getMediationNetwork", "", "()Z", "Lcom/appsflyer/internal/AFd1rSDK;", "areAllFieldsValid", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1iSDK {

    @Nullable
    private static AFe1hSDK areAllFieldsValid;

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMonetizationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final AFd1rSDK areAllFieldsValid;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    public final Lazy getCurrencyIso4217Code;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFd1qSDK getMediationNetwork;

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String AFAdRevenueData = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> component1 = CollectionsKt.listOf(new String[]{"googleplay", "playstore", "googleplaystore"});

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1fSDK.values().length];
            try {
                iArr[AFe1fSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1fSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1fSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK$AFa1zSDK;", "", "<init>", "()V", "", "", "component1", "Ljava/util/List;", "getCurrencyIso4217Code", "()Ljava/util/List;", "getMediationNetwork", "Ljava/lang/String;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1hSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1hSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFe1hSDK;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1iSDK$AFa1zSDK, reason: from kotlin metadata */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @JvmName(name = "getCurrencyIso4217Code")
        @NotNull
        public static List<String> getCurrencyIso4217Code() {
            return AFe1iSDK.component1;
        }

        @JvmName(name = "getMonetizationNetwork")
        public static void getMonetizationNetwork(@Nullable AFe1hSDK aFe1hSDK) {
            AFe1iSDK.areAllFieldsValid = aFe1hSDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFe1iSDK(@NotNull AFd1qSDK aFd1qSDK, @NotNull AFd1rSDK aFd1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        this.getMediationNetwork = aFd1qSDK;
        this.areAllFieldsValid = aFd1rSDK;
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1iSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String monetizationNetwork = AFb1rSDK.getMonetizationNetwork(AFe1iSDK.this.areAllFieldsValid, AFe1iSDK.this.getMediationNetwork.component4());
                if (monetizationNetwork != null && !StringsKt.isBlank(monetizationNetwork)) {
                    String obj = StringsKt.trim(monetizationNetwork).toString();
                    List<String> currencyIso4217Code = Companion.getCurrencyIso4217Code();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (currencyIso4217Code.contains(lowerCase)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        monetizationNetwork = "";
                    } else {
                        monetizationNetwork = "-" + obj;
                    }
                }
                return StringsKt.trim(monetizationNetwork != null ? monetizationNetwork : "").toString();
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1iSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1iSDK.this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1iSDK.getMediationNetwork(packageName, AFe1iSDK.getMonetizationNetwork(AFe1iSDK.this));
            }
        });
    }

    @JvmName(name = "AFAdRevenueData")
    @NotNull
    public final String AFAdRevenueData() {
        int i6 = AFa1uSDK.getRevenue[(getCurrencyIso4217Code() ? AFe1fSDK.DEFAULT : AFe1fSDK.API).ordinal()];
        if (i6 == 1) {
            return "appsflyersdk.com";
        }
        if (i6 != 2) {
            if (i6 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1hSDK aFe1hSDK = areAllFieldsValid;
        String str = aFe1hSDK != null ? aFe1hSDK.getMediationNetwork : null;
        return str == null ? "" : str;
    }

    @JvmName(name = "getCurrencyIso4217Code")
    public static boolean getCurrencyIso4217Code() {
        return areAllFieldsValid == null;
    }

    public static final /* synthetic */ String getMonetizationNetwork(AFe1iSDK aFe1iSDK) {
        return (String) aFe1iSDK.getMonetizationNetwork.getValue();
    }

    @JvmName(name = "getMediationNetwork")
    @NotNull
    public final String getMediationNetwork() {
        AFe1fSDK aFe1fSDK;
        if (getCurrencyIso4217Code()) {
            aFe1fSDK = AFe1fSDK.DEFAULT;
        } else {
            aFe1fSDK = AFe1fSDK.API;
        }
        int i6 = AFa1uSDK.getRevenue[aFe1fSDK.ordinal()];
        if (i6 == 1) {
            return (String) this.getCurrencyIso4217Code.getValue();
        }
        if (i6 != 2) {
            if (i6 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1hSDK aFe1hSDK = areAllFieldsValid;
        String str = aFe1hSDK != null ? aFe1hSDK.AFAdRevenueData : null;
        return str == null ? "" : str;
    }

    public static final void getMonetizationNetwork(@Nullable AFe1hSDK aFe1hSDK) {
        Companion.getMonetizationNetwork(aFe1hSDK);
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring + "-";
    }
}
