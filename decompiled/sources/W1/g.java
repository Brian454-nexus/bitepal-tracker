package W1;

import E1.InterfaceC0315q;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f5528d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5529a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f5530b;

    /* renamed from: c, reason: collision with root package name */
    public int f5531c;

    public static long a(byte[] bArr, int i6, boolean z6) {
        long j6 = bArr[0] & 255;
        if (z6) {
            j6 &= ~f5528d[i6 - 1];
        }
        for (int i7 = 1; i7 < i6; i7++) {
            j6 = (j6 << 8) | (bArr[i7] & 255);
        }
        return j6;
    }

    public static int c(int i6) {
        int i7 = 0;
        while (true) {
            long[] jArr = f5528d;
            if (i7 >= jArr.length) {
                return -1;
            }
            if ((jArr[i7] & i6) != 0) {
                return i7 + 1;
            }
            i7++;
        }
    }

    public int b() {
        return this.f5531c;
    }

    public long d(InterfaceC0315q interfaceC0315q, boolean z6, boolean z7, int i6) {
        if (this.f5530b == 0) {
            if (!interfaceC0315q.c(this.f5529a, 0, 1, z6)) {
                return -1L;
            }
            int c6 = c(this.f5529a[0] & 255);
            this.f5531c = c6;
            if (c6 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5530b = 1;
        }
        int i7 = this.f5531c;
        if (i7 > i6) {
            this.f5530b = 0;
            return -2L;
        }
        if (i7 != 1) {
            interfaceC0315q.readFully(this.f5529a, 1, i7 - 1);
        }
        this.f5530b = 0;
        return a(this.f5529a, this.f5531c, z7);
    }

    public void e() {
        this.f5530b = 0;
        this.f5531c = 0;
    }
}
