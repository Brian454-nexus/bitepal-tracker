package W1;

import E1.InterfaceC0315q;
import Z0.z;
import c1.AbstractC1119a;
import java.util.ArrayDeque;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5401a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f5402b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final g f5403c = new g();

    /* renamed from: d, reason: collision with root package name */
    public W1.b f5404d;

    /* renamed from: e, reason: collision with root package name */
    public int f5405e;

    /* renamed from: f, reason: collision with root package name */
    public int f5406f;

    /* renamed from: g, reason: collision with root package name */
    public long f5407g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f5408a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5409b;

        public b(int i6, long j6) {
            this.f5408a = i6;
            this.f5409b = j6;
        }
    }

    public static String g(InterfaceC0315q interfaceC0315q, int i6) {
        if (i6 == 0) {
            return "";
        }
        byte[] bArr = new byte[i6];
        interfaceC0315q.readFully(bArr, 0, i6);
        while (i6 > 0 && bArr[i6 - 1] == 0) {
            i6--;
        }
        return new String(bArr, 0, i6);
    }

    @Override // W1.c
    public void a() {
        this.f5405e = 0;
        this.f5402b.clear();
        this.f5403c.e();
    }

    @Override // W1.c
    public boolean b(InterfaceC0315q interfaceC0315q) {
        AbstractC1119a.i(this.f5404d);
        while (true) {
            b bVar = (b) this.f5402b.peek();
            if (bVar != null && interfaceC0315q.getPosition() >= bVar.f5409b) {
                this.f5404d.a(((b) this.f5402b.pop()).f5408a);
                return true;
            }
            if (this.f5405e == 0) {
                long d6 = this.f5403c.d(interfaceC0315q, true, false, 4);
                if (d6 == -2) {
                    d6 = d(interfaceC0315q);
                }
                if (d6 == -1) {
                    return false;
                }
                this.f5406f = (int) d6;
                this.f5405e = 1;
            }
            if (this.f5405e == 1) {
                this.f5407g = this.f5403c.d(interfaceC0315q, false, true, 8);
                this.f5405e = 2;
            }
            int b6 = this.f5404d.b(this.f5406f);
            if (b6 != 0) {
                if (b6 == 1) {
                    long position = interfaceC0315q.getPosition();
                    this.f5402b.push(new b(this.f5406f, this.f5407g + position));
                    this.f5404d.g(this.f5406f, position, this.f5407g);
                    this.f5405e = 0;
                    return true;
                }
                if (b6 == 2) {
                    long j6 = this.f5407g;
                    if (j6 <= 8) {
                        this.f5404d.h(this.f5406f, f(interfaceC0315q, (int) j6));
                        this.f5405e = 0;
                        return true;
                    }
                    throw z.a("Invalid integer size: " + this.f5407g, null);
                }
                if (b6 == 3) {
                    long j7 = this.f5407g;
                    if (j7 <= 2147483647L) {
                        this.f5404d.d(this.f5406f, g(interfaceC0315q, (int) j7));
                        this.f5405e = 0;
                        return true;
                    }
                    throw z.a("String element size: " + this.f5407g, null);
                }
                if (b6 == 4) {
                    this.f5404d.f(this.f5406f, (int) this.f5407g, interfaceC0315q);
                    this.f5405e = 0;
                    return true;
                }
                if (b6 != 5) {
                    throw z.a("Invalid element type " + b6, null);
                }
                long j8 = this.f5407g;
                if (j8 == 4 || j8 == 8) {
                    this.f5404d.e(this.f5406f, e(interfaceC0315q, (int) j8));
                    this.f5405e = 0;
                    return true;
                }
                throw z.a("Invalid float size: " + this.f5407g, null);
            }
            interfaceC0315q.p((int) this.f5407g);
            this.f5405e = 0;
        }
    }

    @Override // W1.c
    public void c(W1.b bVar) {
        this.f5404d = bVar;
    }

    public final long d(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.o();
        while (true) {
            interfaceC0315q.s(this.f5401a, 0, 4);
            int c6 = g.c(this.f5401a[0]);
            if (c6 != -1 && c6 <= 4) {
                int a6 = (int) g.a(this.f5401a, c6, false);
                if (this.f5404d.c(a6)) {
                    interfaceC0315q.p(c6);
                    return a6;
                }
            }
            interfaceC0315q.p(1);
        }
    }

    public final double e(InterfaceC0315q interfaceC0315q, int i6) {
        return i6 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(f(interfaceC0315q, i6));
    }

    public final long f(InterfaceC0315q interfaceC0315q, int i6) {
        interfaceC0315q.readFully(this.f5401a, 0, i6);
        long j6 = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            j6 = (j6 << 8) | (this.f5401a[i7] & 255);
        }
        return j6;
    }
}
