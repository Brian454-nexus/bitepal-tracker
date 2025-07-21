package k2;

import c1.AbstractC1119a;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f16789a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16790b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16791c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16792d;

    /* renamed from: e, reason: collision with root package name */
    public int f16793e;

    public w(int i6, int i7) {
        this.f16789a = i6;
        byte[] bArr = new byte[i7 + 3];
        this.f16792d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i6, int i7) {
        if (this.f16790b) {
            int i8 = i7 - i6;
            byte[] bArr2 = this.f16792d;
            int length = bArr2.length;
            int i9 = this.f16793e;
            if (length < i9 + i8) {
                this.f16792d = Arrays.copyOf(bArr2, (i9 + i8) * 2);
            }
            System.arraycopy(bArr, i6, this.f16792d, this.f16793e, i8);
            this.f16793e += i8;
        }
    }

    public boolean b(int i6) {
        if (!this.f16790b) {
            return false;
        }
        this.f16793e -= i6;
        this.f16790b = false;
        this.f16791c = true;
        return true;
    }

    public boolean c() {
        return this.f16791c;
    }

    public void d() {
        this.f16790b = false;
        this.f16791c = false;
    }

    public void e(int i6) {
        AbstractC1119a.g(!this.f16790b);
        boolean z6 = i6 == this.f16789a;
        this.f16790b = z6;
        if (z6) {
            this.f16793e = 3;
            this.f16791c = false;
        }
    }
}
