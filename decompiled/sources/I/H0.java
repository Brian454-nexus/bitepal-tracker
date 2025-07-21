package I;

import I.P;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface H0 extends P {
    @Override // I.P
    default Set a(P.a aVar) {
        return o().a(aVar);
    }

    @Override // I.P
    default Object b(P.a aVar) {
        return o().b(aVar);
    }

    @Override // I.P
    default Set c() {
        return o().c();
    }

    @Override // I.P
    default Object d(P.a aVar, P.c cVar) {
        return o().d(aVar, cVar);
    }

    @Override // I.P
    default Object e(P.a aVar, Object obj) {
        return o().e(aVar, obj);
    }

    @Override // I.P
    default P.c f(P.a aVar) {
        return o().f(aVar);
    }

    @Override // I.P
    default void g(String str, P.b bVar) {
        o().g(str, bVar);
    }

    @Override // I.P
    default boolean h(P.a aVar) {
        return o().h(aVar);
    }

    P o();
}
