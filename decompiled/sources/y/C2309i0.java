package y;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: y.i0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2309i0 implements I.B {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21001a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2299f f21002b;

    /* renamed from: y.i0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements InterfaceC2299f {
        @Override // y.InterfaceC2299f
        public CamcorderProfile a(int i6, int i7) {
            return CamcorderProfile.get(i6, i7);
        }

        @Override // y.InterfaceC2299f
        public boolean b(int i6, int i7) {
            return CamcorderProfile.hasProfile(i6, i7);
        }
    }

    public C2309i0(Context context, Object obj, Set set) {
        this(context, new a(), obj, set);
    }

    @Override // I.B
    public Pair a(int i6, String str, List list, Map map) {
        y0.g.b(!map.isEmpty(), "No new use cases to be bound.");
        C2298e1 c2298e1 = (C2298e1) this.f21001a.get(str);
        if (c2298e1 != null) {
            return c2298e1.y(i6, list, map);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // I.B
    public I.Q0 b(int i6, String str, int i7, Size size) {
        C2298e1 c2298e1 = (C2298e1) this.f21001a.get(str);
        if (c2298e1 != null) {
            return c2298e1.I(i6, i7, size);
        }
        return null;
    }

    public final void c(Context context, z.N n6, Set set) {
        y0.g.f(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f21001a.put(str, new C2298e1(context, str, n6, this.f21002b));
        }
    }

    public C2309i0(Context context, InterfaceC2299f interfaceC2299f, Object obj, Set set) {
        z.N a6;
        this.f21001a = new HashMap();
        y0.g.f(interfaceC2299f);
        this.f21002b = interfaceC2299f;
        if (obj instanceof z.N) {
            a6 = (z.N) obj;
        } else {
            a6 = z.N.a(context);
        }
        c(context, a6, set);
    }
}
