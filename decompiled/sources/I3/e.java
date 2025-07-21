package I3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2805a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f2806b = new LinkedHashMap();

    @Override // I3.b
    public void a(f channel, a event) {
        c cVar;
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this.f2805a) {
            try {
                Map map = this.f2806b;
                Object obj = map.get(channel);
                if (obj == null) {
                    obj = new c(channel);
                    map.put(channel, obj);
                }
                cVar = (c) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        cVar.a(event);
    }
}
