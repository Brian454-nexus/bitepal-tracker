package a0;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: a0.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0991p {

    /* renamed from: a0.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(boolean z6);
    }

    /* renamed from: a0.p$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends Exception {
        public b(String str) {
            super(str);
        }

        public b(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a0.p$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class c {
        public static c c(int i6, long j6) {
            return new C0997v(i6, j6);
        }

        public abstract int a();

        public abstract long b();
    }

    void a(a aVar, Executor executor);

    c read(ByteBuffer byteBuffer);

    void release();

    void start();

    void stop();
}
