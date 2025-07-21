package V4;

import T4.v;
import V4.h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g extends n5.h implements h {

    /* renamed from: e, reason: collision with root package name */
    public h.a f5321e;

    public g(long j6) {
        super(j6);
    }

    @Override // V4.h
    public void a(int i6) {
        if (i6 >= 40) {
            b();
        } else if (i6 >= 20 || i6 == 15) {
            m(h() / 2);
        }
    }

    @Override // V4.h
    public /* bridge */ /* synthetic */ v c(R4.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // V4.h
    public /* bridge */ /* synthetic */ v d(R4.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // V4.h
    public void e(h.a aVar) {
        this.f5321e = aVar;
    }

    @Override // n5.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.f();
    }

    @Override // n5.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(R4.f fVar, v vVar) {
        h.a aVar = this.f5321e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.b(vVar);
    }
}
