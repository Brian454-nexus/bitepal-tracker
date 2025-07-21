package androidx.work.impl.background.systemalarm;

import W2.k;
import X2.v;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import b3.C1089e;
import b3.InterfaceC1087c;
import d3.n;
import f3.m;
import f3.u;
import f3.x;
import g3.C1368C;
import g3.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements InterfaceC1087c, C1368C.a {

    /* renamed from: m */
    public static final String f10297m = k.i("DelayMetCommandHandler");

    /* renamed from: a */
    public final Context f10298a;

    /* renamed from: b */
    public final int f10299b;

    /* renamed from: c */
    public final m f10300c;

    /* renamed from: d */
    public final d f10301d;

    /* renamed from: e */
    public final C1089e f10302e;

    /* renamed from: f */
    public final Object f10303f;

    /* renamed from: g */
    public int f10304g;

    /* renamed from: h */
    public final Executor f10305h;

    /* renamed from: i */
    public final Executor f10306i;

    /* renamed from: j */
    public PowerManager.WakeLock f10307j;

    /* renamed from: k */
    public boolean f10308k;

    /* renamed from: l */
    public final v f10309l;

    public c(Context context, int i6, d dVar, v vVar) {
        this.f10298a = context;
        this.f10299b = i6;
        this.f10301d = dVar;
        this.f10300c = vVar.a();
        this.f10309l = vVar;
        n q6 = dVar.g().q();
        this.f10305h = dVar.f().b();
        this.f10306i = dVar.f().a();
        this.f10302e = new C1089e(q6, this);
        this.f10308k = false;
        this.f10304g = 0;
        this.f10303f = new Object();
    }

    @Override // g3.C1368C.a
    public void a(m mVar) {
        k.e().a(f10297m, "Exceeded time limits on execution for " + mVar);
        this.f10305h.execute(new Z2.b(this));
    }

    @Override // b3.InterfaceC1087c
    public void c(List list) {
        this.f10305h.execute(new Z2.b(this));
    }

    public final void e() {
        synchronized (this.f10303f) {
            try {
                this.f10302e.a();
                this.f10301d.h().b(this.f10300c);
                PowerManager.WakeLock wakeLock = this.f10307j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    k.e().a(f10297m, "Releasing wakelock " + this.f10307j + "for WorkSpec " + this.f10300c);
                    this.f10307j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b3.InterfaceC1087c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (x.a((u) it.next()).equals(this.f10300c)) {
                this.f10305h.execute(new Runnable() { // from class: Z2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.background.systemalarm.c.this.i();
                    }
                });
                return;
            }
        }
    }

    public void g() {
        String b6 = this.f10300c.b();
        this.f10307j = w.b(this.f10298a, b6 + " (" + this.f10299b + ")");
        k e6 = k.e();
        String str = f10297m;
        e6.a(str, "Acquiring wakelock " + this.f10307j + "for WorkSpec " + b6);
        this.f10307j.acquire();
        u n6 = this.f10301d.g().r().J().n(b6);
        if (n6 == null) {
            this.f10305h.execute(new Z2.b(this));
            return;
        }
        boolean h6 = n6.h();
        this.f10308k = h6;
        if (h6) {
            this.f10302e.b(Collections.singletonList(n6));
            return;
        }
        k.e().a(str, "No constraints for " + b6);
        f(Collections.singletonList(n6));
    }

    public void h(boolean z6) {
        k.e().a(f10297m, "onExecuted " + this.f10300c + ", " + z6);
        e();
        if (z6) {
            this.f10306i.execute(new d.b(this.f10301d, a.e(this.f10298a, this.f10300c), this.f10299b));
        }
        if (this.f10308k) {
            this.f10306i.execute(new d.b(this.f10301d, a.a(this.f10298a), this.f10299b));
        }
    }

    public final void i() {
        if (this.f10304g != 0) {
            k.e().a(f10297m, "Already started work for " + this.f10300c);
            return;
        }
        this.f10304g = 1;
        k.e().a(f10297m, "onAllConstraintsMet for " + this.f10300c);
        if (this.f10301d.e().n(this.f10309l)) {
            this.f10301d.h().a(this.f10300c, 600000L, this);
        } else {
            e();
        }
    }

    public final void j() {
        String b6 = this.f10300c.b();
        if (this.f10304g >= 2) {
            k.e().a(f10297m, "Already stopped work for " + b6);
            return;
        }
        this.f10304g = 2;
        k e6 = k.e();
        String str = f10297m;
        e6.a(str, "Stopping work for WorkSpec " + b6);
        this.f10306i.execute(new d.b(this.f10301d, a.f(this.f10298a, this.f10300c), this.f10299b));
        if (!this.f10301d.e().k(this.f10300c.b())) {
            k.e().a(str, "Processor does not have WorkSpec " + b6 + ". No need to reschedule");
            return;
        }
        k.e().a(str, "WorkSpec " + b6 + " needs to be rescheduled");
        this.f10306i.execute(new d.b(this.f10301d, a.e(this.f10298a, this.f10300c), this.f10299b));
    }
}
