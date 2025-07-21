package g5;

import android.content.Context;
import g5.InterfaceC1388b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements InterfaceC1388b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14926a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1388b.a f14927b;

    public d(Context context, InterfaceC1388b.a aVar) {
        this.f14926a = context.getApplicationContext();
        this.f14927b = aVar;
    }

    @Override // g5.l
    public void a() {
        b();
    }

    public final void b() {
        r.a(this.f14926a).d(this.f14927b);
    }

    public final void c() {
        r.a(this.f14926a).e(this.f14927b);
    }

    @Override // g5.l
    public void f() {
    }

    @Override // g5.l
    public void j() {
        c();
    }
}
