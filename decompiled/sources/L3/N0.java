package L3;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0550v f3211b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0556y f3212c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0545s0 f3213d;

    /* renamed from: e, reason: collision with root package name */
    public final M0 f3214e = new M0(this, true);

    /* renamed from: f, reason: collision with root package name */
    public final M0 f3215f = new M0(this, false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f3216g;

    public N0(Context context, InterfaceC0550v interfaceC0550v, InterfaceC0557y0 interfaceC0557y0, T t6, InterfaceC0556y interfaceC0556y, InterfaceC0545s0 interfaceC0545s0) {
        this.f3210a = context;
        this.f3211b = interfaceC0550v;
        this.f3212c = interfaceC0556y;
        this.f3213d = interfaceC0545s0;
    }

    public static /* bridge */ /* synthetic */ T a(N0 n02) {
        n02.getClass();
        return null;
    }

    public final InterfaceC0550v d() {
        return this.f3211b;
    }

    public final void f() {
        this.f3214e.c(this.f3210a);
        this.f3215f.c(this.f3210a);
    }

    public final void g(boolean z6) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f3216g = z6;
        this.f3215f.a(this.f3210a, intentFilter2);
        if (this.f3216g) {
            this.f3214e.b(this.f3210a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f3214e.a(this.f3210a, intentFilter);
        }
    }
}
