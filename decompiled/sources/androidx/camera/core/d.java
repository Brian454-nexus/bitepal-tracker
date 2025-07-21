package androidx.camera.core;

import F.Z;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface d extends AutoCloseable {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        int a();

        int b();

        ByteBuffer d();
    }

    void N(Rect rect);

    Z O();

    Image X();

    @Override // java.lang.AutoCloseable
    void close();

    int g();

    int getHeight();

    int getWidth();

    a[] j();
}
