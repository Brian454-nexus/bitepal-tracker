package w1;

import android.util.SparseArray;
import c1.AbstractC1119a;
import c1.InterfaceC1125g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h0 {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1125g f20055c;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f20054b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public int f20053a = -1;

    public h0(InterfaceC1125g interfaceC1125g) {
        this.f20055c = interfaceC1125g;
    }

    public void a(int i6, Object obj) {
        if (this.f20053a == -1) {
            AbstractC1119a.g(this.f20054b.size() == 0);
            this.f20053a = 0;
        }
        if (this.f20054b.size() > 0) {
            SparseArray sparseArray = this.f20054b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC1119a.a(i6 >= keyAt);
            if (keyAt == i6) {
                InterfaceC1125g interfaceC1125g = this.f20055c;
                SparseArray sparseArray2 = this.f20054b;
                interfaceC1125g.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f20054b.append(i6, obj);
    }

    public void b() {
        for (int i6 = 0; i6 < this.f20054b.size(); i6++) {
            this.f20055c.accept(this.f20054b.valueAt(i6));
        }
        this.f20053a = -1;
        this.f20054b.clear();
    }

    public void c(int i6) {
        for (int size = this.f20054b.size() - 1; size >= 0 && i6 < this.f20054b.keyAt(size); size--) {
            this.f20055c.accept(this.f20054b.valueAt(size));
            this.f20054b.removeAt(size);
        }
        this.f20053a = this.f20054b.size() > 0 ? Math.min(this.f20053a, this.f20054b.size() - 1) : -1;
    }

    public void d(int i6) {
        int i7 = 0;
        while (i7 < this.f20054b.size() - 1) {
            int i8 = i7 + 1;
            if (i6 < this.f20054b.keyAt(i8)) {
                return;
            }
            this.f20055c.accept(this.f20054b.valueAt(i7));
            this.f20054b.removeAt(i7);
            int i9 = this.f20053a;
            if (i9 > 0) {
                this.f20053a = i9 - 1;
            }
            i7 = i8;
        }
    }

    public Object e(int i6) {
        if (this.f20053a == -1) {
            this.f20053a = 0;
        }
        while (true) {
            int i7 = this.f20053a;
            if (i7 <= 0 || i6 >= this.f20054b.keyAt(i7)) {
                break;
            }
            this.f20053a--;
        }
        while (this.f20053a < this.f20054b.size() - 1 && i6 >= this.f20054b.keyAt(this.f20053a + 1)) {
            this.f20053a++;
        }
        return this.f20054b.valueAt(this.f20053a);
    }

    public Object f() {
        return this.f20054b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f20054b.size() == 0;
    }
}
