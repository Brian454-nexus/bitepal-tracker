package f3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface j {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static i a(j jVar, m id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return jVar.g(id.b(), id.a());
        }

        public static void b(j jVar, m id) {
            Intrinsics.checkNotNullParameter(id, "id");
            jVar.d(id.b(), id.a());
        }
    }

    List a();

    void b(m mVar);

    void c(i iVar);

    void d(String str, int i6);

    i e(m mVar);

    void f(String str);

    i g(String str, int i6);
}
