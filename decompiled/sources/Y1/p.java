package Y1;

import E1.I;
import E1.InterfaceC0315q;
import T1.b;
import Z0.z;
import c1.C1144z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final y6.s f6470d = y6.s.d(':');

    /* renamed from: e, reason: collision with root package name */
    public static final y6.s f6471e = y6.s.d('*');

    /* renamed from: a, reason: collision with root package name */
    public final List f6472a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f6473b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f6474c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6475a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6476b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6477c;

        public a(int i6, long j6, int i7) {
            this.f6475a = i6;
            this.f6476b = j6;
            this.f6477c = i7;
        }
    }

    public static int b(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c6 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw z.a("Invalid SEF name", null);
        }
    }

    public static T1.b f(C1144z c1144z, int i6) {
        ArrayList arrayList = new ArrayList();
        List f6 = f6471e.f(c1144z.D(i6));
        for (int i7 = 0; i7 < f6.size(); i7++) {
            List f7 = f6470d.f((CharSequence) f6.get(i7));
            if (f7.size() != 3) {
                throw z.a(null, null);
            }
            try {
                arrayList.add(new b.C0082b(Long.parseLong((String) f7.get(0)), Long.parseLong((String) f7.get(1)), 1 << (Integer.parseInt((String) f7.get(2)) - 1)));
            } catch (NumberFormatException e6) {
                throw z.a(null, e6);
            }
        }
        return new T1.b(arrayList);
    }

    public final void a(InterfaceC0315q interfaceC0315q, I i6) {
        C1144z c1144z = new C1144z(8);
        interfaceC0315q.readFully(c1144z.e(), 0, 8);
        this.f6474c = c1144z.t() + 8;
        if (c1144z.p() != 1397048916) {
            i6.f910a = 0L;
        } else {
            i6.f910a = interfaceC0315q.getPosition() - (this.f6474c - 12);
            this.f6473b = 2;
        }
    }

    public int c(InterfaceC0315q interfaceC0315q, I i6, List list) {
        int i7 = this.f6473b;
        long j6 = 0;
        if (i7 == 0) {
            long a6 = interfaceC0315q.a();
            if (a6 != -1 && a6 >= 8) {
                j6 = a6 - 8;
            }
            i6.f910a = j6;
            this.f6473b = 1;
        } else if (i7 == 1) {
            a(interfaceC0315q, i6);
        } else if (i7 == 2) {
            d(interfaceC0315q, i6);
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC0315q, list);
            i6.f910a = 0L;
        }
        return 1;
    }

    public final void d(InterfaceC0315q interfaceC0315q, I i6) {
        long a6 = interfaceC0315q.a();
        int i7 = this.f6474c - 20;
        C1144z c1144z = new C1144z(i7);
        interfaceC0315q.readFully(c1144z.e(), 0, i7);
        for (int i8 = 0; i8 < i7 / 12; i8++) {
            c1144z.U(2);
            short v6 = c1144z.v();
            if (v6 == 2192 || v6 == 2816 || v6 == 2817 || v6 == 2819 || v6 == 2820) {
                this.f6472a.add(new a(v6, (a6 - this.f6474c) - c1144z.t(), c1144z.t()));
            } else {
                c1144z.U(8);
            }
        }
        if (this.f6472a.isEmpty()) {
            i6.f910a = 0L;
        } else {
            this.f6473b = 3;
            i6.f910a = ((a) this.f6472a.get(0)).f6476b;
        }
    }

    public final void e(InterfaceC0315q interfaceC0315q, List list) {
        long position = interfaceC0315q.getPosition();
        int a6 = (int) ((interfaceC0315q.a() - interfaceC0315q.getPosition()) - this.f6474c);
        C1144z c1144z = new C1144z(a6);
        interfaceC0315q.readFully(c1144z.e(), 0, a6);
        for (int i6 = 0; i6 < this.f6472a.size(); i6++) {
            a aVar = (a) this.f6472a.get(i6);
            c1144z.T((int) (aVar.f6476b - position));
            c1144z.U(4);
            int t6 = c1144z.t();
            int b6 = b(c1144z.D(t6));
            int i7 = aVar.f6477c - (t6 + 8);
            if (b6 == 2192) {
                list.add(f(c1144z, i7));
            } else if (b6 != 2816 && b6 != 2817 && b6 != 2819 && b6 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f6472a.clear();
        this.f6473b = 0;
    }
}
