package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1vSDK extends AFi1cSDK {

    @NotNull
    private final AFj1xSDK areAllFieldsValid;

    @NotNull
    private final Runnable component4;

    @Nullable
    private String copy;

    @NotNull
    private final AFd1qSDK getCurrencyIso4217Code;

    @NotNull
    private final ExecutorService getRevenue;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1xSDK.values().length];
            try {
                iArr[AFj1xSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1xSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1xSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFj1vSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFd1qSDK r3, @org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r4, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFj1xSDK r5, @org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull java.lang.Runnable r7) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int[] r0 = com.appsflyer.internal.AFj1qSDK.AFa1uSDK.getMonetizationNetwork
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 != r1) goto L25
            java.lang.String r0 = "facebook_lite"
            goto L30
        L25:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L2b:
            java.lang.String r0 = "instagram"
            goto L30
        L2e:
            java.lang.String r0 = "facebook"
        L30:
            java.lang.String r1 = "app"
            r2.<init>(r1, r0, r3, r6)
            r2.getCurrencyIso4217Code = r3
            r2.getRevenue = r4
            r2.areAllFieldsValid = r5
            r2.component4 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1vSDK.<init>(com.appsflyer.internal.AFd1qSDK, java.util.concurrent.ExecutorService, com.appsflyer.internal.AFj1xSDK, java.lang.Runnable, java.lang.Runnable):void");
    }

    private final boolean AFAdRevenueData(Context context) {
        int i6 = AFa1ySDK.getMediationNetwork[this.areAllFieldsValid.ordinal()];
        if (i6 == 1) {
            return getRevenue(context);
        }
        if (i6 == 2) {
            return getCurrencyIso4217Code(context);
        }
        if (i6 == 3) {
            return component4(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean component4(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getMonetizationNetwork(android.content.Context r12) {
        /*
            r11 = this;
            boolean r0 = r11.getMonetizationNetwork()
            r1 = 0
            if (r0 != 0) goto L14
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r3 = com.appsflyer.internal.AFh1vSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by counter."
            r5 = 0
            com.appsflyer.internal.AFh1uSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        L14:
            com.appsflyer.internal.AFd1qSDK r0 = r11.getCurrencyIso4217Code
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.getRevenue(r2)
            java.lang.String r2 = "fb"
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r0, r2)
            goto L27
        L26:
            r0 = r3
        L27:
            if (r0 == 0) goto L2f
            int r4 = r0.length()
            if (r4 != 0) goto L3c
        L2f:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r6 = com.appsflyer.internal.AFh1vSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id Manifest metadata is not found."
            r8 = 0
            com.appsflyer.internal.AFh1uSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L3c:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFd1qSDK r0 = r11.getCurrencyIso4217Code
            java.lang.String r4 = "facebook_application_id"
            java.lang.String r0 = r0.AFAdRevenueData(r4)
            if (r0 == 0) goto L4d
            java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r0, r2)
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L56
            int r4 = r0.length()
            if (r4 != 0) goto L63
        L56:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r6 = com.appsflyer.internal.AFh1vSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id string resource is not found."
            r8 = 0
            com.appsflyer.internal.AFh1uSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L63:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFd1qSDK r0 = r11.getCurrencyIso4217Code
            java.lang.String r4 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.getRevenue(r4)
            if (r0 == 0) goto L74
            java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r0, r2)
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 == 0) goto L7d
            int r2 = r0.length()
            if (r2 != 0) goto L8a
        L7d:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r5 = com.appsflyer.internal.AFh1vSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "AF Facebook app id Manifest metadata is not found."
            r7 = 0
            com.appsflyer.internal.AFh1uSDK.d$default(r4, r5, r6, r7, r8, r9)
            r0 = r3
        L8a:
            if (r0 != 0) goto L8d
            goto L8e
        L8d:
            r3 = r0
        L8e:
            r11.copy = r3
            if (r3 != 0) goto L9f
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r5 = com.appsflyer.internal.AFh1vSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "Referrer collection disallowed by missing Facebook app id."
            r7 = 0
            com.appsflyer.internal.AFh1uSDK.d$default(r4, r5, r6, r7, r8, r9)
            return r1
        L9f:
            boolean r12 = r11.AFAdRevenueData(r12)
            if (r12 != 0) goto Lb2
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1vSDK r3 = com.appsflyer.internal.AFh1vSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by missing content providers."
            r5 = 0
            com.appsflyer.internal.AFh1uSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        Lb2:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1vSDK.getMonetizationNetwork(android.content.Context):boolean");
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    @SuppressLint({"NewApi"})
    public final void getMediationNetwork(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.L
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1vSDK.getRevenue(AFj1vSDK.this, context);
                }
            });
        } else {
            this.component4.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0247, code lost:
    
        if (r20 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0232, code lost:
    
        r20.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0230, code lost:
    
        if (r20 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0277, code lost:
    
        if (r20 == null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:3:0x002b, B:7:0x003e, B:9:0x0044, B:15:0x0104, B:80:0x0072, B:82:0x0084, B:83:0x0089, B:84:0x008a, B:86:0x0090, B:87:0x00b5, B:88:0x00c5, B:90:0x00cb, B:91:0x00f0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void getRevenue(com.appsflyer.internal.AFj1vSDK r26, android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1vSDK.getRevenue(com.appsflyer.internal.AFj1vSDK, android.content.Context):void");
    }
}
