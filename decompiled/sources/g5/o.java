package g5;

import P0.AbstractActivityC0712u;
import a5.u;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import j0.C1638a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class o implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final b f14942f = new a();

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.l f14943a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14944b;

    /* renamed from: c, reason: collision with root package name */
    public final C1638a f14945c = new C1638a();

    /* renamed from: d, reason: collision with root package name */
    public final i f14946d;

    /* renamed from: e, reason: collision with root package name */
    public final m f14947e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b {
        @Override // g5.o.b
        public com.bumptech.glide.l a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.l(bVar, jVar, pVar, context);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        com.bumptech.glide.l a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f14942f : bVar;
        this.f14944b = bVar;
        this.f14947e = new m(bVar);
        this.f14946d = b();
    }

    public static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static i b() {
        return (u.f7785f && u.f7784e) ? new h() : new f();
    }

    public static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(Context context) {
        Activity c6 = c(context);
        return c6 == null || !c6.isFinishing();
    }

    public com.bumptech.glide.l d(AbstractActivityC0712u abstractActivityC0712u) {
        if (n5.l.r()) {
            return e(abstractActivityC0712u.getApplicationContext());
        }
        a(abstractActivityC0712u);
        this.f14946d.a(abstractActivityC0712u);
        boolean g6 = g(abstractActivityC0712u);
        return this.f14947e.b(abstractActivityC0712u, com.bumptech.glide.b.c(abstractActivityC0712u.getApplicationContext()), abstractActivityC0712u.getLifecycle(), abstractActivityC0712u.getSupportFragmentManager(), g6);
    }

    public com.bumptech.glide.l e(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (n5.l.s() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0712u) {
                return d((AbstractActivityC0712u) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return e(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public final com.bumptech.glide.l f(Context context) {
        if (this.f14943a == null) {
            synchronized (this) {
                try {
                    if (this.f14943a == null) {
                        this.f14943a = this.f14944b.a(com.bumptech.glide.b.c(context.getApplicationContext()), new C1387a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f14943a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
