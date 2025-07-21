package com.amazon.device.iap;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.amazon.a.a;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class PurchasingService extends Service {
    private static final String APPSTORE_SDK_NAME = "Amazon In-App Purchasing Android SDK :2.10.5.0";
    public static final String SDK_VERSION = "2.10.5.0";
    private static final String TAG = "PurchasingService";
    private final IBinder localBinder = new LocalBinder();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class LocalBinder extends Binder {
        private LocalBinder() {
        }

        public PurchasingService getService() {
            return PurchasingService.this;
        }
    }

    public PurchasingService() {
        Log.i(TAG, "Amazon In-App Purchasing Android SDK initializing. SDK Version 2.10.5.0. ");
    }

    public static void enablePendingPurchases() {
        d.f().c();
    }

    public static RequestId getProductData(Set<String> set) {
        return d.f().a(set);
    }

    public static RequestId getPurchaseUpdates(boolean z6) {
        return d.f().a(z6);
    }

    public static RequestId getUserData() {
        return d.f().a(UserDataRequest.newBuilder().build());
    }

    public static void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        d.f().a(str, fulfillmentResult);
    }

    public static RequestId purchase(String str) {
        return d.f().a(str);
    }

    public static void registerListener(Context context, PurchasingListener purchasingListener) {
        a.a(context);
        d.f().a(context, purchasingListener);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.localBinder;
    }

    public static RequestId getUserData(UserDataRequest userDataRequest) {
        return d.f().a(userDataRequest);
    }
}
