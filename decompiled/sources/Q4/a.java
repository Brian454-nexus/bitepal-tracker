package Q4;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface a {

    /* renamed from: Q4.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0077a {
        Bitmap a(int i6, int i7, Bitmap.Config config);

        int[] b(int i6);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i6);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
