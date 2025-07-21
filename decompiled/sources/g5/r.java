package g5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import g5.InterfaceC1388b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n5.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static volatile r f14951d;

    /* renamed from: a, reason: collision with root package name */
    public final c f14952a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f14953b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14954c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f14955a;

        public a(Context context) {
            this.f14955a = context;
        }

        @Override // n5.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f14955a.getSystemService("connectivity");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements InterfaceC1388b.a {
        public b() {
        }

        @Override // g5.InterfaceC1388b.a
        public void a(boolean z6) {
            ArrayList arrayList;
            n5.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f14953b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1388b.a) it.next()).a(z6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        boolean a();

        void b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14958a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1388b.a f14959b;

        /* renamed from: c, reason: collision with root package name */
        public final f.b f14960c;

        /* renamed from: d, reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f14961d = new a();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: g5.r$d$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public class RunnableC0201a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f14963a;

                public RunnableC0201a(boolean z6) {
                    this.f14963a = z6;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f14963a);
                }
            }

            public a() {
            }

            public void a(boolean z6) {
                n5.l.b();
                d dVar = d.this;
                boolean z7 = dVar.f14958a;
                dVar.f14958a = z6;
                if (z7 != z6) {
                    dVar.f14959b.a(z6);
                }
            }

            public final void b(boolean z6) {
                n5.l.v(new RunnableC0201a(z6));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        public d(f.b bVar, InterfaceC1388b.a aVar) {
            this.f14960c = bVar;
            this.f14959b = aVar;
        }

        @Override // g5.r.c
        public boolean a() {
            this.f14958a = ((ConnectivityManager) this.f14960c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f14960c.get()).registerDefaultNetworkCallback(this.f14961d);
                return true;
            } catch (RuntimeException e6) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e6);
                }
                return false;
            }
        }

        @Override // g5.r.c
        public void b() {
            ((ConnectivityManager) this.f14960c.get()).unregisterNetworkCallback(this.f14961d);
        }
    }

    public r(Context context) {
        this.f14952a = new d(n5.f.a(new a(context)), new b());
    }

    public static r a(Context context) {
        if (f14951d == null) {
            synchronized (r.class) {
                try {
                    if (f14951d == null) {
                        f14951d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f14951d;
    }

    public final void b() {
        if (this.f14954c || this.f14953b.isEmpty()) {
            return;
        }
        this.f14954c = this.f14952a.a();
    }

    public final void c() {
        if (this.f14954c && this.f14953b.isEmpty()) {
            this.f14952a.b();
            this.f14954c = false;
        }
    }

    public synchronized void d(InterfaceC1388b.a aVar) {
        this.f14953b.add(aVar);
        b();
    }

    public synchronized void e(InterfaceC1388b.a aVar) {
        this.f14953b.remove(aVar);
        c();
    }
}
