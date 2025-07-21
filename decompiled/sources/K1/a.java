package K1;

import E1.AbstractC0299a;
import E1.O;
import K1.e;
import Z0.q;
import c1.C1144z;
import java.util.Collections;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2961e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f2962b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2963c;

    /* renamed from: d, reason: collision with root package name */
    public int f2964d;

    public a(O o6) {
        super(o6);
    }

    @Override // K1.e
    public boolean b(C1144z c1144z) {
        if (this.f2962b) {
            c1144z.U(1);
        } else {
            int G6 = c1144z.G();
            int i6 = (G6 >> 4) & 15;
            this.f2964d = i6;
            if (i6 == 2) {
                this.f2985a.e(new q.b().o0("audio/mpeg").N(1).p0(f2961e[(G6 >> 2) & 3]).K());
                this.f2963c = true;
            } else if (i6 == 7 || i6 == 8) {
                this.f2985a.e(new q.b().o0(i6 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").N(1).p0(8000).K());
                this.f2963c = true;
            } else if (i6 != 10) {
                throw new e.a("Audio format not supported: " + this.f2964d);
            }
            this.f2962b = true;
        }
        return true;
    }

    @Override // K1.e
    public boolean c(C1144z c1144z, long j6) {
        if (this.f2964d == 2) {
            int a6 = c1144z.a();
            this.f2985a.a(c1144z, a6);
            this.f2985a.f(j6, 1, a6, 0, null);
            return true;
        }
        int G6 = c1144z.G();
        if (G6 != 0 || this.f2963c) {
            if (this.f2964d == 10 && G6 != 1) {
                return false;
            }
            int a7 = c1144z.a();
            this.f2985a.a(c1144z, a7);
            this.f2985a.f(j6, 1, a7, 0, null);
            return true;
        }
        int a8 = c1144z.a();
        byte[] bArr = new byte[a8];
        c1144z.l(bArr, 0, a8);
        AbstractC0299a.b f6 = AbstractC0299a.f(bArr);
        this.f2985a.e(new q.b().o0("audio/mp4a-latm").O(f6.f963c).N(f6.f962b).p0(f6.f961a).b0(Collections.singletonList(bArr)).K());
        this.f2963c = true;
        return false;
    }
}
