package U0;

import U0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // U0.a
    public Object a(a.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b().get(key);
    }

    public final void c(a.b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b().put(key, obj);
    }

    public b(a initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ b(a aVar, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? a.C0088a.f5164b : aVar);
    }
}
