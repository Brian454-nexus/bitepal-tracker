package L3;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.concurrent.Callable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0548u f3208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f3209c;

    public N(com.android.billingclient.api.b bVar, String str, InterfaceC0548u interfaceC0548u) {
        this.f3207a = str;
        this.f3208b = interfaceC0548u;
        this.f3209c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        E0 i02;
        i02 = this.f3209c.i0(this.f3207a, 9);
        if (i02.b() != null) {
            this.f3208b.onQueryPurchasesResponse(i02.a(), i02.b());
            return null;
        }
        this.f3208b.onQueryPurchasesResponse(i02.a(), zzco.zzl());
        return null;
    }
}
