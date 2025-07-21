package x5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s implements u5.i {

    /* renamed from: a, reason: collision with root package name */
    public final p f20647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20648b;

    /* renamed from: c, reason: collision with root package name */
    public final u5.c f20649c;

    /* renamed from: d, reason: collision with root package name */
    public final u5.h f20650d;

    /* renamed from: e, reason: collision with root package name */
    public final t f20651e;

    public s(p pVar, String str, u5.c cVar, u5.h hVar, t tVar) {
        this.f20647a = pVar;
        this.f20648b = str;
        this.f20649c = cVar;
        this.f20650d = hVar;
        this.f20651e = tVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // u5.i
    public void a(u5.d dVar) {
        b(dVar, new u5.k() { // from class: x5.r
            @Override // u5.k
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    @Override // u5.i
    public void b(u5.d dVar, u5.k kVar) {
        this.f20651e.a(o.a().e(this.f20647a).c(dVar).f(this.f20648b).d(this.f20650d).b(this.f20649c).a(), kVar);
    }

    public p d() {
        return this.f20647a;
    }
}
