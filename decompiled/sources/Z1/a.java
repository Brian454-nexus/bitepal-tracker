package Z1;

import E1.AbstractC0316s;
import E1.InterfaceC0315q;
import E1.J;
import E1.K;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f7292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7293b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7294c;

    /* renamed from: d, reason: collision with root package name */
    public final i f7295d;

    /* renamed from: e, reason: collision with root package name */
    public int f7296e;

    /* renamed from: f, reason: collision with root package name */
    public long f7297f;

    /* renamed from: g, reason: collision with root package name */
    public long f7298g;

    /* renamed from: h, reason: collision with root package name */
    public long f7299h;

    /* renamed from: i, reason: collision with root package name */
    public long f7300i;

    /* renamed from: j, reason: collision with root package name */
    public long f7301j;

    /* renamed from: k, reason: collision with root package name */
    public long f7302k;

    /* renamed from: l, reason: collision with root package name */
    public long f7303l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements J {
        public b() {
        }

        @Override // E1.J
        public boolean f() {
            return true;
        }

        @Override // E1.J
        public J.a j(long j6) {
            return new J.a(new K(j6, AbstractC1117K.q((a.this.f7293b + BigInteger.valueOf(a.this.f7295d.c(j6)).multiply(BigInteger.valueOf(a.this.f7294c - a.this.f7293b)).divide(BigInteger.valueOf(a.this.f7297f)).longValue()) - 30000, a.this.f7293b, a.this.f7294c - 1)));
        }

        @Override // E1.J
        public long l() {
            return a.this.f7295d.b(a.this.f7297f);
        }
    }

    public a(i iVar, long j6, long j7, long j8, long j9, boolean z6) {
        AbstractC1119a.a(j6 >= 0 && j7 > j6);
        this.f7295d = iVar;
        this.f7293b = j6;
        this.f7294c = j7;
        if (j8 == j7 - j6 || z6) {
            this.f7297f = j9;
            this.f7296e = 4;
        } else {
            this.f7296e = 0;
        }
        this.f7292a = new f();
    }

    @Override // Z1.g
    public long b(InterfaceC0315q interfaceC0315q) {
        int i6 = this.f7296e;
        if (i6 == 0) {
            long position = interfaceC0315q.getPosition();
            this.f7298g = position;
            this.f7296e = 1;
            long j6 = this.f7294c - 65307;
            if (j6 > position) {
                return j6;
            }
        } else if (i6 != 1) {
            if (i6 == 2) {
                long i7 = i(interfaceC0315q);
                if (i7 != -1) {
                    return i7;
                }
                this.f7296e = 3;
            } else if (i6 != 3) {
                if (i6 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC0315q);
            this.f7296e = 4;
            return -(this.f7302k + 2);
        }
        this.f7297f = j(interfaceC0315q);
        this.f7296e = 4;
        return this.f7298g;
    }

    @Override // Z1.g
    public void c(long j6) {
        this.f7299h = AbstractC1117K.q(j6, 0L, this.f7297f - 1);
        this.f7296e = 2;
        this.f7300i = this.f7293b;
        this.f7301j = this.f7294c;
        this.f7302k = 0L;
        this.f7303l = this.f7297f;
    }

    @Override // Z1.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f7297f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(InterfaceC0315q interfaceC0315q) {
        if (this.f7300i == this.f7301j) {
            return -1L;
        }
        long position = interfaceC0315q.getPosition();
        if (!this.f7292a.d(interfaceC0315q, this.f7301j)) {
            long j6 = this.f7300i;
            if (j6 != position) {
                return j6;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f7292a.a(interfaceC0315q, false);
        interfaceC0315q.o();
        long j7 = this.f7299h;
        f fVar = this.f7292a;
        long j8 = fVar.f7322c;
        long j9 = j7 - j8;
        int i6 = fVar.f7327h + fVar.f7328i;
        if (0 <= j9 && j9 < 72000) {
            return -1L;
        }
        if (j9 < 0) {
            this.f7301j = position;
            this.f7303l = j8;
        } else {
            this.f7300i = interfaceC0315q.getPosition() + i6;
            this.f7302k = this.f7292a.f7322c;
        }
        long j10 = this.f7301j;
        long j11 = this.f7300i;
        if (j10 - j11 < 100000) {
            this.f7301j = j11;
            return j11;
        }
        long position2 = interfaceC0315q.getPosition() - (i6 * (j9 <= 0 ? 2L : 1L));
        long j12 = this.f7301j;
        long j13 = this.f7300i;
        return AbstractC1117K.q(position2 + ((j9 * (j12 - j13)) / (this.f7303l - this.f7302k)), j13, j12 - 1);
    }

    public long j(InterfaceC0315q interfaceC0315q) {
        this.f7292a.b();
        if (!this.f7292a.c(interfaceC0315q)) {
            throw new EOFException();
        }
        this.f7292a.a(interfaceC0315q, false);
        f fVar = this.f7292a;
        interfaceC0315q.p(fVar.f7327h + fVar.f7328i);
        long j6 = this.f7292a.f7322c;
        while (true) {
            f fVar2 = this.f7292a;
            if ((fVar2.f7321b & 4) == 4 || !fVar2.c(interfaceC0315q) || interfaceC0315q.getPosition() >= this.f7294c || !this.f7292a.a(interfaceC0315q, true)) {
                break;
            }
            f fVar3 = this.f7292a;
            if (!AbstractC0316s.e(interfaceC0315q, fVar3.f7327h + fVar3.f7328i)) {
                break;
            }
            j6 = this.f7292a.f7322c;
        }
        return j6;
    }

    public final void k(InterfaceC0315q interfaceC0315q) {
        while (true) {
            this.f7292a.c(interfaceC0315q);
            this.f7292a.a(interfaceC0315q, false);
            f fVar = this.f7292a;
            if (fVar.f7322c > this.f7299h) {
                interfaceC0315q.o();
                return;
            } else {
                interfaceC0315q.p(fVar.f7327h + fVar.f7328i);
                this.f7300i = interfaceC0315q.getPosition();
                this.f7302k = this.f7292a.f7322c;
            }
        }
    }
}
