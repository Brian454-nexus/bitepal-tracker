package com.dexterous.flutterlocalnotifications.utils;

import androidx.annotation.Keep;

@Keep
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        return Boolean.valueOf(str == null || str.isEmpty());
    }
}
