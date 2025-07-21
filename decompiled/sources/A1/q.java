package A1;

import A1.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class q {

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f163h = new Comparator() { // from class: A1.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q.b((q.b) obj, (q.b) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator f164i = new Comparator() { // from class: A1.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Float.compare(((q.b) obj).f174c, ((q.b) obj2).f174c);
            return compare;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f165a;

    /* renamed from: e, reason: collision with root package name */
    public int f169e;

    /* renamed from: f, reason: collision with root package name */
    public int f170f;

    /* renamed from: g, reason: collision with root package name */
    public int f171g;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f167c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f166b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f168d = -1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f172a;

        /* renamed from: b, reason: collision with root package name */
        public int f173b;

        /* renamed from: c, reason: collision with root package name */
        public float f174c;

        public b() {
        }
    }

    public q(int i6) {
        this.f165a = i6;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f172a - bVar2.f172a;
    }

    public void c(int i6, float f6) {
        b bVar;
        d();
        int i7 = this.f171g;
        if (i7 > 0) {
            b[] bVarArr = this.f167c;
            int i8 = i7 - 1;
            this.f171g = i8;
            bVar = bVarArr[i8];
        } else {
            bVar = new b();
        }
        int i9 = this.f169e;
        this.f169e = i9 + 1;
        bVar.f172a = i9;
        bVar.f173b = i6;
        bVar.f174c = f6;
        this.f166b.add(bVar);
        this.f170f += i6;
        while (true) {
            int i10 = this.f170f;
            int i11 = this.f165a;
            if (i10 <= i11) {
                return;
            }
            int i12 = i10 - i11;
            b bVar2 = (b) this.f166b.get(0);
            int i13 = bVar2.f173b;
            if (i13 <= i12) {
                this.f170f -= i13;
                this.f166b.remove(0);
                int i14 = this.f171g;
                if (i14 < 5) {
                    b[] bVarArr2 = this.f167c;
                    this.f171g = i14 + 1;
                    bVarArr2[i14] = bVar2;
                }
            } else {
                bVar2.f173b = i13 - i12;
                this.f170f -= i12;
            }
        }
    }

    public final void d() {
        if (this.f168d != 1) {
            Collections.sort(this.f166b, f163h);
            this.f168d = 1;
        }
    }

    public final void e() {
        if (this.f168d != 0) {
            Collections.sort(this.f166b, f164i);
            this.f168d = 0;
        }
    }

    public float f(float f6) {
        e();
        float f7 = f6 * this.f170f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f166b.size(); i7++) {
            b bVar = (b) this.f166b.get(i7);
            i6 += bVar.f173b;
            if (i6 >= f7) {
                return bVar.f174c;
            }
        }
        if (this.f166b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f166b.get(r5.size() - 1)).f174c;
    }

    public void g() {
        this.f166b.clear();
        this.f168d = -1;
        this.f169e = 0;
        this.f170f = 0;
    }
}
