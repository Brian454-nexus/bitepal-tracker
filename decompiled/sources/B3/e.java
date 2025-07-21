package B3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f369a;

    /* renamed from: b, reason: collision with root package name */
    public String f370b;

    /* renamed from: c, reason: collision with root package name */
    public final List f371c = new ArrayList();

    public final boolean a(D3.e plugin, a amplitude) {
        boolean add;
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        synchronized (this.f371c) {
            plugin.a(amplitude);
            add = this.f371c.add(plugin);
        }
        return add;
    }

    public final String b() {
        return this.f370b;
    }

    public final String c() {
        return this.f369a;
    }

    public final void d(String str) {
        this.f370b = str;
        Iterator it = this.f371c.iterator();
        while (it.hasNext()) {
            ((D3.e) it.next()).e(str);
        }
    }

    public final void e(String str) {
        this.f369a = str;
        Iterator it = this.f371c.iterator();
        while (it.hasNext()) {
            ((D3.e) it.next()).f(str);
        }
    }
}
