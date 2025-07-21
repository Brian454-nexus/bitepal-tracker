package A3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements InterfaceC2355a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0005a f196b = new C0005a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final a f197c = new a();

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2355a.EnumC0276a f198a = InterfaceC2355a.EnumC0276a.f21223b;

    /* renamed from: A3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0005a {
        public /* synthetic */ C0005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f197c;
        }

        public C0005a() {
        }
    }

    @Override // y3.InterfaceC2355a
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(InterfaceC2355a.EnumC0276a.f21225d, message);
    }

    @Override // y3.InterfaceC2355a
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(InterfaceC2355a.EnumC0276a.f21222a, message);
    }

    @Override // y3.InterfaceC2355a
    public void c(InterfaceC2355a.EnumC0276a enumC0276a) {
        Intrinsics.checkNotNullParameter(enumC0276a, "<set-?>");
        this.f198a = enumC0276a;
    }

    @Override // y3.InterfaceC2355a
    public void d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(InterfaceC2355a.EnumC0276a.f21223b, message);
    }

    @Override // y3.InterfaceC2355a
    public void e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(InterfaceC2355a.EnumC0276a.f21224c, message);
    }

    public InterfaceC2355a.EnumC0276a g() {
        return this.f198a;
    }

    public final void h(InterfaceC2355a.EnumC0276a enumC0276a, String str) {
        if (g().compareTo(enumC0276a) <= 0) {
            System.out.println((Object) str);
        }
    }
}
