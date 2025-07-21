package c2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b1.C1076a;
import b2.k;
import b2.p;
import b2.q;
import c1.AbstractC1119a;
import c1.AbstractC1122d;
import c1.AbstractC1133o;
import c1.C1143y;
import c1.C1144z;
import c2.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    public final C1144z f10687h = new C1144z();

    /* renamed from: i, reason: collision with root package name */
    public final C1143y f10688i = new C1143y();

    /* renamed from: j, reason: collision with root package name */
    public int f10689j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10690k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10691l;

    /* renamed from: m, reason: collision with root package name */
    public final b[] f10692m;

    /* renamed from: n, reason: collision with root package name */
    public b f10693n;

    /* renamed from: o, reason: collision with root package name */
    public List f10694o;

    /* renamed from: p, reason: collision with root package name */
    public List f10695p;

    /* renamed from: q, reason: collision with root package name */
    public C0166c f10696q;

    /* renamed from: r, reason: collision with root package name */
    public int f10697r;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator f10698c = new Comparator() { // from class: c2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((c.a) obj2).f10700b, ((c.a) obj).f10700b);
                return compare;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final C1076a f10699a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10700b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f6, int i6, int i7, float f7, int i8, float f8, boolean z6, int i9, int i10) {
            C1076a.b n6 = new C1076a.b().o(charSequence).p(alignment).h(f6, i6).i(i7).k(f7).l(i8).n(f8);
            if (z6) {
                n6.s(i9);
            }
            this.f10699a = n6.a();
            this.f10700b = i10;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final int[] f10701A;

        /* renamed from: B, reason: collision with root package name */
        public static final boolean[] f10702B;

        /* renamed from: C, reason: collision with root package name */
        public static final int[] f10703C;

        /* renamed from: D, reason: collision with root package name */
        public static final int[] f10704D;

        /* renamed from: E, reason: collision with root package name */
        public static final int[] f10705E;

        /* renamed from: F, reason: collision with root package name */
        public static final int[] f10706F;

        /* renamed from: v, reason: collision with root package name */
        public static final int f10707v = h(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f10708w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f10709x;

        /* renamed from: y, reason: collision with root package name */
        public static final int[] f10710y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f10711z;

        /* renamed from: a, reason: collision with root package name */
        public final List f10712a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f10713b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f10714c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10715d;

        /* renamed from: e, reason: collision with root package name */
        public int f10716e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f10717f;

        /* renamed from: g, reason: collision with root package name */
        public int f10718g;

        /* renamed from: h, reason: collision with root package name */
        public int f10719h;

        /* renamed from: i, reason: collision with root package name */
        public int f10720i;

        /* renamed from: j, reason: collision with root package name */
        public int f10721j;

        /* renamed from: k, reason: collision with root package name */
        public int f10722k;

        /* renamed from: l, reason: collision with root package name */
        public int f10723l;

        /* renamed from: m, reason: collision with root package name */
        public int f10724m;

        /* renamed from: n, reason: collision with root package name */
        public int f10725n;

        /* renamed from: o, reason: collision with root package name */
        public int f10726o;

        /* renamed from: p, reason: collision with root package name */
        public int f10727p;

        /* renamed from: q, reason: collision with root package name */
        public int f10728q;

        /* renamed from: r, reason: collision with root package name */
        public int f10729r;

        /* renamed from: s, reason: collision with root package name */
        public int f10730s;

        /* renamed from: t, reason: collision with root package name */
        public int f10731t;

        /* renamed from: u, reason: collision with root package name */
        public int f10732u;

        static {
            int h6 = h(0, 0, 0, 0);
            f10708w = h6;
            int h7 = h(0, 0, 0, 3);
            f10709x = h7;
            f10710y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f10711z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f10701A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f10702B = new boolean[]{false, false, false, true, true, true, false};
            f10703C = new int[]{h6, h7, h6, h6, h7, h6, h6};
            f10704D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f10705E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f10706F = new int[]{h6, h6, h6, h6, h6, h7, h7};
        }

        public b() {
            l();
        }

        public static int g(int i6, int i7, int i8) {
            return h(i6, i7, i8, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                c1.AbstractC1119a.c(r4, r0, r1)
                c1.AbstractC1119a.c(r5, r0, r1)
                c1.AbstractC1119a.c(r6, r0, r1)
                c1.AbstractC1119a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.c.b.h(int, int, int, int):int");
        }

        public void a(char c6) {
            if (c6 != '\n') {
                this.f10713b.append(c6);
                return;
            }
            this.f10712a.add(d());
            this.f10713b.clear();
            if (this.f10726o != -1) {
                this.f10726o = 0;
            }
            if (this.f10727p != -1) {
                this.f10727p = 0;
            }
            if (this.f10728q != -1) {
                this.f10728q = 0;
            }
            if (this.f10730s != -1) {
                this.f10730s = 0;
            }
            while (true) {
                if (this.f10712a.size() < this.f10721j && this.f10712a.size() < 15) {
                    this.f10732u = this.f10712a.size();
                    return;
                }
                this.f10712a.remove(0);
            }
        }

        public void b() {
            int length = this.f10713b.length();
            if (length > 0) {
                this.f10713b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c2.c.a c() {
            /*
                Method dump skipped, instructions count: 193
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.c.b.c():c2.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10713b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f10726o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f10726o, length, 33);
                }
                if (this.f10727p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f10727p, length, 33);
                }
                if (this.f10728q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10729r), this.f10728q, length, 33);
                }
                if (this.f10730s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f10731t), this.f10730s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f10712a.clear();
            this.f10713b.clear();
            this.f10726o = -1;
            this.f10727p = -1;
            this.f10728q = -1;
            this.f10730s = -1;
            this.f10732u = 0;
        }

        public void f(boolean z6, int i6, boolean z7, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f10714c = true;
            this.f10715d = z6;
            this.f10716e = i6;
            this.f10717f = z7;
            this.f10718g = i7;
            this.f10719h = i8;
            this.f10720i = i10;
            int i13 = i9 + 1;
            if (this.f10721j != i13) {
                this.f10721j = i13;
                while (true) {
                    if (this.f10712a.size() < this.f10721j && this.f10712a.size() < 15) {
                        break;
                    } else {
                        this.f10712a.remove(0);
                    }
                }
            }
            if (i11 != 0 && this.f10723l != i11) {
                this.f10723l = i11;
                int i14 = i11 - 1;
                q(f10703C[i14], f10709x, f10702B[i14], 0, f10711z[i14], f10701A[i14], f10710y[i14]);
            }
            if (i12 == 0 || this.f10724m == i12) {
                return;
            }
            this.f10724m = i12;
            int i15 = i12 - 1;
            m(0, 1, 1, false, false, f10705E[i15], f10704D[i15]);
            n(f10707v, f10706F[i15], f10708w);
        }

        public boolean i() {
            return this.f10714c;
        }

        public boolean j() {
            if (i()) {
                return this.f10712a.isEmpty() && this.f10713b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f10715d;
        }

        public void l() {
            e();
            this.f10714c = false;
            this.f10715d = false;
            this.f10716e = 4;
            this.f10717f = false;
            this.f10718g = 0;
            this.f10719h = 0;
            this.f10720i = 0;
            this.f10721j = 15;
            this.f10722k = 0;
            this.f10723l = 0;
            this.f10724m = 0;
            int i6 = f10708w;
            this.f10725n = i6;
            this.f10729r = f10707v;
            this.f10731t = i6;
        }

        public void m(int i6, int i7, int i8, boolean z6, boolean z7, int i9, int i10) {
            if (this.f10726o != -1) {
                if (!z6) {
                    this.f10713b.setSpan(new StyleSpan(2), this.f10726o, this.f10713b.length(), 33);
                    this.f10726o = -1;
                }
            } else if (z6) {
                this.f10726o = this.f10713b.length();
            }
            if (this.f10727p == -1) {
                if (z7) {
                    this.f10727p = this.f10713b.length();
                }
            } else {
                if (z7) {
                    return;
                }
                this.f10713b.setSpan(new UnderlineSpan(), this.f10727p, this.f10713b.length(), 33);
                this.f10727p = -1;
            }
        }

        public void n(int i6, int i7, int i8) {
            if (this.f10728q != -1 && this.f10729r != i6) {
                this.f10713b.setSpan(new ForegroundColorSpan(this.f10729r), this.f10728q, this.f10713b.length(), 33);
            }
            if (i6 != f10707v) {
                this.f10728q = this.f10713b.length();
                this.f10729r = i6;
            }
            if (this.f10730s != -1 && this.f10731t != i7) {
                this.f10713b.setSpan(new BackgroundColorSpan(this.f10731t), this.f10730s, this.f10713b.length(), 33);
            }
            if (i7 != f10708w) {
                this.f10730s = this.f10713b.length();
                this.f10731t = i7;
            }
        }

        public void o(int i6, int i7) {
            if (this.f10732u != i6) {
                a('\n');
            }
            this.f10732u = i6;
        }

        public void p(boolean z6) {
            this.f10715d = z6;
        }

        public void q(int i6, int i7, boolean z6, int i8, int i9, int i10, int i11) {
            this.f10725n = i6;
            this.f10722k = i11;
        }
    }

    /* renamed from: c2.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0166c {

        /* renamed from: a, reason: collision with root package name */
        public final int f10733a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10734b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f10735c;

        /* renamed from: d, reason: collision with root package name */
        public int f10736d = 0;

        public C0166c(int i6, int i7) {
            this.f10733a = i6;
            this.f10734b = i7;
            this.f10735c = new byte[(i7 * 2) - 1];
        }
    }

    public c(int i6, List list) {
        this.f10691l = i6 == -1 ? 1 : i6;
        this.f10690k = list != null && AbstractC1122d.i(list);
        this.f10692m = new b[8];
        for (int i7 = 0; i7 < 8; i7++) {
            this.f10692m[i7] = new b();
        }
        this.f10693n = this.f10692m[0];
    }

    private void G() {
        for (int i6 = 0; i6 < 8; i6++) {
            this.f10692m[i6].l();
        }
    }

    private List r() {
        a c6;
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < 8; i6++) {
            if (!this.f10692m[i6].j() && this.f10692m[i6].k() && (c6 = this.f10692m[i6].c()) != null) {
                arrayList.add(c6);
            }
        }
        Collections.sort(arrayList, a.f10698c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(((a) arrayList.get(i7)).f10699a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A(int i6) {
        if (i6 == 160) {
            this.f10693n.a((char) 13252);
            return;
        }
        AbstractC1133o.h("Cea708Decoder", "Invalid G3 character: " + i6);
        this.f10693n.a('_');
    }

    public final void B() {
        this.f10693n.m(this.f10688i.h(4), this.f10688i.h(2), this.f10688i.h(2), this.f10688i.g(), this.f10688i.g(), this.f10688i.h(3), this.f10688i.h(3));
    }

    public final void C() {
        int h6 = b.h(this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2));
        int h7 = b.h(this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2));
        this.f10688i.r(2);
        this.f10693n.n(h6, h7, b.g(this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2)));
    }

    public final void D() {
        this.f10688i.r(4);
        int h6 = this.f10688i.h(4);
        this.f10688i.r(2);
        this.f10693n.o(h6, this.f10688i.h(6));
    }

    public final void E() {
        int h6 = b.h(this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2));
        int h7 = this.f10688i.h(2);
        int g6 = b.g(this.f10688i.h(2), this.f10688i.h(2), this.f10688i.h(2));
        if (this.f10688i.g()) {
            h7 |= 4;
        }
        boolean g7 = this.f10688i.g();
        int h8 = this.f10688i.h(2);
        int h9 = this.f10688i.h(2);
        int h10 = this.f10688i.h(2);
        this.f10688i.r(8);
        this.f10693n.q(h6, g6, g7, h7, h8, h9, h10);
    }

    public final void F() {
        C0166c c0166c = this.f10696q;
        if (c0166c.f10736d != (c0166c.f10734b * 2) - 1) {
            AbstractC1133o.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f10696q.f10734b * 2) - 1) + ", but current index is " + this.f10696q.f10736d + " (sequence number " + this.f10696q.f10733a + ");");
        }
        C1143y c1143y = this.f10688i;
        C0166c c0166c2 = this.f10696q;
        c1143y.o(c0166c2.f10735c, c0166c2.f10736d);
        boolean z6 = false;
        while (true) {
            if (this.f10688i.b() <= 0) {
                break;
            }
            int h6 = this.f10688i.h(3);
            int h7 = this.f10688i.h(5);
            if (h6 == 7) {
                this.f10688i.r(2);
                h6 = this.f10688i.h(6);
                if (h6 < 7) {
                    AbstractC1133o.h("Cea708Decoder", "Invalid extended service number: " + h6);
                }
            }
            if (h7 == 0) {
                if (h6 != 0) {
                    AbstractC1133o.h("Cea708Decoder", "serviceNumber is non-zero (" + h6 + ") when blockSize is 0");
                }
            } else if (h6 != this.f10691l) {
                this.f10688i.s(h7);
            } else {
                int e6 = this.f10688i.e() + (h7 * 8);
                while (this.f10688i.e() < e6) {
                    int h8 = this.f10688i.h(8);
                    if (h8 == 16) {
                        int h9 = this.f10688i.h(8);
                        if (h9 <= 31) {
                            u(h9);
                        } else {
                            if (h9 <= 127) {
                                z(h9);
                            } else if (h9 <= 159) {
                                v(h9);
                            } else if (h9 <= 255) {
                                A(h9);
                            } else {
                                AbstractC1133o.h("Cea708Decoder", "Invalid extended command: " + h9);
                            }
                            z6 = true;
                        }
                    } else if (h8 <= 31) {
                        s(h8);
                    } else {
                        if (h8 <= 127) {
                            x(h8);
                        } else if (h8 <= 159) {
                            t(h8);
                        } else if (h8 <= 255) {
                            y(h8);
                        } else {
                            AbstractC1133o.h("Cea708Decoder", "Invalid base command: " + h8);
                        }
                        z6 = true;
                    }
                }
            }
        }
        if (z6) {
            this.f10694o = r();
        }
    }

    @Override // c2.e, b2.l
    public /* bridge */ /* synthetic */ void c(long j6) {
        super.c(j6);
    }

    @Override // c2.e, f1.d
    public void flush() {
        super.flush();
        this.f10694o = null;
        this.f10695p = null;
        this.f10697r = 0;
        this.f10693n = this.f10692m[0];
        G();
        this.f10696q = null;
    }

    @Override // c2.e
    public k g() {
        List list = this.f10694o;
        this.f10695p = list;
        return new f((List) AbstractC1119a.e(list));
    }

    @Override // c2.e
    public void h(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(pVar.f14005d);
        this.f10687h.R(byteBuffer.array(), byteBuffer.limit());
        while (this.f10687h.a() >= 3) {
            int G6 = this.f10687h.G();
            int i6 = G6 & 3;
            boolean z6 = (G6 & 4) == 4;
            byte G7 = (byte) this.f10687h.G();
            byte G8 = (byte) this.f10687h.G();
            if (i6 == 2 || i6 == 3) {
                if (z6) {
                    if (i6 == 3) {
                        q();
                        int i7 = (G7 & 192) >> 6;
                        int i8 = this.f10689j;
                        if (i8 != -1 && i7 != (i8 + 1) % 4) {
                            G();
                            AbstractC1133o.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f10689j + " current=" + i7);
                        }
                        this.f10689j = i7;
                        int i9 = G7 & 63;
                        if (i9 == 0) {
                            i9 = 64;
                        }
                        C0166c c0166c = new C0166c(i7, i9);
                        this.f10696q = c0166c;
                        byte[] bArr = c0166c.f10735c;
                        int i10 = c0166c.f10736d;
                        c0166c.f10736d = i10 + 1;
                        bArr[i10] = G8;
                    } else {
                        AbstractC1119a.a(i6 == 2);
                        C0166c c0166c2 = this.f10696q;
                        if (c0166c2 == null) {
                            AbstractC1133o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0166c2.f10735c;
                            int i11 = c0166c2.f10736d;
                            int i12 = i11 + 1;
                            c0166c2.f10736d = i12;
                            bArr2[i11] = G7;
                            c0166c2.f10736d = i11 + 2;
                            bArr2[i12] = G8;
                        }
                    }
                    C0166c c0166c3 = this.f10696q;
                    if (c0166c3.f10736d == (c0166c3.f10734b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // c2.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ p d() {
        return super.d();
    }

    @Override // c2.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ q a() {
        return super.a();
    }

    @Override // c2.e
    public boolean m() {
        return this.f10694o != this.f10695p;
    }

    @Override // c2.e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void f(p pVar) {
        super.f(pVar);
    }

    public final void q() {
        if (this.f10696q == null) {
            return;
        }
        F();
        this.f10696q = null;
    }

    @Override // c2.e, f1.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i6) {
        if (i6 != 0) {
            if (i6 == 3) {
                this.f10694o = r();
                return;
            }
            if (i6 == 8) {
                this.f10693n.b();
                return;
            }
            switch (i6) {
                case 12:
                    G();
                    return;
                case 13:
                    this.f10693n.a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i6 >= 17 && i6 <= 23) {
                        AbstractC1133o.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i6);
                        this.f10688i.r(8);
                        return;
                    }
                    if (i6 < 24 || i6 > 31) {
                        AbstractC1133o.h("Cea708Decoder", "Invalid C0 command: " + i6);
                        return;
                    }
                    AbstractC1133o.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i6);
                    this.f10688i.r(16);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    public final void t(int i6) {
        int i7 = 1;
        switch (i6) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i8 = i6 - 128;
                if (this.f10697r != i8) {
                    this.f10697r = i8;
                    this.f10693n = this.f10692m[i8];
                    return;
                }
                return;
            case 136:
                while (i7 <= 8) {
                    if (this.f10688i.g()) {
                        this.f10692m[8 - i7].e();
                    }
                    i7++;
                }
                return;
            case 137:
                for (int i9 = 1; i9 <= 8; i9++) {
                    if (this.f10688i.g()) {
                        this.f10692m[8 - i9].p(true);
                    }
                }
                return;
            case 138:
                while (i7 <= 8) {
                    if (this.f10688i.g()) {
                        this.f10692m[8 - i7].p(false);
                    }
                    i7++;
                }
                return;
            case 139:
                for (int i10 = 1; i10 <= 8; i10++) {
                    if (this.f10688i.g()) {
                        this.f10692m[8 - i10].p(!r0.k());
                    }
                }
                return;
            case 140:
                while (i7 <= 8) {
                    if (this.f10688i.g()) {
                        this.f10692m[8 - i7].l();
                    }
                    i7++;
                }
                return;
            case 141:
                this.f10688i.r(8);
                return;
            case 142:
                return;
            case 143:
                G();
                return;
            case 144:
                if (this.f10693n.i()) {
                    B();
                    return;
                } else {
                    this.f10688i.r(16);
                    return;
                }
            case 145:
                if (this.f10693n.i()) {
                    C();
                    return;
                } else {
                    this.f10688i.r(24);
                    return;
                }
            case 146:
                if (this.f10693n.i()) {
                    D();
                    return;
                } else {
                    this.f10688i.r(16);
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                AbstractC1133o.h("Cea708Decoder", "Invalid C1 command: " + i6);
                return;
            case 151:
                if (this.f10693n.i()) {
                    E();
                    return;
                } else {
                    this.f10688i.r(32);
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i11 = i6 - 152;
                w(i11);
                if (this.f10697r != i11) {
                    this.f10697r = i11;
                    this.f10693n = this.f10692m[i11];
                    return;
                }
                return;
        }
    }

    public final void u(int i6) {
        if (i6 <= 7) {
            return;
        }
        if (i6 <= 15) {
            this.f10688i.r(8);
        } else if (i6 <= 23) {
            this.f10688i.r(16);
        } else if (i6 <= 31) {
            this.f10688i.r(24);
        }
    }

    public final void v(int i6) {
        if (i6 <= 135) {
            this.f10688i.r(32);
            return;
        }
        if (i6 <= 143) {
            this.f10688i.r(40);
        } else if (i6 <= 159) {
            this.f10688i.r(2);
            this.f10688i.r(this.f10688i.h(6) * 8);
        }
    }

    public final void w(int i6) {
        b bVar = this.f10692m[i6];
        this.f10688i.r(2);
        boolean g6 = this.f10688i.g();
        this.f10688i.r(2);
        int h6 = this.f10688i.h(3);
        boolean g7 = this.f10688i.g();
        int h7 = this.f10688i.h(7);
        int h8 = this.f10688i.h(8);
        int h9 = this.f10688i.h(4);
        int h10 = this.f10688i.h(4);
        this.f10688i.r(2);
        this.f10688i.r(6);
        this.f10688i.r(2);
        bVar.f(g6, h6, g7, h7, h8, h10, h9, this.f10688i.h(3), this.f10688i.h(3));
    }

    public final void x(int i6) {
        if (i6 == 127) {
            this.f10693n.a((char) 9835);
        } else {
            this.f10693n.a((char) (i6 & 255));
        }
    }

    public final void y(int i6) {
        this.f10693n.a((char) (i6 & 255));
    }

    public final void z(int i6) {
        if (i6 == 32) {
            this.f10693n.a(' ');
            return;
        }
        if (i6 == 33) {
            this.f10693n.a((char) 160);
            return;
        }
        if (i6 == 37) {
            this.f10693n.a((char) 8230);
            return;
        }
        if (i6 == 42) {
            this.f10693n.a((char) 352);
            return;
        }
        if (i6 == 44) {
            this.f10693n.a((char) 338);
            return;
        }
        if (i6 == 63) {
            this.f10693n.a((char) 376);
            return;
        }
        if (i6 == 57) {
            this.f10693n.a((char) 8482);
            return;
        }
        if (i6 == 58) {
            this.f10693n.a((char) 353);
            return;
        }
        if (i6 == 60) {
            this.f10693n.a((char) 339);
            return;
        }
        if (i6 == 61) {
            this.f10693n.a((char) 8480);
            return;
        }
        switch (i6) {
            case 48:
                this.f10693n.a((char) 9608);
                return;
            case 49:
                this.f10693n.a((char) 8216);
                return;
            case 50:
                this.f10693n.a((char) 8217);
                return;
            case 51:
                this.f10693n.a((char) 8220);
                return;
            case 52:
                this.f10693n.a((char) 8221);
                return;
            case 53:
                this.f10693n.a((char) 8226);
                return;
            default:
                switch (i6) {
                    case 118:
                        this.f10693n.a((char) 8539);
                        return;
                    case 119:
                        this.f10693n.a((char) 8540);
                        return;
                    case 120:
                        this.f10693n.a((char) 8541);
                        return;
                    case 121:
                        this.f10693n.a((char) 8542);
                        return;
                    case 122:
                        this.f10693n.a((char) 9474);
                        return;
                    case 123:
                        this.f10693n.a((char) 9488);
                        return;
                    case 124:
                        this.f10693n.a((char) 9492);
                        return;
                    case 125:
                        this.f10693n.a((char) 9472);
                        return;
                    case 126:
                        this.f10693n.a((char) 9496);
                        return;
                    case 127:
                        this.f10693n.a((char) 9484);
                        return;
                    default:
                        AbstractC1133o.h("Cea708Decoder", "Invalid G2 character: " + i6);
                        return;
                }
        }
    }
}
