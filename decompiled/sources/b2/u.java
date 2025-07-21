package b2;

import E1.J;
import E1.O;
import android.util.SparseArray;
import b2.s;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u implements E1.r {

    /* renamed from: a, reason: collision with root package name */
    public final E1.r f10498a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f10499b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f10500c = new SparseArray();

    public u(E1.r rVar, s.a aVar) {
        this.f10498a = rVar;
        this.f10499b = aVar;
    }

    @Override // E1.r
    public O a(int i6, int i7) {
        if (i7 != 3) {
            return this.f10498a.a(i6, i7);
        }
        w wVar = (w) this.f10500c.get(i6);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f10498a.a(i6, i7), this.f10499b);
        this.f10500c.put(i6, wVar2);
        return wVar2;
    }

    public void b() {
        for (int i6 = 0; i6 < this.f10500c.size(); i6++) {
            ((w) this.f10500c.valueAt(i6)).j();
        }
    }

    @Override // E1.r
    public void k() {
        this.f10498a.k();
    }

    @Override // E1.r
    public void n(J j6) {
        this.f10498a.n(j6);
    }
}
