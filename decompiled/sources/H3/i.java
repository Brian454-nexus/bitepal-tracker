package H3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface i {
    void a(k kVar, Object obj, String str);

    boolean b(c cVar, Object obj, String str);

    default Boolean c(b response, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        if (response instanceof j) {
            e((j) response, events, eventsString);
            return null;
        }
        if (response instanceof c) {
            return Boolean.valueOf(b((c) response, events, eventsString));
        }
        if (response instanceof h) {
            g((h) response, events, eventsString);
            return Boolean.TRUE;
        }
        if (response instanceof l) {
            d((l) response, events, eventsString);
            return Boolean.TRUE;
        }
        if (response instanceof k) {
            a((k) response, events, eventsString);
            return Boolean.TRUE;
        }
        f((d) response, events, eventsString);
        return Boolean.TRUE;
    }

    void d(l lVar, Object obj, String str);

    void e(j jVar, Object obj, String str);

    void f(d dVar, Object obj, String str);

    void g(h hVar, Object obj, String str);
}
