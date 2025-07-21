package com.appsflyer.internal;

import K5.a;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0012\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0019J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u000b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u001b\u0010\r\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\tR\u0014\u0010 \u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0015\u0010\u001d\u001a\u00020\u00148BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010&"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", "Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;)V", "", "copydefault", "()Z", "", "getMediationNetwork", "(I)Z", "getRevenue", "getCurrencyIso4217Code", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;", "p1", "AFAdRevenueData", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;)Z", "", "getMonetizationNetwork", "()J", "Lcom/appsflyer/internal/AFe1cSDK;", "()Lcom/appsflyer/internal/AFe1cSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1pSDK;Ljava/lang/String;)V", "component1", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1nSDK;", "component2", "Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFd1qSDK;", "component4", "Lcom/appsflyer/internal/AFd1qSDK;", "equals", "Lkotlin/Lazy;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFd1tSDK;", "component3", "Lcom/appsflyer/internal/AFd1tSDK;", "AFa1ySDK", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFetchAdvertisingIdTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n+ 2 StringExtensions.kt\ncom/appsflyer/StringExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n39#2:396\n1#3:397\n*S KotlinDebug\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n*L\n201#1:396\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1pSDK extends AFe1eSDK<AdvertisingIdData> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final Lazy component1;

    /* renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AdvertisingIdData getMediationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFd1nSDK getMonetizationNetwork;

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFd1tSDK component2;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final AFd1qSDK AFAdRevenueData;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final Lazy getRevenue;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ FetchGaidData $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(FetchGaidData fetchGaidData, CountDownLatch countDownLatch) {
            this.$fetchGaidData = fetchGaidData;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1uSDK.w$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1pSDK$AFa1vSDK, reason: from toString */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final /* data */ class FetchGaidData {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public FetchGaidData() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ FetchGaidData copy$default(FetchGaidData fetchGaidData, String str, Boolean bool, boolean z6, StringBuilder sb, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                str = fetchGaidData.advertisingId;
            }
            if ((i6 & 2) != 0) {
                bool = fetchGaidData.isLimitAdTrackingEnabled;
            }
            if ((i6 & 4) != 0) {
                z6 = fetchGaidData.advertisingIdWithGps;
            }
            if ((i6 & 8) != 0) {
                sb = fetchGaidData.gaidError;
            }
            return fetchGaidData.copy(str, bool, z6, sb);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final FetchGaidData copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new FetchGaidData(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchGaidData)) {
                return false;
            }
            FetchGaidData fetchGaidData = (FetchGaidData) other;
            return Intrinsics.areEqual(this.advertisingId, fetchGaidData.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, fetchGaidData.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == fetchGaidData.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, fetchGaidData.gaidError);
        }

        @JvmName(name = "getAdvertisingId")
        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @JvmName(name = "getAdvertisingIdWithGps")
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @JvmName(name = "getGaidError")
        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z6 = this.advertisingIdWithGps;
            int i6 = z6;
            if (z6 != 0) {
                i6 = 1;
            }
            return ((hashCode2 + i6) * 31) + this.gaidError.hashCode();
        }

        @JvmName(name = "isLimitAdTrackingEnabled")
        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @JvmName(name = "setAdvertisingId")
        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        @JvmName(name = "setAdvertisingIdWithGps")
        public final void setAdvertisingIdWithGps(boolean z6) {
            this.advertisingIdWithGps = z6;
        }

        @JvmName(name = "setLimitAdTrackingEnabled")
        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public FetchGaidData(@Nullable String str, @Nullable Boolean bool, boolean z6, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z6;
            this.gaidError = gaidError;
        }

        public /* synthetic */ FetchGaidData(String str, Boolean bool, boolean z6, StringBuilder sb, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : bool, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(@NotNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1nSDK values = aFd1kSDK.values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        this.getMonetizationNetwork = values;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.AFAdRevenueData = mediationNetwork;
        AFd1tSDK e6 = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e6, "");
        this.component2 = e6;
        this.getMediationNetwork = new AdvertisingIdData(null, null, null, null, null, null, null, null, 255, null);
        this.component1 = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFf1pSDK.5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                Long longOrNull;
                String revenue = AFf1pSDK.this.AFAdRevenueData.getRevenue("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((revenue == null || (longOrNull = StringsKt.toLongOrNull(revenue)) == null) ? 1000L : longOrNull.longValue());
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1pSDK.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.AFAdRevenueData.getRevenue("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    @JvmName(name = "areAllFieldsValid")
    private final boolean areAllFieldsValid() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    @JvmName(name = "component4")
    private static boolean component4() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0005->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[EDGE_INSN: B:11:0x0048->B:12:0x0048 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean copydefault() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = r2
        L5:
            if (r1 <= 0) goto L48
            boolean r3 = r0.areAllFieldsValid()
            r4 = 1
            if (r3 == 0) goto L22
            boolean r3 = r0.getCurrencyIso4217Code(r1)
            if (r3 == 0) goto L22
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r6 = com.appsflyer.internal.AFh1vSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using Samsung Cloud dev SDK"
            r8 = 0
            com.appsflyer.internal.AFh1uSDK.v$default(r5, r6, r7, r8, r9, r10)
        L20:
            r3 = r4
            goto L43
        L22:
            boolean r3 = r0.getMediationNetwork(r1)
            if (r3 == 0) goto L35
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r6 = com.appsflyer.internal.AFh1vSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using GMS"
            r8 = 0
            com.appsflyer.internal.AFh1uSDK.v$default(r5, r6, r7, r8, r9, r10)
            goto L20
        L35:
            com.appsflyer.AFLogger r11 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r12 = com.appsflyer.internal.AFh1vSDK.ADVERTISING_ID
            r15 = 4
            r16 = 0
            java.lang.String r13 = "Failed to fetch GAID"
            r14 = 0
            com.appsflyer.internal.AFh1uSDK.v$default(r11, r12, r13, r14, r15, r16)
            r3 = r2
        L43:
            if (r3 != 0) goto L48
            int r1 = r1 + (-1)
            goto L5
        L48:
            com.appsflyer.internal.AFd1tSDK r1 = r0.component2
            com.appsflyer.internal.AFh1pSDK r2 = r0.getMediationNetwork
            r1.component4 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.copydefault():boolean");
    }

    private final boolean getCurrencyIso4217Code(Context p02, FetchGaidData p12) {
        Unit unit;
        try {
            a.a a6 = K5.a.a(p02);
            if (a6 != null) {
                p12.setAdvertisingId(a6.a());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(a6.b()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.INSTANCE;
                }
                p12.getGaidError().append("emptyOrNull |");
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.ADVERTISING_ID;
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1uSDK.i$default(aFLogger, aFh1vSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        getMediationNetwork(r20.getMediationNetwork, r9.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        r0 = r9.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00df, code lost:
    
        if (r0.length() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e2, code lost:
    
        r0 = r20.getMediationNetwork;
        r0.advertisingId = r9.getAdvertisingId();
        r3 = java.lang.Boolean.FALSE;
        r0.isLimited = r3;
        r4 = java.lang.Boolean.TRUE;
        r0.isEnabled = r4;
        r0.isGaidWithGps = r3;
        r0.isGaidWithSamsungCloudDev = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        if (r21 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fc, code lost:
    
        r0.retry = java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0103, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (r9.getGaidError().length() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if (r9.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getRevenue(int r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.getRevenue(int):boolean");
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return ((Number) this.component1.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getMediationNetwork(int r14) {
        /*
            r13 = this;
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r1 = com.appsflyer.internal.AFh1vSDK.ADVERTISING_ID
            r4 = 4
            r5 = 0
            java.lang.String r2 = "Trying to fetch GAID..."
            r3 = 0
            com.appsflyer.internal.AFh1uSDK.i$default(r0, r1, r2, r3, r4, r5)
            com.appsflyer.internal.AFf1pSDK$AFa1vSDK r6 = new com.appsflyer.internal.AFf1pSDK$AFa1vSDK
            r11 = 15
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.appsflyer.internal.AFd1nSDK r0 = r13.getMonetizationNetwork
            android.content.Context r0 = r0.AFAdRevenueData
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = getMediationNetwork(r0)
            com.appsflyer.internal.AFd1nSDK r1 = r13.getMonetizationNetwork
            android.content.Context r1 = r1.AFAdRevenueData
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            boolean r1 = r13.getCurrencyIso4217Code(r1, r6)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L83
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = "enableGpsFallback"
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 == 0) goto L4d
            com.appsflyer.internal.AFd1nSDK r1 = r13.getMonetizationNetwork
            android.content.Context r1 = r1.AFAdRevenueData
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            boolean r1 = r13.AFAdRevenueData(r1, r6)
            if (r1 == 0) goto L4d
            r1 = r3
            goto L4e
        L4d:
            r1 = r2
        L4e:
            java.lang.StringBuilder r4 = r6.getGaidError()
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L7b
            boolean r5 = kotlin.text.StringsKt.isBlank(r4)
            if (r5 == 0) goto L5f
            goto L7b
        L5f:
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ": "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L7b:
            com.appsflyer.internal.AFh1pSDK r0 = r13.getMediationNetwork
            getMediationNetwork(r0, r4)
            if (r1 != 0) goto L83
            return r2
        L83:
            com.appsflyer.internal.AFh1pSDK r0 = r13.getMediationNetwork
            java.lang.String r1 = r6.getAdvertisingId()
            r0.advertisingId = r1
            java.lang.Boolean r1 = r6.isLimitAdTrackingEnabled()
            r0.isLimited = r1
            java.lang.Boolean r1 = r6.isLimitAdTrackingEnabled()
            if (r1 == 0) goto La1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto La2
        La1:
            r1 = 0
        La2:
            r0.isEnabled = r1
            boolean r1 = r6.getAdvertisingIdWithGps()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.isGaidWithGps = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.isGaidWithSamsungCloudDev = r1
            r1 = 2
            if (r14 == r1) goto Lb6
            r2 = r3
        Lb6:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r0.retry = r14
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.getMediationNetwork(int):boolean");
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NotNull
    public final AFe1cSDK AFAdRevenueData() {
        AFe1cSDK aFe1cSDK;
        if (this.component2.getMonetizationNetwork()) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1cSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        if (CollectionsKt.listOf(new Boolean[]{valueOf, bool, bool}).contains(Boolean.TRUE)) {
            aFe1cSDK = AFe1cSDK.SUCCESS;
        } else {
            aFe1cSDK = AFe1cSDK.FAILURE;
        }
        AFd1tSDK aFd1tSDK = this.component2;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFe1nSDK.getRevenue + "ms", false, 4, null);
        aFd1tSDK.getRevenue(aFe1nSDK);
        return aFe1cSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x001a, B:7:0x002e, B:11:0x0034, B:12:0x0044, B:14:0x0025), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFAdRevenueData(android.content.Context r11, com.appsflyer.internal.AFf1pSDK.FetchGaidData r12) {
        /*
            r10 = this;
            com.appsflyer.internal.AFa1cSDK$AFa1uSDK r11 = com.appsflyer.internal.AFa1cSDK.getCurrencyIso4217Code(r11)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r11.getMonetizationNetwork     // Catch: java.lang.Throwable -> L21
            r12.setAdvertisingId(r0)     // Catch: java.lang.Throwable -> L21
            boolean r11 = r11.getMediationNetwork()     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L21
            r12.setLimitAdTrackingEnabled(r11)     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = r12.getAdvertisingId()     // Catch: java.lang.Throwable -> L21
            if (r11 == 0) goto L25
            int r11 = r11.length()     // Catch: java.lang.Throwable -> L21
            if (r11 != 0) goto L2e
            goto L25
        L21:
            r0 = move-exception
            r11 = r0
            r3 = r11
            goto L45
        L25:
            java.lang.StringBuilder r11 = r12.getGaidError()     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "emptyOrNull (bypass) |"
            r11.append(r0)     // Catch: java.lang.Throwable -> L21
        L2e:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L21
            if (r11 == 0) goto L34
            r11 = 1
            return r11
        L34:
            java.lang.StringBuilder r11 = r12.getGaidError()     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "gpsAdInfo-null (bypass) |"
            r11.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = "GpsAdInfo is null (bypass)"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L45:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r1 = com.appsflyer.internal.AFh1vSDK.ADVERTISING_ID
            java.lang.String r11 = r3.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Failed to fetch GAID: "
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r8 = 64
            r9 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            com.appsflyer.internal.AFh1uSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r11 = r12.getGaidError()
            java.lang.Class r12 = r3.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            java.lang.String r12 = " |"
            r11.append(r12)
            java.lang.String r11 = r3.getLocalizedMessage()
            if (r11 != 0) goto L86
            java.lang.String r11 = r3.toString()
        L86:
            r6 = r11
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r0
            r5 = r1
            com.appsflyer.internal.AFh1uSDK.i$default(r4, r5, r6, r7, r8, r9)
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.AFAdRevenueData(android.content.Context, com.appsflyer.internal.AFf1pSDK$AFa1vSDK):boolean");
    }

    private final boolean getCurrencyIso4217Code(int p02) {
        return getRevenue(p02);
    }

    private static int getMediationNetwork(Context p02) {
        try {
            return GoogleApiAvailability.m().g(p02);
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private static void getMediationNetwork(AdvertisingIdData advertisingIdData, String str) {
        if (str == null) {
            return;
        }
        String str2 = advertisingIdData.gaidError;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        advertisingIdData.gaidError = str;
    }
}
