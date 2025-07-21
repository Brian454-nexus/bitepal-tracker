package d0;

import F.AbstractC0335i0;
import F.C;
import F.H0;
import I.InterfaceC0423d0;
import I.T0;
import X.y0;
import android.util.Range;
import android.util.Size;
import e0.m0;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m implements y0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f13363a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f13364b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f13365c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f13366d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0423d0.c f13367e;

    /* renamed from: f, reason: collision with root package name */
    public final C f13368f;

    /* renamed from: g, reason: collision with root package name */
    public final Range f13369g;

    public m(String str, T0 t02, y0 y0Var, Size size, InterfaceC0423d0.c cVar, C c6, Range range) {
        this.f13363a = str;
        this.f13364b = t02;
        this.f13365c = y0Var;
        this.f13366d = size;
        this.f13367e = cVar;
        this.f13368f = c6;
        this.f13369g = range;
    }

    private int b() {
        int f6 = this.f13367e.f();
        Range range = this.f13369g;
        Range range2 = H0.f1264o;
        int intValue = !Objects.equals(range, range2) ? ((Integer) this.f13369g.clamp(Integer.valueOf(f6))).intValue() : f6;
        AbstractC0335i0.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", Integer.valueOf(intValue), Integer.valueOf(f6), Objects.equals(this.f13369g, range2) ? this.f13369g : "<UNSPECIFIED>"));
        return intValue;
    }

    @Override // y0.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        int b6 = b();
        AbstractC0335i0.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + b6 + "fps");
        Range c6 = this.f13365c.c();
        AbstractC0335i0.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int e6 = k.e(this.f13367e.c(), this.f13368f.a(), this.f13367e.b(), b6, this.f13367e.f(), this.f13366d.getWidth(), this.f13367e.k(), this.f13366d.getHeight(), this.f13367e.h(), c6);
        int j6 = this.f13367e.j();
        return m0.d().h(this.f13363a).g(this.f13364b).j(this.f13366d).b(e6).e(b6).i(j6).d(k.b(this.f13363a, j6)).a();
    }
}
