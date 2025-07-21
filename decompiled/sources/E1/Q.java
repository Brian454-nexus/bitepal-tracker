package E1;

import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f938a;

    /* renamed from: b, reason: collision with root package name */
    public final int f939b;

    /* renamed from: c, reason: collision with root package name */
    public int f940c;

    /* renamed from: d, reason: collision with root package name */
    public int f941d;

    public Q(byte[] bArr) {
        this.f938a = bArr;
        this.f939b = bArr.length;
    }

    public final void a() {
        int i6;
        int i7 = this.f940c;
        AbstractC1119a.g(i7 >= 0 && (i7 < (i6 = this.f939b) || (i7 == i6 && this.f941d == 0)));
    }

    public int b() {
        return (this.f940c * 8) + this.f941d;
    }

    public boolean c() {
        boolean z6 = (((this.f938a[this.f940c] & 255) >> this.f941d) & 1) == 1;
        e(1);
        return z6;
    }

    public int d(int i6) {
        int i7 = this.f940c;
        int min = Math.min(i6, 8 - this.f941d);
        int i8 = i7 + 1;
        int i9 = ((this.f938a[i7] & 255) >> this.f941d) & (255 >> (8 - min));
        while (min < i6) {
            i9 |= (this.f938a[i8] & 255) << min;
            min += 8;
            i8++;
        }
        int i10 = i9 & ((-1) >>> (32 - i6));
        e(i6);
        return i10;
    }

    public void e(int i6) {
        int i7 = i6 / 8;
        int i8 = this.f940c + i7;
        this.f940c = i8;
        int i9 = this.f941d + (i6 - (i7 * 8));
        this.f941d = i9;
        if (i9 > 7) {
            this.f940c = i8 + 1;
            this.f941d = i9 - 8;
        }
        a();
    }
}
