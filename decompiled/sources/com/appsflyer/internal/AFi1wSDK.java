package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public enum AFi1wSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
