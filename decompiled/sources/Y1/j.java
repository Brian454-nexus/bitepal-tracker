package Y1;

import E1.B;
import Z0.q;
import Z0.x;
import c1.AbstractC1133o;
import c1.C1144z;
import d1.C1179a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j {
    public static S1.e a(int i6, C1144z c1144z) {
        int p6 = c1144z.p();
        if (c1144z.p() == 1684108385) {
            c1144z.U(8);
            String B6 = c1144z.B(p6 - 16);
            return new S1.e("und", B6, B6);
        }
        AbstractC1133o.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i6));
        return null;
    }

    public static S1.a b(C1144z c1144z) {
        int p6 = c1144z.p();
        if (c1144z.p() != 1684108385) {
            AbstractC1133o.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int b6 = a.b(c1144z.p());
        String str = b6 == 13 ? "image/jpeg" : b6 == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC1133o.h("MetadataUtil", "Unrecognized cover art flags: " + b6);
            return null;
        }
        c1144z.U(4);
        int i6 = p6 - 16;
        byte[] bArr = new byte[i6];
        c1144z.l(bArr, 0, i6);
        return new S1.a(str, null, 3, bArr);
    }

    public static x.b c(C1144z c1144z) {
        int f6 = c1144z.f() + c1144z.p();
        int p6 = c1144z.p();
        int i6 = (p6 >> 24) & 255;
        try {
            if (i6 == 169 || i6 == 253) {
                int i7 = 16777215 & p6;
                if (i7 == 6516084) {
                    return a(p6, c1144z);
                }
                if (i7 == 7233901 || i7 == 7631467) {
                    return j(p6, "TIT2", c1144z);
                }
                if (i7 == 6516589 || i7 == 7828084) {
                    return j(p6, "TCOM", c1144z);
                }
                if (i7 == 6578553) {
                    return j(p6, "TDRC", c1144z);
                }
                if (i7 == 4280916) {
                    return j(p6, "TPE1", c1144z);
                }
                if (i7 == 7630703) {
                    return j(p6, "TSSE", c1144z);
                }
                if (i7 == 6384738) {
                    return j(p6, "TALB", c1144z);
                }
                if (i7 == 7108978) {
                    return j(p6, "USLT", c1144z);
                }
                if (i7 == 6776174) {
                    return j(p6, "TCON", c1144z);
                }
                if (i7 == 6779504) {
                    return j(p6, "TIT1", c1144z);
                }
            } else {
                if (p6 == 1735291493) {
                    return i(c1144z);
                }
                if (p6 == 1684632427) {
                    return d(p6, "TPOS", c1144z);
                }
                if (p6 == 1953655662) {
                    return d(p6, "TRCK", c1144z);
                }
                if (p6 == 1953329263) {
                    return f(p6, "TBPM", c1144z, true, false);
                }
                if (p6 == 1668311404) {
                    return f(p6, "TCMP", c1144z, true, true);
                }
                if (p6 == 1668249202) {
                    return b(c1144z);
                }
                if (p6 == 1631670868) {
                    return j(p6, "TPE2", c1144z);
                }
                if (p6 == 1936682605) {
                    return j(p6, "TSOT", c1144z);
                }
                if (p6 == 1936679276) {
                    return j(p6, "TSOA", c1144z);
                }
                if (p6 == 1936679282) {
                    return j(p6, "TSOP", c1144z);
                }
                if (p6 == 1936679265) {
                    return j(p6, "TSO2", c1144z);
                }
                if (p6 == 1936679791) {
                    return j(p6, "TSOC", c1144z);
                }
                if (p6 == 1920233063) {
                    return f(p6, "ITUNESADVISORY", c1144z, false, false);
                }
                if (p6 == 1885823344) {
                    return f(p6, "ITUNESGAPLESS", c1144z, false, true);
                }
                if (p6 == 1936683886) {
                    return j(p6, "TVSHOWSORT", c1144z);
                }
                if (p6 == 1953919848) {
                    return j(p6, "TVSHOW", c1144z);
                }
                if (p6 == 757935405) {
                    return g(c1144z, f6);
                }
            }
            AbstractC1133o.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(p6));
            c1144z.T(f6);
            return null;
        } finally {
            c1144z.T(f6);
        }
    }

    public static S1.n d(int i6, String str, C1144z c1144z) {
        int p6 = c1144z.p();
        if (c1144z.p() == 1684108385 && p6 >= 22) {
            c1144z.U(10);
            int M5 = c1144z.M();
            if (M5 > 0) {
                String str2 = "" + M5;
                int M6 = c1144z.M();
                if (M6 > 0) {
                    str2 = str2 + "/" + M6;
                }
                return new S1.n(str, null, z6.w.y(str2));
            }
        }
        AbstractC1133o.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i6));
        return null;
    }

    public static int e(C1144z c1144z) {
        int p6 = c1144z.p();
        if (c1144z.p() == 1684108385) {
            c1144z.U(8);
            int i6 = p6 - 16;
            if (i6 == 1) {
                return c1144z.G();
            }
            if (i6 == 2) {
                return c1144z.M();
            }
            if (i6 == 3) {
                return c1144z.J();
            }
            if (i6 == 4 && (c1144z.j() & 128) == 0) {
                return c1144z.K();
            }
        }
        AbstractC1133o.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static S1.i f(int i6, String str, C1144z c1144z, boolean z6, boolean z7) {
        int e6 = e(c1144z);
        if (z7) {
            e6 = Math.min(1, e6);
        }
        if (e6 >= 0) {
            return z6 ? new S1.n(str, null, z6.w.y(Integer.toString(e6))) : new S1.e("und", str, Integer.toString(e6));
        }
        AbstractC1133o.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i6));
        return null;
    }

    public static S1.i g(C1144z c1144z, int i6) {
        String str = null;
        String str2 = null;
        int i7 = -1;
        int i8 = -1;
        while (c1144z.f() < i6) {
            int f6 = c1144z.f();
            int p6 = c1144z.p();
            int p7 = c1144z.p();
            c1144z.U(4);
            if (p7 == 1835360622) {
                str = c1144z.B(p6 - 12);
            } else if (p7 == 1851878757) {
                str2 = c1144z.B(p6 - 12);
            } else {
                if (p7 == 1684108385) {
                    i7 = f6;
                    i8 = p6;
                }
                c1144z.U(p6 - 12);
            }
        }
        if (str == null || str2 == null || i7 == -1) {
            return null;
        }
        c1144z.T(i7);
        c1144z.U(16);
        return new S1.k(str, str2, c1144z.B(i8 - 16));
    }

    public static C1179a h(C1144z c1144z, int i6, String str) {
        while (true) {
            int f6 = c1144z.f();
            if (f6 >= i6) {
                return null;
            }
            int p6 = c1144z.p();
            if (c1144z.p() == 1684108385) {
                int p7 = c1144z.p();
                int p8 = c1144z.p();
                int i7 = p6 - 16;
                byte[] bArr = new byte[i7];
                c1144z.l(bArr, 0, i7);
                return new C1179a(str, bArr, p8, p7);
            }
            c1144z.T(f6 + p6);
        }
    }

    public static S1.n i(C1144z c1144z) {
        String a6 = S1.j.a(e(c1144z) - 1);
        if (a6 != null) {
            return new S1.n("TCON", null, z6.w.y(a6));
        }
        AbstractC1133o.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static S1.n j(int i6, String str, C1144z c1144z) {
        int p6 = c1144z.p();
        if (c1144z.p() == 1684108385) {
            c1144z.U(8);
            return new S1.n(str, null, z6.w.y(c1144z.B(p6 - 16)));
        }
        AbstractC1133o.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i6));
        return null;
    }

    public static void k(int i6, B b6, q.b bVar) {
        if (i6 == 1 && b6.a()) {
            bVar.V(b6.f877a).W(b6.f878b);
        }
    }

    public static void l(int i6, x xVar, q.b bVar, x... xVarArr) {
        x xVar2 = new x(new x.b[0]);
        if (xVar != null) {
            for (int i7 = 0; i7 < xVar.f(); i7++) {
                x.b e6 = xVar.e(i7);
                if (e6 instanceof C1179a) {
                    C1179a c1179a = (C1179a) e6;
                    if (!c1179a.f13370a.equals("com.android.capture.fps")) {
                        xVar2 = xVar2.a(c1179a);
                    } else if (i6 == 2) {
                        xVar2 = xVar2.a(c1179a);
                    }
                }
            }
        }
        for (x xVar3 : xVarArr) {
            xVar2 = xVar2.c(xVar3);
        }
        if (xVar2.f() > 0) {
            bVar.h0(xVar2);
        }
    }
}
