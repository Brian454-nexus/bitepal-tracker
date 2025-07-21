package H;

import H.C0392p;
import H.F;
import java.util.Objects;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public G f1951a;

    /* renamed from: b, reason: collision with root package name */
    public F.a f1952b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f1953a;

        public a(G g6) {
            this.f1953a = g6;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            L.p.a();
            G g6 = this.f1953a;
            N n6 = N.this;
            if (g6 == n6.f1951a) {
                n6.f1951a = null;
            }
        }
    }

    public final void c(androidx.camera.core.d dVar) {
        L.p.a();
        y0.g.h(this.f1951a != null);
        Object d6 = dVar.O().a().d(this.f1951a.h());
        Objects.requireNonNull(d6);
        y0.g.h(((Integer) d6).intValue() == ((Integer) this.f1951a.g().get(0)).intValue());
        this.f1952b.a().accept(F.b.c(this.f1951a, dVar));
        this.f1951a = null;
    }

    public void d() {
    }

    public final void e(G g6) {
        L.p.a();
        y0.g.i(g6.g().size() == 1, "Cannot handle multi-image capture.");
        y0.g.i(this.f1951a == null, "Already has an existing request.");
        this.f1951a = g6;
        N.f.b(g6.a(), new a(g6), M.c.b());
    }

    public F.a f(C0392p.c cVar) {
        cVar.a().a(new InterfaceC2343a() { // from class: H.L
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                N.this.c((androidx.camera.core.d) obj);
            }
        });
        cVar.d().a(new InterfaceC2343a() { // from class: H.M
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                N.this.e((G) obj);
            }
        });
        F.a d6 = F.a.d(cVar.b(), cVar.c());
        this.f1952b = d6;
        return d6;
    }
}
