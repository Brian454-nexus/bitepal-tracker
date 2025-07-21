package com.braze.communication;

import com.braze.support.BrazeLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f12110a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f12111b;

    static {
        try {
            f12111b = new f();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12110a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Q3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.g.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Exception initializing static TLS socket factory.";
    }

    public static final String b() {
        return "Exception setting TLS socket factory on url connection.";
    }

    public final HttpURLConnection a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection openConnection = url.openConnection();
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                f fVar = f12111b;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    fVar = null;
                }
                httpsURLConnection.setSSLSocketFactory(fVar);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Q3.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.communication.g.b();
                    }
                }, 4, (Object) null);
            }
        }
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
