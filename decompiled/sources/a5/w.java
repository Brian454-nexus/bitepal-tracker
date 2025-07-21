package a5;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final C1023f f7801a = new C1023f();

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T4.v a(InputStream inputStream, int i6, int i7, R4.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(n5.a.b(inputStream));
        return this.f7801a.c(createSource, i6, i7, hVar);
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, R4.h hVar) {
        return true;
    }
}
