package K1;

import E1.C0311m;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f2982b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f2983c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f2984d;

    public d() {
        super(new C0311m());
        this.f2982b = -9223372036854775807L;
        this.f2983c = new long[0];
        this.f2984d = new long[0];
    }

    public static Boolean g(C1144z c1144z) {
        return Boolean.valueOf(c1144z.G() == 1);
    }

    public static Object h(C1144z c1144z, int i6) {
        if (i6 == 0) {
            return j(c1144z);
        }
        if (i6 == 1) {
            return g(c1144z);
        }
        if (i6 == 2) {
            return n(c1144z);
        }
        if (i6 == 3) {
            return l(c1144z);
        }
        if (i6 == 8) {
            return k(c1144z);
        }
        if (i6 == 10) {
            return m(c1144z);
        }
        if (i6 != 11) {
            return null;
        }
        return i(c1144z);
    }

    public static Date i(C1144z c1144z) {
        Date date = new Date((long) j(c1144z).doubleValue());
        c1144z.U(2);
        return date;
    }

    public static Double j(C1144z c1144z) {
        return Double.valueOf(Double.longBitsToDouble(c1144z.z()));
    }

    public static HashMap k(C1144z c1144z) {
        int K5 = c1144z.K();
        HashMap hashMap = new HashMap(K5);
        for (int i6 = 0; i6 < K5; i6++) {
            String n6 = n(c1144z);
            Object h6 = h(c1144z, o(c1144z));
            if (h6 != null) {
                hashMap.put(n6, h6);
            }
        }
        return hashMap;
    }

    public static HashMap l(C1144z c1144z) {
        HashMap hashMap = new HashMap();
        while (true) {
            String n6 = n(c1144z);
            int o6 = o(c1144z);
            if (o6 == 9) {
                return hashMap;
            }
            Object h6 = h(c1144z, o6);
            if (h6 != null) {
                hashMap.put(n6, h6);
            }
        }
    }

    public static ArrayList m(C1144z c1144z) {
        int K5 = c1144z.K();
        ArrayList arrayList = new ArrayList(K5);
        for (int i6 = 0; i6 < K5; i6++) {
            Object h6 = h(c1144z, o(c1144z));
            if (h6 != null) {
                arrayList.add(h6);
            }
        }
        return arrayList;
    }

    public static String n(C1144z c1144z) {
        int M5 = c1144z.M();
        int f6 = c1144z.f();
        c1144z.U(M5);
        return new String(c1144z.e(), f6, M5);
    }

    public static int o(C1144z c1144z) {
        return c1144z.G();
    }

    @Override // K1.e
    public boolean b(C1144z c1144z) {
        return true;
    }

    @Override // K1.e
    public boolean c(C1144z c1144z, long j6) {
        if (o(c1144z) != 2 || !"onMetaData".equals(n(c1144z)) || c1144z.a() == 0 || o(c1144z) != 8) {
            return false;
        }
        HashMap k6 = k(c1144z);
        Object obj = k6.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f2982b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k6.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f2983c = new long[size];
                this.f2984d = new long[size];
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj5 = list.get(i6);
                    Object obj6 = list2.get(i6);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f2983c = new long[0];
                        this.f2984d = new long[0];
                        break;
                    }
                    this.f2983c[i6] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f2984d[i6] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f2982b;
    }

    public long[] e() {
        return this.f2984d;
    }

    public long[] f() {
        return this.f2983c;
    }
}
