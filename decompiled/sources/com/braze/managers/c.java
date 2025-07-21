package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.StringUtils;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract /* synthetic */ class c {
    public static SharedPreferences a(Context context, String str, String str2, StringBuilder sb, int i6) {
        sb.append(StringUtils.getCacheFileSuffix(context, str, str2));
        return context.getSharedPreferences(sb.toString(), i6);
    }
}
