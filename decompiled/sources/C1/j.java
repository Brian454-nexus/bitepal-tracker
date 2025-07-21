package C1;

import android.view.Surface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j extends p1.m {

    /* renamed from: d, reason: collision with root package name */
    public final int f530d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f531e;

    public j(Throwable th, p1.n nVar, Surface surface) {
        super(th, nVar);
        this.f530d = System.identityHashCode(surface);
        this.f531e = surface == null || surface.isValid();
    }
}
