package T4;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5107a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f5108b = new HashMap();

    public l a(R4.f fVar, boolean z6) {
        return (l) b(z6).get(fVar);
    }

    public final Map b(boolean z6) {
        return z6 ? this.f5108b : this.f5107a;
    }

    public void c(R4.f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    public void d(R4.f fVar, l lVar) {
        Map b6 = b(lVar.p());
        if (lVar.equals(b6.get(fVar))) {
            b6.remove(fVar);
        }
    }
}
