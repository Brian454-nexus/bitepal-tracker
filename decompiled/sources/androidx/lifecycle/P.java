package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9026a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f9026a.values().iterator();
        while (it.hasNext()) {
            ((M) it.next()).a();
        }
        this.f9026a.clear();
    }

    public final M b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (M) this.f9026a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f9026a.keySet());
    }

    public final void d(String key, M viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        M m6 = (M) this.f9026a.put(key, viewModel);
        if (m6 != null) {
            m6.d();
        }
    }
}
