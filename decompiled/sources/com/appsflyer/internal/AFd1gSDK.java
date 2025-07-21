package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFd1gSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "AFAdRevenueData", "()Z", "Ljava/net/HttpURLConnection;", "getRevenue", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "getMonetizationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/net/HttpURLConnection;J)Z", "getMediationNetwork", "[B", "Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFe1uSDK;", "Ljava/util/Map;", "Z", "I", "()Ljava/lang/String;", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMonitorHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n215#2,2:135\n215#2,2:138\n1#3:137\n*S KotlinDebug\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n*L\n58#1:135,2\n104#1:138,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFd1gSDK {
    public int AFAdRevenueData;

    @Nullable
    public Map<String, String> getCurrencyIso4217Code;

    @NotNull
    public byte[] getMediationNetwork;
    private final boolean getRevenue;

    public AFd1gSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = i6;
        this.getRevenue = true;
    }

    private static String getRevenue(HttpURLConnection p02) {
        InputStream errorStream;
        try {
            errorStream = p02.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.HTTP_CLIENT;
            String message = th.getMessage();
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = p02.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE);
        String joinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        bufferedReader.close();
        return joinToString$default == null ? "" : joinToString$default;
    }

    public final boolean AFAdRevenueData() {
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String revenue = getRevenue();
            Intrinsics.checkNotNullParameter(revenue, "");
            URLConnection openConnection = new URL(revenue).openConnection();
            Intrinsics.checkNotNull(openConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            try {
                boolean AFAdRevenueData = AFAdRevenueData(httpURLConnection2, currentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return AFAdRevenueData;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - currentTimeMillis) + "ms\n\t" + th.getMessage();
                    String monetizationNetwork = getMonetizationNetwork("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getGetRevenue()) {
                        AFLogger.afRDLog(monetizationNetwork);
                    } else {
                        AFLogger.afVerboseLog(monetizationNetwork);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th2) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    /* renamed from: getCurrencyIso4217Code */
    public abstract AFe1uSDK getAFAdRevenueData();

    @JvmName(name = "getMediationNetwork")
    /* renamed from: getMediationNetwork, reason: from getter */
    public boolean getGetRevenue() {
        return this.getRevenue;
    }

    @NotNull
    public abstract String getMonetizationNetwork(@NotNull String str);

    @JvmName(name = "getRevenue")
    @NotNull
    public abstract String getRevenue();

    private final boolean AFAdRevenueData(HttpURLConnection httpURLConnection, long j6) {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.getMediationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        String monetizationNetwork = getMonetizationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getGetRevenue()) {
            AFLogger.afRDLog(monetizationNetwork);
        } else {
            AFLogger.afVerboseLog(monetizationNetwork);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getAFAdRevenueData().getMediationNetwork);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getMediationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, ConstantsKt.DEFAULT_BUFFER_SIZE);
        bufferedOutputStream.write(this.getMediationNetwork);
        bufferedOutputStream.close();
        String revenue = getRevenue(httpURLConnection);
        long currentTimeMillis = System.currentTimeMillis() - j6;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + revenue + "\n\ttook " + currentTimeMillis + "ms";
        String monetizationNetwork2 = getMonetizationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getGetRevenue()) {
            AFLogger.afRDLog(monetizationNetwork2);
        } else {
            AFLogger.afVerboseLog(monetizationNetwork2);
        }
        return AFe1xSDK.getCurrencyIso4217Code(httpURLConnection);
    }
}
