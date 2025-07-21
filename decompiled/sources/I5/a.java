package I5;

import android.util.SparseArray;
import java.util.HashMap;
import u5.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray f2843a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f2844b;

    static {
        HashMap hashMap = new HashMap();
        f2844b = hashMap;
        hashMap.put(f.DEFAULT, 0);
        f2844b.put(f.VERY_LOW, 1);
        f2844b.put(f.HIGHEST, 2);
        for (f fVar : f2844b.keySet()) {
            f2843a.append(((Integer) f2844b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) f2844b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i6) {
        f fVar = (f) f2843a.get(i6);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i6);
    }
}
