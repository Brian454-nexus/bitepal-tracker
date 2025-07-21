package D3;

import D3.f;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map f804a;

    /* renamed from: b, reason: collision with root package name */
    public B3.a f805b;

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        int i6 = 1;
        this.f804a = MapsKt.mapOf(new Pair[]{TuplesKt.to(f.a.f797a, new d(null, i6, 0 == true ? 1 : 0)), TuplesKt.to(f.a.f798b, new d(0 == true ? 1 : 0, i6, 0 == true ? 1 : 0)), TuplesKt.to(f.a.f799c, new d(0 == true ? 1 : 0, i6, 0 == true ? 1 : 0)), TuplesKt.to(f.a.f800d, new d(0 == true ? 1 : 0, i6, 0 == true ? 1 : 0))});
    }

    public final void a(f plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        plugin.a(e());
        d dVar = (d) this.f804a.get(plugin.getType());
        if (dVar != null) {
            dVar.a(plugin);
        }
    }

    public final void b(Function1 closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        Iterator it = this.f804a.entrySet().iterator();
        while (it.hasNext()) {
            ((d) ((Map.Entry) it.next()).getValue()).b(closure);
        }
    }

    public final C3.a c(d dVar, C3.a aVar) {
        if (aVar == null) {
            return aVar;
        }
        if (dVar != null) {
            return dVar.c(aVar);
        }
        return null;
    }

    public final C3.a d(f.a type, C3.a aVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        return c((d) this.f804a.get(type), aVar);
    }

    public final B3.a e() {
        B3.a aVar = this.f805b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    public void f(C3.a incomingEvent) {
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        if (e().m().p()) {
            return;
        }
        d(f.a.f799c, d(f.a.f798b, d(f.a.f797a, incomingEvent)));
    }

    public final void g(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f805b = aVar;
    }
}
