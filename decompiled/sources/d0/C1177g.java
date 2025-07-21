package d0;

import F.AbstractC0335i0;
import X.AbstractC0792a;
import a0.AbstractC0976a;
import android.util.Range;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1177g implements y0.i {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0792a f13341a;

    public C1177g(AbstractC0792a abstractC0792a) {
        this.f13341a = abstractC0792a;
    }

    @Override // y0.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0976a get() {
        int h6;
        int e6 = AbstractC1172b.e(this.f13341a);
        int f6 = AbstractC1172b.f(this.f13341a);
        int c6 = this.f13341a.c();
        if (c6 == -1) {
            AbstractC0335i0.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            c6 = 1;
        } else {
            AbstractC0335i0.a("DefAudioResolver", "Using supplied AUDIO channel count: " + c6);
        }
        Range d6 = this.f13341a.d();
        if (AbstractC0792a.f5836b.equals(d6)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Using fallback AUDIO sample rate: ");
            h6 = 44100;
            sb.append(44100);
            sb.append("Hz");
            AbstractC0335i0.a("DefAudioResolver", sb.toString());
        } else {
            h6 = AbstractC1172b.h(d6, c6, f6, ((Integer) d6.getUpper()).intValue());
            AbstractC0335i0.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + h6 + "Hz");
        }
        return AbstractC0976a.a().d(e6).c(f6).e(c6).f(h6).b();
    }
}
