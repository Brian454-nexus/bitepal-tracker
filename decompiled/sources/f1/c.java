package f1;

import android.media.MediaCodec;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13991a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13992b;

    /* renamed from: c, reason: collision with root package name */
    public int f13993c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f13994d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f13995e;

    /* renamed from: f, reason: collision with root package name */
    public int f13996f;

    /* renamed from: g, reason: collision with root package name */
    public int f13997g;

    /* renamed from: h, reason: collision with root package name */
    public int f13998h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f13999i;

    /* renamed from: j, reason: collision with root package name */
    public final b f14000j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f14001a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f14002b;

        public final void b(int i6, int i7) {
            this.f14002b.set(i6, i7);
            this.f14001a.setPattern(this.f14002b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f14001a = cryptoInfo;
            this.f14002b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f13999i = cryptoInfo;
        this.f14000j = AbstractC1117K.f10560a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f13999i;
    }

    public void b(int i6) {
        if (i6 == 0) {
            return;
        }
        if (this.f13994d == null) {
            int[] iArr = new int[1];
            this.f13994d = iArr;
            this.f13999i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f13994d;
        iArr2[0] = iArr2[0] + i6;
    }

    public void c(int i6, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i7, int i8, int i9) {
        this.f13996f = i6;
        this.f13994d = iArr;
        this.f13995e = iArr2;
        this.f13992b = bArr;
        this.f13991a = bArr2;
        this.f13993c = i7;
        this.f13997g = i8;
        this.f13998h = i9;
        MediaCodec.CryptoInfo cryptoInfo = this.f13999i;
        cryptoInfo.numSubSamples = i6;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i7;
        if (AbstractC1117K.f10560a >= 24) {
            ((b) AbstractC1119a.e(this.f14000j)).b(i8, i9);
        }
    }
}
