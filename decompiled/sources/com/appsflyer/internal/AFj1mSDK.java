package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1mSDK implements AFj1oSDK {
    private static final BitSet component1;
    final Object AFAdRevenueData;
    private final Map<AFj1nSDK, Map<String, Object>> areAllFieldsValid;
    private final ExecutorService component2;
    private final SensorManager component3;
    private final Map<AFj1nSDK, AFj1nSDK> component4;
    private final Runnable copydefault;
    final Handler getCurrencyIso4217Code;
    boolean getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Runnable getRevenue;
    private boolean hashCode;

    /* renamed from: com.appsflyer.internal.AFj1mSDK$1 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1mSDK.this.AFAdRevenueData) {
                try {
                    AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                    if (aFj1mSDK.getMediationNetwork) {
                        aFj1mSDK.getCurrencyIso4217Code.removeCallbacks(aFj1mSDK.getRevenue);
                        AFj1mSDK aFj1mSDK2 = AFj1mSDK.this;
                        aFj1mSDK2.getCurrencyIso4217Code.removeCallbacks(aFj1mSDK2.getMonetizationNetwork);
                        AFj1mSDK.this.AFAdRevenueData();
                        AFj1mSDK.this.getMediationNetwork = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFj1mSDK$5 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1mSDK.this.AFAdRevenueData) {
                AFj1mSDK.this.getMonetizationNetwork();
                AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                aFj1mSDK.getCurrencyIso4217Code.postDelayed(aFj1mSDK.getMonetizationNetwork, 150L);
                AFj1mSDK.this.getMediationNetwork = true;
            }
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        component1 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1mSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFAdRevenueData = new Object();
        BitSet bitSet = component1;
        this.component4 = new HashMap(bitSet.size());
        this.areAllFieldsValid = new ConcurrentHashMap(bitSet.size());
        this.getRevenue = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.5
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.AFAdRevenueData) {
                    AFj1mSDK.this.getMonetizationNetwork();
                    AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                    aFj1mSDK.getCurrencyIso4217Code.postDelayed(aFj1mSDK.getMonetizationNetwork, 150L);
                    AFj1mSDK.this.getMediationNetwork = true;
                }
            }
        };
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.B
            @Override // java.lang.Runnable
            public final void run() {
                AFj1mSDK.this.component3();
            }
        };
        this.copydefault = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.AFAdRevenueData) {
                    try {
                        AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                        if (aFj1mSDK.getMediationNetwork) {
                            aFj1mSDK.getCurrencyIso4217Code.removeCallbacks(aFj1mSDK.getRevenue);
                            AFj1mSDK aFj1mSDK2 = AFj1mSDK.this;
                            aFj1mSDK2.getCurrencyIso4217Code.removeCallbacks(aFj1mSDK2.getMonetizationNetwork);
                            AFj1mSDK.this.AFAdRevenueData();
                            AFj1mSDK.this.getMediationNetwork = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.component3 = sensorManager;
        this.getCurrencyIso4217Code = handler;
        this.component2 = executorService;
    }

    private static boolean AFAdRevenueData(int i6) {
        return i6 >= 0 && component1.get(i6);
    }

    public /* synthetic */ void areAllFieldsValid() {
        try {
            if (!this.component4.isEmpty()) {
                for (AFj1nSDK aFj1nSDK : this.component4.values()) {
                    this.component3.unregisterListener(aFj1nSDK);
                    aFj1nSDK.getMediationNetwork(this.areAllFieldsValid, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.hashCode = false;
    }

    @NonNull
    private List<Map<String, Object>> component1() {
        synchronized (this.AFAdRevenueData) {
            try {
                Iterator<AFj1nSDK> it = this.component4.values().iterator();
                while (it.hasNext()) {
                    it.next().getMediationNetwork(this.areAllFieldsValid, true);
                }
                if (this.areAllFieldsValid.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    private List<Map<String, Object>> component2() {
        synchronized (this.AFAdRevenueData) {
            try {
                if (!this.component4.isEmpty() && this.hashCode) {
                    Iterator<AFj1nSDK> it = this.component4.values().iterator();
                    while (it.hasNext()) {
                        it.next().getMediationNetwork(this.areAllFieldsValid, false);
                    }
                }
                if (this.areAllFieldsValid.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void component3() {
        synchronized (this.AFAdRevenueData) {
            this.getCurrencyIso4217Code.post(new A(this));
        }
    }

    public /* synthetic */ void component4() {
        try {
            for (Sensor sensor : this.component3.getSensorList(-1)) {
                if (AFAdRevenueData(sensor.getType())) {
                    AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component2);
                    if (!this.component4.containsKey(aFj1nSDK)) {
                        this.component4.put(aFj1nSDK, aFj1nSDK);
                    }
                    this.component3.registerListener(this.component4.get(aFj1nSDK), sensor, 1, this.getCurrencyIso4217Code);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.hashCode = true;
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    @NonNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> component2 = component2();
        if (!component2.isEmpty()) {
            concurrentHashMap.put("sensors", component2);
            return concurrentHashMap;
        }
        List<Map<String, Object>> component12 = component1();
        if (!component12.isEmpty()) {
            concurrentHashMap.put("sensors", component12);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final void getMediationNetwork() {
        this.getCurrencyIso4217Code.post(this.copydefault);
        this.getCurrencyIso4217Code.post(this.getRevenue);
    }

    public final void getMonetizationNetwork() {
        this.getCurrencyIso4217Code.post(new Runnable() { // from class: com.appsflyer.internal.C
            @Override // java.lang.Runnable
            public final void run() {
                AFj1mSDK.this.component4();
            }
        });
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final synchronized void getRevenue() {
        this.getCurrencyIso4217Code.post(this.copydefault);
    }

    public final void AFAdRevenueData() {
        this.getCurrencyIso4217Code.post(new A(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFj1mSDK(@androidx.annotation.NonNull android.content.Context r3, java.util.concurrent.ExecutorService r4) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "internal"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.<init>(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1mSDK.<init>(android.content.Context, java.util.concurrent.ExecutorService):void");
    }
}
