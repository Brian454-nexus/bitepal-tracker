package D5;

import E5.x;
import F5.InterfaceC0357d;
import G5.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import u5.k;
import x5.p;
import x5.u;
import y5.m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f834f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final x f835a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f836b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.e f837c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0357d f838d;

    /* renamed from: e, reason: collision with root package name */
    public final G5.b f839e;

    public c(Executor executor, y5.e eVar, x xVar, InterfaceC0357d interfaceC0357d, G5.b bVar) {
        this.f836b = executor;
        this.f837c = eVar;
        this.f835a = xVar;
        this.f838d = interfaceC0357d;
        this.f839e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, p pVar, x5.i iVar) {
        cVar.f838d.i0(pVar, iVar);
        cVar.f835a.b(pVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final p pVar, k kVar, x5.i iVar) {
        cVar.getClass();
        try {
            m mVar = cVar.f837c.get(pVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f834f.warning(format);
                kVar.a(new IllegalArgumentException(format));
            } else {
                final x5.i a6 = mVar.a(iVar);
                cVar.f839e.a(new b.a() { // from class: D5.b
                    @Override // G5.b.a
                    public final Object a() {
                        return c.b(c.this, pVar, a6);
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e6) {
            f834f.warning("Error scheduling event " + e6.getMessage());
            kVar.a(e6);
        }
    }

    @Override // D5.e
    public void a(final p pVar, final x5.i iVar, final k kVar) {
        this.f836b.execute(new Runnable() { // from class: D5.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(c.this, pVar, kVar, iVar);
            }
        });
    }
}
