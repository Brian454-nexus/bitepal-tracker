package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class E implements InterfaceC1059k {

    /* renamed from: a, reason: collision with root package name */
    public final String f8984a;

    /* renamed from: b, reason: collision with root package name */
    public final C f8985b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8986c;

    public E(String key, C handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f8984a = key;
        this.f8985b = handle;
    }

    public final void a(y2.d registry, AbstractC1057i lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f8986c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f8986c = true;
        lifecycle.a(this);
        registry.h(this.f8984a, this.f8985b.c());
    }

    public final C b() {
        return this.f8985b;
    }

    @Override // androidx.lifecycle.InterfaceC1059k
    public void c(InterfaceC1061m source, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1057i.a.ON_DESTROY) {
            this.f8986c = false;
            source.getLifecycle().c(this);
        }
    }

    public final boolean d() {
        return this.f8986c;
    }
}
