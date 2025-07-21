package T4;

import o5.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u implements v, a.f {

    /* renamed from: e, reason: collision with root package name */
    public static final y0.d f5113e = o5.a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    public final o5.c f5114a = o5.c.a();

    /* renamed from: b, reason: collision with root package name */
    public v f5115b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5116c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5117d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements a.d {
        @Override // o5.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a() {
            return new u();
        }
    }

    public static u d(v vVar) {
        u uVar = (u) n5.k.d((u) f5113e.b());
        uVar.c(vVar);
        return uVar;
    }

    private void e() {
        this.f5115b = null;
        f5113e.a(this);
    }

    @Override // T4.v
    public synchronized void a() {
        this.f5114a.c();
        this.f5117d = true;
        if (!this.f5116c) {
            this.f5115b.a();
            e();
        }
    }

    @Override // T4.v
    public Class b() {
        return this.f5115b.b();
    }

    public final void c(v vVar) {
        this.f5117d = false;
        this.f5116c = true;
        this.f5115b = vVar;
    }

    @Override // T4.v
    public int f() {
        return this.f5115b.f();
    }

    @Override // o5.a.f
    public o5.c g() {
        return this.f5114a;
    }

    @Override // T4.v
    public Object get() {
        return this.f5115b.get();
    }

    public synchronized void h() {
        this.f5114a.c();
        if (!this.f5116c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f5116c = false;
        if (this.f5117d) {
            a();
        }
    }
}
