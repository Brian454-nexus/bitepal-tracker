package Y1;

import E1.AbstractC0316s;
import E1.B;
import E1.C;
import E1.C0302d;
import E1.C0312n;
import Y1.a;
import Y1.e;
import Z0.C0836h;
import Z0.C0841m;
import Z0.q;
import Z0.x;
import Z0.y;
import Z0.z;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1143y;
import c1.C1144z;
import d1.C1179a;
import d1.C1180b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6332a = AbstractC1117K.s0("OpusHead");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6333a;

        /* renamed from: b, reason: collision with root package name */
        public int f6334b;

        /* renamed from: c, reason: collision with root package name */
        public int f6335c;

        /* renamed from: d, reason: collision with root package name */
        public long f6336d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f6337e;

        /* renamed from: f, reason: collision with root package name */
        public final C1144z f6338f;

        /* renamed from: g, reason: collision with root package name */
        public final C1144z f6339g;

        /* renamed from: h, reason: collision with root package name */
        public int f6340h;

        /* renamed from: i, reason: collision with root package name */
        public int f6341i;

        public a(C1144z c1144z, C1144z c1144z2, boolean z6) {
            this.f6339g = c1144z;
            this.f6338f = c1144z2;
            this.f6337e = z6;
            c1144z2.T(12);
            this.f6333a = c1144z2.K();
            c1144z.T(12);
            this.f6341i = c1144z.K();
            AbstractC0316s.a(c1144z.p() == 1, "first_chunk must be 1");
            this.f6334b = -1;
        }

        public boolean a() {
            int i6 = this.f6334b + 1;
            this.f6334b = i6;
            if (i6 == this.f6333a) {
                return false;
            }
            this.f6336d = this.f6337e ? this.f6338f.L() : this.f6338f.I();
            if (this.f6334b == this.f6340h) {
                this.f6335c = this.f6339g.K();
                this.f6339g.U(4);
                int i7 = this.f6341i - 1;
                this.f6341i = i7;
                this.f6340h = i7 > 0 ? this.f6339g.K() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: Y1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0110b {

        /* renamed from: a, reason: collision with root package name */
        public final String f6342a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f6343b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6344c;

        /* renamed from: d, reason: collision with root package name */
        public final long f6345d;

        public C0110b(String str, byte[] bArr, long j6, long j7) {
            this.f6342a = str;
            this.f6343b = bArr;
            this.f6344c = j6;
            this.f6345d = j7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final t[] f6346a;

        /* renamed from: b, reason: collision with root package name */
        public Z0.q f6347b;

        /* renamed from: c, reason: collision with root package name */
        public int f6348c;

        /* renamed from: d, reason: collision with root package name */
        public int f6349d = 0;

        public d(int i6) {
            this.f6346a = new t[i6];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f6350a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6351b;

        /* renamed from: c, reason: collision with root package name */
        public final C1144z f6352c;

        public e(a.b bVar, Z0.q qVar) {
            C1144z c1144z = bVar.f6331b;
            this.f6352c = c1144z;
            c1144z.T(12);
            int K5 = c1144z.K();
            if ("audio/raw".equals(qVar.f6990n)) {
                int i02 = AbstractC1117K.i0(qVar.f6968D, qVar.f6966B);
                if (K5 == 0 || K5 % i02 != 0) {
                    AbstractC1133o.h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + i02 + ", stsz sample size: " + K5);
                    K5 = i02;
                }
            }
            this.f6350a = K5 == 0 ? -1 : K5;
            this.f6351b = c1144z.K();
        }

        @Override // Y1.b.c
        public int a() {
            return this.f6350a;
        }

        @Override // Y1.b.c
        public int b() {
            return this.f6351b;
        }

        @Override // Y1.b.c
        public int c() {
            int i6 = this.f6350a;
            return i6 == -1 ? this.f6352c.K() : i6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final C1144z f6353a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6354b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6355c;

        /* renamed from: d, reason: collision with root package name */
        public int f6356d;

        /* renamed from: e, reason: collision with root package name */
        public int f6357e;

        public f(a.b bVar) {
            C1144z c1144z = bVar.f6331b;
            this.f6353a = c1144z;
            c1144z.T(12);
            this.f6355c = c1144z.K() & 255;
            this.f6354b = c1144z.K();
        }

        @Override // Y1.b.c
        public int a() {
            return -1;
        }

        @Override // Y1.b.c
        public int b() {
            return this.f6354b;
        }

        @Override // Y1.b.c
        public int c() {
            int i6 = this.f6355c;
            if (i6 == 8) {
                return this.f6353a.G();
            }
            if (i6 == 16) {
                return this.f6353a.M();
            }
            int i7 = this.f6356d;
            this.f6356d = i7 + 1;
            if (i7 % 2 != 0) {
                return this.f6357e & 15;
            }
            int G6 = this.f6353a.G();
            this.f6357e = G6;
            return (G6 & 240) >> 4;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f6358a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6359b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6360c;

        public g(int i6, long j6, int i7) {
            this.f6358a = i6;
            this.f6359b = j6;
            this.f6360c = i7;
        }
    }

    public static s A(a.C0109a c0109a, a.b bVar, long j6, C0841m c0841m, boolean z6, boolean z7) {
        long[] jArr;
        long[] jArr2;
        a.C0109a f6;
        Pair j7;
        a.C0109a c0109a2 = (a.C0109a) AbstractC1119a.e(c0109a.f(1835297121));
        int e6 = e(m(((a.b) AbstractC1119a.e(c0109a2.g(1751411826))).f6331b));
        if (e6 == -1) {
            return null;
        }
        g z8 = z(((a.b) AbstractC1119a.e(c0109a.g(1953196132))).f6331b);
        long j8 = j6 == -9223372036854775807L ? z8.f6359b : j6;
        long j9 = r(bVar.f6331b).f13378c;
        long W02 = j8 != -9223372036854775807L ? AbstractC1117K.W0(j8, 1000000L, j9) : -9223372036854775807L;
        a.C0109a c0109a3 = (a.C0109a) AbstractC1119a.e(((a.C0109a) AbstractC1119a.e(c0109a2.f(1835626086))).f(1937007212));
        Pair o6 = o(((a.b) AbstractC1119a.e(c0109a2.g(1835296868))).f6331b);
        a.b g6 = c0109a3.g(1937011556);
        if (g6 == null) {
            throw z.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d x6 = x(g6.f6331b, z8.f6358a, z8.f6360c, (String) o6.second, c0841m, z7);
        if (z6 || (f6 = c0109a.f(1701082227)) == null || (j7 = j(f6)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) j7.first;
            jArr2 = (long[]) j7.second;
            jArr = jArr3;
        }
        if (x6.f6347b == null) {
            return null;
        }
        return new s(z8.f6358a, e6, ((Long) o6.first).longValue(), j9, W02, x6.f6347b, x6.f6349d, x6.f6346a, x6.f6348c, jArr, jArr2);
    }

    public static List B(a.C0109a c0109a, B b6, long j6, C0841m c0841m, boolean z6, boolean z7, y6.g gVar) {
        s sVar;
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < c0109a.f6330d.size(); i6++) {
            a.C0109a c0109a2 = (a.C0109a) c0109a.f6330d.get(i6);
            if (c0109a2.f6327a == 1953653099 && (sVar = (s) gVar.apply(A(c0109a2, (a.b) AbstractC1119a.e(c0109a.g(1836476516)), j6, c0841m, z6, z7))) != null) {
                arrayList.add(w(sVar, (a.C0109a) AbstractC1119a.e(((a.C0109a) AbstractC1119a.e(((a.C0109a) AbstractC1119a.e(c0109a2.f(1835297121))).f(1835626086))).f(1937007212)), b6));
            }
        }
        return arrayList;
    }

    public static x C(a.b bVar) {
        C1144z c1144z = bVar.f6331b;
        c1144z.T(8);
        x xVar = new x(new x.b[0]);
        while (c1144z.a() >= 8) {
            int f6 = c1144z.f();
            int p6 = c1144z.p();
            int p7 = c1144z.p();
            if (p7 == 1835365473) {
                c1144z.T(f6);
                xVar = xVar.c(D(c1144z, f6 + p6));
            } else if (p7 == 1936553057) {
                c1144z.T(f6);
                xVar = xVar.c(q.b(c1144z, f6 + p6));
            } else if (p7 == -1451722374) {
                xVar = xVar.c(F(c1144z));
            }
            c1144z.T(f6 + p6);
        }
        return xVar;
    }

    public static x D(C1144z c1144z, int i6) {
        c1144z.U(8);
        f(c1144z);
        while (c1144z.f() < i6) {
            int f6 = c1144z.f();
            int p6 = c1144z.p();
            if (c1144z.p() == 1768715124) {
                c1144z.T(f6);
                return n(c1144z, f6 + p6);
            }
            c1144z.T(f6 + p6);
        }
        return null;
    }

    public static void E(C1144z c1144z, int i6, int i7, int i8, int i9, int i10, C0841m c0841m, d dVar, int i11) {
        C0841m c0841m2;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17 = i7;
        int i18 = i8;
        C0841m c0841m3 = c0841m;
        d dVar2 = dVar;
        c1144z.T(i17 + 16);
        c1144z.U(16);
        int M5 = c1144z.M();
        int M6 = c1144z.M();
        c1144z.U(50);
        int f6 = c1144z.f();
        int i19 = i6;
        if (i19 == 1701733238) {
            Pair u6 = u(c1144z, i17, i18);
            if (u6 != null) {
                i19 = ((Integer) u6.first).intValue();
                c0841m3 = c0841m3 == null ? null : c0841m3.d(((t) u6.second).f6491b);
                dVar2.f6346a[i11] = (t) u6.second;
            }
            c1144z.T(f6);
        }
        String str2 = "video/3gpp";
        String str3 = i19 == 1831958048 ? "video/mpeg" : i19 == 1211250227 ? "video/3gpp" : null;
        float f7 = 1.0f;
        int i20 = 8;
        int i21 = 8;
        z6.w wVar = null;
        String str4 = null;
        byte[] bArr = null;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        ByteBuffer byteBuffer = null;
        C0110b c0110b = null;
        boolean z6 = false;
        while (f6 - i17 < i18) {
            c1144z.T(f6);
            int f8 = c1144z.f();
            int p6 = c1144z.p();
            if (p6 == 0 && c1144z.f() - i17 == i18) {
                break;
            }
            AbstractC0316s.a(p6 > 0, "childAtomSize must be positive");
            int p7 = c1144z.p();
            if (p7 == 1635148611) {
                AbstractC0316s.a(str3 == null, null);
                c1144z.T(f8 + 8);
                C0302d b6 = C0302d.b(c1144z);
                z6.w wVar2 = b6.f983a;
                dVar2.f6348c = b6.f984b;
                if (!z6) {
                    f7 = b6.f993k;
                }
                String str5 = b6.f994l;
                int i27 = b6.f992j;
                int i28 = b6.f989g;
                int i29 = b6.f990h;
                int i30 = b6.f991i;
                int i31 = b6.f987e;
                c0841m2 = c0841m3;
                i12 = f6;
                i13 = i19;
                str = str2;
                i23 = i27;
                i24 = i28;
                i25 = i29;
                i26 = i30;
                i21 = b6.f988f;
                i20 = i31;
                wVar = wVar2;
                str3 = "video/avc";
                str4 = str5;
            } else if (p7 == 1752589123) {
                AbstractC0316s.a(str3 == null, null);
                c1144z.T(f8 + 8);
                C a6 = C.a(c1144z);
                z6.w wVar3 = a6.f879a;
                dVar2.f6348c = a6.f880b;
                if (!z6) {
                    f7 = a6.f888j;
                }
                int i32 = a6.f889k;
                String str6 = a6.f890l;
                c0841m2 = c0841m3;
                i12 = f6;
                i23 = i32;
                i13 = i19;
                str = str2;
                i24 = a6.f885g;
                i25 = a6.f886h;
                i26 = a6.f887i;
                str3 = "video/hevc";
                i20 = a6.f883e;
                str4 = str6;
                wVar = wVar3;
                i21 = a6.f884f;
            } else {
                if (p7 == 1685480259 || p7 == 1685485123) {
                    c0841m2 = c0841m3;
                    i12 = f6;
                    i13 = i19;
                    str = str2;
                    i14 = i20;
                    i15 = i24;
                    i16 = i26;
                    C0312n a7 = C0312n.a(c1144z);
                    if (a7 != null) {
                        str3 = "video/dolby-vision";
                        str4 = a7.f1063c;
                    }
                } else if (p7 == 1987076931) {
                    AbstractC0316s.a(str3 == null, null);
                    String str7 = i19 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    c1144z.T(f8 + 12);
                    c1144z.U(2);
                    int G6 = c1144z.G();
                    int i33 = G6 >> 4;
                    boolean z7 = (G6 & 1) != 0;
                    int G7 = c1144z.G();
                    int G8 = c1144z.G();
                    i24 = C0836h.j(G7);
                    i25 = z7 ? 1 : 2;
                    i26 = C0836h.k(G8);
                    c0841m2 = c0841m3;
                    i12 = f6;
                    i20 = i33;
                    i21 = i20;
                    i13 = i19;
                    str = str2;
                    str3 = str7;
                } else if (p7 == 1635135811) {
                    int i34 = p6 - 8;
                    byte[] bArr2 = new byte[i34];
                    c1144z.l(bArr2, 0, i34);
                    wVar = z6.w.y(bArr2);
                    c1144z.T(f8 + 8);
                    C0836h h6 = h(c1144z);
                    int i35 = h6.f6896e;
                    int i36 = h6.f6897f;
                    int i37 = h6.f6892a;
                    int i38 = h6.f6893b;
                    i26 = h6.f6894c;
                    c0841m2 = c0841m3;
                    i12 = f6;
                    i13 = i19;
                    str = str2;
                    i24 = i37;
                    i25 = i38;
                    str3 = "video/av01";
                    i20 = i35;
                    i21 = i36;
                } else if (p7 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(c1144z.C());
                    byteBuffer2.putShort(c1144z.C());
                    byteBuffer = byteBuffer2;
                    c0841m2 = c0841m3;
                    i12 = f6;
                    i13 = i19;
                    str = str2;
                } else if (p7 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short C6 = c1144z.C();
                    short C7 = c1144z.C();
                    short C8 = c1144z.C();
                    i12 = f6;
                    short C9 = c1144z.C();
                    i13 = i19;
                    short C10 = c1144z.C();
                    str = str2;
                    short C11 = c1144z.C();
                    short C12 = c1144z.C();
                    int i39 = i20;
                    short C13 = c1144z.C();
                    long I6 = c1144z.I();
                    long I7 = c1144z.I();
                    c0841m2 = c0841m3;
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(C10);
                    byteBuffer3.putShort(C11);
                    byteBuffer3.putShort(C6);
                    byteBuffer3.putShort(C7);
                    byteBuffer3.putShort(C8);
                    byteBuffer3.putShort(C9);
                    byteBuffer3.putShort(C12);
                    byteBuffer3.putShort(C13);
                    byteBuffer3.putShort((short) (I6 / 10000));
                    byteBuffer3.putShort((short) (I7 / 10000));
                    byteBuffer = byteBuffer3;
                    i20 = i39;
                } else {
                    c0841m2 = c0841m3;
                    i12 = f6;
                    i13 = i19;
                    str = str2;
                    i14 = i20;
                    if (p7 == 1681012275) {
                        AbstractC0316s.a(str3 == null, null);
                        str3 = str;
                    } else if (p7 == 1702061171) {
                        AbstractC0316s.a(str3 == null, null);
                        c0110b = k(c1144z, f8);
                        String str8 = c0110b.f6342a;
                        byte[] bArr3 = c0110b.f6343b;
                        if (bArr3 != null) {
                            wVar = z6.w.y(bArr3);
                        }
                        str3 = str8;
                    } else if (p7 == 1885434736) {
                        f7 = s(c1144z, f8);
                        i20 = i14;
                        z6 = true;
                    } else if (p7 == 1937126244) {
                        bArr = t(c1144z, f8, p6);
                    } else if (p7 == 1936995172) {
                        int G9 = c1144z.G();
                        c1144z.U(3);
                        if (G9 == 0) {
                            int G10 = c1144z.G();
                            if (G10 == 0) {
                                i22 = 0;
                            } else if (G10 == 1) {
                                i22 = 1;
                            } else if (G10 == 2) {
                                i22 = 2;
                            } else if (G10 == 3) {
                                i22 = 3;
                            }
                        }
                    } else {
                        i15 = i24;
                        if (p7 == 1668246642) {
                            i16 = i26;
                            if (i15 == -1 && i16 == -1) {
                                int p8 = c1144z.p();
                                if (p8 == 1852009592 || p8 == 1852009571) {
                                    int M7 = c1144z.M();
                                    int M8 = c1144z.M();
                                    c1144z.U(2);
                                    boolean z8 = p6 == 19 && (c1144z.G() & 128) != 0;
                                    i24 = C0836h.j(M7);
                                    i25 = z8 ? 1 : 2;
                                    i26 = C0836h.k(M8);
                                    i20 = i14;
                                } else {
                                    AbstractC1133o.h("AtomParsers", "Unsupported color type: " + Y1.a.a(p8));
                                }
                            }
                        } else {
                            i16 = i26;
                        }
                    }
                    i20 = i14;
                }
                i26 = i16;
                i24 = i15;
                i20 = i14;
            }
            f6 = i12 + p6;
            i17 = i7;
            i18 = i8;
            dVar2 = dVar;
            i19 = i13;
            str2 = str;
            c0841m3 = c0841m2;
        }
        C0841m c0841m4 = c0841m3;
        int i40 = i20;
        int i41 = i24;
        int i42 = i26;
        if (str3 == null) {
            return;
        }
        q.b P5 = new q.b().Z(i9).o0(str3).O(str4).v0(M5).Y(M6).k0(f7).n0(i10).l0(bArr).r0(i22).b0(wVar).g0(i23).U(c0841m4).P(new C0836h.b().d(i41).c(i25).e(i42).f(byteBuffer != null ? byteBuffer.array() : null).g(i40).b(i21).a());
        if (c0110b != null) {
            P5.M(C6.g.l(c0110b.f6344c)).j0(C6.g.l(c0110b.f6345d));
        }
        dVar.f6347b = P5.K();
    }

    public static x F(C1144z c1144z) {
        short C6 = c1144z.C();
        c1144z.U(2);
        String D6 = c1144z.D(C6);
        int max = Math.max(D6.lastIndexOf(43), D6.lastIndexOf(45));
        try {
            return new x(new C1180b(Float.parseFloat(D6.substring(0, max)), Float.parseFloat(D6.substring(max, D6.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j6, long j7, long j8) {
        int length = jArr.length - 1;
        return jArr[0] <= j7 && j7 < jArr[AbstractC1117K.p(4, 0, length)] && jArr[AbstractC1117K.p(jArr.length - 4, 0, length)] < j8 && j8 <= j6;
    }

    public static boolean c(int i6) {
        return i6 != 1;
    }

    public static int d(C1144z c1144z, int i6, int i7, int i8) {
        int f6 = c1144z.f();
        AbstractC0316s.a(f6 >= i7, null);
        while (f6 - i7 < i8) {
            c1144z.T(f6);
            int p6 = c1144z.p();
            AbstractC0316s.a(p6 > 0, "childAtomSize must be positive");
            if (c1144z.p() == i6) {
                return f6;
            }
            f6 += p6;
        }
        return -1;
    }

    public static int e(int i6) {
        if (i6 == 1936684398) {
            return 1;
        }
        if (i6 == 1986618469) {
            return 2;
        }
        if (i6 == 1952807028 || i6 == 1935832172 || i6 == 1937072756 || i6 == 1668047728) {
            return 3;
        }
        return i6 == 1835365473 ? 5 : -1;
    }

    public static void f(C1144z c1144z) {
        int f6 = c1144z.f();
        c1144z.U(4);
        if (c1144z.p() != 1751411826) {
            f6 += 4;
        }
        c1144z.T(f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0153, code lost:
    
        if (r10 == (-1)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(c1.C1144z r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, Z0.C0841m r30, Y1.b.d r31, int r32) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.b.g(c1.z, int, int, int, int, java.lang.String, boolean, Z0.m, Y1.b$d, int):void");
    }

    public static C0836h h(C1144z c1144z) {
        C0836h.b bVar = new C0836h.b();
        C1143y c1143y = new C1143y(c1144z.e());
        c1143y.p(c1144z.f() * 8);
        c1143y.s(1);
        int h6 = c1143y.h(3);
        c1143y.r(6);
        boolean g6 = c1143y.g();
        boolean g7 = c1143y.g();
        if (h6 == 2 && g6) {
            bVar.g(g7 ? 12 : 10);
            bVar.b(g7 ? 12 : 10);
        } else if (h6 <= 2) {
            bVar.g(g6 ? 10 : 8);
            bVar.b(g6 ? 10 : 8);
        }
        c1143y.r(13);
        c1143y.q();
        int h7 = c1143y.h(4);
        if (h7 != 1) {
            AbstractC1133o.f("AtomParsers", "Unsupported obu_type: " + h7);
            return bVar.a();
        }
        if (c1143y.g()) {
            AbstractC1133o.f("AtomParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean g8 = c1143y.g();
        c1143y.q();
        if (g8 && c1143y.h(8) > 127) {
            AbstractC1133o.f("AtomParsers", "Excessive obu_size");
            return bVar.a();
        }
        int h8 = c1143y.h(3);
        c1143y.q();
        if (c1143y.g()) {
            AbstractC1133o.f("AtomParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (c1143y.g()) {
            AbstractC1133o.f("AtomParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (c1143y.g()) {
            AbstractC1133o.f("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int h9 = c1143y.h(5);
        boolean z6 = false;
        for (int i6 = 0; i6 <= h9; i6++) {
            c1143y.r(12);
            if (c1143y.h(5) > 7) {
                c1143y.q();
            }
        }
        int h10 = c1143y.h(4);
        int h11 = c1143y.h(4);
        c1143y.r(h10 + 1);
        c1143y.r(h11 + 1);
        if (c1143y.g()) {
            c1143y.r(7);
        }
        c1143y.r(7);
        boolean g9 = c1143y.g();
        if (g9) {
            c1143y.r(2);
        }
        if ((c1143y.g() ? 2 : c1143y.h(1)) > 0 && !c1143y.g()) {
            c1143y.r(1);
        }
        if (g9) {
            c1143y.r(3);
        }
        c1143y.r(3);
        boolean g10 = c1143y.g();
        if (h8 == 2 && g10) {
            c1143y.q();
        }
        if (h8 != 1 && c1143y.g()) {
            z6 = true;
        }
        if (c1143y.g()) {
            int h12 = c1143y.h(8);
            int h13 = c1143y.h(8);
            bVar.d(C0836h.j(h12)).c(((z6 || h12 != 1 || h13 != 13 || c1143y.h(8) != 0) ? c1143y.h(1) : 1) != 1 ? 2 : 1).e(C0836h.k(h13));
        }
        return bVar.a();
    }

    public static Pair i(C1144z c1144z, int i6, int i7) {
        int i8 = i6 + 8;
        int i9 = -1;
        int i10 = 0;
        String str = null;
        Integer num = null;
        while (i8 - i6 < i7) {
            c1144z.T(i8);
            int p6 = c1144z.p();
            int p7 = c1144z.p();
            if (p7 == 1718775137) {
                num = Integer.valueOf(c1144z.p());
            } else if (p7 == 1935894637) {
                c1144z.U(4);
                str = c1144z.D(4);
            } else if (p7 == 1935894633) {
                i9 = i8;
                i10 = p6;
            }
            i8 += p6;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        AbstractC0316s.a(num != null, "frma atom is mandatory");
        AbstractC0316s.a(i9 != -1, "schi atom is mandatory");
        t v6 = v(c1144z, i9, i10, str);
        AbstractC0316s.a(v6 != null, "tenc atom is mandatory");
        return Pair.create(num, (t) AbstractC1117K.i(v6));
    }

    public static Pair j(a.C0109a c0109a) {
        a.b g6 = c0109a.g(1701606260);
        if (g6 == null) {
            return null;
        }
        C1144z c1144z = g6.f6331b;
        c1144z.T(8);
        int c6 = Y1.a.c(c1144z.p());
        int K5 = c1144z.K();
        long[] jArr = new long[K5];
        long[] jArr2 = new long[K5];
        for (int i6 = 0; i6 < K5; i6++) {
            jArr[i6] = c6 == 1 ? c1144z.L() : c1144z.I();
            jArr2[i6] = c6 == 1 ? c1144z.z() : c1144z.p();
            if (c1144z.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c1144z.U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static C0110b k(C1144z c1144z, int i6) {
        c1144z.T(i6 + 12);
        c1144z.U(1);
        l(c1144z);
        c1144z.U(2);
        int G6 = c1144z.G();
        if ((G6 & 128) != 0) {
            c1144z.U(2);
        }
        if ((G6 & 64) != 0) {
            c1144z.U(c1144z.G());
        }
        if ((G6 & 32) != 0) {
            c1144z.U(2);
        }
        c1144z.U(1);
        l(c1144z);
        String h6 = y.h(c1144z.G());
        if ("audio/mpeg".equals(h6) || "audio/vnd.dts".equals(h6) || "audio/vnd.dts.hd".equals(h6)) {
            return new C0110b(h6, null, -1L, -1L);
        }
        c1144z.U(4);
        long I6 = c1144z.I();
        long I7 = c1144z.I();
        c1144z.U(1);
        int l6 = l(c1144z);
        long j6 = I7;
        byte[] bArr = new byte[l6];
        c1144z.l(bArr, 0, l6);
        if (j6 <= 0) {
            j6 = -1;
        }
        return new C0110b(h6, bArr, j6, I6 > 0 ? I6 : -1L);
    }

    public static int l(C1144z c1144z) {
        int G6 = c1144z.G();
        int i6 = G6 & 127;
        while ((G6 & 128) == 128) {
            G6 = c1144z.G();
            i6 = (i6 << 7) | (G6 & 127);
        }
        return i6;
    }

    public static int m(C1144z c1144z) {
        c1144z.T(16);
        return c1144z.p();
    }

    public static x n(C1144z c1144z, int i6) {
        c1144z.U(8);
        ArrayList arrayList = new ArrayList();
        while (c1144z.f() < i6) {
            x.b c6 = j.c(c1144z);
            if (c6 != null) {
                arrayList.add(c6);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x(arrayList);
    }

    public static Pair o(C1144z c1144z) {
        c1144z.T(8);
        int c6 = Y1.a.c(c1144z.p());
        c1144z.U(c6 == 0 ? 8 : 16);
        long I6 = c1144z.I();
        c1144z.U(c6 == 0 ? 4 : 8);
        int M5 = c1144z.M();
        return Pair.create(Long.valueOf(I6), "" + ((char) (((M5 >> 10) & 31) + 96)) + ((char) (((M5 >> 5) & 31) + 96)) + ((char) ((M5 & 31) + 96)));
    }

    public static x p(a.C0109a c0109a) {
        a.b g6 = c0109a.g(1751411826);
        a.b g7 = c0109a.g(1801812339);
        a.b g8 = c0109a.g(1768715124);
        if (g6 == null || g7 == null || g8 == null || m(g6.f6331b) != 1835299937) {
            return null;
        }
        C1144z c1144z = g7.f6331b;
        c1144z.T(12);
        int p6 = c1144z.p();
        String[] strArr = new String[p6];
        for (int i6 = 0; i6 < p6; i6++) {
            int p7 = c1144z.p();
            c1144z.U(4);
            strArr[i6] = c1144z.D(p7 - 8);
        }
        C1144z c1144z2 = g8.f6331b;
        c1144z2.T(8);
        ArrayList arrayList = new ArrayList();
        while (c1144z2.a() > 8) {
            int f6 = c1144z2.f();
            int p8 = c1144z2.p();
            int p9 = c1144z2.p() - 1;
            if (p9 < 0 || p9 >= p6) {
                AbstractC1133o.h("AtomParsers", "Skipped metadata with unknown key index: " + p9);
            } else {
                C1179a h6 = j.h(c1144z2, f6 + p8, strArr[p9]);
                if (h6 != null) {
                    arrayList.add(h6);
                }
            }
            c1144z2.T(f6 + p8);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x(arrayList);
    }

    public static void q(C1144z c1144z, int i6, int i7, int i8, d dVar) {
        c1144z.T(i7 + 16);
        if (i6 == 1835365492) {
            c1144z.A();
            String A6 = c1144z.A();
            if (A6 != null) {
                dVar.f6347b = new q.b().Z(i8).o0(A6).K();
            }
        }
    }

    public static d1.c r(C1144z c1144z) {
        long z6;
        long z7;
        c1144z.T(8);
        if (Y1.a.c(c1144z.p()) == 0) {
            z6 = c1144z.I();
            z7 = c1144z.I();
        } else {
            z6 = c1144z.z();
            z7 = c1144z.z();
        }
        return new d1.c(z6, z7, c1144z.I());
    }

    public static float s(C1144z c1144z, int i6) {
        c1144z.T(i6 + 8);
        return c1144z.K() / c1144z.K();
    }

    public static byte[] t(C1144z c1144z, int i6, int i7) {
        int i8 = i6 + 8;
        while (i8 - i6 < i7) {
            c1144z.T(i8);
            int p6 = c1144z.p();
            if (c1144z.p() == 1886547818) {
                return Arrays.copyOfRange(c1144z.e(), i8, p6 + i8);
            }
            i8 += p6;
        }
        return null;
    }

    public static Pair u(C1144z c1144z, int i6, int i7) {
        Pair i8;
        int f6 = c1144z.f();
        while (f6 - i6 < i7) {
            c1144z.T(f6);
            int p6 = c1144z.p();
            AbstractC0316s.a(p6 > 0, "childAtomSize must be positive");
            if (c1144z.p() == 1936289382 && (i8 = i(c1144z, f6, p6)) != null) {
                return i8;
            }
            f6 += p6;
        }
        return null;
    }

    public static t v(C1144z c1144z, int i6, int i7, String str) {
        int i8;
        int i9;
        int i10 = i6 + 8;
        while (true) {
            byte[] bArr = null;
            if (i10 - i6 >= i7) {
                return null;
            }
            c1144z.T(i10);
            int p6 = c1144z.p();
            if (c1144z.p() == 1952804451) {
                int c6 = Y1.a.c(c1144z.p());
                c1144z.U(1);
                if (c6 == 0) {
                    c1144z.U(1);
                    i9 = 0;
                    i8 = 0;
                } else {
                    int G6 = c1144z.G();
                    i8 = G6 & 15;
                    i9 = (G6 & 240) >> 4;
                }
                boolean z6 = c1144z.G() == 1;
                int G7 = c1144z.G();
                byte[] bArr2 = new byte[16];
                c1144z.l(bArr2, 0, 16);
                if (z6 && G7 == 0) {
                    int G8 = c1144z.G();
                    bArr = new byte[G8];
                    c1144z.l(bArr, 0, G8);
                }
                return new t(z6, str, G7, bArr2, i9, i8, bArr);
            }
            i10 += p6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v23, types: [boolean] */
    public static v w(s sVar, a.C0109a c0109a, B b6) {
        c fVar;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int i9;
        long j6;
        long[] jArr;
        int i10;
        int i11;
        long j7;
        int i12;
        int[] iArr;
        long[] jArr2;
        int i13;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        long j8;
        int[] iArr5;
        int i14;
        ?? r11;
        int i15;
        int i16;
        a.b g6 = c0109a.g(1937011578);
        if (g6 != null) {
            fVar = new e(g6, sVar.f6484f);
        } else {
            a.b g7 = c0109a.g(1937013298);
            if (g7 == null) {
                throw z.a("Track has no sample table size information", null);
            }
            fVar = new f(g7);
        }
        int b7 = fVar.b();
        if (b7 == 0) {
            return new v(sVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        a.b g8 = c0109a.g(1937007471);
        if (g8 == null) {
            g8 = (a.b) AbstractC1119a.e(c0109a.g(1668232756));
            z6 = true;
        } else {
            z6 = false;
        }
        C1144z c1144z = g8.f6331b;
        C1144z c1144z2 = ((a.b) AbstractC1119a.e(c0109a.g(1937011555))).f6331b;
        C1144z c1144z3 = ((a.b) AbstractC1119a.e(c0109a.g(1937011827))).f6331b;
        a.b g9 = c0109a.g(1937011571);
        C1144z c1144z4 = g9 != null ? g9.f6331b : null;
        a.b g10 = c0109a.g(1668576371);
        C1144z c1144z5 = g10 != null ? g10.f6331b : null;
        a aVar = new a(c1144z2, c1144z, z6);
        c1144z3.T(12);
        int K5 = c1144z3.K() - 1;
        int K6 = c1144z3.K();
        int K7 = c1144z3.K();
        if (c1144z5 != null) {
            c1144z5.T(12);
            i6 = c1144z5.K();
        } else {
            i6 = 0;
        }
        if (c1144z4 != null) {
            c1144z4.T(12);
            i8 = c1144z4.K();
            if (i8 > 0) {
                i7 = c1144z4.K() - 1;
                i9 = 0;
            } else {
                i7 = -1;
                i9 = 0;
                c1144z4 = null;
            }
        } else {
            i7 = -1;
            i8 = 0;
            i9 = 0;
        }
        int a6 = fVar.a();
        String str = sVar.f6484f.f6990n;
        int i17 = (a6 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && K5 == 0 && i6 == 0 && i8 == 0)) ? i9 : 1;
        c cVar = fVar;
        if (i17 != 0) {
            int i18 = aVar.f6333a;
            long[] jArr3 = new long[i18];
            int[] iArr6 = new int[i18];
            while (aVar.a()) {
                int i19 = aVar.f6334b;
                jArr3[i19] = aVar.f6336d;
                iArr6[i19] = aVar.f6335c;
            }
            e.b a7 = Y1.e.a(a6, jArr3, iArr6, K7);
            long[] jArr4 = a7.f6368a;
            iArr = a7.f6369b;
            int i20 = a7.f6370c;
            long[] jArr5 = a7.f6371d;
            int[] iArr7 = a7.f6372e;
            j7 = a7.f6373f;
            jArr2 = jArr4;
            i13 = i20;
            jArr = jArr5;
            iArr2 = iArr7;
            j6 = 0;
        } else {
            long[] jArr6 = new long[b7];
            j6 = 0;
            int[] iArr8 = new int[b7];
            jArr = new long[b7];
            C1144z c1144z6 = c1144z5;
            int[] iArr9 = new int[b7];
            C1144z c1144z7 = c1144z4;
            int i21 = i7;
            int i22 = i9;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            long j9 = 0;
            long j10 = 0;
            int i26 = i6;
            int i27 = K7;
            int i28 = K6;
            int i29 = K5;
            int i30 = i25;
            while (true) {
                if (i22 >= b7) {
                    i10 = i28;
                    i11 = i24;
                    break;
                }
                long j11 = j10;
                int i31 = i24;
                boolean z7 = true;
                while (i31 == 0) {
                    z7 = aVar.a();
                    if (!z7) {
                        break;
                    }
                    int i32 = i28;
                    long j12 = aVar.f6336d;
                    i31 = aVar.f6335c;
                    j11 = j12;
                    i28 = i32;
                    i27 = i27;
                    b7 = b7;
                }
                int i33 = b7;
                i10 = i28;
                int i34 = i27;
                if (!z7) {
                    AbstractC1133o.h("AtomParsers", "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr6, i22);
                    iArr8 = Arrays.copyOf(iArr8, i22);
                    jArr = Arrays.copyOf(jArr, i22);
                    iArr9 = Arrays.copyOf(iArr9, i22);
                    jArr6 = copyOf;
                    b7 = i22;
                    i11 = i31;
                    break;
                }
                if (c1144z6 != null) {
                    int i35 = i25;
                    while (i35 == 0 && i26 > 0) {
                        i35 = c1144z6.K();
                        i23 = c1144z6.p();
                        i26--;
                    }
                    i25 = i35 - 1;
                }
                jArr6[i22] = j11;
                int c6 = cVar.c();
                iArr8[i22] = c6;
                if (c6 > i30) {
                    i30 = c6;
                }
                jArr[i22] = j9 + i23;
                iArr9[i22] = c1144z7 == null ? 1 : i9;
                if (i22 == i21) {
                    iArr9[i22] = 1;
                    i8--;
                    if (i8 > 0) {
                        i21 = ((C1144z) AbstractC1119a.e(c1144z7)).K() - 1;
                    }
                }
                j9 += i34;
                int i36 = i10 - 1;
                if (i36 != 0 || i29 <= 0) {
                    i27 = i34;
                } else {
                    i36 = c1144z3.K();
                    i29--;
                    i27 = c1144z3.p();
                }
                i28 = i36;
                long j13 = j11 + iArr8[i22];
                i24 = i31 - 1;
                i22++;
                j10 = j13;
                b7 = i33;
            }
            j7 = j9 + i23;
            if (c1144z6 != null) {
                while (i26 > 0) {
                    if (c1144z6.K() != 0) {
                        i12 = i9;
                        break;
                    }
                    c1144z6.p();
                    i26--;
                }
            }
            i12 = 1;
            if (i8 != 0 || i10 != 0 || i11 != 0 || i29 != 0 || i25 != 0 || i12 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                sb.append(sVar.f6479a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i8);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i10);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i11);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i29);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i25);
                sb.append(i12 == 0 ? ", ctts invalid" : "");
                AbstractC1133o.h("AtomParsers", sb.toString());
            }
            iArr = iArr8;
            jArr2 = jArr6;
            i13 = i30;
            iArr2 = iArr9;
        }
        long j14 = j7;
        long W02 = AbstractC1117K.W0(j14, 1000000L, sVar.f6481c);
        long[] jArr7 = sVar.f6486h;
        if (jArr7 == null) {
            AbstractC1117K.Y0(jArr, 1000000L, sVar.f6481c);
            return new v(sVar, jArr2, iArr, i13, jArr, iArr2, W02);
        }
        int[] iArr10 = iArr;
        int i37 = b7;
        int[] iArr11 = iArr10;
        if (jArr7.length == 1 && sVar.f6480b == 1 && jArr.length >= 2) {
            long j15 = ((long[]) AbstractC1119a.e(sVar.f6487i))[i9];
            long W03 = j15 + AbstractC1117K.W0(sVar.f6486h[i9], sVar.f6481c, sVar.f6482d);
            long[] jArr8 = jArr2;
            long[] jArr9 = jArr;
            boolean b8 = b(jArr9, j14, j15, W03);
            jArr = jArr9;
            j14 = j14;
            if (b8) {
                long W04 = AbstractC1117K.W0(j15 - jArr[i9], sVar.f6484f.f6967C, sVar.f6481c);
                long W05 = AbstractC1117K.W0(j14 - W03, sVar.f6484f.f6967C, sVar.f6481c);
                if ((W04 != j6 || W05 != j6) && W04 <= 2147483647L && W05 <= 2147483647L) {
                    b6.f877a = (int) W04;
                    b6.f878b = (int) W05;
                    AbstractC1117K.Y0(jArr, 1000000L, sVar.f6481c);
                    return new v(sVar, jArr8, iArr11, i13, jArr, iArr2, AbstractC1117K.W0(sVar.f6486h[i9], 1000000L, sVar.f6482d));
                }
            }
            jArr2 = jArr8;
            iArr11 = iArr11;
        }
        long[] jArr10 = sVar.f6486h;
        if (jArr10.length == 1 && jArr10[i9] == j6) {
            long j16 = ((long[]) AbstractC1119a.e(sVar.f6487i))[i9];
            for (int i38 = i9; i38 < jArr.length; i38++) {
                jArr[i38] = AbstractC1117K.W0(jArr[i38] - j16, 1000000L, sVar.f6481c);
            }
            return new v(sVar, jArr2, iArr11, i13, jArr, iArr2, AbstractC1117K.W0(j14 - j16, 1000000L, sVar.f6481c));
        }
        ?? r10 = sVar.f6480b == 1 ? 1 : i9;
        int[] iArr12 = new int[jArr10.length];
        int[] iArr13 = new int[jArr10.length];
        long[] jArr11 = (long[]) AbstractC1119a.e(sVar.f6487i);
        int i39 = i9;
        int i40 = i39;
        int i41 = i40;
        int i42 = i41;
        while (true) {
            long[] jArr12 = sVar.f6486h;
            iArr3 = iArr13;
            if (i39 >= jArr12.length) {
                break;
            }
            int[] iArr14 = iArr12;
            long[] jArr13 = jArr11;
            long j17 = jArr13[i39];
            if (j17 != -1) {
                long j18 = jArr12[i39];
                i14 = i39;
                int i43 = i40;
                long W06 = AbstractC1117K.W0(j18, sVar.f6481c, sVar.f6482d);
                iArr5 = iArr14;
                iArr5[i14] = AbstractC1117K.h(jArr, j17, true, true);
                long j19 = j17 + W06;
                r11 = i9;
                iArr3[i14] = AbstractC1117K.d(jArr, j19, r10, r11);
                while (true) {
                    i15 = iArr5[i14];
                    i16 = iArr3[i14];
                    if (i15 >= i16 || (iArr2[i15] & 1) != 0) {
                        break;
                    }
                    iArr5[i14] = i15 + 1;
                }
                i41 += i16 - i15;
                i40 = i43 | (i42 != i15 ? 1 : r11 == true ? 1 : 0);
                i42 = i16;
            } else {
                iArr5 = iArr14;
                i14 = i39;
                r11 = i9;
            }
            jArr11 = jArr13;
            i9 = r11;
            iArr13 = iArr3;
            i39 = i14 + 1;
            iArr12 = iArr5;
        }
        int[] iArr15 = iArr12;
        int i44 = i9;
        int i45 = i40 | (i41 != i37 ? 1 : i44);
        long[] jArr14 = i45 != 0 ? new long[i41] : jArr2;
        int[] iArr16 = i45 != 0 ? new int[i41] : iArr11;
        if (i45 != 0) {
            i13 = i44;
        }
        int[] iArr17 = i45 != 0 ? new int[i41] : iArr2;
        long[] jArr15 = new long[i41];
        int i46 = i44;
        long j20 = j6;
        while (i44 < sVar.f6486h.length) {
            long j21 = sVar.f6487i[i44];
            int i47 = iArr15[i44];
            int i48 = i45;
            int i49 = iArr3[i44];
            int i50 = i13;
            if (i48 != 0) {
                int i51 = i49 - i47;
                System.arraycopy(jArr2, i47, jArr14, i46, i51);
                System.arraycopy(iArr11, i47, iArr16, i46, i51);
                System.arraycopy(iArr2, i47, iArr17, i46, i51);
            }
            i13 = i50;
            while (i47 < i49) {
                long[] jArr16 = jArr2;
                int[] iArr18 = iArr11;
                long W07 = AbstractC1117K.W0(j20, 1000000L, sVar.f6482d);
                long W08 = AbstractC1117K.W0(jArr[i47] - j21, 1000000L, sVar.f6481c);
                int i52 = i49;
                long[] jArr17 = jArr;
                if (c(sVar.f6480b)) {
                    iArr4 = iArr2;
                    j8 = j6;
                    W08 = Math.max(j8, W08);
                } else {
                    iArr4 = iArr2;
                    j8 = j6;
                }
                jArr15[i46] = W07 + W08;
                if (i48 != 0 && iArr16[i46] > i13) {
                    i13 = iArr18[i47];
                }
                i46++;
                i47++;
                j6 = j8;
                jArr2 = jArr16;
                iArr11 = iArr18;
                jArr = jArr17;
                iArr2 = iArr4;
                i49 = i52;
            }
            j20 += sVar.f6486h[i44];
            i44++;
            jArr2 = jArr2;
            jArr = jArr;
            iArr2 = iArr2;
            i45 = i48;
        }
        return new v(sVar, jArr14, iArr16, i13, jArr15, iArr17, AbstractC1117K.W0(j20, 1000000L, sVar.f6482d));
    }

    public static d x(C1144z c1144z, int i6, int i7, String str, C0841m c0841m, boolean z6) {
        c1144z.T(12);
        int p6 = c1144z.p();
        d dVar = new d(p6);
        int i8 = 0;
        while (i8 < p6) {
            int f6 = c1144z.f();
            int p7 = c1144z.p();
            AbstractC0316s.a(p7 > 0, "childAtomSize must be positive");
            int p8 = c1144z.p();
            if (p8 == 1635148593 || p8 == 1635148595 || p8 == 1701733238 || p8 == 1831958048 || p8 == 1836070006 || p8 == 1752589105 || p8 == 1751479857 || p8 == 1932670515 || p8 == 1211250227 || p8 == 1987063864 || p8 == 1987063865 || p8 == 1635135537 || p8 == 1685479798 || p8 == 1685479729 || p8 == 1685481573 || p8 == 1685481521) {
                d dVar2 = dVar;
                int i9 = i8;
                E(c1144z, p8, f6, p7, i6, i7, c0841m, dVar2, i9);
                dVar = dVar2;
                i8 = i9;
            } else if (p8 == 1836069985 || p8 == 1701733217 || p8 == 1633889587 || p8 == 1700998451 || p8 == 1633889588 || p8 == 1835823201 || p8 == 1685353315 || p8 == 1685353317 || p8 == 1685353320 || p8 == 1685353324 || p8 == 1685353336 || p8 == 1935764850 || p8 == 1935767394 || p8 == 1819304813 || p8 == 1936684916 || p8 == 1953984371 || p8 == 778924082 || p8 == 778924083 || p8 == 1835557169 || p8 == 1835560241 || p8 == 1634492771 || p8 == 1634492791 || p8 == 1970037111 || p8 == 1332770163 || p8 == 1716281667) {
                d dVar3 = dVar;
                g(c1144z, p8, f6, p7, i6, str, z6, c0841m, dVar3, i8);
                dVar = dVar3;
            } else if (p8 == 1414810956 || p8 == 1954034535 || p8 == 2004251764 || p8 == 1937010800 || p8 == 1664495672) {
                y(c1144z, p8, f6, p7, i6, str, dVar);
            } else if (p8 == 1835365492) {
                q(c1144z, p8, f6, i6, dVar);
            } else if (p8 == 1667329389) {
                dVar.f6347b = new q.b().Z(i6).o0("application/x-camera-motion").K();
            }
            c1144z.T(f6 + p7);
            i8++;
        }
        return dVar;
    }

    public static void y(C1144z c1144z, int i6, int i7, int i8, int i9, String str, d dVar) {
        c1144z.T(i7 + 16);
        String str2 = "application/ttml+xml";
        z6.w wVar = null;
        long j6 = LongCompanionObject.MAX_VALUE;
        if (i6 != 1414810956) {
            if (i6 == 1954034535) {
                int i10 = i8 - 16;
                byte[] bArr = new byte[i10];
                c1144z.l(bArr, 0, i10);
                wVar = z6.w.y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i6 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i6 == 1937010800) {
                j6 = 0;
            } else {
                if (i6 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f6349d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f6347b = new q.b().Z(i9).o0(str2).e0(str).s0(j6).b0(wVar).K();
    }

    public static g z(C1144z c1144z) {
        long j6;
        c1144z.T(8);
        int c6 = Y1.a.c(c1144z.p());
        c1144z.U(c6 == 0 ? 8 : 16);
        int p6 = c1144z.p();
        c1144z.U(4);
        int f6 = c1144z.f();
        int i6 = c6 == 0 ? 4 : 8;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            j6 = -9223372036854775807L;
            if (i8 >= i6) {
                c1144z.U(i6);
                break;
            }
            if (c1144z.e()[f6 + i8] != -1) {
                long I6 = c6 == 0 ? c1144z.I() : c1144z.L();
                if (I6 != 0) {
                    j6 = I6;
                }
            } else {
                i8++;
            }
        }
        c1144z.U(16);
        int p7 = c1144z.p();
        int p8 = c1144z.p();
        c1144z.U(4);
        int p9 = c1144z.p();
        int p10 = c1144z.p();
        if (p7 == 0 && p8 == 65536 && p9 == -65536 && p10 == 0) {
            i7 = 90;
        } else if (p7 == 0 && p8 == -65536 && p9 == 65536 && p10 == 0) {
            i7 = 270;
        } else if (p7 == -65536 && p8 == 0 && p9 == 0 && p10 == -65536) {
            i7 = 180;
        }
        return new g(p6, j6, i7);
    }
}
