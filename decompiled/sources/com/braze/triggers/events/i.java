package com.braze.triggers.events;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13068d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* renamed from: a, reason: collision with root package name */
    public final long f13069a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13070b;

    /* renamed from: c, reason: collision with root package name */
    public com.braze.models.i f13071c;

    public i() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f13070b = nowInMilliseconds;
        this.f13069a = nowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e6) {
            BrazeLogger.e(f13068d, "Unexpected error decoding Base64 encoded campaign Id " + str, e6);
            return null;
        }
    }
}
