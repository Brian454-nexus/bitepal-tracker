package E1;

import c1.AbstractC1122d;
import c1.C1144z;
import d1.d;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final List f879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f882d;

    /* renamed from: e, reason: collision with root package name */
    public final int f883e;

    /* renamed from: f, reason: collision with root package name */
    public final int f884f;

    /* renamed from: g, reason: collision with root package name */
    public final int f885g;

    /* renamed from: h, reason: collision with root package name */
    public final int f886h;

    /* renamed from: i, reason: collision with root package name */
    public final int f887i;

    /* renamed from: j, reason: collision with root package name */
    public final float f888j;

    /* renamed from: k, reason: collision with root package name */
    public final int f889k;

    /* renamed from: l, reason: collision with root package name */
    public final String f890l;

    public C(List list, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f6, int i14, String str) {
        this.f879a = list;
        this.f880b = i6;
        this.f881c = i7;
        this.f882d = i8;
        this.f883e = i9;
        this.f884f = i10;
        this.f885g = i11;
        this.f886h = i12;
        this.f887i = i13;
        this.f888j = f6;
        this.f889k = i14;
        this.f890l = str;
    }

    public static C a(C1144z c1144z) {
        boolean z6;
        int i6;
        try {
            c1144z.U(21);
            int G6 = c1144z.G() & 3;
            int G7 = c1144z.G();
            int f6 = c1144z.f();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                z6 = true;
                if (i8 >= G7) {
                    break;
                }
                c1144z.U(1);
                int M5 = c1144z.M();
                for (int i10 = 0; i10 < M5; i10++) {
                    int M6 = c1144z.M();
                    i9 += M6 + 4;
                    c1144z.U(M6);
                }
                i8++;
            }
            c1144z.T(f6);
            byte[] bArr = new byte[i9];
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f7 = 1.0f;
            String str = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < G7) {
                int G8 = c1144z.G() & 63;
                int M7 = c1144z.M();
                int i21 = i7;
                while (i21 < M7) {
                    int M8 = c1144z.M();
                    boolean z7 = z6;
                    byte[] bArr2 = d1.d.f13379a;
                    int i22 = G6;
                    System.arraycopy(bArr2, i7, bArr, i20, bArr2.length);
                    int length = i20 + bArr2.length;
                    System.arraycopy(c1144z.e(), c1144z.f(), bArr, length, M8);
                    if (G8 == 33 && i21 == 0) {
                        d.a h6 = d1.d.h(bArr, length, length + M8);
                        i11 = h6.f13393k;
                        i12 = h6.f13394l;
                        i13 = h6.f13388f + 8;
                        i14 = h6.f13389g + 8;
                        int i23 = h6.f13397o;
                        int i24 = h6.f13398p;
                        i6 = G7;
                        int i25 = h6.f13399q;
                        float f8 = h6.f13395m;
                        int i26 = h6.f13396n;
                        str = AbstractC1122d.c(h6.f13383a, h6.f13384b, h6.f13385c, h6.f13386d, h6.f13390h, h6.f13391i);
                        f7 = f8;
                        i18 = i26;
                        i16 = i24;
                        i17 = i25;
                        i15 = i23;
                    } else {
                        i6 = G7;
                    }
                    i20 = length + M8;
                    c1144z.U(M8);
                    i21++;
                    z6 = z7;
                    G6 = i22;
                    G7 = i6;
                    i7 = 0;
                }
                i19++;
                i7 = 0;
            }
            return new C(i9 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), G6 + 1, i11, i12, i13, i14, i15, i16, i17, f7, i18, str);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw Z0.z.a("Error parsing HEVC config", e6);
        }
    }
}
