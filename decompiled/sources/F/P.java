package F;

import I.InterfaceC0443n0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class P extends O {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f1360a;

        public a(androidx.camera.core.d dVar) {
            this.f1360a = dVar;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            this.f1360a.close();
        }
    }

    @Override // F.O
    public androidx.camera.core.d d(InterfaceC0443n0 interfaceC0443n0) {
        return interfaceC0443n0.f();
    }

    @Override // F.O
    public void g() {
    }

    @Override // F.O
    public void m(androidx.camera.core.d dVar) {
        N.f.b(e(dVar), new a(dVar), M.c.b());
    }
}
