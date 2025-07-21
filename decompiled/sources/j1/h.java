package j1;

import e1.C1252j;
import java.util.Map;
import k1.C1658b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {
    public static C1252j a(k1.j jVar, String str, k1.i iVar, int i6, Map map) {
        return new C1252j.b().i(iVar.b(str)).h(iVar.f16361a).g(iVar.f16362b).f(b(jVar, iVar)).b(i6).e(map).a();
    }

    public static String b(k1.j jVar, k1.i iVar) {
        String k6 = jVar.k();
        return k6 != null ? k6 : iVar.b(((C1658b) jVar.f16367c.get(0)).f16312a).toString();
    }
}
