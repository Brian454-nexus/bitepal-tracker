package V4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import n5.k;
import n5.l;
import o5.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final n5.h f5336a = new n5.h(1000);

    /* renamed from: b, reason: collision with root package name */
    public final y0.d f5337b = o5.a.d(10, new a());

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements a.d {
        public a() {
        }

        @Override // o5.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final MessageDigest f5339a;

        /* renamed from: b, reason: collision with root package name */
        public final o5.c f5340b = o5.c.a();

        public b(MessageDigest messageDigest) {
            this.f5339a = messageDigest;
        }

        @Override // o5.a.f
        public o5.c g() {
            return this.f5340b;
        }
    }

    public final String a(R4.f fVar) {
        b bVar = (b) k.d(this.f5337b.b());
        try {
            fVar.a(bVar.f5339a);
            return l.x(bVar.f5339a.digest());
        } finally {
            this.f5337b.a(bVar);
        }
    }

    public String b(R4.f fVar) {
        String str;
        synchronized (this.f5336a) {
            str = (String) this.f5336a.g(fVar);
        }
        if (str == null) {
            str = a(fVar);
        }
        synchronized (this.f5336a) {
            this.f5336a.k(fVar, str);
        }
        return str;
    }
}
