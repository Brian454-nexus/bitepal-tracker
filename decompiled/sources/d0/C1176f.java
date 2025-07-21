package d0;

import F.AbstractC0335i0;
import I.InterfaceC0423d0;
import X.AbstractC0792a;
import a0.AbstractC0976a;
import android.util.Range;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1176f implements y0.i {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0792a f13339a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0423d0.a f13340b;

    public C1176f(AbstractC0792a abstractC0792a, InterfaceC0423d0.a aVar) {
        this.f13339a = abstractC0792a;
        this.f13340b = aVar;
    }

    @Override // y0.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0976a get() {
        int e6 = AbstractC1172b.e(this.f13339a);
        int f6 = AbstractC1172b.f(this.f13339a);
        int c6 = this.f13339a.c();
        Range d6 = this.f13339a.d();
        int c7 = this.f13340b.c();
        if (c6 == -1) {
            AbstractC0335i0.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + c7);
            c6 = c7;
        } else {
            AbstractC0335i0.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + c7 + ", Resolved Channel Count: " + c6 + "]");
        }
        int g6 = this.f13340b.g();
        int h6 = AbstractC1172b.h(d6, c6, f6, g6);
        AbstractC0335i0.a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + h6 + "Hz. [AudioProfile sample rate: " + g6 + "Hz]");
        return AbstractC0976a.a().d(e6).c(f6).e(c6).f(h6).b();
    }
}
