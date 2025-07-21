package I;

import android.util.Size;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class R0 {
    public static R0 a(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        return new C0440m(size, map, size2, map2, size3, map3, map4);
    }

    public abstract Size b();

    public Size c(int i6) {
        return (Size) d().get(Integer.valueOf(i6));
    }

    public abstract Map d();

    public abstract Size e();

    public abstract Size f();

    public Size g(int i6) {
        return (Size) h().get(Integer.valueOf(i6));
    }

    public abstract Map h();

    public Size i(int i6) {
        return (Size) j().get(Integer.valueOf(i6));
    }

    public abstract Map j();

    public Size k(int i6) {
        return (Size) l().get(Integer.valueOf(i6));
    }

    public abstract Map l();
}
