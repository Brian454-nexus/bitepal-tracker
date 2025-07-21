package z;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import z.C2363B;
import z.N;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class S implements N.b {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f21309a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21310b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f21311a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Handler f21312b;

        public a(Handler handler) {
            this.f21312b = handler;
        }
    }

    public S(Context context, Object obj) {
        this.f21309a = (CameraManager) context.getSystemService("camera");
        this.f21310b = obj;
    }

    public static S h(Context context, Handler handler) {
        return new S(context, new a(handler));
    }

    @Override // z.N.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        N.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f21310b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f21311a) {
                try {
                    aVar = (N.a) aVar2.f21311a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new N.a(executor, availabilityCallback);
                        aVar2.f21311a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f21309a.registerAvailabilityCallback(aVar, aVar2.f21312b);
    }

    @Override // z.N.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        N.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f21310b;
            synchronized (aVar2.f21311a) {
                aVar = (N.a) aVar2.f21311a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.d();
        }
        this.f21309a.unregisterAvailabilityCallback(aVar);
    }

    @Override // z.N.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f21309a.getCameraCharacteristics(str);
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }

    @Override // z.N.b
    public Set e() {
        return Collections.EMPTY_SET;
    }

    @Override // z.N.b
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        y0.g.f(executor);
        y0.g.f(stateCallback);
        try {
            this.f21309a.openCamera(str, new C2363B.b(executor, stateCallback), ((a) this.f21310b).f21312b);
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }

    @Override // z.N.b
    public String[] g() {
        try {
            return this.f21309a.getCameraIdList();
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }
}
