package X4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h implements R4.f {

    /* renamed from: b, reason: collision with root package name */
    public final i f6248b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f6249c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6250d;

    /* renamed from: e, reason: collision with root package name */
    public String f6251e;

    /* renamed from: f, reason: collision with root package name */
    public URL f6252f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f6253g;

    /* renamed from: h, reason: collision with root package name */
    public int f6254h;

    public h(URL url) {
        this(url, i.f6256b);
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f6250d;
        return str != null ? str : ((URL) n5.k.d(this.f6249c)).toString();
    }

    public final byte[] d() {
        if (this.f6253g == null) {
            this.f6253g = c().getBytes(R4.f.f4618a);
        }
        return this.f6253g;
    }

    public Map e() {
        return this.f6248b.a();
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f6248b.equals(hVar.f6248b)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f6251e)) {
            String str = this.f6250d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) n5.k.d(this.f6249c)).toString();
            }
            this.f6251e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f6251e;
    }

    public final URL g() {
        if (this.f6252f == null) {
            this.f6252f = new URL(f());
        }
        return this.f6252f;
    }

    public URL h() {
        return g();
    }

    @Override // R4.f
    public int hashCode() {
        if (this.f6254h == 0) {
            int hashCode = c().hashCode();
            this.f6254h = hashCode;
            this.f6254h = (hashCode * 31) + this.f6248b.hashCode();
        }
        return this.f6254h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f6256b);
    }

    public h(URL url, i iVar) {
        this.f6249c = (URL) n5.k.d(url);
        this.f6250d = null;
        this.f6248b = (i) n5.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f6249c = null;
        this.f6250d = n5.k.b(str);
        this.f6248b = (i) n5.k.d(iVar);
    }
}
