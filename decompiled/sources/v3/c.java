package v3;

import D3.f;
import android.location.Location;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o3.g;
import z3.C2458a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19566d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Set f19567e = SetsKt.setOf(new String[]{"", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000"});

    /* renamed from: a, reason: collision with root package name */
    public final f.a f19568a = f.a.f797a;

    /* renamed from: b, reason: collision with root package name */
    public B3.a f19569b;

    /* renamed from: c, reason: collision with root package name */
    public C2458a f19570c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return (deviceId.length() == 0 || c.f19567e.contains(deviceId)) ? false : true;
        }

        public a() {
        }
    }

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        B3.b m6 = amplitude.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        this.f19570c = new C2458a(cVar.C(), cVar.H(), cVar.M().w(), cVar.M().x());
        h(cVar);
    }

    @Override // D3.f
    public C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f(event);
        return event;
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19569b = aVar;
    }

    public final void f(C3.a aVar) {
        C3.d k6;
        C3.e r6;
        String q6;
        B3.b m6 = g().m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        if (aVar.M() == null) {
            aVar.B0(Long.valueOf(System.currentTimeMillis()));
            Unit unit = Unit.INSTANCE;
        }
        if (aVar.u() == null) {
            aVar.j0(UUID.randomUUID().toString());
            Unit unit2 = Unit.INSTANCE;
        }
        if (aVar.x() == null) {
            aVar.m0("amplitude-analytics-android/1.21.3");
            Unit unit3 = Unit.INSTANCE;
        }
        if (aVar.N() == null) {
            aVar.C0(g().w().c());
            Unit unit4 = Unit.INSTANCE;
        }
        if (aVar.l() == null) {
            aVar.a0(g().w().b());
            Unit unit5 = Unit.INSTANCE;
        }
        g M5 = cVar.M();
        if (cVar.F()) {
            M5.v(g.f17976b.a());
        }
        C2458a c2458a = null;
        if (M5.K()) {
            C2458a c2458a2 = this.f19570c;
            if (c2458a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a2 = null;
            }
            aVar.D0(c2458a2.s());
        }
        if (M5.H()) {
            C2458a c2458a3 = this.f19570c;
            if (c2458a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a3 = null;
            }
            aVar.p0(c2458a3.q());
        }
        if (M5.I()) {
            C2458a c2458a4 = this.f19570c;
            if (c2458a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a4 = null;
            }
            aVar.q0(c2458a4.r());
        }
        if (M5.A()) {
            C2458a c2458a5 = this.f19570c;
            if (c2458a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a5 = null;
            }
            aVar.Z(c2458a5.h());
        }
        if (M5.B()) {
            C2458a c2458a6 = this.f19570c;
            if (c2458a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a6 = null;
            }
            aVar.b0(c2458a6.n());
        }
        if (M5.C()) {
            C2458a c2458a7 = this.f19570c;
            if (c2458a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a7 = null;
            }
            aVar.c0(c2458a7.o());
        }
        if (M5.y()) {
            C2458a c2458a8 = this.f19570c;
            if (c2458a8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a8 = null;
            }
            aVar.V(c2458a8.j());
        }
        if (M5.E() && aVar.v() == null) {
            aVar.k0("$remote");
            Unit unit6 = Unit.INSTANCE;
        }
        if (M5.z() && aVar.v() != "$remote") {
            C2458a c2458a9 = this.f19570c;
            if (c2458a9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a9 = null;
            }
            aVar.X(c2458a9.k());
        }
        if (M5.F()) {
            C2458a c2458a10 = this.f19570c;
            if (c2458a10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a10 = null;
            }
            aVar.l0(c2458a10.m());
        }
        if (M5.J()) {
            aVar.t0("Android");
        }
        if (M5.G()) {
            C2458a c2458a11 = this.f19570c;
            if (c2458a11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a11 = null;
            }
            Location p6 = c2458a11.p();
            if (p6 != null) {
                aVar.n0(Double.valueOf(p6.getLatitude()));
                aVar.o0(Double.valueOf(p6.getLongitude()));
            }
        }
        if (M5.w()) {
            C2458a c2458a12 = this.f19570c;
            if (c2458a12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                c2458a12 = null;
            }
            String f6 = c2458a12.f();
            if (f6 != null) {
                aVar.P(f6);
            }
        }
        if (M5.x()) {
            C2458a c2458a13 = this.f19570c;
            if (c2458a13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            } else {
                c2458a = c2458a13;
            }
            String g6 = c2458a.g();
            if (g6 != null) {
                aVar.R(g6);
            }
        }
        if (aVar.C() == null && (q6 = g().m().q()) != null) {
            aVar.r0(q6);
            Unit unit7 = Unit.INSTANCE;
        }
        if (aVar.D() == null && (r6 = g().m().r()) != null) {
            aVar.s0(r6.a());
            Unit unit8 = Unit.INSTANCE;
        }
        if (aVar.t() != null || (k6 = g().m().k()) == null) {
            return;
        }
        aVar.i0(k6.a());
        Unit unit9 = Unit.INSTANCE;
    }

    public B3.a g() {
        B3.a aVar = this.f19569b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f19568a;
    }

    public final void h(o3.c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String E6 = configuration.E();
        if (E6 != null) {
            i(E6);
            return;
        }
        String b6 = g().w().b();
        C2458a c2458a = null;
        if (b6 == null || !f19566d.a(b6) || StringsKt.endsWith$default(b6, "S", false, 2, (Object) null)) {
            if (!configuration.K() && configuration.N()) {
                C2458a c2458a2 = this.f19570c;
                if (c2458a2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                    c2458a2 = null;
                }
                if (!c2458a2.t()) {
                    C2458a c2458a3 = this.f19570c;
                    if (c2458a3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                        c2458a3 = null;
                    }
                    String f6 = c2458a3.f();
                    if (f6 != null && f19566d.a(f6)) {
                        i(f6);
                        return;
                    }
                }
            }
            if (configuration.O()) {
                C2458a c2458a4 = this.f19570c;
                if (c2458a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                } else {
                    c2458a = c2458a4;
                }
                String g6 = c2458a.g();
                if (g6 != null && f19566d.a(g6)) {
                    i(g6 + 'S');
                    return;
                }
            }
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            i(uuid + 'R');
        }
    }

    public abstract void i(String str);
}
