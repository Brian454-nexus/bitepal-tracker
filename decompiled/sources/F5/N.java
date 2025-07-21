package F5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f1656a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f1657b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f1658c;

    /* renamed from: d, reason: collision with root package name */
    public final fa.a f1659d;

    /* renamed from: e, reason: collision with root package name */
    public final fa.a f1660e;

    public N(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4, fa.a aVar5) {
        this.f1656a = aVar;
        this.f1657b = aVar2;
        this.f1658c = aVar3;
        this.f1659d = aVar4;
        this.f1660e = aVar5;
    }

    public static N a(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4, fa.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(H5.a aVar, H5.a aVar2, Object obj, Object obj2, fa.a aVar3) {
        return new M(aVar, aVar2, (AbstractC0358e) obj, (W) obj2, aVar3);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((H5.a) this.f1656a.get(), (H5.a) this.f1657b.get(), this.f1658c.get(), this.f1659d.get(), this.f1660e);
    }
}
