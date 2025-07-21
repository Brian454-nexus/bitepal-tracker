package L3;

import java.util.concurrent.Callable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class O implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0546t f3218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f3219c;

    public O(com.android.billingclient.api.b bVar, String str, InterfaceC0546t interfaceC0546t) {
        this.f3217a = str;
        this.f3218b = interfaceC0546t;
        this.f3219c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Y H02;
        H02 = this.f3219c.H0(this.f3217a);
        this.f3218b.a(H02.a(), H02.b());
        return null;
    }
}
