package v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import v2.j;
import v2.k;
import v2.o;
import v2.r;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f19466a;

    /* renamed from: b, reason: collision with root package name */
    public final o f19467b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f19468c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f19469d;

    /* renamed from: e, reason: collision with root package name */
    public int f19470e;

    /* renamed from: f, reason: collision with root package name */
    public o.c f19471f;

    /* renamed from: g, reason: collision with root package name */
    public k f19472g;

    /* renamed from: h, reason: collision with root package name */
    public final j f19473h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f19474i;

    /* renamed from: j, reason: collision with root package name */
    public final ServiceConnection f19475j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f19476k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f19477l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends o.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // v2.o.c
        public boolean b() {
            return true;
        }

        @Override // v2.o.c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (r.this.j().get()) {
                return;
            }
            try {
                k h6 = r.this.h();
                if (h6 != null) {
                    int c6 = r.this.c();
                    Object[] array = tables.toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    h6.X(c6, (String[]) array);
                }
            } catch (RemoteException e6) {
                Log.w("ROOM", "Cannot broadcast invalidation", e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends j.a {
        public b() {
        }

        public static final void f(r this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.e().j((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // v2.j
        public void i(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor d6 = r.this.d();
            final r rVar = r.this;
            d6.execute(new Runnable() { // from class: v2.s
                @Override // java.lang.Runnable
                public final void run() {
                    r.b.f(r.this, tables);
                }
            });
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            r.this.m(k.a.b(service));
            r.this.d().execute(r.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            r.this.d().execute(r.this.g());
            r.this.m(null);
        }
    }

    public r(Context context, String name, Intent serviceIntent, o invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f19466a = name;
        this.f19467b = invalidationTracker;
        this.f19468c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f19469d = applicationContext;
        this.f19473h = new b();
        this.f19474i = new AtomicBoolean(false);
        c cVar = new c();
        this.f19475j = cVar;
        this.f19476k = new Runnable() { // from class: v2.p
            @Override // java.lang.Runnable
            public final void run() {
                r.n(r.this);
            }
        };
        this.f19477l = new Runnable() { // from class: v2.q
            @Override // java.lang.Runnable
            public final void run() {
                r.k(r.this);
            }
        };
        Object[] array = invalidationTracker.h().keySet().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void k(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f19467b.m(this$0.f());
    }

    public static final void n(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            k kVar = this$0.f19472g;
            if (kVar != null) {
                this$0.f19470e = kVar.E(this$0.f19473h, this$0.f19466a);
                this$0.f19467b.b(this$0.f());
            }
        } catch (RemoteException e6) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e6);
        }
    }

    public final int c() {
        return this.f19470e;
    }

    public final Executor d() {
        return this.f19468c;
    }

    public final o e() {
        return this.f19467b;
    }

    public final o.c f() {
        o.c cVar = this.f19471f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    public final Runnable g() {
        return this.f19477l;
    }

    public final k h() {
        return this.f19472g;
    }

    public final Runnable i() {
        return this.f19476k;
    }

    public final AtomicBoolean j() {
        return this.f19474i;
    }

    public final void l(o.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f19471f = cVar;
    }

    public final void m(k kVar) {
        this.f19472g = kVar;
    }
}
