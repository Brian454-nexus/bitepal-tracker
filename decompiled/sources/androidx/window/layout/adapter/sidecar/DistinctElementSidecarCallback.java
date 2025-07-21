package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f10176b;

    /* renamed from: d, reason: collision with root package name */
    public final T2.a f10178d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f10179e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10175a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Map f10177c = new WeakHashMap();

    public DistinctElementSidecarCallback(T2.a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f10178d = aVar;
        this.f10179e = sidecarCallback;
    }

    public void onDeviceStateChanged(@NonNull SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f10175a) {
            try {
                if (this.f10178d.a(this.f10176b, sidecarDeviceState)) {
                    return;
                }
                this.f10176b = sidecarDeviceState;
                this.f10179e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(@NonNull IBinder iBinder, @NonNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f10175a) {
            try {
                if (this.f10178d.d((SidecarWindowLayoutInfo) this.f10177c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f10177c.put(iBinder, sidecarWindowLayoutInfo);
                this.f10179e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
