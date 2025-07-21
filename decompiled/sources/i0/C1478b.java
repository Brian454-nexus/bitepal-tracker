package i0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1478b implements InterfaceC1480d {
    @Override // i0.InterfaceC1480d
    public ColorStateList a(InterfaceC1479c interfaceC1479c) {
        return o(interfaceC1479c).b();
    }

    @Override // i0.InterfaceC1480d
    public void b(InterfaceC1479c interfaceC1479c, float f6) {
        o(interfaceC1479c).h(f6);
    }

    @Override // i0.InterfaceC1480d
    public float c(InterfaceC1479c interfaceC1479c) {
        return o(interfaceC1479c).c();
    }

    @Override // i0.InterfaceC1480d
    public void d(InterfaceC1479c interfaceC1479c, float f6) {
        o(interfaceC1479c).g(f6, interfaceC1479c.c(), interfaceC1479c.b());
        p(interfaceC1479c);
    }

    @Override // i0.InterfaceC1480d
    public float e(InterfaceC1479c interfaceC1479c) {
        return n(interfaceC1479c) * 2.0f;
    }

    @Override // i0.InterfaceC1480d
    public float f(InterfaceC1479c interfaceC1479c) {
        return n(interfaceC1479c) * 2.0f;
    }

    @Override // i0.InterfaceC1480d
    public void g(InterfaceC1479c interfaceC1479c, float f6) {
        interfaceC1479c.e().setElevation(f6);
    }

    @Override // i0.InterfaceC1480d
    public float h(InterfaceC1479c interfaceC1479c) {
        return interfaceC1479c.e().getElevation();
    }

    @Override // i0.InterfaceC1480d
    public void i(InterfaceC1479c interfaceC1479c) {
        d(interfaceC1479c, c(interfaceC1479c));
    }

    @Override // i0.InterfaceC1480d
    public void j() {
    }

    @Override // i0.InterfaceC1480d
    public void k(InterfaceC1479c interfaceC1479c) {
        d(interfaceC1479c, c(interfaceC1479c));
    }

    @Override // i0.InterfaceC1480d
    public void l(InterfaceC1479c interfaceC1479c, ColorStateList colorStateList) {
        o(interfaceC1479c).f(colorStateList);
    }

    @Override // i0.InterfaceC1480d
    public void m(InterfaceC1479c interfaceC1479c, Context context, ColorStateList colorStateList, float f6, float f7, float f8) {
        interfaceC1479c.a(new C1481e(colorStateList, f6));
        View e6 = interfaceC1479c.e();
        e6.setClipToOutline(true);
        e6.setElevation(f7);
        d(interfaceC1479c, f8);
    }

    @Override // i0.InterfaceC1480d
    public float n(InterfaceC1479c interfaceC1479c) {
        return o(interfaceC1479c).d();
    }

    public final C1481e o(InterfaceC1479c interfaceC1479c) {
        return (C1481e) interfaceC1479c.d();
    }

    public void p(InterfaceC1479c interfaceC1479c) {
        if (!interfaceC1479c.c()) {
            interfaceC1479c.f(0, 0, 0, 0);
            return;
        }
        float c6 = c(interfaceC1479c);
        float n6 = n(interfaceC1479c);
        int ceil = (int) Math.ceil(AbstractC1482f.a(c6, n6, interfaceC1479c.b()));
        int ceil2 = (int) Math.ceil(AbstractC1482f.b(c6, n6, interfaceC1479c.b()));
        interfaceC1479c.f(ceil, ceil2, ceil, ceil2);
    }
}
