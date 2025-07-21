package H;

import F.AbstractC0329f0;
import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* renamed from: H.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0397v implements T.z {
    @Override // T.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T.A apply(T.A a6) {
        androidx.camera.core.f fVar = new androidx.camera.core.f(AbstractC0329f0.a(a6.h().getWidth(), a6.h().getHeight(), 256, 2));
        androidx.camera.core.d e6 = ImageProcessingUtil.e(fVar, (byte[]) a6.c());
        fVar.i();
        Objects.requireNonNull(e6);
        L.g d6 = a6.d();
        Objects.requireNonNull(d6);
        return T.A.k(e6, d6, a6.b(), a6.f(), a6.g(), a6.a());
    }
}
