package w0;

import android.util.Base64;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f19694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19696c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19697d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19698e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f19699f;

    public e(String str, String str2, String str3, List list) {
        this.f19694a = (String) y0.g.f(str);
        this.f19695b = (String) y0.g.f(str2);
        this.f19696c = (String) y0.g.f(str3);
        this.f19697d = (List) y0.g.f(list);
        this.f19699f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f19697d;
    }

    public int c() {
        return this.f19698e;
    }

    public String d() {
        return this.f19699f;
    }

    public String e() {
        return this.f19694a;
    }

    public String f() {
        return this.f19695b;
    }

    public String g() {
        return this.f19696c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f19694a + ", mProviderPackage: " + this.f19695b + ", mQuery: " + this.f19696c + ", mCertificates:");
        for (int i6 = 0; i6 < this.f19697d.size(); i6++) {
            sb.append(" [");
            List list = (List) this.f19697d.get(i6);
            for (int i7 = 0; i7 < list.size(); i7++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i7), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f19698e);
        return sb.toString();
    }
}
