package I3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2801b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2802c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Map f2803d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final b f2804a = new e();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String instanceName) {
            d dVar;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            synchronized (d.f2802c) {
                try {
                    Map map = d.f2803d;
                    Object obj = map.get(instanceName);
                    if (obj == null) {
                        obj = new d();
                        map.put(instanceName, obj);
                    }
                    dVar = (d) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }

        public a() {
        }
    }

    public final b c() {
        return this.f2804a;
    }
}
