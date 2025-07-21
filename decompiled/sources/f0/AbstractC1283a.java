package f0;

import F.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.io.ConstantsKt;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1283a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f13986a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f13987b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f13988c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f13989d;

    static {
        HashMap hashMap = new HashMap();
        f13986a = hashMap;
        HashMap hashMap2 = new HashMap();
        f13987b = hashMap2;
        HashMap hashMap3 = new HashMap();
        f13988c = hashMap3;
        HashMap hashMap4 = new HashMap();
        f13989d = hashMap4;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(0, 1);
        hashMap3.put(1, 3);
        hashMap3.put(2, 4);
        hashMap3.put(3, 5);
        hashMap3.put(4, 6);
        HashMap hashMap5 = new HashMap();
        C c6 = C.f1236d;
        hashMap5.put(c6, 1);
        C c7 = C.f1238f;
        hashMap5.put(c7, 2);
        C c8 = C.f1239g;
        Integer valueOf = Integer.valueOf(ConstantsKt.DEFAULT_BLOCK_SIZE);
        hashMap5.put(c8, valueOf);
        C c9 = C.f1240h;
        Integer valueOf2 = Integer.valueOf(ConstantsKt.DEFAULT_BUFFER_SIZE);
        hashMap5.put(c9, valueOf2);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(c6, 1);
        hashMap6.put(c7, 2);
        hashMap6.put(c8, valueOf);
        hashMap6.put(c9, valueOf2);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(c6, 1);
        hashMap7.put(c7, 4);
        hashMap7.put(c8, valueOf);
        hashMap7.put(c9, 16384);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(C.f1241i, 256);
        hashMap8.put(C.f1242j, Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE));
        hashMap4.put("video/hevc", hashMap5);
        hashMap4.put("video/av01", hashMap6);
        hashMap4.put("video/x-vnd.on2.vp9", hashMap7);
        hashMap4.put("video/dolby-vision", hashMap8);
    }

    public static int a(String str, C c6) {
        Integer num;
        Map map = (Map) f13989d.get(str);
        if (map == null || (num = (Integer) map.get(c6)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set b(C c6) {
        Set set = (Set) f13986a.get(Integer.valueOf(c6.a()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static Set c(C c6) {
        Set set = (Set) f13987b.get(Integer.valueOf(c6.b()));
        return set == null ? Collections.EMPTY_SET : set;
    }
}
