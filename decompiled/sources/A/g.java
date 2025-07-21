package A;

import A.e;
import F.C;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f4a = new e(new g());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f5b = Collections.singleton(C.f1236d);

    @Override // A.e.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // A.e.a
    public Set c() {
        return f5b;
    }

    @Override // A.e.a
    public Set d(C c6) {
        y0.g.b(C.f1236d.equals(c6), "DynamicRange is not supported: " + c6);
        return f5b;
    }
}
