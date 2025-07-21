package c1;

import Z0.C0836h;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: c1.r, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1136r {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C0836h c0836h) {
        if (c0836h != null) {
            d(mediaFormat, "color-transfer", c0836h.f6894c);
            d(mediaFormat, "color-standard", c0836h.f6892a);
            d(mediaFormat, "color-range", c0836h.f6893b);
            a(mediaFormat, "hdr-static-info", c0836h.f6895d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f6) {
        if (f6 != -1.0f) {
            mediaFormat.setFloat(str, f6);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i6) {
        if (i6 != -1) {
            mediaFormat.setInteger(str, i6);
        }
    }

    public static void e(MediaFormat mediaFormat, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            mediaFormat.setByteBuffer("csd-" + i6, ByteBuffer.wrap((byte[]) list.get(i6)));
        }
    }
}
