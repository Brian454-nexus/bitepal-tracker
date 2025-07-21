package l1;

import f1.InterfaceC1286b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import l1.t;

/* renamed from: l1.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1743m {

    /* renamed from: l1.m$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f17010a;

        public a(Throwable th, int i6) {
            super(th);
            this.f17010a = i6;
        }
    }

    static void b(InterfaceC1743m interfaceC1743m, InterfaceC1743m interfaceC1743m2) {
        if (interfaceC1743m == interfaceC1743m2) {
            return;
        }
        if (interfaceC1743m2 != null) {
            interfaceC1743m2.c(null);
        }
        if (interfaceC1743m != null) {
            interfaceC1743m.g(null);
        }
    }

    UUID a();

    void c(t.a aVar);

    boolean d();

    Map e();

    int f();

    void g(t.a aVar);

    boolean h(String str);

    a i();

    InterfaceC1286b j();
}
