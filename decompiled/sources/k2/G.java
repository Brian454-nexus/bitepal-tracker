package k2;

import E1.AbstractC0303e;
import E1.InterfaceC0315q;
import c1.AbstractC1117K;
import c1.C1111E;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class G extends AbstractC0303e {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements AbstractC0303e.f {

        /* renamed from: a, reason: collision with root package name */
        public final C1111E f16443a;

        /* renamed from: b, reason: collision with root package name */
        public final C1144z f16444b = new C1144z();

        /* renamed from: c, reason: collision with root package name */
        public final int f16445c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16446d;

        public a(int i6, C1111E c1111e, int i7) {
            this.f16445c = i6;
            this.f16443a = c1111e;
            this.f16446d = i7;
        }

        @Override // E1.AbstractC0303e.f
        public AbstractC0303e.C0023e a(InterfaceC0315q interfaceC0315q, long j6) {
            long position = interfaceC0315q.getPosition();
            int min = (int) Math.min(this.f16446d, interfaceC0315q.a() - position);
            this.f16444b.P(min);
            interfaceC0315q.s(this.f16444b.e(), 0, min);
            return c(this.f16444b, j6, position);
        }

        @Override // E1.AbstractC0303e.f
        public void b() {
            this.f16444b.Q(AbstractC1117K.f10565f);
        }

        public final AbstractC0303e.C0023e c(C1144z c1144z, long j6, long j7) {
            int a6;
            int a7;
            int g6 = c1144z.g();
            long j8 = -1;
            long j9 = -1;
            long j10 = -9223372036854775807L;
            while (c1144z.a() >= 188 && (a7 = (a6 = L.a(c1144z.e(), c1144z.f(), g6)) + 188) <= g6) {
                long c6 = L.c(c1144z, a6, this.f16445c);
                if (c6 != -9223372036854775807L) {
                    long b6 = this.f16443a.b(c6);
                    if (b6 > j6) {
                        return j10 == -9223372036854775807L ? AbstractC0303e.C0023e.d(b6, j7) : AbstractC0303e.C0023e.e(j7 + j9);
                    }
                    if (100000 + b6 > j6) {
                        return AbstractC0303e.C0023e.e(j7 + a6);
                    }
                    j9 = a6;
                    j10 = b6;
                }
                c1144z.T(a7);
                j8 = a7;
            }
            return j10 != -9223372036854775807L ? AbstractC0303e.C0023e.f(j10, j7 + j8) : AbstractC0303e.C0023e.f1014d;
        }
    }

    public G(C1111E c1111e, long j6, long j7, int i6, int i7) {
        super(new AbstractC0303e.b(), new a(i6, c1111e, i7), j6, 0L, j6 + 1, 0L, j7, 188L, 940);
    }
}
