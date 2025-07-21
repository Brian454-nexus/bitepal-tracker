package j1;

import android.os.SystemClock;
import android.util.Pair;
import c1.AbstractC1117K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k1.C1658b;
import z6.D;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1641b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16128a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16129b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f16130c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f16131d;

    public C1641b() {
        this(new Random());
    }

    public static void b(Object obj, long j6, Map map) {
        if (map.containsKey(obj)) {
            j6 = Math.max(j6, ((Long) AbstractC1117K.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j6));
    }

    public static int d(C1658b c1658b, C1658b c1658b2) {
        int compare = Integer.compare(c1658b.f16314c, c1658b2.f16314c);
        return compare != 0 ? compare : c1658b.f16313b.compareTo(c1658b2.f16313b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < list.size(); i6++) {
            hashSet.add(Integer.valueOf(((C1658b) list.get(i6)).f16314c));
        }
        return hashSet.size();
    }

    public static void h(long j6, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j6) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            map.remove(arrayList.get(i6));
        }
    }

    public final List c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f16128a);
        h(elapsedRealtime, this.f16129b);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1658b c1658b = (C1658b) list.get(i6);
            if (!this.f16128a.containsKey(c1658b.f16313b) && !this.f16129b.containsKey(Integer.valueOf(c1658b.f16314c))) {
                arrayList.add(c1658b);
            }
        }
        return arrayList;
    }

    public void e(C1658b c1658b, long j6) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j6;
        b(c1658b.f16313b, elapsedRealtime, this.f16128a);
        int i6 = c1658b.f16314c;
        if (i6 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i6), elapsedRealtime, this.f16129b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List c6 = c(list);
        for (int i6 = 0; i6 < c6.size(); i6++) {
            hashSet.add(Integer.valueOf(((C1658b) c6.get(i6)).f16314c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f16128a.clear();
        this.f16129b.clear();
        this.f16130c.clear();
    }

    public C1658b j(List list) {
        List c6 = c(list);
        if (c6.size() < 2) {
            return (C1658b) D.c(c6, (Object) null);
        }
        Collections.sort(c6, new Comparator() { // from class: j1.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d6;
                d6 = C1641b.d((C1658b) obj, (C1658b) obj2);
                return d6;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i6 = ((C1658b) c6.get(0)).f16314c;
        int i7 = 0;
        while (true) {
            if (i7 >= c6.size()) {
                break;
            }
            C1658b c1658b = (C1658b) c6.get(i7);
            if (i6 == c1658b.f16314c) {
                arrayList.add(new Pair(c1658b.f16313b, Integer.valueOf(c1658b.f16315d)));
                i7++;
            } else if (arrayList.size() == 1) {
                return (C1658b) c6.get(0);
            }
        }
        C1658b c1658b2 = (C1658b) this.f16130c.get(arrayList);
        if (c1658b2 != null) {
            return c1658b2;
        }
        C1658b k6 = k(c6.subList(0, arrayList.size()));
        this.f16130c.put(arrayList, k6);
        return k6;
    }

    public final C1658b k(List list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += ((C1658b) list.get(i7)).f16315d;
        }
        int nextInt = this.f16131d.nextInt(i6);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            C1658b c1658b = (C1658b) list.get(i9);
            i8 += c1658b.f16315d;
            if (nextInt < i8) {
                return c1658b;
            }
        }
        return (C1658b) D.d(list);
    }

    public C1641b(Random random) {
        this.f16130c = new HashMap();
        this.f16131d = random;
        this.f16128a = new HashMap();
        this.f16129b = new HashMap();
    }
}
