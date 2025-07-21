package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f10013e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static Comparator f10014f = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f10016b;

    /* renamed from: c, reason: collision with root package name */
    public long f10017c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10015a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10018d = new ArrayList();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f10026d;
            if ((recyclerView == null) != (cVar2.f10026d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z6 = cVar.f10023a;
            if (z6 != cVar2.f10023a) {
                return z6 ? -1 : 1;
            }
            int i6 = cVar2.f10024b - cVar.f10024b;
            if (i6 != 0) {
                return i6;
            }
            int i7 = cVar.f10025c - cVar2.f10025c;
            if (i7 != 0) {
                return i7;
            }
            return 0;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements RecyclerView.p.c {

        /* renamed from: a, reason: collision with root package name */
        public int f10019a;

        /* renamed from: b, reason: collision with root package name */
        public int f10020b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f10021c;

        /* renamed from: d, reason: collision with root package name */
        public int f10022d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i6, int i7) {
            if (i6 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i7 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i8 = this.f10022d;
            int i9 = i8 * 2;
            int[] iArr = this.f10021c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f10021c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i9 >= iArr.length) {
                int[] iArr3 = new int[i8 * 4];
                this.f10021c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f10021c;
            iArr4[i9] = i6;
            iArr4[i9 + 1] = i7;
            this.f10022d++;
        }

        public void b() {
            int[] iArr = this.f10021c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10022d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z6) {
            this.f10022d = 0;
            int[] iArr = this.f10021c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f9711m;
            if (recyclerView.f9709l == null || pVar == null || !pVar.t0()) {
                return;
            }
            if (z6) {
                if (!recyclerView.f9693d.p()) {
                    pVar.p(recyclerView.f9709l.getItemCount(), this);
                }
            } else if (!recyclerView.m0()) {
                pVar.o(this.f10019a, this.f10020b, recyclerView.f9716o0, this);
            }
            int i6 = this.f10022d;
            if (i6 > pVar.f9795l) {
                pVar.f9795l = i6;
                pVar.f9796m = z6;
                recyclerView.f9689b.K();
            }
        }

        public boolean d(int i6) {
            if (this.f10021c != null) {
                int i7 = this.f10022d * 2;
                for (int i8 = 0; i8 < i7; i8 += 2) {
                    if (this.f10021c[i8] == i6) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i6, int i7) {
            this.f10019a = i6;
            this.f10020b = i7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10023a;

        /* renamed from: b, reason: collision with root package name */
        public int f10024b;

        /* renamed from: c, reason: collision with root package name */
        public int f10025c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f10026d;

        /* renamed from: e, reason: collision with root package name */
        public int f10027e;

        public void a() {
            this.f10023a = false;
            this.f10024b = 0;
            this.f10025c = 0;
            this.f10026d = null;
            this.f10027e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i6) {
        int j6 = recyclerView.f9695e.j();
        for (int i7 = 0; i7 < j6; i7++) {
            RecyclerView.D g02 = RecyclerView.g0(recyclerView.f9695e.i(i7));
            if (g02.mPosition == i6 && !g02.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f10015a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f10015a.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView = (RecyclerView) this.f10015a.get(i7);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f9714n0.c(recyclerView, false);
                i6 += recyclerView.f9714n0.f10022d;
            }
        }
        this.f10018d.ensureCapacity(i6);
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f10015a.get(i9);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f9714n0;
                int abs = Math.abs(bVar.f10019a) + Math.abs(bVar.f10020b);
                for (int i10 = 0; i10 < bVar.f10022d * 2; i10 += 2) {
                    if (i8 >= this.f10018d.size()) {
                        cVar = new c();
                        this.f10018d.add(cVar);
                    } else {
                        cVar = (c) this.f10018d.get(i8);
                    }
                    int[] iArr = bVar.f10021c;
                    int i11 = iArr[i10 + 1];
                    cVar.f10023a = i11 <= abs;
                    cVar.f10024b = abs;
                    cVar.f10025c = i11;
                    cVar.f10026d = recyclerView2;
                    cVar.f10027e = iArr[i10];
                    i8++;
                }
            }
        }
        Collections.sort(this.f10018d, f10014f);
    }

    public final void c(c cVar, long j6) {
        RecyclerView.D i6 = i(cVar.f10026d, cVar.f10027e, cVar.f10023a ? LongCompanionObject.MAX_VALUE : j6);
        if (i6 == null || i6.mNestedRecyclerView == null || !i6.isBound() || i6.isInvalid()) {
            return;
        }
        h(i6.mNestedRecyclerView.get(), j6);
    }

    public final void d(long j6) {
        for (int i6 = 0; i6 < this.f10018d.size(); i6++) {
            c cVar = (c) this.f10018d.get(i6);
            if (cVar.f10026d == null) {
                return;
            }
            c(cVar, j6);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i6, int i7) {
        if (recyclerView.isAttachedToWindow() && this.f10016b == 0) {
            this.f10016b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f9714n0.e(i6, i7);
    }

    public void g(long j6) {
        b();
        d(j6);
    }

    public final void h(RecyclerView recyclerView, long j6) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f9670D && recyclerView.f9695e.j() != 0) {
            recyclerView.U0();
        }
        b bVar = recyclerView.f9714n0;
        bVar.c(recyclerView, true);
        if (bVar.f10022d != 0) {
            try {
                v0.p.a("RV Nested Prefetch");
                recyclerView.f9716o0.f(recyclerView.f9709l);
                for (int i6 = 0; i6 < bVar.f10022d * 2; i6 += 2) {
                    i(recyclerView, bVar.f10021c[i6], j6);
                }
            } finally {
                v0.p.b();
            }
        }
    }

    public final RecyclerView.D i(RecyclerView recyclerView, int i6, long j6) {
        if (e(recyclerView, i6)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f9689b;
        try {
            recyclerView.G0();
            RecyclerView.D I6 = wVar.I(i6, false, j6);
            if (I6 != null) {
                if (!I6.isBound() || I6.isInvalid()) {
                    wVar.a(I6, false);
                } else {
                    wVar.B(I6.itemView);
                }
            }
            recyclerView.I0(false);
            return I6;
        } catch (Throwable th) {
            recyclerView.I0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f10015a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            v0.p.a("RV Prefetch");
            if (!this.f10015a.isEmpty()) {
                int size = this.f10015a.size();
                long j6 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    RecyclerView recyclerView = (RecyclerView) this.f10015a.get(i6);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j6 = Math.max(recyclerView.getDrawingTime(), j6);
                    }
                }
                if (j6 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j6) + this.f10017c);
                }
            }
        } finally {
            this.f10016b = 0L;
            v0.p.b();
        }
    }
}
