package z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2362A {

    /* renamed from: b, reason: collision with root package name */
    public final a f21280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21281c;

    /* renamed from: a, reason: collision with root package name */
    public final Map f21279a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public T f21282d = null;

    /* renamed from: z.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        Object a(CameraCharacteristics.Key key);
    }

    public C2362A(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21280b = new y(cameraCharacteristics);
        } else {
            this.f21280b = new z(cameraCharacteristics);
        }
        this.f21281c = str;
    }

    public static C2362A d(CameraCharacteristics cameraCharacteristics, String str) {
        return new C2362A(cameraCharacteristics, str);
    }

    public Object a(CameraCharacteristics.Key key) {
        if (c(key)) {
            return this.f21280b.a(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f21279a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object a6 = this.f21280b.a(key);
                if (a6 != null) {
                    this.f21279a.put(key, a6);
                }
                return a6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T b() {
        if (this.f21282d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f21282d = T.d(streamConfigurationMap, new C.m(this.f21281c));
            } catch (AssertionError e6) {
                throw new IllegalArgumentException(e6.getMessage());
            }
        }
        return this.f21282d;
    }

    public final boolean c(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }
}
