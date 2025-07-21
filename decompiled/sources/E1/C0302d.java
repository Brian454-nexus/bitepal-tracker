package E1;

import c1.AbstractC1122d;
import c1.C1144z;
import d1.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: E1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0302d {

    /* renamed from: a, reason: collision with root package name */
    public final List f983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f987e;

    /* renamed from: f, reason: collision with root package name */
    public final int f988f;

    /* renamed from: g, reason: collision with root package name */
    public final int f989g;

    /* renamed from: h, reason: collision with root package name */
    public final int f990h;

    /* renamed from: i, reason: collision with root package name */
    public final int f991i;

    /* renamed from: j, reason: collision with root package name */
    public final int f992j;

    /* renamed from: k, reason: collision with root package name */
    public final float f993k;

    /* renamed from: l, reason: collision with root package name */
    public final String f994l;

    public C0302d(List list, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f6, String str) {
        this.f983a = list;
        this.f984b = i6;
        this.f985c = i7;
        this.f986d = i8;
        this.f987e = i9;
        this.f988f = i10;
        this.f989g = i11;
        this.f990h = i12;
        this.f991i = i13;
        this.f992j = i14;
        this.f993k = f6;
        this.f994l = str;
    }

    public static byte[] a(C1144z c1144z) {
        int M5 = c1144z.M();
        int f6 = c1144z.f();
        c1144z.U(M5);
        return AbstractC1122d.d(c1144z.e(), f6, M5);
    }

    public static C0302d b(C1144z c1144z) {
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f6;
        int i12;
        int i13;
        try {
            c1144z.U(4);
            int G6 = (c1144z.G() & 3) + 1;
            if (G6 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int G7 = c1144z.G() & 31;
            for (int i14 = 0; i14 < G7; i14++) {
                arrayList.add(a(c1144z));
            }
            int G8 = c1144z.G();
            for (int i15 = 0; i15 < G8; i15++) {
                arrayList.add(a(c1144z));
            }
            if (G7 > 0) {
                d.c l6 = d1.d.l((byte[]) arrayList.get(0), G6, ((byte[]) arrayList.get(0)).length);
                int i16 = l6.f13408f;
                int i17 = l6.f13409g;
                int i18 = l6.f13411i + 8;
                int i19 = l6.f13412j + 8;
                int i20 = l6.f13419q;
                int i21 = l6.f13420r;
                int i22 = l6.f13421s;
                int i23 = l6.f13422t;
                float f7 = l6.f13410h;
                str = AbstractC1122d.a(l6.f13403a, l6.f13404b, l6.f13405c);
                i10 = i22;
                i11 = i23;
                f6 = f7;
                i9 = i19;
                i12 = i20;
                i13 = i21;
                i6 = i16;
                i7 = i17;
                i8 = i18;
            } else {
                str = null;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = 16;
                f6 = 1.0f;
                i12 = -1;
                i13 = -1;
            }
            return new C0302d(arrayList, G6, i6, i7, i8, i9, i12, i13, i10, i11, f6, str);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw Z0.z.a("Error parsing AVC config", e6);
        }
    }
}
