package Z0;

import android.util.SparseBooleanArray;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f6928a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f6929a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f6930b;

        public b a(int i6) {
            AbstractC1119a.g(!this.f6930b);
            this.f6929a.append(i6, true);
            return this;
        }

        public b b(p pVar) {
            for (int i6 = 0; i6 < pVar.c(); i6++) {
                a(pVar.b(i6));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i6 : iArr) {
                a(i6);
            }
            return this;
        }

        public b d(int i6, boolean z6) {
            return z6 ? a(i6) : this;
        }

        public p e() {
            AbstractC1119a.g(!this.f6930b);
            this.f6930b = true;
            return new p(this.f6929a);
        }
    }

    public boolean a(int i6) {
        return this.f6928a.get(i6);
    }

    public int b(int i6) {
        AbstractC1119a.c(i6, 0, c());
        return this.f6928a.keyAt(i6);
    }

    public int c() {
        return this.f6928a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (AbstractC1117K.f10560a >= 24) {
            return this.f6928a.equals(pVar.f6928a);
        }
        if (c() != pVar.c()) {
            return false;
        }
        for (int i6 = 0; i6 < c(); i6++) {
            if (b(i6) != pVar.b(i6)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (AbstractC1117K.f10560a >= 24) {
            return this.f6928a.hashCode();
        }
        int c6 = c();
        for (int i6 = 0; i6 < c(); i6++) {
            c6 = (c6 * 31) + b(i6);
        }
        return c6;
    }

    public p(SparseBooleanArray sparseBooleanArray) {
        this.f6928a = sparseBooleanArray;
    }
}
