package u3;

import J3.k;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* renamed from: u3.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2143e {

    /* renamed from: a, reason: collision with root package name */
    public final k f19189a;

    /* renamed from: b, reason: collision with root package name */
    public final k f19190b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2355a f19191c;

    public C2143e(k source, k destination, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f19189a = source;
        this.f19190b = destination;
        this.f19191c = logger;
    }

    public final void a() {
        try {
            J3.e a6 = this.f19189a.a();
            this.f19191c.b("Loaded old identity: " + a6);
            if (a6.b() != null) {
                this.f19190b.c(a6.b());
            }
            if (a6.a() != null) {
                this.f19190b.b(a6.a());
            }
        } catch (Exception e6) {
            this.f19191c.a("Unable to migrate file identity storage: " + e6.getMessage());
        }
    }
}
