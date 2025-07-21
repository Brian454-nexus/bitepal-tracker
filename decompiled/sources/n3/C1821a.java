package n3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1821a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0223a f17742c = new C0223a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17743d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Map f17744e = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1826f f17745a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1823c f17746b;

    /* renamed from: n3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0223a {
        public /* synthetic */ C0223a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1821a a(String instanceName) {
            C1821a c1821a;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            synchronized (C1821a.f17743d) {
                try {
                    Map map = C1821a.f17744e;
                    Object obj = map.get(instanceName);
                    if (obj == null) {
                        obj = new C1821a(null);
                        map.put(instanceName, obj);
                    }
                    c1821a = (C1821a) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1821a;
        }

        public C0223a() {
        }
    }

    public /* synthetic */ C1821a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final InterfaceC1823c c() {
        return this.f17746b;
    }

    public final InterfaceC1826f d() {
        return this.f17745a;
    }

    public C1821a() {
        this.f17745a = new C1827g();
        this.f17746b = new C1824d();
    }
}
