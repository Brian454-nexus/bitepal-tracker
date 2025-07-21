package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "AFAdRevenueData", "()Lorg/json/JSONObject;", "getMonetizationNetwork", "()Ljava/lang/String;", "toString", "getCurrencyIso4217Code", "I", "getRevenue", "getMediationNetwork", "Ljava/lang/String;", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.appsflyer.internal.AFd1fSDK, reason: from toString */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class ExceptionInfo {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata and from toString */
    @NotNull
    public String label;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    int counter;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata and from toString */
    @NotNull
    final String hashName;

    /* renamed from: getRevenue, reason: from kotlin metadata and from toString */
    @NotNull
    public String stackTrace;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK$AFa1zSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1fSDK;", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExceptionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n13579#2,2:95\n*S KotlinDebug\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n*L\n65#1:95,2\n*E\n"})
    /* renamed from: com.appsflyer.internal.AFd1fSDK$AFa1zSDK, reason: from kotlin metadata */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public static ExceptionInfo getMediationNetwork(@NotNull String p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            List<String> split$default = StringsKt.split$default(p02, new String[]{"\n"}, false, 0, 6, (Object) null);
            if (split$default.size() != 4) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            for (String str4 : split$default) {
                if (StringsKt.startsWith$default(str4, "label=", false, 2, (Object) null)) {
                    str = getMonetizationNetwork(str4, "label=");
                } else if (StringsKt.startsWith$default(str4, "hashName=", false, 2, (Object) null)) {
                    str2 = getMonetizationNetwork(str4, "hashName=");
                } else if (StringsKt.startsWith$default(str4, "stackTrace=", false, 2, (Object) null)) {
                    str3 = getMonetizationNetwork(str4, "stackTrace=");
                } else {
                    if (!StringsKt.startsWith$default(str4, "c=", false, 2, (Object) null)) {
                        break;
                    }
                    String substring = str4.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(StringsKt.trim(substring).toString()));
                }
            }
            if (getMediationNetwork(num, str, str2, str3)) {
                return null;
            }
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(str3);
            Intrinsics.checkNotNull(num);
            return new ExceptionInfo(str, str2, str3, num.intValue());
        }

        private static String getMonetizationNetwork(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.trim(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean getMediationNetwork(Integer p02, String... p12) {
            boolean z6 = p02 == null;
            int length = p12.length;
            for (int i6 = 0; i6 < 3; i6++) {
                String str = p12[i6];
                z6 = z6 || str == null || str.length() == 0;
            }
            return z6;
        }
    }

    public ExceptionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.hashName = str2;
        this.stackTrace = str3;
        this.counter = i6;
    }

    @NotNull
    public final JSONObject AFAdRevenueData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.label);
        jSONObject.put("hash_name", this.hashName);
        jSONObject.put("st", this.stackTrace);
        jSONObject.put("c", String.valueOf(this.counter));
        return jSONObject;
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) p02;
        return Intrinsics.areEqual(this.label, exceptionInfo.label) && Intrinsics.areEqual(this.hashName, exceptionInfo.hashName) && Intrinsics.areEqual(this.stackTrace, exceptionInfo.stackTrace) && this.counter == exceptionInfo.counter;
    }

    @NotNull
    public final String getMonetizationNetwork() {
        String str = this.label;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.hashName;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.stackTrace;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + encodeToString + "\nhashName=" + encodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.counter;
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + this.hashName.hashCode()) * 31) + this.stackTrace.hashCode()) * 31) + Integer.hashCode(this.counter);
    }

    @NotNull
    public final String toString() {
        return "ExceptionInfo(label=" + this.label + ", hashName=" + this.hashName + ", stackTrace=" + this.stackTrace + ", counter=" + this.counter + ")";
    }

    public /* synthetic */ ExceptionInfo(String str, String str2, String str3, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i7 & 8) != 0 ? 1 : i6);
    }
}
