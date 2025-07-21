package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nRegisterTriggerTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,129:1\n215#2,2:130\n*S KotlinDebug\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n*L\n123#1:130,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1hSDK extends AFe1eSDK<Unit> {

    @NotNull
    private final AFd1nSDK areAllFieldsValid;

    @NotNull
    private final String component1;

    @NotNull
    private final AFd1qSDK component2;

    @NotNull
    private final ExecutorService component3;

    @NotNull
    private final AFg1kSDK component4;

    @NotNull
    private final AFg1wSDK hashCode;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AFa1vSDK implements OutcomeReceiver {
        private /* synthetic */ AFf1hSDK AFAdRevenueData;
        private /* synthetic */ Ref.ObjectRef<AFe1cSDK> getCurrencyIso4217Code;
        private /* synthetic */ CountDownLatch getMonetizationNetwork;

        public AFa1vSDK(Ref.ObjectRef<AFe1cSDK> objectRef, CountDownLatch countDownLatch, AFf1hSDK aFf1hSDK) {
            this.getCurrencyIso4217Code = objectRef;
            this.getMonetizationNetwork = countDownLatch;
            this.AFAdRevenueData = aFf1hSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1hSDK.getMonetizationNetwork(exc);
            this.getMonetizationNetwork.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.appsflyer.internal.AFe1cSDK, T] */
        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.element = AFe1cSDK.SUCCESS;
            this.getMonetizationNetwork.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1hSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        ExecutorService monetizationNetwork = aFd1kSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.component3 = monetizationNetwork;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.component2 = mediationNetwork;
        AFd1nSDK values = aFd1kSDK.values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        this.areAllFieldsValid = values;
        AFg1kSDK component1 = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(component1, "");
        this.component4 = component1;
        AFg1wSDK AFKeystoreWrapper = aFd1kSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        this.hashCode = AFKeystoreWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.appsflyer.internal.AFe1cSDK, T] */
    @Override // com.appsflyer.internal.AFe1eSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1cSDK AFAdRevenueData() {
        MeasurementManager a6;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1cSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.areAllFieldsValid.AFAdRevenueData;
            if (context != null && (a6 = r2.g.a(context.getSystemService(r2.f.a()))) != null) {
                new AFj1jSDK(this.component2, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1jSDK.getCurrencyIso4217Code()).buildUpon();
                String monetizationNetwork = this.component2.getMonetizationNetwork();
                if (monetizationNetwork == null) {
                    monetizationNetwork = "";
                }
                Pair pair = TuplesKt.to("event_name", this.component1);
                Pair pair2 = TuplesKt.to("app_id", this.component2.getMonetizationNetwork.AFAdRevenueData.getPackageName());
                Context context2 = this.component2.getMonetizationNetwork.AFAdRevenueData;
                Map mutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, pair2, TuplesKt.to("app_version", AFb1qSDK.getMediationNetwork(context2, context2.getPackageName())), TuplesKt.to("sdk_version", AFd1qSDK.getRevenue()), TuplesKt.to("api_version", AFd1qSDK.getCurrencyIso4217Code()), TuplesKt.to("timestamp", String.valueOf(this.component4.getCurrencyIso4217Code())), TuplesKt.to("request_id", AFd1qSDK.getMediationNetwork()), TuplesKt.to("gaid", monetizationNetwork)});
                AFd1qSDK aFd1qSDK = this.component2;
                String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue);
                if (currencyIso4217Code != null) {
                    mutableMapOf.put("appsflyer_id", currencyIso4217Code);
                }
                Long AFAdRevenueData = this.component4.AFAdRevenueData();
                if (AFAdRevenueData != null) {
                    mutableMapOf.put("install_time", String.valueOf(AFAdRevenueData.longValue()));
                }
                for (Map.Entry entry : mutableMapOf.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                a6.registerTrigger(build, this.component3, v0.n.a(new AFa1vSDK(objectRef, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return (AFe1cSDK) objectRef.element;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 20000L;
    }

    public static final /* synthetic */ void getMonetizationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }
}
