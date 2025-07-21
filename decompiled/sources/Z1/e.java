package Z1;

import E1.AbstractC0316s;
import E1.InterfaceC0315q;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f7315a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f7316b = new C1144z(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f7317c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7318d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7319e;

    public final int a(int i6) {
        int i7;
        int i8 = 0;
        this.f7318d = 0;
        do {
            int i9 = this.f7318d;
            int i10 = i6 + i9;
            f fVar = this.f7315a;
            if (i10 >= fVar.f7326g) {
                break;
            }
            int[] iArr = fVar.f7329j;
            this.f7318d = i9 + 1;
            i7 = iArr[i9 + i6];
            i8 += i7;
        } while (i7 == 255);
        return i8;
    }

    public f b() {
        return this.f7315a;
    }

    public C1144z c() {
        return this.f7316b;
    }

    public boolean d(InterfaceC0315q interfaceC0315q) {
        int i6;
        AbstractC1119a.g(interfaceC0315q != null);
        if (this.f7319e) {
            this.f7319e = false;
            this.f7316b.P(0);
        }
        while (!this.f7319e) {
            if (this.f7317c < 0) {
                if (!this.f7315a.c(interfaceC0315q) || !this.f7315a.a(interfaceC0315q, true)) {
                    return false;
                }
                f fVar = this.f7315a;
                int i7 = fVar.f7327h;
                if ((fVar.f7321b & 1) == 1 && this.f7316b.g() == 0) {
                    i7 += a(0);
                    i6 = this.f7318d;
                } else {
                    i6 = 0;
                }
                if (!AbstractC0316s.e(interfaceC0315q, i7)) {
                    return false;
                }
                this.f7317c = i6;
            }
            int a6 = a(this.f7317c);
            int i8 = this.f7317c + this.f7318d;
            if (a6 > 0) {
                C1144z c1144z = this.f7316b;
                c1144z.c(c1144z.g() + a6);
                if (!AbstractC0316s.d(interfaceC0315q, this.f7316b.e(), this.f7316b.g(), a6)) {
                    return false;
                }
                C1144z c1144z2 = this.f7316b;
                c1144z2.S(c1144z2.g() + a6);
                this.f7319e = this.f7315a.f7329j[i8 + (-1)] != 255;
            }
            if (i8 == this.f7315a.f7326g) {
                i8 = -1;
            }
            this.f7317c = i8;
        }
        return true;
    }

    public void e() {
        this.f7315a.b();
        this.f7316b.P(0);
        this.f7317c = -1;
        this.f7319e = false;
    }

    public void f() {
        if (this.f7316b.e().length == 65025) {
            return;
        }
        C1144z c1144z = this.f7316b;
        c1144z.R(Arrays.copyOf(c1144z.e(), Math.max(65025, this.f7316b.g())), this.f7316b.g());
    }
}
