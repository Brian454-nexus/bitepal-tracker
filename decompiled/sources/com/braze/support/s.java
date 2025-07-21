package com.braze.support;

import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f13003a = new s();

    public static final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{com.amazon.a.a.o.b.as, key}).getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            return new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE).readLine();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f13003a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.y1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.s.a();
                }
            }, 4, (Object) null);
            return "";
        }
    }

    public static final String a() {
        return "Caught exception while trying to read BrazeLogger tag from system properties.";
    }
}
