package J3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2890c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f2891d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Map f2892e = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f f2893a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2894b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(f configuration) {
            g gVar;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            synchronized (g.f2891d) {
                try {
                    Map map = g.f2892e;
                    String e6 = configuration.e();
                    Object obj = map.get(e6);
                    if (obj == null) {
                        obj = new g(configuration, null);
                        map.put(e6, obj);
                    }
                    gVar = (g) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar;
        }

        public a() {
        }
    }

    public /* synthetic */ g(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public final i c() {
        return this.f2894b;
    }

    public g(f fVar) {
        this.f2893a = fVar;
        this.f2894b = new j(fVar.d().a(fVar));
    }
}
