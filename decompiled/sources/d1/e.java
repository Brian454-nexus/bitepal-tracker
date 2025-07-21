package d1;

import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13423a;

    /* renamed from: b, reason: collision with root package name */
    public int f13424b;

    /* renamed from: c, reason: collision with root package name */
    public int f13425c;

    /* renamed from: d, reason: collision with root package name */
    public int f13426d;

    public e(byte[] bArr, int i6, int i7) {
        i(bArr, i6, i7);
    }

    public final void a() {
        int i6;
        int i7 = this.f13425c;
        AbstractC1119a.g(i7 >= 0 && (i7 < (i6 = this.f13424b) || (i7 == i6 && this.f13426d == 0)));
    }

    public boolean b(int i6) {
        int i7 = this.f13425c;
        int i8 = i6 / 8;
        int i9 = i7 + i8;
        int i10 = (this.f13426d + i6) - (i8 * 8);
        if (i10 > 7) {
            i9++;
            i10 -= 8;
        }
        while (true) {
            i7++;
            if (i7 > i9 || i9 >= this.f13424b) {
                break;
            }
            if (j(i7)) {
                i9++;
                i7 += 2;
            }
        }
        int i11 = this.f13424b;
        if (i9 >= i11) {
            return i9 == i11 && i10 == 0;
        }
        return true;
    }

    public boolean c() {
        int i6 = this.f13425c;
        int i7 = this.f13426d;
        int i8 = 0;
        while (this.f13425c < this.f13424b && !d()) {
            i8++;
        }
        boolean z6 = this.f13425c == this.f13424b;
        this.f13425c = i6;
        this.f13426d = i7;
        return !z6 && b((i8 * 2) + 1);
    }

    public boolean d() {
        boolean z6 = (this.f13423a[this.f13425c] & (128 >> this.f13426d)) != 0;
        k();
        return z6;
    }

    public int e(int i6) {
        int i7;
        this.f13426d += i6;
        int i8 = 0;
        while (true) {
            i7 = this.f13426d;
            if (i7 <= 8) {
                break;
            }
            int i9 = i7 - 8;
            this.f13426d = i9;
            byte[] bArr = this.f13423a;
            int i10 = this.f13425c;
            i8 |= (bArr[i10] & 255) << i9;
            if (!j(i10 + 1)) {
                r3 = 1;
            }
            this.f13425c = i10 + r3;
        }
        byte[] bArr2 = this.f13423a;
        int i11 = this.f13425c;
        int i12 = ((-1) >>> (32 - i6)) & (i8 | ((bArr2[i11] & 255) >> (8 - i7)));
        if (i7 == 8) {
            this.f13426d = 0;
            this.f13425c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
        return i12;
    }

    public final int f() {
        int i6 = 0;
        while (!d()) {
            i6++;
        }
        return ((1 << i6) - 1) + (i6 > 0 ? e(i6) : 0);
    }

    public int g() {
        int f6 = f();
        return (f6 % 2 == 0 ? -1 : 1) * ((f6 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i6, int i7) {
        this.f13423a = bArr;
        this.f13425c = i6;
        this.f13424b = i7;
        this.f13426d = 0;
        a();
    }

    public final boolean j(int i6) {
        if (2 > i6 || i6 >= this.f13424b) {
            return false;
        }
        byte[] bArr = this.f13423a;
        return bArr[i6] == 3 && bArr[i6 + (-2)] == 0 && bArr[i6 - 1] == 0;
    }

    public void k() {
        int i6 = this.f13426d + 1;
        this.f13426d = i6;
        if (i6 == 8) {
            this.f13426d = 0;
            int i7 = this.f13425c;
            this.f13425c = i7 + (j(i7 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i6) {
        int i7 = this.f13425c;
        int i8 = i6 / 8;
        int i9 = i7 + i8;
        this.f13425c = i9;
        int i10 = this.f13426d + (i6 - (i8 * 8));
        this.f13426d = i10;
        if (i10 > 7) {
            this.f13425c = i9 + 1;
            this.f13426d = i10 - 8;
        }
        while (true) {
            i7++;
            if (i7 > this.f13425c) {
                a();
                return;
            } else if (j(i7)) {
                this.f13425c++;
                i7 += 2;
            }
        }
    }
}
