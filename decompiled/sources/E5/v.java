package E5;

import F5.InterfaceC0357d;
import G5.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0357d f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1220c;

    /* renamed from: d, reason: collision with root package name */
    public final G5.b f1221d;

    public v(Executor executor, InterfaceC0357d interfaceC0357d, x xVar, G5.b bVar) {
        this.f1218a = executor;
        this.f1219b = interfaceC0357d;
        this.f1220c = xVar;
        this.f1221d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f1219b.w().iterator();
        while (it.hasNext()) {
            vVar.f1220c.b((x5.p) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f1218a.execute(new Runnable() { // from class: E5.t
            @Override // java.lang.Runnable
            public final void run() {
                r0.f1221d.a(new b.a() { // from class: E5.u
                    @Override // G5.b.a
                    public final Object a() {
                        return v.a(v.this);
                    }
                });
            }
        });
    }
}
