package p1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface k {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n f18185a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f18186b;

        /* renamed from: c, reason: collision with root package name */
        public final Z0.q f18187c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f18188d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f18189e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18190f;

        public a(n nVar, MediaFormat mediaFormat, Z0.q qVar, Surface surface, MediaCrypto mediaCrypto, int i6) {
            this.f18185a = nVar;
            this.f18186b = mediaFormat;
            this.f18187c = qVar;
            this.f18188d = surface;
            this.f18189e = mediaCrypto;
            this.f18190f = i6;
        }

        public static a a(n nVar, MediaFormat mediaFormat, Z0.q qVar, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, qVar, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, Z0.q qVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, qVar, surface, mediaCrypto, 0);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        k a(a aVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void a(k kVar, long j6, long j7);
    }

    void a(Bundle bundle);

    void b(int i6, int i7, f1.c cVar, long j6, int i8);

    void c(int i6, int i7, int i8, long j6, int i9);

    boolean d();

    MediaFormat e();

    void f(int i6, long j6);

    void flush();

    int g();

    default boolean h(c cVar) {
        return false;
    }

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i6, boolean z6);

    void k(int i6);

    ByteBuffer l(int i6);

    void m(Surface surface);

    void n(d dVar, Handler handler);

    ByteBuffer o(int i6);

    void release();
}
