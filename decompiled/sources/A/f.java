package A;

import A.e;
import F.C;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f3a;

    public f(Object obj) {
        this.f3a = (DynamicRangeProfiles) obj;
    }

    public static Set e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static C f(long j6) {
        return (C) y0.g.g(b.b(j6), "Dynamic range profile cannot be converted to a DynamicRange object: " + j6);
    }

    @Override // A.e.a
    public DynamicRangeProfiles a() {
        return this.f3a;
    }

    public final Long b(C c6) {
        return b.a(c6, this.f3a);
    }

    @Override // A.e.a
    public Set c() {
        return e(this.f3a.getSupportedProfiles());
    }

    @Override // A.e.a
    public Set d(C c6) {
        Long b6 = b(c6);
        y0.g.b(b6 != null, "DynamicRange is not supported: " + c6);
        return e(this.f3a.getProfileCaptureRequestConstraints(b6.longValue()));
    }
}
