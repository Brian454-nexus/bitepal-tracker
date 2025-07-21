package C;

import I.Q0;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final B.o f403a;

    public p() {
        this((B.o) B.l.a(B.o.class));
    }

    public List a(Q0.b bVar, List list) {
        Size d6;
        B.o oVar = this.f403a;
        if (oVar == null || (d6 = oVar.d(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d6);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(d6)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public p(B.o oVar) {
        this.f403a = oVar;
    }
}
