package R4;

import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4619e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4620a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4622c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f4623d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b {
        @Override // R4.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public g(String str, Object obj, b bVar) {
        this.f4622c = n5.k.b(str);
        this.f4620a = obj;
        this.f4621b = (b) n5.k.d(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    public static b b() {
        return f4619e;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f4620a;
    }

    public final byte[] d() {
        if (this.f4623d == null) {
            this.f4623d = this.f4622c.getBytes(f.f4618a);
        }
        return this.f4623d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4622c.equals(((g) obj).f4622c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f4621b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f4622c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f4622c + "'}";
    }
}
