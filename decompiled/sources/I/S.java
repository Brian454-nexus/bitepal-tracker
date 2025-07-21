package I;

import I.B0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class S implements B0 {

    /* renamed from: b, reason: collision with root package name */
    public static final S f2350b = new S(null);

    /* renamed from: a, reason: collision with root package name */
    public final D6.g f2351a;

    public S(Object obj) {
        this.f2351a = N.f.h(obj);
    }

    public static /* synthetic */ void c(S s6, B0.a aVar) {
        s6.getClass();
        try {
            aVar.a(s6.f2351a.get());
        } catch (InterruptedException | ExecutionException e6) {
            aVar.onError(e6);
        }
    }

    public static B0 f(Object obj) {
        return obj == null ? f2350b : new S(obj);
    }

    @Override // I.B0
    public void b(Executor executor, final B0.a aVar) {
        this.f2351a.c(new Runnable() { // from class: I.Q
            @Override // java.lang.Runnable
            public final void run() {
                S.c(S.this, aVar);
            }
        }, executor);
    }

    @Override // I.B0
    public D6.g d() {
        return this.f2351a;
    }

    @Override // I.B0
    public void e(B0.a aVar) {
    }
}
