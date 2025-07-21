package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1kSDK;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1kSDK<String> getRevenue;

    public ParsingException(String str, Throwable th, @NonNull AFe1kSDK<String> aFe1kSDK) {
        super(str, th);
        this.getRevenue = aFe1kSDK;
    }

    @NonNull
    public AFe1kSDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
