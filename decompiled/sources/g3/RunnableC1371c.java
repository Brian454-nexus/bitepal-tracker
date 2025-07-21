package g3;

import W2.n;
import X2.E;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.List;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class RunnableC1371c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14872c = W2.k.i("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final X2.x f14873a;

    /* renamed from: b, reason: collision with root package name */
    public final X2.o f14874b;

    public RunnableC1371c(X2.x xVar) {
        this(xVar, new X2.o());
    }

    public static boolean b(X2.x xVar) {
        boolean c6 = c(xVar.g(), xVar.f(), (String[]) X2.x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(X2.E r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, W2.e r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.RunnableC1371c.c(X2.E, java.util.List, java.lang.String[], java.lang.String, W2.e):boolean");
    }

    public static boolean e(X2.x xVar) {
        List<X2.x> e6 = xVar.e();
        boolean z6 = false;
        if (e6 != null) {
            for (X2.x xVar2 : e6) {
                if (xVar2.j()) {
                    W2.k.e().k(f14872c, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                } else {
                    z6 |= e(xVar2);
                }
            }
        }
        return b(xVar) | z6;
    }

    public boolean a() {
        WorkDatabase r6 = this.f14873a.g().r();
        r6.e();
        try {
            boolean e6 = e(this.f14873a);
            r6.B();
            return e6;
        } finally {
            r6.i();
        }
    }

    public W2.n d() {
        return this.f14874b;
    }

    public void f() {
        E g6 = this.f14873a.g();
        X2.u.b(g6.k(), g6.r(), g6.p());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f14873a.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f14873a + ")");
            }
            if (a()) {
                AbstractC1384p.a(this.f14873a.g().j(), RescheduleReceiver.class, true);
                f();
            }
            this.f14874b.a(W2.n.f5585a);
        } catch (Throwable th) {
            this.f14874b.a(new n.b.a(th));
        }
    }

    public RunnableC1371c(X2.x xVar, X2.o oVar) {
        this.f14873a = xVar;
        this.f14874b = oVar;
    }
}
