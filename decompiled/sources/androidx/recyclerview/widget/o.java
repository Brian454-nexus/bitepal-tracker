package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final b f10101a;

    /* renamed from: b, reason: collision with root package name */
    public a f10102b = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f10103a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f10104b;

        /* renamed from: c, reason: collision with root package name */
        public int f10105c;

        /* renamed from: d, reason: collision with root package name */
        public int f10106d;

        /* renamed from: e, reason: collision with root package name */
        public int f10107e;

        public void a(int i6) {
            this.f10103a = i6 | this.f10103a;
        }

        public boolean b() {
            int i6 = this.f10103a;
            if ((i6 & 7) != 0 && (i6 & c(this.f10106d, this.f10104b)) == 0) {
                return false;
            }
            int i7 = this.f10103a;
            if ((i7 & 112) != 0 && (i7 & (c(this.f10106d, this.f10105c) << 4)) == 0) {
                return false;
            }
            int i8 = this.f10103a;
            if ((i8 & 1792) != 0 && (i8 & (c(this.f10107e, this.f10104b) << 8)) == 0) {
                return false;
            }
            int i9 = this.f10103a;
            return (i9 & 28672) == 0 || (i9 & (c(this.f10107e, this.f10105c) << 12)) != 0;
        }

        public int c(int i6, int i7) {
            if (i6 > i7) {
                return 1;
            }
            return i6 == i7 ? 2 : 4;
        }

        public void d() {
            this.f10103a = 0;
        }

        public void e(int i6, int i7, int i8, int i9) {
            this.f10104b = i6;
            this.f10105c = i7;
            this.f10106d = i8;
            this.f10107e = i9;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        View a(int i6);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public o(b bVar) {
        this.f10101a = bVar;
    }

    public View a(int i6, int i7, int i8, int i9) {
        int c6 = this.f10101a.c();
        int d6 = this.f10101a.d();
        int i10 = i7 > i6 ? 1 : -1;
        View view = null;
        while (i6 != i7) {
            View a6 = this.f10101a.a(i6);
            this.f10102b.e(c6, d6, this.f10101a.b(a6), this.f10101a.e(a6));
            if (i8 != 0) {
                this.f10102b.d();
                this.f10102b.a(i8);
                if (this.f10102b.b()) {
                    return a6;
                }
            }
            if (i9 != 0) {
                this.f10102b.d();
                this.f10102b.a(i9);
                if (this.f10102b.b()) {
                    view = a6;
                }
            }
            i6 += i10;
        }
        return view;
    }

    public boolean b(View view, int i6) {
        this.f10102b.e(this.f10101a.c(), this.f10101a.d(), this.f10101a.b(view), this.f10101a.e(view));
        if (i6 == 0) {
            return false;
        }
        this.f10102b.d();
        this.f10102b.a(i6);
        return this.f10102b.b();
    }
}
