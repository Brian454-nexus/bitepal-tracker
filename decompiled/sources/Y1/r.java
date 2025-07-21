package Y1;

import E1.InterfaceC0315q;
import E1.N;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6478a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i6, boolean z6) {
        if ((i6 >>> 8) == 3368816) {
            return true;
        }
        if (i6 == 1751476579 && z6) {
            return true;
        }
        for (int i7 : f6478a) {
            if (i7 == i6) {
                return true;
            }
        }
        return false;
    }

    public static N b(InterfaceC0315q interfaceC0315q) {
        return c(interfaceC0315q, true, false);
    }

    public static N c(InterfaceC0315q interfaceC0315q, boolean z6, boolean z7) {
        N n6;
        int i6;
        long j6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        long a6 = interfaceC0315q.a();
        long j7 = -1;
        long j8 = 4096;
        if (a6 != -1 && a6 <= 4096) {
            j8 = a6;
        }
        int i10 = (int) j8;
        C1144z c1144z = new C1144z(64);
        int i11 = 0;
        int i12 = 0;
        boolean z8 = false;
        while (i12 < i10) {
            c1144z.P(8);
            boolean z9 = true;
            if (!interfaceC0315q.g(c1144z.e(), i11, 8, true)) {
                break;
            }
            long I6 = c1144z.I();
            int p6 = c1144z.p();
            if (I6 == 1) {
                j6 = j7;
                interfaceC0315q.s(c1144z.e(), 8, 8);
                i8 = 16;
                c1144z.S(16);
                I6 = c1144z.z();
                i7 = i12;
            } else {
                j6 = j7;
                if (I6 == 0) {
                    long a7 = interfaceC0315q.a();
                    if (a7 != j6) {
                        i7 = i12;
                        I6 = (a7 - interfaceC0315q.h()) + 8;
                        i8 = 8;
                    }
                }
                i7 = i12;
                i8 = 8;
            }
            long j9 = I6;
            long j10 = i8;
            if (j9 < j10) {
                return new c(p6, j9, i8);
            }
            int i13 = i7 + i8;
            n6 = null;
            if (p6 == 1836019574) {
                i10 += (int) j9;
                if (a6 != -1 && i10 > a6) {
                    i10 = (int) a6;
                }
                i12 = i13;
                j7 = j6;
                i11 = 0;
            } else {
                if (p6 == 1836019558 || p6 == 1836475768) {
                    i6 = 1;
                    break;
                }
                if (p6 == 1835295092) {
                    z8 = true;
                }
                long j11 = a6;
                if ((i13 + j9) - j10 >= i10) {
                    i6 = 0;
                    break;
                }
                int i14 = (int) (j9 - j10);
                i12 = i13 + i14;
                if (p6 != 1718909296) {
                    i9 = 0;
                    if (i14 != 0) {
                        interfaceC0315q.j(i14);
                    }
                } else {
                    if (i14 < 8) {
                        return new c(p6, i14, 8);
                    }
                    c1144z.P(i14);
                    i9 = 0;
                    interfaceC0315q.s(c1144z.e(), 0, i14);
                    int p7 = c1144z.p();
                    if (a(p7, z7)) {
                        z8 = true;
                    }
                    c1144z.U(4);
                    int a8 = c1144z.a() / 4;
                    if (!z8 && a8 > 0) {
                        iArr = new int[a8];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= a8) {
                                z9 = z8;
                                break;
                            }
                            int p8 = c1144z.p();
                            iArr[i15] = p8;
                            if (a(p8, z7)) {
                                break;
                            }
                            i15++;
                        }
                    } else {
                        z9 = z8;
                        iArr = null;
                    }
                    if (!z9) {
                        return new w(p7, iArr);
                    }
                    z8 = z9;
                }
                i11 = i9;
                j7 = j6;
                a6 = j11;
            }
        }
        n6 = null;
        i6 = i11;
        return !z8 ? n.f6465a : z6 != i6 ? i6 != 0 ? i.f6429b : i.f6430c : n6;
    }

    public static N d(InterfaceC0315q interfaceC0315q, boolean z6) {
        return c(interfaceC0315q, false, z6);
    }
}
