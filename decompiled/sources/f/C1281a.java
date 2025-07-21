package f;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1281a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13984a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public volatile Context f13985b;

    public final void a(InterfaceC1282b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f13985b;
        if (context != null) {
            listener.a(context);
        }
        this.f13984a.add(listener);
    }

    public final void b() {
        this.f13985b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13985b = context;
        Iterator it = this.f13984a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1282b) it.next()).a(context);
        }
    }
}
