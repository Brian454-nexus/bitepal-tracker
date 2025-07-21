package T;

import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* renamed from: T.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0766v implements InterfaceC2343a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2343a f4866a;

    public void a(InterfaceC2343a interfaceC2343a) {
        this.f4866a = interfaceC2343a;
    }

    @Override // y0.InterfaceC2343a
    public void accept(Object obj) {
        Intrinsics.checkNotNull(this.f4866a, "Listener is not set.");
        this.f4866a.accept(obj);
    }
}
