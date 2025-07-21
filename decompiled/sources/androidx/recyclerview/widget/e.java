package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import u2.C2135a;
import u2.InterfaceC2138d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f9952a = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f9955a - dVar2.f9955a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i6, int i7);

        public abstract boolean areItemsTheSame(int i6, int i7);

        public Object getChangePayload(int i6, int i7) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f9953a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9954b;

        public c(int i6) {
            int[] iArr = new int[i6];
            this.f9953a = iArr;
            this.f9954b = iArr.length / 2;
        }

        public int[] a() {
            return this.f9953a;
        }

        public int b(int i6) {
            return this.f9953a[i6 + this.f9954b];
        }

        public void c(int i6, int i7) {
            this.f9953a[i6 + this.f9954b] = i7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f9955a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9956b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9957c;

        public d(int i6, int i7, int i8) {
            this.f9955a = i6;
            this.f9956b = i7;
            this.f9957c = i8;
        }

        public int a() {
            return this.f9955a + this.f9957c;
        }

        public int b() {
            return this.f9956b + this.f9957c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0148e {

        /* renamed from: a, reason: collision with root package name */
        public final List f9958a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f9959b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f9960c;

        /* renamed from: d, reason: collision with root package name */
        public final b f9961d;

        /* renamed from: e, reason: collision with root package name */
        public final int f9962e;

        /* renamed from: f, reason: collision with root package name */
        public final int f9963f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f9964g;

        public C0148e(b bVar, List list, int[] iArr, int[] iArr2, boolean z6) {
            this.f9958a = list;
            this.f9959b = iArr;
            this.f9960c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f9961d = bVar;
            this.f9962e = bVar.getOldListSize();
            this.f9963f = bVar.getNewListSize();
            this.f9964g = z6;
            a();
            e();
        }

        public static f g(Collection collection, int i6, boolean z6) {
            f fVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f9965a == i6 && fVar.f9967c == z6) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z6) {
                    fVar2.f9966b--;
                } else {
                    fVar2.f9966b++;
                }
            }
            return fVar;
        }

        public final void a() {
            d dVar = this.f9958a.isEmpty() ? null : (d) this.f9958a.get(0);
            if (dVar == null || dVar.f9955a != 0 || dVar.f9956b != 0) {
                this.f9958a.add(0, new d(0, 0, 0));
            }
            this.f9958a.add(new d(this.f9962e, this.f9963f, 0));
        }

        public void b(RecyclerView.h hVar) {
            c(new androidx.recyclerview.widget.b(hVar));
        }

        public void c(InterfaceC2138d interfaceC2138d) {
            int i6;
            C2135a c2135a = interfaceC2138d instanceof C2135a ? (C2135a) interfaceC2138d : new C2135a(interfaceC2138d);
            int i7 = this.f9962e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i8 = this.f9962e;
            int i9 = this.f9963f;
            for (int size = this.f9958a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f9958a.get(size);
                int a6 = dVar.a();
                int b6 = dVar.b();
                while (true) {
                    if (i8 <= a6) {
                        break;
                    }
                    i8--;
                    int i10 = this.f9959b[i8];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        f g6 = g(arrayDeque, i11, false);
                        if (g6 != null) {
                            int i12 = (i7 - g6.f9966b) - 1;
                            c2135a.a(i8, i12);
                            if ((i10 & 4) != 0) {
                                c2135a.d(i12, 1, this.f9961d.getChangePayload(i8, i11));
                            }
                        } else {
                            arrayDeque.add(new f(i8, (i7 - i8) - 1, true));
                        }
                    } else {
                        c2135a.c(i8, 1);
                        i7--;
                    }
                }
                while (i9 > b6) {
                    i9--;
                    int i13 = this.f9960c[i9];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        f g7 = g(arrayDeque, i14, true);
                        if (g7 == null) {
                            arrayDeque.add(new f(i9, i7 - i8, false));
                        } else {
                            c2135a.a((i7 - g7.f9966b) - 1, i8);
                            if ((i13 & 4) != 0) {
                                c2135a.d(i8, 1, this.f9961d.getChangePayload(i14, i9));
                            }
                        }
                    } else {
                        c2135a.b(i8, 1);
                        i7++;
                    }
                }
                int i15 = dVar.f9955a;
                int i16 = dVar.f9956b;
                for (i6 = 0; i6 < dVar.f9957c; i6++) {
                    if ((this.f9959b[i15] & 15) == 2) {
                        c2135a.d(i15, 1, this.f9961d.getChangePayload(i15, i16));
                    }
                    i15++;
                    i16++;
                }
                i8 = dVar.f9955a;
                i9 = dVar.f9956b;
            }
            c2135a.e();
        }

        public final void d(int i6) {
            int size = this.f9958a.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                d dVar = (d) this.f9958a.get(i8);
                while (i7 < dVar.f9956b) {
                    if (this.f9960c[i7] == 0 && this.f9961d.areItemsTheSame(i6, i7)) {
                        int i9 = this.f9961d.areContentsTheSame(i6, i7) ? 8 : 4;
                        this.f9959b[i6] = (i7 << 4) | i9;
                        this.f9960c[i7] = (i6 << 4) | i9;
                        return;
                    }
                    i7++;
                }
                i7 = dVar.b();
            }
        }

        public final void e() {
            for (d dVar : this.f9958a) {
                for (int i6 = 0; i6 < dVar.f9957c; i6++) {
                    int i7 = dVar.f9955a + i6;
                    int i8 = dVar.f9956b + i6;
                    int i9 = this.f9961d.areContentsTheSame(i7, i8) ? 1 : 2;
                    this.f9959b[i7] = (i8 << 4) | i9;
                    this.f9960c[i8] = (i7 << 4) | i9;
                }
            }
            if (this.f9964g) {
                f();
            }
        }

        public final void f() {
            int i6 = 0;
            for (d dVar : this.f9958a) {
                while (i6 < dVar.f9955a) {
                    if (this.f9959b[i6] == 0) {
                        d(i6);
                    }
                    i6++;
                }
                i6 = dVar.a();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public int f9965a;

        /* renamed from: b, reason: collision with root package name */
        public int f9966b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9967c;

        public f(int i6, int i7, boolean z6) {
            this.f9965a = i6;
            this.f9966b = i7;
            this.f9967c = z6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public int f9968a;

        /* renamed from: b, reason: collision with root package name */
        public int f9969b;

        /* renamed from: c, reason: collision with root package name */
        public int f9970c;

        /* renamed from: d, reason: collision with root package name */
        public int f9971d;

        public g() {
        }

        public int a() {
            return this.f9971d - this.f9970c;
        }

        public int b() {
            return this.f9969b - this.f9968a;
        }

        public g(int i6, int i7, int i8, int i9) {
            this.f9968a = i6;
            this.f9969b = i7;
            this.f9970c = i8;
            this.f9971d = i9;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f9972a;

        /* renamed from: b, reason: collision with root package name */
        public int f9973b;

        /* renamed from: c, reason: collision with root package name */
        public int f9974c;

        /* renamed from: d, reason: collision with root package name */
        public int f9975d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9976e;

        public int a() {
            return Math.min(this.f9974c - this.f9972a, this.f9975d - this.f9973b);
        }

        public boolean b() {
            return this.f9975d - this.f9973b != this.f9974c - this.f9972a;
        }

        public boolean c() {
            return this.f9975d - this.f9973b > this.f9974c - this.f9972a;
        }

        public d d() {
            if (b()) {
                return this.f9976e ? new d(this.f9972a, this.f9973b, a()) : c() ? new d(this.f9972a, this.f9973b + 1, a()) : new d(this.f9972a + 1, this.f9973b, a());
            }
            int i6 = this.f9972a;
            return new d(i6, this.f9973b, this.f9974c - i6);
        }
    }

    public static h a(g gVar, b bVar, c cVar, c cVar2, int i6) {
        int b6;
        int i7;
        int i8;
        boolean z6 = (gVar.b() - gVar.a()) % 2 == 0;
        int b7 = gVar.b() - gVar.a();
        int i9 = -i6;
        for (int i10 = i9; i10 <= i6; i10 += 2) {
            if (i10 == i9 || (i10 != i6 && cVar2.b(i10 + 1) < cVar2.b(i10 - 1))) {
                b6 = cVar2.b(i10 + 1);
                i7 = b6;
            } else {
                b6 = cVar2.b(i10 - 1);
                i7 = b6 - 1;
            }
            int i11 = gVar.f9971d - ((gVar.f9969b - i7) - i10);
            int i12 = (i6 == 0 || i7 != b6) ? i11 : i11 + 1;
            while (i7 > gVar.f9968a && i11 > gVar.f9970c && bVar.areItemsTheSame(i7 - 1, i11 - 1)) {
                i7--;
                i11--;
            }
            cVar2.c(i10, i7);
            if (z6 && (i8 = b7 - i10) >= i9 && i8 <= i6 && cVar.b(i8) >= i7) {
                h hVar = new h();
                hVar.f9972a = i7;
                hVar.f9973b = i11;
                hVar.f9974c = b6;
                hVar.f9975d = i12;
                hVar.f9976e = true;
                return hVar;
            }
        }
        return null;
    }

    public static C0148e b(b bVar) {
        return c(bVar, true);
    }

    public static C0148e c(b bVar, boolean z6) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new g(0, oldListSize, 0, newListSize));
        int i6 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i6);
        c cVar2 = new c(i6);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar = (g) arrayList2.remove(arrayList2.size() - 1);
            h e6 = e(gVar, bVar, cVar, cVar2);
            if (e6 != null) {
                if (e6.a() > 0) {
                    arrayList.add(e6.d());
                }
                g gVar2 = arrayList3.isEmpty() ? new g() : (g) arrayList3.remove(arrayList3.size() - 1);
                gVar2.f9968a = gVar.f9968a;
                gVar2.f9970c = gVar.f9970c;
                gVar2.f9969b = e6.f9972a;
                gVar2.f9971d = e6.f9973b;
                arrayList2.add(gVar2);
                gVar.f9969b = gVar.f9969b;
                gVar.f9971d = gVar.f9971d;
                gVar.f9968a = e6.f9974c;
                gVar.f9970c = e6.f9975d;
                arrayList2.add(gVar);
            } else {
                arrayList3.add(gVar);
            }
        }
        Collections.sort(arrayList, f9952a);
        return new C0148e(bVar, arrayList, cVar.a(), cVar2.a(), z6);
    }

    public static h d(g gVar, b bVar, c cVar, c cVar2, int i6) {
        int b6;
        int i7;
        int i8;
        boolean z6 = Math.abs(gVar.b() - gVar.a()) % 2 == 1;
        int b7 = gVar.b() - gVar.a();
        int i9 = -i6;
        for (int i10 = i9; i10 <= i6; i10 += 2) {
            if (i10 == i9 || (i10 != i6 && cVar.b(i10 + 1) > cVar.b(i10 - 1))) {
                b6 = cVar.b(i10 + 1);
                i7 = b6;
            } else {
                b6 = cVar.b(i10 - 1);
                i7 = b6 + 1;
            }
            int i11 = (gVar.f9970c + (i7 - gVar.f9968a)) - i10;
            int i12 = (i6 == 0 || i7 != b6) ? i11 : i11 - 1;
            while (i7 < gVar.f9969b && i11 < gVar.f9971d && bVar.areItemsTheSame(i7, i11)) {
                i7++;
                i11++;
            }
            cVar.c(i10, i7);
            if (z6 && (i8 = b7 - i10) >= i9 + 1 && i8 <= i6 - 1 && cVar2.b(i8) <= i7) {
                h hVar = new h();
                hVar.f9972a = b6;
                hVar.f9973b = i12;
                hVar.f9974c = i7;
                hVar.f9975d = i11;
                hVar.f9976e = false;
                return hVar;
            }
        }
        return null;
    }

    public static h e(g gVar, b bVar, c cVar, c cVar2) {
        if (gVar.b() >= 1 && gVar.a() >= 1) {
            int b6 = ((gVar.b() + gVar.a()) + 1) / 2;
            cVar.c(1, gVar.f9968a);
            cVar2.c(1, gVar.f9969b);
            for (int i6 = 0; i6 < b6; i6++) {
                h d6 = d(gVar, bVar, cVar, cVar2, i6);
                if (d6 != null) {
                    return d6;
                }
                h a6 = a(gVar, bVar, cVar, cVar2, i6);
                if (a6 != null) {
                    return a6;
                }
            }
        }
        return null;
    }
}
