package g3;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import e3.InterfaceC1269a;
import h3.C1461c;
import i3.InterfaceC1511b;
import java.util.UUID;

/* renamed from: g3.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1366A implements W2.g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f14846d = W2.k.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1511b f14847a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1269a f14848b;

    /* renamed from: c, reason: collision with root package name */
    public final f3.v f14849c;

    /* renamed from: g3.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1461c f14850a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f14851b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W2.f f14852c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f14853d;

        public a(C1461c c1461c, UUID uuid, W2.f fVar, Context context) {
            this.f14850a = c1461c;
            this.f14851b = uuid;
            this.f14852c = fVar;
            this.f14853d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f14850a.isCancelled()) {
                    String uuid = this.f14851b.toString();
                    f3.u n6 = C1366A.this.f14849c.n(uuid);
                    if (n6 == null || n6.f14118b.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C1366A.this.f14848b.a(uuid, this.f14852c);
                    this.f14853d.startService(androidx.work.impl.foreground.a.d(this.f14853d, f3.x.a(n6), this.f14852c));
                }
                this.f14850a.p(null);
            } catch (Throwable th) {
                this.f14850a.q(th);
            }
        }
    }

    public C1366A(WorkDatabase workDatabase, InterfaceC1269a interfaceC1269a, InterfaceC1511b interfaceC1511b) {
        this.f14848b = interfaceC1269a;
        this.f14847a = interfaceC1511b;
        this.f14849c = workDatabase.J();
    }

    @Override // W2.g
    public D6.g a(Context context, UUID uuid, W2.f fVar) {
        C1461c t6 = C1461c.t();
        this.f14847a.c(new a(t6, uuid, fVar, context));
        return t6;
    }
}
