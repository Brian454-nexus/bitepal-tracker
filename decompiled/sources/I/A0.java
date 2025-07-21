package I;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class A0 extends S0 {
    public A0(Map map) {
        super(map);
    }

    public static A0 g() {
        return new A0(new ArrayMap());
    }

    public static A0 h(S0 s02) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : s02.e()) {
            arrayMap.put(str, s02.d(str));
        }
        return new A0(arrayMap);
    }

    public void f(S0 s02) {
        Map map;
        Map map2 = this.f2353a;
        if (map2 == null || (map = s02.f2353a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f2353a.put(str, obj);
    }
}
