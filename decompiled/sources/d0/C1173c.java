package d0;

import F.AbstractC0335i0;
import I.InterfaceC0423d0;
import I.T0;
import X.AbstractC0792a;
import a0.AbstractC0976a;
import e0.AbstractC1218a;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1173c implements y0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f13328a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f13329b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13330c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0792a f13331d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0976a f13332e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0423d0.a f13333f;

    public C1173c(String str, int i6, T0 t02, AbstractC0792a abstractC0792a, AbstractC0976a abstractC0976a, InterfaceC0423d0.a aVar) {
        this.f13328a = str;
        this.f13330c = i6;
        this.f13329b = t02;
        this.f13331d = abstractC0792a;
        this.f13332e = abstractC0976a;
        this.f13333f = aVar;
    }

    @Override // y0.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1218a get() {
        AbstractC0335i0.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return AbstractC1218a.d().f(this.f13328a).g(this.f13330c).e(this.f13329b).d(this.f13332e.e()).h(this.f13332e.f()).c(AbstractC1172b.g(this.f13333f.b(), this.f13332e.e(), this.f13333f.c(), this.f13332e.f(), this.f13333f.g(), this.f13331d.b())).b();
    }
}
