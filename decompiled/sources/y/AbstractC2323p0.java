package y;

import F.C0333h0;
import F.C0346s;
import F.C0348u;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import z.C2375g;

/* renamed from: y.p0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2323p0 {
    public static String a(z.N n6, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) n6.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) n6.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static List b(C2335w c2335w, C0346s c0346s) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c2335w.c().d());
            if (c0346s == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    str = a(c2335w.c(), c0346s.d(), asList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : asList) {
                    if (!str2.equals(str)) {
                        arrayList2.add(c2335w.f(str2));
                    }
                }
                Iterator it2 = c0346s.b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((I.D) ((F.r) it2.next())).d());
                }
            }
            return arrayList;
        } catch (C0348u e6) {
            throw new C0333h0(e6);
        } catch (C2375g e7) {
            throw new C0333h0(AbstractC2326r0.a(e7));
        }
    }
}
