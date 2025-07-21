package z;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import z.N;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final b f21303a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f21304b = new ArrayMap(4);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f21305a;

        /* renamed from: b, reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f21306b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f21307c = new Object();

        /* renamed from: d, reason: collision with root package name */
        public boolean f21308d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f21305a = executor;
            this.f21306b = availabilityCallback;
        }

        public void d() {
            synchronized (this.f21307c) {
                this.f21308d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f21307c) {
                try {
                    if (!this.f21308d) {
                        this.f21305a.execute(new Runnable() { // from class: z.L
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC2374f.a(N.a.this.f21306b);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f21307c) {
                try {
                    if (!this.f21308d) {
                        this.f21305a.execute(new Runnable() { // from class: z.K
                            @Override // java.lang.Runnable
                            public final void run() {
                                N.a.this.f21306b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f21307c) {
                try {
                    if (!this.f21308d) {
                        this.f21305a.execute(new Runnable() { // from class: z.M
                            @Override // java.lang.Runnable
                            public final void run() {
                                N.a.this.f21306b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        static b d(Context context, Handler handler) {
            int i6 = Build.VERSION.SDK_INT;
            return i6 >= 30 ? new Q(context) : i6 >= 29 ? new P(context) : i6 >= 28 ? O.i(context) : S.h(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str);

        Set e();

        void f(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] g();
    }

    public N(b bVar) {
        this.f21303a = bVar;
    }

    public static N a(Context context) {
        return b(context, L.m.a());
    }

    public static N b(Context context, Handler handler) {
        return new N(b.d(context, handler));
    }

    public C2362A c(String str) {
        C2362A c2362a;
        synchronized (this.f21304b) {
            c2362a = (C2362A) this.f21304b.get(str);
            if (c2362a == null) {
                try {
                    c2362a = C2362A.d(this.f21303a.c(str), str);
                    this.f21304b.put(str, c2362a);
                } catch (AssertionError e6) {
                    throw new C2375g(10002, e6.getMessage(), e6);
                }
            }
        }
        return c2362a;
    }

    public String[] d() {
        return this.f21303a.g();
    }

    public Set e() {
        return this.f21303a.e();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f21303a.f(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f21303a.a(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f21303a.b(availabilityCallback);
    }
}
