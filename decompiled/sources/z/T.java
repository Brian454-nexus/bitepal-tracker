package z;

import F.AbstractC0335i0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    public final a f21313a;

    /* renamed from: b, reason: collision with root package name */
    public final C.m f21314b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f21315c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f21316d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Map f21317e = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        StreamConfigurationMap a();

        Size[] b(int i6);

        Size[] c(int i6);
    }

    public T(StreamConfigurationMap streamConfigurationMap, C.m mVar) {
        this.f21313a = new U(streamConfigurationMap);
        this.f21314b = mVar;
    }

    public static T d(StreamConfigurationMap streamConfigurationMap, C.m mVar) {
        return new T(streamConfigurationMap, mVar);
    }

    public Size[] a(int i6) {
        if (this.f21316d.containsKey(Integer.valueOf(i6))) {
            if (((Size[]) this.f21316d.get(Integer.valueOf(i6))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f21316d.get(Integer.valueOf(i6))).clone();
        }
        Size[] b6 = this.f21313a.b(i6);
        if (b6 != null && b6.length > 0) {
            b6 = this.f21314b.b(b6, i6);
        }
        this.f21316d.put(Integer.valueOf(i6), b6);
        if (b6 != null) {
            return (Size[]) b6.clone();
        }
        return null;
    }

    public Size[] b(int i6) {
        if (this.f21315c.containsKey(Integer.valueOf(i6))) {
            if (((Size[]) this.f21315c.get(Integer.valueOf(i6))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f21315c.get(Integer.valueOf(i6))).clone();
        }
        Size[] c6 = this.f21313a.c(i6);
        if (c6 != null && c6.length != 0) {
            Size[] b6 = this.f21314b.b(c6, i6);
            this.f21315c.put(Integer.valueOf(i6), b6);
            return (Size[]) b6.clone();
        }
        AbstractC0335i0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i6);
        return c6;
    }

    public StreamConfigurationMap c() {
        return this.f21313a.a();
    }
}
