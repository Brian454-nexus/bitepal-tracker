package h2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import b1.C1076a;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1453c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15231b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15232c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15233d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15234e;

    /* renamed from: f, reason: collision with root package name */
    public final C1457g f15235f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f15236g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15237h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15238i;

    /* renamed from: j, reason: collision with root package name */
    public final C1453c f15239j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f15240k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f15241l;

    /* renamed from: m, reason: collision with root package name */
    public List f15242m;

    public C1453c(String str, String str2, long j6, long j7, C1457g c1457g, String[] strArr, String str3, String str4, C1453c c1453c) {
        this.f15230a = str;
        this.f15231b = str2;
        this.f15238i = str4;
        this.f15235f = c1457g;
        this.f15236g = strArr;
        this.f15232c = str2 != null;
        this.f15233d = j6;
        this.f15234e = j7;
        this.f15237h = (String) AbstractC1119a.e(str3);
        this.f15239j = c1453c;
        this.f15240k = new HashMap();
        this.f15241l = new HashMap();
    }

    public static C1453c c(String str, long j6, long j7, C1457g c1457g, String[] strArr, String str2, String str3, C1453c c1453c) {
        return new C1453c(str, null, j6, j7, c1457g, strArr, str2, str3, c1453c);
    }

    public static C1453c d(String str) {
        return new C1453c(null, AbstractC1456f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C1451a c1451a : (C1451a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1451a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1451a), spannableStringBuilder.getSpanEnd(c1451a), "");
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length(); i6++) {
            if (spannableStringBuilder.charAt(i6) == ' ') {
                int i7 = i6 + 1;
                int i8 = i7;
                while (i8 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i8) == ' ') {
                    i8++;
                }
                int i9 = i8 - i7;
                if (i9 > 0) {
                    spannableStringBuilder.delete(i6, i9 + i6);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length() - 1; i10++) {
            if (spannableStringBuilder.charAt(i10) == '\n') {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    spannableStringBuilder.delete(i11, i10 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i12 = 0; i12 < spannableStringBuilder.length() - 1; i12++) {
            if (spannableStringBuilder.charAt(i12) == ' ') {
                int i13 = i12 + 1;
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    spannableStringBuilder.delete(i12, i13);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            C1076a.b bVar = new C1076a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC1119a.e(((C1076a.b) map.get(str)).e());
    }

    public void a(C1453c c1453c) {
        if (this.f15242m == null) {
            this.f15242m = new ArrayList();
        }
        this.f15242m.add(c1453c);
    }

    public final void b(Map map, C1076a.b bVar, int i6, int i7, int i8) {
        C1457g f6 = AbstractC1456f.f(this.f15235f, this.f15236g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f6 != null) {
            AbstractC1456f.a(spannableStringBuilder2, i6, i7, f6, this.f15239j, map, i8);
            if ("p".equals(this.f15230a)) {
                if (f6.k() != Float.MAX_VALUE) {
                    bVar.m((f6.k() * (-90.0f)) / 100.0f);
                }
                if (f6.m() != null) {
                    bVar.p(f6.m());
                }
                if (f6.h() != null) {
                    bVar.j(f6.h());
                }
            }
        }
    }

    public C1453c f(int i6) {
        List list = this.f15242m;
        if (list != null) {
            return (C1453c) list.get(i6);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f15242m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j6, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j6, this.f15237h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j6, false, this.f15237h, treeMap);
        o(j6, map, map2, this.f15237h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C1455e c1455e = (C1455e) AbstractC1119a.e((C1455e) map2.get(pair.first));
                arrayList2.add(new C1076a.b().f(decodeByteArray).k(c1455e.f15258b).l(0).h(c1455e.f15259c, 0).i(c1455e.f15261e).n(c1455e.f15262f).g(c1455e.f15263g).r(c1455e.f15266j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1455e c1455e2 = (C1455e) AbstractC1119a.e((C1455e) map2.get(entry.getKey()));
            C1076a.b bVar = (C1076a.b) entry.getValue();
            e((SpannableStringBuilder) AbstractC1119a.e(bVar.e()));
            bVar.h(c1455e2.f15259c, c1455e2.f15260d);
            bVar.i(c1455e2.f15261e);
            bVar.k(c1455e2.f15258b);
            bVar.n(c1455e2.f15262f);
            bVar.q(c1455e2.f15265i, c1455e2.f15264h);
            bVar.r(c1455e2.f15266j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet treeSet, boolean z6) {
        boolean equals = "p".equals(this.f15230a);
        boolean equals2 = "div".equals(this.f15230a);
        if (z6 || equals || (equals2 && this.f15238i != null)) {
            long j6 = this.f15233d;
            if (j6 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j6));
            }
            long j7 = this.f15234e;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
        }
        if (this.f15242m == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f15242m.size(); i6++) {
            ((C1453c) this.f15242m.get(i6)).i(treeSet, z6 || equals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i6 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i6] = ((Long) it.next()).longValue();
            i6++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f15236g;
    }

    public boolean m(long j6) {
        long j7 = this.f15233d;
        if (j7 == -9223372036854775807L && this.f15234e == -9223372036854775807L) {
            return true;
        }
        if (j7 <= j6 && this.f15234e == -9223372036854775807L) {
            return true;
        }
        if (j7 != -9223372036854775807L || j6 >= this.f15234e) {
            return j7 <= j6 && j6 < this.f15234e;
        }
        return true;
    }

    public final void n(long j6, String str, List list) {
        if (!"".equals(this.f15237h)) {
            str = this.f15237h;
        }
        if (m(j6) && "div".equals(this.f15230a) && this.f15238i != null) {
            list.add(new Pair(str, this.f15238i));
            return;
        }
        for (int i6 = 0; i6 < g(); i6++) {
            f(i6).n(j6, str, list);
        }
    }

    public final void o(long j6, Map map, Map map2, String str, Map map3) {
        if (m(j6)) {
            String str2 = "".equals(this.f15237h) ? str : this.f15237h;
            Iterator it = this.f15241l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f15240k.containsKey(str3) ? ((Integer) this.f15240k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    b(map, (C1076a.b) AbstractC1119a.e((C1076a.b) map3.get(str3)), intValue, intValue2, ((C1455e) AbstractC1119a.e((C1455e) map2.get(str2))).f15266j);
                }
            }
            for (int i6 = 0; i6 < g(); i6++) {
                f(i6).o(j6, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j6, boolean z6, String str, Map map) {
        boolean z7;
        Map map2;
        long j7;
        this.f15240k.clear();
        this.f15241l.clear();
        if ("metadata".equals(this.f15230a)) {
            return;
        }
        if (!"".equals(this.f15237h)) {
            str = this.f15237h;
        }
        String str2 = str;
        if (this.f15232c && z6) {
            k(str2, map).append((CharSequence) AbstractC1119a.e(this.f15231b));
            return;
        }
        if ("br".equals(this.f15230a) && z6) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j6)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f15240k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC1119a.e(((C1076a.b) entry.getValue()).e())).length()));
            }
            boolean equals = "p".equals(this.f15230a);
            int i6 = 0;
            while (i6 < g()) {
                C1453c f6 = f(i6);
                if (z6 || equals) {
                    z7 = true;
                    map2 = map;
                    j7 = j6;
                } else {
                    z7 = false;
                    j7 = j6;
                    map2 = map;
                }
                f6.p(j7, z7, str2, map2);
                i6++;
                j6 = j7;
                map = map2;
            }
            Map map3 = map;
            if (equals) {
                AbstractC1456f.c(k(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.f15241l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC1119a.e(((C1076a.b) entry2.getValue()).e())).length()));
            }
        }
    }
}
