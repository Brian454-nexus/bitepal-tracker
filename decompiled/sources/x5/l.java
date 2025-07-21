package x5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l {
    public static void a(u5.i iVar, u5.f fVar) {
        if (!(iVar instanceof s)) {
            B5.a.f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().l(((s) iVar).d().f(fVar), 1);
        }
    }
}
