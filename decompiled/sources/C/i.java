package C;

import B.B;
import B.C0293j;
import B.G;
import F.AbstractC0335i0;
import I.G0;
import I.W;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f392a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f393b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f394c;

    public i(G0 g02, G0 g03) {
        this.f392a = g03.a(G.class);
        this.f393b = g02.a(B.class);
        this.f394c = g02.a(C0293j.class);
    }

    public void a(List list) {
        if (!b() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((W) it.next()).d();
        }
        AbstractC0335i0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f392a || this.f393b || this.f394c;
    }
}
