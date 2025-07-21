package F;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v0 extends androidx.camera.core.b {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1498d;

    public v0(androidx.camera.core.d dVar) {
        super(dVar);
        this.f1498d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        if (this.f1498d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
