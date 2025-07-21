package z0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f21449a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Window f21450a;

        /* renamed from: b, reason: collision with root package name */
        public final C2440z f21451b;

        public a(Window window, C2440z c2440z) {
            this.f21450a = window;
            this.f21451b = c2440z;
        }

        public void c(int i6) {
            View decorView = this.f21450a.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        public void d(int i6) {
            this.f21450a.addFlags(i6);
        }

        public void e(int i6) {
            View decorView = this.f21450a.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }

        public void f(int i6) {
            this.f21450a.clearFlags(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends a {
        public b(Window window, C2440z c2440z) {
            super(window, c2440z);
        }

        @Override // z0.i0.g
        public void b(boolean z6) {
            if (!z6) {
                e(ConstantsKt.DEFAULT_BUFFER_SIZE);
                return;
            }
            f(67108864);
            d(IntCompanionObject.MIN_VALUE);
            c(ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends b {
        public c(Window window, C2440z c2440z) {
            super(window, c2440z);
        }

        @Override // z0.i0.g
        public void a(boolean z6) {
            if (!z6) {
                e(16);
                return;
            }
            f(134217728);
            d(IntCompanionObject.MIN_VALUE);
            c(16);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends d {
        public e(Window window, i0 i0Var, C2440z c2440z) {
            super(window, i0Var, c2440z);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f extends e {
        public f(Window window, i0 i0Var, C2440z c2440z) {
            super(window, i0Var, c2440z);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {
        public abstract void a(boolean z6);

        public abstract void b(boolean z6);
    }

    public i0(Window window, View view) {
        C2440z c2440z = new C2440z(view);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35) {
            this.f21449a = new f(window, this, c2440z);
        } else if (i6 >= 30) {
            this.f21449a = new d(window, this, c2440z);
        } else {
            this.f21449a = new c(window, c2440z);
        }
    }

    public void a(boolean z6) {
        this.f21449a.a(z6);
    }

    public void b(boolean z6) {
        this.f21449a.b(z6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f21452a;

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f21453b;

        /* renamed from: c, reason: collision with root package name */
        public final C2440z f21454c;

        /* renamed from: d, reason: collision with root package name */
        public final j0.k f21455d;

        /* renamed from: e, reason: collision with root package name */
        public Window f21456e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.view.Window r2, z0.i0 r3, z0.C2440z r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = z0.j0.a(r2)
                r1.<init>(r0, r3, r4)
                r1.f21456e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.i0.d.<init>(android.view.Window, z0.i0, z0.z):void");
        }

        @Override // z0.i0.g
        public void a(boolean z6) {
            if (z6) {
                if (this.f21456e != null) {
                    c(16);
                }
                this.f21453b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f21456e != null) {
                    d(16);
                }
                this.f21453b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // z0.i0.g
        public void b(boolean z6) {
            if (z6) {
                if (this.f21456e != null) {
                    c(ConstantsKt.DEFAULT_BUFFER_SIZE);
                }
                this.f21453b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f21456e != null) {
                    d(ConstantsKt.DEFAULT_BUFFER_SIZE);
                }
                this.f21453b.setSystemBarsAppearance(0, 8);
            }
        }

        public void c(int i6) {
            View decorView = this.f21456e.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        public void d(int i6) {
            View decorView = this.f21456e.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, i0 i0Var, C2440z c2440z) {
            this.f21455d = new j0.k();
            this.f21453b = windowInsetsController;
            this.f21452a = i0Var;
            this.f21454c = c2440z;
        }
    }
}
