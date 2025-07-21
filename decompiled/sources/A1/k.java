package A1;

import c1.AbstractC1119a;
import java.io.IOException;
import w1.C2210B;
import w1.C2239y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface k {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f127a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128b;

        /* renamed from: c, reason: collision with root package name */
        public final int f129c;

        /* renamed from: d, reason: collision with root package name */
        public final int f130d;

        public a(int i6, int i7, int i8, int i9) {
            this.f127a = i6;
            this.f128b = i7;
            this.f129c = i8;
            this.f130d = i9;
        }

        public boolean a(int i6) {
            return i6 == 1 ? this.f127a - this.f128b > 1 : this.f129c - this.f130d > 1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f131a;

        /* renamed from: b, reason: collision with root package name */
        public final long f132b;

        public b(int i6, long j6) {
            AbstractC1119a.a(j6 >= 0);
            this.f131a = i6;
            this.f132b = j6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C2239y f133a;

        /* renamed from: b, reason: collision with root package name */
        public final C2210B f134b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f135c;

        /* renamed from: d, reason: collision with root package name */
        public final int f136d;

        public c(C2239y c2239y, C2210B c2210b, IOException iOException, int i6) {
            this.f133a = c2239y;
            this.f134b = c2210b;
            this.f135c = iOException;
            this.f136d = i6;
        }
    }

    long a(c cVar);

    default void b(long j6) {
    }

    b c(a aVar, c cVar);

    int d(int i6);
}
