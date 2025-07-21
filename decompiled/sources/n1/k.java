package n1;

import A1.k;
import android.net.Uri;
import java.io.IOException;
import w1.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface k {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        k a(m1.g gVar, A1.k kVar, j jVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a();

        boolean c(Uri uri, k.c cVar, boolean z6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17618a;

        public c(Uri uri) {
            this.f17618a = uri;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17619a;

        public d(Uri uri) {
            this.f17619a = uri;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        void k(f fVar);
    }

    boolean a(Uri uri);

    void b(b bVar);

    void c(Uri uri);

    void d(Uri uri);

    long e();

    void f(Uri uri, K.a aVar, e eVar);

    boolean g();

    g h();

    boolean i(Uri uri, long j6);

    void k(b bVar);

    void l();

    void m(Uri uri);

    f n(Uri uri, boolean z6);

    void stop();
}
