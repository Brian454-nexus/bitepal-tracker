package n1;

import A1.n;
import java.util.List;
import r1.C2022b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f17493a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17494b;

    public e(j jVar, List list) {
        this.f17493a = jVar;
        this.f17494b = list;
    }

    @Override // n1.j
    public n.a a(g gVar, f fVar) {
        return new C2022b(this.f17493a.a(gVar, fVar), this.f17494b);
    }

    @Override // n1.j
    public n.a b() {
        return new C2022b(this.f17493a.b(), this.f17494b);
    }
}
