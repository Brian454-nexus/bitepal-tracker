package x5;

import F5.InterfaceC0357d;
import android.content.Context;
import java.io.Closeable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class v implements Closeable {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        a a(Context context);

        v build();
    }

    public abstract InterfaceC0357d a();

    public abstract u c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
