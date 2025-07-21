package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1nSDK;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class HttpException extends IOException {
    private final AFe1nSDK AFAdRevenueData;

    public HttpException(@NonNull Throwable th, @NonNull AFe1nSDK aFe1nSDK) {
        super(th.getMessage(), th);
        this.AFAdRevenueData = aFe1nSDK;
    }

    @NonNull
    public AFe1nSDK getMetrics() {
        return this.AFAdRevenueData;
    }
}
