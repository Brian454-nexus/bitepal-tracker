package e5;

import T4.v;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: e5.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1280j implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final List f13981a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.j f13982b;

    /* renamed from: c, reason: collision with root package name */
    public final U4.b f13983c;

    public C1280j(List list, R4.j jVar, U4.b bVar) {
        this.f13981a = list;
        this.f13982b = jVar;
        this.f13983c = bVar;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e6) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            return null;
        }
    }

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(InputStream inputStream, int i6, int i7, R4.h hVar) {
        byte[] e6 = e(inputStream);
        if (e6 == null) {
            return null;
        }
        return this.f13982b.a(ByteBuffer.wrap(e6), i6, i7, hVar);
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, R4.h hVar) {
        return !((Boolean) hVar.c(AbstractC1279i.f13980b)).booleanValue() && com.bumptech.glide.load.a.f(this.f13981a, inputStream, this.f13983c) == ImageHeaderParser.ImageType.GIF;
    }
}
