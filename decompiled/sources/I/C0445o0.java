package I;

import android.util.Size;
import android.view.Surface;

/* renamed from: I.o0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0445o0 extends W {

    /* renamed from: o, reason: collision with root package name */
    public final Surface f2516o;

    public C0445o0(Surface surface, Size size, int i6) {
        super(size, i6);
        this.f2516o = surface;
    }

    @Override // I.W
    public D6.g o() {
        return N.f.h(this.f2516o);
    }

    public C0445o0(Surface surface) {
        this.f2516o = surface;
    }
}
