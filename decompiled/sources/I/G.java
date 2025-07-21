package I;

import F.AbstractC0335i0;
import F.C0333h0;
import F.C0348u;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2248a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f2249b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Set f2250c = new HashSet();

    public LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f2248a) {
            linkedHashSet = new LinkedHashSet(this.f2249b.values());
        }
        return linkedHashSet;
    }

    public void b(C c6) {
        synchronized (this.f2248a) {
            try {
                for (String str : c6.a()) {
                    AbstractC0335i0.a("CameraRepository", "Added camera: " + str);
                    this.f2249b.put(str, c6.b(str));
                }
            } catch (C0348u e6) {
                throw new C0333h0(e6);
            }
        }
    }
}
