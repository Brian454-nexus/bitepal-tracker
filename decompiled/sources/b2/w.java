package b2;

import E1.O;
import Z0.InterfaceC0837i;
import Z0.y;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.io.EOFException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w implements O {

    /* renamed from: a, reason: collision with root package name */
    public final O f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f10505b;

    /* renamed from: h, reason: collision with root package name */
    public s f10511h;

    /* renamed from: i, reason: collision with root package name */
    public Z0.q f10512i;

    /* renamed from: c, reason: collision with root package name */
    public final C1080d f10506c = new C1080d();

    /* renamed from: e, reason: collision with root package name */
    public int f10508e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f10509f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f10510g = AbstractC1117K.f10565f;

    /* renamed from: d, reason: collision with root package name */
    public final C1144z f10507d = new C1144z();

    public w(O o6, s.a aVar) {
        this.f10504a = o6;
        this.f10505b = aVar;
    }

    @Override // E1.O
    public void b(C1144z c1144z, int i6, int i7) {
        if (this.f10511h == null) {
            this.f10504a.b(c1144z, i6, i7);
            return;
        }
        h(i6);
        c1144z.l(this.f10510g, this.f10509f, i6);
        this.f10509f += i6;
    }

    @Override // E1.O
    public int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7) {
        if (this.f10511h == null) {
            return this.f10504a.d(interfaceC0837i, i6, z6, i7);
        }
        h(i6);
        int read = interfaceC0837i.read(this.f10510g, this.f10509f, i6);
        if (read != -1) {
            this.f10509f += read;
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // E1.O
    public void e(Z0.q qVar) {
        AbstractC1119a.e(qVar.f6990n);
        AbstractC1119a.a(y.k(qVar.f6990n) == 3);
        if (!qVar.equals(this.f10512i)) {
            this.f10512i = qVar;
            this.f10511h = this.f10505b.b(qVar) ? this.f10505b.c(qVar) : null;
        }
        if (this.f10511h == null) {
            this.f10504a.e(qVar);
        } else {
            this.f10504a.e(qVar.a().o0("application/x-media3-cues").O(qVar.f6990n).s0(LongCompanionObject.MAX_VALUE).S(this.f10505b.d(qVar)).K());
        }
    }

    @Override // E1.O
    public void f(final long j6, final int i6, int i7, int i8, O.a aVar) {
        if (this.f10511h == null) {
            this.f10504a.f(j6, i6, i7, i8, aVar);
            return;
        }
        AbstractC1119a.b(aVar == null, "DRM on subtitles is not supported");
        int i9 = (this.f10509f - i8) - i7;
        this.f10511h.c(this.f10510g, i9, i7, s.b.b(), new InterfaceC1125g() { // from class: b2.v
            @Override // c1.InterfaceC1125g
            public final void accept(Object obj) {
                w.this.i((C1081e) obj, j6, i6);
            }
        });
        int i10 = i9 + i7;
        this.f10508e = i10;
        if (i10 == this.f10509f) {
            this.f10508e = 0;
            this.f10509f = 0;
        }
    }

    public final void h(int i6) {
        int length = this.f10510g.length;
        int i7 = this.f10509f;
        if (length - i7 >= i6) {
            return;
        }
        int i8 = i7 - this.f10508e;
        int max = Math.max(i8 * 2, i6 + i8);
        byte[] bArr = this.f10510g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f10508e, bArr2, 0, i8);
        this.f10508e = 0;
        this.f10509f = i8;
        this.f10510g = bArr2;
    }

    public final void i(C1081e c1081e, long j6, int i6) {
        AbstractC1119a.i(this.f10512i);
        byte[] a6 = this.f10506c.a(c1081e.f10464a, c1081e.f10466c);
        this.f10507d.Q(a6);
        this.f10504a.a(this.f10507d, a6.length);
        long j7 = c1081e.f10465b;
        if (j7 == -9223372036854775807L) {
            AbstractC1119a.g(this.f10512i.f6995s == LongCompanionObject.MAX_VALUE);
        } else {
            long j8 = this.f10512i.f6995s;
            j6 = j8 == LongCompanionObject.MAX_VALUE ? j6 + j7 : j7 + j8;
        }
        this.f10504a.f(j6, i6, a6.length, 0, null);
    }

    public void j() {
        s sVar = this.f10511h;
        if (sVar != null) {
            sVar.a();
        }
    }
}
