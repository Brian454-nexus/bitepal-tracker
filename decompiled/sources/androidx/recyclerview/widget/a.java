package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public y0.d f9883a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9884b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9885c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0146a f9886d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f9887e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9888f;

    /* renamed from: g, reason: collision with root package name */
    public final j f9889g;

    /* renamed from: h, reason: collision with root package name */
    public int f9890h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0146a {
        void a(int i6, int i7);

        void b(b bVar);

        void c(int i6, int i7, Object obj);

        void d(b bVar);

        RecyclerView.D e(int i6);

        void f(int i6, int i7);

        void g(int i6, int i7);

        void h(int i6, int i7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f9891a;

        /* renamed from: b, reason: collision with root package name */
        public int f9892b;

        /* renamed from: c, reason: collision with root package name */
        public Object f9893c;

        /* renamed from: d, reason: collision with root package name */
        public int f9894d;

        public b(int i6, int i7, int i8, Object obj) {
            this.f9891a = i6;
            this.f9892b = i7;
            this.f9894d = i8;
            this.f9893c = obj;
        }

        public String a() {
            int i6 = this.f9891a;
            return i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i6 = this.f9891a;
            if (i6 != bVar.f9891a) {
                return false;
            }
            if (i6 == 8 && Math.abs(this.f9894d - this.f9892b) == 1 && this.f9894d == bVar.f9892b && this.f9892b == bVar.f9894d) {
                return true;
            }
            if (this.f9894d != bVar.f9894d || this.f9892b != bVar.f9892b) {
                return false;
            }
            Object obj2 = this.f9893c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f9893c)) {
                    return false;
                }
            } else if (bVar.f9893c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f9891a * 31) + this.f9892b) * 31) + this.f9894d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f9892b + "c:" + this.f9894d + ",p:" + this.f9893c + "]";
        }
    }

    public a(InterfaceC0146a interfaceC0146a) {
        this(interfaceC0146a, false);
    }

    @Override // androidx.recyclerview.widget.j.a
    public void a(b bVar) {
        if (this.f9888f) {
            return;
        }
        bVar.f9893c = null;
        this.f9883a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.j.a
    public b b(int i6, int i7, int i8, Object obj) {
        b bVar = (b) this.f9883a.b();
        if (bVar == null) {
            return new b(i6, i7, i8, obj);
        }
        bVar.f9891a = i6;
        bVar.f9892b = i7;
        bVar.f9894d = i8;
        bVar.f9893c = obj;
        return bVar;
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i6) {
        int size = this.f9884b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f9884b.get(i7);
            int i8 = bVar.f9891a;
            if (i8 != 1) {
                if (i8 == 2) {
                    int i9 = bVar.f9892b;
                    if (i9 <= i6) {
                        int i10 = bVar.f9894d;
                        if (i9 + i10 > i6) {
                            return -1;
                        }
                        i6 -= i10;
                    } else {
                        continue;
                    }
                } else if (i8 == 8) {
                    int i11 = bVar.f9892b;
                    if (i11 == i6) {
                        i6 = bVar.f9894d;
                    } else {
                        if (i11 < i6) {
                            i6--;
                        }
                        if (bVar.f9894d <= i6) {
                            i6++;
                        }
                    }
                }
            } else if (bVar.f9892b <= i6) {
                i6 += bVar.f9894d;
            }
        }
        return i6;
    }

    public final void f(b bVar) {
        boolean z6;
        char c6;
        int i6 = bVar.f9892b;
        int i7 = bVar.f9894d + i6;
        char c7 = 65535;
        int i8 = i6;
        int i9 = 0;
        while (i8 < i7) {
            if (this.f9886d.e(i8) != null || h(i8)) {
                if (c7 == 0) {
                    k(b(2, i6, i9, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c6 = 1;
            } else {
                if (c7 == 1) {
                    v(b(2, i6, i9, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c6 = 0;
            }
            if (z6) {
                i8 -= i9;
                i7 -= i9;
                i9 = 1;
            } else {
                i9++;
            }
            i8++;
            c7 = c6;
        }
        if (i9 != bVar.f9894d) {
            a(bVar);
            bVar = b(2, i6, i9, null);
        }
        if (c7 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i6 = bVar.f9892b;
        int i7 = bVar.f9894d + i6;
        int i8 = 0;
        boolean z6 = -1;
        int i9 = i6;
        while (i6 < i7) {
            if (this.f9886d.e(i6) != null || h(i6)) {
                if (!z6) {
                    k(b(4, i9, i8, bVar.f9893c));
                    i9 = i6;
                    i8 = 0;
                }
                z6 = true;
            } else {
                if (z6) {
                    v(b(4, i9, i8, bVar.f9893c));
                    i9 = i6;
                    i8 = 0;
                }
                z6 = false;
            }
            i8++;
            i6++;
        }
        if (i8 != bVar.f9894d) {
            Object obj = bVar.f9893c;
            a(bVar);
            bVar = b(4, i9, i8, obj);
        }
        if (z6) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    public final boolean h(int i6) {
        int size = this.f9885c.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f9885c.get(i7);
            int i8 = bVar.f9891a;
            if (i8 == 8) {
                if (n(bVar.f9894d, i7 + 1) == i6) {
                    return true;
                }
            } else if (i8 == 1) {
                int i9 = bVar.f9892b;
                int i10 = bVar.f9894d + i9;
                while (i9 < i10) {
                    if (n(i9, i7 + 1) == i6) {
                        return true;
                    }
                    i9++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f9885c.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f9886d.d((b) this.f9885c.get(i6));
        }
        x(this.f9885c);
        this.f9890h = 0;
    }

    public void j() {
        i();
        int size = this.f9884b.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = (b) this.f9884b.get(i6);
            int i7 = bVar.f9891a;
            if (i7 == 1) {
                this.f9886d.d(bVar);
                this.f9886d.g(bVar.f9892b, bVar.f9894d);
            } else if (i7 == 2) {
                this.f9886d.d(bVar);
                this.f9886d.h(bVar.f9892b, bVar.f9894d);
            } else if (i7 == 4) {
                this.f9886d.d(bVar);
                this.f9886d.c(bVar.f9892b, bVar.f9894d, bVar.f9893c);
            } else if (i7 == 8) {
                this.f9886d.d(bVar);
                this.f9886d.a(bVar.f9892b, bVar.f9894d);
            }
            Runnable runnable = this.f9887e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f9884b);
        this.f9890h = 0;
    }

    public final void k(b bVar) {
        int i6;
        int i7 = bVar.f9891a;
        if (i7 == 1 || i7 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z6 = z(bVar.f9892b, i7);
        int i8 = bVar.f9892b;
        int i9 = bVar.f9891a;
        if (i9 == 2) {
            i6 = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i6 = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < bVar.f9894d; i11++) {
            int z7 = z(bVar.f9892b + (i6 * i11), bVar.f9891a);
            int i12 = bVar.f9891a;
            if (i12 == 2 ? z7 != z6 : !(i12 == 4 && z7 == z6 + 1)) {
                b b6 = b(i12, z6, i10, bVar.f9893c);
                l(b6, i8);
                a(b6);
                if (bVar.f9891a == 4) {
                    i8 += i10;
                }
                i10 = 1;
                z6 = z7;
            } else {
                i10++;
            }
        }
        Object obj = bVar.f9893c;
        a(bVar);
        if (i10 > 0) {
            b b7 = b(bVar.f9891a, z6, i10, obj);
            l(b7, i8);
            a(b7);
        }
    }

    public void l(b bVar, int i6) {
        this.f9886d.b(bVar);
        int i7 = bVar.f9891a;
        if (i7 == 2) {
            this.f9886d.h(i6, bVar.f9894d);
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f9886d.c(i6, bVar.f9894d, bVar.f9893c);
        }
    }

    public int m(int i6) {
        return n(i6, 0);
    }

    public int n(int i6, int i7) {
        int size = this.f9885c.size();
        while (i7 < size) {
            b bVar = (b) this.f9885c.get(i7);
            int i8 = bVar.f9891a;
            if (i8 == 8) {
                int i9 = bVar.f9892b;
                if (i9 == i6) {
                    i6 = bVar.f9894d;
                } else {
                    if (i9 < i6) {
                        i6--;
                    }
                    if (bVar.f9894d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i10 = bVar.f9892b;
                if (i10 > i6) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = bVar.f9894d;
                    if (i6 < i10 + i11) {
                        return -1;
                    }
                    i6 -= i11;
                } else if (i8 == 1) {
                    i6 += bVar.f9894d;
                }
            }
            i7++;
        }
        return i6;
    }

    public boolean o(int i6) {
        return (i6 & this.f9890h) != 0;
    }

    public boolean p() {
        return this.f9884b.size() > 0;
    }

    public boolean q() {
        return (this.f9885c.isEmpty() || this.f9884b.isEmpty()) ? false : true;
    }

    public boolean r(int i6, int i7, Object obj) {
        if (i7 < 1) {
            return false;
        }
        this.f9884b.add(b(4, i6, i7, obj));
        this.f9890h |= 4;
        return this.f9884b.size() == 1;
    }

    public boolean s(int i6, int i7) {
        if (i7 < 1) {
            return false;
        }
        this.f9884b.add(b(1, i6, i7, null));
        this.f9890h |= 1;
        return this.f9884b.size() == 1;
    }

    public boolean t(int i6, int i7, int i8) {
        if (i6 == i7) {
            return false;
        }
        if (i8 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f9884b.add(b(8, i6, i7, null));
        this.f9890h |= 8;
        return this.f9884b.size() == 1;
    }

    public boolean u(int i6, int i7) {
        if (i7 < 1) {
            return false;
        }
        this.f9884b.add(b(2, i6, i7, null));
        this.f9890h |= 2;
        return this.f9884b.size() == 1;
    }

    public final void v(b bVar) {
        this.f9885c.add(bVar);
        int i6 = bVar.f9891a;
        if (i6 == 1) {
            this.f9886d.g(bVar.f9892b, bVar.f9894d);
            return;
        }
        if (i6 == 2) {
            this.f9886d.f(bVar.f9892b, bVar.f9894d);
            return;
        }
        if (i6 == 4) {
            this.f9886d.c(bVar.f9892b, bVar.f9894d, bVar.f9893c);
        } else {
            if (i6 == 8) {
                this.f9886d.a(bVar.f9892b, bVar.f9894d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.f9889g.b(this.f9884b);
        int size = this.f9884b.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = (b) this.f9884b.get(i6);
            int i7 = bVar.f9891a;
            if (i7 == 1) {
                c(bVar);
            } else if (i7 == 2) {
                f(bVar);
            } else if (i7 == 4) {
                g(bVar);
            } else if (i7 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f9887e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f9884b.clear();
    }

    public void x(List list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            a((b) list.get(i6));
        }
        list.clear();
    }

    public void y() {
        x(this.f9884b);
        x(this.f9885c);
        this.f9890h = 0;
    }

    public final int z(int i6, int i7) {
        int i8;
        int i9;
        for (int size = this.f9885c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f9885c.get(size);
            int i10 = bVar.f9891a;
            if (i10 == 8) {
                int i11 = bVar.f9892b;
                int i12 = bVar.f9894d;
                if (i11 < i12) {
                    i9 = i11;
                    i8 = i12;
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                if (i6 < i9 || i6 > i8) {
                    if (i6 < i11) {
                        if (i7 == 1) {
                            bVar.f9892b = i11 + 1;
                            bVar.f9894d = i12 + 1;
                        } else if (i7 == 2) {
                            bVar.f9892b = i11 - 1;
                            bVar.f9894d = i12 - 1;
                        }
                    }
                } else if (i9 == i11) {
                    if (i7 == 1) {
                        bVar.f9894d = i12 + 1;
                    } else if (i7 == 2) {
                        bVar.f9894d = i12 - 1;
                    }
                    i6++;
                } else {
                    if (i7 == 1) {
                        bVar.f9892b = i11 + 1;
                    } else if (i7 == 2) {
                        bVar.f9892b = i11 - 1;
                    }
                    i6--;
                }
            } else {
                int i13 = bVar.f9892b;
                if (i13 <= i6) {
                    if (i10 == 1) {
                        i6 -= bVar.f9894d;
                    } else if (i10 == 2) {
                        i6 += bVar.f9894d;
                    }
                } else if (i7 == 1) {
                    bVar.f9892b = i13 + 1;
                } else if (i7 == 2) {
                    bVar.f9892b = i13 - 1;
                }
            }
        }
        for (int size2 = this.f9885c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f9885c.get(size2);
            if (bVar2.f9891a == 8) {
                int i14 = bVar2.f9894d;
                if (i14 == bVar2.f9892b || i14 < 0) {
                    this.f9885c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f9894d <= 0) {
                this.f9885c.remove(size2);
                a(bVar2);
            }
        }
        return i6;
    }

    public a(InterfaceC0146a interfaceC0146a, boolean z6) {
        this.f9883a = new y0.e(30);
        this.f9884b = new ArrayList();
        this.f9885c = new ArrayList();
        this.f9890h = 0;
        this.f9886d = interfaceC0146a;
        this.f9888f = z6;
        this.f9889g = new j(this);
    }
}
