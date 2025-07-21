package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class D implements InterfaceC1059k {

    /* renamed from: a, reason: collision with root package name */
    public final G f8983a;

    public D(G provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f8983a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1059k
    public void c(InterfaceC1061m source, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1057i.a.ON_CREATE) {
            source.getLifecycle().c(this);
            this.f8983a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
