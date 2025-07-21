package A1;

import A1.b;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f93c;

    /* renamed from: d, reason: collision with root package name */
    public int f94d;

    /* renamed from: e, reason: collision with root package name */
    public int f95e;

    /* renamed from: f, reason: collision with root package name */
    public int f96f;

    /* renamed from: g, reason: collision with root package name */
    public a[] f97g;

    public g(boolean z6, int i6) {
        this(z6, i6, 0);
    }

    @Override // A1.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f97g;
                int i6 = this.f96f;
                this.f96f = i6 + 1;
                aVarArr[i6] = aVar.a();
                this.f95e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // A1.b
    public synchronized a b() {
        a aVar;
        try {
            this.f95e++;
            int i6 = this.f96f;
            if (i6 > 0) {
                a[] aVarArr = this.f97g;
                int i7 = i6 - 1;
                this.f96f = i7;
                aVar = (a) AbstractC1119a.e(aVarArr[i7]);
                this.f97g[this.f96f] = null;
            } else {
                aVar = new a(new byte[this.f92b], 0);
                int i8 = this.f95e;
                a[] aVarArr2 = this.f97g;
                if (i8 > aVarArr2.length) {
                    this.f97g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // A1.b
    public synchronized void c() {
        try {
            int i6 = 0;
            int max = Math.max(0, AbstractC1117K.k(this.f94d, this.f92b) - this.f95e);
            int i7 = this.f96f;
            if (max >= i7) {
                return;
            }
            if (this.f93c != null) {
                int i8 = i7 - 1;
                while (i6 <= i8) {
                    a aVar = (a) AbstractC1119a.e(this.f97g[i6]);
                    if (aVar.f80a == this.f93c) {
                        i6++;
                    } else {
                        a aVar2 = (a) AbstractC1119a.e(this.f97g[i8]);
                        if (aVar2.f80a != this.f93c) {
                            i8--;
                        } else {
                            a[] aVarArr = this.f97g;
                            aVarArr[i6] = aVar2;
                            aVarArr[i8] = aVar;
                            i8--;
                            i6++;
                        }
                    }
                }
                max = Math.max(max, i6);
                if (max >= this.f96f) {
                    return;
                }
            }
            Arrays.fill(this.f97g, max, this.f96f, (Object) null);
            this.f96f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // A1.b
    public synchronized void d(a aVar) {
        a[] aVarArr = this.f97g;
        int i6 = this.f96f;
        this.f96f = i6 + 1;
        aVarArr[i6] = aVar;
        this.f95e--;
        notifyAll();
    }

    @Override // A1.b
    public int e() {
        return this.f92b;
    }

    public synchronized int f() {
        return this.f95e * this.f92b;
    }

    public synchronized void g() {
        if (this.f91a) {
            h(0);
        }
    }

    public synchronized void h(int i6) {
        boolean z6 = i6 < this.f94d;
        this.f94d = i6;
        if (z6) {
            c();
        }
    }

    public g(boolean z6, int i6, int i7) {
        AbstractC1119a.a(i6 > 0);
        AbstractC1119a.a(i7 >= 0);
        this.f91a = z6;
        this.f92b = i6;
        this.f96f = i7;
        this.f97g = new a[i7 + 100];
        if (i7 > 0) {
            this.f93c = new byte[i7 * i6];
            for (int i8 = 0; i8 < i7; i8++) {
                this.f97g[i8] = new a(this.f93c, i8 * i6);
            }
            return;
        }
        this.f93c = null;
    }
}
