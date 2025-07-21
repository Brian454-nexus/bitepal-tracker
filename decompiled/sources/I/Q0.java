package I;

import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class Q0 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);


        /* renamed from: a, reason: collision with root package name */
        public final int f2344a;

        a(int i6) {
            this.f2344a = i6;
        }

        public int b() {
            return this.f2344a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static Q0 a(b bVar, a aVar) {
        return new C0438l(bVar, aVar, 0L);
    }

    public static Q0 b(b bVar, a aVar, long j6) {
        return new C0438l(bVar, aVar, j6);
    }

    public static b e(int i6) {
        return i6 == 35 ? b.YUV : i6 == 256 ? b.JPEG : i6 == 32 ? b.RAW : b.PRIV;
    }

    public static Q0 h(int i6, int i7, Size size, R0 r02) {
        b e6 = e(i7);
        a aVar = a.NOT_SUPPORT;
        int a6 = S.d.a(size);
        if (i6 == 1) {
            if (a6 <= S.d.a(r02.i(i7))) {
                aVar = a.s720p;
            } else if (a6 <= S.d.a(r02.g(i7))) {
                aVar = a.s1440p;
            }
        } else if (a6 <= S.d.a(r02.b())) {
            aVar = a.VGA;
        } else if (a6 <= S.d.a(r02.e())) {
            aVar = a.PREVIEW;
        } else if (a6 <= S.d.a(r02.f())) {
            aVar = a.RECORD;
        } else if (a6 <= S.d.a(r02.c(i7))) {
            aVar = a.MAXIMUM;
        } else {
            Size k6 = r02.k(i7);
            if (k6 != null && a6 <= S.d.a(k6)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(e6, aVar);
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public final boolean g(Q0 q02) {
        return q02.c().b() <= c().b() && q02.d() == d();
    }
}
