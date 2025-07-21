package M1;

import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3390b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3391a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3392b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3393c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3394d;

        public a(String str, String str2, long j6, long j7) {
            this.f3391a = str;
            this.f3392b = str2;
            this.f3393c = j6;
            this.f3394d = j7;
        }
    }

    public c(long j6, List list) {
        this.f3389a = j6;
        this.f3390b = list;
    }

    public T1.a a(long j6) {
        long j7;
        if (this.f3390b.size() < 2) {
            return null;
        }
        long j8 = j6;
        long j9 = -1;
        long j10 = -1;
        long j11 = -1;
        long j12 = -1;
        boolean z6 = false;
        for (int size = this.f3390b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f3390b.get(size);
            boolean equals = "video/mp4".equals(aVar.f3391a) | z6;
            if (size == 0) {
                j8 -= aVar.f3394d;
                j7 = 0;
            } else {
                j7 = j8 - aVar.f3393c;
            }
            long j13 = j7;
            long j14 = j8;
            j8 = j13;
            if (!equals || j8 == j14) {
                z6 = equals;
            } else {
                j12 = j14 - j8;
                j11 = j8;
                z6 = false;
            }
            if (size == 0) {
                j9 = j8;
                j10 = j14;
            }
        }
        if (j11 == -1 || j12 == -1 || j9 == -1 || j10 == -1) {
            return null;
        }
        return new T1.a(j9, j10, this.f3389a, j11, j12);
    }
}
