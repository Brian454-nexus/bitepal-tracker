package com.appsflyer.internal.components.network.http;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface ResponseNetwork<Body> {
    @NonNull
    Body getBody();

    List<String> getHeaderField(String str);

    int getStatusCode();

    boolean isSuccessful();
}
