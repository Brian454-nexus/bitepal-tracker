package F;

import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface w0 extends Closeable {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a c(int i6, w0 w0Var) {
            return new C0334i(i6, w0Var);
        }

        public abstract int a();

        public abstract w0 b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Size f();

    int g();

    void o(float[] fArr, float[] fArr2);

    Surface x(Executor executor, InterfaceC2343a interfaceC2343a);
}
