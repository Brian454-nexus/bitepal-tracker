package com.appsflyer.internal.connector.purcahse;

import L3.C0554x;
import L3.InterfaceC0525i;
import L3.InterfaceC0548u;
import L3.InterfaceC0550v;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import com.android.billingclient.api.g;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFPurchaseConnectorA1u implements InterfaceC0525i, InterfaceC0550v, AFPurchaseConnectorA1r, AFPurchaseConnectorA1y {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int PurchaseClientBuilder = 0;
    private static int logSubscriptions = 1;
    private static long setSandbox = 1913538383092066235L;
    private AFPurchaseConnectorA1r.AFPurchaseConnectorA1x InAppPurchaseEvent;
    private ScheduledExecutorService equals;
    private final com.android.billingclient.api.a getOneTimePurchaseOfferDetails;
    private final AFPurchaseConnectorA1l getPackageName;
    final SharedPreferences getQuantity;
    private final AFPurchaseConnectorA1v stopObservingTransactions;
    final Context toJsonMap;
    private final InterfaceC0548u startObservingTransactions = new InterfaceC0548u() { // from class: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.5
        @Override // L3.InterfaceC0548u
        public final void onQueryPurchasesResponse(@NonNull d dVar, @NonNull List<Purchase> list) {
            if (dVar.b() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            } else if (!list.isEmpty()) {
                AFPurchaseConnectorA1u.this.getPackageName(list);
            } else {
                AFPurchaseConnectorA1u.this.getQuantity.edit().putBoolean("inapp_purchases_history_processed", true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No history for non-consumed one-time purchases found");
            }
        }
    };
    private final InterfaceC0548u PurchaseClient = new InterfaceC0548u() { // from class: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.1
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int[] getPackageName = {1480127459, 1870905519, -2086726114, -1195519311, -721237928, 1029398052, 1886925259, 513191056, -1623653556, -402706125, -2037654713, 233685496, -1374427459, 130651729, -1313398039, -1738649748, -1699343426, 1532763029};
        private static int getQuantity;

        private static void a(int[] iArr, int i6, Object[] objArr) {
            int length;
            int[] iArr2;
            int i7;
            int length2;
            int[] iArr3;
            int i8;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr4 = getPackageName;
            long j6 = -6033101233399176549L;
            if (iArr4 != null) {
                int i9 = $11 + 79;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                    i8 = 1;
                } else {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                    i8 = 0;
                }
                while (i8 < length2) {
                    int i10 = $10 + 81;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        iArr3[i8] = (int) (iArr4[i8] - 6033101233399176549L);
                        i8 >>= 1;
                    } else {
                        iArr3[i8] = (int) (iArr4[i8] ^ (-6033101233399176549L));
                        i8++;
                    }
                }
                iArr4 = iArr3;
            }
            int length3 = iArr4.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = getPackageName;
            if (iArr6 != null) {
                int i11 = $10 + 107;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i7 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i7 = 0;
                }
                while (i7 < length) {
                    long j7 = j6;
                    iArr2[i7] = (int) (iArr6[i7] ^ j7);
                    i7++;
                    j6 = j7;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i12 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i12 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i6);
                    return;
                }
                int i13 = iArr[i12];
                char c6 = (char) (i13 >> 16);
                cArr[0] = c6;
                char c7 = (char) i13;
                cArr[1] = c7;
                char c8 = (char) (iArr[i12 + 1] >> 16);
                cArr[2] = c8;
                char c9 = (char) iArr[i12 + 1];
                cArr[3] = c9;
                aFPurchaseConnectorA1c.getQuantity = (c6 << 16) + c7;
                aFPurchaseConnectorA1c.toJsonMap = (c8 << 16) + c9;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                int i14 = 0;
                while (i14 < 16) {
                    int i15 = aFPurchaseConnectorA1c.getQuantity ^ iArr5[i14];
                    aFPurchaseConnectorA1c.getQuantity = i15;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i15) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i16 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i16;
                    i14++;
                    $11 = ($10 + 73) % 128;
                }
                int i17 = aFPurchaseConnectorA1c.getQuantity;
                int i18 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i18;
                aFPurchaseConnectorA1c.toJsonMap = i17;
                int i19 = i17 ^ iArr5[16];
                aFPurchaseConnectorA1c.toJsonMap = i19;
                int i20 = i18 ^ iArr5[17];
                aFPurchaseConnectorA1c.getQuantity = i20;
                cArr[0] = (char) (i20 >>> 16);
                cArr[1] = (char) i20;
                cArr[2] = (char) (i19 >>> 16);
                cArr[3] = (char) i19;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                int i21 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i21 * 2] = cArr[0];
                cArr2[(i21 * 2) + 1] = cArr[1];
                cArr2[(i21 * 2) + 2] = cArr[2];
                cArr2[(i21 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i21 + 2;
                $11 = ($10 + 79) % 128;
            }
        }

        @Override // L3.InterfaceC0548u
        public final void onQueryPurchasesResponse(@NonNull d dVar, @NonNull List<Purchase> list) {
            int i6 = getQuantity + 117;
            getOneTimePurchaseOfferDetails = i6 % 128;
            if (i6 % 2 == 0) {
                dVar.b();
                throw null;
            }
            if (dVar.b() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
                return;
            }
            if (list.isEmpty()) {
                getOneTimePurchaseOfferDetails = (getQuantity + 101) % 128;
                SharedPreferences.Editor edit = AFPurchaseConnectorA1u.this.getQuantity.edit();
                Object[] objArr = new Object[1];
                a(new int[]{781822138, 818696279, 1224573440, -2078472429, -624357308, -34214158, -544312192, 273047310, -785581712, -501433753, -78984151, 684984616}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, objArr);
                edit.putBoolean(((String) objArr[0]).intern(), true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No active subscriptions and/or non-consumed one-time purchases found");
                return;
            }
            AFPurchaseConnectorA1u.this.getPackageName(dVar, list, true);
            int i7 = getOneTimePurchaseOfferDetails + 81;
            getQuantity = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 43 / 0;
            }
        }
    };
    private final InterfaceC0548u hashCode = new InterfaceC0548u() { // from class: com.appsflyer.internal.connector.purcahse.a
        @Override // L3.InterfaceC0548u
        public final void onQueryPurchasesResponse(d dVar, List list) {
            AFPurchaseConnectorA1u.this.toJsonMap(dVar, list);
        }
    };
    private boolean autoLogInApps = true;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AFPurchaseConnectorA1x implements AFPurchaseConnectorA1r.AFPurchaseConnectorA1w<com.android.billingclient.api.a> {

        @NonNull
        final InterfaceC0550v getOneTimePurchaseOfferDetails;

        public AFPurchaseConnectorA1x(@NonNull InterfaceC0550v interfaceC0550v) {
            this.getOneTimePurchaseOfferDetails = interfaceC0550v;
        }
    }

    public AFPurchaseConnectorA1u(@NonNull Context context, AFPurchaseConnectorA1x aFPurchaseConnectorA1x, @NonNull SharedPreferences sharedPreferences, @NonNull AFPurchaseConnectorA1l aFPurchaseConnectorA1l) {
        aFPurchaseConnectorA1x = aFPurchaseConnectorA1x == null ? new AFPurchaseConnectorA1x(this) : aFPurchaseConnectorA1x;
        this.toJsonMap = context;
        this.getQuantity = sharedPreferences;
        this.getOneTimePurchaseOfferDetails = com.android.billingclient.api.a.j(AFPurchaseConnectorA1u.this.toJsonMap).f(aFPurchaseConnectorA1x.getOneTimePurchaseOfferDetails).c().a();
        this.getPackageName = aFPurchaseConnectorA1l;
        this.stopObservingTransactions = new AFPurchaseConnectorA1v(this, getQuantity());
    }

    private void equals() {
        logSubscriptions = (PurchaseClientBuilder + 49) % 128;
        try {
            if (this.getQuantity.getBoolean("inapp_purchases_history_processed", false)) {
                return;
            }
            this.getOneTimePurchaseOfferDetails.m(C0554x.a().b("inapp").a(), this.startObservingTransactions);
            logSubscriptions = (PurchaseClientBuilder + 27) % 128;
        } catch (Throwable th) {
            try {
                Object[] objArr = {th};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                Object obj = map.get(-1174844903);
                if (obj == null) {
                    obj = ((Class) AFPurchaseConnectorA1w.getQuantity(70 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 69 - Process.getGidForName(""), (char) View.MeasureSpec.getSize(0))).getMethod("getQuantity", Throwable.class);
                    map.put(-1174844903, obj);
                }
                ((Method) obj).invoke(null, objArr);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th, true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r0.getBoolean(((java.lang.String) r5[0]).intern(), false) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x006e, B:24:0x00b6, B:28:0x0082), top: B:20:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void stopObservingTransactions() {
        /*
            r11 = this;
            int r0 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.PurchaseClientBuilder
            int r0 = r0 + 67
            int r1 = r0 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.logSubscriptions = r1
            int r0 = r0 % 2
            java.lang.String r1 = "搜摽炽\uf4c5䆏\uaacc䧨⚍瑓\ue4e0姜㛭䐠풂榴ۊ名쑌祷ᘵⓎ둮।昁㒱ꐁᤧ"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L2e
            android.content.SharedPreferences r0 = r11.getQuantity     // Catch: java.lang.Throwable -> L2c
            int r4 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + 83
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            a(r1, r4, r5)     // Catch: java.lang.Throwable -> L2c
            r1 = r5[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.getBoolean(r1, r3)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L58
            goto L49
        L2c:
            r0 = move-exception
            goto L6e
        L2e:
            android.content.SharedPreferences r0 = r11.getQuantity     // Catch: java.lang.Throwable -> L2c
            int r4 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 >> 8
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            a(r1, r4, r5)     // Catch: java.lang.Throwable -> L2c
            r1 = r5[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.getBoolean(r1, r3)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L58
        L49:
            int r0 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.logSubscriptions
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.PurchaseClientBuilder = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L57
            r0 = 5
            int r0 = r0 / r3
        L57:
            return
        L58:
            com.android.billingclient.api.a r0 = r11.getOneTimePurchaseOfferDetails     // Catch: java.lang.Throwable -> L2c
            L3.x$a r1 = L3.C0554x.a()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "subs"
            L3.x$a r1 = r1.b(r4)     // Catch: java.lang.Throwable -> L2c
            L3.x r1 = r1.a()     // Catch: java.lang.Throwable -> L2c
            L3.u r4 = r11.PurchaseClient     // Catch: java.lang.Throwable -> L2c
            r0.m(r1, r4)     // Catch: java.lang.Throwable -> L2c
            return
        L6e:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lc2
            java.util.Map r4 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.PurchaseClientCompanion     // Catch: java.lang.Throwable -> Lc2
            r5 = -1174844903(0xffffffffb9f94a19, float:-4.7548188E-4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.Throwable -> Lc2
            if (r6 == 0) goto L82
            goto Lb6
        L82:
            java.lang.String r6 = ""
            r7 = 48
            int r6 = android.text.TextUtils.indexOf(r6, r7, r3, r3)     // Catch: java.lang.Throwable -> Lc2
            int r6 = 69 - r6
            long r7 = android.widget.ExpandableListView.getPackedPositionForGroup(r3)     // Catch: java.lang.Throwable -> Lc2
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r7 = 70 - r7
            int r3 = android.graphics.ImageFormat.getBitsPerPixel(r3)     // Catch: java.lang.Throwable -> Lc2
            int r3 = (-1) - r3
            char r3 = (char) r3     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r3 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.getQuantity(r6, r7, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = "getQuantity"
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> Lc2
            java.lang.reflect.Method r6 = r3.getMethod(r6, r7)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lc2
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> Lc2
        Lb6:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> Lc2
            r3 = 0
            r6.invoke(r3, r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "[PurchaseConnector]: Failed to log purchases history"
            com.appsflyer.AFLogger.afErrorLog(r1, r0, r2)
            return
        Lc2:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto Lca
            throw r1
        Lca:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.stopObservingTransactions():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void toJsonMap(d dVar, List list) {
        if (dVar.b() != 0) {
            int i6 = PurchaseClientBuilder + 31;
            logSubscriptions = i6 % 128;
            if (i6 % 2 != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
                return;
            } else {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
                throw null;
            }
        }
        getPackageName(dVar, list, false);
        int i7 = PurchaseClientBuilder + 63;
        logSubscriptions = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 66 / 0;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void InAppPurchaseEvent() {
        logSubscriptions = (PurchaseClientBuilder + 91) % 128;
        if (this.autoLogInApps) {
            this.autoLogInApps = false;
            this.getOneTimePurchaseOfferDetails.p(this);
            Context context = this.toJsonMap;
            if (context instanceof Application) {
                int i6 = logSubscriptions + 39;
                PurchaseClientBuilder = i6 % 128;
                if (i6 % 2 != 0) {
                    ((Application) context).registerActivityLifecycleCallbacks(this.stopObservingTransactions);
                    throw null;
                }
                ((Application) context).registerActivityLifecycleCallbacks(this.stopObservingTransactions);
            }
        }
        int i7 = logSubscriptions + 5;
        PurchaseClientBuilder = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 46 / 0;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public boolean getOneTimePurchaseOfferDetails() {
        int i6 = logSubscriptions;
        boolean z6 = this.autoLogInApps;
        int i7 = i6 + 57;
        PurchaseClientBuilder = i7 % 128;
        if (i7 % 2 == 0) {
            return z6;
        }
        throw null;
    }

    public void getPackageName(List<Purchase> list) {
        HashSet hashSet = new HashSet();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            PurchaseClientBuilder = (logSubscriptions + 73) % 128;
            hashSet.add(it.next().j());
            logSubscriptions = (PurchaseClientBuilder + 39) % 128;
        }
        this.getPackageName.toJsonMap(hashSet);
        this.getQuantity.edit().putBoolean("inapp_purchases_history_processed", true).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r0 = r4.equals;
        r2 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.logSubscriptions + 5;
        com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.PurchaseClientBuilder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r2 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001e, code lost:
    
        r0 = java.util.concurrent.Executors.newScheduledThreadPool(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r4.equals = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        if (r4.equals == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r4.equals == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.concurrent.ScheduledExecutorService getQuantity() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.PurchaseClientBuilder     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 1
            int r1 = r0 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.logSubscriptions = r1     // Catch: java.lang.Throwable -> L18
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L1a
            java.util.concurrent.ScheduledExecutorService r0 = r4.equals     // Catch: java.lang.Throwable -> L18
            r2 = 20
            int r2 = r2 / 0
            if (r0 != 0) goto L29
            goto L1e
        L16:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            goto L40
        L1a:
            java.util.concurrent.ScheduledExecutorService r0 = r4.equals     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L29
        L1e:
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L18
            r4.equals = r0     // Catch: java.lang.Throwable -> L18
        L29:
            java.util.concurrent.ScheduledExecutorService r0 = r4.equals     // Catch: java.lang.Throwable -> L18
            int r2 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.logSubscriptions     // Catch: java.lang.Throwable -> L18
            int r2 = r2 + 5
            int r3 = r2 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.PurchaseClientBuilder = r3     // Catch: java.lang.Throwable -> L18
            int r2 = r2 % r1
            if (r2 == 0) goto L3e
            r1 = 68
            int r1 = r1 / 0
            monitor-exit(r4)
            return r0
        L3c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L3e:
            monitor-exit(r4)
            return r0
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.getQuantity():java.util.concurrent.ScheduledExecutorService");
    }

    @Override // L3.InterfaceC0525i
    public void onBillingServiceDisconnected() {
        PurchaseClientBuilder = (logSubscriptions + 47) % 128;
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingServiceDisconnected");
        int i6 = PurchaseClientBuilder + 1;
        logSubscriptions = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // L3.InterfaceC0525i
    public void onBillingSetupFinished(@NonNull d dVar) {
        PurchaseClientBuilder = (logSubscriptions + 91) % 128;
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingSetupFinished");
        if (dVar.b() != 0) {
            return;
        }
        stopObservingTransactions();
        equals();
        int i6 = PurchaseClientBuilder + 3;
        logSubscriptions = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
    }

    @Override // L3.InterfaceC0550v
    public void onPurchasesUpdated(@NonNull d dVar, List<Purchase> list) {
        PurchaseClientBuilder = (logSubscriptions + 17) % 128;
        AFLogger.afDebugLog("[PurchaseConnector]: onPurchasesUpdated");
        getPackageName(dVar, list, false);
        int i6 = logSubscriptions + 9;
        PurchaseClientBuilder = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            if (r12 == 0) goto L18
            int r0 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.$11
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.$10 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            char[] r12 = r12.toCharArray()
            goto L18
        L13:
            r12.toCharArray()
            r12 = 0
            throw r12
        L18:
            char[] r12 = (char[]) r12
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2z r0 = new com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2z
            r0.<init>()
            long r1 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.setSandbox
            r3 = 7848782090230080433(0x6cec79b9f79ca3b1, double:4.9081538215191364E216)
            long r1 = r1 ^ r3
            char[] r12 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails(r1, r12, r13)
            r13 = 4
            r0.getPackageName = r13
        L2e:
            int r1 = r0.getPackageName
            int r2 = r12.length
            if (r1 >= r2) goto L5d
            int r2 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.$11
            int r2 = r2 + 63
            int r2 = r2 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.$10 = r2
            int r5 = r1 + (-4)
            r0.getOneTimePurchaseOfferDetails = r5
            char r6 = r12[r1]
            int r7 = r1 % 4
            char r7 = r12[r7]
            r6 = r6 ^ r7
            long r6 = (long) r6
            long r8 = (long) r5
            long r10 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.setSandbox
            long r10 = r10 ^ r3
            long r8 = r8 * r10
            long r5 = r6 ^ r8
            int r5 = (int) r5
            char r5 = (char) r5
            r12[r1] = r5
            int r1 = r1 + 1
            r0.getPackageName = r1
            int r2 = r2 + 39
            int r2 = r2 % 128
            com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.$11 = r2
            goto L2e
        L5d:
            java.lang.String r0 = new java.lang.String
            int r1 = r12.length
            int r1 = r1 - r13
            r0.<init>(r12, r13, r1)
            r12 = 0
            r14[r12] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.a(java.lang.String, int, java.lang.Object[]):void");
    }

    private void getOneTimePurchaseOfferDetails(@NonNull String str, List<String> list, List<Purchase> list2, boolean z6) {
        int i6 = logSubscriptions + 11;
        PurchaseClientBuilder = i6 % 128;
        if (i6 % 2 == 0) {
            if ((!"subs".equals(str)) && !"inapp".equals(str)) {
                StringBuilder sb = new StringBuilder("[PurchaseConnector]: ");
                sb.append(str);
                sb.append(" SKU type is illegal");
                AFLogger.afWarnLog(sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder("[PurchaseConnector]: Querying Sku details:\n\ttype: ");
            sb2.append(str);
            sb2.append("\n\tSkus: ");
            try {
                Object[] objArr = {list, ", "};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                Object obj = map.get(-1211899119);
                if (obj == null) {
                    obj = ((Class) AFPurchaseConnectorA1w.getQuantity(TextUtils.getTrimmedLength("") + 70, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 70, (char) KeyEvent.keyCodeFromString(""))).getMethod("getPackageName", List.class, CharSequence.class);
                    map.put(-1211899119, obj);
                }
                sb2.append((String) ((Method) obj).invoke(null, objArr));
                AFLogger.afDebugLog(sb2.toString());
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = list.iterator();
                logSubscriptions = (PurchaseClientBuilder + 57) % 128;
                while (it.hasNext()) {
                    int i7 = PurchaseClientBuilder + 35;
                    logSubscriptions = i7 % 128;
                    if (i7 % 2 != 0) {
                        arrayList.add(g.b.a().b(it.next()).c(str).a());
                    } else {
                        arrayList.add(g.b.a().b(it.next()).c(str).a());
                        throw null;
                    }
                }
                g a6 = g.a().b(arrayList).a();
                AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x = this.InAppPurchaseEvent;
                if (aFPurchaseConnectorA1x == null) {
                    AFLogger.afWarnLog("[PurchaseConnector]: Skipping queryProductDetailsAsync because BillingUpdatesListener is null");
                    return;
                }
                this.getOneTimePurchaseOfferDetails.k(a6, new AFPurchaseConnectorA1n(str, aFPurchaseConnectorA1x, list2, z6));
                int i8 = logSubscriptions + 83;
                PurchaseClientBuilder = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        "subs".equals(str);
        throw null;
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void toJsonMap(AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x) {
        int i6 = PurchaseClientBuilder + 119;
        int i7 = i6 % 128;
        logSubscriptions = i7;
        if (i6 % 2 == 0) {
            this.InAppPurchaseEvent = aFPurchaseConnectorA1x;
            int i8 = 76 / 0;
        } else {
            this.InAppPurchaseEvent = aFPurchaseConnectorA1x;
        }
        int i9 = i7 + 55;
        PurchaseClientBuilder = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void getPackageName() {
        logSubscriptions = (PurchaseClientBuilder + 15) % 128;
        if (!this.autoLogInApps) {
            this.autoLogInApps = true;
            this.getOneTimePurchaseOfferDetails.d();
        }
        int i6 = PurchaseClientBuilder + 19;
        logSubscriptions = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1y
    public void toJsonMap() {
        logSubscriptions = (PurchaseClientBuilder + 101) % 128;
        SharedPreferences sharedPreferences = this.getQuantity;
        Object[] objArr = new Object[1];
        a("搜摽炽\uf4c5䆏\uaacc䧨⚍瑓\ue4e0姜㛭䐠풂榴ۊ名쑌祷ᘵⓎ둮।昁㒱ꐁᤧ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        if (sharedPreferences.getBoolean(((String) objArr[0]).intern(), false)) {
            int i6 = PurchaseClientBuilder + 57;
            logSubscriptions = i6 % 128;
            if (i6 % 2 != 0) {
                this.getOneTimePurchaseOfferDetails.m(C0554x.a().b("subs").a(), this.hashCode);
                PurchaseClientBuilder = (logSubscriptions + 51) % 128;
            } else {
                this.getOneTimePurchaseOfferDetails.m(C0554x.a().b("subs").a(), this.hashCode);
                throw null;
            }
        }
        if (this.getQuantity.getBoolean("inapp_purchases_history_processed", false)) {
            this.getOneTimePurchaseOfferDetails.m(C0554x.a().b("inapp").a(), this.hashCode);
            logSubscriptions = (PurchaseClientBuilder + 75) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b A[Catch: all -> 0x01d5, TryCatch #2 {all -> 0x01d5, blocks: (B:71:0x0187, B:74:0x01c9, B:78:0x019b), top: B:70:0x0187 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getPackageName(com.android.billingclient.api.d r20, java.util.List<com.android.billingclient.api.Purchase> r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.getPackageName(com.android.billingclient.api.d, java.util.List, boolean):void");
    }
}
