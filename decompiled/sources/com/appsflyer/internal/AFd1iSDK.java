package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1eSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1iSDK implements AFd1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;
    private static long copydefault = 4316357171685541830L;
    private static char equals = 11893;
    private static int hashCode = 0;
    private static int toString = -2046375994;

    @NotNull
    private AFd1kSDK AFAdRevenueData;

    @NotNull
    private final String areAllFieldsValid;

    @Nullable
    private AFd1eSDK.AFa1vSDK component1;

    @NotNull
    private final Lazy component2;

    @NotNull
    private final Lazy component3;

    @NotNull
    private final Lazy component4;

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final Lazy getMediationNetwork;

    @NotNull
    private final Lazy getMonetizationNetwork;

    @NotNull
    private final Lazy getRevenue;

    public AFd1iSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFAdRevenueData = aFd1kSDK;
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFf1aSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFf1aSDK invoke() {
                AFf1aSDK component2 = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).component2();
                Intrinsics.checkNotNullExpressionValue(component2, "");
                return component2;
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFd1qSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1qSDK invoke() {
                AFd1qSDK mediationNetwork = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getMediationNetwork();
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                return mediationNetwork;
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<AFd1rSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1rSDK invoke() {
                AFd1rSDK revenue = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getRevenue();
                Intrinsics.checkNotNullExpressionValue(revenue, "");
                return revenue;
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFg1wSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFg1wSDK invoke() {
                AFg1wSDK AFKeystoreWrapper = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
                return AFKeystoreWrapper;
            }
        });
        this.component4 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1iSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }
        });
        this.areAllFieldsValid = "6.15.2";
        this.component2 = LazyKt.lazy(new Function0<AFd1jSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFd1jSDK invoke() {
                AFd1nSDK values = AFd1iSDK.getCurrencyIso4217Code(AFd1iSDK.this).values();
                Intrinsics.checkNotNullExpressionValue(values, "");
                return new AFd1jSDK(values);
            }
        });
        this.component3 = LazyKt.lazy(new Function0<AFd1cSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1cSDK invoke() {
                return new AFd1cSDK(AFd1iSDK.this.getRevenue());
            }
        });
    }

    private final AFd1qSDK AFAdRevenueData() {
        int i6 = copy + 115;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        AFd1qSDK aFd1qSDK = (AFd1qSDK) this.getCurrencyIso4217Code.getValue();
        int i7 = hashCode + 1;
        copy = i7 % 128;
        if (i7 % 2 != 0) {
            return aFd1qSDK;
        }
        throw null;
    }

    private final ExecutorService areAllFieldsValid() {
        copy = (hashCode + 97) % 128;
        ExecutorService executorService = (ExecutorService) this.component4.getValue();
        int i6 = hashCode + 57;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return executorService;
        }
        throw null;
    }

    private final AFg1wSDK component1() {
        hashCode = (copy + 39) % 128;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.getMediationNetwork.getValue();
        hashCode = (copy + 47) % 128;
        return aFg1wSDK;
    }

    @NotNull
    private AFd1bSDK component2() {
        int i6 = hashCode + 7;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK) this.component3.getValue();
        int i7 = copy + 69;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            return aFd1bSDK;
        }
        throw null;
    }

    private final AFh1dSDK component3() {
        AFi1vSDK aFi1vSDK = ((AFf1aSDK) getRevenue(new Object[]{this}, -1136684343, 1136684347, System.identityHashCode(this))).getCurrencyIso4217Code.getRevenue;
        if (aFi1vSDK != null) {
            int i6 = copy;
            int i7 = i6 + 23;
            hashCode = i7 % 128;
            if (i7 % 2 != 0) {
                AFh1cSDK aFh1cSDK = aFi1vSDK.getRevenue;
                throw null;
            }
            AFh1cSDK aFh1cSDK2 = aFi1vSDK.getRevenue;
            if (aFh1cSDK2 != null) {
                hashCode = (i6 + 77) % 128;
                AFh1dSDK aFh1dSDK = aFh1cSDK2.getMediationNetwork;
                hashCode = (i6 + 75) % 128;
                return aFh1dSDK;
            }
        }
        return null;
    }

    private final AFd1rSDK component4() {
        return (AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this));
    }

    private final synchronized void copy() {
        boolean z6;
        try {
            AFh1dSDK component3 = component3();
            if (component3 != null) {
                if (component3.getMonetizationNetwork == -1) {
                    ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                } else if (((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    int i6 = copy + 17;
                    hashCode = i6 % 128;
                    if (i6 % 2 != 0) {
                        getRevenue(component3);
                        throw null;
                    }
                    getRevenue(component3);
                }
                z6 = getMediationNetwork(component3);
            } else {
                hashCode = (copy + 85) % 128;
                z6 = false;
            }
            AFd1eSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(z6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00de, code lost:
    
        if (r8 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        if (r8 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016a, code lost:
    
        if (r0.intValue() != (-1)) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00da A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120 A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138 A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155 A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0224 A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0233 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166 A[Catch: all -> 0x000a, TryCatch #5 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x0023, B:12:0x004b, B:14:0x0052, B:16:0x0061, B:18:0x006a, B:20:0x0075, B:22:0x0079, B:24:0x008b, B:26:0x0095, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bd, B:35:0x00c3, B:37:0x00ce, B:42:0x00e0, B:43:0x00e6, B:45:0x00f4, B:47:0x00fa, B:49:0x0108, B:50:0x010e, B:51:0x0111, B:52:0x011a, B:54:0x0120, B:56:0x012c, B:57:0x0132, B:59:0x0138, B:61:0x013c, B:63:0x0147, B:65:0x0155, B:72:0x0165, B:74:0x016e, B:75:0x0220, B:77:0x0224, B:79:0x022a, B:80:0x022e, B:86:0x017f, B:88:0x018a, B:89:0x01a7, B:94:0x01c4, B:96:0x01c7, B:97:0x01eb, B:98:0x0166, B:100:0x014c, B:105:0x0151, B:111:0x00d9, B:112:0x00da, B:121:0x0118, B:123:0x0206, B:102:0x014f, B:91:0x01c2, B:69:0x0162, B:118:0x0116, B:40:0x00d4), top: B:2:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void copydefault() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1iSDK.copydefault():void");
    }

    private final void equals() {
        AFh1dSDK component3;
        String str;
        int i6 = copy + 111;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            component3 = component3();
            int i7 = 77 / 0;
            if (component3 == null) {
                return;
            }
        } else {
            component3 = component3();
            if (component3 == null) {
                return;
            }
        }
        int i8 = copy + 1;
        hashCode = i8 % 128;
        if (i8 % 2 != 0) {
            AFAdRevenueData(component3);
            throw null;
        }
        if (!AFAdRevenueData(component3)) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            return;
        }
        int i9 = hashCode + 15;
        copy = i9 % 128;
        if (i9 % 2 == 0) {
            AFg1wSDK component1 = component1();
            str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{component1}, -1684451992, 1684451992, System.identityHashCode(component1));
            int i10 = 0 / 0;
            if (str == null) {
                return;
            }
        } else {
            AFg1wSDK component12 = component1();
            str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{component12}, -1684451992, 1684451992, System.identityHashCode(component12));
            if (str == null) {
                return;
            }
        }
        String jSONObject = new JSONObject((Map) getRevenue(new Object[]{getMonetizationNetwork(component3), getRevenue().getMonetizationNetwork()}, 563165298, -563165297, (int) System.currentTimeMillis())).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        Intrinsics.checkNotNullExpressionValue(str, "");
        getCurrencyIso4217Code(jSONObject, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1iSDK aFd1iSDK) {
        int i6 = copy + 1;
        hashCode = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.equals();
            copy = (hashCode + 121) % 128;
        } else {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.equals();
            throw null;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i6 = hashCode + 107;
        copy = i6 % 128;
        int i7 = i6 % 2;
        AFf1aSDK aFf1aSDK = (AFf1aSDK) aFd1iSDK.getMonetizationNetwork.getValue();
        if (i7 == 0) {
            int i8 = 73 / 0;
        }
        copy = (hashCode + 119) % 128;
        return aFf1aSDK;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i6, int i7, int i8) {
        int i9 = (i6 * (-589)) + (i7 * 591);
        int i10 = ~i7;
        int i11 = ~i8;
        int i12 = (~(i10 | i6)) | (~(i10 | i11)) | (~(i11 | i6));
        int i13 = ~i6;
        int i14 = i9 + (((~(i8 | i13 | i7)) | i12) * 590) + (i12 * (-1180)) + (((~(i13 | i11)) | (~(i7 | i11))) * 590);
        if (i14 == 1) {
            Map map = (Map) objArr[0];
            List list = (List) objArr[1];
            copy = (hashCode + 89) % 128;
            Map mapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFe1xSDK.getMonetizationNetwork(list))});
            hashCode = (copy + 35) % 128;
            return mapOf;
        }
        if (i14 != 2) {
            return i14 != 3 ? i14 != 4 ? getRevenue(objArr) : getMonetizationNetwork(objArr) : AFAdRevenueData(objArr);
        }
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        hashCode = (copy + 85) % 128;
        AFd1rSDK aFd1rSDK = (AFd1rSDK) aFd1iSDK.getRevenue.getValue();
        copy = (hashCode + 23) % 128;
        return aFd1rSDK;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getCurrencyIso4217Code(@Nullable AFd1eSDK.AFa1vSDK aFa1vSDK) {
        int i6 = hashCode + 105;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFAdRevenueData(AFd1iSDK.this);
                }
            });
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFAdRevenueData(AFd1iSDK.this);
                }
            });
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1dSDK component3 = aFd1iSDK.component3();
        if (component3 != null) {
            int i6 = hashCode + 67;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                if (aFd1iSDK.getMediationNetwork(component3)) {
                    return;
                }
            } else if (!aFd1iSDK.getMediationNetwork(component3)) {
                return;
            }
            hashCode = (copy + 71) % 128;
            aFd1iSDK.getRevenue().getCurrencyIso4217Code(th, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c6, String str, String str2, String str3, int i6, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != null) {
            int i7 = $11 + 45;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr = str3.toCharArray();
                int i8 = 4 / 0;
            } else {
                cArr = str3.toCharArray();
            }
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != 0) {
            cArr2 = str2.toCharArray();
            $10 = ($11 + 15) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr3.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(charArray, 0, cArr5, 0, length);
        System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c6);
        cArr6[2] = (char) (cArr6[2] + ((char) i6));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        aFk1sSDK.getMediationNetwork = 0;
        while (true) {
            int i9 = aFk1sSDK.getMediationNetwork;
            if (i9 < length3) {
                $11 = ($10 + 119) % 128;
                int i10 = (i9 + 3) % 4;
                int i11 = cArr5[i9 % 4] * 32718;
                char c7 = cArr6[(i9 + 2) % 4];
                char c8 = (char) ((i11 + c7) % 65535);
                aFk1sSDK.getMonetizationNetwork = c8;
                cArr6[i10] = (char) (((cArr5[i10] * 32718) + c7) / 65535);
                cArr5[i10] = c8;
                cArr7[i9] = (char) ((((cArr4[i9] ^ c8) ^ (copydefault ^ 4316357171685541830L)) ^ ((int) (toString ^ 4316357171685541830L))) ^ ((char) (equals ^ 4316357171685541830L)));
                aFk1sSDK.getMediationNetwork = i9 + 1;
            } else {
                objArr[0] = new String(cArr7);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1iSDK aFd1iSDK) {
        int i6 = hashCode + 87;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.copy();
        } else {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.copy();
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i6 = copy + 73;
        hashCode = i6 % 128;
        int i7 = i6 % 2;
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFAdRevenueData;
        if (i7 != 0) {
            int i8 = 25 / 0;
        }
        return aFd1kSDK;
    }

    @NotNull
    public final AFd1hSDK getRevenue() {
        copy = (hashCode + 121) % 128;
        AFd1hSDK aFd1hSDK = (AFd1hSDK) this.component2.getValue();
        copy = (hashCode + 37) % 128;
        return aFd1hSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1iSDK aFd1iSDK) {
        hashCode = (copy + 23) % 128;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.copydefault();
        int i6 = copy + 119;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 61 / 0;
        }
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        int i6 = hashCode + 111;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long mediationNetwork = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
            if (aFh1dSDK.AFAdRevenueData >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && mediationNetwork != -1) {
                copy = (hashCode + 93) % 128;
                if (mediationNetwork >= currentTimeMillis) {
                    return getCurrencyIso4217Code(aFh1dSDK);
                }
            }
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        long j6 = aFh1dSDK.AFAdRevenueData;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getCurrencyIso4217Code() {
        int i6 = copy + 15;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.getMonetizationNetwork(AFd1iSDK.this);
                }
            });
            int i7 = 44 / 0;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.getMonetizationNetwork(AFd1iSDK.this);
                }
            });
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getRevenue(@NotNull final Throwable th, @NotNull final String str) {
        copy = (hashCode + 97) % 128;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.AFAdRevenueData(AFd1iSDK.this, th, str);
            }
        });
        int i6 = copy + 95;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
    }

    private final Map<String, String> getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        Object[] objArr = new Object[1];
        a((char) (35385 - TextUtils.indexOf("", "")), "蛾덙㧛\uef8a", "裘ꁾ뾯￤뎲", "\u0000\u0000\u0000\u0000", ImageFormat.getBitsPerPixel(0) - 609003129, objArr);
        Pair pair = TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = TuplesKt.to("model", Build.MODEL);
        Pair pair3 = TuplesKt.to("app_id", AFAdRevenueData().getMonetizationNetwork.AFAdRevenueData.getPackageName());
        Pair pair4 = TuplesKt.to("p_ex", new AFb1aSDK().getMediationNetwork());
        Pair pair5 = TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = TuplesKt.to("sdk", this.areAllFieldsValid);
        AFd1qSDK AFAdRevenueData = AFAdRevenueData();
        Map<String, String> mapOf = MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to("uid", AFb1iSDK.getCurrencyIso4217Code(AFAdRevenueData.getMonetizationNetwork, AFAdRevenueData.getRevenue)), TuplesKt.to("exc_config", aFh1dSDK.getRevenue())});
        hashCode = (copy + 85) % 128;
        return mapOf;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        copy = (hashCode + 81) % 128;
        aFd1iSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.getMediationNetwork(AFd1iSDK.this);
            }
        });
        int i6 = copy + 5;
        hashCode = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        copy = (hashCode + 37) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        component2().getMediationNetwork(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFb1jSDK.getMonetizationNetwork(str, str2))), 2000);
        hashCode = (copy + 3) % 128;
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        copy = (hashCode + 115) % 128;
        int i6 = aFh1dSDK.getMediationNetwork;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1dSDK.getMonetizationNetwork);
        AFd1rSDK aFd1rSDK = (AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this));
        aFd1rSDK.getMonetizationNetwork("af_send_exc_to_server_window", currentTimeMillis);
        aFd1rSDK.AFAdRevenueData("af_send_exc_min", i6);
        copy = (hashCode + 65) % 128;
    }

    private final boolean AFAdRevenueData(AFh1dSDK aFh1dSDK) {
        int mediationNetwork;
        hashCode = (copy + 103) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork2 = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.AFAdRevenueData < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            hashCode = (copy + 85) % 128;
            return false;
        }
        if (mediationNetwork2 != -1) {
            int i6 = copy + 21;
            hashCode = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (mediationNetwork2 >= currentTimeMillis && (mediationNetwork = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_min", -1)) != -1) {
                copy = (hashCode + 63) % 128;
                if (getRevenue().getMediationNetwork() >= mediationNetwork) {
                    return getCurrencyIso4217Code(aFh1dSDK);
                }
            }
            return false;
        }
        return false;
    }

    private final AFf1aSDK getMediationNetwork() {
        return (AFf1aSDK) getRevenue(new Object[]{this}, -1136684343, 1136684347, System.identityHashCode(this));
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        new AFe1vSDK();
        String str = this.areAllFieldsValid;
        String str2 = aFh1dSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean monetizationNetwork = AFe1vSDK.getMonetizationNetwork(str, str2);
        int i6 = copy + 65;
        hashCode = i6 % 128;
        if (i6 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static Map<String, Object> getRevenue(Map<String, ? extends Object> map, List<ExceptionInfo> list) {
        return (Map) getRevenue(new Object[]{map, list}, 563165298, -563165297, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ AFd1kSDK getCurrencyIso4217Code(AFd1iSDK aFd1iSDK) {
        return (AFd1kSDK) getRevenue(new Object[]{aFd1iSDK}, 83028355, -83028355, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getMonetizationNetwork() {
        getRevenue(new Object[]{this}, -1727873549, 1727873552, System.identityHashCode(this));
    }
}
