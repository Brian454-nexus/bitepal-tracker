package x1;

import Z0.q;
import c1.AbstractC1117K;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.InterfaceC1248f;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k extends AbstractC2261e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f20475j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f20476k;

    public k(InterfaceC1248f interfaceC1248f, C1252j c1252j, int i6, q qVar, int i7, Object obj, byte[] bArr) {
        super(interfaceC1248f, c1252j, i6, qVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f20475j = bArr == null ? AbstractC1117K.f10565f : bArr;
    }

    @Override // A1.l.e
    public final void a() {
        try {
            this.f20438i.r(this.f20431b);
            int i6 = 0;
            int i7 = 0;
            while (i6 != -1 && !this.f20476k) {
                i(i7);
                i6 = this.f20438i.read(this.f20475j, i7, 16384);
                if (i6 != -1) {
                    i7 += i6;
                }
            }
            if (!this.f20476k) {
                g(this.f20475j, i7);
            }
            AbstractC1251i.a(this.f20438i);
        } catch (Throwable th) {
            AbstractC1251i.a(this.f20438i);
            throw th;
        }
    }

    @Override // A1.l.e
    public final void c() {
        this.f20476k = true;
    }

    public abstract void g(byte[] bArr, int i6);

    public byte[] h() {
        return this.f20475j;
    }

    public final void i(int i6) {
        byte[] bArr = this.f20475j;
        if (bArr.length < i6 + 16384) {
            this.f20475j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
