package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import com.appsflyer.internal.AFj1sSDK;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1pSDK extends AFi1bSDK {
    private final AFd1kSDK getCurrencyIso4217Code;

    public AFj1pSDK(Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        AFc1dSDK<Map<String, Object>> aFc1dSDK = new AFc1dSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1pSDK.5
            private static void F_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j6 = cursor.getLong(columnIndex);
                if (j6 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j6));
            }

            private static void G_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r3 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getRevenue.getPackageManager().resolveContentProvider(r10.AFAdRevenueData, 128)).packageName;
                r10.getMonetizationNetwork.getMediationNetwork.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1qSDK.AFAdRevenueData(r10.getRevenue, r0)));
                r10.getMonetizationNetwork.getMediationNetwork.put("api_ver_name", com.appsflyer.internal.AFb1qSDK.getMediationNetwork(r10.getRevenue, r0));
                r10.getMonetizationNetwork.getRevenue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.getMonetizationNetwork.getMediationNetwork;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFc1dSDK
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.Map<java.lang.String, java.lang.Object> getMonetizationNetwork() {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1pSDK.AnonymousClass5.getMonetizationNetwork():java.util.Map");
            }
        };
        AFd1rSDK revenue = this.getCurrencyIso4217Code.getRevenue();
        AFb1rSDK.getRevenue();
        if (AFb1rSDK.getMediationNetwork(revenue, false) > 0 || !aFc1dSDK.getCurrencyIso4217Code()) {
            return;
        }
        aFc1dSDK.getCurrencyIso4217Code.execute(aFc1dSDK.getMediationNetwork);
        this.component1 = System.currentTimeMillis();
        this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1sSDK.AnonymousClass1());
    }
}
