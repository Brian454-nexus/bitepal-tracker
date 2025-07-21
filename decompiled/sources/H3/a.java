package H3;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2198b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f2199c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2200d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2201e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDateFormat f2202f;

    public a(String apiKey, String events, Integer num, String str, long j6) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f2197a = apiKey;
        this.f2198b = events;
        this.f2199c = num;
        this.f2200d = str;
        this.f2201e = j6;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.f2202f = simpleDateFormat;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"api_key\":\"" + this.f2197a + "\",\"client_upload_time\":\"" + b() + "\",\"events\":" + this.f2198b);
        if (this.f2199c != null) {
            sb.append(",\"options\":{\"min_id_length\":" + this.f2199c + '}');
        }
        if (this.f2200d != null) {
            sb.append(",\"request_metadata\":{\"sdk\":" + this.f2200d + '}');
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final String b() {
        String format = this.f2202f.format(new Date(this.f2201e));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f2197a, aVar.f2197a) && Intrinsics.areEqual(this.f2198b, aVar.f2198b) && Intrinsics.areEqual(this.f2199c, aVar.f2199c) && Intrinsics.areEqual(this.f2200d, aVar.f2200d) && this.f2201e == aVar.f2201e;
    }

    public int hashCode() {
        int hashCode = ((this.f2197a.hashCode() * 31) + this.f2198b.hashCode()) * 31;
        Integer num = this.f2199c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f2200d;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.f2201e);
    }

    public String toString() {
        return "AnalyticsRequest(apiKey=" + this.f2197a + ", events=" + this.f2198b + ", minIdLength=" + this.f2199c + ", diagnostics=" + this.f2200d + ", clientUploadTime=" + this.f2201e + ')';
    }

    public /* synthetic */ a(String str, String str2, Integer num, String str3, long j6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i6 & 4) != 0 ? null : num, (i6 & 8) != 0 ? null : str3, (i6 & 16) != 0 ? System.currentTimeMillis() : j6);
    }
}
