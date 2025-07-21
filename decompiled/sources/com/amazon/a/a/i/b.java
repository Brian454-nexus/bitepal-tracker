package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b extends com.amazon.a.a.e.c<b> {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10924b = new com.amazon.a.a.o.c("Prompt");

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f10925c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10926d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f10927e;

    /* renamed from: f, reason: collision with root package name */
    private d f10928f;

    /* renamed from: g, reason: collision with root package name */
    private Dialog f10929g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f10930h = new AtomicBoolean(false);

    public b() {
        int i6 = i();
        this.f10926d = i6;
        if (com.amazon.a.a.o.c.f11253a) {
            f10924b.a("Creating Prompt: " + i6);
        }
    }

    private boolean e(Activity activity) {
        if (this.f10925c.b(com.amazon.a.a.m.c.f11028e)) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10924b.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f10927e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int nextInt = new Random().nextInt(2146249079) + 1234567;
        if (nextInt <= 1234567) {
            return 1234567;
        }
        return nextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.f11253a) {
            f10924b.b("Dismissing dialog: " + this.f10926d);
        }
        try {
            this.f10927e.dismissDialog(this.f10926d);
            this.f10927e.removeDialog(this.f10926d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10924b.b("Unable to remove dialog: " + this.f10926d);
            }
        }
        this.f10927e = null;
        this.f10929g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.NOT_COMPATIBLE);
        }
    }

    public abstract void a(d dVar);

    public boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.f10927e = activity;
        Dialog d6 = d(activity);
        this.f10929g = d6;
        d6.setCancelable(false);
        this.f10929g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.a.a.i.b.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
                return i6 == 84;
            }
        });
        return this.f10929g;
    }

    public abstract Dialog d(Activity activity);

    @Override // com.amazon.a.a.e.a
    public final void d() {
        if (com.amazon.a.a.o.c.f11253a) {
            f10924b.a("Expiring prompt: " + this);
        }
        this.f10888a.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.b.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                b.this.k();
            }

            public String toString() {
                return "DismissPromptTask: " + b.this.toString();
            }
        });
        a(l());
    }

    public int j() {
        return this.f10926d;
    }

    public final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f10924b.a("Dismissing Prompt: " + this.f10926d);
        }
        if (!this.f10930h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10924b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f10927e != null) {
            m();
        }
        f();
        return true;
    }

    public d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f10928f;
        return dVar == null ? d.EXPIRATION_DURATION_ELAPSED : dVar;
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10924b.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f10928f = dVar;
        c();
    }

    public void a(Activity activity, boolean z6) {
        if (activity != this.f10927e) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10924b.a("Unrecognized context");
            }
        } else {
            if (!z6 || this.f10929g.isShowing()) {
                return;
            }
            if (com.amazon.a.a.o.c.f11253a) {
                f10924b.a("showing dialog because it was not showing");
            }
            this.f10929g.show();
        }
    }
}
