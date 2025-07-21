package E;

import E.j;
import F.E;
import I.C0464y0;
import I.D0;
import I.H0;
import I.InterfaceC0462x0;
import I.P;
import android.hardware.camera2.CaptureRequest;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j implements H0 {

    /* renamed from: G, reason: collision with root package name */
    public final P f870G;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f871a = C0464y0.a0();

        public static /* synthetic */ boolean a(a aVar, P p6, P.a aVar2) {
            aVar.b().x(aVar2, p6.f(aVar2), p6.b(aVar2));
            return true;
        }

        public static a f(final P p6) {
            final a aVar = new a();
            p6.g("camera2.captureRequest.option.", new P.b() { // from class: E.i
                @Override // I.P.b
                public final boolean a(P.a aVar2) {
                    return j.a.a(j.a.this, p6, aVar2);
                }
            });
            return aVar;
        }

        @Override // F.E
        public InterfaceC0462x0 b() {
            return this.f871a;
        }

        public j d() {
            return new j(D0.Z(this.f871a));
        }

        public a e(CaptureRequest.Key key) {
            this.f871a.c0(C2253a.X(key));
            return this;
        }

        public a g(CaptureRequest.Key key, Object obj) {
            this.f871a.H(C2253a.X(key), obj);
            return this;
        }
    }

    public j(P p6) {
        this.f870G = p6;
    }

    @Override // I.H0
    public P o() {
        return this.f870G;
    }
}
