package X;

import android.content.Context;
import java.util.concurrent.Executor;
import y0.InterfaceC2343a;

/* renamed from: X.t, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0810t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5962a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f5963b;

    /* renamed from: c, reason: collision with root package name */
    public final r f5964c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2343a f5965d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f5966e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5967f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5968g = false;

    public C0810t(Context context, Q q6, r rVar) {
        this.f5962a = L.f.a(context);
        this.f5963b = q6;
        this.f5964c = rVar;
    }

    public Context a() {
        return this.f5962a;
    }

    public InterfaceC2343a b() {
        return this.f5965d;
    }

    public Executor c() {
        return this.f5966e;
    }

    public r d() {
        return this.f5964c;
    }

    public Q e() {
        return this.f5963b;
    }

    public boolean f() {
        return this.f5967f;
    }

    public boolean g() {
        return this.f5968g;
    }

    public Z h(Executor executor, InterfaceC2343a interfaceC2343a) {
        y0.g.g(executor, "Listener Executor can't be null.");
        y0.g.g(interfaceC2343a, "Event listener can't be null");
        this.f5966e = executor;
        this.f5965d = interfaceC2343a;
        return this.f5963b.r0(this);
    }

    public C0810t i() {
        if (n0.e.b(this.f5962a, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        y0.g.i(this.f5963b.J(), "The Recorder this recording is associated to doesn't support audio.");
        this.f5967f = true;
        return this;
    }
}
