package I;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class S0 {

    /* renamed from: b, reason: collision with root package name */
    public static final S0 f2352b = new S0(new ArrayMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f2353a;

    public S0(Map map) {
        this.f2353a = map;
    }

    public static S0 a(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new S0(arrayMap);
    }

    public static S0 b() {
        return f2352b;
    }

    public static S0 c(S0 s02) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : s02.e()) {
            arrayMap.put(str, s02.d(str));
        }
        return new S0(arrayMap);
    }

    public Object d(String str) {
        return this.f2353a.get(str);
    }

    public Set e() {
        return this.f2353a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
