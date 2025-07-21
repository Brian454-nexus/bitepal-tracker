package d0;

import F.AbstractC0335i0;
import F.C;
import F.H0;
import I.T0;
import X.y0;
import android.util.Range;
import android.util.Size;
import e0.m0;
import f0.AbstractC1283a;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l implements y0.i {

    /* renamed from: g, reason: collision with root package name */
    public static final Size f13355g = new Size(1280, 720);

    /* renamed from: h, reason: collision with root package name */
    public static final Range f13356h = new Range(1, 60);

    /* renamed from: a, reason: collision with root package name */
    public final String f13357a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f13358b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f13359c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f13360d;

    /* renamed from: e, reason: collision with root package name */
    public final C f13361e;

    /* renamed from: f, reason: collision with root package name */
    public final Range f13362f;

    public l(String str, T0 t02, y0 y0Var, Size size, C c6, Range range) {
        this.f13357a = str;
        this.f13358b = t02;
        this.f13359c = y0Var;
        this.f13360d = size;
        this.f13361e = c6;
        this.f13362f = range;
    }

    @Override // y0.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        int b6 = b();
        AbstractC0335i0.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + b6 + "fps");
        Range c6 = this.f13359c.c();
        AbstractC0335i0.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int a6 = this.f13361e.a();
        int width = this.f13360d.getWidth();
        Size size = f13355g;
        int e6 = k.e(14000000, a6, 8, b6, 30, width, size.getWidth(), this.f13360d.getHeight(), size.getHeight(), c6);
        int a7 = AbstractC1283a.a(this.f13357a, this.f13361e);
        return m0.d().h(this.f13357a).g(this.f13358b).j(this.f13360d).b(e6).e(b6).i(a7).d(k.b(this.f13357a, a7)).a();
    }

    public final int b() {
        Range range = this.f13362f;
        Range range2 = H0.f1264o;
        int intValue = !Objects.equals(range, range2) ? ((Integer) f13356h.clamp((Integer) this.f13362f.getUpper())).intValue() : 30;
        AbstractC0335i0.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", Integer.valueOf(intValue), Objects.equals(this.f13362f, range2) ? this.f13362f : "<UNSPECIFIED>"));
        return intValue;
    }
}
