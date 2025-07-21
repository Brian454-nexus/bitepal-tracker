package F3;

import D3.f;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1625c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f.a f1626a = f.a.f798b;

    /* renamed from: b, reason: collision with root package name */
    public B3.a f1627b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
    }

    @Override // D3.f
    public C3.a c(C3.a event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        Map q6 = event.q();
        if (q6 != null && (obj = q6.get("ampli")) != null) {
            try {
                Object obj2 = ((Map) obj).get("ingestionMetadata");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                Map map = (Map) obj2;
                event.i0(new C3.d((String) map.get("sourceName"), (String) map.get("sourceVersion")));
            } catch (Throwable unused) {
            }
        }
        return event;
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f1627b = aVar;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f1626a;
    }
}
