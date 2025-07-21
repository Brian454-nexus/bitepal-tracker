package F;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u0 extends androidx.camera.core.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1491d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f1492e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f1493f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1494g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1495h;

    public u0(androidx.camera.core.d dVar, Z z6) {
        this(dVar, null, z6);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public void N(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f1491d) {
            this.f1493f = rect;
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public Z O() {
        return this.f1492e;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getHeight() {
        return this.f1495h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getWidth() {
        return this.f1494g;
    }

    public u0(androidx.camera.core.d dVar, Size size, Z z6) {
        super(dVar);
        this.f1491d = new Object();
        if (size == null) {
            this.f1494g = super.getWidth();
            this.f1495h = super.getHeight();
        } else {
            this.f1494g = size.getWidth();
            this.f1495h = size.getHeight();
        }
        this.f1492e = z6;
    }
}
