package W2;

import android.util.Log;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5573a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile k f5574b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5575c = 20;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final int f5576d;

        public a(int i6) {
            super(i6);
            this.f5576d = i6;
        }

        @Override // W2.k
        public void a(String str, String str2) {
            if (this.f5576d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // W2.k
        public void b(String str, String str2, Throwable th) {
            if (this.f5576d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // W2.k
        public void c(String str, String str2) {
            if (this.f5576d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // W2.k
        public void d(String str, String str2, Throwable th) {
            if (this.f5576d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // W2.k
        public void f(String str, String str2) {
            if (this.f5576d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // W2.k
        public void g(String str, String str2, Throwable th) {
            if (this.f5576d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // W2.k
        public void j(String str, String str2) {
            if (this.f5576d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // W2.k
        public void k(String str, String str2) {
            if (this.f5576d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // W2.k
        public void l(String str, String str2, Throwable th) {
            if (this.f5576d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public k(int i6) {
    }

    public static k e() {
        k kVar;
        synchronized (f5573a) {
            try {
                if (f5574b == null) {
                    f5574b = new a(3);
                }
                kVar = f5574b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public static void h(k kVar) {
        synchronized (f5573a) {
            f5574b = kVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i6 = f5575c;
        if (length >= i6) {
            sb.append(str.substring(0, i6));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
