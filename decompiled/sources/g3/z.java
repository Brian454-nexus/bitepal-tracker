package g3;

import android.content.Context;
import android.os.Build;
import h3.C1461c;
import i3.InterfaceC1511b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class z implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f14901g = W2.k.i("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final C1461c f14902a = C1461c.t();

    /* renamed from: b, reason: collision with root package name */
    public final Context f14903b;

    /* renamed from: c, reason: collision with root package name */
    public final f3.u f14904c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.c f14905d;

    /* renamed from: e, reason: collision with root package name */
    public final W2.g f14906e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1511b f14907f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1461c f14908a;

        public a(C1461c c1461c) {
            this.f14908a = c1461c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.this.f14902a.isCancelled()) {
                return;
            }
            try {
                W2.f fVar = (W2.f) this.f14908a.get();
                if (fVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + z.this.f14904c.f14119c + ") but did not provide ForegroundInfo");
                }
                W2.k.e().a(z.f14901g, "Updating notification for " + z.this.f14904c.f14119c);
                z zVar = z.this;
                zVar.f14902a.r(zVar.f14906e.a(zVar.f14903b, zVar.f14905d.e(), fVar));
            } catch (Throwable th) {
                z.this.f14902a.q(th);
            }
        }
    }

    public z(Context context, f3.u uVar, androidx.work.c cVar, W2.g gVar, InterfaceC1511b interfaceC1511b) {
        this.f14903b = context;
        this.f14904c = uVar;
        this.f14905d = cVar;
        this.f14906e = gVar;
        this.f14907f = interfaceC1511b;
    }

    public static /* synthetic */ void a(z zVar, C1461c c1461c) {
        if (zVar.f14902a.isCancelled()) {
            c1461c.cancel(true);
        } else {
            c1461c.r(zVar.f14905d.d());
        }
    }

    public D6.g b() {
        return this.f14902a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f14904c.f14133q || Build.VERSION.SDK_INT >= 31) {
            this.f14902a.p(null);
            return;
        }
        final C1461c t6 = C1461c.t();
        this.f14907f.a().execute(new Runnable() { // from class: g3.y
            @Override // java.lang.Runnable
            public final void run() {
                z.a(z.this, t6);
            }
        });
        t6.c(new a(t6), this.f14907f.a());
    }
}
