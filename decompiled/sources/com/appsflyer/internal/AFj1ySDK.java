package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1ySDK implements AFj1wSDK {
    private static ProviderInfo C_(Context context) {
        PackageManager.ComponentInfoFlags of;
        ProviderInfo resolveContentProvider;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
            }
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ComponentInfoFlags.of(0L);
            resolveContentProvider = packageManager.resolveContentProvider("com.huawei.appmarket.commondata", of);
            return resolveContentProvider;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final boolean getCurrencyIso4217Code(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C_(context) != null;
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final boolean getRevenue(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo C_ = C_(context);
        if (C_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) C_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.REFERRER;
            String message = th.getMessage();
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            return false;
        }
    }
}
