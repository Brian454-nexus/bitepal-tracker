package androidx.work;

import W2.h;
import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // W2.h
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((b) it.next()).h());
        }
        aVar.c(hashMap);
        return aVar.a();
    }
}
