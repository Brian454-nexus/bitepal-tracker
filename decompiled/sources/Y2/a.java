package Y2;

import W2.k;
import W2.s;
import f3.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6523d = k.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f6524a;

    /* renamed from: b, reason: collision with root package name */
    public final s f6525b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6526c = new HashMap();

    /* renamed from: Y2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class RunnableC0111a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f6527a;

        public RunnableC0111a(u uVar) {
            this.f6527a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.e().a(a.f6523d, "Scheduling work " + this.f6527a.f14117a);
            a.this.f6524a.a(this.f6527a);
        }
    }

    public a(b bVar, s sVar) {
        this.f6524a = bVar;
        this.f6525b = sVar;
    }

    public void a(u uVar) {
        Runnable runnable = (Runnable) this.f6526c.remove(uVar.f14117a);
        if (runnable != null) {
            this.f6525b.b(runnable);
        }
        RunnableC0111a runnableC0111a = new RunnableC0111a(uVar);
        this.f6526c.put(uVar.f14117a, runnableC0111a);
        this.f6525b.a(uVar.c() - System.currentTimeMillis(), runnableC0111a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f6526c.remove(str);
        if (runnable != null) {
            this.f6525b.b(runnable);
        }
    }
}
