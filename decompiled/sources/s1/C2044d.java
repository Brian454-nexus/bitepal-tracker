package s1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2044d {

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f18779l = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte f18780a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18781b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18782c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f18783d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18784e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f18785f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18786g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18787h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18788i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f18789j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f18790k;

    /* renamed from: s1.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18791a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18792b;

        /* renamed from: c, reason: collision with root package name */
        public byte f18793c;

        /* renamed from: d, reason: collision with root package name */
        public int f18794d;

        /* renamed from: e, reason: collision with root package name */
        public long f18795e;

        /* renamed from: f, reason: collision with root package name */
        public int f18796f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f18797g = C2044d.f18779l;

        /* renamed from: h, reason: collision with root package name */
        public byte[] f18798h = C2044d.f18779l;

        public C2044d i() {
            return new C2044d(this);
        }

        public b j(byte[] bArr) {
            AbstractC1119a.e(bArr);
            this.f18797g = bArr;
            return this;
        }

        public b k(boolean z6) {
            this.f18792b = z6;
            return this;
        }

        public b l(boolean z6) {
            this.f18791a = z6;
            return this;
        }

        public b m(byte[] bArr) {
            AbstractC1119a.e(bArr);
            this.f18798h = bArr;
            return this;
        }

        public b n(byte b6) {
            this.f18793c = b6;
            return this;
        }

        public b o(int i6) {
            AbstractC1119a.a(i6 >= 0 && i6 <= 65535);
            this.f18794d = i6 & 65535;
            return this;
        }

        public b p(int i6) {
            this.f18796f = i6;
            return this;
        }

        public b q(long j6) {
            this.f18795e = j6;
            return this;
        }
    }

    public static int b(int i6) {
        return B6.d.c(i6 + 1, 65536);
    }

    public static int c(int i6) {
        return B6.d.c(i6 - 1, 65536);
    }

    public static C2044d d(C1144z c1144z) {
        byte[] bArr;
        if (c1144z.a() < 12) {
            return null;
        }
        int G6 = c1144z.G();
        byte b6 = (byte) (G6 >> 6);
        boolean z6 = ((G6 >> 5) & 1) == 1;
        byte b7 = (byte) (G6 & 15);
        if (b6 != 2) {
            return null;
        }
        int G7 = c1144z.G();
        boolean z7 = ((G7 >> 7) & 1) == 1;
        byte b8 = (byte) (G7 & 127);
        int M5 = c1144z.M();
        long I6 = c1144z.I();
        int p6 = c1144z.p();
        if (b7 > 0) {
            bArr = new byte[b7 * 4];
            for (int i6 = 0; i6 < b7; i6++) {
                c1144z.l(bArr, i6 * 4, 4);
            }
        } else {
            bArr = f18779l;
        }
        byte[] bArr2 = new byte[c1144z.a()];
        c1144z.l(bArr2, 0, c1144z.a());
        return new b().l(z6).k(z7).n(b8).o(M5).q(I6).p(p6).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2044d.class == obj.getClass()) {
            C2044d c2044d = (C2044d) obj;
            if (this.f18785f == c2044d.f18785f && this.f18786g == c2044d.f18786g && this.f18784e == c2044d.f18784e && this.f18787h == c2044d.f18787h && this.f18788i == c2044d.f18788i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (((((527 + this.f18785f) * 31) + this.f18786g) * 31) + (this.f18784e ? 1 : 0)) * 31;
        long j6 = this.f18787h;
        return ((i6 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f18788i;
    }

    public String toString() {
        return AbstractC1117K.H("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f18785f), Integer.valueOf(this.f18786g), Long.valueOf(this.f18787h), Integer.valueOf(this.f18788i), Boolean.valueOf(this.f18784e));
    }

    public C2044d(b bVar) {
        this.f18780a = (byte) 2;
        this.f18781b = bVar.f18791a;
        this.f18782c = false;
        this.f18784e = bVar.f18792b;
        this.f18785f = bVar.f18793c;
        this.f18786g = bVar.f18794d;
        this.f18787h = bVar.f18795e;
        this.f18788i = bVar.f18796f;
        byte[] bArr = bVar.f18797g;
        this.f18789j = bArr;
        this.f18783d = (byte) (bArr.length / 4);
        this.f18790k = bVar.f18798h;
    }
}
