package c1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: c1.t, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1138t {

    /* renamed from: e, reason: collision with root package name */
    public static C1138t f10633e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10634a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10635b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Object f10636c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f10637d = 0;

    /* renamed from: c1.t$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: c1.t$b$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            public final C1138t f10638a;

            public a(C1138t c1138t) {
                this.f10638a = c1138t;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f10638a.j(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, C1138t c1138t) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC1119a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(c1138t);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c1138t.j(5);
            }
        }
    }

    /* renamed from: c1.t$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a(int i6);
    }

    /* renamed from: c1.t$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int g6 = C1138t.g(context);
            if (AbstractC1117K.f10560a < 31 || g6 != 5) {
                C1138t.this.j(g6);
            } else {
                b.a(context, C1138t.this);
            }
        }
    }

    public C1138t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized C1138t d(Context context) {
        C1138t c1138t;
        synchronized (C1138t.class) {
            try {
                if (f10633e == null) {
                    f10633e = new C1138t(context);
                }
                c1138t = f10633e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1138t;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return AbstractC1117K.f10560a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i6 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i6 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i6;
    }

    public int f() {
        int i6;
        synchronized (this.f10636c) {
            i6 = this.f10637d;
        }
        return i6;
    }

    public void h(final c cVar) {
        i();
        this.f10635b.add(new WeakReference(cVar));
        this.f10634a.post(new Runnable() { // from class: c1.s
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(C1138t.this.f());
            }
        });
    }

    public final void i() {
        Iterator it = this.f10635b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f10635b.remove(weakReference);
            }
        }
    }

    public final void j(int i6) {
        synchronized (this.f10636c) {
            try {
                if (this.f10637d == i6) {
                    return;
                }
                this.f10637d = i6;
                Iterator it = this.f10635b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i6);
                    } else {
                        this.f10635b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
