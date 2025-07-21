package F;

import F.C0353z;
import I.Z0;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0352y {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f1508o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final SparseArray f1509p = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final C0353z f1512c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f1513d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f1514e;

    /* renamed from: f, reason: collision with root package name */
    public final HandlerThread f1515f;

    /* renamed from: g, reason: collision with root package name */
    public I.C f1516g;

    /* renamed from: h, reason: collision with root package name */
    public I.B f1517h;

    /* renamed from: i, reason: collision with root package name */
    public Z0 f1518i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1519j;

    /* renamed from: k, reason: collision with root package name */
    public final D6.g f1520k;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f1523n;

    /* renamed from: a, reason: collision with root package name */
    public final I.G f1510a = new I.G();

    /* renamed from: b, reason: collision with root package name */
    public final Object f1511b = new Object();

    /* renamed from: l, reason: collision with root package name */
    public a f1521l = a.UNINITIALIZED;

    /* renamed from: m, reason: collision with root package name */
    public D6.g f1522m = N.f.h(null);

    /* renamed from: F.y$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C0352y(Context context, C0353z.b bVar) {
        if (bVar != null) {
            this.f1512c = bVar.getCameraXConfig();
        } else {
            C0353z.b g6 = g(context);
            if (g6 == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f1512c = g6.getCameraXConfig();
        }
        Executor Y5 = this.f1512c.Y(null);
        Handler b02 = this.f1512c.b0(null);
        this.f1513d = Y5 == null ? new ExecutorC0344p() : Y5;
        if (b02 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f1515f = handlerThread;
            handlerThread.start();
            this.f1514e = v0.i.a(handlerThread.getLooper());
        } else {
            this.f1515f = null;
            this.f1514e = b02;
        }
        Integer num = (Integer) this.f1512c.e(C0353z.f1537M, null);
        this.f1523n = num;
        j(num);
        this.f1520k = l(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(final F.C0352y r6, android.content.Context r7, final java.util.concurrent.Executor r8, final l0.AbstractC1728c.a r9, final long r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C0352y.a(F.y, android.content.Context, java.util.concurrent.Executor, l0.c$a, long):void");
    }

    public static /* synthetic */ Object b(C0352y c0352y, Context context, AbstractC1728c.a aVar) {
        c0352y.k(c0352y.f1513d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    public static C0353z.b g(Context context) {
        ComponentCallbacks2 b6 = L.f.b(context);
        if (b6 instanceof C0353z.b) {
            return (C0353z.b) b6;
        }
        try {
            Context a6 = L.f.a(context);
            Bundle bundle = a6.getPackageManager().getServiceInfo(new ComponentName(a6, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C0353z.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            AbstractC0335i0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            e = e6;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e7) {
            e = e7;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e8) {
            e = e8;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e9) {
            e = e9;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e10) {
            e = e10;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e12) {
            e = e12;
            AbstractC0335i0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public static void j(Integer num) {
        synchronized (f1508o) {
            try {
                if (num == null) {
                    return;
                }
                y0.g.d(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f1509p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n() {
        SparseArray sparseArray = f1509p;
        if (sparseArray.size() == 0) {
            AbstractC0335i0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC0335i0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC0335i0.j(4);
        } else if (sparseArray.get(5) != null) {
            AbstractC0335i0.j(5);
        } else if (sparseArray.get(6) != null) {
            AbstractC0335i0.j(6);
        }
    }

    public I.B d() {
        I.B b6 = this.f1517h;
        if (b6 != null) {
            return b6;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public I.C e() {
        I.C c6 = this.f1516g;
        if (c6 != null) {
            return c6;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public I.G f() {
        return this.f1510a;
    }

    public Z0 h() {
        Z0 z02 = this.f1518i;
        if (z02 != null) {
            return z02;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public D6.g i() {
        return this.f1520k;
    }

    public final void k(final Executor executor, final long j6, final Context context, final AbstractC1728c.a aVar) {
        executor.execute(new Runnable() { // from class: F.w
            @Override // java.lang.Runnable
            public final void run() {
                C0352y.a(C0352y.this, context, executor, aVar, j6);
            }
        });
    }

    public final D6.g l(final Context context) {
        D6.g a6;
        synchronized (this.f1511b) {
            y0.g.i(this.f1521l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f1521l = a.INITIALIZING;
            a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: F.v
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return C0352y.b(C0352y.this, context, aVar);
                }
            });
        }
        return a6;
    }

    public final void m() {
        synchronized (this.f1511b) {
            this.f1521l = a.INITIALIZED;
        }
    }
}
