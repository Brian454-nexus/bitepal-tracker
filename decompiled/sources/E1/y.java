package E1;

import Z0.q;
import c1.AbstractC1117K;
import c1.C1143y;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1088d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1089e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1090f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1091g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1092h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1093i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1094j;

    /* renamed from: k, reason: collision with root package name */
    public final a f1095k;

    /* renamed from: l, reason: collision with root package name */
    public final Z0.x f1096l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f1097a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f1098b;

        public a(long[] jArr, long[] jArr2) {
            this.f1097a = jArr;
            this.f1098b = jArr2;
        }
    }

    public y(byte[] bArr, int i6) {
        C1143y c1143y = new C1143y(bArr);
        c1143y.p(i6 * 8);
        this.f1085a = c1143y.h(16);
        this.f1086b = c1143y.h(16);
        this.f1087c = c1143y.h(24);
        this.f1088d = c1143y.h(24);
        int h6 = c1143y.h(20);
        this.f1089e = h6;
        this.f1090f = j(h6);
        this.f1091g = c1143y.h(3) + 1;
        int h7 = c1143y.h(5) + 1;
        this.f1092h = h7;
        this.f1093i = e(h7);
        this.f1094j = c1143y.j(36);
        this.f1095k = null;
        this.f1096l = null;
    }

    public static int e(int i6) {
        if (i6 == 8) {
            return 1;
        }
        if (i6 == 12) {
            return 2;
        }
        if (i6 == 16) {
            return 4;
        }
        if (i6 != 20) {
            return i6 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int j(int i6) {
        switch (i6) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List list) {
        return new y(this.f1085a, this.f1086b, this.f1087c, this.f1088d, this.f1089e, this.f1091g, this.f1092h, this.f1094j, this.f1095k, h(new Z0.x(list)));
    }

    public y b(a aVar) {
        return new y(this.f1085a, this.f1086b, this.f1087c, this.f1088d, this.f1089e, this.f1091g, this.f1092h, this.f1094j, aVar, this.f1096l);
    }

    public y c(List list) {
        return new y(this.f1085a, this.f1086b, this.f1087c, this.f1088d, this.f1089e, this.f1091g, this.f1092h, this.f1094j, this.f1095k, h(S.d(list)));
    }

    public long d() {
        long j6;
        long j7;
        int i6 = this.f1088d;
        if (i6 > 0) {
            j6 = (i6 + this.f1087c) / 2;
            j7 = 1;
        } else {
            int i7 = this.f1085a;
            j6 = ((((i7 != this.f1086b || i7 <= 0) ? 4096L : i7) * this.f1091g) * this.f1092h) / 8;
            j7 = 64;
        }
        return j6 + j7;
    }

    public long f() {
        long j6 = this.f1094j;
        if (j6 == 0) {
            return -9223372036854775807L;
        }
        return (j6 * 1000000) / this.f1089e;
    }

    public Z0.q g(byte[] bArr, Z0.x xVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i6 = this.f1088d;
        if (i6 <= 0) {
            i6 = -1;
        }
        return new q.b().o0("audio/flac").f0(i6).N(this.f1091g).p0(this.f1089e).i0(AbstractC1117K.g0(this.f1092h)).b0(Collections.singletonList(bArr)).h0(h(xVar)).K();
    }

    public Z0.x h(Z0.x xVar) {
        Z0.x xVar2 = this.f1096l;
        return xVar2 == null ? xVar : xVar2.c(xVar);
    }

    public long i(long j6) {
        return AbstractC1117K.q((j6 * this.f1089e) / 1000000, 0L, this.f1094j - 1);
    }

    public y(int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j6, a aVar, Z0.x xVar) {
        this.f1085a = i6;
        this.f1086b = i7;
        this.f1087c = i8;
        this.f1088d = i9;
        this.f1089e = i10;
        this.f1090f = j(i10);
        this.f1091g = i11;
        this.f1092h = i12;
        this.f1093i = e(i12);
        this.f1094j = j6;
        this.f1095k = aVar;
        this.f1096l = xVar;
    }
}
