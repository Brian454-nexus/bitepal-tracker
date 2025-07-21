package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.C1050b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class y implements InterfaceC1059k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9105a;

    /* renamed from: b, reason: collision with root package name */
    public final C1050b.a f9106b;

    public y(Object obj) {
        this.f9105a = obj;
        this.f9106b = C1050b.f9027c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1059k
    public void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
        this.f9106b.a(interfaceC1061m, aVar, this.f9105a);
    }
}
