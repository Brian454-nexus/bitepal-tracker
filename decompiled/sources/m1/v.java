package m1;

import android.util.SparseArray;
import c1.C1111E;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f17418a = new SparseArray();

    public C1111E a(int i6) {
        C1111E c1111e = (C1111E) this.f17418a.get(i6);
        if (c1111e != null) {
            return c1111e;
        }
        C1111E c1111e2 = new C1111E(9223372036854775806L);
        this.f17418a.put(i6, c1111e2);
        return c1111e2;
    }

    public void b() {
        this.f17418a.clear();
    }
}
