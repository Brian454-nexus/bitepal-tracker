package f3;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface z {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static void a(z zVar, String id, Set tags) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Iterator it = tags.iterator();
            while (it.hasNext()) {
                zVar.a(new y((String) it.next(), id));
            }
        }
    }

    void a(y yVar);

    List b(String str);

    void c(String str, Set set);

    void d(String str);
}
