package com.braze.communication;

import android.net.TrafficStats;
import com.braze.support.BrazeLogger;
import com.braze.support.l;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f12070b = (int) TimeUnit.SECONDS.toMillis(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f12071a;

    public b(int i6) {
        this.f12071a = i6;
    }

    public final d a(final com.braze.requests.util.c requestTarget, HashMap requestHeaders, JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        TrafficStats.setThreadStatsTag(1337);
        URL url = requestTarget.f12874c;
        Map emptyMap = MapsKt.emptyMap();
        int i6 = -1;
        try {
            HttpURLConnection a6 = a(url, payload, requestHeaders);
            i6 = a6.getResponseCode();
            Map<String, List<String>> headerFields = a6.getHeaderFields();
            Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
            emptyMap = l.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.a(a6), Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return new d(i6, emptyMap, new JSONObject(readText));
            } finally {
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Q3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.b.a(com.braze.requests.util.c.this);
                }
            }, 4, (Object) null);
            return new d(i6, emptyMap, 4);
        }
    }

    public static final String a(com.braze.requests.util.c cVar) {
        return "Failed request to [" + cVar + ']';
    }

    public final HttpURLConnection a(URL url, JSONObject jSONObject, HashMap hashMap) {
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        byte[] bytes = jSONObject2.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        HttpURLConnection a6 = g.f12110a.a(url);
        for (Map.Entry entry : hashMap.entrySet()) {
            a6.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        a6.setConnectTimeout(f12070b);
        a6.setReadTimeout(this.f12071a);
        a6.setUseCaches(false);
        a6.setInstanceFollowRedirects(false);
        a6.setRequestMethod("POST");
        a6.setDoOutput(true);
        a6.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = a6.getOutputStream();
        try {
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream, null);
            return a6;
        } finally {
        }
    }
}
