package J3;

import java.io.File;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final C0050a f2876c = new C0050a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f2877a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.c f2878b;

    /* renamed from: J3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0050a {
        public /* synthetic */ C0050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0050a() {
        }
    }

    public a(f configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f2877a = configuration;
        File g6 = configuration.g();
        K3.a.a(g6);
        K3.c cVar = new K3.c(g6, configuration.c(), configuration.f());
        this.f2878b = cVar;
        cVar.d();
        e();
    }

    @Override // J3.k
    public e a() {
        return new e(this.f2878b.c("user_id", null), this.f2878b.c("device_id", null));
    }

    @Override // J3.k
    public void b(String str) {
        K3.c cVar = this.f2878b;
        if (str == null) {
            str = "";
        }
        cVar.e("device_id", str);
    }

    @Override // J3.k
    public void c(String str) {
        K3.c cVar = this.f2878b;
        if (str == null) {
            str = "";
        }
        cVar.e("user_id", str);
    }

    public final boolean d(String str, String str2) {
        String c6;
        if (str2 == null || (c6 = this.f2878b.c(str, null)) == null) {
            return true;
        }
        return Intrinsics.areEqual(c6, str2);
    }

    public final void e() {
        if (!d("api_key", this.f2877a.a()) || !d("experiment_api_key", this.f2877a.b())) {
            this.f2878b.f(CollectionsKt.listOf(new String[]{"user_id", "device_id", "api_key", "experiment_api_key"}));
        }
        String a6 = this.f2877a.a();
        if (a6 != null) {
            this.f2878b.e("api_key", a6);
        }
        String b6 = this.f2877a.b();
        if (b6 != null) {
            this.f2878b.e("experiment_api_key", b6);
        }
    }
}
