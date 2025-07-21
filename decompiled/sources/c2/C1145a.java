package c2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b1.C1076a;
import b2.k;
import b2.p;
import b2.q;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1145a extends e {

    /* renamed from: i, reason: collision with root package name */
    public final int f10659i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10660j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10661k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10662l;

    /* renamed from: o, reason: collision with root package name */
    public List f10665o;

    /* renamed from: p, reason: collision with root package name */
    public List f10666p;

    /* renamed from: q, reason: collision with root package name */
    public int f10667q;

    /* renamed from: r, reason: collision with root package name */
    public int f10668r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10669s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10670t;

    /* renamed from: u, reason: collision with root package name */
    public byte f10671u;

    /* renamed from: v, reason: collision with root package name */
    public byte f10672v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10674x;

    /* renamed from: y, reason: collision with root package name */
    public long f10675y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f10657z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f10650A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f10651B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f10652C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f10653D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f10654E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f10655F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f10656G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final C1144z f10658h = new C1144z();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f10663m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public C0164a f10664n = new C0164a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f10673w = 0;

    /* renamed from: c2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0164a {

        /* renamed from: a, reason: collision with root package name */
        public final List f10676a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f10677b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f10678c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        public int f10679d;

        /* renamed from: e, reason: collision with root package name */
        public int f10680e;

        /* renamed from: f, reason: collision with root package name */
        public int f10681f;

        /* renamed from: g, reason: collision with root package name */
        public int f10682g;

        /* renamed from: h, reason: collision with root package name */
        public int f10683h;

        /* renamed from: c2.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0165a {

            /* renamed from: a, reason: collision with root package name */
            public final int f10684a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f10685b;

            /* renamed from: c, reason: collision with root package name */
            public int f10686c;

            public C0165a(int i6, boolean z6, int i7) {
                this.f10684a = i6;
                this.f10685b = z6;
                this.f10686c = i7;
            }
        }

        public C0164a(int i6, int i7) {
            j(i6);
            this.f10683h = i7;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i6, int i7, int i8) {
            if (i8 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i6, i7, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i6, int i7) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i6, int i7) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, 33);
        }

        public void e(char c6) {
            if (this.f10678c.length() < 32) {
                this.f10678c.append(c6);
            }
        }

        public void f() {
            int length = this.f10678c.length();
            if (length > 0) {
                this.f10678c.delete(length - 1, length);
                for (int size = this.f10676a.size() - 1; size >= 0; size--) {
                    C0165a c0165a = (C0165a) this.f10676a.get(size);
                    int i6 = c0165a.f10686c;
                    if (i6 != length) {
                        return;
                    }
                    c0165a.f10686c = i6 - 1;
                }
            }
        }

        public C1076a g(int i6) {
            float f6;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < this.f10677b.size(); i7++) {
                spannableStringBuilder.append((CharSequence) this.f10677b.get(i7));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i8 = this.f10680e + this.f10681f;
            int length = (32 - i8) - spannableStringBuilder.length();
            int i9 = i8 - length;
            if (i6 == Integer.MIN_VALUE) {
                i6 = (this.f10682g != 2 || (Math.abs(i9) >= 3 && length >= 0)) ? (this.f10682g != 2 || i9 <= 0) ? 0 : 2 : 1;
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    i8 = 32 - length;
                }
                f6 = ((i8 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f6 = 0.5f;
            }
            int i10 = this.f10679d;
            if (i10 > 7) {
                i10 -= 17;
            } else if (this.f10682g == 1) {
                i10 -= this.f10683h - 1;
            }
            return new C1076a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i10, 1).k(f6).l(i6).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10678c);
            int length = spannableStringBuilder.length();
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            int i11 = 0;
            boolean z6 = false;
            while (i10 < this.f10676a.size()) {
                C0165a c0165a = (C0165a) this.f10676a.get(i10);
                boolean z7 = c0165a.f10685b;
                int i12 = c0165a.f10684a;
                if (i12 != 8) {
                    boolean z8 = i12 == 7;
                    if (i12 != 7) {
                        i9 = C1145a.f10651B[i12];
                    }
                    z6 = z8;
                }
                int i13 = c0165a.f10686c;
                i10++;
                if (i13 != (i10 < this.f10676a.size() ? ((C0165a) this.f10676a.get(i10)).f10686c : length)) {
                    if (i6 != -1 && !z7) {
                        q(spannableStringBuilder, i6, i13);
                        i6 = -1;
                    } else if (i6 == -1 && z7) {
                        i6 = i13;
                    }
                    if (i7 != -1 && !z6) {
                        o(spannableStringBuilder, i7, i13);
                        i7 = -1;
                    } else if (i7 == -1 && z6) {
                        i7 = i13;
                    }
                    if (i9 != i8) {
                        n(spannableStringBuilder, i11, i13, i8);
                        i8 = i9;
                        i11 = i13;
                    }
                }
            }
            if (i6 != -1 && i6 != length) {
                q(spannableStringBuilder, i6, length);
            }
            if (i7 != -1 && i7 != length) {
                o(spannableStringBuilder, i7, length);
            }
            if (i11 != length) {
                n(spannableStringBuilder, i11, length, i8);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f10676a.isEmpty() && this.f10677b.isEmpty() && this.f10678c.length() == 0;
        }

        public void j(int i6) {
            this.f10682g = i6;
            this.f10676a.clear();
            this.f10677b.clear();
            this.f10678c.setLength(0);
            this.f10679d = 15;
            this.f10680e = 0;
            this.f10681f = 0;
        }

        public void k() {
            this.f10677b.add(h());
            this.f10678c.setLength(0);
            this.f10676a.clear();
            int min = Math.min(this.f10683h, this.f10679d);
            while (this.f10677b.size() >= min) {
                this.f10677b.remove(0);
            }
        }

        public void l(int i6) {
            this.f10682g = i6;
        }

        public void m(int i6) {
            this.f10683h = i6;
        }

        public void p(int i6, boolean z6) {
            this.f10676a.add(new C0165a(i6, z6, this.f10678c.length()));
        }
    }

    public C1145a(String str, int i6, long j6) {
        if (j6 != -9223372036854775807L) {
            AbstractC1119a.a(j6 >= 16000);
            this.f10662l = j6 * 1000;
        } else {
            this.f10662l = -9223372036854775807L;
        }
        this.f10659i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i6 == 1) {
            this.f10661k = 0;
            this.f10660j = 0;
        } else if (i6 == 2) {
            this.f10661k = 1;
            this.f10660j = 0;
        } else if (i6 == 3) {
            this.f10661k = 0;
            this.f10660j = 1;
        } else if (i6 != 4) {
            AbstractC1133o.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f10661k = 0;
            this.f10660j = 0;
        } else {
            this.f10661k = 1;
            this.f10660j = 1;
        }
        O(0);
        N();
        this.f10674x = true;
        this.f10675y = -9223372036854775807L;
    }

    public static boolean B(byte b6) {
        return (b6 & 224) == 0;
    }

    public static boolean C(byte b6, byte b7) {
        return (b6 & 246) == 18 && (b7 & 224) == 32;
    }

    public static boolean D(byte b6, byte b7) {
        return (b6 & 247) == 17 && (b7 & 240) == 32;
    }

    public static boolean E(byte b6, byte b7) {
        return (b6 & 246) == 20 && (b7 & 240) == 32;
    }

    public static boolean F(byte b6, byte b7) {
        return (b6 & 240) == 16 && (b7 & 192) == 64;
    }

    public static boolean G(byte b6) {
        return (b6 & 240) == 16;
    }

    public static boolean I(byte b6) {
        return (b6 & 246) == 20;
    }

    public static boolean J(byte b6, byte b7) {
        return (b6 & 247) == 17 && (b7 & 240) == 48;
    }

    public static boolean K(byte b6, byte b7) {
        return (b6 & 247) == 23 && b7 >= 33 && b7 <= 35;
    }

    public static boolean L(byte b6) {
        return 1 <= b6 && b6 <= 15;
    }

    public static char r(byte b6) {
        return (char) f10652C[(b6 & ByteCompanionObject.MAX_VALUE) - 32];
    }

    public static int s(byte b6) {
        return (b6 >> 3) & 1;
    }

    public static char u(byte b6) {
        return (char) f10654E[b6 & 31];
    }

    public static char v(byte b6) {
        return (char) f10655F[b6 & 31];
    }

    public static char w(byte b6, byte b7) {
        return (b6 & 1) == 0 ? u(b7) : v(b7);
    }

    public static char x(byte b6) {
        return (char) f10653D[b6 & 15];
    }

    public final void A(byte b6, byte b7) {
        int i6 = f10657z[b6 & 7];
        if ((b7 & 32) != 0) {
            i6++;
        }
        if (i6 != this.f10664n.f10679d) {
            if (this.f10667q != 1 && !this.f10664n.i()) {
                C0164a c0164a = new C0164a(this.f10667q, this.f10668r);
                this.f10664n = c0164a;
                this.f10663m.add(c0164a);
            }
            this.f10664n.f10679d = i6;
        }
        boolean z6 = (b7 & 16) == 16;
        boolean z7 = (b7 & 1) == 1;
        int i7 = (b7 >> 1) & 7;
        this.f10664n.p(z6 ? 8 : i7, z7);
        if (z6) {
            this.f10664n.f10680e = f10650A[i7];
        }
    }

    public final boolean H(boolean z6, byte b6, byte b7) {
        if (!z6 || !G(b6)) {
            this.f10670t = false;
        } else {
            if (this.f10670t && this.f10671u == b6 && this.f10672v == b7) {
                this.f10670t = false;
                return true;
            }
            this.f10670t = true;
            this.f10671u = b6;
            this.f10672v = b7;
        }
        return false;
    }

    public final void M(byte b6, byte b7) {
        if (L(b6)) {
            this.f10674x = false;
            return;
        }
        if (I(b6)) {
            if (b7 != 32 && b7 != 47) {
                switch (b7) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b7) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f10674x = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f10674x = true;
        }
    }

    public final void N() {
        this.f10664n.j(this.f10667q);
        this.f10663m.clear();
        this.f10663m.add(this.f10664n);
    }

    public final void O(int i6) {
        int i7 = this.f10667q;
        if (i7 == i6) {
            return;
        }
        this.f10667q = i6;
        if (i6 == 3) {
            for (int i8 = 0; i8 < this.f10663m.size(); i8++) {
                ((C0164a) this.f10663m.get(i8)).l(i6);
            }
            return;
        }
        N();
        if (i7 == 3 || i6 == 1 || i6 == 0) {
            this.f10665o = Collections.EMPTY_LIST;
        }
    }

    public final void P(int i6) {
        this.f10668r = i6;
        this.f10664n.m(i6);
    }

    public final boolean Q() {
        return (this.f10662l == -9223372036854775807L || this.f10675y == -9223372036854775807L || l() - this.f10675y < this.f10662l) ? false : true;
    }

    public final boolean R(byte b6) {
        if (B(b6)) {
            this.f10673w = s(b6);
        }
        return this.f10673w == this.f10661k;
    }

    @Override // c2.e, b2.l
    public /* bridge */ /* synthetic */ void c(long j6) {
        super.c(j6);
    }

    @Override // c2.e, f1.d
    public void flush() {
        super.flush();
        this.f10665o = null;
        this.f10666p = null;
        O(0);
        P(4);
        N();
        this.f10669s = false;
        this.f10670t = false;
        this.f10671u = (byte) 0;
        this.f10672v = (byte) 0;
        this.f10673w = 0;
        this.f10674x = true;
        this.f10675y = -9223372036854775807L;
    }

    @Override // c2.e
    public k g() {
        List list = this.f10665o;
        this.f10666p = list;
        return new f((List) AbstractC1119a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // c2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(b2.p r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C1145a.h(b2.p):void");
    }

    @Override // c2.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ p d() {
        return super.d();
    }

    @Override // c2.e, f1.d
    /* renamed from: j */
    public q a() {
        q k6;
        q a6 = super.a();
        if (a6 != null) {
            return a6;
        }
        if (!Q() || (k6 = k()) == null) {
            return null;
        }
        this.f10665o = Collections.EMPTY_LIST;
        this.f10675y = -9223372036854775807L;
        k6.o(l(), g(), LongCompanionObject.MAX_VALUE);
        return k6;
    }

    @Override // c2.e
    public boolean m() {
        return this.f10665o != this.f10666p;
    }

    @Override // c2.e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void f(p pVar) {
        super.f(pVar);
    }

    @Override // c2.e, f1.d
    public void release() {
    }

    public final List t() {
        int size = this.f10663m.size();
        ArrayList arrayList = new ArrayList(size);
        int i6 = 2;
        for (int i7 = 0; i7 < size; i7++) {
            C1076a g6 = ((C0164a) this.f10663m.get(i7)).g(IntCompanionObject.MIN_VALUE);
            arrayList.add(g6);
            if (g6 != null) {
                i6 = Math.min(i6, g6.f10418i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            C1076a c1076a = (C1076a) arrayList.get(i8);
            if (c1076a != null) {
                if (c1076a.f10418i != i6) {
                    c1076a = (C1076a) AbstractC1119a.e(((C0164a) this.f10663m.get(i8)).g(i6));
                }
                arrayList2.add(c1076a);
            }
        }
        return arrayList2;
    }

    public final void y(byte b6) {
        this.f10664n.e(' ');
        this.f10664n.p((b6 >> 1) & 7, (b6 & 1) == 1);
    }

    public final void z(byte b6) {
        if (b6 == 32) {
            O(2);
            return;
        }
        if (b6 == 41) {
            O(3);
            return;
        }
        switch (b6) {
            case 37:
                O(1);
                P(2);
                return;
            case 38:
                O(1);
                P(3);
                return;
            case 39:
                O(1);
                P(4);
                return;
            default:
                int i6 = this.f10667q;
                if (i6 == 0) {
                    return;
                }
                if (b6 == 33) {
                    this.f10664n.f();
                    return;
                }
                switch (b6) {
                    case 44:
                        this.f10665o = Collections.EMPTY_LIST;
                        if (i6 == 1 || i6 == 3) {
                            N();
                            return;
                        }
                        return;
                    case 45:
                        if (i6 != 1 || this.f10664n.i()) {
                            return;
                        }
                        this.f10664n.k();
                        return;
                    case 46:
                        N();
                        return;
                    case 47:
                        this.f10665o = t();
                        N();
                        return;
                    default:
                        return;
                }
        }
    }
}
