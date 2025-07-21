package e0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: e0.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1226i extends AutoCloseable {
    boolean G();

    long V();

    @Override // java.lang.AutoCloseable
    void close();

    ByteBuffer e();

    long size();

    MediaCodec.BufferInfo z();
}
