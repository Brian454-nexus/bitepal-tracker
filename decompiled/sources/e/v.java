package e;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13560a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13561b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Function0 f13562c;

    public v(boolean z6) {
        this.f13560a = z6;
    }

    public final void a(InterfaceC1209c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f13561b.add(cancellable);
    }

    public final Function0 b() {
        return this.f13562c;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(C1208b c1208b);

    public abstract void f(C1208b c1208b);

    public final boolean g() {
        return this.f13560a;
    }

    public final void h() {
        Iterator it = this.f13561b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1209c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC1209c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f13561b.remove(cancellable);
    }

    public final void j(boolean z6) {
        this.f13560a = z6;
        Function0 function0 = this.f13562c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0 function0) {
        this.f13562c = function0;
    }
}
