package x5;

import android.util.Base64;
import x5.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class p {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(u5.f fVar);
    }

    public static a a() {
        return new d.b().d(u5.f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract u5.f d();

    public boolean e() {
        return c() != null;
    }

    public p f(u5.f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
