package c1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import z6.w;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1120b {
    public static z6.w a(y6.g gVar, List list) {
        w.a o6 = z6.w.o();
        for (int i6 = 0; i6 < list.size(); i6++) {
            o6.h(gVar.apply((Bundle) AbstractC1119a.e((Bundle) list.get(i6))));
        }
        return o6.k();
    }

    public static ArrayList b(Collection collection, y6.g gVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) gVar.apply(it.next()));
        }
        return arrayList;
    }
}
