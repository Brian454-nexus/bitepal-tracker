package k1;

import Z0.q;
import c1.AbstractC1117K;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final i f16379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16380b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16381c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f16382d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16383e;

        /* renamed from: f, reason: collision with root package name */
        public final List f16384f;

        /* renamed from: g, reason: collision with root package name */
        public final long f16385g;

        /* renamed from: h, reason: collision with root package name */
        public final long f16386h;

        /* renamed from: i, reason: collision with root package name */
        public final long f16387i;

        public a(i iVar, long j6, long j7, long j8, long j9, List list, long j10, long j11, long j12) {
            super(iVar, j6, j7);
            this.f16382d = j8;
            this.f16383e = j9;
            this.f16384f = list;
            this.f16387i = j10;
            this.f16385g = j11;
            this.f16386h = j12;
        }

        public long c(long j6, long j7) {
            long g6 = g(j6);
            return g6 != -1 ? g6 : (int) (i((j7 - this.f16386h) + this.f16387i, j6) - d(j6, j7));
        }

        public long d(long j6, long j7) {
            if (g(j6) == -1) {
                long j8 = this.f16385g;
                if (j8 != -9223372036854775807L) {
                    return Math.max(e(), i((j7 - this.f16386h) - j8, j6));
                }
            }
            return e();
        }

        public long e() {
            return this.f16382d;
        }

        public long f(long j6, long j7) {
            if (this.f16384f != null) {
                return -9223372036854775807L;
            }
            long d6 = d(j6, j7) + c(j6, j7);
            return (j(d6) + h(d6, j6)) - this.f16387i;
        }

        public abstract long g(long j6);

        public final long h(long j6, long j7) {
            List list = this.f16384f;
            if (list != null) {
                return (((d) list.get((int) (j6 - this.f16382d))).f16393b * 1000000) / this.f16380b;
            }
            long g6 = g(j7);
            return (g6 == -1 || j6 != (e() + g6) - 1) ? (this.f16383e * 1000000) / this.f16380b : j7 - j(j6);
        }

        public long i(long j6, long j7) {
            long e6 = e();
            long g6 = g(j7);
            if (g6 != 0) {
                if (this.f16384f != null) {
                    long j8 = (g6 + e6) - 1;
                    long j9 = e6;
                    while (j9 <= j8) {
                        long j10 = ((j8 - j9) / 2) + j9;
                        long j11 = j(j10);
                        if (j11 < j6) {
                            j9 = j10 + 1;
                        } else {
                            if (j11 <= j6) {
                                return j10;
                            }
                            j8 = j10 - 1;
                        }
                    }
                    return j9 == e6 ? j9 : j8;
                }
                long j12 = this.f16382d + (j6 / ((this.f16383e * 1000000) / this.f16380b));
                if (j12 >= e6) {
                    return g6 == -1 ? j12 : Math.min(j12, (e6 + g6) - 1);
                }
            }
            return e6;
        }

        public final long j(long j6) {
            List list = this.f16384f;
            return AbstractC1117K.W0(list != null ? ((d) list.get((int) (j6 - this.f16382d))).f16392a - this.f16381c : (j6 - this.f16382d) * this.f16383e, 1000000L, this.f16380b);
        }

        public abstract i k(j jVar, long j6);

        public boolean l() {
            return this.f16384f != null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        public final List f16388j;

        public b(i iVar, long j6, long j7, long j8, long j9, List list, long j10, List list2, long j11, long j12) {
            super(iVar, j6, j7, j8, j9, list, j10, j11, j12);
            this.f16388j = list2;
        }

        @Override // k1.k.a
        public long g(long j6) {
            return this.f16388j.size();
        }

        @Override // k1.k.a
        public i k(j jVar, long j6) {
            return (i) this.f16388j.get((int) (j6 - this.f16382d));
        }

        @Override // k1.k.a
        public boolean l() {
            return true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public final n f16389j;

        /* renamed from: k, reason: collision with root package name */
        public final n f16390k;

        /* renamed from: l, reason: collision with root package name */
        public final long f16391l;

        public c(i iVar, long j6, long j7, long j8, long j9, long j10, List list, long j11, n nVar, n nVar2, long j12, long j13) {
            super(iVar, j6, j7, j8, j10, list, j11, j12, j13);
            this.f16389j = nVar;
            this.f16390k = nVar2;
            this.f16391l = j9;
        }

        @Override // k1.k
        public i a(j jVar) {
            n nVar = this.f16389j;
            if (nVar == null) {
                return super.a(jVar);
            }
            q qVar = jVar.f16366b;
            return new i(nVar.a(qVar.f6977a, 0L, qVar.f6985i, 0L), 0L, -1L);
        }

        @Override // k1.k.a
        public long g(long j6) {
            if (this.f16384f != null) {
                return r0.size();
            }
            long j7 = this.f16391l;
            if (j7 != -1) {
                return (j7 - this.f16382d) + 1;
            }
            if (j6 != -9223372036854775807L) {
                return B6.a.a(BigInteger.valueOf(j6).multiply(BigInteger.valueOf(this.f16380b)), BigInteger.valueOf(this.f16383e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // k1.k.a
        public i k(j jVar, long j6) {
            List list = this.f16384f;
            long j7 = list != null ? ((d) list.get((int) (j6 - this.f16382d))).f16392a : (j6 - this.f16382d) * this.f16383e;
            n nVar = this.f16390k;
            q qVar = jVar.f16366b;
            return new i(nVar.a(qVar.f6977a, j6, qVar.f6985i, j7), 0L, -1L);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f16392a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16393b;

        public d(long j6, long j7) {
            this.f16392a = j6;
            this.f16393b = j7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f16392a == dVar.f16392a && this.f16393b == dVar.f16393b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f16392a) * 31) + ((int) this.f16393b);
        }
    }

    public k(i iVar, long j6, long j7) {
        this.f16379a = iVar;
        this.f16380b = j6;
        this.f16381c = j7;
    }

    public i a(j jVar) {
        return this.f16379a;
    }

    public long b() {
        return AbstractC1117K.W0(this.f16381c, 1000000L, this.f16380b);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f16394d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16395e;

        public e(i iVar, long j6, long j7, long j8, long j9) {
            super(iVar, j6, j7);
            this.f16394d = j8;
            this.f16395e = j9;
        }

        public i c() {
            long j6 = this.f16395e;
            if (j6 <= 0) {
                return null;
            }
            return new i(null, this.f16394d, j6);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
