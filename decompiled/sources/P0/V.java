package P0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.C1062n;
import androidx.lifecycle.InterfaceC1055g;
import androidx.lifecycle.N;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class V implements InterfaceC1055g, y2.f, androidx.lifecycle.Q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0708p f4091a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.P f4092b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4093c;

    /* renamed from: d, reason: collision with root package name */
    public C1062n f4094d = null;

    /* renamed from: e, reason: collision with root package name */
    public y2.e f4095e = null;

    public V(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, androidx.lifecycle.P p6, Runnable runnable) {
        this.f4091a = abstractComponentCallbacksC0708p;
        this.f4092b = p6;
        this.f4093c = runnable;
    }

    public void a(AbstractC1057i.a aVar) {
        this.f4094d.h(aVar);
    }

    public void b() {
        if (this.f4094d == null) {
            this.f4094d = new C1062n(this);
            y2.e a6 = y2.e.a(this);
            this.f4095e = a6;
            a6.c();
            this.f4093c.run();
        }
    }

    public boolean c() {
        return this.f4094d != null;
    }

    public void d(Bundle bundle) {
        this.f4095e.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f4095e.e(bundle);
    }

    public void f(AbstractC1057i.b bVar) {
        this.f4094d.m(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1055g
    public U0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4091a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        U0.b bVar = new U0.b();
        if (application != null) {
            bVar.c(N.a.f9017h, application);
        }
        bVar.c(androidx.lifecycle.F.f8987a, this.f4091a);
        bVar.c(androidx.lifecycle.F.f8988b, this);
        if (this.f4091a.getArguments() != null) {
            bVar.c(androidx.lifecycle.F.f8989c, this.f4091a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1061m
    public AbstractC1057i getLifecycle() {
        b();
        return this.f4094d;
    }

    @Override // y2.f
    public y2.d getSavedStateRegistry() {
        b();
        return this.f4095e.b();
    }

    @Override // androidx.lifecycle.Q
    public androidx.lifecycle.P getViewModelStore() {
        b();
        return this.f4092b;
    }
}
