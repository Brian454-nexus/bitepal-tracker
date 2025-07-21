package z3;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2459b implements InterfaceC2355a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21719c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final C2459b f21720d = new C2459b();

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2355a.EnumC0276a f21721a = InterfaceC2355a.EnumC0276a.f21223b;

    /* renamed from: b, reason: collision with root package name */
    public final String f21722b = "Amplitude";

    /* renamed from: z3.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2459b a() {
            return C2459b.f21720d;
        }

        public a() {
        }
    }

    @Override // y3.InterfaceC2355a
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (g().compareTo(InterfaceC2355a.EnumC0276a.f21225d) <= 0) {
            Log.e(this.f21722b, message);
        }
    }

    @Override // y3.InterfaceC2355a
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (g().compareTo(InterfaceC2355a.EnumC0276a.f21222a) <= 0) {
            Log.d(this.f21722b, message);
        }
    }

    @Override // y3.InterfaceC2355a
    public void c(InterfaceC2355a.EnumC0276a enumC0276a) {
        Intrinsics.checkNotNullParameter(enumC0276a, "<set-?>");
        this.f21721a = enumC0276a;
    }

    @Override // y3.InterfaceC2355a
    public void d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (g().compareTo(InterfaceC2355a.EnumC0276a.f21223b) <= 0) {
            Log.i(this.f21722b, message);
        }
    }

    @Override // y3.InterfaceC2355a
    public void e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (g().compareTo(InterfaceC2355a.EnumC0276a.f21224c) <= 0) {
            Log.w(this.f21722b, message);
        }
    }

    public InterfaceC2355a.EnumC0276a g() {
        return this.f21721a;
    }
}
