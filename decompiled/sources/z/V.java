package z;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import z.T;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class V implements T.a {

    /* renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f21318a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i6) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i6);
        }
    }

    public V(StreamConfigurationMap streamConfigurationMap) {
        this.f21318a = streamConfigurationMap;
    }

    @Override // z.T.a
    public StreamConfigurationMap a() {
        return this.f21318a;
    }

    @Override // z.T.a
    public Size[] b(int i6) {
        return a.a(this.f21318a, i6);
    }
}
