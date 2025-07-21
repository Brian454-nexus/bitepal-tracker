package Y;

import I.D0;
import I.InterfaceC0441m0;
import I.P;
import I.Y0;
import O.k;
import X.w0;
import java.util.Objects;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements Y0, InterfaceC0441m0, k {

    /* renamed from: H, reason: collision with root package name */
    public static final P.a f6322H = P.a.a("camerax.video.VideoCapture.videoOutput", w0.class);

    /* renamed from: I, reason: collision with root package name */
    public static final P.a f6323I = P.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC2069a.class);

    /* renamed from: G, reason: collision with root package name */
    public final D0 f6324G;

    public a(D0 d02) {
        this.f6324G = d02;
    }

    public InterfaceC2069a X() {
        InterfaceC2069a interfaceC2069a = (InterfaceC2069a) b(f6323I);
        Objects.requireNonNull(interfaceC2069a);
        return interfaceC2069a;
    }

    public w0 Y() {
        return (w0) b(f6322H);
    }

    @Override // I.H0
    public P o() {
        return this.f6324G;
    }

    @Override // I.InterfaceC0439l0
    public int q() {
        return 34;
    }
}
