package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f extends com.amazon.a.a.i.b {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11088b = new com.amazon.a.a.o.c("DecisionDialog");

    /* renamed from: d, reason: collision with root package name */
    private final b f11090d;

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<a> f11091e = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Thread f11089c = Thread.currentThread();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.amazon.d.a.a f11094a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11095b;

        /* renamed from: c, reason: collision with root package name */
        private final Intent f11096c;

        public a(com.amazon.d.a.a aVar) {
            this.f11094a = aVar;
            this.f11095b = aVar.a();
            this.f11096c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f11094a;
        }

        public String b() {
            return this.f11095b;
        }

        public Intent c() {
            return this.f11096c;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f11097a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11098b;

        /* renamed from: c, reason: collision with root package name */
        private final long f11099c;

        /* renamed from: d, reason: collision with root package name */
        private final a f11100d;

        /* renamed from: e, reason: collision with root package name */
        private final a f11101e;

        /* renamed from: f, reason: collision with root package name */
        private final a f11102f;

        public b(com.amazon.d.a.f fVar) {
            this.f11097a = fVar.b();
            this.f11098b = fVar.c();
            this.f11099c = fVar.d();
            this.f11100d = a(fVar.e());
            this.f11101e = a(fVar.f());
            this.f11102f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String b() {
            return this.f11098b;
        }

        public long c() {
            return this.f11099c;
        }

        public a d() {
            return this.f11102f;
        }

        public a e() {
            return this.f11101e;
        }

        public a f() {
            return this.f11100d;
        }

        public String a() {
            return this.f11097a;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f11090d = new b(fVar);
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!com.amazon.a.a.o.c.f11254b) {
                return null;
            }
            f11088b.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f11090d.a()).setMessage(this.f11090d.b()).setCancelable(false);
        AlertDialog create = builder.create();
        a(activity, create, this.f11090d.f(), -1);
        a(activity, create, this.f11090d.e(), -3);
        a(activity, create, this.f11090d.d(), -2);
        return create;
    }

    private com.amazon.d.a.a n() {
        try {
            if (com.amazon.a.a.o.c.f11253a) {
                f11088b.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f11091e.take().a();
        } catch (InterruptedException unused) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11088b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new com.amazon.a.a.n.a.a.e(o());
        }
    }

    private e o() {
        return l() == com.amazon.a.a.i.d.NOT_COMPATIBLE ? e.APP_NOT_COMPATIBLE : e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        return a(this.f11090d.f()) || a(this.f11090d.e()) || a(this.f11090d.d());
    }

    @Override // com.amazon.a.a.i.b
    public Dialog d(Activity activity) {
        return f(activity);
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return this.f11090d.c();
    }

    public com.amazon.d.a.a i() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11088b.a("GetCustomerDecision: " + this.f11089c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f11090d.a();
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo e6 = e(activity);
        if (e6 == null) {
            return false;
        }
        boolean z6 = e6.launchMode == 3;
        com.amazon.a.a.o.c cVar = f11088b;
        cVar.a("Single instance: " + z6);
        boolean z7 = (e6.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z7);
        boolean z8 = (e6.flags & 128) != 0;
        cVar.a("No History: " + z8);
        return (z6 || z7 || z8) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public void a(com.amazon.a.a.i.d dVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11088b.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f11089c.interrupt();
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i6) {
        if (aVar == null) {
            return;
        }
        alertDialog.setButton(i6, aVar.b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f.f11088b.a("Choice selected!");
                }
                if (f.this.k()) {
                    f.this.f11091e.add(aVar);
                }
            }
        });
    }
}
