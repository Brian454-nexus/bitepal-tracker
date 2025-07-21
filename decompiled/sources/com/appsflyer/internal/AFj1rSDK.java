package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1rSDK extends AFi1cSDK {

    @NotNull
    private final ExecutorService getRevenue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(@NotNull ExecutorService executorService, @NotNull AFd1qSDK aFd1qSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFd1qSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getRevenue = executorService;
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getMonetizationNetwork()) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean E_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    @SuppressLint({"NewApi"})
    public final void getMediationNetwork(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.E
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1rSDK.getMediationNetwork(AFj1rSDK.this, context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x011c, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0107, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void getMediationNetwork(com.appsflyer.internal.AFj1rSDK r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1rSDK.getMediationNetwork(com.appsflyer.internal.AFj1rSDK, android.content.Context):void");
    }
}
