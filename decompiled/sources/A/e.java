package A;

import F.C;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f2a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        DynamicRangeProfiles a();

        Set c();

        Set d(C c6);
    }

    public e(a aVar) {
        this.f2a = aVar;
    }

    public static e a(C2362A c2362a) {
        e eVar;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            eVar = e(d.a(c2362a.a(key)));
        } else {
            eVar = null;
        }
        return eVar == null ? g.f4a : eVar;
    }

    public static e e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        y0.g.i(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new e(new f(dynamicRangeProfiles));
    }

    public Set b(C c6) {
        return this.f2a.d(c6);
    }

    public Set c() {
        return this.f2a.c();
    }

    public DynamicRangeProfiles d() {
        y0.g.i(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f2a.a();
    }
}
