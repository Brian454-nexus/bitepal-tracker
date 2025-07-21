package v2;

import A2.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final h.c f19406a;

    /* renamed from: b, reason: collision with root package name */
    public final C2165c f19407b;

    public e(h.c delegate, C2165c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f19406a = delegate;
        this.f19407b = autoCloser;
    }

    @Override // A2.h.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(this.f19406a.a(configuration), this.f19407b);
    }
}
