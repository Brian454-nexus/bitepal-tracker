package c1;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: c1.o, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1133o {

    /* renamed from: b, reason: collision with root package name */
    public static int f10620b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f10621c = true;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f10619a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static a f10622d = a.f10623a;

    /* renamed from: c1.o$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10623a = new C0163a();

        /* renamed from: c1.o$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0163a implements a {
            @Override // c1.AbstractC1133o.a
            public void a(String str, String str2, Throwable th) {
                Log.w(str, AbstractC1133o.a(str2, th));
            }

            @Override // c1.AbstractC1133o.a
            public void b(String str, String str2, Throwable th) {
                Log.d(str, AbstractC1133o.a(str2, th));
            }

            @Override // c1.AbstractC1133o.a
            public void c(String str, String str2, Throwable th) {
                Log.i(str, AbstractC1133o.a(str2, th));
            }

            @Override // c1.AbstractC1133o.a
            public void e(String str, String str2, Throwable th) {
                Log.e(str, AbstractC1133o.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String e6 = e(th);
        if (TextUtils.isEmpty(e6)) {
            return str;
        }
        return str + "\n  " + e6.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f10619a) {
            try {
                if (f10620b == 0) {
                    f10622d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f10619a) {
            try {
                if (f10620b <= 3) {
                    f10622d.e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f10619a) {
            try {
                if (f10620b <= 3) {
                    f10622d.e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f10619a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f10621c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f10619a) {
            try {
                if (f10620b <= 1) {
                    f10622d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f10619a) {
            try {
                if (f10620b <= 2) {
                    f10622d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f10619a) {
            try {
                if (f10620b <= 2) {
                    f10622d.a(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
