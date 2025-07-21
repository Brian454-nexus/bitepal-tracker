package A;

import F.C;
import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f0a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1b;

    static {
        HashMap hashMap = new HashMap();
        f0a = hashMap;
        HashMap hashMap2 = new HashMap();
        f1b = hashMap2;
        C c6 = C.f1236d;
        hashMap.put(1L, c6);
        hashMap2.put(c6, Collections.singletonList(1L));
        hashMap.put(2L, C.f1238f);
        hashMap2.put((C) hashMap.get(2L), Collections.singletonList(2L));
        C c7 = C.f1239g;
        hashMap.put(4L, c7);
        hashMap2.put(c7, Collections.singletonList(4L));
        C c8 = C.f1240h;
        hashMap.put(8L, c8);
        hashMap2.put(c8, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            f0a.put((Long) it.next(), C.f1241i);
        }
        f1b.put(C.f1241i, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (it2.hasNext()) {
            f0a.put((Long) it2.next(), C.f1242j);
        }
        f1b.put(C.f1242j, asList2);
    }

    public static Long a(@NonNull C c6, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f1b.get(c6);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l6 : list) {
            if (supportedProfiles.contains(l6)) {
                return l6;
            }
        }
        return null;
    }

    public static C b(long j6) {
        return (C) f0a.get(Long.valueOf(j6));
    }
}
