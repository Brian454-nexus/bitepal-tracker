package v2;

import A2.h;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19555a;

    /* renamed from: b, reason: collision with root package name */
    public final File f19556b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f19557c;

    /* renamed from: d, reason: collision with root package name */
    public final h.c f19558d;

    public z(String str, File file, Callable callable, h.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f19555a = str;
        this.f19556b = file;
        this.f19557c = callable;
        this.f19558d = mDelegate;
    }

    @Override // A2.h.c
    public A2.h a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new y(configuration.f186a, this.f19555a, this.f19556b, this.f19557c, configuration.f188c.f184a, this.f19558d.a(configuration));
    }
}
