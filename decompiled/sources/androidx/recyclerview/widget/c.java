package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f9896a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9897b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final List f9898c = new ArrayList();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f9899a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f9900b;

        public void a(int i6) {
            if (i6 < 64) {
                this.f9899a &= ~(1 << i6);
                return;
            }
            a aVar = this.f9900b;
            if (aVar != null) {
                aVar.a(i6 - 64);
            }
        }

        public int b(int i6) {
            a aVar = this.f9900b;
            return aVar == null ? i6 >= 64 ? Long.bitCount(this.f9899a) : Long.bitCount(this.f9899a & ((1 << i6) - 1)) : i6 < 64 ? Long.bitCount(this.f9899a & ((1 << i6) - 1)) : aVar.b(i6 - 64) + Long.bitCount(this.f9899a);
        }

        public final void c() {
            if (this.f9900b == null) {
                this.f9900b = new a();
            }
        }

        public boolean d(int i6) {
            if (i6 < 64) {
                return (this.f9899a & (1 << i6)) != 0;
            }
            c();
            return this.f9900b.d(i6 - 64);
        }

        public void e(int i6, boolean z6) {
            if (i6 >= 64) {
                c();
                this.f9900b.e(i6 - 64, z6);
                return;
            }
            long j6 = this.f9899a;
            boolean z7 = (Long.MIN_VALUE & j6) != 0;
            long j7 = (1 << i6) - 1;
            this.f9899a = ((j6 & (~j7)) << 1) | (j6 & j7);
            if (z6) {
                h(i6);
            } else {
                a(i6);
            }
            if (z7 || this.f9900b != null) {
                c();
                this.f9900b.e(0, z7);
            }
        }

        public boolean f(int i6) {
            if (i6 >= 64) {
                c();
                return this.f9900b.f(i6 - 64);
            }
            long j6 = 1 << i6;
            long j7 = this.f9899a;
            boolean z6 = (j7 & j6) != 0;
            long j8 = j7 & (~j6);
            this.f9899a = j8;
            long j9 = j6 - 1;
            this.f9899a = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
            a aVar = this.f9900b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f9900b.f(0);
            }
            return z6;
        }

        public void g() {
            this.f9899a = 0L;
            a aVar = this.f9900b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i6) {
            if (i6 < 64) {
                this.f9899a |= 1 << i6;
            } else {
                c();
                this.f9900b.h(i6 - 64);
            }
        }

        public String toString() {
            if (this.f9900b == null) {
                return Long.toBinaryString(this.f9899a);
            }
            return this.f9900b.toString() + "xx" + Long.toBinaryString(this.f9899a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        View a(int i6);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.D f(View view);

        void g(int i6);

        void h(View view);

        void i(View view, int i6);

        void j(int i6);

        void k(View view, int i6, ViewGroup.LayoutParams layoutParams);
    }

    public c(b bVar) {
        this.f9896a = bVar;
    }

    public void a(View view, int i6, boolean z6) {
        int c6 = i6 < 0 ? this.f9896a.c() : h(i6);
        this.f9897b.e(c6, z6);
        if (z6) {
            l(view);
        }
        this.f9896a.i(view, c6);
    }

    public void b(View view, boolean z6) {
        a(view, -1, z6);
    }

    public void c(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z6) {
        int c6 = i6 < 0 ? this.f9896a.c() : h(i6);
        this.f9897b.e(c6, z6);
        if (z6) {
            l(view);
        }
        this.f9896a.k(view, c6, layoutParams);
    }

    public void d(int i6) {
        int h6 = h(i6);
        this.f9897b.f(h6);
        this.f9896a.g(h6);
    }

    public View e(int i6) {
        int size = this.f9898c.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) this.f9898c.get(i7);
            RecyclerView.D f6 = this.f9896a.f(view);
            if (f6.getLayoutPosition() == i6 && !f6.isInvalid() && !f6.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i6) {
        return this.f9896a.a(h(i6));
    }

    public int g() {
        return this.f9896a.c() - this.f9898c.size();
    }

    public final int h(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int c6 = this.f9896a.c();
        int i7 = i6;
        while (i7 < c6) {
            int b6 = i6 - (i7 - this.f9897b.b(i7));
            if (b6 == 0) {
                while (this.f9897b.d(i7)) {
                    i7++;
                }
                return i7;
            }
            i7 += b6;
        }
        return -1;
    }

    public View i(int i6) {
        return this.f9896a.a(i6);
    }

    public int j() {
        return this.f9896a.c();
    }

    public void k(View view) {
        int e6 = this.f9896a.e(view);
        if (e6 >= 0) {
            this.f9897b.h(e6);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f9898c.add(view);
        this.f9896a.b(view);
    }

    public int m(View view) {
        int e6 = this.f9896a.e(view);
        if (e6 == -1 || this.f9897b.d(e6)) {
            return -1;
        }
        return e6 - this.f9897b.b(e6);
    }

    public boolean n(View view) {
        return this.f9898c.contains(view);
    }

    public void o() {
        this.f9897b.g();
        for (int size = this.f9898c.size() - 1; size >= 0; size--) {
            this.f9896a.h((View) this.f9898c.get(size));
            this.f9898c.remove(size);
        }
        this.f9896a.d();
    }

    public void p(View view) {
        int e6 = this.f9896a.e(view);
        if (e6 < 0) {
            return;
        }
        if (this.f9897b.f(e6)) {
            t(view);
        }
        this.f9896a.j(e6);
    }

    public void q(int i6) {
        int h6 = h(i6);
        View a6 = this.f9896a.a(h6);
        if (a6 == null) {
            return;
        }
        if (this.f9897b.f(h6)) {
            t(a6);
        }
        this.f9896a.j(h6);
    }

    public boolean r(View view) {
        int e6 = this.f9896a.e(view);
        if (e6 == -1) {
            t(view);
            return true;
        }
        if (!this.f9897b.d(e6)) {
            return false;
        }
        this.f9897b.f(e6);
        t(view);
        this.f9896a.j(e6);
        return true;
    }

    public void s(View view) {
        int e6 = this.f9896a.e(view);
        if (e6 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f9897b.d(e6)) {
            this.f9897b.a(e6);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f9898c.remove(view)) {
            return false;
        }
        this.f9896a.h(view);
        return true;
    }

    public String toString() {
        return this.f9897b.toString() + ", hidden list:" + this.f9898c.size();
    }
}
