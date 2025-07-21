package B;

import I.F0;
import I.P0;
import I.Q0;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class q implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P0 f254a = d();

    /* renamed from: b, reason: collision with root package name */
    public static final P0 f255b = e();

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f256c = f();

    /* renamed from: d, reason: collision with root package name */
    public static final Set f257d = new HashSet(Arrays.asList("SM-A515F", "SM-A515U", "SM-A515U1", "SM-A515W", "SM-S515DL", "SC-54A", "SCG07", "SM-A5160", "SM-A516B", "SM-A516N", "SM-A516U", "SM-A516U1", "SM-A516V", "SM-A715F", "SM-A715W", "SM-A7160", "SM-A716B", "SM-A716U", "SM-A716U1", "SM-A716V", "SM-A8050", "SM-A805F", "SM-A805N", "SCV44", "SM-F9000", "SM-F900F", "SM-F900U", "SM-F900U1", "SM-F900W", "SM-F907B", "SM-F907N", "SM-N970F", "SM-N9700", "SM-N970U", "SM-N970U1", "SM-N970W", "SM-N971N", "SM-N770F", "SC-01M", "SCV45", "SM-N9750", "SM-N975C", "SM-N975U", "SM-N975U1", "SM-N975W", "SM-N975F", "SM-N976B", "SM-N976N", "SM-N9760", "SM-N976Q", "SM-N976V", "SM-N976U", "SM-N9810", "SM-N981N", "SM-N981U", "SM-N981U1", "SM-N981W", "SM-N981B", "SC-53A", "SCG06", "SM-N9860", "SM-N986N", "SM-N986U", "SM-N986U1", "SM-N986W", "SM-N986B", "SC-03L", "SCV41", "SM-G973F", "SM-G973N", "SM-G9730", "SM-G9738", "SM-G973C", "SM-G973U", "SM-G973U1", "SM-G973W", "SM-G977B", "SM-G977N", "SM-G977P", "SM-G977T", "SM-G977U", "SM-G770F", "SM-G770U1", "SC-04L", "SCV42", "SM-G975F", "SM-G975N", "SM-G9750", "SM-G9758", "SM-G975U", "SM-G975U1", "SM-G975W", "SC-05L", "SM-G970F", "SM-G970N", "SM-G9700", "SM-G9708", "SM-G970U", "SM-G970U1", "SM-G970W", "SC-51A", "SC51Aa", "SCG01", "SM-G9810", "SM-G981N", "SM-G981U", "SM-G981U1", "SM-G981V", "SM-G981W", "SM-G981B", "SCG03", "SM-G9880", "SM-G988N", "SM-G988Q", "SM-G988U", "SM-G988U1", "SM-G988W", "SM-G988B", "SC-52A", "SCG02", "SM-G9860", "SM-G986N", "SM-G986U", "SM-G986U1", "SM-G986W", "SM-G986B", "SCV47", "SM-F7000", "SM-F700F", "SM-F700N", "SM-F700U", "SM-F700U1", "SM-F700W", "SCG04", "SM-F7070", "SM-F707B", "SM-F707N", "SM-F707U", "SM-F707U1", "SM-F707W", "SM-F9160", "SM-F916B", "SM-F916N", "SM-F916Q", "SM-F916U", "SM-F916U1", "SM-F916W"));

    /* renamed from: e, reason: collision with root package name */
    public static final Set f258e = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO"));

    public static P0 d() {
        P0 p02 = new P0();
        Q0.b bVar = Q0.b.YUV;
        p02.a(Q0.a(bVar, Q0.a.VGA));
        p02.a(Q0.a(Q0.b.PRIV, Q0.a.PREVIEW));
        p02.a(Q0.a(bVar, Q0.a.MAXIMUM));
        return p02;
    }

    public static P0 e() {
        P0 p02 = new P0();
        Q0.b bVar = Q0.b.YUV;
        p02.a(Q0.a(bVar, Q0.a.VGA));
        p02.a(Q0.a(bVar, Q0.a.PREVIEW));
        p02.a(Q0.a(bVar, Q0.a.MAXIMUM));
        return p02;
    }

    public static P0 f() {
        P0 p02 = new P0();
        Q0.b bVar = Q0.b.PRIV;
        p02.a(Q0.a(bVar, Q0.a.PREVIEW));
        p02.a(Q0.a(bVar, Q0.a.VGA));
        Q0.b bVar2 = Q0.b.YUV;
        Q0.a aVar = Q0.a.MAXIMUM;
        p02.a(Q0.a(bVar2, aVar));
        p02.a(Q0.a(Q0.b.RAW, aVar));
        return p02;
    }

    public static boolean j() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    public static boolean k() {
        return j() || l() || m();
    }

    public static boolean l() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f257d.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean m() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f258e.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public List g(String str, int i6) {
        return j() ? i(str) : l() ? h(i6) : m() ? Collections.singletonList(f256c) : Collections.EMPTY_LIST;
    }

    public final List h(int i6) {
        ArrayList arrayList = new ArrayList();
        if (i6 == 0) {
            arrayList.add(f254a);
            arrayList.add(f255b);
        }
        return arrayList;
    }

    public final List i(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f254a);
        }
        return arrayList;
    }
}
