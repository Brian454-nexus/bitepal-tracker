package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1mSDK extends AFc1dSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public String getMonetizationNetwork() {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.getRevenue.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFAdRevenueData);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("aid"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final /* synthetic */ String AFAdRevenueData() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }

    public final String getMediationNetwork() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }
}
