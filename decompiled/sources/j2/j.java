package j2;

import b1.C1076a;
import b2.k;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final List f16196a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f16197b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f16198c;

    public j(List list) {
        this.f16196a = Collections.unmodifiableList(new ArrayList(list));
        this.f16197b = new long[list.size() * 2];
        for (int i6 = 0; i6 < list.size(); i6++) {
            d dVar = (d) list.get(i6);
            int i7 = i6 * 2;
            long[] jArr = this.f16197b;
            jArr[i7] = dVar.f16167b;
            jArr[i7 + 1] = dVar.f16168c;
        }
        long[] jArr2 = this.f16197b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f16198c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // b2.k
    public int a(long j6) {
        int d6 = AbstractC1117K.d(this.f16198c, j6, false, false);
        if (d6 < this.f16198c.length) {
            return d6;
        }
        return -1;
    }

    @Override // b2.k
    public long b(int i6) {
        AbstractC1119a.a(i6 >= 0);
        AbstractC1119a.a(i6 < this.f16198c.length);
        return this.f16198c[i6];
    }

    @Override // b2.k
    public List c(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < this.f16196a.size(); i6++) {
            long[] jArr = this.f16197b;
            int i7 = i6 * 2;
            if (jArr[i7] <= j6 && j6 < jArr[i7 + 1]) {
                d dVar = (d) this.f16196a.get(i6);
                C1076a c1076a = dVar.f16166a;
                if (c1076a.f10414e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(c1076a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: j2.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((d) obj).f16167b, ((d) obj2).f16167b);
                return compare;
            }
        });
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            arrayList.add(((d) arrayList2.get(i8)).f16166a.a().h((-1) - i8, 1).a());
        }
        return arrayList;
    }

    @Override // b2.k
    public int d() {
        return this.f16198c.length;
    }
}
