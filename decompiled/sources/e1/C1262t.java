package e1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e1.t, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1262t {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13892a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f13893b;

    public synchronized void a(Map map) {
        this.f13893b = null;
        this.f13892a.clear();
        this.f13892a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.f13893b == null) {
                this.f13893b = Collections.unmodifiableMap(new HashMap(this.f13892a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13893b;
    }
}
