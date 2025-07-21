package D3;

import D3.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public B3.a f760c;

    /* renamed from: a, reason: collision with root package name */
    public final f.a f758a = f.a.f799c;

    /* renamed from: b, reason: collision with root package name */
    public final g f759b = new g();

    /* renamed from: d, reason: collision with root package name */
    public boolean f761d = true;

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        this.f759b.g(amplitude);
    }

    @Override // D3.f
    public final C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f760c = aVar;
    }

    public final void e(f plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        plugin.d(f());
        this.f759b.a(plugin);
    }

    public B3.a f() {
        B3.a aVar = this.f760c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    public final C3.a g(C3.a aVar) {
        if (!this.f761d) {
            return null;
        }
        C3.a d6 = this.f759b.d(f.a.f798b, this.f759b.d(f.a.f797a, aVar));
        if (d6 != null) {
            return b(d6);
        }
        return null;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f758a;
    }
}
