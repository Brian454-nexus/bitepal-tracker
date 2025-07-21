package d0;

import F.AbstractC0335i0;
import I.T0;
import X.AbstractC0792a;
import a0.AbstractC0976a;
import android.util.Range;
import e0.AbstractC1218a;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1174d implements y0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f13334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13335b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0792a f13336c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0976a f13337d;

    /* renamed from: e, reason: collision with root package name */
    public final T0 f13338e;

    public C1174d(String str, int i6, T0 t02, AbstractC0792a abstractC0792a, AbstractC0976a abstractC0976a) {
        this.f13334a = str;
        this.f13335b = i6;
        this.f13338e = t02;
        this.f13336c = abstractC0792a;
        this.f13337d = abstractC0976a;
    }

    @Override // y0.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1218a get() {
        Range b6 = this.f13336c.b();
        AbstractC0335i0.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return AbstractC1218a.d().f(this.f13334a).g(this.f13335b).e(this.f13338e).d(this.f13337d.e()).h(this.f13337d.f()).c(AbstractC1172b.g(156000, this.f13337d.e(), 2, this.f13337d.f(), 48000, b6)).b();
    }
}
