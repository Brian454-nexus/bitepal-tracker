package g3;

import X2.E;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class u implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f14892d = W2.k.i("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final E f14893a;

    /* renamed from: b, reason: collision with root package name */
    public final X2.v f14894b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14895c;

    public u(E e6, X2.v vVar, boolean z6) {
        this.f14893a = e6;
        this.f14894b = vVar;
        this.f14895c = z6;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean r6 = this.f14895c ? this.f14893a.o().r(this.f14894b) : this.f14893a.o().s(this.f14894b);
        W2.k.e().a(f14892d, "StopWorkRunnable for " + this.f14894b.a().b() + "; Processor.stopWork = " + r6);
    }
}
