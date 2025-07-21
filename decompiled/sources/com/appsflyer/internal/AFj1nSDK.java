package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1nSDK implements SensorEventListener {
    private double AFAdRevenueData;
    private long areAllFieldsValid;

    @NonNull
    private final Executor component1;
    private final float[][] component2 = new float[2];
    private final long[] component4 = new long[2];

    @NonNull
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;

    @NonNull
    private final String getMonetizationNetwork;
    private final int getRevenue;

    public AFj1nSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getRevenue = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component1 = executorService;
    }

    @NonNull
    private static List<Float> AFAdRevenueData(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f6 : fArr) {
            arrayList.add(Float.valueOf(f6));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H_, reason: merged with bridge method [inline-methods] */
    public void I_(SensorEvent sensorEvent) {
        long j6 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = copyOf;
            this.component4[1] = currentTimeMillis;
            this.AFAdRevenueData = getMediationNetwork(fArr3, copyOf);
            return;
        }
        if (50000000 <= j6 - this.areAllFieldsValid) {
            this.areAllFieldsValid = j6;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = currentTimeMillis;
                return;
            }
            double mediationNetwork = getMediationNetwork(fArr3, fArr);
            if (mediationNetwork > this.AFAdRevenueData) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = currentTimeMillis;
                this.AFAdRevenueData = mediationNetwork;
            }
        }
    }

    private static double getMediationNetwork(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d6 = 0.0d;
        for (int i6 = 0; i6 < min; i6++) {
            d6 += StrictMath.pow(fArr[i6] - fArr2[i6], 2.0d);
        }
        return Math.sqrt(d6);
    }

    private boolean getRevenue(int i6, @NonNull String str, @NonNull String str2) {
        return this.getMediationNetwork == i6 && this.getCurrencyIso4217Code.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getRevenue(aFj1nSDK.getMediationNetwork, aFj1nSDK.getCurrencyIso4217Code, aFj1nSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i6) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component1.execute(new Runnable() { // from class: com.appsflyer.internal.D
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1nSDK.this.I_(sensorEvent);
                }
            });
        } else {
            I_(sensorEvent);
        }
    }

    private boolean AFAdRevenueData() {
        return this.component2[0] != null;
    }

    @NonNull
    private Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component2[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFAdRevenueData(fArr));
        }
        float[] fArr2 = this.component2[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFAdRevenueData(fArr2));
        }
        return concurrentHashMap;
    }

    public final void getMediationNetwork(@NonNull Map<AFj1nSDK, Map<String, Object>> map, boolean z6) {
        if (AFAdRevenueData()) {
            map.put(this, getRevenue());
            if (z6) {
                int length = this.component2.length;
                for (int i6 = 0; i6 < length; i6++) {
                    this.component2[i6] = null;
                }
                int length2 = this.component4.length;
                for (int i7 = 0; i7 < length2; i7++) {
                    this.component4[i7] = 0;
                }
                this.AFAdRevenueData = 0.0d;
                this.areAllFieldsValid = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, getRevenue());
    }
}
