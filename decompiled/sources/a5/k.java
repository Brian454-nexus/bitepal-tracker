package a5;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final C1023f f7746a = new C1023f();

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T4.v a(ByteBuffer byteBuffer, int i6, int i7, R4.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f7746a.c(createSource, i6, i7, hVar);
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, R4.h hVar) {
        return true;
    }
}
